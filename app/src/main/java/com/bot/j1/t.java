package J1;

import D.C0069g0;
import D.Q0;
import D.b1;
import P2.E;
import P2.S;
import S2.Y;
import T.X;
import T.d1;
import b0.C0873f;
import f0.C0996s;
import java.util.List;
import k.C1153G;
import m.AbstractC1227i;
import m.C1198E;
import m.C1210Q;
import m.C1211S;
import m.C1237s;
import m.a0;
import m4.AbstractC1276k;
import x.C1856g;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2868c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X f2869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d1 f2870f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2871g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2872h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2873i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2874j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2875k;

    public /* synthetic */ t(C0996s c0996s, X x5, X x6, List list, X x7, X x8, X x9) {
        this.f2871g = c0996s;
        this.f2869e = x5;
        this.f2872h = x6;
        this.f2873i = list;
        this.f2874j = x7;
        this.f2875k = x8;
        this.f2870f = x9;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        float f6;
        switch (this.f2868c) {
            case 0:
                C1153G c1153g = (C1153G) this.f2871g;
                i iVar = (i) this.f2872h;
                l4.c cVar = (l4.c) this.f2873i;
                l4.c cVar2 = (l4.c) this.f2874j;
                l4.c cVar3 = (l4.c) this.f2875k;
                C1237s c1237s = (C1237s) obj;
                if (!((List) this.f2870f.getValue()).contains(c1237s.b())) {
                    return AbstractC1227i.c(C1210Q.f12760b, C1211S.f12761b);
                }
                String str = ((I1.j) c1237s.b()).f2548i;
                int b5 = c1153g.b(str);
                if (b5 >= 0) {
                    f6 = c1153g.f12457c[b5];
                } else {
                    c1153g.d(str, S.l.f7374V);
                    f6 = 0.0f;
                }
                if (!AbstractC1276k.b(((I1.j) c1237s.c()).f2548i, ((I1.j) c1237s.b()).f2548i)) {
                    f6 = (((Boolean) iVar.f2833c.getValue()).booleanValue() || ((Boolean) this.f2869e.getValue()).booleanValue()) ? f6 - 1.0f : f6 + 1.0f;
                }
                c1153g.d(((I1.j) c1237s.c()).f2548i, f6);
                return new C1198E((C1210Q) cVar.f(c1237s), (C1211S) cVar2.f(c1237s), f6, (a0) cVar3.f(c1237s));
            default:
                C0996s c0996s = (C0996s) this.f2871g;
                X x5 = (X) this.f2872h;
                List list = (List) this.f2873i;
                X x6 = (X) this.f2874j;
                X x7 = (X) this.f2875k;
                C1856g c1856g = (C1856g) obj;
                AbstractC1276k.f(c1856g, "$this$LazyColumn");
                C1856g.n(c1856g, null, new C0873f(new E(this.f2869e, 1), true, 1890920514), 3);
                C1856g.n(c1856g, null, new C0873f(new E(x5, 2), true, -1463114965), 3);
                C1856g.n(c1856g, null, new C0873f(new Q0(7, list, x6), true, 334335498), 3);
                C1856g.n(c1856g, null, new C0873f(new E(x7, 3), true, 2131785961), 3);
                C1856g.n(c1856g, null, new C0873f(new b1(c0996s, 11), true, -365730872), 3);
                c1856g.o(c0996s.size(), new C0069g0(11, new Y(10), c0996s), new S(c0996s, 9), new C0873f(new U2.n(c0996s, 1, c0996s), true, 802480018));
                C1856g.n(c1856g, null, new C0873f(new b1(this.f2870f, 12), true, 1431719591), 3);
                return X3.y.a;
        }
    }

    public /* synthetic */ t(C1153G c1153g, i iVar, l4.c cVar, l4.c cVar2, l4.c cVar3, d1 d1Var, X x5) {
        this.f2871g = c1153g;
        this.f2872h = iVar;
        this.f2873i = cVar;
        this.f2874j = cVar2;
        this.f2875k = cVar3;
        this.f2870f = d1Var;
        this.f2869e = x5;
    }
}
