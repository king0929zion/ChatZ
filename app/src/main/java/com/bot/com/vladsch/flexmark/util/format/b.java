package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.util.format.MarkdownParagraph;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Consumer {
    public final /* synthetic */ MarkdownParagraph.LeftAlignedWrapping a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.addChars((CharSequence) obj);
    }
}
