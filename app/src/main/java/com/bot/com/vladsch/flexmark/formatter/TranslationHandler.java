package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.util.ast.Document;
import java.util.List;

/* loaded from: classes.dex */
public interface TranslationHandler extends TranslationContext {
    void beginRendering(Document document, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter);

    List<String> getTranslatingTexts();

    void setMergeContext(MergeContext mergeContext);

    void setRenderPurpose(RenderPurpose renderPurpose);

    void setTranslatedTexts(List<? extends CharSequence> list);
}
