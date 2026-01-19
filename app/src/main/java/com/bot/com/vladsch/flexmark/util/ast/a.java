package com.vladsch.flexmark.util.ast;

import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements BiConsumer {
    public final /* synthetic */ NodeVisitor a;

    public /* synthetic */ a(NodeVisitor nodeVisitor) {
        this.a = nodeVisitor;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        this.a.visit((Node) obj, (Visitor) obj2);
    }
}
