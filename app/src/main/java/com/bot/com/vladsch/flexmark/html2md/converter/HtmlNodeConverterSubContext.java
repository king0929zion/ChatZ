package com.vladsch.flexmark.html2md.converter;

import java.io.IOException;
import org.jsoup.nodes.Node;

/* loaded from: classes.dex */
public abstract class HtmlNodeConverterSubContext implements HtmlNodeConverterContext {
    protected final HtmlMarkdownWriter markdown;
    Node myRenderingNode = null;
    NodeRenderingHandlerWrapper<?> renderingHandlerWrapper;

    public HtmlNodeConverterSubContext(HtmlMarkdownWriter htmlMarkdownWriter) {
        this.markdown = htmlMarkdownWriter;
        htmlMarkdownWriter.setContext(this);
    }

    public void flushTo(Appendable appendable, int i6) {
        flushTo(appendable, getHtmlConverterOptions().maxBlankLines, i6);
    }

    @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
    public HtmlMarkdownWriter getMarkdown() {
        return this.markdown;
    }

    public Node getRenderingNode() {
        return this.myRenderingNode;
    }

    public void setRenderingNode(Node node) {
        this.myRenderingNode = node;
    }

    public void flushTo(Appendable appendable, int i6, int i7) {
        this.markdown.line();
        try {
            this.markdown.appendTo(appendable, i6, i7);
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }
}
