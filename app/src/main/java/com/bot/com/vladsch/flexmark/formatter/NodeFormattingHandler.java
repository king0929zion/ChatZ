package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.visitor.AstAction;
import com.vladsch.flexmark.util.visitor.AstHandler;

/* loaded from: classes.dex */
public class NodeFormattingHandler<N extends Node> extends AstHandler<N, CustomNodeFormatter<N>> {

    /* loaded from: classes.dex */
    public interface CustomNodeFormatter<N extends Node> extends AstAction<N> {
        void render(N n3, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter);
    }

    public NodeFormattingHandler(Class<N> cls, CustomNodeFormatter<N> customNodeFormatter) {
        super(cls, customNodeFormatter);
    }

    public void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        getAdapter().render(node, nodeFormatterContext, markdownWriter);
    }
}
