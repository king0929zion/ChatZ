package Q;

import H0.AbstractC0157l;
import l4.InterfaceC1193a;
import t.C1682j;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5583c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z f5584e;

    public /* synthetic */ X(Z z5, int i6) {
        this.f5583c = i6;
        this.f5584e = z5;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        P.b bVar;
        int i6 = this.f5583c;
        Z z5 = this.f5584e;
        switch (i6) {
            case 0:
                Q1 q12 = (Q1) AbstractC0157l.h(z5, S1.a);
                return (q12 == null || (bVar = q12.f5492b) == null) ? R1.a : bVar;
            default:
                if (((Q1) AbstractC0157l.h(z5, S1.a)) == null) {
                    P.a aVar = z5.f5634x;
                    if (aVar != null) {
                        z5.N0(aVar);
                    }
                    z5.f5634x = null;
                } else if (z5.f5634x == null) {
                    Y y5 = new Y(z5, 0);
                    X x5 = new X(z5, 0);
                    C1682j c1682j = z5.f5630t;
                    boolean z6 = z5.f5631u;
                    float f6 = z5.f5632v;
                    n.D0 d02 = P.f.a;
                    P.a aVar2 = new P.a(c1682j, z6, f6, y5, x5);
                    z5.M0(aVar2);
                    z5.f5634x = aVar2;
                }
                return X3.y.a;
        }
    }
}
