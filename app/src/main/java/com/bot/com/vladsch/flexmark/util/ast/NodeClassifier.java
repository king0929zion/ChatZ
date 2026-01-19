package com.vladsch.flexmark.util.ast;

import java.util.function.Function;

/* loaded from: classes.dex */
public class NodeClassifier implements Function<Node, Class<?>> {
    public static final NodeClassifier INSTANCE = new NodeClassifier();

    private NodeClassifier() {
    }

    @Override // java.util.function.Function
    public Class<?> apply(Node node) {
        return node.getClass();
    }
}
