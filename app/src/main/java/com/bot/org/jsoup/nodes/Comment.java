package org.jsoup.nodes;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

/* loaded from: classes.dex */
public class Comment extends LeafNode {
    public Comment(String str) {
        this.value = str;
    }

    private static boolean isXmlDeclarationData(String str) {
        if (str.length() > 1) {
            return str.startsWith("!") || str.startsWith("?");
        }
        return false;
    }

    public XmlDeclaration asXmlDeclaration() {
        String data = getData();
        String substring = data.substring(1, data.length() - 1);
        if (isXmlDeclarationData(substring)) {
            return null;
        }
        Document parseInput = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput(AbstractC1135a.s("<", substring, ">"), baseUri());
        if (parseInput.body().childrenSize() <= 0) {
            return null;
        }
        Element child = parseInput.body().child(0);
        XmlDeclaration xmlDeclaration = new XmlDeclaration(NodeUtils.parser(parseInput).settings().normalizeTag(child.tagName()), data.startsWith("!"));
        xmlDeclaration.attributes().addAll(child.attributes());
        return xmlDeclaration;
    }

    public String getData() {
        return coreValue();
    }

    public boolean isXmlDeclaration() {
        return isXmlDeclarationData(getData());
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return FlexmarkHtmlConverter.COMMENT_NODE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r5.outline() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (((org.jsoup.nodes.Element) r0).tag().formatAsBlock() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        indent(r3, r4, r5);
     */
    @Override // org.jsoup.nodes.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void outerHtmlHead(java.lang.Appendable r3, int r4, org.jsoup.nodes.Document.OutputSettings r5) {
        /*
            r2 = this;
            boolean r0 = r5.prettyPrint()
            if (r0 == 0) goto L27
            boolean r0 = r2.isEffectivelyFirst()
            if (r0 == 0) goto L1e
            org.jsoup.nodes.Node r0 = r2.parentNode
            boolean r1 = r0 instanceof org.jsoup.nodes.Element
            if (r1 == 0) goto L1e
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            org.jsoup.parser.Tag r0 = r0.tag()
            boolean r0 = r0.formatAsBlock()
            if (r0 != 0) goto L24
        L1e:
            boolean r0 = r5.outline()
            if (r0 == 0) goto L27
        L24:
            r2.indent(r3, r4, r5)
        L27:
            java.lang.String r4 = "<!--"
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = r2.getData()
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = "-->"
            r3.append(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Comment.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings):void");
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i6, Document.OutputSettings outputSettings) {
    }

    public Comment setData(String str) {
        coreValue(str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }

    @Override // org.jsoup.nodes.Node
    public Comment clone() {
        return (Comment) super.clone();
    }
}
