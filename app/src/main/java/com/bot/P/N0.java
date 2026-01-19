package p;

import D.o1;
import H0.InterfaceC0170z;
import T.C0601d0;
import com.vladsch.flexmark.util.format.TableCell;
import e1.C0959a;
import f0.AbstractC0983f;
import f0.AbstractC0997t;
import h0.AbstractC1040q;
import l4.InterfaceC1193a;
import r.X0;

/* loaded from: classes.dex */
public final class N0 extends AbstractC1040q implements InterfaceC0170z, H0.A0 {

    /* renamed from: r, reason: collision with root package name */
    public P0 f13605r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13606s;

    @Override // H0.A0
    public final void I(P0.x xVar) {
        P0.v.h(xVar);
        final int i6 = 0;
        final int i7 = 1;
        P0.j jVar = new P0.j(new InterfaceC1193a(this) { // from class: p.M0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N0 f13604e; {
                this.f13604e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int g3;
                switch (i6) {
                    case 0:
                        g3 = this.f13604e.f13605r.a.g();
                        break;
                    default:
                        g3 = this.f13604e.f13605r.f13618e.g();
                        break;
                }
                return Float.valueOf(g3);
            }
        }, new InterfaceC1193a(this) { // from class: p.M0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N0 f13604e; {
                this.f13604e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int g3;
                switch (i7) {
                    case 0:
                        g3 = this.f13604e.f13605r.a.g();
                        break;
                    default:
                        g3 = this.f13604e.f13605r.f13618e.g();
                        break;
                }
                return Float.valueOf(g3);
            }
        });
        if (this.f13606s) {
            P0.w wVar = P0.t.f4543v;
            s4.e eVar = P0.v.a[13];
            xVar.a(wVar, jVar);
        } else {
            P0.w wVar2 = P0.t.f4542u;
            s4.e eVar2 = P0.v.a[12];
            xVar.a(wVar2, jVar);
        }
    }

    @Override // H0.InterfaceC0170z
    public final int P(H0.S s5, F0.U u5, int i6) {
        if (!this.f13606s) {
            i6 = TableCell.NOT_TRACKED;
        }
        return u5.a0(i6);
    }

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        AbstractC1464z.h(j3, this.f13606s ? X0.f14183c : X0.f14184e);
        boolean z5 = this.f13606s;
        int i6 = TableCell.NOT_TRACKED;
        int g3 = z5 ? Integer.MAX_VALUE : C0959a.g(j3);
        if (this.f13606s) {
            i6 = C0959a.h(j3);
        }
        F0.k0 w5 = u5.w(C0959a.a(j3, 0, i6, 0, g3, 5));
        int i7 = w5.f1485c;
        int h3 = C0959a.h(j3);
        if (i7 > h3) {
            i7 = h3;
        }
        int i8 = w5.f1486e;
        int g6 = C0959a.g(j3);
        if (i8 > g6) {
            i8 = g6;
        }
        int i9 = w5.f1486e - i8;
        int i10 = w5.f1485c - i7;
        if (!this.f13606s) {
            i9 = i10;
        }
        P0 p02 = this.f13605r;
        C0601d0 c0601d0 = p02.f13618e;
        C0601d0 c0601d02 = p02.a;
        c0601d0.h(i9);
        AbstractC0983f e6 = AbstractC0997t.e();
        l4.c e7 = e6 != null ? e6.e() : null;
        AbstractC0983f h6 = AbstractC0997t.h(e6);
        try {
            if (c0601d02.g() > i9) {
                c0601d02.h(i9);
            }
            AbstractC0997t.k(e6, h6, e7);
            this.f13605r.f13615b.h(this.f13606s ? i8 : i7);
            this.f13605r.f13616c.h(this.f13606s ? w5.f1486e : w5.f1485c);
            return x5.D(i7, i8, Y3.w.f9813c, new o1(i9, 2, this, w5));
        } catch (Throwable th) {
            AbstractC0997t.k(e6, h6, e7);
            throw th;
        }
    }

    @Override // H0.InterfaceC0170z
    public final int j(H0.S s5, F0.U u5, int i6) {
        if (this.f13606s) {
            i6 = TableCell.NOT_TRACKED;
        }
        return u5.o(i6);
    }

    @Override // H0.InterfaceC0170z
    public final int m0(H0.S s5, F0.U u5, int i6) {
        if (!this.f13606s) {
            i6 = TableCell.NOT_TRACKED;
        }
        return u5.d(i6);
    }

    @Override // H0.InterfaceC0170z
    public final int z0(H0.S s5, F0.U u5, int i6) {
        if (this.f13606s) {
            i6 = TableCell.NOT_TRACKED;
        }
        return u5.q(i6);
    }
}
