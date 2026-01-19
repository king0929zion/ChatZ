package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.ast.DelimitedLinkNode;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.formatter.internal.CoreNodeFormatter;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.CoreNodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext;
import com.vladsch.flexmark.html2md.converter.internal.HtmlConverterCoreNodeRenderer;
import com.vladsch.flexmark.util.ast.Node;
import org.jsoup.nodes.Element;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11315c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11319h;

    public /* synthetic */ j(MarkdownWriter markdownWriter, String str, DelimitedLinkNode delimitedLinkNode, String str2) {
        this.f11315c = 1;
        this.f11316e = markdownWriter;
        this.f11317f = str;
        this.f11318g = delimitedLinkNode;
        this.f11319h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11315c) {
            case 0:
                ((NodeRepositoryFormatter) this.f11317f).lambda$renderReferenceBlockUnique$1((Node) this.f11318g, (NodeFormatterContext) this.f11319h, (MarkdownWriter) this.f11316e);
                return;
            case 1:
                CoreNodeFormatter.lambda$renderAutoLink$5((MarkdownWriter) this.f11316e, (String) this.f11317f, (DelimitedLinkNode) this.f11318g, (String) this.f11319h);
                return;
            case 2:
                ((CoreNodeRenderer) this.f11317f).lambda$renderLooseParagraph$8((Paragraph) this.f11318g, (NodeRendererContext) this.f11319h, (HtmlWriter) this.f11316e);
                return;
            default:
                ((HtmlConverterCoreNodeRenderer) this.f11317f).lambda$processCode$1((HtmlNodeConverterContext) this.f11318g, (Element) this.f11319h, (CharSequence) this.f11316e);
                return;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f11315c = i6;
        this.f11317f = obj;
        this.f11318g = obj2;
        this.f11319h = obj3;
        this.f11316e = obj4;
    }
}
