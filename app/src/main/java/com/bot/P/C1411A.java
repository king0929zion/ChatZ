package p;

import H0.AbstractC0157l;
import H0.InterfaceC0160o;
import Z2.C0741a0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import n0.C1354c;
import n0.C1355d;
import n0.C1356e;
import o0.AbstractC1404o;
import o0.C1383E;
import o0.C1384F;
import o0.C1385G;
import o0.C1397h;
import q0.C1496b;
import q0.InterfaceC1498d;

/* renamed from: p.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1411A extends AbstractC1040q implements InterfaceC0160o, H0.m0, H0.A0 {

    /* renamed from: r, reason: collision with root package name */
    public long f13530r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC1404o f13531s;

    /* renamed from: t, reason: collision with root package name */
    public float f13532t;

    /* renamed from: u, reason: collision with root package name */
    public o0.L f13533u;

    /* renamed from: v, reason: collision with root package name */
    public long f13534v;

    /* renamed from: w, reason: collision with root package name */
    public e1.m f13535w;

    /* renamed from: x, reason: collision with root package name */
    public o0.y f13536x;

    /* renamed from: y, reason: collision with root package name */
    public o0.L f13537y;

    /* renamed from: z, reason: collision with root package name */
    public o0.y f13538z;

    @Override // H0.A0
    public final void I(P0.x xVar) {
        P0.v.f(xVar, this.f13533u);
    }

    @Override // H0.A0
    public final boolean h() {
        return false;
    }

    @Override // H0.m0
    public final void i0() {
        this.f13534v = 9205357640488583168L;
        this.f13535w = null;
        this.f13536x = null;
        this.f13537y = null;
        AbstractC0157l.k(this);
    }

    @Override // H0.InterfaceC0160o
    public final void k0(H0.L l3) {
        o0.y yVar;
        AbstractC1404o abstractC1404o;
        C1397h c1397h;
        C1496b c1496b = l3.f1765c;
        if (this.f13533u == o0.y.f13496b) {
            if (!o0.s.d(this.f13530r, o0.s.f13481h)) {
                InterfaceC1498d.n0(l3, this.f13530r, 0L, 0L, S.l.f7374V, 126);
            }
            AbstractC1404o abstractC1404o2 = this.f13531s;
            if (abstractC1404o2 != null) {
                InterfaceC1498d.v(l3, abstractC1404o2, 0L, 0L, this.f13532t, null, 118);
            }
        } else {
            if (C1356e.a(c1496b.c(), this.f13534v) && l3.getLayoutDirection() == this.f13535w && AbstractC1276k.b(this.f13537y, this.f13533u)) {
                yVar = this.f13536x;
                AbstractC1276k.c(yVar);
            } else {
                AbstractC0157l.r(this, new C0741a0(3, this, l3));
                yVar = this.f13538z;
                this.f13538z = null;
            }
            this.f13536x = yVar;
            this.f13534v = c1496b.c();
            this.f13535w = l3.getLayoutDirection();
            this.f13537y = this.f13533u;
            AbstractC1276k.c(yVar);
            if (!o0.s.d(this.f13530r, o0.s.f13481h)) {
                o0.y.l(l3, yVar, this.f13530r);
            }
            AbstractC1404o abstractC1404o3 = this.f13531s;
            if (abstractC1404o3 != null) {
                float f6 = this.f13532t;
                boolean z5 = yVar instanceof C1384F;
                q0.g gVar = q0.g.a;
                if (z5) {
                    C1354c c1354c = ((C1384F) yVar).f13410f;
                    float f7 = c1354c.a;
                    float f8 = c1354c.f13295b;
                    l3.C(abstractC1404o3, (4294967295L & Float.floatToRawIntBits(f8)) | (Float.floatToRawIntBits(f7) << 32), o0.y.w(c1354c), f6, gVar, 3);
                } else {
                    if (yVar instanceof C1385G) {
                        C1385G c1385g = (C1385G) yVar;
                        abstractC1404o = abstractC1404o3;
                        c1397h = c1385g.f13412g;
                        if (c1397h == null) {
                            C1355d c1355d = c1385g.f13411f;
                            float intBitsToFloat = Float.intBitsToFloat((int) (c1355d.f13304h >> 32));
                            float f9 = c1355d.a;
                            float f10 = c1355d.f13298b;
                            long floatToRawIntBits = (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
                            float b5 = c1355d.b();
                            float a = c1355d.a();
                            l3.e(abstractC1404o, floatToRawIntBits, (Float.floatToRawIntBits(b5) << 32) | (Float.floatToRawIntBits(a) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), f6, gVar);
                        }
                    } else {
                        if (!(yVar instanceof C1383E)) {
                            throw new RuntimeException();
                        }
                        C1397h c1397h2 = ((C1383E) yVar).f13409f;
                        abstractC1404o = abstractC1404o3;
                        c1397h = c1397h2;
                    }
                    l3.h0(c1397h, abstractC1404o, f6, gVar, 3);
                }
            }
        }
        l3.b();
    }
}
