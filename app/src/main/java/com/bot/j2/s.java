package j2;

import D.c1;
import F0.AbstractC0137z;
import F0.InterfaceC0121i;
import F0.U;
import F0.W;
import F0.X;
import F0.k0;
import F0.q0;
import H0.InterfaceC0160o;
import H0.InterfaceC0170z;
import H0.L;
import H0.S;
import e1.AbstractC0960b;
import e1.C0959a;
import f0.C0987j;
import h0.AbstractC1040q;
import h0.InterfaceC1028e;
import i4.AbstractC1117a;
import i4.AbstractC1120d;
import n0.C1356e;
import o4.AbstractC1410a;
import q0.C1496b;
import t0.AbstractC1688b;
import t2.C1721e;

/* loaded from: classes.dex */
public final class s extends AbstractC1040q implements InterfaceC0160o, InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public AbstractC1688b f12402r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1028e f12403s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0121i f12404t;

    /* renamed from: u, reason: collision with root package name */
    public float f12405u;

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    public final long M0(long j3) {
        if (C1356e.e(j3)) {
            return 0L;
        }
        long h3 = this.f12402r.h();
        if (h3 == 9205357640488583168L) {
            return j3;
        }
        float d6 = C1356e.d(h3);
        if (Float.isInfinite(d6) || Float.isNaN(d6)) {
            d6 = C1356e.d(j3);
        }
        float b5 = C1356e.b(h3);
        if (Float.isInfinite(b5) || Float.isNaN(b5)) {
            b5 = C1356e.b(j3);
        }
        long c6 = AbstractC1120d.c(d6, b5);
        long a = this.f12404t.a(c6, j3);
        int i6 = q0.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (a >> 32));
        if (Float.isInfinite(intBitsToFloat) || Float.isNaN(intBitsToFloat)) {
            return j3;
        }
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & a));
        return (Float.isInfinite(intBitsToFloat2) || Float.isNaN(intBitsToFloat2)) ? j3 : AbstractC0137z.o(c6, a);
    }

    public final long N0(long j3) {
        float j4;
        int i6;
        float e6;
        boolean f6 = C0959a.f(j3);
        boolean e7 = C0959a.e(j3);
        if (!f6 || !e7) {
            boolean z5 = C0959a.d(j3) && C0959a.c(j3);
            long h3 = this.f12402r.h();
            if (h3 != 9205357640488583168L) {
                if (z5 && (f6 || e7)) {
                    j4 = C0959a.h(j3);
                    i6 = C0959a.g(j3);
                } else {
                    float d6 = C1356e.d(h3);
                    float b5 = C1356e.b(h3);
                    if (Float.isInfinite(d6) || Float.isNaN(d6)) {
                        j4 = C0959a.j(j3);
                    } else {
                        C1721e c1721e = B.f12363b;
                        j4 = AbstractC1117a.e(d6, C0959a.j(j3), C0959a.h(j3));
                    }
                    if (!Float.isInfinite(b5) && !Float.isNaN(b5)) {
                        C1721e c1721e2 = B.f12363b;
                        e6 = AbstractC1117a.e(b5, C0959a.i(j3), C0959a.g(j3));
                        long M02 = M0(AbstractC1120d.c(j4, e6));
                        return C0959a.a(j3, AbstractC0960b.g(j3, AbstractC1410a.K(C1356e.d(M02))), 0, AbstractC0960b.f(j3, AbstractC1410a.K(C1356e.b(M02))), 0, 10);
                    }
                    i6 = C0959a.i(j3);
                }
                e6 = i6;
                long M022 = M0(AbstractC1120d.c(j4, e6));
                return C0959a.a(j3, AbstractC0960b.g(j3, AbstractC1410a.K(C1356e.d(M022))), 0, AbstractC0960b.f(j3, AbstractC1410a.K(C1356e.b(M022))), 0, 10);
            }
            if (z5) {
                return C0959a.a(j3, C0959a.h(j3), 0, C0959a.g(j3), 0, 10);
            }
        }
        return j3;
    }

    @Override // H0.InterfaceC0170z
    public final int P(S s5, U u5, int i6) {
        if (this.f12402r.h() == 9205357640488583168L) {
            return u5.a0(i6);
        }
        int a02 = u5.a0(C0959a.h(N0(AbstractC0960b.b(i6, 0, 13))));
        return Math.max(AbstractC1410a.K(C1356e.b(M0(AbstractC1120d.c(i6, a02)))), a02);
    }

    @Override // H0.InterfaceC0170z
    public final W d(X x5, U u5, long j3) {
        k0 w5 = u5.w(N0(j3));
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new c1(w5, 7));
    }

    @Override // H0.InterfaceC0170z
    public final int j(S s5, U u5, int i6) {
        if (this.f12402r.h() == 9205357640488583168L) {
            return u5.o(i6);
        }
        int o5 = u5.o(C0959a.g(N0(AbstractC0960b.b(0, i6, 7))));
        return Math.max(AbstractC1410a.K(C1356e.d(M0(AbstractC1120d.c(o5, i6)))), o5);
    }

    @Override // H0.InterfaceC0160o
    public final void k0(L l3) {
        C1496b c1496b = l3.f1765c;
        long M02 = M0(c1496b.c());
        InterfaceC1028e interfaceC1028e = this.f12403s;
        C1721e c1721e = B.f12363b;
        long c6 = c1496b.c();
        long a = interfaceC1028e.a((AbstractC1410a.K(C1356e.d(M02)) << 32) | (AbstractC1410a.K(C1356e.b(M02)) & 4294967295L), (AbstractC1410a.K(C1356e.d(c6)) << 32) | (AbstractC1410a.K(C1356e.b(c6)) & 4294967295L), l3.getLayoutDirection());
        float f6 = (int) (a >> 32);
        float f7 = (int) (a & 4294967295L);
        ((C0987j) c1496b.f13944e.f1972e).G(f6, f7);
        this.f12402r.g(l3, M02, this.f12405u, null);
        ((C0987j) c1496b.f13944e.f1972e).G(-f6, -f7);
        l3.b();
    }

    @Override // H0.InterfaceC0170z
    public final int m0(S s5, U u5, int i6) {
        if (this.f12402r.h() == 9205357640488583168L) {
            return u5.d(i6);
        }
        int d6 = u5.d(C0959a.h(N0(AbstractC0960b.b(i6, 0, 13))));
        return Math.max(AbstractC1410a.K(C1356e.b(M0(AbstractC1120d.c(i6, d6)))), d6);
    }

    @Override // H0.InterfaceC0170z
    public final int z0(S s5, U u5, int i6) {
        if (this.f12402r.h() == 9205357640488583168L) {
            return u5.q(i6);
        }
        int q3 = u5.q(C0959a.g(N0(AbstractC0960b.b(0, i6, 7))));
        return Math.max(AbstractC1410a.K(C1356e.d(M0(AbstractC1120d.c(q3, i6)))), q3);
    }
}
