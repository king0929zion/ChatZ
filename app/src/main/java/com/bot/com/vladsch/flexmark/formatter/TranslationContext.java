package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.html.renderer.HtmlIdGenerator;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public interface TranslationContext {
    void customPlaceholderFormat(TranslationPlaceholderGenerator translationPlaceholderGenerator, TranslatingSpanRender translatingSpanRender);

    HtmlIdGenerator getIdGenerator();

    MergeContext getMergeContext();

    RenderPurpose getRenderPurpose();

    MutableDataHolder getTranslationStore();

    boolean isPostProcessingNonTranslating();

    boolean isTransformingText();

    void nonTranslatingSpan(TranslatingSpanRender translatingSpanRender);

    <T> T postProcessNonTranslating(Function<String, CharSequence> function, Supplier<T> supplier);

    void postProcessNonTranslating(Function<String, CharSequence> function, Runnable runnable);

    CharSequence transformAnchorRef(CharSequence charSequence, CharSequence charSequence2);

    CharSequence transformNonTranslating(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4);

    CharSequence transformTranslating(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4);

    void translatingRefTargetSpan(Node node, TranslatingSpanRender translatingSpanRender);

    void translatingSpan(TranslatingSpanRender translatingSpanRender);
}
