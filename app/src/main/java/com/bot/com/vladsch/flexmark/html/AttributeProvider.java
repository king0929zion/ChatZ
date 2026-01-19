package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.AttributablePart;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.html.MutableAttributes;

/* loaded from: classes.dex */
public interface AttributeProvider {
    void setAttributes(Node node, AttributablePart attributablePart, MutableAttributes mutableAttributes);
}
