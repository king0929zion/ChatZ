package y;

import H0.AbstractC0157l;
import O.C0316k;
import e1.C0959a;
import h0.InterfaceC1041r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import m4.AbstractC1276k;
import n.InterfaceC1351z;
import x.C1859j;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: y.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954K {
    public final k.M a;

    /* renamed from: b, reason: collision with root package name */
    public C0316k f15783b;

    /* renamed from: c, reason: collision with root package name */
    public int f15784c;

    /* renamed from: d, reason: collision with root package name */
    public final k.N f15785d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15786e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f15787f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f15788g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f15789h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f15790i;

    /* renamed from: j, reason: collision with root package name */
    public C1951H f15791j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1041r f15792k;

    public C1954K() {
        long[] jArr = k.V.a;
        this.a = new k.M();
        k.N n3 = k.W.a;
        this.f15785d = new k.N();
        this.f15786e = new ArrayList();
        this.f15787f = new ArrayList();
        this.f15788g = new ArrayList();
        this.f15789h = new ArrayList();
        this.f15790i = new ArrayList();
        this.f15792k = new C1950G(this);
    }

    public static void b(x.m mVar, int i6, C1952I c1952i) {
        int i7 = 0;
        long b5 = mVar.b(0);
        long b6 = mVar.f15509c ? e1.j.b(0, i6, 1, b5) : e1.j.b(i6, 0, 2, b5);
        C1948E[] c1948eArr = c1952i.a;
        int length = c1948eArr.length;
        int i8 = 0;
        while (i7 < length) {
            C1948E c1948e = c1948eArr[i7];
            int i9 = i8 + 1;
            if (c1948e != null) {
                c1948e.f15767l = e1.j.e(b6, e1.j.d(mVar.b(i8), b5));
            }
            i7++;
            i8 = i9;
        }
    }

    public static int g(int[] iArr, x.m mVar) {
        mVar.getClass();
        int i6 = iArr[0] + mVar.f15523q;
        iArr[0] = i6;
        return Math.max(0, i6);
    }

    public final long a() {
        ArrayList arrayList = this.f15790i;
        int size = arrayList.size();
        long j3 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            C1948E c1948e = (C1948E) arrayList.get(i6);
            r0.b bVar = c1948e.f15769n;
            if (bVar != null) {
                j3 = (Math.max((int) (j3 & 4294967295L), ((int) (c1948e.f15767l & 4294967295L)) + ((int) (bVar.f14553u & 4294967295L))) & 4294967295L) | (Math.max((int) (j3 >> 32), ((int) (c1948e.f15767l >> 32)) + ((int) (bVar.f14553u >> 32))) << 32);
            }
        }
        return j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
        public final void c(int i6, int i7, int i8, ArrayList arrayList, C0316k c0316k, C1859j c1859j, boolean z5, boolean z6, boolean z7, int i9, int i10, InterfaceC1942y interfaceC1942y, o0.w wVar) {
        k.M m3;
        Object obj;
        long j3;
        long j4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        k.N n3;
        int[] iArr;
        k.M m5;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i11;
        int i12;
        C0316k c0316k2;
        int[] iArr2;
        k.M m6;
        int i13;
        int i14;
        long[] jArr;
        Object[] objArr;
        long j5;
        int[] iArr3;
        long[] jArr2;
        k.M m7;
        int i15;
        ArrayList arrayList7;
        Object[] objArr2;
        x.m mVar;
        int i16;
        int[] iArr4;
        k.M m8;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z8;
        int i21;
        ArrayList arrayList8 = arrayList;
        C0316k c0316k3 = this.f15783b;
        this.f15783b = c0316k;
        int size = arrayList8.size();
        int i22 = 0;
        loop0: while (true) {
            m3 = this.a;
            if (i22 < size) {
                x.m mVar2 = (x.m) arrayList8.get(i22);
                int size2 = mVar2.f15508b.size();
                for (int i23 = 0; i23 < size2; i23++) {
                    Object H3 = ((F0.k0) mVar2.f15508b.get(i23)).H();
                    obj = null;
                    if ((H3 instanceof C1972l ? (C1972l) H3 : null) != null) {
                        break loop0;
                    }
                }
                i22++;
            } else {
                obj = null;
                if (m3.i()) {
                    d();
                    return;
                }
            }
        }
        int i24 = this.f15784c;
        x.m mVar3 = (x.m) Y3.m.q0(arrayList8);
        this.f15784c = mVar3 != null ? mVar3.a : 0;
        if (z5) {
            j3 = 4294967295L;
            j4 = (i6 & 4294967295L) | (0 << 32);
        } else {
            j3 = 4294967295L;
            j4 = (i6 << 32) | (0 & 4294967295L);
        }
        boolean z9 = z6 || !z7;
        Object[] objArr3 = m3.f12485b;
        long[] jArr3 = m3.a;
        int length = jArr3.length - 2;
        k.N n5 = this.f15785d;
        boolean z10 = z9;
        if (length >= 0) {
            int i25 = 0;
            while (true) {
                long j6 = jArr3[i25];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i26 = 8 - ((~(i25 - length)) >>> 31);
                    int i27 = 0;
                    while (i27 < i26) {
                        if ((j6 & 255) < 128) {
                            i21 = i27;
                            n5.a(objArr3[(i25 << 3) + i27]);
                        } else {
                            i21 = i27;
                        }
                        j6 >>= 8;
                        i27 = i21 + 1;
                    }
                    if (i26 != 8) {
                        break;
                    }
                }
                if (i25 == length) {
                    break;
                } else {
                    i25++;
                }
            }
        }
        int size3 = arrayList8.size();
        int i28 = 0;
        while (true) {
            arrayList2 = this.f15790i;
            arrayList3 = this.f15787f;
            arrayList4 = this.f15786e;
            if (i28 >= size3) {
                break;
            }
            x.m mVar4 = (x.m) arrayList8.get(i28);
            n5.l(mVar4.f15517k);
            int size4 = mVar4.f15508b.size();
            int i29 = size3;
            int i30 = 0;
            while (true) {
                if (i30 >= size4) {
                    i20 = i28;
                    z8 = false;
                    break;
                }
                i20 = i28;
                Object H5 = ((F0.k0) mVar4.f15508b.get(i30)).H();
                int i31 = i30;
                if ((H5 instanceof C1972l ? (C1972l) H5 : obj) != null) {
                    z8 = true;
                    break;
                } else {
                    i30 = i31 + 1;
                    i28 = i20;
                }
            }
            if (z8) {
                Object obj2 = mVar4.f15517k;
                C1952I c1952i = (C1952I) m3.g(obj2);
                int c6 = c0316k3 != null ? c0316k3.c(obj2) : -1;
                boolean z11 = c6 == -1 && c0316k3 != null;
                if (c1952i == null) {
                    C1952I c1952i2 = new C1952I(this);
                    C1952I.b(c1952i2, mVar4, interfaceC1942y, wVar, i9, i10);
                    m3.m(obj2, c1952i2);
                    if (mVar4.a == c6 || c6 == -1) {
                        long b5 = mVar4.b(0);
                        b(mVar4, (int) (mVar4.f15509c ? b5 & j3 : b5 >> 32), c1952i2);
                        if (z11) {
                            C1948E[] c1948eArr = c1952i2.a;
                            for (C1948E c1948e : c1948eArr) {
                                if (c1948e != null) {
                                    c1948e.a();
                                }
                            }
                        }
                    } else if (c6 < i24) {
                        arrayList4.add(mVar4);
                    } else {
                        arrayList3.add(mVar4);
                    }
                } else if (z10) {
                    C1952I.b(c1952i, mVar4, interfaceC1942y, wVar, i9, i10);
                    C1948E[] c1948eArr2 = c1952i.a;
                    int length2 = c1948eArr2.length;
                    int i32 = 0;
                    while (i32 < length2) {
                        C1948E[] c1948eArr3 = c1948eArr2;
                        C1948E c1948e2 = c1948eArr3[i32];
                        boolean z12 = z11;
                        int i33 = length2;
                        if (c1948e2 != null && !e1.j.c(c1948e2.f15767l, C1948E.f15755s)) {
                            c1948e2.f15767l = e1.j.e(c1948e2.f15767l, j4);
                        }
                        i32++;
                        c1948eArr2 = c1948eArr3;
                        z11 = z12;
                        length2 = i33;
                    }
                    if (z11) {
                        for (C1948E c1948e3 : c1952i.a) {
                            if (c1948e3 != null) {
                                if (c1948e3.b()) {
                                    arrayList2.remove(c1948e3);
                                    C1951H c1951h = this.f15791j;
                                    if (c1951h != null) {
                                        AbstractC0157l.k(c1951h);
                                    }
                                }
                                c1948e3.a();
                            }
                        }
                    }
                    f(mVar4, false);
                }
            } else {
                e(mVar4.f15517k);
            }
            i28 = i20 + 1;
            arrayList8 = arrayList;
            size3 = i29;
        }
        int[] iArr5 = new int[1];
        if (z10 && c0316k3 != null) {
            if (arrayList4.isEmpty()) {
                i19 = 1;
            } else {
                if (arrayList4.size() > 1) {
                    Y3.q.b0(arrayList4, new C1953J(c0316k3, 2));
                }
                int size5 = arrayList4.size();
                for (int i34 = 0; i34 < size5; i34++) {
                    x.m mVar5 = (x.m) arrayList4.get(i34);
                    int g3 = i9 - g(iArr5, mVar5);
                    Object g6 = m3.g(mVar5.f15517k);
                    AbstractC1276k.c(g6);
                    b(mVar5, g3, (C1952I) g6);
                    f(mVar5, false);
                }
                i19 = 1;
                Arrays.fill(iArr5, 0, 1, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > i19) {
                    Y3.q.b0(arrayList3, new C1953J(c0316k3, 0));
                }
                int size6 = arrayList3.size();
                for (int i35 = 0; i35 < size6; i35++) {
                    x.m mVar6 = (x.m) arrayList3.get(i35);
                    int g7 = (g(iArr5, mVar6) + i10) - mVar6.f15523q;
                    Object g8 = m3.g(mVar6.f15517k);
                    AbstractC1276k.c(g8);
                    b(mVar6, g7, (C1952I) g8);
                    f(mVar6, false);
                }
                Arrays.fill(iArr5, 0, 1, 0);
            }
        }
        Object[] objArr4 = n5.f12490b;
        long[] jArr4 = n5.a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList9 = this.f15789h;
        ArrayList arrayList10 = this.f15788g;
        if (length3 >= 0) {
            k.N n6 = n5;
            Object[] objArr5 = objArr4;
            int i36 = 0;
            while (true) {
                long j7 = jArr4[i36];
                n3 = n6;
                arrayList5 = arrayList3;
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i37 = 8 - ((~(i36 - length3)) >>> 31);
                    int i38 = 0;
                    while (i38 < i37) {
                        if ((j7 & 255) < 128) {
                            j5 = j7;
                            Object obj3 = objArr5[(i36 << 3) + i38];
                            C1952I c1952i3 = (C1952I) m3.g(obj3);
                            if (c1952i3 == null) {
                                iArr3 = iArr5;
                                jArr2 = jArr4;
                                m7 = m3;
                                i15 = i38;
                                arrayList7 = arrayList4;
                                objArr2 = objArr5;
                            } else {
                                jArr2 = jArr4;
                                i15 = i38;
                                int c7 = c0316k.c(obj3);
                                arrayList7 = arrayList4;
                                objArr2 = objArr5;
                                int min = Math.min(1, c1952i3.f15778e);
                                c1952i3.f15778e = min;
                                c1952i3.f15777d = Math.min(1 - min, c1952i3.f15777d);
                                if (c7 == -1) {
                                    C1948E[] c1948eArr4 = c1952i3.a;
                                    int length4 = c1948eArr4.length;
                                    int i39 = 0;
                                    boolean z13 = false;
                                    int i40 = 0;
                                    while (i39 < length4) {
                                        C1948E[] c1948eArr5 = c1948eArr4;
                                        C1948E c1948e4 = c1948eArr5[i39];
                                        int i41 = i40 + 1;
                                        if (c1948e4 != null) {
                                            if (c1948e4.b()) {
                                                iArr4 = iArr5;
                                                m8 = m3;
                                                i17 = i39;
                                                i18 = length4;
                                            } else {
                                                i17 = i39;
                                                if (((Boolean) c1948e4.f15766k.getValue()).booleanValue()) {
                                                    c1948e4.c();
                                                    c1952i3.a[i40] = obj;
                                                    arrayList2.remove(c1948e4);
                                                    C1951H c1951h2 = this.f15791j;
                                                    if (c1951h2 != null) {
                                                        AbstractC0157l.k(c1951h2);
                                                    }
                                                    iArr4 = iArr5;
                                                    m8 = m3;
                                                } else {
                                                    r0.b bVar = c1948e4.f15769n;
                                                    if (bVar != null) {
                                                        i18 = length4;
                                                        InterfaceC1351z interfaceC1351z = c1948e4.f15761f;
                                                        if (c1948e4.b() || interfaceC1351z == null) {
                                                            iArr4 = iArr5;
                                                            m8 = m3;
                                                        } else {
                                                            iArr4 = iArr5;
                                                            c1948e4.e(true);
                                                            m8 = m3;
                                                            Object r42 = obj;
                                                            AbstractC1888A.y(c1948e4.a, r42, new C1984y(c1948e4, interfaceC1351z, bVar, r42), 3);
                                                        }
                                                    } else {
                                                        iArr4 = iArr5;
                                                        m8 = m3;
                                                        i18 = length4;
                                                    }
                                                    if (c1948e4.b()) {
                                                        arrayList2.add(c1948e4);
                                                        C1951H c1951h3 = this.f15791j;
                                                        if (c1951h3 != null) {
                                                            AbstractC0157l.k(c1951h3);
                                                        }
                                                        obj = null;
                                                    } else {
                                                        c1948e4.c();
                                                        obj = null;
                                                        c1952i3.a[i40] = null;
                                                        i39 = i17 + 1;
                                                        c1948eArr4 = c1948eArr5;
                                                        i40 = i41;
                                                        length4 = i18;
                                                        iArr5 = iArr4;
                                                        m3 = m8;
                                                    }
                                                }
                                            }
                                            z13 = true;
                                            i39 = i17 + 1;
                                            c1948eArr4 = c1948eArr5;
                                            i40 = i41;
                                            length4 = i18;
                                            iArr5 = iArr4;
                                            m3 = m8;
                                        } else {
                                            iArr4 = iArr5;
                                            m8 = m3;
                                            i17 = i39;
                                        }
                                        i18 = length4;
                                        i39 = i17 + 1;
                                        c1948eArr4 = c1948eArr5;
                                        i40 = i41;
                                        length4 = i18;
                                        iArr5 = iArr4;
                                        m3 = m8;
                                    }
                                    iArr3 = iArr5;
                                    m7 = m3;
                                    if (!z13) {
                                        e(obj3);
                                    }
                                } else {
                                    iArr3 = iArr5;
                                    m7 = m3;
                                    C0959a c0959a = c1952i3.f15775b;
                                    AbstractC1276k.c(c0959a);
                                    x.m a = c1859j.a(c0959a.a, c7);
                                    a.f15525s = true;
                                    C1948E[] c1948eArr6 = c1952i3.a;
                                    int length5 = c1948eArr6.length;
                                    int i42 = 0;
                                    while (true) {
                                        if (i42 < length5) {
                                            mVar = a;
                                            C1948E c1948e5 = c1948eArr6[i42];
                                            if (c1948e5 != null) {
                                                i16 = i42;
                                                if (((Boolean) c1948e5.f15763h.getValue()).booleanValue()) {
                                                    break;
                                                }
                                            } else {
                                                i16 = i42;
                                            }
                                            i42 = i16 + 1;
                                            a = mVar;
                                        } else {
                                            mVar = a;
                                            if (c0316k3 != null && c7 == c0316k3.c(obj3)) {
                                                e(obj3);
                                            }
                                        }
                                    }
                                    c1952i3.a(mVar, interfaceC1942y, wVar, i9, i10, c1952i3.f15776c);
                                    x.m mVar7 = mVar;
                                    if (c7 < this.f15784c) {
                                        arrayList10.add(mVar7);
                                    } else {
                                        arrayList9.add(mVar7);
                                    }
                                    j7 = j5 >> 8;
                                    i38 = i15 + 1;
                                    jArr4 = jArr2;
                                    arrayList4 = arrayList7;
                                    objArr5 = objArr2;
                                    iArr5 = iArr3;
                                    m3 = m7;
                                }
                            }
                        } else {
                            j5 = j7;
                            iArr3 = iArr5;
                            jArr2 = jArr4;
                            m7 = m3;
                            i15 = i38;
                            arrayList7 = arrayList4;
                            objArr2 = objArr5;
                        }
                        j7 = j5 >> 8;
                        i38 = i15 + 1;
                        jArr4 = jArr2;
                        arrayList4 = arrayList7;
                        objArr5 = objArr2;
                        iArr5 = iArr3;
                        m3 = m7;
                    }
                    iArr = iArr5;
                    jArr = jArr4;
                    m5 = m3;
                    arrayList6 = arrayList4;
                    objArr = objArr5;
                    if (i37 != 8) {
                        break;
                    }
                } else {
                    iArr = iArr5;
                    jArr = jArr4;
                    m5 = m3;
                    arrayList6 = arrayList4;
                    objArr = objArr5;
                }
                if (i36 == length3) {
                    break;
                }
                i36++;
                arrayList3 = arrayList5;
                n6 = n3;
                jArr4 = jArr;
                arrayList4 = arrayList6;
                objArr5 = objArr;
                iArr5 = iArr;
                m3 = m5;
            }
        } else {
            n3 = n5;
            iArr = iArr5;
            m5 = m3;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
        }
        if (arrayList10.isEmpty()) {
            i11 = i7;
            i12 = i8;
            c0316k2 = c0316k;
            iArr2 = iArr;
            m6 = m5;
            i13 = 1;
        } else {
            if (arrayList10.size() > 1) {
                c0316k2 = c0316k;
                Y3.q.b0(arrayList10, new C1953J(c0316k2, 3));
            } else {
                c0316k2 = c0316k;
            }
            int size7 = arrayList10.size();
            int i43 = 0;
            while (i43 < size7) {
                x.m mVar8 = (x.m) arrayList10.get(i43);
                k.M m9 = m5;
                Object g9 = m9.g(mVar8.f15517k);
                AbstractC1276k.c(g9);
                C1952I c1952i4 = (C1952I) g9;
                int[] iArr6 = iArr;
                int g10 = g(iArr6, mVar8);
                if (z6) {
                    x.m mVar9 = (x.m) Y3.m.o0(arrayList);
                    long b6 = mVar9.b(0);
                    i14 = (int) (mVar9.f15509c ? b6 & j3 : b6 >> 32);
                } else {
                    i14 = c1952i4.f15779f;
                }
                mVar8.d(i14 - g10, i7, i8);
                if (z10) {
                    f(mVar8, true);
                }
                i43++;
                m5 = m9;
                iArr = iArr6;
            }
            i11 = i7;
            i12 = i8;
            iArr2 = iArr;
            m6 = m5;
            i13 = 1;
            Arrays.fill(iArr2, 0, 1, 0);
        }
        if (!arrayList9.isEmpty()) {
            if (arrayList9.size() > i13) {
                Y3.q.b0(arrayList9, new C1953J(c0316k2, 1));
            }
            int size8 = arrayList9.size();
            for (int i44 = 0; i44 < size8; i44++) {
                x.m mVar10 = (x.m) arrayList9.get(i44);
                Object g11 = m6.g(mVar10.f15517k);
                AbstractC1276k.c(g11);
                mVar10.d((((C1952I) g11).f15780g - mVar10.f15523q) + g(iArr2, mVar10), i11, i12);
                if (z10) {
                    f(mVar10, true);
                }
            }
        }
        Collections.reverse(arrayList10);
        arrayList.addAll(0, arrayList10);
        arrayList.addAll(arrayList9);
        arrayList6.clear();
        arrayList5.clear();
        arrayList10.clear();
        arrayList9.clear();
        n3.b();
    }

    public final void d() {
        k.M m3 = this.a;
        if (m3.j()) {
            Object[] objArr = m3.f12486c;
            long[] jArr = m3.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j3 = jArr[i6];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((255 & j3) < 128) {
                                for (C1948E c1948e : ((C1952I) objArr[(i6 << 3) + i8]).a) {
                                    if (c1948e != null) {
                                        c1948e.c();
                                    }
                                }
                            }
                            j3 >>= 8;
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

    public final void e(Object obj) {
        C1948E[] c1948eArr;
        C1952I c1952i = (C1952I) this.a.k(obj);
        if (c1952i == null || (c1948eArr = c1952i.a) == null) {
            return;
        }
        for (C1948E c1948e : c1948eArr) {
            if (c1948e != null) {
                c1948e.c();
            }
        }
    }

    public final void f(x.m mVar, boolean z5) {
        Object g3 = this.a.g(mVar.f15517k);
        AbstractC1276k.c(g3);
        C1948E[] c1948eArr = ((C1952I) g3).a;
        int length = c1948eArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            C1948E c1948e = c1948eArr[i6];
            int i8 = i7 + 1;
            if (c1948e != null) {
                long b5 = mVar.b(i7);
                long j3 = c1948e.f15767l;
                if (!e1.j.c(j3, C1948E.f15755s) && !e1.j.c(j3, b5)) {
                    long d6 = e1.j.d(b5, j3);
                    InterfaceC1351z interfaceC1351z = c1948e.f15760e;
                    if (interfaceC1351z != null) {
                        long d7 = e1.j.d(((e1.j) c1948e.f15772q.getValue()).a, d6);
                        c1948e.g(d7);
                        c1948e.f(true);
                        c1948e.f15762g = z5;
                        AbstractC1888A.y(c1948e.a, null, new C1985z(c1948e, interfaceC1351z, d7, null), 3);
                    }
                }
                c1948e.f15767l = b5;
            }
            i6++;
            i7 = i8;
        }
    }
}
