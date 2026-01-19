package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.util.data.DataHolder;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface HtmlNodeRendererFactory extends Function<DataHolder, HtmlNodeRenderer> {
    @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeRendererFactory
    HtmlNodeRenderer apply(DataHolder dataHolder);
}
