package N1;

import android.util.LongSparseArray;
import b.C0853B;
import b.C0862f;
import com.bot.MainActivity;
import com.vladsch.flexmark.ast.BlockQuote;
import com.vladsch.flexmark.ast.BulletList;
import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ast.OrderedList;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ext.tables.TableBlock;
import com.vladsch.flexmark.ext.tables.TableBody;
import com.vladsch.flexmark.ext.tables.TableCaption;
import com.vladsch.flexmark.ext.tables.TableHead;
import com.vladsch.flexmark.ext.tables.TableRow;
import com.vladsch.flexmark.ext.tables.internal.TableNodeRenderer;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.CoreNodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext;
import i4.AbstractC1117a;
import org.jsoup.nodes.Element;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3798c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3800f;

    public /* synthetic */ y(int i6, Object obj, Object obj2) {
        this.f3798c = i6;
        this.f3799e = obj;
        this.f3800f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f3798c;
        Object obj = this.f3800f;
        Object obj2 = this.f3799e;
        switch (i6) {
            case 0:
                z zVar = (z) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                    zVar.a();
                }
            case 1:
                MainActivity mainActivity = (MainActivity) obj2;
                int i7 = b.m.f10931w;
                mainActivity.f10932c.a(new C0862f((C0853B) obj, mainActivity));
                return;
            case 2:
                TableNodeRenderer.c((NodeRendererContext) obj2, (TableHead) obj);
                return;
            case 3:
                TableNodeRenderer.h((NodeRendererContext) obj2, (TableBody) obj);
                return;
            case 4:
                TableNodeRenderer.e((NodeRendererContext) obj2, (TableRow) obj);
                return;
            case AbstractC1787b.f15290g /* 5 */:
                TableNodeRenderer.j((NodeRendererContext) obj2, (TableCaption) obj);
                return;
            case 6:
                TableNodeRenderer.i((NodeRendererContext) obj2, (TableBlock) obj);
                return;
            case 7:
                CoreNodeRenderer.d((NodeRendererContext) obj2, (OrderedList) obj);
                return;
            case 8:
                CoreNodeRenderer.h((NodeRendererContext) obj2, (Paragraph) obj);
                return;
            case AbstractC1787b.f15287d /* 9 */:
                CoreNodeRenderer.a((HtmlWriter) obj2, (String) obj);
                return;
            case AbstractC1787b.f15289f /* 10 */:
                CoreNodeRenderer.i((NodeRendererContext) obj2, (BulletList) obj);
                return;
            case 11:
                CoreNodeRenderer.b((NodeRendererContext) obj2, (BlockQuote) obj);
                return;
            case 12:
                CoreNodeRenderer.f((NodeRendererContext) obj2, (Heading) obj);
                return;
            case 13:
                ((HtmlNodeConverterContext) obj2).renderChildren((Element) obj, false, null);
                return;
            default:
                AbstractC1117a.l((j0.d) obj2, (LongSparseArray) obj);
                return;
        }
    }
}
