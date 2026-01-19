package Q0;

import H0.C0139a0;
import H0.C0149f0;
import H0.J;
import H0.i0;
import H0.q0;
import I0.C0219y0;
import O.C0316k;
import S.l;
import android.os.Handler;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import e1.j;
import h0.AbstractC1025b;
import k.I;
import n0.C1352a;
import o0.C1382D;
import o0.y;

/* loaded from: classes.dex */
public final class b {
    public final C0316k a;

    /* renamed from: b, reason: collision with root package name */
    public final e f6315b;

    /* renamed from: c, reason: collision with root package name */
    public final I f6316c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6317d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6318e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6319f;

    /* renamed from: g, reason: collision with root package name */
    public I.c f6320g;

    /* renamed from: h, reason: collision with root package name */
    public long f6321h;

    /* renamed from: i, reason: collision with root package name */
    public final A0.b f6322i;

    /* renamed from: j, reason: collision with root package name */
    public final C1352a f6323j;

    public b() {
        C0316k c0316k = new C0316k(2);
        c0316k.f4140c = new long[192];
        c0316k.f4141d = new long[192];
        this.a = c0316k;
        this.f6315b = new e();
        this.f6316c = new I();
        this.f6321h = -1L;
        this.f6322i = new A0.b(this, 8);
        this.f6323j = new C1352a();
    }

    public static long f(J j3) {
        C0149f0 c0149f0 = j3.f1721J;
        i0 i0Var = c0149f0.f1917d;
        long j4 = 0;
        for (i0 i0Var2 = c0149f0.f1916c; i0Var2 != null && i0Var2 != i0Var; i0Var2 = i0Var2.f1956t) {
            q0 q0Var = i0Var2.f1952O;
            if (q0Var != null && !y.r(((C0219y0) q0Var).b())) {
                return 9223372034707292159L;
            }
            j4 = j.e(j4, i0Var2.f1940C);
        }
        return j4;
    }

