package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.util.ast.Node;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NodeFormatterSubContext implements NodeFormatterContext {
    protected final MarkdownWriter markdown;
    List<NodeFormattingHandler<?>> rendererList = null;
    int rendererIndex = -1;
    Node renderingNode = null;

    public NodeFormatterSubContext(MarkdownWriter markdownWriter) {
        this.markdown = markdownWriter;
    }

    public void flushTo(Appendable appendable, int i6) {
        flushTo(appendable, getFormatterOptions().maxBlankLines, i6);
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormatterContext
    public MarkdownWriter getMarkdown() {
        return this.markdown;
    }

    public Node getRenderingNode() {
        return this.renderingNode;
    }

    public void setRenderingNode(Node node) {
        this.renderingNode = node;
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
