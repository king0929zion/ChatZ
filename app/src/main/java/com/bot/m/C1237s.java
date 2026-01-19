package m;

import T.C0607g0;
import h0.InterfaceC1028e;
import java.util.LinkedHashMap;
import n.D0;
import n.E0;
import n.q0;
import n.s0;
import n.y0;

/* renamed from: m.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237s implements s0 {
    public final y0 a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1028e f12831b;

    /* renamed from: c, reason: collision with root package name */
    public e1.m f12832c;

    /* renamed from: d, reason: collision with root package name */
    public final C0607g0 f12833d = T.r.A(new e1.l(0));

    /* renamed from: e, reason: collision with root package name */
    public final k.M f12834e;

    /* renamed from: f, reason: collision with root package name */
    public q0 f12835f;

    public C1237s(y0 y0Var, InterfaceC1028e interfaceC1028e, e1.m mVar) {
        this.a = y0Var;
        this.f12831b = interfaceC1028e;
        this.f12832c = mVar;
        long[] jArr = k.V.a;
        this.f12834e = new k.M();
    }

    public static final long d(C1237s c1237s) {
        q0 q0Var = c1237s.f12835f;
        return q0Var != null ? ((e1.l) q0Var.getValue()).a : ((e1.l) c1237s.f12833d.getValue()).a;
    }

    public static C1210Q e(C1237s c1237s, int i6, D0 d02) {
        c1237s.getClass();
        if (i6 != 0) {
            e1.m mVar = e1.m.f11576c;
            if (i6 != 4 || c1237s.f12832c != mVar) {
                e1.m mVar2 = e1.m.f11577e;
                if (i6 != 5 || c1237s.f12832c != mVar2) {
                    if (i6 == 1 || ((i6 == 4 && c1237s.f12832c == mVar2) || (i6 == 5 && c1237s.f12832c == mVar))) {
                        C1236r c1236r = new C1236r(c1237s, 1);
                        E0 e02 = AbstractC1205L.a;
                        return new C1210Q(new d0((C1212T) null, new b0(new B0.G(c1236r), d02), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125));
                    }
                    if (i6 == 2) {
                        C1236r c1236r2 = new C1236r(c1237s, 2);
                        E0 e03 = AbstractC1205L.a;
                        return new C1210Q(new d0((C1212T) null, new b0(new C1204K(c1236r2, 0), d02), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125));
                    }
                    if (i6 != 3) {
                        return C1210Q.f12760b;
                    }
                    C1236r c1236r3 = new C1236r(c1237s, 3);
                    E0 e04 = AbstractC1205L.a;
                    return new C1210Q(new d0((C1212T) null, new b0(new C1204K(c1236r3, 0), d02), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125));
                }
            }
        }
        C1236r c1236r4 = new C1236r(c1237s, 0);
        E0 e05 = AbstractC1205L.a;
        return new C1210Q(new d0((C1212T) null, new b0(new B0.G(c1236r4), d02), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125));
    }

    public static C1211S f(C1237s c1237s, int i6, D0 d02) {
        c1237s.getClass();
        if (i6 != 0) {
            e1.m mVar = e1.m.f11576c;
            if (i6 != 4 || c1237s.f12832c != mVar) {
                e1.m mVar2 = e1.m.f11577e;
                if (i6 != 5 || c1237s.f12832c != mVar2) {
                    if (i6 == 1 || ((i6 == 4 && c1237s.f12832c == mVar2) || (i6 == 5 && c1237s.f12832c == mVar))) {
                        C1236r c1236r = new C1236r(c1237s, 5);
                        E0 e02 = AbstractC1205L.a;
                        return new C1211S(new d0((C1212T) null, new b0(new C1204K(c1236r, 1), d02), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125));
                    }
                    if (i6 == 2) {
                        C1236r c1236r2 = new C1236r(c1237s, 6);
                        E0 e03 = AbstractC1205L.a;
                        return new C1211S(new d0((C1212T) null, new b0(new C1204K(c1236r2, 2), d02), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125));
                    }
                    if (i6 != 3) {
                        return C1211S.f12761b;
                    }
                    C1236r c1236r3 = new C1236r(c1237s, 7);
                    E0 e04 = AbstractC1205L.a;
                    return new C1211S(new d0((C1212T) null, new b0(new C1204K(c1236r3, 2), d02), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125));
                }
            }
        }
        C1236r c1236r4 = new C1236r(c1237s, 4);
        E0 e05 = AbstractC1205L.a;
        return new C1211S(new d0((C1212T) null, new b0(new C1204K(c1236r4, 1), d02), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125));
    }

    @Override // n.s0
    public final Object b() {
        return this.a.f().b();
    }

    @Override // n.s0
    public final Object c() {
        return this.a.f().c();
    }
}
