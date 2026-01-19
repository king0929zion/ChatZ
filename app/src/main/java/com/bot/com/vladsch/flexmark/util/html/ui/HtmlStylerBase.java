package com.vladsch.flexmark.util.html.ui;

/* loaded from: classes.dex */
public abstract class HtmlStylerBase<T> implements HtmlStyler<T> {
    @Override // com.vladsch.flexmark.util.html.ui.HtmlStyler
    public abstract String getStyle(T t5);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vladsch.flexmark.util.html.ui.HtmlStyler
    public T getStyleable(Object obj) {
        return obj;
    }
}
