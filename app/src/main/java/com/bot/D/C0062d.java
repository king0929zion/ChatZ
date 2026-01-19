package D;

import O.C0316k;
import T.C0626q;
import Z2.AbstractC0783w;
import a3.C0808F;
import a3.C0810H;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import t0.AbstractC1688b;
import x.C1854e;
import x.C1857h;
import y.C1969i;

/* renamed from: D.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0062d implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f996c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f998f;

    public /* synthetic */ C0062d(int i6, int i7, Object obj) {
        this.f996c = i7;
        this.f998f = obj;
        this.f997e = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        long j3;
        switch (this.f996c) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0070h.b((InterfaceC1041r) this.f998f, (C0626q) obj, T.r.J(1), this.f997e);
                break;
            case 1:
                ((Integer) obj2).intValue();
                U2.a.i((List) this.f998f, (C0626q) obj, T.r.J(this.f997e | 1));
                break;
            case 2:
                C0810H c0810h = (C0810H) this.f998f;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    int i6 = this.f997e;
                    AbstractC1688b L5 = Y3.C.L(i6, 0, c0626q);
                    String str = c0810h.a.f11167c;
                    InterfaceC1041r j4 = v.t0.j(C1038o.a, 22);
                    if (AbstractC0783w.V(Integer.valueOf(i6))) {
                        c0626q.b0(-1127558235);
                        j3 = ((Q.N) c0626q.j(Q.O.a)).f5427q;
                        c0626q.p(false);
                    } else {
                        c0626q.b0(-1127557561);
                        c0626q.p(false);
                        j3 = o0.s.f13481h;
                    }
                    Q.A0.a(L5, str, j4, j3, c0626q, 392, 0);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 3:
                C0808F c0808f = (C0808F) this.f998f;
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                int i7 = this.f997e;
                int i8 = intValue2 - i7;
                int i9 = intValue3 - i7;
                A4.g0 g0Var = c0808f.f10608d;
                ArrayList K0 = Y3.m.K0((Collection) g0Var.getValue());
                if (i8 >= 0 && i8 < K0.size() && i9 >= 0 && i9 < K0.size()) {
                    K0.add(i9, (C0810H) K0.remove(i8));
                    g0Var.l(null, K0);
                }
                return X3.y.a;
            case 4:
                C1857h c1857h = (C1857h) this.f998f;
                C0626q c0626q2 = (C0626q) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c0626q2.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    C0316k c0316k = c1857h.f15451b.f15449c;
                    int i10 = this.f997e;
                    C1969i b5 = c0316k.b(i10);
                    ((C1854e) b5.f15877c).f15446c.i(c1857h.f15452c, Integer.valueOf(i10 - b5.a), c0626q2, 0);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            default:
                z.r rVar = (z.r) this.f998f;
                C0626q c0626q3 = (C0626q) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c0626q3.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    C0316k i11 = rVar.f16142b.i();
                    int i12 = this.f997e;
                    C1969i b6 = i11.b(i12);
                    ((z.l) b6.f15877c).f16121b.i(z.u.a, Integer.valueOf(i12 - b6.a), c0626q3, 0);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
        }
        return X3.y.a;
    }

    public /* synthetic */ C0062d(int i6, C0810H c0810h) {
        this.f996c = 2;
        this.f997e = i6;
        this.f998f = c0810h;
    }

    public /* synthetic */ C0062d(InterfaceC1041r interfaceC1041r, int i6, int i7) {
        this.f996c = 0;
        this.f998f = interfaceC1041r;
        this.f997e = i7;
    }
}
