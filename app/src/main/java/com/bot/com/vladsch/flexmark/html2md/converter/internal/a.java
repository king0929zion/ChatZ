package com.vladsch.flexmark.html2md.converter.internal;

import com.vladsch.flexmark.html2md.converter.HtmlMarkdownWriter;
import com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext;
import org.jsoup.nodes.Element;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11328c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HtmlConverterCoreNodeRenderer f11329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ HtmlMarkdownWriter f11330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ HtmlNodeConverterContext f11331g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Element f11332h;

    public /* synthetic */ a(HtmlConverterCoreNodeRenderer htmlConverterCoreNodeRenderer, HtmlMarkdownWriter htmlMarkdownWriter, HtmlNodeConverterContext htmlNodeConverterContext, Element element, int i6) {
        this.f11328c = i6;
        this.f11329e = htmlConverterCoreNodeRenderer;
        this.f11330f = htmlMarkdownWriter;
        this.f11331g = htmlNodeConverterContext;
        this.f11332h = element;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11328c) {
            case 0:
                HtmlNodeConverterContext htmlNodeConverterContext = this.f11331g;
                Element element = this.f11332h;
                this.f11329e.lambda$processSub$7(this.f11330f, htmlNodeConverterContext, element);
                return;
            case 1:
                HtmlNodeConverterContext htmlNodeConverterContext2 = this.f11331g;
                Element element2 = this.f11332h;
                this.f11329e.lambda$processIns$5(this.f11330f, htmlNodeConverterContext2, element2);
                return;
            case 2:
                HtmlNodeConverterContext htmlNodeConverterContext3 = this.f11331g;
                Element element3 = this.f11332h;
                this.f11329e.lambda$processEmphasis$4(this.f11330f, htmlNodeConverterContext3, element3);
                return;
            case 3:
                HtmlNodeConverterContext htmlNodeConverterContext4 = this.f11331g;
                Element element4 = this.f11332h;
                this.f11329e.lambda$processDel$3(this.f11330f, htmlNodeConverterContext4, element4);
                return;
            case 4:
                HtmlNodeConverterContext htmlNodeConverterContext5 = this.f11331g;
                Element element5 = this.f11332h;
                this.f11329e.lambda$processSup$8(this.f11330f, htmlNodeConverterContext5, element5);
                return;
            default:
                HtmlNodeConverterContext htmlNodeConverterContext6 = this.f11331g;
                Element element6 = this.f11332h;
                this.f11329e.lambda$processStrong$6(this.f11330f, htmlNodeConverterContext6, element6);
                return;
        }
    }
}
