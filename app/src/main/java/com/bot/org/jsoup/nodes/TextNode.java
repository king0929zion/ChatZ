package org.jsoup.nodes;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes.dex */
public class TextNode extends LeafNode {
    public TextNode(String str) {
        this.value = str;
    }

    public static TextNode createFromEncoded(String str) {
        return new TextNode(Entities.unescape(str));
    }

    public static boolean lastCharIsWhitespace(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    public static String normaliseWhitespace(String str) {
        return StringUtil.normaliseWhitespace(str);
    }

    public static String stripLeadingWhitespace(String str) {
        return str.replaceFirst("^\\s+", FlexmarkHtmlConverter.DEFAULT_NODE);
    }

    public String getWholeText() {
        return coreValue();
    }

    public boolean isBlank() {
        return StringUtil.isBlank(coreValue());
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return FlexmarkHtmlConverter.TEXT_NODE;
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i6, Document.OutputSettings outputSettings) {
        boolean z5;
        boolean z6;
        boolean prettyPrint = outputSettings.prettyPrint();
        Node node = this.parentNode;
        Element element = node instanceof Element ? (Element) node : null;
        boolean z7 = prettyPrint && !Element.preserveWhitespace(node);
        boolean z8 = element != null && (element.tag().isBlock() || element.tag().formatAsBlock());
        if (z7) {
            boolean z9 = (z8 && this.siblingIndex == 0) || (this.parentNode instanceof Document);
            boolean z10 = z8 && nextSibling() == null;
            Node nextSibling = nextSibling();
            Node previousSibling = previousSibling();
            boolean isBlank = isBlank();
            if ((((nextSibling instanceof Element) && ((Element) nextSibling).shouldIndent(outputSettings)) || (((nextSibling instanceof TextNode) && ((TextNode) nextSibling).isBlank()) || ((previousSibling instanceof Element) && (((Element) previousSibling).isBlock() || previousSibling.nameIs(FlexmarkHtmlConverter.BR_NODE))))) && isBlank) {
                return;
            }
            if ((previousSibling == null && element != null && element.tag().formatAsBlock() && !isBlank) || ((outputSettings.outline() && siblingNodes().size() > 0 && !isBlank) || (previousSibling != null && previousSibling.nameIs(FlexmarkHtmlConverter.BR_NODE)))) {
                indent(appendable, i6, outputSettings);
            }
            z5 = z9;
            z6 = z10;
        } else {
            z5 = false;
            z6 = false;
        }
        Entities.escape(appendable, coreValue(), outputSettings, false, z7, z5, z6);
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i6, Document.OutputSettings outputSettings) {
    }

    public TextNode splitText(int i6) {
        String coreValue = coreValue();
        Validate.isTrue(i6 >= 0, "Split offset must be not be negative");
        Validate.isTrue(i6 < coreValue.length(), "Split offset must not be greater than current text length");
        String substring = coreValue.substring(0, i6);
        String substring2 = coreValue.substring(i6);
        text(substring);
        TextNode textNode = new TextNode(substring2);
        Node node = this.parentNode;
        if (node != null) {
            node.addChildren(siblingIndex() + 1, textNode);
        }
        return textNode;
    }

    public String text() {
        return StringUtil.normaliseWhitespace(getWholeText());
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }

    public TextNode text(String str) {
        coreValue(str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public TextNode clone() {
        return (TextNode) super.clone();
    }
}
