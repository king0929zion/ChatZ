package com.vladsch.flexmark.html.renderer;

import com.vladsch.flexmark.util.data.DataHolder;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface NodeRendererFactory extends Function<DataHolder, NodeRenderer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.function.Function
    NodeRenderer apply(DataHolder dataHolder);
}
