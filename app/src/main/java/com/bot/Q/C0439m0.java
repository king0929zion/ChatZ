package Q;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.List;
import l4.InterfaceC1193a;

/* renamed from: Q.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0439m0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5971c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5974g;

    public /* synthetic */ C0439m0(T.X x5, l4.c cVar, boolean z5) {
        this.f5973f = x5;
        this.f5974g = cVar;
        this.f5972e = z5;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f5971c) {
            case 0:
                T.X x5 = (T.X) this.f5973f;
                l4.c cVar = (l4.c) this.f5974g;
                x5.setValue(new Object());
                cVar.f(Boolean.valueOf(!this.f5972e));
                return X3.y.a;
            default:
                X2.L l3 = (X2.L) this.f5973f;
                List list = (List) this.f5974g;
                boolean z5 = this.f5972e;
                if (z5) {
                    A4.g0 g0Var = l3.f9221v;
                    g0Var.getClass();
                    g0Var.l(null, X2.P.a);
                }
                if (!list.isEmpty() || z5) {
                    l3.f9214o.clear();
                    l3.o(FlexmarkHtmlConverter.DEFAULT_NODE);
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ C0439m0(boolean z5, X2.L l3, List list) {
        this.f5972e = z5;
        this.f5973f = l3;
        this.f5974g = list;
    }
}
