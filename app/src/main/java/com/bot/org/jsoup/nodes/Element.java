package org.jsoup.nodes;

import c.C0914b;
import com.vladsch.flexmark.ast.util.g;
import com.vladsch.flexmark.formatter.i;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import i3.C1116a;
import j1.AbstractC1135a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;

/* loaded from: classes.dex */
public class Element extends Node {
    Attributes attributes;
    List<Node> childNodes;
    private WeakReference<List<Element>> shadowChildrenRef;
    private Tag tag;
    private static final List<Element> EmptyChildren = Collections.EMPTY_LIST;
    private static final Pattern ClassSplit = Pattern.compile("\\s+");
    private static final String BaseUriKey = Attributes.internalKey("baseUri");

    /* loaded from: classes.dex */
    public static final class NodeList extends ChangeNotifyingArrayList<Node> {
        private final Element owner;

        public NodeList(Element element, int i6) {
            super(i6);
            this.owner = element;
        }

        @Override // org.jsoup.helper.ChangeNotifyingArrayList
        public void onContentsChanged() {
            this.owner.nodelistChanged();
        }
    }

    /* loaded from: classes.dex */
    public static class TextAccumulator implements NodeVisitor {
        private final StringBuilder accum;

        public TextAccumulator(StringBuilder sb) {
            this.accum = sb;
        }

        @Override // org.jsoup.select.NodeVisitor
        /* renamed from: head */
        public void mo11head(Node node, int i6) {
            if (node instanceof TextNode) {
                Element.appendNormalisedText(this.accum, (TextNode) node);
            } else if (node instanceof Element) {
                Element element = (Element) node;
                if (this.accum.length() > 0) {
                    if ((element.isBlock() || element.nameIs(FlexmarkHtmlConverter.BR_NODE)) && !TextNode.lastCharIsWhitespace(this.accum)) {
                        this.accum.append(SequenceUtils.SPC);
                    }
                }
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i6) {
            if (node instanceof Element) {
                Element element = (Element) node;
                Node nextSibling = node.nextSibling();
                if (element.isBlock()) {
                    if (((nextSibling instanceof TextNode) || ((nextSibling instanceof Element) && !((Element) nextSibling).tag.formatAsBlock())) && !TextNode.lastCharIsWhitespace(this.accum)) {
                        this.accum.append(SequenceUtils.SPC);
                    }
                }
            }
        }
    }

    public Element(String str, String str2) {
        this(Tag.valueOf(str, str2, ParseSettings.preserveCase), (String) null);
    }

    public static void appendNormalisedText(StringBuilder sb, TextNode textNode) {
        String wholeText = textNode.getWholeText();
        if (preserveWhitespace(textNode.parentNode) || (textNode instanceof CDataNode)) {
            sb.append(wholeText);
        } else {
            StringUtil.appendNormalisedWhitespace(sb, wholeText, TextNode.lastCharIsWhitespace(sb));
        }
    }

    public static void appendWholeText(Node node, StringBuilder sb) {
        if (node instanceof TextNode) {
            sb.append(((TextNode) node).getWholeText());
        } else if (node.nameIs(FlexmarkHtmlConverter.BR_NODE)) {
            sb.append(SequenceUtils.EOL);
        }
    }

