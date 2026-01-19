package org.jsoup.nodes;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;

/* loaded from: classes.dex */
public class Document extends Element {
    private static final Evaluator titleEval = new Evaluator.Tag(com.vladsch.flexmark.util.html.Attribute.TITLE_ATTR);
    private Connection connection;
    private final String location;
    private OutputSettings outputSettings;
    private Parser parser;
    private QuirksMode quirksMode;
    private boolean updateMetaCharset;

    /* loaded from: classes.dex */
    public static class OutputSettings implements Cloneable {
        private Charset charset;
        Entities.CoreCharset coreCharset;
        private Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        private final ThreadLocal<CharsetEncoder> encoderThreadLocal = new ThreadLocal<>();
        private boolean prettyPrint = true;
        private boolean outline = false;
        private int indentAmount = 1;
        private int maxPaddingWidth = 30;
        private Syntax syntax = Syntax.html;

        /* loaded from: classes.dex */
        public enum Syntax {
            html,
            xml
        }

        public OutputSettings() {
            charset(DataUtil.UTF_8);
        }

        public Charset charset() {
            return this.charset;
        }

        public CharsetEncoder encoder() {
            CharsetEncoder charsetEncoder = this.encoderThreadLocal.get();
            return charsetEncoder != null ? charsetEncoder : prepareEncoder();
        }

        public Entities.EscapeMode escapeMode() {
            return this.escapeMode;
        }

        public int indentAmount() {
            return this.indentAmount;
        }

        public int maxPaddingWidth() {
            return this.maxPaddingWidth;
        }

        public boolean outline() {
            return this.outline;
        }

        public CharsetEncoder prepareEncoder() {
            CharsetEncoder newEncoder = this.charset.newEncoder();
            this.encoderThreadLocal.set(newEncoder);
            return newEncoder;
        }

        public boolean prettyPrint() {
            return this.prettyPrint;
        }

        public Syntax syntax() {
            return this.syntax;
        }

