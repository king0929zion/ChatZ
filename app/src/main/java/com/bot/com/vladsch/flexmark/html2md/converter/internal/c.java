package com.vladsch.flexmark.html2md.converter.internal;

import com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext;
import org.jsoup.nodes.Element;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11334c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HtmlConverterCoreNodeRenderer f11335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Element f11336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ HtmlNodeConverterContext f11337g;

    public /* synthetic */ c(HtmlConverterCoreNodeRenderer htmlConverterCoreNodeRenderer, HtmlNodeConverterContext htmlNodeConverterContext, Element element) {
        this.f11335e = htmlConverterCoreNodeRenderer;
        this.f11337g = htmlNodeConverterContext;
        this.f11336f = element;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11334c) {
            case 0:
                this.f11335e.lambda$processMath$9(this.f11337g, this.f11336f);
                return;
            default:
                this.f11335e.lambda$processCode$2(this.f11336f, this.f11337g);
                return;
        }
    }

    public /* synthetic */ c(HtmlConverterCoreNodeRenderer htmlConverterCoreNodeRenderer, Element element, HtmlNodeConverterContext htmlNodeConverterContext) {
        this.f11335e = htmlConverterCoreNodeRenderer;
        this.f11336f = element;
        this.f11337g = htmlNodeConverterContext;
    }
}
