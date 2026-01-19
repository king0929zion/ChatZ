package Q;

import i4.AbstractC1117a;
import n.C1316c;
import q0.InterfaceC1498d;
import y.C1948E;

/* loaded from: classes.dex */
public final /* synthetic */ class U0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5527c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5529f;

    public /* synthetic */ U0(long j3, T.d1 d1Var) {
        this.f5528e = j3;
        this.f5529f = d1Var;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f5527c;
        X3.y yVar = X3.y.a;
        Object obj2 = this.f5529f;
        switch (i6) {
            case 0:
                InterfaceC1498d.n0((InterfaceC1498d) obj, this.f5528e, 0L, 0L, AbstractC1117a.e(((Number) ((T.d1) obj2).getValue()).floatValue(), S.l.f7374V, 1.0f), 118);
                return yVar;
            default:
                C1948E c1948e = (C1948E) obj2;
                long d6 = e1.j.d(((e1.j) ((C1316c) obj).d()).a, this.f5528e);
                int i7 = C1948E.f15756t;
                c1948e.g(d6);
                c1948e.f15758c.b();
                return yVar;
        }
    }

    public /* synthetic */ U0(C1948E c1948e, long j3) {
        this.f5529f = c1948e;
        this.f5528e = j3;
    }
}
