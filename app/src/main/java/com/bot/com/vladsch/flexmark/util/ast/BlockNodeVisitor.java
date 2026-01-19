package com.vladsch.flexmark.util.ast;

import java.util.Collection;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class BlockNodeVisitor extends NodeVisitor {
    public BlockNodeVisitor() {
    }

    public BlockNodeVisitor(VisitHandler... visitHandlerArr) {
        super(visitHandlerArr);
    }

    @Override // com.vladsch.flexmark.util.visitor.AstActionHandler
    public void processNode(Node node, boolean z5, BiConsumer<Node, Visitor<Node>> biConsumer) {
        if (node instanceof Block) {
            super.processNode((BlockNodeVisitor) node, z5, (BiConsumer<BlockNodeVisitor, A>) biConsumer);
        }
    }

    public BlockNodeVisitor(VisitHandler[]... visitHandlerArr) {
        super(visitHandlerArr);
    }

    public BlockNodeVisitor(Collection<VisitHandler> collection) {
        super(collection);
    }
}
