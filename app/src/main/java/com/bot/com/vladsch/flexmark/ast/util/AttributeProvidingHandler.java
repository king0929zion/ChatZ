package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.html.renderer.AttributablePart;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.html.MutableAttributes;
import com.vladsch.flexmark.util.visitor.AstAction;
import com.vladsch.flexmark.util.visitor.AstHandler;

/* loaded from: classes.dex */
public class AttributeProvidingHandler<N extends Node> extends AstHandler<N, AttributeProvidingVisitor<N>> {

    /* loaded from: classes.dex */
    public interface AttributeProvidingVisitor<N extends Node> extends AstAction<N> {
        void setAttributes(N n3, AttributablePart attributablePart, MutableAttributes mutableAttributes);
    }

    public AttributeProvidingHandler(Class<N> cls, AttributeProvidingVisitor<N> attributeProvidingVisitor) {
        super(cls, attributeProvidingVisitor);
    }

    public void setAttributes(Node node, AttributablePart attributablePart, MutableAttributes mutableAttributes) {
        getAdapter().setAttributes(node, attributablePart, mutableAttributes);
    }
}
