package F0;

import H0.C0144d;
import H0.C0153h0;
import I0.R0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import T.AbstractC0629s;
import T.C0626q;
import T.I0;
import U.C0671b;
import U.C0678i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m4.AbstractC1277l;
import o0.C1387I;

/* loaded from: classes.dex */
public final class P extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(int i6, Object obj, Object obj2) {
        super(2);
        this.f1439e = i6;
        this.f1440f = obj;
        this.f1441g = obj2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f1439e;
        Object obj3 = this.f1440f;
        Object obj4 = this.f1441g;
        X3.y yVar = X3.y.a;
        switch (i6) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    Boolean bool = (Boolean) ((H) obj3).f1417g.getValue();
                    boolean booleanValue = bool.booleanValue();
                    l4.e eVar = (l4.e) obj4;
                    c0626q.e0(bool);
                    boolean g3 = c0626q.g(booleanValue);
                    if (booleanValue) {
                        eVar.m(c0626q, 0);
                    } else {
                        if (c0626q.f8176l != 0) {
                            AbstractC0629s.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!c0626q.f8163S) {
                            if (g3) {
                                I0 i02 = c0626q.f8151G;
                                int i7 = i02.f7958g;
                                int i8 = i02.f7959h;
                                C0671b c0671b = c0626q.f8157M;
                                c0671b.getClass();
                                c0671b.d(false);
                                c0671b.f8557b.f8556c.W(C0678i.f8575c);
                                T.r.k(c0626q.f8183s, i7, i8);
                                c0626q.f8151G.t();
                            } else {
                                c0626q.U();
                            }
                        }
                    }
                    if (c0626q.f8189y && c0626q.f8151G.f7960i == c0626q.f8190z) {
                        c0626q.f8190z = -1;
                        c0626q.f8189y = false;
                    }
                    c0626q.p(false);
                } else {
                    c0626q.V();
                }
                return yVar;
            case 1:
                o0.q qVar = (o0.q) obj;
                r0.b bVar = (r0.b) obj2;
                H0.i0 i0Var = (H0.i0) obj3;
                H0.J j3 = i0Var.f1954r;
                if (j3.I()) {
                    i0Var.f1948K = qVar;
                    i0Var.f1947J = bVar;
                    H0.t0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) H0.M.a(j3)).getSnapshotObserver();
                    C1387I c1387i = H0.i0.f1933Q;
                    snapshotObserver.a.d(i0Var, C0144d.f1891h, (C0153h0) obj4);
                    i0Var.f1951N = false;
                } else {
                    i0Var.f1951N = true;
                }
                return yVar;
            case 2:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((ViewTreeObserverOnGlobalLayoutListenerC0216x) obj3, (l4.e) obj4, (C0626q) obj, T.r.J(1));
                return yVar;
            default:
                int intValue2 = ((Number) obj).intValue();
                P0.p pVar = (P0.p) obj2;
                j0.d dVar = (j0.d) obj4;
                if (!((R0) obj3).f2241b.b(pVar.f4502g)) {
                    dVar.m(intValue2, pVar);
                    dVar.f12330k.t(yVar);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, l4.e eVar, int i6) {
        super(2);
        this.f1439e = 2;
        this.f1440f = viewTreeObserverOnGlobalLayoutListenerC0216x;
        this.f1441g = eVar;
    }
}
