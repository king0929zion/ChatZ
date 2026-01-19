package f0;

import H0.C0158m;
import O.C0316k;
import S2.Y;
import b0.C0868a;
import b0.C0882o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k.N;
import m4.AbstractC1276k;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0992o {
    public static final C0990m a = new C0990m(0);

    /* renamed from: b, reason: collision with root package name */
    public static final C0158m f11706b = new C0158m(8);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11707c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static C0989l f11708d;

    /* renamed from: e, reason: collision with root package name */
    public static long f11709e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0986i f11710f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0316k f11711g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f11712h;

    /* renamed from: i, reason: collision with root package name */
    public static Object f11713i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0978a f11714j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0868a f11715k;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.atomic.AtomicInteger, b0.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [f0.b, f0.a, f0.f] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, f0.i] */
    static {
        C0989l c0989l = C0989l.f11697h;
        f11708d = c0989l;
        long j3 = 1;
        f11709e = j3 + j3;
        Object obj = new Object();
        obj.f11685b = new long[16];
        obj.f11686c = new int[16];
        int[] iArr = new int[16];
        int i6 = 0;
        while (i6 < 16) {
            int i7 = i6 + 1;
            iArr[i6] = i7;
            i6 = i7;
        }
        obj.f11687d = iArr;
        f11710f = obj;
        C0316k c0316k = new C0316k(4);
        c0316k.f4140c = new int[16];
        c0316k.f4141d = new C0882o[16];
        f11711g = c0316k;
        Y3.v vVar = Y3.v.f9812c;
        f11712h = vVar;
        f11713i = vVar;
        long j4 = f11709e;
        f11709e = j3 + j4;
        C0979b c0979b = new C0979b(j4, c0989l, null, new Y(29));
        f11708d = f11708d.e(c0979b.f11680b);
        f11714j = c0979b;
        f11715k = new AtomicInteger(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j3, C0979b c0979b, C0989l c0989l) {
        long[] jArr;
        C0989l c0989l2;
        long[] jArr2;
        C0989l c0989l3;
        int i6;
        int i7;
        AbstractC0974D s5;
        N x5 = c0979b.x();
        if (x5 != null) {
            long g3 = c0979b.g();
            C0989l d6 = c0979b.d().e(g3).d(c0979b.f11670j);
            Object[] objArr = x5.f12490b;
            long[] jArr3 = x5.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i8 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j4 = jArr3[i8];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j4 & 255) < 128) {
                                InterfaceC0972B interfaceC0972B = (InterfaceC0972B) objArr[(i8 << 3) + i11];
                                AbstractC0974D a6 = interfaceC0972B.a();
                                jArr2 = jArr3;
                                i6 = i9;
                                i7 = i11;
                                AbstractC0974D s6 = s(a6, j3, c0989l);
                                if (s6 == null || (s5 = s(a6, g3, d6)) == null || s6.equals(s5)) {
                                    c0989l3 = d6;
                                } else {
                                    c0989l3 = d6;
                                    AbstractC0974D s7 = s(a6, g3, c0979b.d());
                                    if (s7 == null) {
                                        r();
                                        throw null;
                                    }
                                    AbstractC0974D c6 = interfaceC0972B.c(s5, s6, s7);
                                    if (c6 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s6, c6);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                c0989l3 = d6;
                                i6 = i9;
                                i7 = i11;
                            }
                            j4 >>= i6;
                            i11 = i7 + 1;
                            i9 = i6;
                            jArr3 = jArr2;
                            d6 = c0989l3;
                        }
                        jArr = jArr3;
                        c0989l2 = d6;
                        if (i10 != i9) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        c0989l2 = d6;
                    }
                    if (i8 == length) {
                        return hashMap;
                    }
                    i8++;
                    jArr3 = jArr;
                    d6 = c0989l2;
                }
            }
        }
        return null;
    }

    public static final void c(AbstractC0983f abstractC0983f) {
        long j3;
        if (f11708d.c(abstractC0983f.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(abstractC0983f.g());
        sb.append(", disposed=");
        sb.append(abstractC0983f.f11681c);
        sb.append(", applied=");
        C0979b c0979b = abstractC0983f instanceof C0979b ? (C0979b) abstractC0983f : null;
        sb.append(c0979b != null ? Boolean.valueOf(c0979b.f11673m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f11707c) {
            C0986i c0986i = f11710f;
            j3 = c0986i.a > 0 ? c0986i.f11685b[0] : -1L;
        }
        sb.append(j3);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final C0989l d(C0989l c0989l, long j3, long j4) {
        while (AbstractC1276k.h(j3, j4) < 0) {
            c0989l = c0989l.e(j3);
            j3++;
        }
        return c0989l;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final Object e(l4.c cVar) {
        N n3;
        Object v5;
        C0978a c0978a = f11714j;
        synchronized (f11707c) {
            try {
                n3 = c0978a.f11668h;
                if (n3 != null) {
                    f11715k.addAndGet(1);
                }
                v5 = v(c0978a, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (n3 != null) {
            try {
                Object r42 = f11712h;
                int size = r42.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((l4.e) r42.get(i6)).m(new V.h(n3), c0978a);
                }
            } finally {
                f11715k.addAndGet(-1);
            }
        }
        synchronized (f11707c) {
            f();
            if (n3 != null) {
                Object[] objArr = n3.f12490b;
                long[] jArr = n3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j3 = jArr[i7];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j3) < 128) {
                                    q((InterfaceC0972B) objArr[(i7 << 3) + i9]);
                                }
                                j3 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return v5;
    }

    public static final void f() {
        C0316k c0316k = f11711g;
        int i6 = c0316k.f4139b;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 >= i6) {
                break;
            }
            C0882o c0882o = ((C0882o[]) c0316k.f4141d)[i7];
            Object obj = c0882o != null ? c0882o.get() : null;
            if (obj != null && p((InterfaceC0972B) obj)) {
                if (i8 != i7) {
                    ((C0882o[]) c0316k.f4141d)[i8] = c0882o;
                    int[] iArr = (int[]) c0316k.f4140c;
                    iArr[i8] = iArr[i7];
                }
                i8++;
            }
            i7++;
        }
        for (int i9 = i8; i9 < i6; i9++) {
            ((C0882o[]) c0316k.f4141d)[i9] = null;
            ((int[]) c0316k.f4140c)[i9] = 0;
        }
        if (i8 != i6) {
            c0316k.f4139b = i8;
        }
    }

    public static final AbstractC0983f g(AbstractC0983f abstractC0983f, l4.c cVar, boolean z5) {
        boolean z6 = abstractC0983f instanceof C0979b;
        if (z6 || abstractC0983f == null) {
            return new C0976F(z6 ? (C0979b) abstractC0983f : null, cVar, null, false, z5);
        }
        return new C0977G(abstractC0983f, cVar, false, z5);
    }

    public static final AbstractC0974D h(AbstractC0974D abstractC0974D) {
        AbstractC0974D s5;
        AbstractC0983f j3 = j();
        AbstractC0974D s6 = s(abstractC0974D, j3.g(), j3.d());
        if (s6 != null) {
            return s6;
        }
        synchronized (f11707c) {
            AbstractC0983f j4 = j();
            s5 = s(abstractC0974D, j4.g(), j4.d());
        }
        if (s5 != null) {
            return s5;
        }
        r();
        throw null;
    }

    public static final AbstractC0974D i(AbstractC0974D abstractC0974D, AbstractC0983f abstractC0983f) {
        AbstractC0974D s5;
        AbstractC0974D s6 = s(abstractC0974D, abstractC0983f.g(), abstractC0983f.d());
        if (s6 != null) {
            return s6;
        }
        synchronized (f11707c) {
            s5 = s(abstractC0974D, abstractC0983f.g(), abstractC0983f.d());
        }
        if (s5 != null) {
            return s5;
        }
        r();
        throw null;
    }

    public static final AbstractC0983f j() {
        AbstractC0983f abstractC0983f = (AbstractC0983f) f11706b.e();
        return abstractC0983f == null ? f11714j : abstractC0983f;
    }

    public static final l4.c k(l4.c cVar, l4.c cVar2, boolean z5) {
        if (!z5) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0991n(cVar, cVar2, 0);
    }

    public static final l4.c l(l4.c cVar, l4.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0991n(cVar, cVar2, 1);
    }

    public static final AbstractC0974D m(AbstractC0974D abstractC0974D, InterfaceC0972B interfaceC0972B) {
        AbstractC0974D a6 = interfaceC0972B.a();
        long j3 = f11709e;
        C0986i c0986i = f11710f;
        if (c0986i.a > 0) {
            j3 = c0986i.f11685b[0];
        }
        long j4 = j3 - 1;
        AbstractC0974D abstractC0974D2 = null;
        AbstractC0974D abstractC0974D3 = null;
        while (true) {
            if (a6 == null) {
                break;
            }
            long j5 = a6.a;
            if (j5 == 0) {
                break;
            }
            if (j5 != 0 && AbstractC1276k.h(j5, j4) <= 0 && !C0989l.f11697h.c(j5)) {
                if (abstractC0974D3 == null) {
                    abstractC0974D3 = a6;
                } else if (AbstractC1276k.h(a6.a, abstractC0974D3.a) >= 0) {
                    abstractC0974D2 = abstractC0974D3;
                }
            }
            a6 = a6.f11648b;
        }
        abstractC0974D2 = a6;
        if (abstractC0974D2 != null) {
            abstractC0974D2.a = Long.MAX_VALUE;
            return abstractC0974D2;
        }
        AbstractC0974D b5 = abstractC0974D.b(Long.MAX_VALUE);
        b5.f11648b = interfaceC0972B.a();
        interfaceC0972B.d(b5);
        return b5;
    }

    public static final void n(AbstractC0983f abstractC0983f, InterfaceC0972B interfaceC0972B) {
        abstractC0983f.t(abstractC0983f.h() + 1);
        l4.c i6 = abstractC0983f.i();
        if (i6 != null) {
            i6.f(interfaceC0972B);
        }
    }

    public static final AbstractC0974D o(AbstractC0974D abstractC0974D, AbstractC0973C abstractC0973C, AbstractC0983f abstractC0983f, AbstractC0974D abstractC0974D2) {
        AbstractC0974D m3;
        if (abstractC0983f.f()) {
            abstractC0983f.n(abstractC0973C);
        }
        long g3 = abstractC0983f.g();
        if (abstractC0974D2.a == g3) {
            return abstractC0974D2;
        }
        synchronized (f11707c) {
            m3 = m(abstractC0974D, abstractC0973C);
        }
        m3.a = g3;
        if (abstractC0974D2.a != 1) {
            abstractC0983f.n(abstractC0973C);
        }
        return m3;
    }

    public static final boolean p(InterfaceC0972B interfaceC0972B) {
        AbstractC0974D abstractC0974D;
        long j3 = f11709e;
        C0986i c0986i = f11710f;
        if (c0986i.a > 0) {
            j3 = c0986i.f11685b[0];
        }
        AbstractC0974D abstractC0974D2 = null;
        AbstractC0974D abstractC0974D3 = null;
        int i6 = 0;
        for (AbstractC0974D a6 = interfaceC0972B.a(); a6 != null; a6 = a6.f11648b) {
            long j4 = a6.a;
            if (j4 != 0) {
                if (AbstractC1276k.h(j4, j3) >= 0) {
                    i6++;
                } else if (abstractC0974D2 == null) {
                    i6++;
                    abstractC0974D2 = a6;
                } else {
                    if (AbstractC1276k.h(a6.a, abstractC0974D2.a) < 0) {
                        abstractC0974D = abstractC0974D2;
                        abstractC0974D2 = a6;
                    } else {
                        abstractC0974D = a6;
                    }
                    if (abstractC0974D3 == null) {
                        abstractC0974D3 = interfaceC0972B.a();
                        AbstractC0974D abstractC0974D4 = abstractC0974D3;
                        while (true) {
                            if (abstractC0974D3 == null) {
                                abstractC0974D3 = abstractC0974D4;
                                break;
                            }
                            if (AbstractC1276k.h(abstractC0974D3.a, j3) >= 0) {
                                break;
                            }
                            if (AbstractC1276k.h(abstractC0974D4.a, abstractC0974D3.a) < 0) {
                                abstractC0974D4 = abstractC0974D3;
                            }
                            abstractC0974D3 = abstractC0974D3.f11648b;
                        }
                    }
                    abstractC0974D2.a = 0L;
                    abstractC0974D2.a(abstractC0974D3);
                    abstractC0974D2 = abstractC0974D;
                }
            }
        }
        return i6 > 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(InterfaceC0972B interfaceC0972B) {
        if (p(interfaceC0972B)) {
            C0316k c0316k = f11711g;
            int i6 = c0316k.f4139b;
            int identityHashCode = System.identityHashCode(interfaceC0972B);
            int i7 = -1;
            if (i6 > 0) {
                int i8 = c0316k.f4139b - 1;
                int i9 = 0;
                while (true) {
                    if (i9 > i8) {
                        i7 = -(i9 + 1);
                        break;
                    }
                    int i10 = (i9 + i8) >>> 1;
                    int i11 = ((int[]) c0316k.f4140c)[i10];
                    if (i11 < identityHashCode) {
                        i9 = i10 + 1;
                    } else if (i11 > identityHashCode) {
                        i8 = i10 - 1;
                    } else {
                        C0882o c0882o = ((C0882o[]) c0316k.f4141d)[i10];
                        if (interfaceC0972B != (c0882o != null ? c0882o.get() : null)) {
                            for (int i12 = i10 - 1; -1 < i12 && ((int[]) c0316k.f4140c)[i12] == identityHashCode; i12--) {
                                C0882o c0882o2 = ((C0882o[]) c0316k.f4141d)[i12];
                                if ((c0882o2 != null ? c0882o2.get() : null) == interfaceC0972B) {
                                    i7 = i12;
                                    break;
                                }
                            }
                            i10++;
                            int i13 = c0316k.f4139b;
                            while (true) {
                                if (i10 >= i13) {
                                    i7 = -(c0316k.f4139b + 1);
                                    break;
                                } else {
                                    if (((int[]) c0316k.f4140c)[i10] != identityHashCode) {
                                        i7 = -(i10 + 1);
                                        break;
                                    }
                                    C0882o c0882o3 = ((C0882o[]) c0316k.f4141d)[i10];
                                    if ((c0882o3 != null ? c0882o3.get() : null) == interfaceC0972B) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                        i7 = i10;
                    }
                }
                if (i7 >= 0) {
                    return;
                }
            }
            int i14 = -(i7 + 1);
            C0882o[] c0882oArr = (C0882o[]) c0316k.f4141d;
            int length = c0882oArr.length;
            if (i6 == length) {
                int i15 = length * 2;
                C0882o[] c0882oArr2 = new C0882o[i15];
                int[] iArr = new int[i15];
                int i16 = i14 + 1;
                System.arraycopy(c0882oArr, i14, c0882oArr2, i16, i6 - i14);
                System.arraycopy((C0882o[]) c0316k.f4141d, 0, c0882oArr2, 0, i14);
                Y3.k.h0((int[]) c0316k.f4140c, iArr, i16, i14, i6);
                Y3.k.k0((int[]) c0316k.f4140c, iArr, 0, i14, 6);
                c0316k.f4141d = c0882oArr2;
                c0316k.f4140c = iArr;
            } else {
                int i17 = i14 + 1;
                System.arraycopy(c0882oArr, i14, c0882oArr, i17, i6 - i14);
                int[] iArr2 = (int[]) c0316k.f4140c;
                Y3.k.h0(iArr2, iArr2, i17, i14, i6);
            }
            ((C0882o[]) c0316k.f4141d)[i14] = new WeakReference(interfaceC0972B);
            ((int[]) c0316k.f4140c)[i14] = identityHashCode;
            c0316k.f4139b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final AbstractC0974D s(AbstractC0974D abstractC0974D, long j3, C0989l c0989l) {
        AbstractC0974D abstractC0974D2 = null;
        while (abstractC0974D != null) {
            long j4 = abstractC0974D.a;
            if (j4 != 0 && AbstractC1276k.h(j4, j3) <= 0 && !c0989l.c(j4) && (abstractC0974D2 == null || AbstractC1276k.h(abstractC0974D2.a, abstractC0974D.a) < 0)) {
                abstractC0974D2 = abstractC0974D;
            }
            abstractC0974D = abstractC0974D.f11648b;
        }
        if (abstractC0974D2 != null) {
            return abstractC0974D2;
        }
        return null;
    }

    public static final AbstractC0974D t(AbstractC0974D abstractC0974D, InterfaceC0972B interfaceC0972B) {
        AbstractC0974D s5;
        AbstractC0983f j3 = j();
        l4.c e6 = j3.e();
        if (e6 != null) {
            e6.f(interfaceC0972B);
        }
        AbstractC0974D s6 = s(abstractC0974D, j3.g(), j3.d());
        if (s6 != null) {
            return s6;
        }
        synchronized (f11707c) {
            AbstractC0983f j4 = j();
            AbstractC0974D a6 = interfaceC0972B.a();
            AbstractC1276k.d(a6, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            s5 = s(a6, j4.g(), j4.d());
            if (s5 == null) {
                r();
                throw null;
            }
        }
        return s5;
    }

    public static final void u(int i6) {
        C0986i c0986i = f11710f;
        int i7 = c0986i.f11687d[i6];
        c0986i.b(i7, c0986i.a - 1);
        c0986i.a--;
        long[] jArr = c0986i.f11685b;
        long j3 = jArr[i7];
        int i8 = i7;
        while (i8 > 0) {
            int i9 = ((i8 + 1) >> 1) - 1;
            if (AbstractC1276k.h(jArr[i9], j3) <= 0) {
                break;
            }
            c0986i.b(i9, i8);
            i8 = i9;
        }
        long[] jArr2 = c0986i.f11685b;
        int i10 = c0986i.a >> 1;
        while (i7 < i10) {
            int i11 = (i7 + 1) << 1;
            int i12 = i11 - 1;
            if (i11 < c0986i.a && AbstractC1276k.h(jArr2[i11], jArr2[i12]) < 0) {
                if (AbstractC1276k.h(jArr2[i11], jArr2[i7]) >= 0) {
                    break;
                }
                c0986i.b(i11, i7);
                i7 = i11;
            } else {
                if (AbstractC1276k.h(jArr2[i12], jArr2[i7]) >= 0) {
                    break;
                }
                c0986i.b(i12, i7);
                i7 = i12;
            }
        }
        c0986i.f11687d[i6] = c0986i.f11688e;
        c0986i.f11688e = i6;
    }

    public static final Object v(C0978a c0978a, l4.c cVar) {
        long j3 = c0978a.f11680b;
        Object f6 = cVar.f(f11708d.b(j3));
        long j4 = f11709e;
        f11709e = 1 + j4;
        C0989l b5 = f11708d.b(j3);
        f11708d = b5;
        c0978a.f11680b = j4;
        c0978a.a = b5;
        c0978a.f11667g = 0;
        c0978a.f11668h = null;
        c0978a.o();
        f11708d = f11708d.e(j4);
        return f6;
    }

    public static final AbstractC0974D w(AbstractC0974D abstractC0974D, InterfaceC0972B interfaceC0972B, AbstractC0983f abstractC0983f) {
        AbstractC0974D s5;
        if (abstractC0983f.f()) {
            abstractC0983f.n(interfaceC0972B);
        }
        long g3 = abstractC0983f.g();
        AbstractC0974D s6 = s(abstractC0974D, g3, abstractC0983f.d());
        if (s6 == null) {
            r();
            throw null;
        }
        if (s6.a == abstractC0983f.g()) {
            return s6;
        }
        synchronized (f11707c) {
            s5 = s(interfaceC0972B.a(), g3, abstractC0983f.d());
            if (s5 == null) {
                r();
                throw null;
            }
            if (s5.a != g3) {
                AbstractC0974D m3 = m(s5, interfaceC0972B);
                m3.a(s5);
                m3.a = abstractC0983f.g();
                s5 = m3;
            }
        }
        if (s6.a != 1) {
            abstractC0983f.n(interfaceC0972B);
        }
        return s5;
    }
}