    private String cssSelectorComponent() {
        String replace = TokenQueue.escapeCssIdentifier(tagName()).replace("\\:", "|");
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        borrowBuilder.append(replace);
        StringUtil.StringJoiner stringJoiner = new StringUtil.StringJoiner(".");
        Iterator<String> it = classNames().iterator();
        while (it.hasNext()) {
            stringJoiner.add(TokenQueue.escapeCssIdentifier(it.next()));
        }
        String complete = stringJoiner.complete();
        if (complete.length() > 0) {
            borrowBuilder.append('.');
            borrowBuilder.append(complete);
        }
        if (parent() == null || (parent() instanceof Document)) {
            return StringUtil.releaseBuilder(borrowBuilder);
        }
        borrowBuilder.insert(0, " > ");
        if (parent().select(borrowBuilder.toString()).size() > 1) {
            borrowBuilder.append(String.format(":nth-child(%d)", Integer.valueOf(elementSiblingIndex() + 1)));
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    private <T> List<T> filterNodes(Class<T> cls) {
        Stream<Node> stream = this.childNodes.stream();
        Objects.requireNonNull(cls);
        return (List) stream.filter(new C1116a(cls, 1)).map(new i(cls, 3)).collect(Collectors.collectingAndThen(Collectors.toList(), new g(13)));
    }

    private static <E extends Element> int indexInList(Element element, List<E> list) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (list.get(i6) == element) {
                return i6;
            }
        }
        return 0;
    }

    private boolean isFormatAsBlock(Document.OutputSettings outputSettings) {
        if (this.tag.isBlock()) {
            return true;
        }
        return (parent() != null && parent().tag().formatAsBlock()) || outputSettings.outline();
    }

    private boolean isInlineable(Document.OutputSettings outputSettings) {
        if (this.tag.isInline()) {
            return ((parent() != null && !parent().isBlock()) || isEffectivelyFirst() || outputSettings.outline() || nameIs(FlexmarkHtmlConverter.BR_NODE)) ? false : true;
        }
        return false;
    }

    public static /* synthetic */ void lambda$data$2(StringBuilder sb, Node node, int i6) {
        if (node instanceof DataNode) {
            sb.append(((DataNode) node).getWholeData());
        } else if (node instanceof Comment) {
            sb.append(((Comment) node).getData());
        } else if (node instanceof CDataNode) {
            sb.append(((CDataNode) node).getWholeText());
        }
    }

    public static /* synthetic */ NodeFilter.FilterResult lambda$hasText$1(AtomicBoolean atomicBoolean, Node node, int i6) {
        if (!(node instanceof TextNode) || ((TextNode) node).isBlank()) {
            return NodeFilter.FilterResult.CONTINUE;
        }
        atomicBoolean.set(true);
        return NodeFilter.FilterResult.STOP;
    }

    public static boolean preserveWhitespace(Node node) {
        if (node instanceof Element) {
            Element element = (Element) node;
            int i6 = 0;
            while (!element.tag.preserveWhitespace()) {
                element = element.parent();
                i6++;
                if (i6 < 6 && element != null) {
                }
            }
            return true;
        }
        return false;
    }

    private static String searchUpForAttribute(Element element, String str) {
        while (element != null) {
            Attributes attributes = element.attributes;
            if (attributes != null && attributes.hasKey(str)) {
                return element.attributes.get(str);
            }
            element = element.parent();
        }
        return FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public Element addClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.add(str);
        classNames(classNames);
        return this;
    }

    public Element append(String str) {
        Validate.notNull(str);
        addChildren((Node[]) NodeUtils.parser(this).parseFragmentInput(str, this, baseUri()).toArray(new Node[0]));
        return this;
    }

    public Element appendChild(Node node) {
        Validate.notNull(node);
        reparentChild(node);
        ensureChildNodes();
        this.childNodes.add(node);
        node.setSiblingIndex(this.childNodes.size() - 1);
        return this;
    }

    public Element appendChildren(Collection<? extends Node> collection) {
        insertChildren(-1, collection);
        return this;
    }

    public Element appendElement(String str) {
        return appendElement(str, this.tag.namespace());
    }

    public Element appendText(String str) {
        Validate.notNull(str);
        appendChild(new TextNode(str));
        return this;
    }

    public Element appendTo(Element element) {
        Validate.notNull(element);
        element.appendChild(this);
        return this;
    }

    public Attribute attribute(String str) {
        if (hasAttributes()) {
            return attributes().attribute(str);
        }
        return null;
    }

