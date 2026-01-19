package com.vladsch.flexmark.parser.internal;

import com.vladsch.flexmark.ast.AutoLink;
import com.vladsch.flexmark.ast.Code;
import com.vladsch.flexmark.ast.HardLineBreak;
import com.vladsch.flexmark.ast.HtmlEntity;
import com.vladsch.flexmark.ast.HtmlInline;
import com.vladsch.flexmark.ast.HtmlInlineComment;
import com.vladsch.flexmark.ast.LinkRefDerived;
import com.vladsch.flexmark.ast.LinkRendered;
import com.vladsch.flexmark.ast.MailLink;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ast.Reference;
import com.vladsch.flexmark.ast.SoftLineBreak;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ast.WhiteSpace;
import com.vladsch.flexmark.ast.util.ReferenceRepository;
import com.vladsch.flexmark.ast.util.TextNodeConverter;
import com.vladsch.flexmark.ast.util.g;
import com.vladsch.flexmark.parser.InlineParser;
import com.vladsch.flexmark.parser.InlineParserExtension;
import com.vladsch.flexmark.parser.InlineParserExtensionFactory;
import com.vladsch.flexmark.parser.InlineParserOptions;
import com.vladsch.flexmark.parser.LightInlineParser;
import com.vladsch.flexmark.parser.LightInlineParserImpl;
import com.vladsch.flexmark.parser.LinkRefProcessor;
import com.vladsch.flexmark.parser.LinkRefProcessorFactory;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.block.CharacterNodeFactory;
import com.vladsch.flexmark.parser.block.ParagraphPreProcessor;
import com.vladsch.flexmark.parser.block.ParserState;
import com.vladsch.flexmark.parser.core.delimiter.AsteriskDelimiterProcessor;
import com.vladsch.flexmark.parser.core.delimiter.Bracket;
import com.vladsch.flexmark.parser.core.delimiter.Delimiter;
import com.vladsch.flexmark.parser.core.delimiter.UnderscoreDelimiterProcessor;
import com.vladsch.flexmark.parser.delimiter.DelimiterProcessor;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.DoNotDecorate;
import com.vladsch.flexmark.util.ast.DoNotTrim;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.dependency.DependencyResolver;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Escaping;
import com.vladsch.flexmark.util.sequence.SegmentedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class InlineParserImpl extends LightInlineParserImpl implements InlineParser, ParagraphPreProcessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected BitSet customCharacters;
    protected Map<Character, CharacterNodeFactory> customSpecialCharacterFactoryMap;
    protected ArrayList<Node> customSpecialCharacterNodes;
    protected final BitSet delimiterCharacters;
    protected final Map<Character, DelimiterProcessor> delimiterProcessors;
    protected List<InlineParserExtensionFactory> inlineParserExtensionFactories;
    protected Map<Character, List<InlineParserExtension>> inlineParserExtensions;
    private Bracket lastBracket;
    protected Delimiter lastDelimiter;
    protected LinkDestinationParser linkDestinationParser;
    protected List<LinkRefProcessor> linkRefProcessors;
    protected final LinkRefProcessorData linkRefProcessorsData;
    protected final BitSet originalSpecialCharacters;
    protected ReferenceRepository referenceRepository;
    protected BitSet specialCharacters;

    /* loaded from: classes.dex */
    public static class DelimiterData {
        final boolean canClose;
        final boolean canOpen;
        final int count;

        public DelimiterData(int i6, boolean z5, boolean z6) {
            this.count = i6;
            this.canOpen = z5;
            this.canClose = z6;
        }
    }

    /* loaded from: classes.dex */
    public static class ReferenceProcessorMatch {
        public final BasedSequence nodeChars;
        public final LinkRefProcessor processor;
        public final boolean wantExclamation;

        public ReferenceProcessorMatch(LinkRefProcessor linkRefProcessor, boolean z5, BasedSequence basedSequence) {
            this.processor = linkRefProcessor;
            this.nodeChars = basedSequence;
            this.wantExclamation = z5;
        }
    }

    public InlineParserImpl(DataHolder dataHolder, BitSet bitSet, BitSet bitSet2, Map<Character, DelimiterProcessor> map, LinkRefProcessorData linkRefProcessorData, List<InlineParserExtensionFactory> list) {
        super(dataHolder);
        this.linkRefProcessors = null;
        this.inlineParserExtensions = null;
        this.inlineParserExtensionFactories = null;
        this.linkDestinationParser = null;
        this.customCharacters = null;
        this.customSpecialCharacterFactoryMap = null;
        this.customSpecialCharacterNodes = null;
        this.delimiterProcessors = map;
        this.linkRefProcessorsData = linkRefProcessorData;
        this.delimiterCharacters = bitSet2;
        this.originalSpecialCharacters = bitSet;
        this.specialCharacters = bitSet;
        this.inlineParserExtensionFactories = list.isEmpty() ? null : list;
        InlineParserOptions inlineParserOptions = this.options;
        if (inlineParserOptions.useHardcodedLinkAddressParser) {
            this.linkDestinationParser = new LinkDestinationParser(inlineParserOptions.linksAllowMatchedParentheses, inlineParserOptions.spaceInLinkUrls, inlineParserOptions.parseJekyllMacrosInUrls, inlineParserOptions.intellijDummyIdentifier);
        }
    }

    private void addBracket(Bracket bracket) {
        Bracket bracket2 = this.lastBracket;
        if (bracket2 != null) {
            bracket2.setBracketAfter(true);
        }
        this.lastBracket = bracket;
    }

    private static void addDelimiterProcessorForChar(char c6, DelimiterProcessor delimiterProcessor, Map<Character, DelimiterProcessor> map) {
        DelimiterProcessor put = map.put(Character.valueOf(c6), delimiterProcessor);
        if (put != null) {
            if (put.getClass() == delimiterProcessor.getClass()) {
                System.out.println("Delimiter processor for char '" + c6 + "', added more than once " + put.getClass().getCanonicalName());
                return;
            }
            throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c6 + "', existing " + put.getClass().getCanonicalName() + ", added " + delimiterProcessor.getClass().getCanonicalName());
        }
    }

    private static void addDelimiterProcessors(List<? extends DelimiterProcessor> list, Map<Character, DelimiterProcessor> map) {
        for (DelimiterProcessor delimiterProcessor : list) {
            char openingCharacter = delimiterProcessor.getOpeningCharacter();
            addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map);
            char closingCharacter = delimiterProcessor.getClosingCharacter();
            if (openingCharacter != closingCharacter) {
                addDelimiterProcessorForChar(closingCharacter, delimiterProcessor, map);
            }
        }
    }

    public static BitSet calculateDelimiterCharacters(DataHolder dataHolder, Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        return bitSet;
    }

    public static Map<Character, DelimiterProcessor> calculateDelimiterProcessors(DataHolder dataHolder, List<DelimiterProcessor> list) {
        HashMap hashMap = new HashMap();
        if (Parser.ASTERISK_DELIMITER_PROCESSOR.get(dataHolder).booleanValue()) {
            addDelimiterProcessors(Collections.singletonList(new AsteriskDelimiterProcessor(Parser.STRONG_WRAPS_EMPHASIS.get(dataHolder).booleanValue())), hashMap);
        }
        if (Parser.UNDERSCORE_DELIMITER_PROCESSOR.get(dataHolder).booleanValue()) {
            addDelimiterProcessors(Collections.singletonList(new UnderscoreDelimiterProcessor(Parser.STRONG_WRAPS_EMPHASIS.get(dataHolder).booleanValue())), hashMap);
        }
        addDelimiterProcessors(list, hashMap);
        return hashMap;
    }

    public static Map<Character, List<InlineParserExtensionFactory>> calculateInlineParserExtensions(DataHolder dataHolder, List<InlineParserExtensionFactory> list) {
        HashMap hashMap = new HashMap();
        for (InlineParserExtensionFactory inlineParserExtensionFactory : list) {
            CharSequence characters = inlineParserExtensionFactory.getCharacters();
            for (int i6 = 0; i6 < characters.length(); i6++) {
                ((List) hashMap.computeIfAbsent(Character.valueOf(characters.charAt(i6)), new g(2))).add(inlineParserExtensionFactory);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Character ch : hashMap.keySet()) {
            hashMap2.put(ch, DependencyResolver.resolveFlatDependencies((List) hashMap.get(ch), null, null));
        }
        return hashMap2;
    }

    public static LinkRefProcessorData calculateLinkRefProcessors(final DataHolder dataHolder, List<LinkRefProcessorFactory> list) {
        int i6 = 0;
        if (list.size() <= 1) {
            if (list.size() <= 0) {
                return new LinkRefProcessorData(list, 0, new int[0]);
            }
            int bracketNestingLevel = list.get(0).getBracketNestingLevel(dataHolder);
            return new LinkRefProcessorData(list, bracketNestingLevel, new int[bracketNestingLevel + 1]);
        }
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        final int[] iArr = {0};
        Collections.sort(arrayList, new Comparator() { // from class: com.vladsch.flexmark.parser.internal.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$calculateLinkRefProcessors$3;
                lambda$calculateLinkRefProcessors$3 = InlineParserImpl.lambda$calculateLinkRefProcessors$3(DataHolder.this, iArr, (LinkRefProcessorFactory) obj, (LinkRefProcessorFactory) obj2);
                return lambda$calculateLinkRefProcessors$3;
            }
        });
        int i7 = iArr[0];
        int[] iArr2 = new int[i7 + 1];
        int size = arrayList.size();
        int i8 = -1;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            LinkRefProcessorFactory linkRefProcessorFactory = (LinkRefProcessorFactory) obj;
            if (i8 < linkRefProcessorFactory.getBracketNestingLevel(dataHolder)) {
                i8 = linkRefProcessorFactory.getBracketNestingLevel(dataHolder);
                iArr2[i8] = i6;
                if (i8 == i7) {
                    break;
                }
            }
            i6++;
        }
        return new LinkRefProcessorData(arrayList, i7, iArr2);
    }

    public static BitSet calculateSpecialCharacters(DataHolder dataHolder, BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(13);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    public static void collapseLinkRefChildren(Node node, Function<LinkRefDerived, Boolean> function, boolean z5) {
        Node firstChild = node.getFirstChild();
        boolean z6 = false;
        while (firstChild != null) {
            Node next = firstChild.getNext();
            if ((firstChild instanceof LinkRefDerived) && (function == null || function.apply((LinkRefDerived) firstChild).booleanValue())) {
                collapseLinkRefChildren(firstChild, function, false);
                firstChild.unlink();
                TextNodeConverter textNodeConverter = new TextNodeConverter(firstChild.getChars());
                textNodeConverter.addChildrenOf(firstChild);
                if (next != null) {
                    textNodeConverter.insertMergedBefore(next);
                } else {
                    textNodeConverter.appendMergedTo(node);
                }
                z6 = true;
            }
            firstChild = next;
        }
        if (z6) {
            TextNodeConverter.mergeTextNodes(node);
        }
        if (z5) {
            Node firstChild2 = node.getFirstChild();
            Node lastChild = node.getLastChild();
            if (firstChild2 == lastChild) {
                if (firstChild2 == null || (firstChild2 instanceof DoNotTrim)) {
                    return;
                }
                firstChild2.setChars(firstChild2.getChars().trim());
                return;
            }
            if (firstChild2 != null && !(firstChild2 instanceof DoNotTrim)) {
                firstChild2.setChars(firstChild2.getChars().trimStart());
            }
            if (lastChild == null || (lastChild instanceof DoNotTrim)) {
                return;
            }
            lastChild.setChars(lastChild.getChars().trimEnd());
        }
    }

    public static boolean containsLinkRefs(Node node, Boolean bool) {
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            if ((firstChild instanceof LinkRendered) && (bool == null || ((LinkRendered) firstChild).isTentative() == bool.booleanValue())) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ List lambda$calculateInlineParserExtensions$2(Character ch) {
        return new ArrayList();
    }

    public static /* synthetic */ int lambda$calculateLinkRefProcessors$3(DataHolder dataHolder, int[] iArr, LinkRefProcessorFactory linkRefProcessorFactory, LinkRefProcessorFactory linkRefProcessorFactory2) {
        int bracketNestingLevel = linkRefProcessorFactory.getBracketNestingLevel(dataHolder);
        int bracketNestingLevel2 = linkRefProcessorFactory2.getBracketNestingLevel(dataHolder);
        int i6 = iArr[0];
        if (i6 < bracketNestingLevel) {
            i6 = bracketNestingLevel;
        }
        if (i6 < bracketNestingLevel2) {
            i6 = bracketNestingLevel2;
        }
        iArr[0] = i6;
        if (bracketNestingLevel == bracketNestingLevel2) {
            if (!linkRefProcessorFactory.getWantExclamationPrefix(dataHolder)) {
                bracketNestingLevel++;
            }
            if (!linkRefProcessorFactory2.getWantExclamationPrefix(dataHolder)) {
                bracketNestingLevel2++;
            }
        }
        return Integer.compare(bracketNestingLevel, bracketNestingLevel2);
    }

    public static /* synthetic */ Boolean lambda$parseCloseBracket$0(LinkRefDerived linkRefDerived) {
        return Boolean.valueOf((linkRefDerived instanceof LinkRendered) || linkRefDerived.isTentative());
    }

    public static /* synthetic */ Boolean lambda$parseCloseBracket$1(LinkRefDerived linkRefDerived) {
        return Boolean.valueOf((linkRefDerived instanceof LinkRendered) || linkRefDerived.isTentative());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0095 A[LOOP:0: B:6:0x0018->B:17:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.vladsch.flexmark.parser.internal.InlineParserImpl.ReferenceProcessorMatch matchLinkRef(com.vladsch.flexmark.parser.core.delimiter.Bracket r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            com.vladsch.flexmark.parser.internal.LinkRefProcessorData r0 = r9.linkRefProcessorsData
            int[] r1 = r0.nestingIndex
            int r1 = r1.length
            r2 = 0
            if (r1 != 0) goto L9
            return r2
        L9:
            java.util.List<com.vladsch.flexmark.parser.LinkRefProcessorFactory> r0 = r0.processors
            int r0 = r0.size()
            com.vladsch.flexmark.parser.internal.LinkRefProcessorData r1 = r9.linkRefProcessorsData
            int[] r1 = r1.nestingIndex
            int r13 = r13 + r12
            r1 = r1[r13]
            r3 = r2
            r4 = r3
        L18:
            if (r1 >= r0) goto L9b
            java.util.List<com.vladsch.flexmark.parser.LinkRefProcessor> r5 = r9.linkRefProcessors
            java.lang.Object r5 = r5.get(r1)
            com.vladsch.flexmark.parser.LinkRefProcessor r5 = (com.vladsch.flexmark.parser.LinkRefProcessor) r5
            int r6 = r5.getBracketNestingLevel()
            if (r13 >= r6) goto L2a
            goto L9b
        L2a:
            boolean r6 = r5.getWantExclamationPrefix()
            boolean r7 = r10.isImage()
            if (r7 == 0) goto L4a
            if (r6 == 0) goto L4a
            if (r3 != 0) goto L47
            com.vladsch.flexmark.util.sequence.BasedSequence r3 = r9.input
            int r7 = r10.getStartIndex()
            int r7 = r7 + (-1)
            int r7 = r7 - r12
            int r8 = r11 + r12
            com.vladsch.flexmark.util.sequence.BasedSequence r3 = r3.subSequence(r7, r8)
        L47:
            r7 = r4
            r4 = r3
            goto L89
        L4a:
            if (r6 == 0) goto L77
            int r7 = r10.getStartIndex()
            int r8 = r12 + 1
            if (r7 < r8) goto L77
            com.vladsch.flexmark.util.sequence.BasedSequence r7 = r9.input
            int r8 = r10.getStartIndex()
            int r8 = r8 + (-1)
            int r8 = r8 - r12
            char r7 = r7.charAt(r8)
            r8 = 33
            if (r7 != r8) goto L77
            if (r3 != 0) goto L47
            com.vladsch.flexmark.util.sequence.BasedSequence r3 = r9.input
            int r7 = r10.getStartIndex()
            int r7 = r7 + (-1)
            int r7 = r7 - r12
            int r8 = r11 + r12
            com.vladsch.flexmark.util.sequence.BasedSequence r3 = r3.subSequence(r7, r8)
            goto L47
        L77:
            if (r4 != 0) goto L86
            com.vladsch.flexmark.util.sequence.BasedSequence r4 = r9.input
            int r7 = r10.getStartIndex()
            int r7 = r7 - r12
            int r8 = r11 + r12
            com.vladsch.flexmark.util.sequence.BasedSequence r4 = r4.subSequence(r7, r8)
        L86:
            r7 = r4
            r4 = r3
            r3 = r7
        L89:
            boolean r8 = r5.isMatch(r3)
            if (r8 == 0) goto L95
            com.vladsch.flexmark.parser.internal.InlineParserImpl$ReferenceProcessorMatch r10 = new com.vladsch.flexmark.parser.internal.InlineParserImpl$ReferenceProcessorMatch
            r10.<init>(r5, r6, r3)
            return r10
        L95:
            int r1 = r1 + 1
            r3 = r4
            r4 = r7
            goto L18
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.parser.internal.InlineParserImpl.matchLinkRef(com.vladsch.flexmark.parser.core.delimiter.Bracket, int, int, int):com.vladsch.flexmark.parser.internal.InlineParserImpl$ReferenceProcessorMatch");
    }

    private boolean processCustomCharacters() {
        char peek;
        CharacterNodeFactory characterNodeFactory = this.customSpecialCharacterFactoryMap.get(Character.valueOf(peek()));
        if (characterNodeFactory == null) {
            return false;
        }
        Node node = characterNodeFactory.get();
        BasedSequence basedSequence = this.input;
        int i6 = this.index;
        node.setChars(basedSequence.subSequence(i6, i6 + 1));
        if (this.currentText != null) {
            BasedSequence create = SegmentedSequence.create(node.getChars(), this.currentText);
            BasedSequence basedSequence2 = null;
            this.currentText = null;
            int length = create.length();
            while (length > 0 && characterNodeFactory.skipPrev(create.charAt(length - 1))) {
                length--;
            }
            if (length < create.length()) {
                basedSequence2 = create.subSequence(length);
                create = create.subSequence(0, length);
            }
            this.block.appendChild(new Text(create));
            if (basedSequence2 != null && characterNodeFactory.wantSkippedWhitespace()) {
                this.block.appendChild(new WhiteSpace(basedSequence2));
            }
        }
        appendNode(node);
        if (this.customSpecialCharacterNodes == null) {
            this.customSpecialCharacterNodes = new ArrayList<>();
        }
        this.customSpecialCharacterNodes.add(node);
        int i7 = this.index + 1;
        do {
            this.index++;
            peek = peek();
            if (peek == 0) {
                break;
            }
        } while (characterNodeFactory.skipNext(peek));
        if (i7 < this.index && characterNodeFactory.wantSkippedWhitespace()) {
            this.block.appendChild(new WhiteSpace(this.input.subSequence(i7, this.index)));
        }
        return true;
    }

    private void removeLastBracket() {
        this.lastBracket = this.lastBracket.getPrevious();
    }

    public Object clone() {
        return super.clone();
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public void finalizeDocument(Document document) {
        Map<Character, List<InlineParserExtension>> map = this.inlineParserExtensions;
        if (map != null) {
            Iterator<List<InlineParserExtension>> it = map.values().iterator();
            while (it.hasNext()) {
                Iterator<InlineParserExtension> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    it2.next().finalizeDocument(this);
                }
            }
        }
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public Bracket getLastBracket() {
        return this.lastBracket;
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public Delimiter getLastDelimiter() {
        return this.lastDelimiter;
    }

    public void initializeDocument(Document document) {
        this.document = document;
        this.referenceRepository = Parser.REFERENCES.get(document);
        this.linkRefProcessors = new ArrayList(this.linkRefProcessorsData.processors.size());
        Iterator<LinkRefProcessorFactory> it = this.linkRefProcessorsData.processors.iterator();
        while (it.hasNext()) {
            this.linkRefProcessors.add(it.next().apply(document));
        }
        List<InlineParserExtensionFactory> list = this.inlineParserExtensionFactories;
        if (list != null) {
            Map<Character, List<InlineParserExtensionFactory>> calculateInlineParserExtensions = calculateInlineParserExtensions(document, list);
            this.inlineParserExtensions = new HashMap(calculateInlineParserExtensions.size());
            HashMap hashMap = new HashMap();
            for (Map.Entry<Character, List<InlineParserExtensionFactory>> entry : calculateInlineParserExtensions.entrySet()) {
                ArrayList arrayList = new ArrayList(entry.getValue().size());
                for (InlineParserExtensionFactory inlineParserExtensionFactory : entry.getValue()) {
                    InlineParserExtension inlineParserExtension = (InlineParserExtension) hashMap.get(inlineParserExtensionFactory);
                    if (inlineParserExtension == null) {
                        inlineParserExtension = inlineParserExtensionFactory.apply((LightInlineParser) this);
                        hashMap.put(inlineParserExtensionFactory, inlineParserExtension);
                    }
                    arrayList.add(inlineParserExtension);
                }
                this.inlineParserExtensions.put(entry.getKey(), arrayList);
                this.specialCharacters.set(entry.getKey().charValue());
            }
        }
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public void mergeIfNeeded(Text text, Text text2) {
        if (text == null || text2 == null || text == text2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(text.getChars());
        Node next = text.getNext();
        Node next2 = text2.getNext();
        while (next != next2) {
            arrayList.add(next.getChars());
            Node next3 = next.getNext();
            next.unlink();
            next = next3;
        }
        text.setChars(SegmentedSequence.create(text.getChars(), arrayList));
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public void mergeTextNodes(Node node, Node node2) {
        Text text = null;
        Text text2 = null;
        while (node != null) {
            if (node instanceof Text) {
                text2 = (Text) node;
                if (text == null) {
                    text = text2;
                }
            } else {
                mergeIfNeeded(text, text2);
                text = null;
                text2 = null;
            }
            if (node == node2) {
                break;
            } else {
                node = node.getNext();
            }
        }
        mergeIfNeeded(text, text2);
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public void parse(BasedSequence basedSequence, Node node) {
        Map<Character, List<InlineParserExtension>> map;
        this.block = node;
        this.input = basedSequence.trim();
        this.index = 0;
        this.lastDelimiter = null;
        this.lastBracket = null;
        boolean z5 = node instanceof DoNotDecorate;
        do {
        } while (parseInline(z5));
        processDelimiters(null);
        flushTextNode();
        if (!z5 && (map = this.inlineParserExtensions) != null) {
            Iterator<List<InlineParserExtension>> it = map.values().iterator();
            while (it.hasNext()) {
                Iterator<InlineParserExtension> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    it2.next().finalizeBlock(this);
                }
            }
        }
        mergeTextNodes(node.getFirstChild(), node.getLastChild());
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public boolean parseAutolink() {
        BasedSequence match;
        BasedSequence match2 = match(this.myParsing.EMAIL_AUTOLINK);
        if (match2 != null) {
            appendNode(new MailLink(match2.subSequence(0, 1), match2.subSequence(1, match2.length() - 1), match2.subSequence(match2.length() - 1, match2.length())));
            return true;
        }
        BasedSequence match3 = match(this.myParsing.AUTOLINK);
        if (match3 != null) {
            appendNode(new AutoLink(match3.subSequence(0, 1), match3.subSequence(1, match3.length() - 1), match3.subSequence(match3.length() - 1, match3.length())));
            return true;
        }
        if (!this.options.wwwAutoLinkElement || (match = match(this.myParsing.WWW_AUTOLINK)) == null) {
            return false;
        }
        appendNode(new AutoLink(match.subSequence(0, 1), match.subSequence(1, match.length() - 1), match.subSequence(match.length() - 1, match.length())));
        return true;
    }

    public boolean parseBackslash() {
        this.index++;
        if (peek() == '\n' || peek() == '\r') {
            int i6 = peek(1) == '\n' ? 2 : 1;
            BasedSequence basedSequence = this.input;
            int i7 = this.index;
            appendNode(new HardLineBreak(basedSequence.subSequence(i7 - 1, i7 + i6)));
            this.index += i6;
        } else {
            if (this.index < this.input.length()) {
                Pattern pattern = this.myParsing.ESCAPABLE;
                BasedSequence basedSequence2 = this.input;
                int i8 = this.index;
                if (pattern.matcher(basedSequence2.subSequence(i8, i8 + 1)).matches()) {
                    BasedSequence basedSequence3 = this.input;
                    int i9 = this.index;
                    appendText(basedSequence3, i9 - 1, i9 + 1);
                    this.index++;
                }
            }
            BasedSequence basedSequence4 = this.input;
            int i10 = this.index;
            appendText(basedSequence4.subSequence(i10 - 1, i10));
        }
        return true;
    }

    public boolean parseBackticks() {
        BasedSequence match;
        BasedSequence match2 = match(this.myParsing.TICKS_HERE);
        int i6 = 0;
        if (match2 == null) {
            return false;
        }
        int i7 = this.index;
        do {
            match = match(this.myParsing.TICKS);
            if (match == null) {
                this.index = i7;
                appendText(match2);
                return true;
            }
        } while (!match.equals(match2));
        int length = match2.length();
        BasedSequence subSequence = this.input.subSequence(i7, this.index - length);
        BasedSequence subSequence2 = this.input.subSequence(i7 - length, i7);
        BasedSequence basedSequence = this.input;
        int i8 = this.index;
        Code code = new Code(subSequence2, subSequence, basedSequence.subSequence(i8 - length, i8));
        if (this.options.codeSoftLineBreaks) {
            int length2 = subSequence.length();
            while (i6 < length2) {
                int indexOfAny = subSequence.indexOfAny(CharPredicate.ANY_EOL, i6);
                int i9 = indexOfAny == -1 ? length2 : indexOfAny;
                code.appendChild(new Text(subSequence.subSequence(i6, i9)));
                if (i9 >= length2) {
                    break;
                }
                if (subSequence.charAt(i9) == '\r') {
                    i6 = i9 + 1;
                    if (i6 >= length2) {
                        break;
                    }
                    if (subSequence.charAt(i6) == '\n') {
                        i6 = i9 + 2;
                    }
                } else {
                    i6 = i9 + 1;
                }
                if (i6 >= length2) {
                    break;
                }
                if (i9 < i6) {
                    code.appendChild(new SoftLineBreak(subSequence.subSequence(indexOfAny, i6)));
                }
            }
        } else {
            code.appendChild(new Text(subSequence));
        }
        appendNode(code);
        return true;
    }

    public boolean parseBang() {
        int i6 = this.index;
        this.index = i6 + 1;
        if (peek() == '[') {
            int i7 = this.index;
            int i8 = i7 + 1;
            this.index = i8;
            addBracket(Bracket.image(this.input, appendSeparateText(this.input.subSequence(i7 - 1, i8)), i6 + 1, this.lastBracket, this.lastDelimiter));
        } else {
            BasedSequence basedSequence = this.input;
            int i9 = this.index;
            appendText(basedSequence.subSequence(i9 - 1, i9));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d6 A[LOOP:1: B:73:0x02d4->B:74:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean parseCloseBracket() {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.parser.internal.InlineParserImpl.parseCloseBracket():boolean");
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public List<Node> parseCustom(BasedSequence basedSequence, Node node, BitSet bitSet, Map<Character, CharacterNodeFactory> map) {
        this.customCharacters = bitSet;
        this.specialCharacters.or(bitSet);
        this.customSpecialCharacterFactoryMap = map;
        this.customSpecialCharacterNodes = null;
        parse(basedSequence, node);
        this.specialCharacters = this.originalSpecialCharacters;
        this.customSpecialCharacterFactoryMap = null;
        this.customCharacters = null;
        return this.customSpecialCharacterNodes;
    }

    public boolean parseDelimiters(DelimiterProcessor delimiterProcessor, char c6) {
        DelimiterData scanDelimiters = scanDelimiters(delimiterProcessor, c6);
        if (scanDelimiters == null) {
            return false;
        }
        int i6 = scanDelimiters.count;
        int i7 = this.index;
        int i8 = i7 + i6;
        this.index = i8;
        Delimiter delimiter = new Delimiter(this.input, appendSeparateText(this.input.subSequence(i7, i8)), c6, scanDelimiters.canOpen, scanDelimiters.canClose, this.lastDelimiter, i7);
        this.lastDelimiter = delimiter;
        delimiter.setNumDelims(i6);
        if (this.lastDelimiter.getPrevious() == null) {
            return true;
        }
        this.lastDelimiter.getPrevious().setNext(this.lastDelimiter);
        return true;
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public boolean parseEntity() {
        BasedSequence match = match(this.myParsing.ENTITY_HERE);
        if (match == null) {
            return false;
        }
        appendNode(new HtmlEntity(match));
        return true;
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public boolean parseHtmlInline() {
        BasedSequence match = match(this.myParsing.HTML_TAG);
        if (match == null) {
            return false;
        }
        appendNode((match.startsWith("<!--") && match.endsWith("-->")) ? new HtmlInlineComment(match) : new HtmlInline(match));
        return true;
    }

    public boolean parseInline() {
        return parseInline(false);
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public BasedSequence parseLinkDestination() {
        BasedSequence match = match(this.myParsing.LINK_DESTINATION_ANGLES);
        if (match != null) {
            return match;
        }
        LinkDestinationParser linkDestinationParser = this.linkDestinationParser;
        if (linkDestinationParser != null) {
            BasedSequence parseLinkDestination = linkDestinationParser.parseLinkDestination(this.input, this.index);
            this.index = parseLinkDestination.length() + this.index;
            return parseLinkDestination;
        }
        InlineParserOptions inlineParserOptions = this.options;
        boolean z5 = inlineParserOptions.spaceInLinkUrls;
        if (!inlineParserOptions.linksAllowMatchedParentheses) {
            BasedSequence match2 = match(this.myParsing.LINK_DESTINATION);
            return (match2 == null || !z5) ? match2 : match2.trimEnd(CharPredicate.SPACE);
        }
        BasedSequence match3 = match(this.myParsing.LINK_DESTINATION_MATCHED_PARENS);
        if (match3 == null) {
            return null;
        }
        int length = match3.length();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            char charAt = match3.charAt(i6);
            if (charAt == '\\') {
                int i8 = i6 + 1;
                if (i8 < length && this.myParsing.ESCAPABLE.matcher(match3.subSequence(i8, i6 + 2)).matches()) {
                    i6 = i8;
                }
            } else if (charAt == '(') {
                i7++;
            } else if (charAt != ')') {
                continue;
            } else {
                if (i7 == 0) {
                    this.index -= length - i6;
                    match3 = match3.subSequence(0, i6);
                    break;
                }
                i7--;
            }
            i6++;
        }
        return z5 ? match3.trimEnd(CharPredicate.SPACE) : match3;
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public int parseLinkLabel() {
        BasedSequence match = match(this.myParsing.LINK_LABEL);
        if (match == null) {
            return 0;
        }
        return match.length();
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public BasedSequence parseLinkTitle() {
        return match(this.myParsing.LINK_TITLE);
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public boolean parseNewline() {
        Node softLineBreak;
        int i6 = (this.index >= this.input.length() - 1 || this.input.charAt(this.index + 1) != '\n') ? 0 : 1;
        this.index = i6 + 1 + this.index;
        flushTextNode();
        Node lastChild = this.block.getLastChild();
        if ((lastChild instanceof Text) && lastChild.getChars().endsWith(SequenceUtils.SPACE)) {
            BasedSequence chars = ((Text) lastChild).getChars();
            Matcher matcher = this.myParsing.FINAL_SPACE.matcher(chars);
            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
            if (end >= 2) {
                BasedSequence basedSequence = this.input;
                int i7 = this.index;
                softLineBreak = new HardLineBreak(basedSequence.subSequence(i7 - (this.options.hardLineBreakLimit ? i6 + 3 : i6 + (end + 1)), i7));
            } else {
                BasedSequence basedSequence2 = this.input;
                int i8 = this.index;
                softLineBreak = new SoftLineBreak(basedSequence2.subSequence((i8 - 1) - i6, i8));
            }
            appendNode(softLineBreak);
            if (end > 0) {
                if (chars.length() > end) {
                    lastChild.setChars(chars.subSequence(0, chars.length() - end).trimEnd());
                } else {
                    lastChild.unlink();
                }
            }
        } else {
            BasedSequence basedSequence3 = this.input;
            int i9 = this.index;
            appendNode(new SoftLineBreak(basedSequence3.subSequence((i9 - 1) - i6, i9)));
        }
        while (peek() == ' ') {
            this.index++;
        }
        return true;
    }

    public boolean parseOpenBracket() {
        int i6 = this.index;
        int i7 = i6 + 1;
        this.index = i7;
        addBracket(Bracket.link(this.input, appendSeparateText(this.input.subSequence(i6, i7)), i6, this.lastBracket, this.lastDelimiter));
        return true;
    }

    public int parseReference(Block block, BasedSequence basedSequence) {
        boolean z5;
        this.input = basedSequence;
        this.index = 0;
        int parseLinkLabel = parseLinkLabel();
        if (parseLinkLabel == 0 || peek() != ':') {
            return 0;
        }
        BasedSequence subSequence = this.input.subSequence(0, parseLinkLabel + 1);
        this.index++;
        spnl();
        BasedSequence parseLinkDestination = parseLinkDestination();
        if (parseLinkDestination == null || parseLinkDestination.length() == 0) {
            return 0;
        }
        int i6 = this.index;
        spnl();
        BasedSequence parseLinkTitle = parseLinkTitle();
        if (parseLinkTitle == null) {
            this.index = i6;
        }
        if (this.index == this.input.length() || match(this.myParsing.LINE_END) != null) {
            z5 = true;
        } else if (parseLinkTitle == null) {
            z5 = false;
        } else {
            this.index = i6;
            z5 = match(this.myParsing.LINE_END) != null;
            parseLinkTitle = null;
        }
        if (!z5) {
            return 0;
        }
        String normalizeReferenceChars = Escaping.normalizeReferenceChars(subSequence, true);
        if (normalizeReferenceChars.isEmpty()) {
            return 0;
        }
        Reference reference = new Reference(subSequence, parseLinkDestination, parseLinkTitle);
        this.referenceRepository.put2(normalizeReferenceChars, (String) reference);
        block.insertBefore(reference);
        return this.index;
    }

    public boolean parseString() {
        int i6 = this.index;
        int length = this.input.length();
        while (true) {
            int i7 = this.index;
            if (i7 == length || this.specialCharacters.get(this.input.charAt(i7))) {
                break;
            }
            this.index++;
        }
        int i8 = this.index;
        if (i6 == i8) {
            return false;
        }
        appendText(this.input, i6, i8);
        return true;
    }

    @Override // com.vladsch.flexmark.parser.block.ParagraphPreProcessor
    public int preProcessBlock(Paragraph paragraph, ParserState parserState) {
        BasedSequence chars = paragraph.getChars();
        int countLeading = chars.countLeading(CharPredicate.SPACE_TAB);
        int length = chars.length();
        while (countLeading <= 3 && length > countLeading + 3 && chars.charAt(countLeading) == '[') {
            if (countLeading > 0) {
                chars = chars.subSequence(countLeading, length);
                length -= countLeading;
            }
            int parseReference = parseReference(paragraph, chars);
            if (parseReference == 0) {
                break;
            }
            chars = chars.subSequence(parseReference, length);
            length = chars.length();
            countLeading = chars.countLeading(CharPredicate.SPACE_TAB);
        }
        return chars.getStartOffset() - paragraph.getStartOffset();
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public void processDelimiters(Delimiter delimiter) {
        boolean z5;
        HashMap hashMap = new HashMap();
        Delimiter delimiter2 = this.lastDelimiter;
        while (delimiter2 != null && delimiter2.getPrevious() != delimiter) {
            delimiter2 = delimiter2.getPrevious();
        }
        while (delimiter2 != null) {
            char delimiterChar = delimiter2.getDelimiterChar();
            DelimiterProcessor delimiterProcessor = this.delimiterProcessors.get(Character.valueOf(delimiterChar));
            if (!delimiter2.canClose() || delimiterProcessor == null) {
                delimiter2 = delimiter2.getNext();
            } else {
                char openingCharacter = delimiterProcessor.getOpeningCharacter();
                Delimiter previous = delimiter2.getPrevious();
                int i6 = 0;
                boolean z6 = false;
                while (previous != null && previous != delimiter && previous != hashMap.get(Character.valueOf(delimiterChar))) {
                    if (previous.canOpen() && previous.getDelimiterChar() == openingCharacter) {
                        i6 = delimiterProcessor.getDelimiterUse(previous, delimiter2);
                        z6 = true;
                        if (i6 > 0) {
                            z5 = true;
                            break;
                        }
                    }
                    previous = previous.getPrevious();
                }
                z5 = z6;
                z6 = false;
                if (z6) {
                    previous.setNumDelims(previous.getNumDelims() - i6);
                    delimiter2.setNumDelims(delimiter2.getNumDelims() - i6);
                    removeDelimitersBetween(previous, delimiter2);
                    previous.setNumDelims(previous.getNumDelims() + i6);
                    delimiter2.setNumDelims(delimiter2.getNumDelims() + i6);
                    delimiterProcessor.process(previous, delimiter2, i6);
                    previous.setNumDelims(previous.getNumDelims() - i6);
                    delimiter2.setNumDelims(delimiter2.getNumDelims() - i6);
                    if (previous.getNumDelims() == 0) {
                        removeDelimiterAndNode(previous);
                    } else {
                        previous.getNode().setChars(previous.getNode().getChars().subSequence(0, previous.getNumDelims()));
                    }
                    if (delimiter2.getNumDelims() == 0) {
                        Delimiter next = delimiter2.getNext();
                        removeDelimiterAndNode(delimiter2);
                        delimiter2 = next;
                    } else {
                        BasedSequence chars = delimiter2.getNode().getChars();
                        int length = chars.length();
                        delimiter2.getNode().setChars(chars.subSequence(length - delimiter2.getNumDelims(), length));
                        delimiter2.setIndex(delimiter2.getIndex() + i6);
                    }
                } else {
                    if (!z5) {
                        hashMap.put(Character.valueOf(delimiterChar), delimiter2.getPrevious());
                        if (!delimiter2.canOpen()) {
                            removeDelimiterKeepNode(delimiter2);
                        }
                    }
                    delimiter2 = delimiter2.getNext();
                }
            }
        }
        while (true) {
            Delimiter delimiter3 = this.lastDelimiter;
            if (delimiter3 == null || delimiter3 == delimiter) {
                return;
            } else {
                removeDelimiterKeepNode(delimiter3);
            }
        }
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public void removeDelimiter(Delimiter delimiter) {
        if (delimiter.getPrevious() != null) {
            delimiter.getPrevious().setNext(delimiter.getNext());
        }
        if (delimiter.getNext() == null) {
            this.lastDelimiter = delimiter.getPrevious();
        } else {
            delimiter.getNext().setPrevious(delimiter.getPrevious());
        }
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public void removeDelimiterAndNode(Delimiter delimiter) {
        Text node = delimiter.getNode();
        Text previousNonDelimiterTextNode = delimiter.getPreviousNonDelimiterTextNode();
        Text nextNonDelimiterTextNode = delimiter.getNextNonDelimiterTextNode();
        if (previousNonDelimiterTextNode != null && nextNonDelimiterTextNode != null) {
            previousNonDelimiterTextNode.setChars(this.input.baseSubSequence(previousNonDelimiterTextNode.getStartOffset(), nextNonDelimiterTextNode.getEndOffset()));
            nextNonDelimiterTextNode.unlink();
        }
        node.unlink();
        removeDelimiter(delimiter);
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public void removeDelimiterKeepNode(Delimiter delimiter) {
        DelimiterProcessor delimiterProcessor = this.delimiterProcessors.get(Character.valueOf(delimiter.getDelimiterChar()));
        Node unmatchedDelimiterNode = delimiterProcessor != null ? delimiterProcessor.unmatchedDelimiterNode(this, delimiter) : null;
        if (unmatchedDelimiterNode == null) {
            unmatchedDelimiterNode = delimiter.getNode();
        } else if (unmatchedDelimiterNode != delimiter.getNode()) {
            delimiter.getNode().insertAfter(unmatchedDelimiterNode);
            delimiter.getNode().unlink();
        }
        Text previousNonDelimiterTextNode = delimiter.getPreviousNonDelimiterTextNode();
        Text nextNonDelimiterTextNode = delimiter.getNextNonDelimiterTextNode();
        if ((unmatchedDelimiterNode instanceof Text) && (previousNonDelimiterTextNode != null || nextNonDelimiterTextNode != null)) {
            if (nextNonDelimiterTextNode != null && previousNonDelimiterTextNode != null) {
                unmatchedDelimiterNode.setChars(this.input.baseSubSequence(previousNonDelimiterTextNode.getStartOffset(), nextNonDelimiterTextNode.getEndOffset()));
                previousNonDelimiterTextNode.unlink();
                nextNonDelimiterTextNode.unlink();
            } else if (previousNonDelimiterTextNode != null) {
                unmatchedDelimiterNode.setChars(this.input.baseSubSequence(previousNonDelimiterTextNode.getStartOffset(), unmatchedDelimiterNode.getEndOffset()));
                previousNonDelimiterTextNode.unlink();
            } else {
                unmatchedDelimiterNode.setChars(this.input.baseSubSequence(unmatchedDelimiterNode.getStartOffset(), nextNonDelimiterTextNode.getEndOffset()));
                nextNonDelimiterTextNode.unlink();
            }
        }
        removeDelimiter(delimiter);
    }

    @Override // com.vladsch.flexmark.parser.InlineParser
    public void removeDelimitersBetween(Delimiter delimiter, Delimiter delimiter2) {
        Delimiter previous = delimiter2.getPrevious();
        while (previous != null && previous != delimiter) {
            Delimiter previous2 = previous.getPrevious();
            removeDelimiterKeepNode(previous);
            previous = previous2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r8 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        if (r8 != false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.vladsch.flexmark.parser.internal.InlineParserImpl.DelimiterData scanDelimiters(com.vladsch.flexmark.parser.delimiter.DelimiterProcessor r19, char r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.parser.internal.InlineParserImpl.scanDelimiters(com.vladsch.flexmark.parser.delimiter.DelimiterProcessor, char):com.vladsch.flexmark.parser.internal.InlineParserImpl$DelimiterData");
    }

    public boolean parseInline(boolean z5) {
        boolean parseNewline;
        Map<Character, List<InlineParserExtension>> map;
        List<InlineParserExtension> list;
        char peek = peek();
        if (peek == 0) {
            return false;
        }
        if (!z5 && (map = this.inlineParserExtensions) != null && (list = map.get(Character.valueOf(peek))) != null) {
            Iterator<InlineParserExtension> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().parse(this)) {
                    return true;
                }
            }
        }
        BitSet bitSet = this.customCharacters;
        if (bitSet != null && bitSet.get(peek)) {
            if (!processCustomCharacters()) {
                int i6 = this.index;
                int i7 = i6 + 1;
                this.index = i7;
                appendText(this.input.subSequence(i6, i7));
            } else {
                processDelimiters(null);
                this.lastDelimiter = null;
            }
            return true;
        }
        if (peek == '\n' || peek == '\r') {
            parseNewline = parseNewline();
        } else if (peek == '!') {
            parseNewline = parseBang();
        } else if (peek == '&') {
            parseNewline = parseEntity();
        } else if (peek != '<') {
            if (peek != '`') {
                switch (peek) {
                    case '[':
                        parseNewline = parseOpenBracket();
                        break;
                    case '\\':
                        parseNewline = parseBackslash();
                        break;
                    case ']':
                        parseNewline = parseCloseBracket();
                        break;
                    default:
                        if (this.delimiterCharacters.get(peek)) {
                            parseNewline = parseDelimiters(this.delimiterProcessors.get(Character.valueOf(peek)), peek);
                            break;
                        } else {
                            parseNewline = parseString();
                            break;
                        }
                }
            } else {
                parseNewline = parseBackticks();
            }
        } else if (this.delimiterCharacters.get(peek) && peek(1) == '<') {
            parseNewline = parseDelimiters(this.delimiterProcessors.get(Character.valueOf(peek)), peek);
        } else {
            parseNewline = parseAutolink() || parseHtmlInline();
        }
        if (!parseNewline) {
            int i8 = this.index;
            int i9 = i8 + 1;
            this.index = i9;
            appendText(this.input.subSequence(i8, i9));
        }
        return true;
    }

    public static boolean containsLinkRefs(BasedSequence basedSequence, Node node, Boolean bool) {
        int startOffset = basedSequence.getStartOffset();
        int endOffset = basedSequence.getEndOffset();
        while (node != null) {
            if ((node instanceof LinkRefDerived) && ((bool == null || ((LinkRefDerived) node).isTentative() == bool.booleanValue()) && node.getStartOffset() < endOffset && node.getEndOffset() > startOffset)) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }
}
