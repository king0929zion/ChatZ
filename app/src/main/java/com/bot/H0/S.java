package H0;

import F0.AbstractC0107a;
import F0.C0127o;
import F0.InterfaceC0134w;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class S extends F0.k0 implements InterfaceC0143c0, F0.X {

    /* renamed from: i, reason: collision with root package name */
    public O f1796i;

    /* renamed from: j, reason: collision with root package name */
    public l4.c f1797j;

    /* renamed from: k, reason: collision with root package name */
    public v0 f1798k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1799l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1800m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1801n;

    /* renamed from: o, reason: collision with root package name */
    public final F0.S f1802o = new F0.S(this, 0);

    /* renamed from: p, reason: collision with root package name */
    public z0 f1803p;

    /* renamed from: q, reason: collision with root package name */
    public k.M f1804q;

    public static void I0(i0 i0Var) {
        K k3;
        i0 i0Var2 = i0Var.f1955s;
        J j3 = i0Var.f1954r;
        if (!AbstractC1276k.b(i0Var2 != null ? i0Var2.f1954r : null, j3)) {
            j3.f1722K.f1781p.f1854B.f();
            return;
        }
        InterfaceC0138a h3 = j3.f1722K.f1781p.h();
        if (h3 == null || (k3 = ((C0139a0) h3).f1854B) == null) {
            return;
        }
        k3.f();
    }

    public abstract S A0();

    public abstract InterfaceC0134w B0();

    public abstract boolean C0();

    public abstract J D0();

    @Override // F0.X
    public final F0.W E(int i6, int i7, Map map, l4.c cVar, l4.c cVar2) {
        if ((i6 & (-16777216)) != 0 || ((-16777216) & i7) != 0) {
            E0.a.b("Size(" + i6 + " x " + i7 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new Q(i6, i7, map, cVar, cVar2, this);
    }

    public abstract F0.W E0();

    public abstract S F0();

    public abstract long G0();

    public final O H0() {
        O o5 = this.f1796i;
        if (o5 != null) {
            return o5;
        }
        O o6 = new O(this);
        this.f1796i = o6;
        return o6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0(k.N n3) {
        J j3;
        Object[] objArr = n3.f12490b;
        long[] jArr = n3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j4 = jArr[i6];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j4) < 128 && (j3 = (J) ((H0) objArr[(i6 << 3) + i8]).get()) != null) {
                        if (d0()) {
                            j3.U(false);
                        } else {
                            j3.W(false);
                        }
                    }
                    j4 >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    public abstract void K0();

    @Override // H0.InterfaceC0143c0
    public final void M(boolean z5) {
        S F02 = F0();
        J D0 = F02 != null ? F02.D0() : null;
        if (AbstractC1276k.b(D0, D0())) {
            this.f1799l = z5;
            return;
        }
        if ((D0 != null ? D0.f1722K.f1769d : null) != F.f1698f) {
            if ((D0 != null ? D0.f1722K.f1769d : null) != F.f1699g) {
                return;
            }
        }
        this.f1799l = z5;
    }

    @Override // F0.r
    public boolean d0() {
        return false;
    }

    @Override // F0.k0
    public final int f0(AbstractC0107a abstractC0107a) {
        int x02;
        if (C0() && (x02 = x0(abstractC0107a)) != Integer.MIN_VALUE) {
            return x02 + ((int) (abstractC0107a instanceof F0.z0 ? this.f1489h >> 32 : this.f1489h & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(H0.J r32, F0.C0127o r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.S.v0(H0.J, F0.o):void");
    }

    public abstract int x0(AbstractC0107a abstractC0107a);

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0(v0 v0Var, long j3, long j4) {
        boolean z5;
        char c6;
        long j5;
        long j6;
        long j7;
        J j8;
        boolean z6;
        int i6;
        char c7;
        long j9;
        t0 snapshotObserver;
        k.M m3 = this.f1804q;
        z0 z0Var = this.f1803p;
        if (z0Var == null) {
            z0Var = new z0();
            this.f1803p = z0Var;
        }
        z0 z0Var2 = z0Var;
        r0 r0Var = D0().f1747r;
        if (r0Var != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.d(v0Var, C0144d.f1890g, new P(this, j3, j4, v0Var));
        }
        boolean d02 = d0();
        k.N n3 = (k.N) z0Var2.f2018e;
        k.N n5 = (k.N) z0Var2.f2019f;
        int i7 = z0Var2.a;
        for (int i8 = 0; i8 < i7; i8++) {
            byte b5 = ((byte[]) z0Var2.f2017d)[i8];
            if (b5 == 3) {
                C0127o c0127o = ((C0127o[]) z0Var2.f2015b)[i8];
                AbstractC1276k.c(c0127o);
                n5.j(c0127o);
            } else if (b5 != 0 && m3 != null) {
                C0127o c0127o2 = ((C0127o[]) z0Var2.f2015b)[i8];
                AbstractC1276k.c(c0127o2);
                k.N n6 = (k.N) m3.k(c0127o2);
                if (n6 != null) {
                    n3.k(n6);
                }
            }
        }
        int i9 = z0Var2.a;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            byte[] bArr = (byte[]) z0Var2.f2017d;
            if (bArr[i11] == 2) {
                i10++;
            } else if (i10 > 0) {
                C0127o[] c0127oArr = (C0127o[]) z0Var2.f2015b;
                c0127oArr[i11 - i10] = c0127oArr[i11];
            }
            bArr[i11] = 2;
        }
        int i12 = z0Var2.a;
        for (int i13 = i12 - i10; i13 < i12; i13++) {
            ((C0127o[]) z0Var2.f2015b)[i13] = null;
        }
        z0Var2.a -= i10;
        S F02 = F0();
        Object[] objArr = n5.f12490b;
        long[] jArr = n5.a;
        int length = jArr.length - 2;
        char c8 = 7;
        long j10 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            j6 = 128;
            int i15 = 0;
            while (true) {
                long j11 = jArr[i15];
                j7 = 255;
                if ((((~j11) << c8) & j11 & j10) != j10) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            c7 = c8;
                            C0127o c0127o3 = (C0127o) objArr[(i15 << 3) + i17];
                            j9 = j10;
                            S s5 = F02 == null ? this : F02;
                            i6 = i14;
                            S s6 = s5;
                            while (true) {
                                z0 z0Var3 = s6.f1803p;
                                if (z0Var3 != null) {
                                    z6 = d02;
                                    if (Y3.k.b0(c0127o3, (C0127o[]) z0Var3.f2015b)) {
                                        break;
                                    }
                                } else {
                                    z6 = d02;
                                }
                                S F03 = s6.F0();
                                if (F03 == null) {
                                    break;
                                }
                                s6 = F03;
                                d02 = z6;
                            }
                            k.M m5 = s6.f1804q;
                            k.N n7 = m5 != null ? (k.N) m5.k(c0127o3) : null;
                            if (n7 != null) {
                                s5.J0(n7);
                            }
                        } else {
                            z6 = d02;
                            i6 = i14;
                            c7 = c8;
                            j9 = j10;
                        }
                        j11 >>= i6;
                        i17++;
                        c8 = c7;
                        j10 = j9;
                        i14 = i6;
                        d02 = z6;
                    }
                    z5 = d02;
                    c6 = c8;
                    j5 = j10;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    z5 = d02;
                    c6 = c8;
                    j5 = j10;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c8 = c6;
                j10 = j5;
                d02 = z5;
                i14 = 8;
            }
        } else {
            z5 = d02;
            c6 = 7;
            j5 = -9187201950435737472L;
            j6 = 128;
            j7 = 255;
        }
        n5.b();
        Object[] objArr2 = n3.f12490b;
        long[] jArr2 = n3.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i18 = 0;
            while (true) {
                long j12 = jArr2[i18];
                if ((((~j12) << c6) & j12 & j5) != j5) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    for (int i20 = 0; i20 < i19; i20++) {
                        if ((j12 & j7) < j6 && (j8 = (J) ((H0) objArr2[(i18 << 3) + i20]).get()) != null) {
                            if (z5) {
                                j8.U(false);
                            } else {
                                j8.W(false);
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    }
                }
                if (i18 == length2) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        n3.b();
    }

    public final void z0(F0.W w5) {
        long j3;
        long j4;
        k.M m3 = this.f1804q;
        if (!this.f1801n) {
            l4.c f6 = w5.f();
            if (f6 != null) {
                boolean z5 = this.f1797j != f6;
                if (z5 || !H0().f1783c) {
                    j3 = 0;
                    j4 = 9223372034707292159L;
                } else {
                    InterfaceC0134w B02 = B0();
                    long Q5 = Y3.C.Q(B02.r(0L));
                    long m5 = B02.m();
                    j4 = Q5;
                    j3 = m5;
                    z5 = (e1.j.c(Q5, H0().f1784e) && e1.l.b(m5, H0().f1785f)) ? false : true;
                }
                if (z5) {
                    v0 v0Var = this.f1798k;
                    if (v0Var != null) {
                        v0Var.f2002c = w5;
                    } else {
                        v0Var = new v0(w5, this);
                        this.f1798k = v0Var;
                    }
                    y0(v0Var, j4, j3);
                    this.f1797j = w5.f();
                }
            } else if (m3 != null) {
                Object[] objArr = m3.f12486c;
                long[] jArr = m3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j5 = jArr[i6];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j5) < 128) {
                                    J0((k.N) objArr[(i6 << 3) + i8]);
                                }
                                j5 >>= 8;
                            }
                            if (i7 != 8) {
                                break;
                            }
                        }
                        if (i6 == length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                m3.a();
            }
        }
    }
}
