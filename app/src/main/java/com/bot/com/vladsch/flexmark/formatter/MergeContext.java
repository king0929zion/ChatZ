package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.util.ast.Document;

/* loaded from: classes.dex */
public interface MergeContext {
    void forEachPrecedingDocument(Document document, MergeContextConsumer mergeContextConsumer);

    Document getDocument(TranslationContext translationContext);
}
