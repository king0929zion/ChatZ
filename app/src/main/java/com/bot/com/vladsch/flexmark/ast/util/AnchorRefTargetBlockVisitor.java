package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.AnchorRefTarget;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitorBase;

/* loaded from: classes.dex */
public abstract class AnchorRefTargetBlockVisitor implements NodeVisitorBase,   {
    public boolean preVisit(Node node) {
        return true;
    }

    public abstract void visit(AnchorRefTarget anchorRefTarget);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vladsch.flexmark.util.ast.NodeVisitorBase
    public void visit(Node node) {
        if (node instanceof AnchorRefTarget) {
            visit((AnchorRefTarget) node);
        }
        if (preVisit(node) && (node instanceof Block)) {
            visitChildren(node);
        }
    }
}