    @Override // org.jsoup.nodes.Node
    public Attributes attributes() {
        if (this.attributes == null) {
            this.attributes = new Attributes();
        }
        return this.attributes;
    }

    @Override // org.jsoup.nodes.Node
    public String baseUri() {
        return searchUpForAttribute(this, BaseUriKey);
    }

    public Element child(int i6) {
        return childElementsList().get(i6);
    }

    public List<Element> childElementsList() {
        List<Element> list;
        if (childNodeSize() == 0) {
            return EmptyChildren;
        }
        WeakReference<List<Element>> weakReference = this.shadowChildrenRef;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.childNodes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            Node node = this.childNodes.get(i6);
            if (node instanceof Element) {
                arrayList.add((Element) node);
            }
        }
        this.shadowChildrenRef = new WeakReference<>(arrayList);
        return arrayList;
    }

    @Override // org.jsoup.nodes.Node
    public int childNodeSize() {
        return this.childNodes.size();
    }

    public Elements children() {
        return new Elements(childElementsList());
    }

    public int childrenSize() {
        return childElementsList().size();
    }

    public String className() {
        return attr(com.vladsch.flexmark.util.html.Attribute.CLASS_ATTR).trim();
    }

    public Set<String> classNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(ClassSplit.split(className())));
        linkedHashSet.remove(FlexmarkHtmlConverter.DEFAULT_NODE);
        return linkedHashSet;
    }

    public Element closest(String str) {
        return closest(QueryParser.parse(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r2.get(0) == r5) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String cssSelector() {
        /*
            r5 = this;
            java.lang.String r0 = r5.id()
            int r0 = r0.length()
            r1 = 0
            if (r0 <= 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "#"
            r0.<init>(r2)
            java.lang.String r2 = r5.id()
            java.lang.String r2 = org.jsoup.parser.TokenQueue.escapeCssIdentifier(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            org.jsoup.nodes.Document r2 = r5.ownerDocument()
            if (r2 == 0) goto L38
            org.jsoup.select.Elements r2 = r2.select(r0)
            int r3 = r2.size()
            r4 = 1
            if (r3 != r4) goto L39
            java.lang.Object r2 = r2.get(r1)
            if (r2 != r5) goto L39
        L38:
            return r0
        L39:
            java.lang.StringBuilder r0 = org.jsoup.internal.StringUtil.borrowBuilder()
            r2 = r5
        L3e:
            if (r2 == 0) goto L50
            boolean r3 = r2 instanceof org.jsoup.nodes.Document
            if (r3 != 0) goto L50
            java.lang.String r3 = r2.cssSelectorComponent()
            r0.insert(r1, r3)
            org.jsoup.nodes.Element r2 = r2.parent()
            goto L3e
        L50:
            java.lang.String r0 = org.jsoup.internal.StringUtil.releaseBuilder(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Element.cssSelector():java.lang.String");
    }

    public String data() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        traverse((NodeVisitor) new C0914b(borrowBuilder, 4));
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public List<DataNode> dataNodes() {
        return filterNodes(DataNode.class);
    }

    public Map<String, String> dataset() {
        return attributes().dataset();
    }

    @Override // org.jsoup.nodes.Node
    public void doSetBaseUri(String str) {
        attributes().put(BaseUriKey, str);
    }

    public boolean elementIs(String str, String str2) {
        return this.tag.normalName().equals(str) && this.tag.namespace().equals(str2);
    }

    public int elementSiblingIndex() {
        if (parent() == null) {
            return 0;
        }
        return indexInList(this, parent().childElementsList());
    }

    public Range endSourceRange() {
        return Range.of(this, false);
    }

    @Override // org.jsoup.nodes.Node
    public List<Node> ensureChildNodes() {
        if (this.childNodes == Node.EmptyNodes) {
            this.childNodes = new NodeList(this, 4);
        }
        return this.childNodes;
    }

    public Element expectFirst(String str) {
        return (Element) Validate.ensureNotNull(Selector.selectFirst(str, this), parent() != null ? "No elements matched the query '%s' on element '%s'." : "No elements matched the query '%s' in the document.", str, tagName());
    }

    public Element firstElementChild() {
        for (Node firstChild = firstChild(); firstChild != null; firstChild = firstChild.nextSibling()) {
            if (firstChild instanceof Element) {
                return (Element) firstChild;
            }
        }
        return null;
    }

    public Element firstElementSibling() {
        return parent() != null ? parent().firstElementChild() : this;
    }

    @Deprecated
    public Element forEach(Consumer<? super Element> consumer) {
        stream().forEach(consumer);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node forEachNode(Consumer consumer) {
        return forEachNode((Consumer<? super Node>) consumer);
    }

    public Elements getAllElements() {
        return Collector.collect(new Evaluator.AllElements(), this);
    }

    public Element getElementById(String str) {
        Validate.notEmpty(str);
        Elements collect = Collector.collect(new Evaluator.Id(str), this);
        if (collect.size() > 0) {
            return collect.get(0);
        }
        return null;
    }

    public Elements getElementsByAttribute(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Attribute(str.trim()), this);
    }

    public Elements getElementsByAttributeStarting(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.AttributeStarting(str.trim()), this);
    }

    public Elements getElementsByAttributeValue(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValue(str, str2), this);
    }

    public Elements getElementsByAttributeValueContaining(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueContaining(str, str2), this);
    }

    public Elements getElementsByAttributeValueEnding(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueEnding(str, str2), this);
    }

    public Elements getElementsByAttributeValueMatching(String str, Pattern pattern) {
        return Collector.collect(new Evaluator.AttributeWithValueMatching(str, pattern), this);
    }

    public Elements getElementsByAttributeValueNot(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueNot(str, str2), this);
    }

    public Elements getElementsByAttributeValueStarting(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueStarting(str, str2), this);
    }

    public Elements getElementsByClass(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Class(str), this);
    }

    public Elements getElementsByIndexEquals(int i6) {
        return Collector.collect(new Evaluator.IndexEquals(i6), this);
    }

    public Elements getElementsByIndexGreaterThan(int i6) {
        return Collector.collect(new Evaluator.IndexGreaterThan(i6), this);
    }

    public Elements getElementsByIndexLessThan(int i6) {
        return Collector.collect(new Evaluator.IndexLessThan(i6), this);
    }

    public Elements getElementsByTag(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Tag(Normalizer.normalize(str)), this);
    }

    public Elements getElementsContainingOwnText(String str) {
        return Collector.collect(new Evaluator.ContainsOwnText(str), this);
    }

    public Elements getElementsContainingText(String str) {
        return Collector.collect(new Evaluator.ContainsText(str), this);
    }

    public Elements getElementsMatchingOwnText(Pattern pattern) {
        return Collector.collect(new Evaluator.MatchesOwn(pattern), this);
    }

    public Elements getElementsMatchingText(Pattern pattern) {
        return Collector.collect(new Evaluator.Matches(pattern), this);
    }

    @Override // org.jsoup.nodes.Node
    public boolean hasAttributes() {
        return this.attributes != null;
    }

    public boolean hasChildNodes() {
        return this.childNodes != Node.EmptyNodes;
    }

    public boolean hasClass(String str) {
        String str2;
        Attributes attributes = this.attributes;
        if (attributes == null) {
            return false;
        }
        String ignoreCase = attributes.getIgnoreCase(com.vladsch.flexmark.util.html.Attribute.CLASS_ATTR);
        int length = ignoreCase.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(ignoreCase);
            }
            int i6 = 0;
            boolean z5 = false;
            int i7 = 0;
            while (i6 < length) {
                if (!Character.isWhitespace(ignoreCase.charAt(i6))) {
                    str2 = str;
                    if (!z5) {
                        i7 = i6;
                        z5 = true;
                    }
                } else if (z5) {
                    if (i6 - i7 == length2) {
                        str2 = str;
                        if (ignoreCase.regionMatches(true, i7, str2, 0, length2)) {
                            return true;
                        }
                    } else {
                        str2 = str;
                    }
                    z5 = false;
                } else {
                    str2 = str;
                }
                i6++;
                str = str2;
            }
            String str3 = str;
            if (z5 && length - i7 == length2) {
                return ignoreCase.regionMatches(true, i7, str3, 0, length2);
            }
        }
        return false;
    }

    public boolean hasText() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        filter((NodeFilter) new C0914b(atomicBoolean, 5));
        return atomicBoolean.get();
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        html((Element) borrowBuilder);
        String releaseBuilder = StringUtil.releaseBuilder(borrowBuilder);
        return NodeUtils.outputSettings(this).prettyPrint() ? releaseBuilder.trim() : releaseBuilder;
    }

    public String id() {
        Attributes attributes = this.attributes;
        return attributes != null ? attributes.getIgnoreCase(com.vladsch.flexmark.util.html.Attribute.ID_ATTR) : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public Element insertChildren(int i6, Collection<? extends Node> collection) {
        Validate.notNull(collection, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        if (i6 < 0) {
            i6 += childNodeSize + 1;
        }
        Validate.isTrue(i6 >= 0 && i6 <= childNodeSize, "Insert position out of bounds.");
        addChildren(i6, (Node[]) new ArrayList(collection).toArray(new Node[0]));
        return this;
    }

    public boolean is(String str) {
        return is(QueryParser.parse(str));
    }

    public boolean isBlock() {
        return this.tag.isBlock();
    }

    public Element lastElementChild() {
        for (Node lastChild = lastChild(); lastChild != null; lastChild = lastChild.previousSibling()) {
            if (lastChild instanceof Element) {
                return (Element) lastChild;
            }
        }
        return null;
    }

    public Element lastElementSibling() {
        return parent() != null ? parent().lastElementChild() : this;
    }

    public Element nextElementSibling() {
        Node node = this;
        do {
            node = node.nextSibling();
            if (node == null) {
                return null;
            }
        } while (!(node instanceof Element));
        return (Element) node;
    }

    public Elements nextElementSiblings() {
        return nextElementSiblings(true);
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return this.tag.getName();
    }

    @Override // org.jsoup.nodes.Node
    public void nodelistChanged() {
        super.nodelistChanged();
        this.shadowChildrenRef = null;
    }

    @Override // org.jsoup.nodes.Node
    public String normalName() {
        return this.tag.normalName();
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i6, Document.OutputSettings outputSettings) {
        if (shouldIndent(outputSettings)) {
            if (!(appendable instanceof StringBuilder)) {
                indent(appendable, i6, outputSettings);
            } else if (((StringBuilder) appendable).length() > 0) {
                indent(appendable, i6, outputSettings);
            }
        }
        appendable.append('<').append(tagName());
        Attributes attributes = this.attributes;
        if (attributes != null) {
            attributes.html(appendable, outputSettings);
        }
        if (!this.childNodes.isEmpty() || !this.tag.isSelfClosing()) {
            appendable.append(BlockQuoteParser.MARKER_CHAR);
        } else if (outputSettings.syntax() == Document.OutputSettings.Syntax.html && this.tag.isEmpty()) {
            appendable.append(BlockQuoteParser.MARKER_CHAR);
        } else {
            appendable.append(" />");
        }
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i6, Document.OutputSettings outputSettings) {
        if (this.childNodes.isEmpty() && this.tag.isSelfClosing()) {
            return;
        }
        if (outputSettings.prettyPrint() && !this.childNodes.isEmpty() && ((this.tag.formatAsBlock() && !preserveWhitespace(this.parentNode)) || (outputSettings.outline() && (this.childNodes.size() > 1 || (this.childNodes.size() == 1 && (this.childNodes.get(0) instanceof Element)))))) {
            indent(appendable, i6, outputSettings);
        }
        appendable.append("</").append(tagName()).append(BlockQuoteParser.MARKER_CHAR);
    }

    public String ownText() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        ownText(borrowBuilder);
        return StringUtil.releaseBuilder(borrowBuilder).trim();
    }

    public Elements parents() {
        Elements elements = new Elements();
        for (Element parent = parent(); parent != null && !parent.nameIs("#root"); parent = parent.parent()) {
            elements.add(parent);
        }
        return elements;
    }

    public Element prepend(String str) {
        Validate.notNull(str);
        addChildren(0, (Node[]) NodeUtils.parser(this).parseFragmentInput(str, this, baseUri()).toArray(new Node[0]));
        return this;
    }

    public Element prependChild(Node node) {
        Validate.notNull(node);
        addChildren(0, node);
        return this;
    }

    public Element prependChildren(Collection<? extends Node> collection) {
        insertChildren(0, collection);
        return this;
    }

    public Element prependElement(String str) {
        return prependElement(str, this.tag.namespace());
    }

    public Element prependText(String str) {
        Validate.notNull(str);
        prependChild(new TextNode(str));
        return this;
    }

    public Element previousElementSibling() {
        Node node = this;
        do {
            node = node.previousSibling();
            if (node == null) {
                return null;
            }
        } while (!(node instanceof Element));
        return (Element) node;
    }

    public Elements previousElementSiblings() {
        return nextElementSiblings(false);
    }

    public Element removeClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.remove(str);
        classNames(classNames);
        return this;
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    public Element selectFirst(String str) {
        return Selector.selectFirst(str, this);
    }

    public Elements selectXpath(String str) {
        return new Elements((List<Element>) NodeUtils.selectXpath(str, this, Element.class));
    }

    public boolean shouldIndent(Document.OutputSettings outputSettings) {
        return outputSettings.prettyPrint() && isFormatAsBlock(outputSettings) && !isInlineable(outputSettings) && !preserveWhitespace(this.parentNode);
    }

    public Elements siblingElements() {
        if (this.parentNode == null) {
            return new Elements(0);
        }
        List<Element> childElementsList = parent().childElementsList();
        Elements elements = new Elements(childElementsList.size() - 1);
        for (Element element : childElementsList) {
            if (element != this) {
                elements.add(element);
            }
        }
        return elements;
    }

    public Stream<Element> stream() {
        return NodeUtils.stream(this, Element.class);
    }

    public Tag tag() {
        return this.tag;
    }

    public String tagName() {
        return this.tag.getName();
    }

    public String text() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        NodeTraversor.traverse(new TextAccumulator(borrowBuilder), this);
        return StringUtil.releaseBuilder(borrowBuilder).trim();
    }

    public List<TextNode> textNodes() {
        return filterNodes(TextNode.class);
    }

    public Element toggleClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        if (classNames.contains(str)) {
            classNames.remove(str);
        } else {
            classNames.add(str);
        }
        classNames(classNames);
        return this;
    }

    public String val() {
        if (elementIs("textarea", Parser.NamespaceHtml)) {
            return text();
        }
        return attr("value");
    }

    public String wholeOwnText() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        int childNodeSize = childNodeSize();
        for (int i6 = 0; i6 < childNodeSize; i6++) {
            appendWholeText(this.childNodes.get(i6), borrowBuilder);
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public String wholeText() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        nodeStream().forEach(new a(borrowBuilder, 0));
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public Element(String str) {
        this(Tag.valueOf(str, Parser.NamespaceHtml, ParseSettings.preserveCase), FlexmarkHtmlConverter.DEFAULT_NODE, null);
    }

    private Elements nextElementSiblings(boolean z5) {
        Elements elements = new Elements();
        if (this.parentNode == null) {
            return elements;
        }
        elements.add(this);
        return z5 ? elements.nextAll() : elements.prevAll();
    }

    public Element appendElement(String str, String str2) {
        Element element = new Element(Tag.valueOf(str, str2, NodeUtils.parser(this).settings()), baseUri());
        appendChild(element);
        return element;
    }

    @Override // org.jsoup.nodes.Node
    public Element attr(String str, String str2) {
        super.attr(str, str2);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element clearAttributes() {
        if (this.attributes != null) {
            super.clearAttributes();
            if (this.attributes.size() == 0) {
                this.attributes = null;
            }
        }
        return this;
    }

    public Element closest(Evaluator evaluator) {
        Validate.notNull(evaluator);
        Element root = root();
        Element element = this;
        while (!evaluator.lambda$asPredicate$0(root, element)) {
            element = element.parent();
            if (element == null) {
                return null;
            }
        }
        return element;
    }

    @Override // org.jsoup.nodes.Node
    public Element doClone(Node node) {
        Element element = (Element) super.doClone(node);
        Attributes attributes = this.attributes;
        element.attributes = attributes != null ? attributes.clone() : null;
        NodeList nodeList = new NodeList(element, this.childNodes.size());
        element.childNodes = nodeList;
        nodeList.addAll(this.childNodes);
        return element;
    }

    @Override // org.jsoup.nodes.Node
    public Element empty() {
        Iterator<Node> it = this.childNodes.iterator();
        while (it.hasNext()) {
            it.next().parentNode = null;
        }
        this.childNodes.clear();
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element filter(NodeFilter nodeFilter) {
        return (Element) super.filter(nodeFilter);
    }

    @Override // org.jsoup.nodes.Node
    public Element forEachNode(Consumer<? super Node> consumer) {
        return (Element) super.forEachNode(consumer);
    }

    public Elements getElementsByAttributeValueMatching(String str, String str2) {
        try {
            return getElementsByAttributeValueMatching(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e6) {
            throw new IllegalArgumentException(AbstractC1135a.f("Pattern syntax error: ", str2), e6);
        }
    }

    public Elements getElementsMatchingOwnText(String str) {
        try {
            return getElementsMatchingOwnText(Pattern.compile(str));
        } catch (PatternSyntaxException e6) {
            throw new IllegalArgumentException(AbstractC1135a.f("Pattern syntax error: ", str), e6);
        }
    }

    public Elements getElementsMatchingText(String str) {
        try {
            return getElementsMatchingText(Pattern.compile(str));
        } catch (PatternSyntaxException e6) {
            throw new IllegalArgumentException(AbstractC1135a.f("Pattern syntax error: ", str), e6);
        }
    }

    public Element id(String str) {
        Validate.notNull(str);
        attr(com.vladsch.flexmark.util.html.Attribute.ID_ATTR, str);
        return this;
    }

    public boolean is(Evaluator evaluator) {
        return evaluator.lambda$asPredicate$0(root(), this);
    }

    @Override // org.jsoup.nodes.Node
    public final Element parent() {
        return (Element) this.parentNode;
    }

    public Element prependElement(String str, String str2) {
        Element element = new Element(Tag.valueOf(str, str2, NodeUtils.parser(this).settings()), baseUri());
        prependChild(element);
        return element;
    }

    @Override // org.jsoup.nodes.Node
    public Element removeAttr(String str) {
        return (Element) super.removeAttr(str);
    }

    @Override // org.jsoup.nodes.Node
    public Element root() {
        return (Element) super.root();
    }

    public Elements select(Evaluator evaluator) {
        return Selector.select(evaluator, this);
    }

    public Element selectFirst(Evaluator evaluator) {
        return Collector.findFirst(evaluator, this);
    }

    public <T extends Node> List<T> selectXpath(String str, Class<T> cls) {
        return NodeUtils.selectXpath(str, this, cls);
    }

    @Override // org.jsoup.nodes.Node
    public Element shallowClone() {
        String baseUri = baseUri();
        if (baseUri.isEmpty()) {
            baseUri = null;
        }
        Tag tag = this.tag;
        Attributes attributes = this.attributes;
        return new Element(tag, baseUri, attributes != null ? attributes.clone() : null);
    }

    public Element tagName(String str) {
        return tagName(str, this.tag.namespace());
    }

    @Override // org.jsoup.nodes.Node
    public Element traverse(NodeVisitor nodeVisitor) {
        return (Element) super.traverse(nodeVisitor);
    }

    @Override // org.jsoup.nodes.Node
    public Element wrap(String str) {
        return (Element) super.wrap(str);
    }

    public Element(Tag tag, String str, Attributes attributes) {
        Validate.notNull(tag);
        this.childNodes = Node.EmptyNodes;
        this.attributes = attributes;
        this.tag = tag;
        if (str != null) {
            setBaseUri(str);
        }
    }

    @Override // org.jsoup.nodes.Node
    public Element after(String str) {
        return (Element) super.after(str);
    }

    public Element attr(String str, boolean z5) {
        attributes().put(str, z5);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element before(String str) {
        return (Element) super.before(str);
    }

    @Override // org.jsoup.nodes.Node
    public Element clone() {
        return (Element) super.clone();
    }

    public Element tagName(String str, String str2) {
        Validate.notEmptyParam(str, "tagName");
        Validate.notEmptyParam(str2, "namespace");
        this.tag = Tag.valueOf(str, str2, NodeUtils.parser(this).settings());
        return this;
    }

    private void ownText(StringBuilder sb) {
        for (int i6 = 0; i6 < childNodeSize(); i6++) {
            Node node = this.childNodes.get(i6);
            if (node instanceof TextNode) {
                appendNormalisedText(sb, (TextNode) node);
            } else if (node.nameIs(FlexmarkHtmlConverter.BR_NODE) && !TextNode.lastCharIsWhitespace(sb)) {
                sb.append(SequenceUtils.SPACE);
            }
        }
    }

    @Override // org.jsoup.nodes.Node
    public Element after(Node node) {
        return (Element) super.after(node);
    }

    @Override // org.jsoup.nodes.Node
    public Element before(Node node) {
        return (Element) super.before(node);
    }

    public Element classNames(Set<String> set) {
        Validate.notNull(set);
        if (set.isEmpty()) {
            attributes().remove(com.vladsch.flexmark.util.html.Attribute.CLASS_ATTR);
            return this;
        }
        attributes().put(com.vladsch.flexmark.util.html.Attribute.CLASS_ATTR, StringUtil.join(set, SequenceUtils.SPACE));
        return this;
    }

    public Element text(String str) {
        Validate.notNull(str);
        empty();
        Document ownerDocument = ownerDocument();
        if (ownerDocument != null && ownerDocument.parser().isContentForTagData(normalName())) {
            appendChild(new DataNode(str));
            return this;
        }
        appendChild(new TextNode(str));
        return this;
    }

    public Element val(String str) {
        if (elementIs("textarea", Parser.NamespaceHtml)) {
            text(str);
            return this;
        }
        attr("value", str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public <T extends Appendable> T html(T t5) {
        int size = this.childNodes.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.childNodes.get(i6).outerHtml(t5);
        }
        return t5;
    }

    public Element html(String str) {
        empty();
        append(str);
        return this;
    }

    public Element insertChildren(int i6, Node... nodeArr) {
        Validate.notNull(nodeArr, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        if (i6 < 0) {
            i6 += childNodeSize + 1;
        }
        Validate.isTrue(i6 >= 0 && i6 <= childNodeSize, "Insert position out of bounds.");
        addChildren(i6, nodeArr);
        return this;
    }

    public Element(Tag tag, String str) {
        this(tag, str, null);
    }
}
