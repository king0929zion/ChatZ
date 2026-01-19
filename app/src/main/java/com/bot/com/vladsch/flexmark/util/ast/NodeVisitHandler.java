package com.vladsch.flexmark.util.ast;

/* loaded from: classes.dex */
public interface NodeVisitHandler extends Visitor<Node> {
    void visitChildren(Node node);

    void visitNodeOnly(Node node);
}