    public static void h(J j3) {
        if (j3.f1735f) {
            q0 q0Var = j3.f1721J.f1917d.f1952O;
            if (q0Var == null || y.r(((C0219y0) q0Var).b())) {
                j3.f1735f = false;
                if (j3.f1739j) {
                    j3.f1738i = f(j3);
                    j3.f1739j = false;
                }
                if (j.c(j3.f1738i, 9223372034707292159L)) {
                    return;
                }
                V.e z5 = j3.z();
                Object[] objArr = z5.f8759c;
                int i6 = z5.f8761f;
                for (int i7 = 0; i7 < i6; i7++) {
                    h((J) objArr[i7]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.b.a():void");
    }

    public final long b(J j3) {
        long j4;
        int i6 = j3.f1734e & 33554431;
        C0316k c0316k = this.a;
        long[] jArr = (long[]) c0316k.f4140c;
        int i7 = c0316k.f4139b;
        for (int i8 = 0; i8 < jArr.length - 2 && i8 < i7; i8 += 3) {
            if ((((int) jArr[i8 + 2]) & 33554431) == i6) {
                j4 = jArr[i8];
                break;
            }
        }
        j4 = Long.MAX_VALUE;
        if (j4 == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) (j4 >> 32)) << 32) | (((int) j4) & 4294967295L);
    }

    public final void c(J j3) {
        char c6;
        boolean z5;
        boolean z6 = true;
        j3.f1735f = true;
        j3.f1736g = 9223372034707292159L;
        C0149f0 c0149f0 = j3.f1721J;
        i0 i0Var = c0149f0.f1917d;
        C0139a0 c0139a0 = j3.f1722K.f1781p;
        int j02 = c0139a0.j0();
        float i02 = c0139a0.i0();
        C1352a c1352a = this.f6323j;
        c1352a.a = l.f7374V;
        c1352a.f13291b = l.f7374V;
        c1352a.f13292c = j02;
        c1352a.f13293d = i02;
        while (true) {
            c6 = SequenceUtils.SPC;
            if (i0Var == null) {
                break;
            }
            J j4 = i0Var.f1954r;
            if (i0Var == j4.f1721J.f1917d && !j4.f1735f) {
                if (!j.c(b(j4), 9223372034707292159L)) {
                    c1352a.c((Float.floatToRawIntBits((int) (r11 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (r11 >> 32)) << 32));
                    break;
                }
            }
            q0 q0Var = i0Var.f1952O;
            if (q0Var != null) {
                float[] b5 = ((C0219y0) q0Var).b();
                if (!y.r(b5)) {
                    C1382D.c(b5, c1352a);
                }
            }
            long j5 = i0Var.f1940C;
            c1352a.c((4294967295L & Float.floatToRawIntBits((int) (j5 & 4294967295L))) | (Float.floatToRawIntBits((int) (j5 >> 32)) << 32));
            i0Var = i0Var.f1956t;
        }
        int i6 = (int) c1352a.a;
        int i7 = (int) c1352a.f13291b;
        int i8 = (int) c1352a.f13292c;
        int i9 = (int) c1352a.f13293d;
        int i10 = j3.f1734e;
        boolean z7 = j3.f1740k;
        j3.f1740k = true;
        C0316k c0316k = this.a;
        if (z7) {
            int i11 = i10 & 33554431;
            long[] jArr = (long[]) c0316k.f4140c;
            int i12 = c0316k.f4139b;
            int i13 = 0;
            while (i13 < jArr.length - 2 && i13 < i12) {
                int i14 = i13 + 2;
                char c7 = c6;
                C0316k c0316k2 = c0316k;
                long j6 = jArr[i14];
                z5 = z6;
                if ((((int) j6) & 33554431) == i11) {
                    jArr[i13] = (i6 << c7) | (i7 & 4294967295L);
                    jArr[i13 + 1] = (i9 & 4294967295L) | (i8 << c7);
                    jArr[i14] = (((j6 >> 63) & 1) << 60) | j6;
                    break;
                } else {
                    i13 += 3;
                    c6 = c7;
                    c0316k = c0316k2;
                    z6 = z5;
                }
            }
        }
        z5 = z6;
        C0316k c0316k3 = c0316k;
        J v5 = j3.v();
        c0316k3.e(i10, i6, i7, i8, i9, (r22 & 32) != 0 ? -1 : v5 != null ? v5.f1734e : -1, c0149f0.d(PegdownExtensions.ANCHORLINKS), c0149f0.d(16), this.f6315b.a.a(i10), -1);
        this.f6317d = z5;
        V.e z8 = j3.z();
        Object[] objArr = z8.f8759c;
        int i15 = z8.f8761f;
        for (int i16 = 0; i16 < i15; i16++) {
            J j7 = (J) objArr[i16];
            if (j7.I()) {
                c(j7);
            }
        }
    }

    public final void d(J j3) {
        if (j3.f1740k) {
            this.f6317d = true;
            int i6 = j3.f1734e & 33554431;
            C0316k c0316k = this.a;
            long[] jArr = (long[]) c0316k.f4140c;
            int i7 = c0316k.f4139b;
            int i8 = 0;
            while (true) {
                if (i8 >= jArr.length - 2 || i8 >= i7) {
                    break;
                }
                int i9 = i8 + 2;
                long j4 = jArr[i9];
                if ((((int) j4) & 33554431) == i6) {
                    jArr[i9] = (((j4 >> 63) & 1) << 60) | j4;
                    break;
                }
                i8 += 3;
            }
        }
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(J j3, boolean z5) {
        long j4;
        q0 q0Var;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean I5 = j3.I();
        C0149f0 c0149f0 = j3.f1721J;
        if (I5) {
            J v5 = j3.v();
            if (v5 == null || v5.f1735f) {
                j4 = v5 == null ? 0L : 9223372034707292159L;
            } else {
                if (v5.f1739j) {
                    v5.f1739j = false;
                    v5.f1738i = f(v5);
                }
                j4 = v5.f1738i;
            }
            i0 i0Var = c0149f0.f1917d;
            if (j.c(j4, 9223372034707292159L) || !((q0Var = i0Var.f1952O) == null || y.r(((C0219y0) q0Var).b()))) {
                c(j3);
                return;
            }
            if (j3.f1735f) {
                c(j3);
                h(j3);
                return;
            }
            long e6 = j.e(j4, i0Var.f1940C);
            C0139a0 c0139a0 = j3.f1722K.f1781p;
            int j02 = c0139a0.j0();
            int i02 = c0139a0.i0();
            long j5 = (j02 << 32) | (i02 & 4294967295L);
            int i10 = j3.f1734e;
            boolean z6 = j3.f1740k;
            int i11 = 33554431;
            C0316k c0316k = this.a;
            if (!z6) {
                j3.f1740k = true;
                boolean d6 = c0149f0.d(PegdownExtensions.ANCHORLINKS);
                boolean d7 = c0149f0.d(16);
                boolean a = this.f6315b.a.a(i10);
                if (v5 != null) {
                    int i12 = v5.f1734e;
                    int i13 = (int) (e6 >> 32);
                    int i14 = (int) (e6 & 4294967295L);
                    Object[] objArr = 32;
                    int i15 = i10 & 33554431;
                    long[] jArr = (long[]) c0316k.f4140c;
                    int i16 = c0316k.f4139b;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= jArr.length - 2 || i17 >= i16) {
                            break;
                        }
                        Object[] objArr2 = objArr;
                        long[] jArr2 = jArr;
                        if ((((int) jArr2[i17 + 2]) & i11) == i12) {
                            long j6 = jArr2[i17];
                            int i18 = ((int) (j6 >> (objArr2 == true ? 1L : 0L))) + i13;
                            int i19 = ((int) j6) + i14;
                            c0316k.e(i15, i18, i19, i18 + j02, i19 + i02, i12, d6, d7, a, i17);
                            break;
                        }
                        i17 += 3;
                        objArr = objArr2 == true ? 1 : 0;
                        jArr = jArr2;
                        i11 = i11;
                        i12 = i12;
                    }
                } else {
                    int i20 = (int) (e6 >> 32);
                    int i21 = (int) (e6 & 4294967295L);
                    c0316k.e(i10, i20, i21, i20 + j02, i21 + i02, (r22 & 32) != 0 ? -1 : 0, d6, d7, a, -1);
                }
                this.f6317d = true;
            } else if (z5 || !j.c(e6, j3.f1736g) || !e1.l.b(j5, j3.f1737h)) {
                if (v5 == null) {
                    int i22 = (int) (e6 >> 32);
                    int i23 = (int) (e6 & 4294967295L);
                    int i24 = i22 + j02;
                    int i25 = i23 + i02;
                    int i26 = i10 & 33554431;
                    long[] jArr3 = (long[]) c0316k.f4140c;
                    int i27 = c0316k.f4139b;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= jArr3.length - 2 || i28 >= i27) {
                            break;
                        }
                        int i29 = i28 + 2;
                        int i30 = i27;
                        int i31 = i28;
                        long j7 = jArr3[i29];
                        long[] jArr4 = jArr3;
                        if ((((int) j7) & 33554431) == i26) {
                            long j8 = jArr4[i31];
                            jArr4[i31] = (i22 << 32) | (i23 & 4294967295L);
                            jArr4[i31 + 1] = (i24 << 32) | (i25 & 4294967295L);
                            jArr4[i29] = j7 | (((j7 >> 63) & 1) << 60);
                            int i32 = i22 - ((int) (j8 >> 32));
                            int i33 = i23 - ((int) j8);
                            if ((i32 != 0) | (i33 != 0)) {
                                c0316k.h(i32, i33, (j7 & a.f6313b) | (((i31 + 3) & 33554431) << 25));
                            }
                        } else {
                            i28 = i31 + 3;
                            i27 = i30;
                            jArr3 = jArr4;
                        }
                    }
                } else {
                    int i34 = v5.f1734e;
                    int i35 = (int) (e6 >> 32);
                    int i36 = (int) (e6 & 4294967295L);
                    int i37 = i10 & 33554431;
                    long[] jArr5 = (long[]) c0316k.f4140c;
                    int i38 = c0316k.f4139b;
                    int i39 = 0;
                    while (true) {
                        if (i39 >= jArr5.length - 2 || i39 >= i38) {
                            break;
                        }
                        int i40 = j02;
                        if ((((int) jArr5[i39 + 2]) & 33554431) == i34) {
                            long j9 = jArr5[i39];
                            i8 = i35;
                            i9 = i36;
                            int i41 = ((int) (j9 >> 32)) + i8;
                            int i42 = ((int) j9) + i9;
                            int i43 = i41 + i40;
                            int i44 = i42 + i02;
                            int i45 = i39 + 3;
                            i6 = i34;
                            while (i45 < jArr5.length - 2 && i45 < i38) {
                                int i46 = i45 + 2;
                                int i47 = i38;
                                long j10 = jArr5[i46];
                                int i48 = i45;
                                if ((((int) j10) & 33554431) == i37) {
                                    long j11 = jArr5[i48];
                                    int i49 = i41 - ((int) (j11 >> 32));
                                    int i50 = i42 - ((int) j11);
                                    jArr5[i48] = (i41 << 32) | (i42 & 4294967295L);
                                    jArr5[i48 + 1] = (i43 << 32) | (i44 & 4294967295L);
                                    jArr5[i46] = j10 | (((j10 >> 63) & 1) << 60);
                                    if (i49 != 0 || i50 != 0) {
                                        c0316k.h(i49, i50, (j10 & a.f6313b) | (((i48 + 3) & 33554431) << 25));
                                    }
                                } else {
                                    i45 = i48 + 3;
                                    i38 = i47;
                                }
                            }
                            i7 = i38;
                            i39 = i45;
                        } else {
                            i6 = i34;
                            i7 = i38;
                            i8 = i35;
                            i9 = i36;
                        }
                        i39 += 3;
                        j02 = i40;
                        i35 = i8;
                        i36 = i9;
                        i34 = i6;
                        i38 = i7;
                    }
                }
                this.f6317d = true;
            }
            j3.f1737h = j5;
            j3.f1736g = e6;
        }
    }

