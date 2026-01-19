package com.vladsch.flexmark.ext.tables.internal;

import B3.e;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ast.WhiteSpace;
import com.vladsch.flexmark.ext.tables.TableCell;
import com.vladsch.flexmark.ext.tables.TableRow;
import com.vladsch.flexmark.ext.wikilink.WikiNode;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.InlineParser;
import com.vladsch.flexmark.parser.block.CharacterNodeFactory;
import com.vladsch.flexmark.parser.block.ParagraphPreProcessor;
import com.vladsch.flexmark.parser.block.ParagraphPreProcessorFactory;
import com.vladsch.flexmark.parser.block.ParserState;
import com.vladsch.flexmark.parser.core.ReferencePreProcessorFactory;
import com.vladsch.flexmark.util.ast.DoNotDecorate;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.format.TableFormatOptions;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class TableParagraphPreProcessor implements ParagraphPreProcessor {
    private static HashMap<Character, CharacterNodeFactory> pipeIntelliJNodeMap;
    private static HashMap<Character, CharacterNodeFactory> pipeNodeMap;
    Pattern TABLE_HEADER_SEPARATOR;
    private final TableParserOptions options;
    private static BitSet pipeCharacters = new BitSet();
    private static BitSet separatorCharacters = new BitSet();

    /* loaded from: classes.dex */
    public static class TableSeparatorRow extends TableRow implements DoNotDecorate {
        public TableSeparatorRow() {
        }

        public TableSeparatorRow(BasedSequence basedSequence) {
            super(basedSequence);
        }
    }

    static {
        BitSet bitSet = pipeCharacters;
        Character valueOf = Character.valueOf(WikiNode.SEPARATOR_CHAR);
        bitSet.set(124);
        separatorCharacters.set(124);
        separatorCharacters.set(58);
        separatorCharacters.set(45);
        HashMap<Character, CharacterNodeFactory> hashMap = new HashMap<>();
        pipeNodeMap = hashMap;
        hashMap.put(valueOf, new CharacterNodeFactory() { // from class: com.vladsch.flexmark.ext.tables.internal.TableParagraphPreProcessor.1
            @Override // com.vladsch.flexmark.parser.block.CharacterNodeFactory
            public boolean skipNext(char c6) {
                return c6 == ' ' || c6 == '\t';
            }

            @Override // com.vladsch.flexmark.parser.block.CharacterNodeFactory
            public boolean skipPrev(char c6) {
                return c6 == ' ' || c6 == '\t';
            }

            @Override // com.vladsch.flexmark.parser.block.CharacterNodeFactory
            public boolean wantSkippedWhitespace() {
                return true;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.function.Supplier
            public Node get() {
                return new TableColumnSeparator();
            }
        });
        HashMap<Character, CharacterNodeFactory> hashMap2 = new HashMap<>();
        pipeIntelliJNodeMap = hashMap2;
        hashMap2.put(valueOf, new CharacterNodeFactory() { // from class: com.vladsch.flexmark.ext.tables.internal.TableParagraphPreProcessor.2
            @Override // com.vladsch.flexmark.parser.block.CharacterNodeFactory
            public boolean skipNext(char c6) {
                return c6 == ' ' || c6 == '\t';
            }

            @Override // com.vladsch.flexmark.parser.block.CharacterNodeFactory
            public boolean skipPrev(char c6) {
                return c6 == ' ' || c6 == '\t';
            }

            @Override // com.vladsch.flexmark.parser.block.CharacterNodeFactory
            public boolean wantSkippedWhitespace() {
                return true;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.function.Supplier
            public Node get() {
                return new TableColumnSeparator();
            }
        });
    }

    public /* synthetic */ TableParagraphPreProcessor(MutableDataHolder mutableDataHolder) {
        this((DataHolder) mutableDataHolder);
    }

    public static ParagraphPreProcessorFactory Factory() {
        return new ParagraphPreProcessorFactory() { // from class: com.vladsch.flexmark.ext.tables.internal.TableParagraphPreProcessor.3
            @Override // com.vladsch.flexmark.util.dependency.Dependent
            public boolean affectsGlobalScope() {
                return false;
            }

            @Override // com.vladsch.flexmark.util.dependency.Dependent
            public Set<Class<?>> getAfterDependents() {
                HashSet hashSet = new HashSet();
                hashSet.add(ReferencePreProcessorFactory.class);
                return hashSet;
            }

            @Override // com.vladsch.flexmark.util.dependency.Dependent
            public Set<Class<?>> getBeforeDependents() {
                return null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vladsch.flexmark.parser.block.ParagraphPreProcessorFactory, java.util.function.Function
            public ParagraphPreProcessor apply(ParserState parserState) {
                return new TableParagraphPreProcessor(parserState.getProperties());
            }
        };
    }

    private static TableCell.Alignment getAlignment(boolean z5, boolean z6) {
        if (z5 && z6) {
            return TableCell.Alignment.CENTER;
        }
        if (z5) {
            return TableCell.Alignment.LEFT;
        }
        if (z6) {
            return TableCell.Alignment.RIGHT;
        }
        return null;
    }

    public static Pattern getTableHeaderSeparator(int i6, String str) {
        int i7 = i6 >= 1 ? i6 : 1;
        int i8 = i6 >= 2 ? i6 - 1 : 1;
        int i9 = i6 >= 3 ? i6 - 2 : 1;
        Locale locale = Locale.US;
        StringBuilder j3 = AbstractC1135a.j(i7, "(?:\\s*-{", i8, ",}\\s*|\\s*:-{", ",}\\s*|\\s*-{");
        j3.append(i8);
        j3.append(",}:\\s*|\\s*:-{");
        j3.append(i9);
        j3.append(",}:\\s*)");
        String sb = j3.toString();
        boolean isEmpty = str.isEmpty();
        String str2 = isEmpty ? FlexmarkHtmlConverter.DEFAULT_NODE : TableFormatOptions.INTELLIJ_DUMMY_IDENTIFIER;
        String s5 = isEmpty ? "\\s" : AbstractC1135a.s("(?:\\s", str2, "?)");
        String s6 = isEmpty ? "-" : AbstractC1135a.s("(?:-", str2, "?)");
        String o5 = isEmpty ? "\\|" : e.o("(?:", str2, "?\\|", str2, "?)");
        StringBuilder u5 = e.u("\\|", sb, "\\|?\\s*|", sb, "\\|\\s*|\\|?(?:");
        u5.append(sb);
        u5.append("\\|)+");
        u5.append(sb);
        u5.append("\\|?\\s*");
        return Pattern.compile(u5.toString().replace("\\s", s5).replace("\\|", o5).replace("-", s6));
    }

    private List<TableCell.Alignment> parseAlignment(BasedSequence basedSequence) {
        List<BasedSequence> split = split(basedSequence, false, false);
        ArrayList arrayList = new ArrayList();
        Iterator<BasedSequence> it = split.iterator();
        while (it.hasNext()) {
            BasedSequence trim = it.next().trim();
            arrayList.add(getAlignment(trim.startsWith(":"), trim.endsWith(":")));
        }
        return arrayList;
    }

    private static List<BasedSequence> split(BasedSequence basedSequence, boolean z5, boolean z6) {
        BasedSequence trim = basedSequence.trim();
        int length = trim.length();
        ArrayList arrayList = new ArrayList();
        if (trim.startsWith("|")) {
            if (z6) {
                arrayList.add(trim.subSequence(0, 1));
            }
            trim = trim.subSequence(1, length);
            length--;
        }
        int i6 = 0;
        boolean z7 = false;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = trim.charAt(i8);
            if (z7) {
                i6++;
                z7 = false;
            } else if (charAt == '\\') {
                i6++;
                z7 = true;
            } else if (charAt != '|') {
                i6++;
            } else {
                if (!z5 || i7 < i8) {
                    arrayList.add(trim.subSequence(i7, i8));
                }
                if (z6) {
                    arrayList.add(trim.subSequence(i8, i8 + 1));
                }
                i7 = i8 + 1;
                i6 = 0;
            }
        }
        if (i6 > 0) {
            arrayList.add(trim.subSequence(i7, length));
        }
        return arrayList;
    }

    public List<Node> cleanUpInlinedSeparators(InlineParser inlineParser, TableRow tableRow, List<Node> list) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (Node node : list) {
            if (node.getParent() != null && node.getParent() != tableRow) {
                Node previous = node.getPrevious() instanceof WhiteSpace ? node.getPrevious() : node;
                Node next = node.getNext() instanceof WhiteSpace ? node.getNext() : node;
                Text text = new Text(node.baseSubSequence(previous.getStartOffset(), next.getEndOffset()));
                node.insertBefore(text);
                node.unlink();
                previous.unlink();
                next.unlink();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    arrayList = new ArrayList();
                }
                arrayList2.add(node);
                arrayList.add(text.getParent());
            }
        }
        if (arrayList == null) {
            return list;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            Node node2 = (Node) obj;
            inlineParser.mergeTextNodes(node2.getFirstChild(), node2.getLastChild());
        }
        if (arrayList2.size() == list.size()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(list);
        arrayList3.removeAll(arrayList2);
        return arrayList3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0241, code lost:
    
        if (r13 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0243, code lost:
    
        r13 = r23.next().getChars();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x024f, code lost:
    
        if (r25.options.columnSpans != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0274, code lost:
    
        r19 = (r12 - 1) + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0278, code lost:
    
        if (r13 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x027a, code lost:
    
        r9.setClosingMarker(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x027d, code lost:
    
        r9.setChars(r9.getChildChars());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0288, code lost:
    
        if (r25.options.trimCellWhitespace == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028a, code lost:
    
        r9.trimWhiteSpace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0291, code lost:
    
        r9.setText(r9.getChildChars());
        r9.setCharsFromContent();
        r9.setSpan(r12);
        r15.appendChild(r9);
        r7 = r7 + 1;
        r9 = r20;
        r12 = r21;
        r13 = r22;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x028e, code lost:
    
        r9.mergeWhiteSpace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0252, code lost:
    
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0255, code lost:
    
        r14 = r23.peek().getChars();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0261, code lost:
    
        if (r13.isContinuedBy(r14) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r13.spliceAtEnd(r14);
        r23.next().unlink();
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0272, code lost:
    
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0210, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0209, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d7, code lost:
    
        if (r9.headerSeparatorColumnMatch == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01d9, code lost:
    
        if (r10 >= r11) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01db, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b5, code lost:
    
        if (r25.options.headerSeparatorColumnMatch == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b7, code lost:
    
        if (r10 >= r11) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02b9, code lost:
    
        if (r7 >= r6) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02bb, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c2, code lost:
    
        if (r25.options.appendMissingColumns == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c4, code lost:
    
        if (r7 >= r6) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c6, code lost:
    
        r9 = new com.vladsch.flexmark.ext.tables.TableCell();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cb, code lost:
    
        if (r10 >= r11) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02cd, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02d0, code lost:
    
        r9.setHeader(r12);
        r9.setAlignment(r3.get(r7));
        r15.appendChild(r9);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02cf, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e2, code lost:
    
        r15.setCharsFromContent();
        r5.appendChild(r15);
        r10 = r10 + 1;
        r7 = r18;
        r9 = r20;
        r12 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01de, code lost:
    
        r21 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ad, code lost:
    
        r20 = r9;
        r21 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0197, code lost:
    
        if (r10 != (r11 + 1)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0199, code lost:
    
        r5.setCharsFromContent();
        r5 = new com.vladsch.flexmark.ext.tables.TableBody();
        r4.appendChild(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02f2, code lost:
    
        r5.setCharsFromContent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02f7, code lost:
    
        if ((r5 instanceof com.vladsch.flexmark.ext.tables.TableSeparator) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02f9, code lost:
    
        r4.appendChild(new com.vladsch.flexmark.ext.tables.TableBody(r5.getChars().subSequence(r5.getChars().length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0313, code lost:
    
        if (r8 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0315, code lost:
    
        r3 = new com.vladsch.flexmark.ext.tables.TableCaption(r8.subSequence(0, 1), r8.subSequence(1, r8.length() - 1), r8.subSequence(r8.length() - 1));
        r2.parse(r3.getText(), r3);
        r3.setCharsFromContent();
        r4.appendChild(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0341, code lost:
    
        r4.setCharsFromContent();
        r26.insertBefore(r4);
        r27.blockAdded(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0354, code lost:
    
        return r4.getChars().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0122, code lost:
    
        r18 = r6;
        r4 = r2.parseCustom(r4, r14, com.vladsch.flexmark.ext.tables.internal.TableParagraphPreProcessor.pipeCharacters, com.vladsch.flexmark.ext.tables.internal.TableParagraphPreProcessor.pipeNodeMap);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x012c, code lost:
    
        if (r15 >= r11) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x012e, code lost:
    
        r5 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0133, code lost:
    
        if (r4 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0135, code lost:
    
        r4 = cleanUpInlinedSeparators(r2, r14, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0131, code lost:
    
        r5 = r15 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0108, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00e8, code lost:
    
        r20 = r5;
        r4 = r14.baseSubSequence(r14.getStartOffset() - (r26.getLineIndent(r15) - r5), r14.getEndOffset() - r14.eolEndLength());
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x014c, code lost:
    
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00ba, code lost:
    
        r8 = null;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r13.charAt(0) != '\t') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        if (r11 != r9) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        r9 = new java.util.ArrayList();
        r10 = r3.size();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        if (r13 >= r10) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cb, code lost:
    
        r14 = r3.get(r13);
        r13 = r13 + 1;
        r14 = (com.vladsch.flexmark.util.sequence.BasedSequence) r14;
        r15 = r9.size();
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        if (r26.getLineIndent(r15) > r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00df, code lost:
    
        r4 = r14.trimEOL();
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (r15 != r11) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        r14 = new com.vladsch.flexmark.ext.tables.TableRow(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:
    
        if (r5 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0111, code lost:
    
        r5 = new com.vladsch.flexmark.ext.tables.internal.TableParagraphPreProcessor.TableSeparatorRow(r4);
        r4 = r2.parseCustom(r4, r5, r6, r7);
        r14.takeChildren(r5);
        r18 = r6;
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
    
        if (r4 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013e, code lost:
    
        r14.setRowNumber(r5);
        r9.add(r14);
        r4 = r17;
        r6 = r18;
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013b, code lost:
    
        if (r15 > r11) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014e, code lost:
    
        r6 = r17;
        r4 = new com.vladsch.flexmark.ext.tables.TableBlock((java.util.List<com.vladsch.flexmark.util.sequence.BasedSequence>) r3.subList(r6, r9.size()));
        r5 = new com.vladsch.flexmark.ext.tables.TableHead(((com.vladsch.flexmark.util.sequence.BasedSequence) r3.get(r6)).subSequence(r6, r6));
        r4.appendChild(r5);
        r3 = parseAlignment(r12);
        r6 = r3.size();
        r7 = r9.size();
        r10 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017d, code lost:
    
        if (r12 >= r7) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017f, code lost:
    
        r13 = r9.get(r12);
        r12 = r12 + 1;
        r13 = (com.vladsch.flexmark.ext.tables.TableRow) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0187, code lost:
    
        if (r10 != r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
    
        r5.setCharsFromContent();
        r5 = new com.vladsch.flexmark.ext.tables.TableSeparator();
        r4.appendChild(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a4, code lost:
    
        r14 = new com.vladsch.flexmark.util.ast.NodeIterator(r13.getFirstChild());
        r18 = r7;
        r15 = new com.vladsch.flexmark.ext.tables.TableRow(r13.getChars());
        r15.setRowNumber(r13.getRowNumber());
        r7 = 0;
        r13 = true;
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c7, code lost:
    
        if (r14.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c9, code lost:
    
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cb, code lost:
    
        if (r7 < r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cd, code lost:
    
        r9 = r25.options;
        r21 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d3, code lost:
    
        if (r9.discardExtraColumns == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e0, code lost:
    
        r9 = new com.vladsch.flexmark.ext.tables.TableCell();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e5, code lost:
    
        if (r13 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
    
        if ((r14.peek() instanceof com.vladsch.flexmark.ext.tables.internal.TableColumnSeparator) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ef, code lost:
    
        r12 = r14.next();
        r9.setOpeningMarker(r12.getChars());
        r12.unlink();
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fe, code lost:
    
        r12 = r7 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0200, code lost:
    
        if (r12 >= r6) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0202, code lost:
    
        r12 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020a, code lost:
    
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020c, code lost:
    
        if (r10 >= r11) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x020e, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0211, code lost:
    
        r9.setHeader(r13);
        r9.setAlignment(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021b, code lost:
    
        if (r14.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0223, code lost:
    
        if ((r14.peek() instanceof com.vladsch.flexmark.ext.tables.internal.TableColumnSeparator) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0226, code lost:
    
        r9.appendChild(r14.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022e, code lost:
    
        r12 = 1;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0234, code lost:
    
        if (r14.hasNext() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0236, code lost:
    
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023e, code lost:
    
        if ((r23.peek() instanceof com.vladsch.flexmark.ext.tables.internal.TableColumnSeparator) != false) goto L116;
     */
    @Override // com.vladsch.flexmark.parser.block.ParagraphPreProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int preProcessBlock(com.vladsch.flexmark.ast.Paragraph r26, com.vladsch.flexmark.parser.block.ParserState r27) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.ext.tables.internal.TableParagraphPreProcessor.preProcessBlock(com.vladsch.flexmark.ast.Paragraph, com.vladsch.flexmark.parser.block.ParserState):int");
    }

    private TableParagraphPreProcessor(DataHolder dataHolder) {
        TableParserOptions tableParserOptions = new TableParserOptions(dataHolder);
        this.options = tableParserOptions;
        this.TABLE_HEADER_SEPARATOR = getTableHeaderSeparator(tableParserOptions.minSeparatorDashes, FlexmarkHtmlConverter.DEFAULT_NODE);
    }
}
