package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.visitor.AstActionHandler;
import java.util.Collection;

/* loaded from: classes.dex */
public class NodeVisitor extends AstActionHandler<NodeVisitor, Node, Visitor<Node>, VisitHandler<Node>> implements NodeVisitHandler {
    protected static final VisitHandler[] EMPTY_HANDLERS = new VisitHandler[0];

    public NodeVisitor() {
        super(Node.AST_ADAPTER);
    }

    public NodeVisitor addHandler(VisitHandler visitHandler) {
        return (NodeVisitor) super.addActionHandler(visitHandler);
    }

    public NodeVisitor addHandlers(Collection<VisitHandler> collection) {
        return addActionHandlers((VisitHandler[]) collection.toArray(EMPTY_HANDLERS));
    }

    public NodeVisitor addTypedHandlers(Collection<VisitHandler<?>> collection) {
        return addActionHandlers((VisitHandler[]) collection.toArray(EMPTY_HANDLERS));
    }

    @Override // com.vladsch.flexmark.util.ast.Visitor
    public final void visit(Node node) {
        processNode(node, true, new a(this));
    }

    @Override // com.vladsch.flexmark.util.ast.NodeVisitHandler
    public final void visitChildren(Node node) {
        processChildren(node, new a(this));
    }

    @Override // com.vladsch.flexmark.util.ast.NodeVisitHandler
    public final void visitNodeOnly(Node node) {
        processNode(node, false, new a(this));
    }

    public NodeVisitor(VisitHandler... visitHandlerArr) {
        super(Node.AST_ADAPTER);
        addActionHandlers(visitHandlerArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(Node node, Visitor<Node> visitor) {
        visitor.visit(node);
    }

    public NodeVisitor addHandlers(VisitHandler[] visitHandlerArr) {
        return addActionHandlers(visitHandlerArr);
    }

    public NodeVisitor addHandlers(VisitHandler[]... visitHandlerArr) {
        return addActionHandlers(visitHandlerArr);
    }

    public NodeVisitor(VisitHandler[]... visitHandlerArr) {
        super(Node.AST_ADAPTER);
        addActionHandlers(visitHandlerArr);
    }

    public NodeVisitor(Collection<VisitHandler> collection) {
        super(Node.AST_ADAPTER);
        addHandlers(collection);
    }
}
