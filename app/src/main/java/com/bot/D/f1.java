package D;

import com.vladsch.flexmark.ext.tables.TableCell;
import com.vladsch.flexmark.ext.tables.internal.TableNodeFormatter;
import com.vladsch.flexmark.formatter.MarkdownWriter;
import com.vladsch.flexmark.formatter.MergeContextConsumer;
import com.vladsch.flexmark.formatter.NodeFormatterContext;
import com.vladsch.flexmark.formatter.NodeRepositoryFormatter;
import com.vladsch.flexmark.formatter.TranslatingSpanRender;
import com.vladsch.flexmark.formatter.TranslationContext;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.NodeRepository;
import y.C1963c;

/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements TranslatingSpanRender, MergeContextConsumer, T.G0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1018c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1019e;

    public /* synthetic */ f1(Object obj, Object obj2) {
        this.f1018c = obj;
        this.f1019e = obj2;
    }

    @Override // com.vladsch.flexmark.formatter.MergeContextConsumer
    public void accept(TranslationContext translationContext, Document document, int i6) {
        NodeRepositoryFormatter.a((NodeRepositoryFormatter) this.f1018c, (NodeRepository) this.f1019e, translationContext, document, i6);
    }

    @Override // T.G0
    public boolean b() {
        y.q0 q0Var = (y.q0) this.f1018c;
        C1963c c1963c = (C1963c) this.f1019e;
        if (!q0Var.f15931q) {
            q0Var.j();
            c1963c.a = C1963c.a(q0Var.f15929o, c1963c.a);
            q0Var.f15931q = !q0Var.i(q0Var.f15928n, r2 + c1963c.f15842b);
        }
        return q0Var.f15931q;
    }

    @Override // com.vladsch.flexmark.formatter.TranslatingSpanRender
    public void render(NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        TableNodeFormatter.c((TableCell) this.f1018c, (String[]) this.f1019e, nodeFormatterContext, markdownWriter);
    }
}
