package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.html2md.converter.internal.HtmlConverterCoreNodeRenderer;
import com.vladsch.flexmark.util.data.DataHolder;

/* loaded from: classes.dex */
public class HtmlConverterCoreNodeRendererFactory implements HtmlNodeRendererFactory {
    @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeRendererFactory
    public HtmlNodeRenderer apply(DataHolder dataHolder) {
        return new HtmlConverterCoreNodeRenderer(dataHolder);
    }
}
