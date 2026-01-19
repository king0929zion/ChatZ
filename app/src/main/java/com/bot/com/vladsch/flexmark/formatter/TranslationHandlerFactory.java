package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.html.renderer.HtmlIdGeneratorFactory;
import com.vladsch.flexmark.util.data.DataHolder;

/* loaded from: classes.dex */
public interface TranslationHandlerFactory extends TranslationContext {
    TranslationHandler create(DataHolder dataHolder, HtmlIdGeneratorFactory htmlIdGeneratorFactory);
}
