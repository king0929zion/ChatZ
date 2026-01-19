package com.vladsch.flexmark.formatter.internal;

import com.vladsch.flexmark.formatter.MergeContext;
import com.vladsch.flexmark.formatter.MergeContextConsumer;
import com.vladsch.flexmark.formatter.TranslationContext;
import com.vladsch.flexmark.formatter.TranslationHandler;
import com.vladsch.flexmark.util.ast.Document;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MergeContextImpl implements MergeContext {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Document[] myDocuments;
    private final HashMap<TranslationContext, Document> myTranslationHandlerDocumentMap = new HashMap<>();
    private TranslationHandler[] myTranslationHandlers;

    public MergeContextImpl(Document[] documentArr, TranslationHandler[] translationHandlerArr) {
        this.myDocuments = documentArr;
        this.myTranslationHandlers = translationHandlerArr;
        updateDocumentMap();
        for (TranslationHandler translationHandler : this.myTranslationHandlers) {
            translationHandler.setMergeContext(this);
        }
    }

    private void updateDocumentMap() {
        int length = this.myDocuments.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.myTranslationHandlerDocumentMap.put(this.myTranslationHandlers[i6], this.myDocuments[i6]);
        }
    }

    @Override // com.vladsch.flexmark.formatter.MergeContext
    public void forEachPrecedingDocument(Document document, MergeContextConsumer mergeContextConsumer) {
        int length = this.myDocuments.length;
        for (int i6 = 0; i6 < length; i6++) {
            Document document2 = this.myDocuments[i6];
            if (document2 == document) {
                return;
            }
            mergeContextConsumer.accept(this.myTranslationHandlers[i6], document2, i6);
        }
    }

    @Override // com.vladsch.flexmark.formatter.MergeContext
    public Document getDocument(TranslationContext translationContext) {
        return this.myTranslationHandlerDocumentMap.get(translationContext);
    }

    public Document[] getDocuments() {
        return this.myDocuments;
    }

    public TranslationHandler[] getTranslationHandlers() {
        return this.myTranslationHandlers;
    }

    public void setDocuments(Document[] documentArr) {
        this.myDocuments = documentArr;
        updateDocumentMap();
    }
}
