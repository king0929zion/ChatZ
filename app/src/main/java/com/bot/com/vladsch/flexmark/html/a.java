package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.html.renderer.LinkType;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i6) {
        this.a = i6;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return HtmlRenderer.a((DelegatingNodeRendererFactoryWrapper) obj);
            default:
                return HtmlRenderer.MainNodeRenderer.a((LinkType) obj);
        }
    }
}
