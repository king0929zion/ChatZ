package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface NodeRendererFactory extends Function<DataHolder, NodeRenderer> {
    @Override // java.util.function.Function
    NodeRenderer apply(DataHolder dataHolder);
}
