package r;

import H0.AbstractC0157l;
import H0.InterfaceC0154i;
import H0.InterfaceC0169y;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import n0.C1354c;
import o4.AbstractC1410a;
import u.AbstractC1734b;
import x4.AbstractC1888A;

/* renamed from: r.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515D extends AbstractC1040q implements InterfaceC0154i, InterfaceC0169y {

    /* renamed from: r, reason: collision with root package name */
    public X0 f13994r;

    /* renamed from: s, reason: collision with root package name */
    public final E1 f13995s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13996t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1618x f13997u;

    /* renamed from: v, reason: collision with root package name */
    public final C1596p1 f13998v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14000x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14002z;

    /* renamed from: w, reason: collision with root package name */
    public final C1609u f13999w = new C1609u(0);

    /* renamed from: y, reason: collision with root package name */
    public long f14001y = 0;

    public C1515D(X0 x02, E1 e12, boolean z5, InterfaceC1618x interfaceC1618x, C1596p1 c1596p1) {
        this.f13994r = x02;
        this.f13995s = e12;
        this.f13996t = z5;
        this.f13997u = interfaceC1618x;
        this.f13998v = c1596p1;
    }

    public static final float M0(C1515D c1515d, InterfaceC1618x interfaceC1618x, long j3) {
        C1354c c1354c;
        int compare;
        if (e1.l.b(c1515d.f14001y, 0L)) {
            return S.l.f7374V;
        }
        V.e eVar = c1515d.f13999w.a;
        int i6 = eVar.f8761f - 1;
        Object[] objArr = eVar.f8759c;
        if (i6 < objArr.length) {
            c1354c = null;
            while (true) {
                if (i6 < 0) {
                    break;
                }
                C1354c c1354c2 = (C1354c) ((C1509A) objArr[i6]).a.b();
                if (c1354c2 != null) {
                    long d6 = c1354c2.d();
                    long S5 = AbstractC1410a.S(c1515d.f14001y);
                    int ordinal = c1515d.f13994r.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (d6 & 4294967295L)), Float.intBitsToFloat((int) (S5 & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            throw new RuntimeException();
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (d6 >> 32)), Float.intBitsToFloat((int) (S5 >> 32)));
                    }
                    if (compare <= 0) {
                        c1354c = c1354c2;
                    } else if (c1354c == null) {
                        c1354c = c1354c2;
                    }
                }
                i6--;
            }
        } else {
            c1354c = null;
        }
        if (c1354c == null) {
            C1354c c1354c3 = c1515d.f14000x ? (C1354c) c1515d.f13998v.b() : null;
            if (c1354c3 == null) {
                return S.l.f7374V;
            }
            c1354c = c1354c3;
        }
        long S6 = AbstractC1410a.S(c1515d.f14001y);
        int ordinal2 = c1515d.f13994r.ordinal();
        if (ordinal2 == 0) {
            float f6 = c1354c.f13295b;
            return interfaceC1618x.a(f6 - ((int) (j3 & 4294967295L)), c1354c.f13297d - f6, Float.intBitsToFloat((int) (S6 & 4294967295L)));
        }
        if (ordinal2 != 1) {
            throw new RuntimeException();
        }
        float f7 = c1354c.a;
        return interfaceC1618x.a(f7 - ((int) (j3 >> 32)), c1354c.f13296c - f7, Float.intBitsToFloat((int) (S6 >> 32)));
    }

    public static boolean N0(C1515D c1515d, C1354c c1354c, long j3, long j4, int i6) {
        if ((i6 & 1) != 0) {
            j3 = c1515d.f14001y;
        }
        long j5 = j3;
        if ((i6 & 2) != 0) {
            j4 = 0;
        }
        long P02 = c1515d.P0(c1354c, j5, j4);
        return Math.abs(Float.intBitsToFloat((int) (P02 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (P02 & 4294967295L))) <= 0.5f;
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    public final void O0(long j3) {
        InterfaceC1618x interfaceC1618x = this.f13997u;
        if (interfaceC1618x == null) {
            interfaceC1618x = (InterfaceC1618x) AbstractC0157l.h(this, AbstractC1624z.a);
        }
        InterfaceC1618x interfaceC1618x2 = interfaceC1618x;
        if (this.f14002z) {
            AbstractC1734b.c("launchAnimation called when previous animation was running");
        }
        InterfaceC1618x interfaceC1618x3 = this.f13997u;
        if (interfaceC1618x3 == null) {
            interfaceC1618x3 = (InterfaceC1618x) AbstractC0157l.h(this, AbstractC1624z.a);
        }
        interfaceC1618x3.getClass();
        InterfaceC1618x.a.getClass();
        AbstractC1888A.y(A0(), null, new C1513C(this, new h2(C1615w.f14501b), interfaceC1618x2, j3, null), 1);
    }

    public final long P0(C1354c c1354c, long j3, long j4) {
        long j5;
        long j6;
        long S5 = AbstractC1410a.S(j3);
        int ordinal = this.f13994r.ordinal();
        if (ordinal == 0) {
            InterfaceC1618x interfaceC1618x = this.f13997u;
            if (interfaceC1618x == null) {
                interfaceC1618x = (InterfaceC1618x) AbstractC0157l.h(this, AbstractC1624z.a);
            }
            float f6 = c1354c.f13295b;
            float a = interfaceC1618x.a(f6 - ((int) (j4 & 4294967295L)), c1354c.f13297d - f6, Float.intBitsToFloat((int) (S5 & 4294967295L)));
            long floatToRawIntBits = Float.floatToRawIntBits(S.l.f7374V);
            long floatToRawIntBits2 = Float.floatToRawIntBits(a);
            j5 = floatToRawIntBits << 32;
            j6 = floatToRawIntBits2 & 4294967295L;
        } else {
            if (ordinal != 1) {
                throw new RuntimeException();
            }
            InterfaceC1618x interfaceC1618x2 = this.f13997u;
            if (interfaceC1618x2 == null) {
                interfaceC1618x2 = (InterfaceC1618x) AbstractC0157l.h(this, AbstractC1624z.a);
            }
            float f7 = c1354c.a;
            j5 = Float.floatToRawIntBits(interfaceC1618x2.a(f7 - ((int) (j4 >> 32)), c1354c.f13296c - f7, Float.intBitsToFloat((int) (S5 >> 32)))) << 32;
            j6 = Float.floatToRawIntBits(S.l.f7374V) & 4294967295L;
        }
        return j5 | j6;
    }

    @Override // H0.InterfaceC0169y
    public final void q(long j3) {
        int g3;
        long j4;
        long j5;
        long j6;
        long j7 = this.f14001y;
        this.f14001y = j3;
        int ordinal = this.f13994r.ordinal();
        if (ordinal == 0) {
            g3 = AbstractC1276k.g((int) (j3 & 4294967295L), (int) (j7 & 4294967295L));
        } else {
            if (ordinal != 1) {
                throw new RuntimeException();
            }
            g3 = AbstractC1276k.g((int) (j3 >> 32), (int) (j7 >> 32));
        }
        if (g3 >= 0) {
            return;
        }
        if (this.f13996t) {
            j4 = 0;
        } else {
            if (this.f13994r == X0.f14183c) {
                j5 = 0 << 32;
                j6 = ((int) (j7 & 4294967295L)) - ((int) (j3 & 4294967295L));
            } else {
                j5 = (((int) (j7 >> 32)) - ((int) (j3 >> 32))) << 32;
                j6 = 0;
            }
            j4 = j5 | (j6 & 4294967295L);
        }
        long j8 = j4;
        C1354c c1354c = (C1354c) this.f13998v.b();
        if (c1354c == null || this.f14002z || this.f14000x || !N0(this, c1354c, j7, 0L, 2) || N0(this, c1354c, 0L, j8, 1)) {
            return;
        }
        this.f14000x = true;
        O0(j8);
    }
}
