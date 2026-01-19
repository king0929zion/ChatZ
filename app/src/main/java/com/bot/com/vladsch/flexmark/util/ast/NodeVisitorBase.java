package com.vladsch.flexmark.util.ast;

/* loaded from: classes.dex */
public abstract class NodeVisitorBase {
    public abstract void visit(Node node);

    public void visitChildren(Node node) {
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            Node next = firstChild.getNext();
            visit(firstChild);
            firstChild = next;
        }
    }
}
