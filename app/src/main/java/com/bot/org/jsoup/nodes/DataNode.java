package org.jsoup.nodes;

import org.jsoup.nodes.Document;

/* loaded from: classes.dex */
public class DataNode extends LeafNode {
    public DataNode(String str) {
        this.value = str;
    }

    public String getWholeData() {
        return coreValue();
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#data";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i6, Document.OutputSettings outputSettings) {
        String wholeData = getWholeData();
        if (outputSettings.syntax() != Document.OutputSettings.Syntax.xml || wholeData.contains("<![CDATA[")) {
            appendable.append(getWholeData());
            return;
        }
        if (parentNameIs("script")) {
            appendable.append("//<![CDATA[\n").append(wholeData).append("\n//]]>");
        } else if (parentNameIs(com.vladsch.flexmark.util.html.Attribute.STYLE_ATTR)) {
            appendable.append("/*<![CDATA[*/\n").append(wholeData).append("\n/*]]>*/");
        } else {
            appendable.append("<![CDATA[").append(wholeData).append("]]>");
        }
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i6, Document.OutputSettings outputSettings) {
    }

    public DataNode setWholeData(String str) {
        coreValue(str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }

    @Override // org.jsoup.nodes.Node
    public DataNode clone() {
        return (DataNode) super.clone();
    }
}
