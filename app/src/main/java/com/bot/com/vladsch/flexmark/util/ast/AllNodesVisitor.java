package com.vladsch.flexmark.util.ast;

/* loaded from: classes.dex */
public abstract class AllNodesVisitor {
    private void visitChildren(Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            process(firstChild);
            visit(firstChild);
            firstChild = next;
        }
    }

    public abstract void process(Node node);

    public void visit(Node node) {
        visitChildren(node);
    }
}
