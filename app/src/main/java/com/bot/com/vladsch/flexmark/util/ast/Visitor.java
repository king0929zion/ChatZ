package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.visitor.AstAction;

/* loaded from: classes.dex */
public interface Visitor<N extends Node> extends AstAction<N> {
    void visit(N n3);
}
