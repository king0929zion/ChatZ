package n;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import f0.C0987j;
import k.C1147A;
import k.C1178z;
import l.AbstractC1180a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class L0 implements H0 {

    /* renamed from: c, reason: collision with root package name */
    public final C1178z f13015c;

    /* renamed from: e, reason: collision with root package name */
    public final C1147A f13016e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13017f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1349x f13018g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f13019h = G0.a;

    /* renamed from: i, reason: collision with root package name */
    public float[] f13020i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC1343r f13021j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC1343r f13022k;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC1343r f13023l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC1343r f13024m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f13025n;

    /* renamed from: o, reason: collision with root package name */
    public float[] f13026o;

    /* renamed from: p, reason: collision with root package name */
    public C0987j f13027p;

    public L0(C1178z c1178z, C1147A c1147a, int i6, InterfaceC1349x interfaceC1349x) {
        this.f13015c = c1178z;
        this.f13016e = c1147a;
        this.f13017f = i6;
        this.f13018g = interfaceC1349x;
        float[] fArr = G0.f12998b;
        this.f13020i = fArr;
        this.f13025n = fArr;
        this.f13026o = fArr;
        this.f13027p = G0.f12999c;
    }

    public final int c(int i6) {
        int i7;
        C1178z c1178z = this.f13015c;
        int i8 = c1178z.f12592b;
        c1178z.getClass();
        if (i8 <= 0 || i8 > c1178z.f12592b) {
            AbstractC1180a.d(FlexmarkHtmlConverter.DEFAULT_NODE);
            throw null;
        }
        int i9 = i8 - 1;
        int i10 = 0;
        while (true) {
            if (i10 <= i9) {
                i7 = (i10 + i9) >>> 1;
                int i11 = c1178z.a[i7];
                if (i11 >= i6) {
                    if (i11 <= i6) {
                        break;
                    }
                    i9 = i7 - 1;
                } else {
                    i10 = i7 + 1;
                }
            } else {
                i7 = -(i10 + 1);
                break;
            }
        }
        return i7 < -1 ? -(i7 + 2) : i7;
    }

    public final float d(int i6, int i7, boolean z5) {
        InterfaceC1349x interfaceC1349x;
        float f6;
        C1178z c1178z = this.f13015c;
        if (i6 >= c1178z.f12592b - 1) {
            f6 = i7;
        } else {
            int c6 = c1178z.c(i6);
            int c7 = c1178z.c(i6 + 1);
            if (i7 == c6) {
                f6 = c6;
            } else {
                int i8 = c7 - c6;
                K0 k02 = (K0) this.f13016e.b(c6);
                if (k02 == null || (interfaceC1349x = k02.f13014b) == null) {
                    interfaceC1349x = this.f13018g;
                }
                float f7 = i8;
                float c8 = interfaceC1349x.c((i7 - c6) / f7);
                if (z5) {
                    return c8;
                }
                f6 = (f7 * c8) + c6;
            }
        }
        return f6 / ((float) 1000);
    }

    public final void e(AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        float[] fArr;
        boolean z5 = this.f13027p != G0.f12999c;
        AbstractC1343r abstractC1343r4 = this.f13021j;
        C1147A c1147a = this.f13016e;
        C1178z c1178z = this.f13015c;
        if (abstractC1343r4 == null) {
            this.f13021j = abstractC1343r.c();
            this.f13022k = abstractC1343r3.c();
            int i6 = c1178z.f12592b;
            float[] fArr2 = new float[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                fArr2[i7] = c1178z.c(i7) / ((float) 1000);
            }
            this.f13020i = fArr2;
            int i8 = c1178z.f12592b;
            int[] iArr = new int[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                iArr[i9] = 0;
            }
            this.f13019h = iArr;
        }
        if (z5) {
            if (this.f13027p != G0.f12999c && AbstractC1276k.b(this.f13023l, abstractC1343r) && AbstractC1276k.b(this.f13024m, abstractC1343r2)) {
                return;
            }
            this.f13023l = abstractC1343r;
            this.f13024m = abstractC1343r2;
            int b5 = abstractC1343r.b() + (abstractC1343r.b() % 2);
            this.f13025n = new float[b5];
            this.f13026o = new float[b5];
            int i10 = c1178z.f12592b;
            float[][] fArr3 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int c6 = c1178z.c(i11);
                K0 k02 = (K0) c1147a.b(c6);
                if (c6 == 0 && k02 == null) {
                    fArr = new float[b5];
                    for (int i12 = 0; i12 < b5; i12++) {
                        fArr[i12] = abstractC1343r.a(i12);
                    }
                } else if (c6 == this.f13017f && k02 == null) {
                    fArr = new float[b5];
                    for (int i13 = 0; i13 < b5; i13++) {
                        fArr[i13] = abstractC1343r2.a(i13);
                    }
                } else {
                    AbstractC1276k.c(k02);
                    AbstractC1343r abstractC1343r5 = k02.a;
                    float[] fArr4 = new float[b5];
                    for (int i14 = 0; i14 < b5; i14++) {
                        fArr4[i14] = abstractC1343r5.a(i14);
                    }
                    fArr = fArr4;
                }
                fArr3[i11] = fArr;
            }
            this.f13027p = new C0987j(this.f13019h, this.f13020i, fArr3);
        }
    }

    @Override // n.F0
    public final AbstractC1343r i(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        AbstractC1343r abstractC1343r4;
        AbstractC1343r abstractC1343r5;
        float f6;
        boolean z5;
        AbstractC1343r abstractC1343r6 = abstractC1343r;
        AbstractC1343r abstractC1343r7 = abstractC1343r2;
        int[] iArr = G0.a;
        int i6 = 0;
        long j4 = (j3 / 1000000) - 0;
        int i7 = this.f13017f;
        long j5 = i7;
        if (j4 < 0) {
            j4 = 0;
        }
        if (j4 <= j5) {
            j5 = j4;
        }
        int i8 = (int) j5;
        C1147A c1147a = this.f13016e;
        K0 k02 = (K0) c1147a.b(i8);
        if (k02 != null) {
            return k02.a;
        }
        if (i8 >= i7) {
            return abstractC1343r7;
        }
        if (i8 <= 0) {
            return abstractC1343r6;
        }
        e(abstractC1343r6, abstractC1343r7, abstractC1343r3);
        AbstractC1343r abstractC1343r8 = this.f13021j;
        AbstractC1276k.c(abstractC1343r8);
        boolean z6 = true;
        if (this.f13027p != G0.f12999c) {
            float d6 = d(c(i8), i8, false);
            float[] fArr = this.f13025n;
            C1344s[][] c1344sArr = (C1344s[][]) this.f13027p.f11690e;
            int length = c1344sArr.length - 1;
            float f7 = c1344sArr[0][0].a;
            float f8 = c1344sArr[length][0].f13224b;
            int length2 = fArr.length;
            if (d6 < f7 || d6 > f8) {
                if (d6 > f8) {
                    f7 = f8;
                } else {
                    length = 0;
                }
                float f9 = d6 - f7;
                int i9 = 0;
                int i10 = 0;
                while (i9 < length2 - 1) {
                    C1344s c1344s = c1344sArr[length][i10];
                    boolean z7 = c1344s.f13238p;
                    float f10 = c1344s.f13240r;
                    float f11 = c1344s.f13239q;
                    if (z7) {
                        float f12 = c1344s.a;
                        float f13 = c1344s.f13233k;
                        f6 = f9;
                        float f14 = c1344s.f13225c;
                        fArr[i9] = (f11 * f6) + ((c1344s.f13227e - f14) * (f7 - f12) * f13) + f14;
                        float f15 = c1344s.f13226d;
                        fArr[i9 + 1] = (f6 * f10) + ((c1344s.f13228f - f15) * (f7 - f12) * f13) + f15;
                    } else {
                        f6 = f9;
                        c1344s.c(f7);
                        fArr[i9] = (c1344s.a() * f6) + (c1344s.f13236n * c1344s.f13230h) + f11;
                        fArr[i9 + 1] = (c1344s.b() * f6) + (c1344s.f13237o * c1344s.f13231i) + f10;
                    }
                    i9 += 2;
                    i10++;
                    f9 = f6;
                }
            } else {
                int length3 = c1344sArr.length;
                int i11 = 0;
                boolean z8 = false;
                while (i11 < length3) {
                    int i12 = i6;
                    int i13 = i12;
                    while (i12 < length2 - 1) {
                        C1344s c1344s2 = c1344sArr[i11][i13];
                        if (d6 <= c1344s2.f13224b) {
                            if (c1344s2.f13238p) {
                                float f16 = c1344s2.a;
                                float f17 = c1344s2.f13233k;
                                float f18 = c1344s2.f13225c;
                                z5 = z6;
                                fArr[i12] = ((c1344s2.f13227e - f18) * (d6 - f16) * f17) + f18;
                                float f19 = c1344s2.f13226d;
                                fArr[i12 + 1] = ((c1344s2.f13228f - f19) * (d6 - f16) * f17) + f19;
                            } else {
                                z5 = z6;
                                c1344s2.c(d6);
                                fArr[i12] = (c1344s2.f13236n * c1344s2.f13230h) + c1344s2.f13239q;
                                fArr[i12 + 1] = (c1344s2.f13237o * c1344s2.f13231i) + c1344s2.f13240r;
                            }
                            z8 = z5;
                        } else {
                            z5 = z6;
                        }
                        i12 += 2;
                        i13++;
                        z6 = z5;
                    }
                    boolean z9 = z6;
                    if (z8) {
                        break;
                    }
                    i11++;
                    z6 = z9;
                    i6 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i14 = 0; i14 < length4; i14++) {
                abstractC1343r8.e(fArr[i14], i14);
            }
        } else {
            int c6 = c(i8);
            float d7 = d(c6, i8, true);
            C1178z c1178z = this.f13015c;
            K0 k03 = (K0) c1147a.b(c1178z.c(c6));
            if (k03 != null && (abstractC1343r5 = k03.a) != null) {
                abstractC1343r6 = abstractC1343r5;
            }
            K0 k04 = (K0) c1147a.b(c1178z.c(c6 + 1));
            if (k04 != null && (abstractC1343r4 = k04.a) != null) {
                abstractC1343r7 = abstractC1343r4;
            }
            int b5 = abstractC1343r8.b();
            for (int i15 = 0; i15 < b5; i15++) {
                abstractC1343r8.e((abstractC1343r7.a(i15) * d7) + ((1 - d7) * abstractC1343r6.a(i15)), i15);
            }
        }
        return abstractC1343r8;
    }

    @Override // n.H0
    public final int p() {
        return 0;
    }

    @Override // n.F0
    public final AbstractC1343r q(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        int[] iArr = G0.a;
        int i6 = 0;
        long j4 = (j3 / 1000000) - 0;
        long j5 = this.f13017f;
        if (j4 < 0) {
            j4 = 0;
        }
        long j6 = j4 > j5 ? j5 : j4;
        if (j6 < 0) {
            return abstractC1343r3;
        }
        e(abstractC1343r, abstractC1343r2, abstractC1343r3);
        AbstractC1343r abstractC1343r4 = this.f13022k;
        AbstractC1276k.c(abstractC1343r4);
        if (this.f13027p != G0.f12999c) {
            int i7 = (int) j6;
            float d6 = d(c(i7), i7, false);
            float[] fArr = this.f13026o;
            C1344s[][] c1344sArr = (C1344s[][]) this.f13027p.f11690e;
            float f6 = c1344sArr[0][0].a;
            float f7 = c1344sArr[c1344sArr.length - 1][0].f13224b;
            if (d6 < f6) {
                d6 = f6;
            }
            if (d6 <= f7) {
                f7 = d6;
            }
            int length = fArr.length;
            boolean z5 = false;
            for (C1344s[] c1344sArr2 : c1344sArr) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < length - 1) {
                    C1344s c1344s = c1344sArr2[i9];
                    if (f7 <= c1344s.f13224b) {
                        if (c1344s.f13238p) {
                            fArr[i8] = c1344s.f13239q;
                            fArr[i8 + 1] = c1344s.f13240r;
                        } else {
                            c1344s.c(f7);
                            fArr[i8] = c1344s.a();
                            fArr[i8 + 1] = c1344s.b();
                        }
                        z5 = true;
                    }
                    i8 += 2;
                    i9++;
                }
                if (z5) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i6 < length2) {
                abstractC1343r4.e(fArr[i6], i6);
                i6++;
            }
        } else {
            AbstractC1343r i10 = i((j6 - 1) * 1000000, abstractC1343r, abstractC1343r2, abstractC1343r3);
            AbstractC1343r i11 = i(j6 * 1000000, abstractC1343r, abstractC1343r2, abstractC1343r3);
            int b5 = i10.b();
            while (i6 < b5) {
                abstractC1343r4.e((i10.a(i6) - i11.a(i6)) * 1000.0f, i6);
                i6++;
            }
        }
        return abstractC1343r4;
    }

    @Override // n.H0
    public final int r() {
        return this.f13017f;
    }
}