        public OutputSettings charset(Charset charset) {
            this.charset = charset;
            this.coreCharset = Entities.CoreCharset.byName(charset.name());
            return this;
        }

        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.charset(this.charset.name());
                outputSettings.escapeMode = Entities.EscapeMode.valueOf(this.escapeMode.name());
                return outputSettings;
            } catch (CloneNotSupportedException e6) {
                throw new RuntimeException(e6);
            }
        }

        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {
            this.escapeMode = escapeMode;
            return this;
        }

        public OutputSettings indentAmount(int i6) {
            Validate.isTrue(i6 >= 0);
            this.indentAmount = i6;
            return this;
        }

        public OutputSettings maxPaddingWidth(int i6) {
            Validate.isTrue(i6 >= -1);
            this.maxPaddingWidth = i6;
            return this;
        }

        public OutputSettings outline(boolean z5) {
            this.outline = z5;
            return this;
        }

        public OutputSettings prettyPrint(boolean z5) {
            this.prettyPrint = z5;
            return this;
        }

        public OutputSettings syntax(Syntax syntax) {
            this.syntax = syntax;
            if (syntax == Syntax.xml) {
                escapeMode(Entities.EscapeMode.xhtml);
            }
            return this;
        }

        public OutputSettings charset(String str) {
            charset(Charset.forName(str));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str, String str2) {
        super(Tag.valueOf("#root", str, ParseSettings.htmlDefault), str2);
        this.outputSettings = new OutputSettings();
        this.quirksMode = QuirksMode.noQuirks;
        this.updateMetaCharset = false;
        this.location = str2;
        this.parser = Parser.htmlParser();
    }

    public static Document createShell(String str) {
        Validate.notNull(str);
        Document document = new Document(str);
        document.parser = document.parser();
        Element appendElement = document.appendElement("html");
        appendElement.appendElement("head");
        appendElement.appendElement("body");
        return document;
    }

    private void ensureMetaCharsetElement() {
        if (this.updateMetaCharset) {
            OutputSettings.Syntax syntax = outputSettings().syntax();
            if (syntax == OutputSettings.Syntax.html) {
                Element selectFirst = selectFirst("meta[charset]");
                if (selectFirst != null) {
                    selectFirst.attr("charset", charset().displayName());
                } else {
                    head().appendElement("meta").attr("charset", charset().displayName());
                }
                select("meta[name=charset]").remove();
                return;
            }
            if (syntax == OutputSettings.Syntax.xml) {
                Node node = ensureChildNodes().get(0);
                if (!(node instanceof XmlDeclaration)) {
                    XmlDeclaration xmlDeclaration = new XmlDeclaration("xml", false);
                    xmlDeclaration.attr("version", "1.0");
                    xmlDeclaration.attr("encoding", charset().displayName());
                    prependChild(xmlDeclaration);
                    return;
                }
                XmlDeclaration xmlDeclaration2 = (XmlDeclaration) node;
                if (xmlDeclaration2.name().equals("xml")) {
                    xmlDeclaration2.attr("encoding", charset().displayName());
                    if (xmlDeclaration2.hasAttr("version")) {
                        xmlDeclaration2.attr("version", "1.0");
                        return;
                    }
                    return;
                }
                XmlDeclaration xmlDeclaration3 = new XmlDeclaration("xml", false);
                xmlDeclaration3.attr("version", "1.0");
                xmlDeclaration3.attr("encoding", charset().displayName());
                prependChild(xmlDeclaration3);
            }
        }
    }

    private Element htmlEl() {
        for (Element firstElementChild = firstElementChild(); firstElementChild != null; firstElementChild = firstElementChild.nextElementSibling()) {
            if (firstElementChild.nameIs("html")) {
                return firstElementChild;
            }
        }
        return appendElement("html");
    }

    public Element body() {
        Element htmlEl = htmlEl();
        for (Element firstElementChild = htmlEl.firstElementChild(); firstElementChild != null; firstElementChild = firstElementChild.nextElementSibling()) {
            if (firstElementChild.nameIs("body") || firstElementChild.nameIs("frameset")) {
                return firstElementChild;
            }
        }
        return htmlEl.appendElement("body");
    }

    public void charset(Charset charset) {
        updateMetaCharsetElement(true);
        this.outputSettings.charset(charset);
        ensureMetaCharsetElement();
    }

    public Connection connection() {
        Connection connection = this.connection;
        return connection == null ? Jsoup.newSession() : connection;
    }

    public Element createElement(String str) {
        return new Element(Tag.valueOf(str, this.parser.defaultNamespace(), ParseSettings.preserveCase), baseUri());
    }

    public DocumentType documentType() {
        for (Node node : this.childNodes) {
            if (node instanceof DocumentType) {
                return (DocumentType) node;
            }
            if (!(node instanceof LeafNode)) {
                return null;
            }
        }
        return null;
    }

    public FormElement expectForm(String str) {
        Elements select = select(str);
        int size = select.size();
        int i6 = 0;
        while (i6 < size) {
            Element element = select.get(i6);
            i6++;
            Element element2 = element;
            if (element2 instanceof FormElement) {
                return (FormElement) element2;
            }
        }
        Validate.fail("No form elements matched the query '%s' in the document.", str);
        return null;
    }

    public List<FormElement> forms() {
        return select("form").forms();
    }

    public Element head() {
        Element htmlEl = htmlEl();
        for (Element firstElementChild = htmlEl.firstElementChild(); firstElementChild != null; firstElementChild = firstElementChild.nextElementSibling()) {
            if (firstElementChild.nameIs("head")) {
                return firstElementChild;
            }
        }
        return htmlEl.prependElement("head");
    }

    public String location() {
        return this.location;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public String nodeName() {
        return "#document";
    }

    @Override // org.jsoup.nodes.Node
    public String outerHtml() {
        return super.html();
    }

    public OutputSettings outputSettings() {
        return this.outputSettings;
    }

    public Parser parser() {
        return this.parser;
    }

    public QuirksMode quirksMode() {
        return this.quirksMode;
    }

    @Override // org.jsoup.nodes.Element
    public Element text(String str) {
        body().text(str);
        return this;
    }

    public String title() {
        Element selectFirst = head().selectFirst(titleEval);
        return selectFirst != null ? StringUtil.normaliseWhitespace(selectFirst.text()).trim() : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public void updateMetaCharsetElement(boolean z5) {
        this.updateMetaCharset = z5;
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.outputSettings = outputSettings;
        return this;
    }

    public Document parser(Parser parser) {
        this.parser = parser;
        return this;
    }

    public Document quirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
        return this;
    }

    public boolean updateMetaCharsetElement() {
        return this.updateMetaCharset;
    }

    public Document connection(Connection connection) {
        Validate.notNull(connection);
        this.connection = connection;
        return this;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public Document shallowClone() {
        Document document = new Document(tag().namespace(), baseUri());
        Attributes attributes = this.attributes;
        if (attributes != null) {
            document.attributes = attributes.clone();
        }
        document.outputSettings = this.outputSettings.clone();
        return document;
    }

    public void title(String str) {
        Validate.notNull(str);
        Element selectFirst = head().selectFirst(titleEval);
        if (selectFirst == null) {
            selectFirst = head().appendElement(com.vladsch.flexmark.util.html.Attribute.TITLE_ATTR);
        }
        selectFirst.text(str);
    }

    public Charset charset() {
        return this.outputSettings.charset();
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public Document clone() {
        Document document = (Document) super.clone();
        document.outputSettings = this.outputSettings.clone();
        return document;
    }

    public Document(String str) {
        this(Parser.NamespaceHtml, str);
    }
}
