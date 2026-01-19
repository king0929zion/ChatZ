package T;

import H0.C0166v;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import k.AbstractC1169p;
import k.C1147A;
import k.C1148B;
import k.C1178z;
import l.AbstractC1180a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class M0 {
    public final J0 a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f7986b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f7987c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7988d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f7989e;

    /* renamed from: f, reason: collision with root package name */
    public C1147A f7990f;

    /* renamed from: g, reason: collision with root package name */
    public int f7991g;

    /* renamed from: h, reason: collision with root package name */
    public int f7992h;

    /* renamed from: i, reason: collision with root package name */
    public int f7993i;

    /* renamed from: j, reason: collision with root package name */
    public int f7994j;

    /* renamed from: k, reason: collision with root package name */
    public int f7995k;

    /* renamed from: l, reason: collision with root package name */
    public int f7996l;

    /* renamed from: m, reason: collision with root package name */
    public int f7997m;

    /* renamed from: n, reason: collision with root package name */
    public int f7998n;

    /* renamed from: o, reason: collision with root package name */
    public int f7999o;

    /* renamed from: p, reason: collision with root package name */
    public final C0166v f8000p;

    /* renamed from: q, reason: collision with root package name */
    public final C0166v f8001q;

    /* renamed from: r, reason: collision with root package name */
    public final C0166v f8002r;

    /* renamed from: s, reason: collision with root package name */
    public C1147A f8003s;

    /* renamed from: t, reason: collision with root package name */
    public int f8004t;

    /* renamed from: u, reason: collision with root package name */
    public int f8005u;

    /* renamed from: v, reason: collision with root package name */
    public int f8006v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8007w;

    /* renamed from: x, reason: collision with root package name */
    public C1178z f8008x;

    public M0(J0 j02) {
        this.a = j02;
        int[] iArr = j02.f7966c;
        this.f7986b = iArr;
        Object[] objArr = j02.f7968f;
        this.f7987c = objArr;
        this.f7988d = j02.f7974l;
        this.f7989e = j02.f7975m;
        this.f7990f = j02.f7976n;
        int i6 = j02.f7967e;
        this.f7991g = i6;
        this.f7992h = (iArr.length / 5) - i6;
        int i7 = j02.f7969g;
        this.f7995k = i7;
        this.f7996l = objArr.length - i7;
        this.f7997m = i6;
        this.f8000p = new C0166v();
        this.f8001q = new C0166v();
        this.f8002r = new C0166v();
        this.f8005u = i6;
        this.f8006v = -1;
    }

    public static int i(int i6, int i7, int i8, int i9) {
        return i6 > i7 ? -(((i9 - i8) - i6) + 1) : i6;
    }

    public static void z(M0 m02) {
        int i6 = m02.f8006v;
        int r5 = m02.r(i6);
        int[] iArr = m02.f7986b;
        int i7 = (r5 * 5) + 1;
        int i8 = iArr[i7];
        if ((i8 & PegdownExtensions.SUPERSCRIPT) != 0) {
            return;
        }
        int i9 = (i8 & (-134217729)) | PegdownExtensions.SUPERSCRIPT;
        iArr[i7] = i9;
        if ((67108864 & i9) != 0) {
            return;
        }
        m02.T(m02.E(iArr, i6));
    }

    public final void A(J0 j02, int i6) {
        if (this.f7998n <= 0) {
            AbstractC0629s.a("Check failed");
        }
        if (i6 == 0 && this.f8004t == 0 && this.a.f7967e == 0) {
            int[] iArr = j02.f7966c;
            int i7 = iArr[(i6 * 5) + 3];
            int i8 = j02.f7967e;
            if (i7 == i8) {
                int[] iArr2 = this.f7986b;
                Object[] objArr = this.f7987c;
                ArrayList arrayList = this.f7988d;
                HashMap hashMap = this.f7989e;
                C1147A c1147a = this.f7990f;
                Object[] objArr2 = j02.f7968f;
                int i9 = j02.f7969g;
                HashMap hashMap2 = j02.f7975m;
                C1147A c1147a2 = j02.f7976n;
                this.f7986b = iArr;
                this.f7987c = objArr2;
                this.f7988d = j02.f7974l;
                this.f7991g = i8;
                this.f7992h = (iArr.length / 5) - i8;
                this.f7995k = i9;
                this.f7996l = objArr2.length - i9;
                this.f7997m = i8;
                this.f7989e = hashMap2;
                this.f7990f = c1147a2;
                j02.f7966c = iArr2;
                j02.f7967e = 0;
                j02.f7968f = objArr;
                j02.f7969g = 0;
                j02.f7974l = arrayList;
                j02.f7975m = hashMap;
                j02.f7976n = c1147a;
                return;
            }
        }
        M0 d6 = j02.d();
        try {
            r.y(d6, i6, this, true, true, false);
            d6.e(true);
        } catch (Throwable th) {
            d6.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f7986b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        Y3.k.h0(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        Y3.k.h0(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r9) {
        /*
            r8 = this;
            int r0 = r8.f7992h
            int r1 = r8.f7991g
            if (r1 == r9) goto Lad
            java.util.ArrayList r2 = r8.f7988d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5b
            int r2 = r8.f7992h
            int r3 = r8.o()
            int r3 = r3 - r2
            if (r1 >= r9) goto L39
            java.util.ArrayList r2 = r8.f7988d
            int r2 = T.L0.b(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r8.f7988d
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r8.f7988d
            java.lang.Object r4 = r4.get(r2)
            T.a r4 = (T.C0594a) r4
            int r5 = r4.a
            if (r5 >= 0) goto L5b
            int r5 = r5 + r3
            if (r5 >= r9) goto L5b
            r4.a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            java.util.ArrayList r2 = r8.f7988d
            int r2 = T.L0.b(r2, r9, r3)
        L3f:
            java.util.ArrayList r4 = r8.f7988d
            int r4 = r4.size()
            if (r2 >= r4) goto L5b
            java.util.ArrayList r4 = r8.f7988d
            java.lang.Object r4 = r4.get(r2)
            T.a r4 = (T.C0594a) r4
            int r5 = r4.a
            if (r5 < 0) goto L5b
            int r5 = r3 - r5
            int r5 = -r5
            r4.a = r5
            int r2 = r2 + 1
            goto L3f
        L5b:
            if (r0 <= 0) goto L72
            int[] r2 = r8.f7986b
            int r3 = r9 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            if (r9 >= r1) goto L6c
            int r4 = r4 + r3
            Y3.k.h0(r2, r2, r4, r3, r5)
            goto L72
        L6c:
            int r6 = r5 + r4
            int r3 = r3 + r4
            Y3.k.h0(r2, r2, r5, r6, r3)
        L72:
            if (r9 >= r1) goto L76
            int r1 = r9 + r0
        L76:
            int r2 = r8.o()
            if (r1 >= r2) goto L7d
            goto L82
        L7d:
            java.lang.String r3 = "Check failed"
            T.AbstractC0629s.a(r3)
        L82:
            if (r1 >= r2) goto Lad
            int[] r3 = r8.f7986b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L91
            r6 = r3
            goto L97
        L91:
            int r6 = r8.p()
            int r6 = r6 + r3
            int r6 = r6 - r5
        L97:
            if (r6 >= r9) goto L9a
            goto La1
        L9a:
            int r7 = r8.p()
            int r7 = r7 - r6
            int r7 = r7 - r5
            int r6 = -r7
        La1:
            if (r6 == r3) goto La7
            int[] r3 = r8.f7986b
            r3[r4] = r6
        La7:
            int r1 = r1 + 1
            if (r1 != r9) goto L82
            int r1 = r1 + r0
            goto L82
        Lad:
            r8.f7991g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T.M0.B(int):void");
    }

    public final void C(int i6, int i7) {
        int i8 = this.f7996l;
        int i9 = this.f7995k;
        int i10 = this.f7997m;
        if (i9 != i6) {
            Object[] objArr = this.f7987c;
            if (i6 < i9) {
                System.arraycopy(objArr, i6, objArr, i6 + i8, i9 - i6);
            } else {
                int i11 = i9 + i8;
                System.arraycopy(objArr, i11, objArr, i9, (i6 + i8) - i11);
            }
        }
        int min = Math.min(i7 + 1, p());
        if (i10 != min) {
            int length = this.f7987c.length - i8;
            if (min < i10) {
                int r5 = r(min);
                int r6 = r(i10);
                int i12 = this.f7991g;
                while (r5 < r6) {
                    int i13 = (r5 * 5) + 4;
                    int i14 = this.f7986b[i13];
                    if (!(i14 >= 0)) {
                        AbstractC0629s.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f7986b[i13] = -((length - i14) + 1);
                    r5++;
                    if (r5 == i12) {
                        r5 += this.f7992h;
                    }
                }
            } else {
                int r7 = r(i10);
                int r8 = r(min);
                while (r7 < r8) {
                    int i15 = (r7 * 5) + 4;
                    int i16 = this.f7986b[i15];
                    if (!(i16 < 0)) {
                        AbstractC0629s.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f7986b[i15] = i16 + length + 1;
                    r7++;
                    if (r7 == this.f7991g) {
                        r7 += this.f7992h;
                    }
                }
            }
            this.f7997m = min;
        }
        this.f7995k = i6;
    }

    public final Object D(int i6) {
        int r5 = r(i6);
        int[] iArr = this.f7986b;
        if ((iArr[(r5 * 5) + 1] & 1073741824) != 0) {
            return this.f7987c[h(g(iArr, r5))];
        }
        return null;
    }

    public final int E(int[] iArr, int i6) {
        int i7 = iArr[(r(i6) * 5) + 2];
        return i7 > -2 ? i7 : (p() + i7) - (-2);
    }

    public final Object F(Object obj) {
        if (this.f7998n > 0) {
            x(1, this.f8006v);
        }
        Object[] objArr = this.f7987c;
        int i6 = this.f7993i;
        this.f7993i = i6 + 1;
        Object obj2 = objArr[h(i6)];
        if (this.f7993i > this.f7994j) {
            AbstractC0629s.a("Writing to an invalid slot");
        }
        this.f7987c[h(this.f7993i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i6;
        C1178z c1178z = this.f8008x;
        if (c1178z != null) {
            while (c1178z.f12592b != 0) {
                int I5 = r.I(c1178z);
                int r5 = r(I5);
                int i7 = I5 + 1;
                int u5 = u(I5) + I5;
                while (true) {
                    if (i7 >= u5) {
                        i6 = 0;
                        break;
                    } else {
                        if ((this.f7986b[(r(i7) * 5) + 1] & 201326592) != 0) {
                            i6 = 1;
                            break;
                        }
                        i7 += u(i7);
                    }
                }
                int[] iArr = this.f7986b;
                int i8 = (r5 * 5) + 1;
                int i9 = iArr[i8];
                if (((67108864 & i9) != 0 ? 1 : 0) != i6) {
                    iArr[i8] = (i6 << 26) | ((-67108865) & i9);
                    int E5 = E(iArr, I5);
                    if (E5 >= 0) {
                        r.l(c1178z, E5);
                    }
                }
            }
        }
    }

    public final boolean H() {
        if (!(this.f7998n == 0)) {
            AbstractC0629s.a("Cannot remove group while inserting");
        }
        int i6 = this.f8004t;
        int i7 = this.f7993i;
        int g3 = g(this.f7986b, r(i6));
        int L5 = L();
        O(this.f8006v);
        C1178z c1178z = this.f8008x;
        if (c1178z != null) {
            while (true) {
                int i8 = c1178z.f12592b;
                if (i8 == 0) {
                    break;
                }
                if (i8 == 0) {
                    AbstractC1180a.e("IntList is empty.");
                    throw null;
                }
                if (c1178z.a[0] < i6) {
                    break;
                }
                r.I(c1178z);
            }
        }
        boolean I5 = I(i6, this.f8004t - i6);
        J(g3, this.f7993i - g3, i6 - 1);
        this.f8004t = i6;
        this.f7993i = i7;
        this.f7999o -= L5;
        return I5;
    }

    public final boolean I(int i6, int i7) {
        if (i7 > 0) {
            ArrayList arrayList = this.f7988d;
            B(i6);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f7989e;
                int i8 = i6 + i7;
                int b5 = L0.b(this.f7988d, i8, o() - this.f7992h);
                if (b5 >= this.f7988d.size()) {
                    b5--;
                }
                int i9 = b5 + 1;
                int i10 = 0;
                while (b5 >= 0) {
                    C0594a c0594a = (C0594a) this.f7988d.get(b5);
                    int c6 = c(c0594a);
                    if (c6 < i6) {
                        break;
                    }
                    if (c6 < i8) {
                        c0594a.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i10 == 0) {
                            i10 = b5 + 1;
                        }
                        i9 = b5;
                    }
                    b5--;
                }
                r0 = i9 < i10;
                if (r0) {
                    this.f7988d.subList(i9, i10).clear();
                }
            }
            this.f7991g = i6;
            this.f7992h += i7;
            int i11 = this.f7997m;
            if (i11 > i6) {
                this.f7997m = Math.max(i6, i11 - i7);
            }
            int i12 = this.f8005u;
            if (i12 >= this.f7991g) {
                this.f8005u = i12 - i7;
            }
            int i13 = this.f8006v;
            if (i13 >= 0 && (this.f7986b[(r(i13) * 5) + 1] & PegdownExtensions.MULTI_LINE_IMAGE_URLS) != 0) {
                T(i13);
            }
        }
        return r0;
    }

    public final void J(int i6, int i7, int i8) {
        if (i7 > 0) {
            int i9 = this.f7996l;
            int i10 = i6 + i7;
            C(i10, i8);
            this.f7995k = i6;
            this.f7996l = i9 + i7;
            Y3.k.o0(null, this.f7987c, i6, i10);
            int i11 = this.f7994j;
            if (i11 >= i6) {
                this.f7994j = i11 - i7;
            }
        }
    }

    public final Object K(int i6, int i7, Object obj) {
        int N5 = N(this.f7986b, r(i6));
        int g3 = g(this.f7986b, r(i6 + 1));
        int i8 = N5 + i7;
        if (i8 < N5 || i8 >= g3) {
            AbstractC0629s.a("Write to an invalid slot index " + i7 + " for group " + i6);
        }
        int h3 = h(i8);
        Object[] objArr = this.f7987c;
        Object obj2 = objArr[h3];
        objArr[h3] = obj;
        return obj2;
    }

    public final int L() {
        int r5 = r(this.f8004t);
        int a = L0.a(this.f7986b, r5) + this.f8004t;
        this.f8004t = a;
        this.f7993i = g(this.f7986b, r(a));
        int i6 = this.f7986b[(r5 * 5) + 1];
        if ((1073741824 & i6) != 0) {
            return 1;
        }
        return i6 & 67108863;
    }

    public final void M() {
        int i6 = this.f8005u;
        this.f8004t = i6;
        this.f7993i = g(this.f7986b, r(i6));
    }

    public final int N(int[] iArr, int i6) {
        if (i6 >= o()) {
            return this.f7987c.length - this.f7996l;
        }
        int c6 = L0.c(iArr, i6);
        return c6 < 0 ? (this.f7987c.length - this.f7996l) + c6 + 1 : c6;
    }

    public final M O(int i6) {
        C0594a R5;
        HashMap hashMap = this.f7989e;
        if (hashMap == null || (R5 = R(i6)) == null) {
            return null;
        }
        return (M) hashMap.get(R5);
    }

    public final void P() {
        if (this.f7998n != 0) {
            AbstractC0629s.a("Key must be supplied when inserting");
        }
        C0602e c0602e = C0616l.a;
        Q(c0602e, false, c0602e, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Object obj, boolean z5, Object obj2, int i6) {
        int i7;
        int i8 = this.f8006v;
        Object[] objArr = this.f7998n > 0;
        this.f8002r.c(this.f7999o);
        C0602e c0602e = C0616l.a;
        if (objArr == true) {
            int i9 = this.f8004t;
            int g3 = g(this.f7986b, r(i9));
            w(1);
            this.f7993i = g3;
            this.f7994j = g3;
            int r5 = r(i9);
            int i10 = obj != c0602e ? 1 : 0;
            int i11 = (z5 || obj2 == c0602e) ? 0 : 1;
            int i12 = i(g3, this.f7995k, this.f7996l, this.f7987c.length);
            if (i12 >= 0 && this.f7997m < i9) {
                i12 = -(((this.f7987c.length - this.f7996l) - i12) + 1);
            }
            int[] iArr = this.f7986b;
            int i13 = this.f8006v;
            int i14 = r5 * 5;
            iArr[i14] = i6;
            iArr[i14 + 1] = ((z5 ? 1 : 0) << 30) | (i10 << 29) | (i11 << 28);
            iArr[i14 + 2] = i13;
            iArr[i14 + 3] = 0;
            iArr[i14 + 4] = i12;
            int i15 = (z5 ? 1 : 0) + i10 + i11;
            if (i15 > 0) {
                x(i15, i9);
                Object[] objArr2 = this.f7987c;
                int i16 = this.f7993i;
                if (z5) {
                    objArr2[i16] = obj2;
                    i16++;
                }
                if (i10 != 0) {
                    objArr2[i16] = obj;
                    i16++;
                }
                if (i11 != 0) {
                    objArr2[i16] = obj2;
                    i16++;
                }
                this.f7993i = i16;
            }
            this.f7999o = 0;
            i7 = i9 + 1;
            this.f8006v = i9;
            this.f8004t = i7;
            if (i8 >= 0) {
                O(i8);
            }
        } else {
            this.f8000p.c(i8);
            this.f8001q.c((o() - this.f7992h) - this.f8005u);
            int i17 = this.f8004t;
            int r6 = r(i17);
            if (!AbstractC1276k.b(obj2, c0602e)) {
                if (z5) {
                    U(this.f8004t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.f7993i = N(this.f7986b, r6);
            this.f7994j = g(this.f7986b, r(this.f8004t + 1));
            int[] iArr2 = this.f7986b;
            int i18 = r6 * 5;
            this.f7999o = iArr2[i18 + 1] & 67108863;
            this.f8006v = i17;
            this.f8004t = i17 + 1;
            i7 = i17 + iArr2[i18 + 3];
        }
        this.f8005u = i7;
    }

    public final C0594a R(int i6) {
        ArrayList arrayList;
        int e6;
        if (i6 < 0 || i6 >= p() || (e6 = L0.e((arrayList = this.f7988d), i6, p())) < 0) {
            return null;
        }
        return (C0594a) arrayList.get(e6);
    }

    public final void S(Object obj) {
        int r5 = r(this.f8004t);
        int i6 = (r5 * 5) + 1;
        if ((this.f7986b[i6] & PegdownExtensions.FORCELISTITEMPARA) == 0) {
            AbstractC0629s.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f7987c;
        int[] iArr = this.f7986b;
        objArr[h(Integer.bitCount(iArr[i6] >> 29) + g(iArr, r5))] = obj;
    }

    public final void T(int i6) {
        if (i6 >= 0) {
            C1178z c1178z = this.f8008x;
            if (c1178z == null) {
                c1178z = new C1178z();
                this.f8008x = c1178z;
            }
            r.l(c1178z, i6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.r(r5)
            int[] r1 = r4.f7986b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            T.AbstractC0629s.a(r5)
        L2e:
            java.lang.Object[] r5 = r4.f7987c
            int[] r1 = r4.f7986b
            int r0 = r4.g(r1, r0)
            int r0 = r4.h(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T.M0.U(int, java.lang.Object):void");
    }

    public final void a(int i6) {
        boolean z5 = false;
        if (!(i6 >= 0)) {
            AbstractC0629s.a("Cannot seek backwards");
        }
        if (!(this.f7998n <= 0)) {
            AbstractC0619m0.b("Cannot call seek() while inserting");
        }
        if (i6 == 0) {
            return;
        }
        int i7 = this.f8004t + i6;
        if (i7 >= this.f8006v && i7 <= this.f8005u) {
            z5 = true;
        }
        if (!z5) {
            AbstractC0629s.a("Cannot seek outside the current group (" + this.f8006v + '-' + this.f8005u + ')');
        }
        this.f8004t = i7;
        int g3 = g(this.f7986b, r(i7));
        this.f7993i = g3;
        this.f7994j = g3;
    }

    public final C0594a b(int i6) {
        ArrayList arrayList = this.f7988d;
        int e6 = L0.e(arrayList, i6, p());
        if (e6 >= 0) {
            return (C0594a) arrayList.get(e6);
        }
        if (i6 > this.f7991g) {
            i6 = -(p() - i6);
        }
        C0594a c0594a = new C0594a(i6);
        arrayList.add(-(e6 + 1), c0594a);
        return c0594a;
    }

    public final int c(C0594a c0594a) {
        int i6 = c0594a.a;
        return i6 < 0 ? p() + i6 : i6;
    }

    public final void d() {
        int i6 = this.f7998n;
        this.f7998n = i6 + 1;
        if (i6 == 0) {
            this.f8001q.c((o() - this.f7992h) - this.f8005u);
        }
    }

    public final void e(boolean z5) {
        this.f8007w = true;
        if (z5 && this.f8000p.f2001b == 0) {
            B(p());
            C(this.f7987c.length - this.f7996l, this.f7991g);
            int i6 = this.f7995k;
            Arrays.fill(this.f7987c, i6, this.f7996l + i6, (Object) null);
            G();
        }
        int[] iArr = this.f7986b;
        int i7 = this.f7991g;
        Object[] objArr = this.f7987c;
        int i8 = this.f7995k;
        ArrayList arrayList = this.f7988d;
        HashMap hashMap = this.f7989e;
        C1147A c1147a = this.f7990f;
        J0 j02 = this.a;
        if (!j02.f7972j) {
            AbstractC0619m0.a("Unexpected writer close()");
        }
        j02.f7972j = false;
        j02.f7966c = iArr;
        j02.f7967e = i7;
        j02.f7968f = objArr;
        j02.f7969g = i8;
        j02.f7974l = arrayList;
        j02.f7975m = hashMap;
        j02.f7976n = c1147a;
    }

    public final int f(int i6) {
        return g(this.f7986b, r(i6));
    }

    public final int g(int[] iArr, int i6) {
        if (i6 >= o()) {
            return this.f7987c.length - this.f7996l;
        }
        int i7 = iArr[(i6 * 5) + 4];
        return i7 < 0 ? (this.f7987c.length - this.f7996l) + i7 + 1 : i7;
    }

    public final int h(int i6) {
        return (this.f7996l * (i6 < this.f7995k ? 0 : 1)) + i6;
    }

    public final void j() {
        k.I i6;
        boolean z5 = this.f7998n > 0;
        int i7 = this.f8004t;
        int i8 = this.f8005u;
        int i9 = this.f8006v;
        int r5 = r(i9);
        int i10 = this.f7999o;
        int i11 = i7 - i9;
        int i12 = r5 * 5;
        int i13 = i12 + 1;
        boolean z6 = (this.f7986b[i13] & 1073741824) != 0;
        C0166v c0166v = this.f8002r;
        if (z5) {
            C1147A c1147a = this.f8003s;
            if (c1147a != null && (i6 = (k.I) c1147a.b(i9)) != null) {
                Object[] objArr = i6.a;
                int i14 = i6.f12466b;
                for (int i15 = 0; i15 < i14; i15++) {
                    F(objArr[i15]);
                }
            }
            int[] iArr = this.f7986b;
            iArr[i12 + 3] = i11;
            L0.d(iArr, r5, i10);
            int b5 = c0166v.b();
            if (z6) {
                i10 = 1;
            }
            this.f7999o = b5 + i10;
            int E5 = E(this.f7986b, i9);
            this.f8006v = E5;
            int p5 = E5 < 0 ? p() : r(E5 + 1);
            int g3 = p5 >= 0 ? g(this.f7986b, p5) : 0;
            this.f7993i = g3;
            this.f7994j = g3;
            return;
        }
        if (i7 != i8) {
            AbstractC0629s.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f7986b;
        int i16 = i12 + 3;
        int i17 = iArr2[i16];
        int i18 = iArr2[i13] & 67108863;
        iArr2[i16] = i11;
        L0.d(iArr2, r5, i10);
        int b6 = this.f8000p.b();
        this.f8005u = (o() - this.f7992h) - this.f8001q.b();
        this.f8006v = b6;
        int E6 = E(this.f7986b, i9);
        int b7 = c0166v.b();
        this.f7999o = b7;
        if (E6 == b6) {
            this.f7999o = b7 + (z6 ? 0 : i10 - i18);
            return;
        }
        int i19 = i11 - i17;
        int i20 = z6 ? 0 : i10 - i18;
        if (i19 != 0 || i20 != 0) {
            while (E6 != 0 && E6 != b6 && (i20 != 0 || i19 != 0)) {
                int r6 = r(E6);
                if (i19 != 0) {
                    int[] iArr3 = this.f7986b;
                    int i21 = (r6 * 5) + 3;
                    iArr3[i21] = iArr3[i21] + i19;
                }
                if (i20 != 0) {
                    int[] iArr4 = this.f7986b;
                    L0.d(iArr4, r6, (iArr4[(r6 * 5) + 1] & 67108863) + i20);
                }
                int[] iArr5 = this.f7986b;
                if ((iArr5[(r6 * 5) + 1] & 1073741824) != 0) {
                    i20 = 0;
                }
                E6 = E(iArr5, E6);
            }
        }
        this.f7999o += i20;
    }

    public final void k() {
        if (this.f7998n <= 0) {
            AbstractC0619m0.b("Unbalanced begin/end insert");
        }
        int i6 = this.f7998n - 1;
        this.f7998n = i6;
        if (i6 == 0) {
            if (this.f8002r.f2001b != this.f8000p.f2001b) {
                AbstractC0629s.a("startGroup/endGroup mismatch while inserting");
            }
            this.f8005u = (o() - this.f7992h) - this.f8001q.b();
        }
    }

    public final void l(int i6) {
        boolean z5 = false;
        if (!(this.f7998n <= 0)) {
            AbstractC0629s.a("Cannot call ensureStarted() while inserting");
        }
        int i7 = this.f8006v;
        if (i7 != i6) {
            if (i6 >= i7 && i6 < this.f8005u) {
                z5 = true;
            }
            if (!z5) {
                AbstractC0629s.a("Started group at " + i6 + " must be a subgroup of the group at " + i7);
            }
            int i8 = this.f8004t;
            int i9 = this.f7993i;
            int i10 = this.f7994j;
            this.f8004t = i6;
            P();
            this.f8004t = i8;
            this.f7993i = i9;
            this.f7994j = i10;
        }
    }

    public final void m(int i6, int i7, int i8) {
        if (i6 >= this.f7991g) {
            i6 = -((p() - i6) + 2);
        }
        while (i8 < i7) {
            this.f7986b[(r(i8) * 5) + 2] = i6;
            int i9 = this.f7986b[(r(i8) * 5) + 3] + i8;
            m(i8, i9, i8 + 1);
            i8 = i9;
        }
    }

    public final void n(int i6, l4.e eVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        l4.e eVar2 = eVar;
        int E5 = E(this.f7986b, i6);
        int p5 = p();
        int u5 = u(i6) + i6;
        int i11 = i6;
        C1148B c1148b = null;
        C1178z c1178z = null;
        loop0: while (i11 < u5) {
            int f6 = f(i11);
            int i12 = i11 + 1;
            int f7 = f(i12);
            while (f6 < f7) {
                Object obj = this.f7987c[h(f6)];
                if (!(obj instanceof C0) || (i10 = ((C0) obj).f7935b) < 0) {
                    i9 = E5;
                    eVar2.m(Integer.valueOf(f6), obj);
                } else {
                    int u6 = u(i11) + i11;
                    int i13 = i12;
                    int i14 = 0;
                    while (i13 < u6 && i14 < i10) {
                        int r5 = r(i13);
                        int i15 = E5;
                        int[] iArr = this.f7986b;
                        int i16 = r5 * 5;
                        i13 = iArr[i16 + 3] + i13;
                        if (i13 < u6 && (iArr[i16 + 1] & PegdownExtensions.NOT_USED) == 0) {
                            i14++;
                        }
                        E5 = i15;
                    }
                    i9 = E5;
                    if (c1148b == null) {
                        int[] iArr2 = AbstractC1169p.a;
                        c1148b = new C1148B();
                    }
                    if (c1178z == null) {
                        c1178z = new C1178z();
                    }
                    c1148b.a(i13);
                    c1178z.a(i13);
                    c1178z.a(f6);
                }
                f6++;
                E5 = i9;
            }
            int i17 = E5;
            E5 = i12 < p5 ? E(this.f7986b, i12) : -1;
            if (E5 != i11) {
                int i18 = i17;
                while (true) {
                    if (c1178z == null || c1148b == null || !c1148b.e(i11)) {
                        i7 = p5;
                    } else {
                        int i19 = c1178z.f12592b;
                        int i20 = i19 / 2;
                        int i21 = 0;
                        int i22 = 0;
                        while (i21 < i20) {
                            int i23 = i21 * 2;
                            int i24 = p5;
                            int c6 = c1178z.c(i23);
                            if (c6 == i11) {
                                int c7 = c1178z.c(i23 + 1);
                                eVar2.m(Integer.valueOf(c7), this.f7987c[h(c7)]);
                            } else if (i23 != i22) {
                                int i25 = i22 + 1;
                                c1178z.f(i22, c6);
                                i22 += 2;
                                c1178z.f(i25, c1178z.c(i23 + 1));
                            } else {
                                i22 += 2;
                            }
                            i21++;
                            eVar2 = eVar;
                            p5 = i24;
                        }
                        i7 = p5;
                        if (i22 != i19) {
                            if (i22 < 0 || i22 > (i8 = c1178z.f12592b) || i19 < 0 || i19 > i8) {
                                break loop0;
                            }
                            if (i19 < i22) {
                                AbstractC1180a.c("The end index must be < start index");
                                throw null;
                            }
                            if (i19 != i22) {
                                if (i19 < i8) {
                                    int[] iArr3 = c1178z.a;
                                    Y3.k.h0(iArr3, iArr3, i22, i19, i8);
                                }
                                c1178z.f12592b -= i19 - i22;
                            }
                        }
                    }
                    if (i11 != i6 && i18 != E5) {
                        i11 = i18;
                        p5 = i7;
                        i18 = E(this.f7986b, i18);
                        eVar2 = eVar;
                    }
                }
                AbstractC1180a.d("Index must be between 0 and size");
                throw null;
            }
            i7 = p5;
            eVar2 = eVar;
            i11 = i12;
            p5 = i7;
        }
    }

    public final int o() {
        return this.f7986b.length / 5;
    }

    public final int p() {
        return o() - this.f7992h;
    }

    public final Object q(int i6) {
        int r5 = r(i6);
        int[] iArr = this.f7986b;
        int i7 = (r5 * 5) + 1;
        if ((iArr[i7] & PegdownExtensions.FORCELISTITEMPARA) == 0) {
            return C0616l.a;
        }
        return this.f7987c[Integer.bitCount(iArr[i7] >> 29) + g(iArr, r5)];
    }

    public final int r(int i6) {
        return (this.f7992h * (i6 < this.f7991g ? 0 : 1)) + i6;
    }

    public final int s(int i6) {
        return this.f7986b[r(i6) * 5];
    }

    public final Object t(int i6) {
        int r5 = r(i6);
        int[] iArr = this.f7986b;
        int i7 = r5 * 5;
        int i8 = iArr[i7 + 1];
        if ((536870912 & i8) == 0) {
            return null;
        }
        return this.f7987c[Integer.bitCount(i8 >> 30) + iArr[i7 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f8004t + " end=" + this.f8005u + " size = " + p() + " gap=" + this.f7991g + '-' + (this.f7991g + this.f7992h) + ')';
    }

    public final int u(int i6) {
        return L0.a(this.f7986b, r(i6));
    }

    public final boolean v(int i6, int i7) {
        int o5;
        int u5;
        if (i7 == this.f8006v) {
            o5 = this.f8005u;
        } else {
            C0166v c0166v = this.f8000p;
            if (i7 > c0166v.a(0)) {
                u5 = u(i7);
            } else {
                int[] iArr = c0166v.a;
                int min = Math.min(iArr.length, c0166v.f2001b);
                int i8 = 0;
                while (true) {
                    if (i8 >= min) {
                        i8 = -1;
                        break;
                    }
                    if (iArr[i8] == i7) {
                        break;
                    }
                    i8++;
                }
                if (i8 < 0) {
                    u5 = u(i7);
                } else {
                    o5 = (o() - this.f7992h) - this.f8001q.a[i8];
                }
            }
            o5 = u5 + i7;
        }
        return i6 > i7 && i6 < o5;
    }

    public final void w(int i6) {
        if (i6 > 0) {
            int i7 = this.f8004t;
            B(i7);
            int i8 = this.f7991g;
            int i9 = this.f7992h;
            int[] iArr = this.f7986b;
            int length = iArr.length / 5;
            int i10 = length - i9;
            if (i9 < i6) {
                int max = Math.max(Math.max(length * 2, i10 + i6), 32);
                int[] iArr2 = new int[max * 5];
                int i11 = max - i10;
                Y3.k.h0(iArr, iArr2, 0, 0, i8 * 5);
                Y3.k.h0(iArr, iArr2, (i8 + i11) * 5, (i9 + i8) * 5, length * 5);
                this.f7986b = iArr2;
                i9 = i11;
            }
            int i12 = this.f8005u;
            if (i12 >= i8) {
                this.f8005u = i12 + i6;
            }
            int i13 = i8 + i6;
            this.f7991g = i13;
            this.f7992h = i9 - i6;
            int i14 = i(i10 > 0 ? f(i7 + i6) : 0, this.f7997m >= i8 ? this.f7995k : 0, this.f7996l, this.f7987c.length);
            for (int i15 = i8; i15 < i13; i15++) {
                this.f7986b[(i15 * 5) + 4] = i14;
            }
            int i16 = this.f7997m;
            if (i16 >= i8) {
                this.f7997m = i16 + i6;
            }
        }
    }

    public final void x(int i6, int i7) {
        if (i6 > 0) {
            C(this.f7993i, i7);
            int i8 = this.f7995k;
            int i9 = this.f7996l;
            if (i9 < i6) {
                Object[] objArr = this.f7987c;
                int length = objArr.length;
                int i10 = length - i9;
                int max = Math.max(Math.max(length * 2, i10 + i6), 32);
                Object[] objArr2 = new Object[max];
                for (int i11 = 0; i11 < max; i11++) {
                    objArr2[i11] = null;
                }
                int i12 = max - i10;
                int i13 = i9 + i8;
                System.arraycopy(objArr, 0, objArr2, 0, i8);
                System.arraycopy(objArr, i13, objArr2, i8 + i12, length - i13);
                this.f7987c = objArr2;
                i9 = i12;
            }
            int i14 = this.f7994j;
            if (i14 >= i8) {
                this.f7994j = i14 + i6;
            }
            this.f7995k = i8 + i6;
            this.f7996l = i9 - i6;
        }
    }

    public final boolean y(int i6) {
        return (this.f7986b[(r(i6) * 5) + 1] & 1073741824) != 0;
    }
}
