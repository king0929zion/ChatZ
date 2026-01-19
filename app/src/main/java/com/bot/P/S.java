package p;

import B0.C0040p;
import D.C0057a0;
import android.view.KeyEvent;
import k.AbstractC1171s;
import k.C1151E;
import l4.InterfaceC1193a;
import t.C1682j;
import x4.AbstractC1888A;
import x4.InterfaceC1922e0;
import z0.AbstractC2015c;

/* loaded from: classes.dex */
public final class S extends r {

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC1193a f13645P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f13646Q;

    /* renamed from: R, reason: collision with root package name */
    public final C1151E f13647R;

    /* renamed from: S, reason: collision with root package name */
    public final C1151E f13648S;

    public S(InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, C1682j c1682j, boolean z5, boolean z6) {
        super(c1682j, null, z5, z6, null, null, interfaceC1193a);
        this.f13645P = interfaceC1193a2;
        this.f13646Q = true;
        C1151E c1151e = AbstractC1171s.a;
        this.f13647R = new C1151E();
        this.f13648S = new C1151E();
    }

    @Override // h0.AbstractC1040q
    public final void G0() {
        b1();
    }

    @Override // p.r
    public final void P0(P0.x xVar) {
        if (this.f13645P != null) {
            Y3.l lVar = new Y3.l(this, 15);
            s4.e[] eVarArr = P0.v.a;
            xVar.a(P0.l.f4468c, new P0.a(null, lVar));
        }
    }

    @Override // p.r
    public final B0.X Q0() {
        C0057a0 c0057a0 = new C0057a0(this, 6);
        C0040p c0040p = B0.Q.a;
        return new B0.X(null, null, c0057a0);
    }

    @Override // p.r
    public final void X0() {
        b1();
    }

    @Override // p.r
    public final boolean Y0(KeyEvent keyEvent) {
        boolean z5;
        long b5 = AbstractC2015c.b(keyEvent);
        if (this.f13645P != null) {
            C1151E c1151e = this.f13647R;
            if (c1151e.e(b5) == null) {
                c1151e.h(b5, AbstractC1888A.y(A0(), null, new Q(this, null), 3));
                z5 = true;
                return z5;
            }
        }
        z5 = false;
        return z5;
    }

    @Override // p.r
    public final void Z0(KeyEvent keyEvent) {
        long b5 = AbstractC2015c.b(keyEvent);
        C1151E c1151e = this.f13647R;
        boolean z5 = false;
        if (c1151e.e(b5) != null) {
            InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) c1151e.e(b5);
            if (interfaceC1922e0 != null) {
                if (interfaceC1922e0.d()) {
                    interfaceC1922e0.f(null);
                } else {
                    z5 = true;
                }
            }
            c1151e.g(b5);
        }
        if (z5) {
            return;
        }
        this.f13787z.b();
    }

    public final void b1() {
        char c6;
        long j3;
        long j4;
        long j5;
        char c7;
        long j6;
        C1151E c1151e = this.f13647R;
        Object[] objArr = c1151e.f12448c;
        long[] jArr = c1151e.a;
        int length = jArr.length - 2;
        char c8 = 7;
        long j7 = -9187201950435737472L;
        if (length >= 0) {
            int i6 = 0;
            j4 = 128;
            while (true) {
                long j8 = jArr[i6];
                j5 = 255;
                if ((((~j8) << c8) & j8 & j7) != j7) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j8 & 255) < 128) {
                            c7 = c8;
                            j6 = j7;
                            ((InterfaceC1922e0) objArr[(i6 << 3) + i8]).f(null);
                        } else {
                            c7 = c8;
                            j6 = j7;
                        }
                        j8 >>= 8;
                        i8++;
                        c8 = c7;
                        j7 = j6;
                    }
                    c6 = c8;
                    j3 = j7;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    c6 = c8;
                    j3 = j7;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                c8 = c6;
                j7 = j3;
            }
        } else {
            c6 = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        c1151e.a();
        C1151E c1151e2 = this.f13648S;
        Object[] objArr2 = c1151e2.f12448c;
        long[] jArr2 = c1151e2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j9 = jArr2[i9];
                if ((((~j9) << c6) & j9 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j9 & j5) < j4) {
                            ((N) objArr2[(i9 << 3) + i11]).getClass();
                            throw null;
                        }
                        j9 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i9 == length2) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        c1151e2.a();
    }
}
