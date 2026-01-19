package org.jsoup.parser;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.HtmlTreeBuilderState;
import org.jsoup.parser.Token;

/* loaded from: classes.dex */
public class HtmlTreeBuilder extends TreeBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int MaxScopeSearchDepth = 100;
    private static final int maxQueueDepth = 256;
    private static final int maxUsedFormattingElements = 12;
    private boolean baseUriSetFromDoc;
    private Element contextElement;
    private Token.EndTag emptyEnd;
    private FormElement formElement;
    private ArrayList<Element> formattingElements;
    private boolean fosterInserts;
    private boolean fragmentParsing;
    private boolean framesetOk;
    private Element headElement;
    private HtmlTreeBuilderState originalState;
    private List<Token.Character> pendingTableCharacters;
    private final String[] specificScopeTarget = {null};
    private HtmlTreeBuilderState state;
    private ArrayList<HtmlTreeBuilderState> tmplInsertMode;
    static final String[] TagsSearchInScope = {"applet", FlexmarkHtmlConverter.CAPTION_NODE, "html", "marquee", "object", FlexmarkHtmlConverter.TABLE_NODE, FlexmarkHtmlConverter.TD_NODE, FlexmarkHtmlConverter.TH_NODE};
    static final String[] TagSearchList = {FlexmarkHtmlConverter.OL_NODE, FlexmarkHtmlConverter.UL_NODE};
    static final String[] TagSearchButton = {"button"};
    static final String[] TagSearchTableScope = {"html", FlexmarkHtmlConverter.TABLE_NODE};
    static final String[] TagSearchSelectScope = {"optgroup", "option"};
    static final String[] TagSearchEndTags = {FlexmarkHtmlConverter.DD_NODE, FlexmarkHtmlConverter.DT_NODE, FlexmarkHtmlConverter.LI_NODE, "optgroup", "option", FlexmarkHtmlConverter.P_NODE, "rb", "rp", "rt", "rtc"};
    static final String[] TagThoroughSearchEndTags = {FlexmarkHtmlConverter.CAPTION_NODE, "colgroup", FlexmarkHtmlConverter.DD_NODE, FlexmarkHtmlConverter.DT_NODE, FlexmarkHtmlConverter.LI_NODE, "optgroup", "option", FlexmarkHtmlConverter.P_NODE, "rb", "rp", "rt", "rtc", FlexmarkHtmlConverter.TBODY_NODE, FlexmarkHtmlConverter.TD_NODE, "tfoot", FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TR_NODE};
    static final String[] TagSearchSpecial = {"address", "applet", "area", "article", FlexmarkHtmlConverter.ASIDE_NODE, "base", "basefont", "bgsound", FlexmarkHtmlConverter.BLOCKQUOTE_NODE, "body", FlexmarkHtmlConverter.BR_NODE, "button", FlexmarkHtmlConverter.CAPTION_NODE, "center", "col", "colgroup", "command", FlexmarkHtmlConverter.DD_NODE, "details", "dir", FlexmarkHtmlConverter.DIV_NODE, FlexmarkHtmlConverter.DL_NODE, FlexmarkHtmlConverter.DT_NODE, "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", FlexmarkHtmlConverter.H1_NODE, FlexmarkHtmlConverter.H2_NODE, FlexmarkHtmlConverter.H3_NODE, FlexmarkHtmlConverter.H4_NODE, FlexmarkHtmlConverter.H5_NODE, FlexmarkHtmlConverter.H6_NODE, "head", "header", "hgroup", FlexmarkHtmlConverter.HR_NODE, "html", "iframe", FlexmarkHtmlConverter.IMG_NODE, FlexmarkHtmlConverter.INPUT_NODE, "isindex", FlexmarkHtmlConverter.LI_NODE, "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", FlexmarkHtmlConverter.OL_NODE, FlexmarkHtmlConverter.P_NODE, "param", "plaintext", FlexmarkHtmlConverter.PRE_NODE, "script", "section", "select", Attribute.STYLE_ATTR, "summary", FlexmarkHtmlConverter.TABLE_NODE, FlexmarkHtmlConverter.TBODY_NODE, FlexmarkHtmlConverter.TD_NODE, "textarea", "tfoot", FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.THEAD_NODE, Attribute.TITLE_ATTR, FlexmarkHtmlConverter.TR_NODE, FlexmarkHtmlConverter.UL_NODE, "wbr", "xmp"};
    static final String[] TagMathMlTextIntegration = {"mi", "mn", "mo", "ms", "mtext"};
    static final String[] TagSvgHtmlIntegration = {"desc", "foreignObject", Attribute.TITLE_ATTR};

    private void clearStackToContext(String... strArr) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element element = this.stack.get(size);
            if (Parser.NamespaceHtml.equals(element.tag().namespace()) && (StringUtil.in(element.normalName(), strArr) || element.nameIs("html"))) {
                return;
            }
            pop();
        }
    }

    private void doInsertElement(Element element, Token token) {
        FormElement formElement;
        if (element.tag().isFormListed() && (formElement = this.formElement) != null) {
            formElement.addElement(element);
        }
        if (element.hasAttr("xmlns") && !element.attr("xmlns").equals(element.tag().namespace())) {
            error("Invalid xmlns attribute [%s] on tag [%s]", element.attr("xmlns"), element.tagName());
        }
        if (isFosterInserts() && StringUtil.inSorted(currentElement().normalName(), HtmlTreeBuilderState.Constants.InTableFoster)) {
            insertInFosterParent(element);
        } else {
            currentElement().appendChild(element);
        }
        push(element);
    }

    private boolean inSpecificScope(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.specificScopeTarget;
        strArr3[0] = str;
        return inSpecificScope(strArr3, strArr, strArr2);
    }

    public static boolean isHtmlIntegration(Element element) {
        if (Parser.NamespaceMathml.equals(element.tag().namespace()) && element.nameIs("annotation-xml")) {
            String normalize = Normalizer.normalize(element.attr("encoding"));
            if (normalize.equals("text/html") || normalize.equals("application/xhtml+xml")) {
                return true;
            }
        }
        return Parser.NamespaceSvg.equals(element.tag().namespace()) && StringUtil.in(element.tagName(), TagSvgHtmlIntegration);
    }

    public static boolean isMathmlTextIntegration(Element element) {
        return Parser.NamespaceMathml.equals(element.tag().namespace()) && StringUtil.inSorted(element.normalName(), TagMathMlTextIntegration);
    }

    private static boolean isSameFormattingElement(Element element, Element element2) {
        return element.normalName().equals(element2.normalName()) && element.attributes().equals(element2.attributes());
    }

    public static boolean isSpecial(Element element) {
        return StringUtil.inSorted(element.normalName(), TagSearchSpecial);
    }

    private static void replaceInQueue(ArrayList<Element> arrayList, Element element, Element element2) {
        int lastIndexOf = arrayList.lastIndexOf(element);
        Validate.isTrue(lastIndexOf != -1);
        arrayList.set(lastIndexOf, element2);
    }

    public Element aboveOnStack(Element element) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            if (this.stack.get(size) == element) {
                return this.stack.get(size - 1);
            }
        }
        return null;
    }

    public void addPendingTableCharacters(Token.Character character) {
        this.pendingTableCharacters.add(character.clone());
    }

    public void checkActiveFormattingElements(Element element) {
        int size = this.formattingElements.size();
        int i6 = size - 13;
        int i7 = 0;
        if (i6 < 0) {
            i6 = 0;
        }
        for (int i8 = size - 1; i8 >= i6; i8--) {
            Element element2 = this.formattingElements.get(i8);
            if (element2 == null) {
                return;
            }
            if (isSameFormattingElement(element, element2)) {
                i7++;
            }
            if (i7 == 3) {
                this.formattingElements.remove(i8);
                return;
            }
        }
    }

    public void clearFormattingElementsToLastMarker() {
        while (!this.formattingElements.isEmpty() && removeLastFormattingElement() != null) {
        }
    }

    public void clearStackToTableBodyContext() {
        clearStackToContext(FlexmarkHtmlConverter.TBODY_NODE, "tfoot", FlexmarkHtmlConverter.THEAD_NODE, "template");
    }

    public void clearStackToTableContext() {
        clearStackToContext(FlexmarkHtmlConverter.TABLE_NODE, "template");
    }

    public void clearStackToTableRowContext() {
        clearStackToContext(FlexmarkHtmlConverter.TR_NODE, "template");
    }

    public void closeElement(String str) {
        generateImpliedEndTags(str);
        if (!str.equals(currentElement().normalName())) {
            error(state());
        }
        popStackToClose(str);
    }

    public Element createElementFor(Token.StartTag startTag, String str, boolean z5) {
        Attributes attributes = startTag.attributes;
        if (!z5) {
            attributes = this.settings.normalizeAttributes(attributes);
        }
        if (attributes != null && !attributes.isEmpty() && attributes.deduplicate(this.settings) > 0) {
            error("Dropped duplicate attribute(s) in tag [%s]", startTag.normalName);
        }
        Tag tagFor = tagFor(startTag.tagName, str, z5 ? ParseSettings.preserveCase : this.settings);
        return tagFor.normalName().equals("form") ? new FormElement(tagFor, null, attributes) : new Element(tagFor, null, attributes);
    }

    public HtmlTreeBuilderState currentTemplateMode() {
        if (this.tmplInsertMode.size() <= 0) {
            return null;
        }
        return this.tmplInsertMode.get(r0.size() - 1);
    }

    @Override // org.jsoup.parser.TreeBuilder
    public ParseSettings defaultSettings() {
        return ParseSettings.htmlDefault;
    }

    public void error(HtmlTreeBuilderState htmlTreeBuilderState) {
        if (this.parser.getErrors().canAddError()) {
            this.parser.getErrors().add(new ParseError(this.reader, "Unexpected %s token [%s] when in state [%s]", this.currentToken.tokenType(), this.currentToken, htmlTreeBuilderState));
        }
    }

    public void framesetOk(boolean z5) {
        this.framesetOk = z5;
    }

    public void generateImpliedEndTags(String str) {
        while (StringUtil.inSorted(currentElement().normalName(), TagSearchEndTags)) {
            if (str != null && currentElementIs(str)) {
                return;
            } else {
                pop();
            }
        }
    }

    public Element getActiveFormattingElement(String str) {
        for (int size = this.formattingElements.size() - 1; size >= 0; size--) {
            Element element = this.formattingElements.get(size);
            if (element == null) {
                return null;
            }
            if (element.nameIs(str)) {
                return element;
            }
        }
        return null;
    }

    public String getBaseUri() {
        return this.baseUri;
    }

    public Document getDocument() {
        return this.doc;
    }

    public FormElement getFormElement() {
        return this.formElement;
    }

    public Element getFromStack(String str) {
        int size = this.stack.size();
        int i6 = size - 1;
        int i7 = i6 >= 256 ? size - 257 : 0;
        while (i6 >= i7) {
            Element element = this.stack.get(i6);
            if (element.elementIs(str, Parser.NamespaceHtml)) {
                return element;
            }
            i6--;
        }
        return null;
    }

    public Element getHeadElement() {
        return this.headElement;
    }

    public List<Token.Character> getPendingTableCharacters() {
        return this.pendingTableCharacters;
    }

    public ArrayList<Element> getStack() {
        return this.stack;
    }

    public boolean inButtonScope(String str) {
        return inScope(str, TagSearchButton);
    }

    public boolean inListItemScope(String str) {
        return inScope(str, TagSearchList);
    }

    public boolean inScope(String[] strArr) {
        return inSpecificScope(strArr, TagsSearchInScope, (String[]) null);
    }

    public boolean inSelectScope(String str) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            String normalName = this.stack.get(size).normalName();
            if (normalName.equals(str)) {
                return true;
            }
            if (!StringUtil.inSorted(normalName, TagSearchSelectScope)) {
                return false;
            }
        }
        Validate.fail("Should not be reachable");
        return false;
    }

    public boolean inTableScope(String str) {
        return inSpecificScope(str, TagSearchTableScope, (String[]) null);
    }

    @Override // org.jsoup.parser.TreeBuilder
    public void initialiseParse(Reader reader, String str, Parser parser) {
        super.initialiseParse(reader, str, parser);
        this.state = HtmlTreeBuilderState.Initial;
        this.originalState = null;
        this.baseUriSetFromDoc = false;
        this.headElement = null;
        this.formElement = null;
        this.contextElement = null;
        this.formattingElements = new ArrayList<>();
        this.tmplInsertMode = new ArrayList<>();
        this.pendingTableCharacters = new ArrayList();
        this.emptyEnd = new Token.EndTag(this);
        this.framesetOk = true;
        this.fosterInserts = false;
        this.fragmentParsing = false;
    }

    public void insertCharacterNode(Token.Character character) {
        insertCharacterToElement(character, currentElement());
    }

    public void insertCharacterToElement(Token.Character character, Element element) {
        String normalName = element.normalName();
        String data = character.getData();
        Node cDataNode = character.isCData() ? new CDataNode(data) : isContentForTagData(normalName) ? new DataNode(data) : new TextNode(data);
        element.appendChild(cDataNode);
        onNodeInserted(cDataNode);
    }

    public void insertCommentNode(Token.Comment comment) {
        Comment comment2 = new Comment(comment.getData());
        currentElement().appendChild(comment2);
        onNodeInserted(comment2);
    }

    public Element insertElementFor(Token.StartTag startTag) {
        Element createElementFor = createElementFor(startTag, Parser.NamespaceHtml, false);
        doInsertElement(createElementFor, startTag);
        if (startTag.isSelfClosing()) {
            Tag tag = createElementFor.tag();
            if (!tag.isKnownTag()) {
                tag.setSelfClosing();
            } else if (!tag.isEmpty()) {
                this.tokeniser.error("Tag [%s] cannot be self closing; not a void tag", tag.normalName());
            }
            this.tokeniser.transition(TokeniserState.Data);
            this.tokeniser.emit(this.emptyEnd.reset().name(createElementFor.tagName()));
        }
        return createElementFor;
    }

    public Element insertEmptyElementFor(Token.StartTag startTag) {
        Element createElementFor = createElementFor(startTag, Parser.NamespaceHtml, false);
        doInsertElement(createElementFor, startTag);
        pop();
        return createElementFor;
    }

    public Element insertForeignElementFor(Token.StartTag startTag, String str) {
        Element createElementFor = createElementFor(startTag, str, true);
        doInsertElement(createElementFor, startTag);
        if (startTag.isSelfClosing()) {
            createElementFor.tag().setSelfClosing();
            pop();
        }
        return createElementFor;
    }

    public FormElement insertFormElement(Token.StartTag startTag, boolean z5, boolean z6) {
        FormElement formElement = (FormElement) createElementFor(startTag, Parser.NamespaceHtml, false);
        if (!z6) {
            setFormElement(formElement);
        } else if (!onStack("template")) {
            setFormElement(formElement);
        }
        doInsertElement(formElement, startTag);
        if (!z5) {
            pop();
        }
        return formElement;
    }

    public void insertInFosterParent(Node node) {
        Element element;
        Element fromStack = getFromStack(FlexmarkHtmlConverter.TABLE_NODE);
        boolean z5 = false;
        if (fromStack == null) {
            element = this.stack.get(0);
        } else if (fromStack.parent() != null) {
            element = fromStack.parent();
            z5 = true;
        } else {
            element = aboveOnStack(fromStack);
        }
        if (!z5) {
            element.appendChild(node);
        } else {
            Validate.notNull(fromStack);
            fromStack.before(node);
        }
    }

    public void insertMarkerToFormattingElements() {
        this.formattingElements.add(null);
    }

    public void insertOnStackAfter(Element element, Element element2) {
        int lastIndexOf = this.stack.lastIndexOf(element);
        Validate.isTrue(lastIndexOf != -1);
        this.stack.add(lastIndexOf + 1, element2);
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean isContentForTagData(String str) {
        return str.equals("script") || str.equals(Attribute.STYLE_ATTR);
    }

    public boolean isFosterInserts() {
        return this.fosterInserts;
    }

    public boolean isFragmentParsing() {
        return this.fragmentParsing;
    }

    public boolean isInActiveFormattingElements(Element element) {
        return onStack(this.formattingElements, element);
    }

    public Element lastFormattingElement() {
        if (this.formattingElements.size() <= 0) {
            return null;
        }
        return this.formattingElements.get(r0.size() - 1);
    }

    public void markInsertionMode() {
        this.originalState = this.state;
    }

    public void maybeSetBaseUri(Element element) {
        if (this.baseUriSetFromDoc) {
            return;
        }
        String absUrl = element.absUrl("href");
        if (absUrl.length() != 0) {
            this.baseUri = absUrl;
            this.baseUriSetFromDoc = true;
            this.doc.setBaseUri(absUrl);
        }
    }

    public boolean onStack(Element element) {
        return onStack(this.stack, element);
    }

    public boolean onStackNot(String[] strArr) {
        int size = this.stack.size();
        int i6 = size - 1;
        int i7 = i6 > 100 ? size - 101 : 0;
        while (i6 >= i7) {
            if (!StringUtil.inSorted(this.stack.get(i6).normalName(), strArr)) {
                return true;
            }
            i6--;
        }
        return false;
    }

    public HtmlTreeBuilderState originalState() {
        return this.originalState;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0099, code lost:
    
        if (r0.equals("iframe") == false) goto L9;
     */
    @Override // org.jsoup.parser.TreeBuilder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<org.jsoup.nodes.Node> parseFragment(java.lang.String r3, org.jsoup.nodes.Element r4, java.lang.String r5, org.jsoup.parser.Parser r6) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.Parser):java.util.List");
    }

    public Element popStackToClose(String str) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element pop = pop();
            if (pop.elementIs(str, Parser.NamespaceHtml)) {
                return pop;
            }
        }
        return null;
    }

    public Element popStackToCloseAnyNamespace(String str) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element pop = pop();
            if (pop.nameIs(str)) {
                return pop;
            }
        }
        return null;
    }

    public HtmlTreeBuilderState popTemplateMode() {
        if (this.tmplInsertMode.size() <= 0) {
            return null;
        }
        return this.tmplInsertMode.remove(r0.size() - 1);
    }

    public int positionOfElement(Element element) {
        for (int i6 = 0; i6 < this.formattingElements.size(); i6++) {
            if (element == this.formattingElements.get(i6)) {
                return i6;
            }
        }
        return -1;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean process(Token token) {
        return (useCurrentOrForeignInsert(token) ? this.state : HtmlTreeBuilderState.ForeignContent).process(token, this);
    }

    public void pushActiveFormattingElements(Element element) {
        checkActiveFormattingElements(element);
        this.formattingElements.add(element);
    }

    public void pushTemplateMode(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.tmplInsertMode.add(htmlTreeBuilderState);
    }

    public void pushWithBookmark(Element element, int i6) {
        checkActiveFormattingElements(element);
        try {
            this.formattingElements.add(i6, element);
        } catch (IndexOutOfBoundsException unused) {
            this.formattingElements.add(element);
        }
    }

    public void reconstructFormattingElements() {
        Element lastFormattingElement;
        if (this.stack.size() > 256 || (lastFormattingElement = lastFormattingElement()) == null || onStack(lastFormattingElement)) {
            return;
        }
        int size = this.formattingElements.size();
        int i6 = size - 12;
        if (i6 < 0) {
            i6 = 0;
        }
        boolean z5 = true;
        int i7 = size - 1;
        int i8 = i7;
        while (i8 != i6) {
            i8--;
            lastFormattingElement = this.formattingElements.get(i8);
            if (lastFormattingElement == null || onStack(lastFormattingElement)) {
                z5 = false;
                break;
            }
        }
        while (true) {
            if (!z5) {
                i8++;
                lastFormattingElement = this.formattingElements.get(i8);
            }
            Validate.notNull(lastFormattingElement);
            Element element = new Element(tagFor(lastFormattingElement.normalName(), this.settings), null, lastFormattingElement.attributes().clone());
            doInsertElement(element, null);
            this.formattingElements.set(i8, element);
            if (i8 == i7) {
                return;
            } else {
                z5 = false;
            }
        }
    }

    public void removeFromActiveFormattingElements(Element element) {
        for (int size = this.formattingElements.size() - 1; size >= 0; size--) {
            if (this.formattingElements.get(size) == element) {
                this.formattingElements.remove(size);
                return;
            }
        }
    }

    public boolean removeFromStack(Element element) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            if (this.stack.get(size) == element) {
                this.stack.remove(size);
                onNodeClosed(element);
                return true;
            }
        }
        return false;
    }

    public Element removeLastFormattingElement() {
        int size = this.formattingElements.size();
        if (size > 0) {
            return this.formattingElements.remove(size - 1);
        }
        return null;
    }

    public void replaceActiveFormattingElement(Element element, Element element2) {
        replaceInQueue(this.formattingElements, element, element2);
    }

    public void replaceOnStack(Element element, Element element2) {
        replaceInQueue(this.stack, element, element2);
    }

    public void resetBody() {
        if (!onStack("body")) {
            this.stack.add(this.doc.body());
        }
        transition(HtmlTreeBuilderState.InBody);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0058. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x0116. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean resetInsertionMode() {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode():boolean");
    }

    public void resetPendingTableCharacters() {
        this.pendingTableCharacters.clear();
    }

    public void setFormElement(FormElement formElement) {
        this.formElement = formElement;
    }

    public void setFosterInserts(boolean z5) {
        this.fosterInserts = z5;
    }

    public void setHeadElement(Element element) {
        this.headElement = element;
    }

    public HtmlTreeBuilderState state() {
        return this.state;
    }

    public int templateModeSize() {
        return this.tmplInsertMode.size();
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.currentToken + ", state=" + this.state + ", currentElement=" + currentElement() + '}';
    }

    public void transition(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.state = htmlTreeBuilderState;
    }

    public boolean useCurrentOrForeignInsert(Token token) {
        if (this.stack.isEmpty()) {
            return true;
        }
        Element currentElement = currentElement();
        String namespace = currentElement.tag().namespace();
        if (Parser.NamespaceHtml.equals(namespace)) {
            return true;
        }
        if (isMathmlTextIntegration(currentElement) && ((token.isStartTag() && !"mglyph".equals(token.asStartTag().normalName) && !"malignmark".equals(token.asStartTag().normalName)) || token.isCharacter())) {
            return true;
        }
        if (Parser.NamespaceMathml.equals(namespace) && currentElement.nameIs("annotation-xml") && token.isStartTag() && FlexmarkHtmlConverter.SVG_NODE.equals(token.asStartTag().normalName)) {
            return true;
        }
        if (isHtmlIntegration(currentElement) && (token.isStartTag() || token.isCharacter())) {
            return true;
        }
        return token.isEOF();
    }

    public boolean framesetOk() {
        return this.framesetOk;
    }

    public boolean inScope(String str) {
        return inScope(str, null);
    }

    @Override // org.jsoup.parser.TreeBuilder
    public HtmlTreeBuilder newInstance() {
        return new HtmlTreeBuilder();
    }

    public boolean onStack(String str) {
        return getFromStack(str) != null;
    }

    private boolean inSpecificScope(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.stack.size();
        int i6 = size - 1;
        int i7 = i6 > 100 ? size - 101 : 0;
        while (i6 >= i7) {
            Element element = this.stack.get(i6);
            if (element.tag().namespace().equals(Parser.NamespaceHtml)) {
                String normalName = element.normalName();
                if (StringUtil.inSorted(normalName, strArr)) {
                    return true;
                }
                if (StringUtil.inSorted(normalName, strArr2)) {
                    return false;
                }
                if (strArr3 != null && StringUtil.inSorted(normalName, strArr3)) {
                    return false;
                }
            }
            i6--;
        }
        return false;
    }

    private static boolean onStack(ArrayList<Element> arrayList, Element element) {
        int size = arrayList.size();
        int i6 = size - 1;
        int i7 = i6 >= 256 ? size - 257 : 0;
        while (i6 >= i7) {
            if (arrayList.get(i6) == element) {
                return true;
            }
            i6--;
        }
        return false;
    }

    public boolean inScope(String str, String[] strArr) {
        return inSpecificScope(str, TagsSearchInScope, strArr);
    }

    public boolean process(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        return htmlTreeBuilderState.process(token, this);
    }

    public void generateImpliedEndTags() {
        generateImpliedEndTags(false);
    }

    public void popStackToClose(String... strArr) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element pop = pop();
            if (StringUtil.inSorted(pop.normalName(), strArr) && Parser.NamespaceHtml.equals(pop.tag().namespace())) {
                return;
            }
        }
    }

    public void generateImpliedEndTags(boolean z5) {
        String[] strArr = z5 ? TagThoroughSearchEndTags : TagSearchEndTags;
        while (Parser.NamespaceHtml.equals(currentElement().tag().namespace()) && StringUtil.inSorted(currentElement().normalName(), strArr)) {
            pop();
        }
    }
}
