package L1;

import T.C0607g0;
import T.X;
import T.d1;
import X3.y;
import m4.AbstractC1276k;
import m4.C1283r;
import n.C1304M;
import n.u0;
import o0.C1387I;
import o0.O;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3007c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3010g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3011h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3012i;

    public /* synthetic */ g(C1283r c1283r, C1283r c1283r2, i iVar, boolean z5, Y3.j jVar) {
        this.f3009f = c1283r;
        this.f3010g = c1283r2;
        this.f3011h = iVar;
        this.f3008e = z5;
        this.f3012i = jVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f3007c) {
            case 0:
                C1283r c1283r = (C1283r) this.f3009f;
                C1283r c1283r2 = (C1283r) this.f3010g;
                i iVar = (i) this.f3011h;
                Y3.j jVar = (Y3.j) this.f3012i;
                I1.j jVar2 = (I1.j) obj;
                AbstractC1276k.f(jVar2, "entry");
                c1283r.f12968c = true;
                c1283r2.f12968c = true;
                iVar.m(jVar2, this.f3008e, jVar);
                break;
            default:
                C0607g0 c0607g0 = ((C1304M) this.f3009f).f13029c;
                X x5 = (X) this.f3010g;
                d1 d1Var = (d1) this.f3011h;
                d1 d1Var2 = (d1) this.f3012i;
                C1387I c1387i = (C1387I) obj;
                boolean z5 = this.f3008e;
                float f6 = 0.8f;
                float f7 = 1.0f;
                c1387i.j(!z5 ? ((Number) d1Var.getValue()).floatValue() : ((Boolean) c0607g0.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z5) {
                    f6 = ((Number) d1Var.getValue()).floatValue();
                } else if (((Boolean) c0607g0.getValue()).booleanValue()) {
                    f6 = 1.0f;
                }
                c1387i.k(f6);
                if (!z5) {
                    f7 = ((Number) d1Var2.getValue()).floatValue();
                } else if (!((Boolean) c0607g0.getValue()).booleanValue()) {
                    f7 = S.l.f7374V;
                }
                c1387i.d(f7);
                c1387i.p(((O) x5.getValue()).a);
                break;
        }
        return y.a;
    }

    public /* synthetic */ g(boolean z5, C1304M c1304m, X x5, u0 u0Var, u0 u0Var2) {
        this.f3008e = z5;
        this.f3009f = c1304m;
        this.f3010g = x5;
        this.f3011h = u0Var;
        this.f3012i = u0Var2;
    }
}