    public final void g(J j3) {
        if (j3.f1740k) {
            int i6 = j3.f1734e & 33554431;
            C0316k c0316k = this.a;
            long[] jArr = (long[]) c0316k.f4140c;
            int i7 = c0316k.f4139b;
            int i8 = 0;
            while (true) {
                if (i8 >= jArr.length - 2 || i8 >= i7) {
                    break;
                }
                int i9 = i8 + 2;
                if ((((int) jArr[i9]) & 33554431) == i6) {
                    jArr[i8] = -1;
                    jArr[i8 + 1] = -1;
                    jArr[i9] = a.f6314c;
                    break;
                }
                i8 += 3;
            }
            j3.f1740k = false;
            this.f6317d = true;
            this.f6319f = true;
        }
    }

    public final void i() {
        I.c cVar = this.f6320g;
        boolean z5 = cVar != null;
        long j3 = this.f6315b.f6338c;
        if (j3 >= 0 || !z5) {
            if (this.f6321h == j3 && z5) {
                return;
            }
            if (cVar != null) {
                Handler handler = AbstractC1025b.a;
                AbstractC1025b.a.removeCallbacks(cVar);
            }
            Handler handler2 = AbstractC1025b.a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j3, 16 + currentTimeMillis);
            this.f6321h = max;
            long j4 = max - currentTimeMillis;
            I.c cVar2 = new I.c(2, this.f6322i);
            AbstractC1025b.a.postDelayed(cVar2, j4);
            this.f6320g = cVar2;
        }
    }
}
