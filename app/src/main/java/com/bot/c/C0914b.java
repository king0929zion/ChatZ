package c;

import T.X;
import com.vladsch.flexmark.ast.HtmlEntity;
import com.vladsch.flexmark.formatter.MarkdownWriter;
import com.vladsch.flexmark.formatter.NodeFormatterContext;
import com.vladsch.flexmark.formatter.TranslatingSpanRender;
import com.vladsch.flexmark.formatter.internal.CoreNodeFormatter;
import e.InterfaceC0955c;
import f0.AbstractC0992o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.AbstractC1276k;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0914b implements InterfaceC0955c, TranslatingSpanRender, NodeVisitor, NodeFilter {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11060c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11061e;

    public /* synthetic */ C0914b(Object obj, int i6) {
        this.f11060c = i6;
        this.f11061e = obj;
    }

    @Override // e.InterfaceC0955c
    public void a(Object obj) {
        ((l4.c) ((X) this.f11061e).getValue()).f(obj);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Iterable] */
    public void b() {
        l4.e eVar = (l4.e) this.f11061e;
        synchronized (AbstractC0992o.f11707c) {
            Object r22 = AbstractC0992o.f11712h;
            AbstractC1276k.f(r22, "<this>");
            ArrayList arrayList = new ArrayList(Y3.n.Z(r22, 10));
            boolean z5 = false;
            for (Object obj : r22) {
                boolean z6 = true;
                if (!z5 && AbstractC1276k.b(obj, eVar)) {
                    z5 = true;
                    z6 = false;
                }
                if (z6) {
                    arrayList.add(obj);
                }
            }
            AbstractC0992o.f11712h = arrayList;
        }
    }

    @Override // org.jsoup.select.NodeFilter
    public NodeFilter.FilterResult head(Node node, int i6) {
        NodeFilter.FilterResult lambda$hasText$1;
        lambda$hasText$1 = Element.lambda$hasText$1((AtomicBoolean) this.f11061e, node, i6);
        return lambda$hasText$1;
    }

    @Override // com.vladsch.flexmark.formatter.TranslatingSpanRender
    public void render(NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        switch (this.f11060c) {
            case 1:
                nodeFormatterContext.renderChildren((com.vladsch.flexmark.util.ast.Node) this.f11061e);
                return;
            default:
                CoreNodeFormatter.lambda$render$3((HtmlEntity) this.f11061e, nodeFormatterContext, markdownWriter);
                return;
        }
    }

    @Override // org.jsoup.select.NodeVisitor
    /* renamed from: head, reason: collision with other method in class */
    public void mo11head(Node node, int i6) {
        Element.lambda$data$2((StringBuilder) this.f11061e, node, i6);
    }
}
