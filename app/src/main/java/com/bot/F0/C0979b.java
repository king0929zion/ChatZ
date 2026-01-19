package f0;

import T.AbstractC0619m0;
import java.util.ArrayList;
import java.util.HashMap;
import k.N;
import k.W;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0979b extends AbstractC0983f {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f11664n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final l4.c f11665e;

    /* renamed from: f, reason: collision with root package name */
    public final l4.c f11666f;

    /* renamed from: g, reason: collision with root package name */
    public int f11667g;

    /* renamed from: h, reason: collision with root package name */
    public N f11668h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f11669i;

    /* renamed from: j, reason: collision with root package name */
    public C0989l f11670j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f11671k;

    /* renamed from: l, reason: collision with root package name */
    public int f11672l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11673m;

    public C0979b(long j3, C0989l c0989l, l4.c cVar, l4.c cVar2) {
        super(j3, c0989l);
        this.f11665e = cVar;
        this.f11666f = cVar2;
        this.f11670j = C0989l.f11697h;
        this.f11671k = f11664n;
        this.f11672l = 1;
    }

    public final void A(long j3) {
        synchronized (AbstractC0992o.f11707c) {
            this.f11670j = this.f11670j.e(j3);
        }
    }

    public void B(N n3) {
        this.f11668h = n3;
    }

    public C0979b C(l4.c cVar, l4.c cVar2) {
        if (this.f11681c) {
            AbstractC0619m0.a("Cannot use a disposed snapshot");
        }
        if (this.f11673m && this.f11682d < 0) {
            AbstractC0619m0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = AbstractC0992o.f11707c;
        synchronized (obj) {
            try {
                long j3 = AbstractC0992o.f11709e;
                long j4 = 1;
                AbstractC0992o.f11709e = j3 + j4;
                AbstractC0992o.f11708d = AbstractC0992o.f11708d.e(j3);
                C0989l d6 = d();
                r(d6.e(j3));
                try {
                    C0980c c0980c = new C0980c(j3, AbstractC0992o.d(d6, g() + j4, j3), AbstractC0992o.k(cVar, e(), true), AbstractC0992o.l(cVar2, i()), this);
                    if (this.f11673m || this.f11681c) {
                        return c0980c;
                    }
                    long g3 = g();
                    synchronized (obj) {
                        long j5 = AbstractC0992o.f11709e;
                        AbstractC0992o.f11709e = j5 + j4;
                        s(j5);
                        AbstractC0992o.f11708d = AbstractC0992o.f11708d.e(g());
                    }
                    r(AbstractC0992o.d(d(), g3 + j4, g()));
                    return c0980c;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // f0.AbstractC0983f
    public final void b() {
        AbstractC0992o.f11708d = AbstractC0992o.f11708d.b(g()).a(this.f11670j);
    }

    @Override // f0.AbstractC0983f
    public void c() {
        if (this.f11681c) {
            return;
        }
        this.f11681c = true;
        synchronized (AbstractC0992o.f11707c) {
            o();
        }
        l();
    }

    @Override // f0.AbstractC0983f
    public boolean f() {
        return false;
    }

    @Override // f0.AbstractC0983f
    public int h() {
        return this.f11667g;
    }

    @Override // f0.AbstractC0983f
    public l4.c i() {
        return this.f11666f;
    }

    @Override // f0.AbstractC0983f
    public void k() {
        this.f11672l++;
    }

    @Override // f0.AbstractC0983f
    public void l() {
        if (this.f11672l <= 0) {
            AbstractC0619m0.a("no pending nested snapshots");
        }
        int i6 = this.f11672l - 1;
        this.f11672l = i6;
        if (i6 != 0 || this.f11673m) {
            return;
        }
        N x5 = x();
        if (x5 != null) {
            if (this.f11673m) {
                AbstractC0619m0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g3 = g();
            Object[] objArr = x5.f12490b;
            long[] jArr = x5.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j3 = jArr[i7];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j3) < 128) {
                                for (AbstractC0974D a = ((InterfaceC0972B) objArr[(i7 << 3) + i9]).a(); a != null; a = a.f11648b) {
                                    long j4 = a.a;
                                    if (j4 == g3 || Y3.m.j0(this.f11670j, Long.valueOf(j4))) {
                                        C0990m c0990m = AbstractC0992o.a;
                                        a.a = 0L;
                                    }
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        a();
    }

    @Override // f0.AbstractC0983f
    public void m() {
        if (this.f11673m || this.f11681c) {
            return;
        }
        v();
    }

    @Override // f0.AbstractC0983f
    public void n(InterfaceC0972B interfaceC0972B) {
        N x5 = x();
        if (x5 == null) {
            N n3 = W.a;
            x5 = new N();
            B(x5);
        }
        x5.a(interfaceC0972B);
    }

    @Override // f0.AbstractC0983f
    public final void p() {
        int length = this.f11671k.length;
        for (int i6 = 0; i6 < length; i6++) {
            AbstractC0992o.u(this.f11671k[i6]);
        }
        o();
    }

    @Override // f0.AbstractC0983f
    public void t(int i6) {
        this.f11667g = i6;
    }

    @Override // f0.AbstractC0983f
    public AbstractC0983f u(l4.c cVar) {
        if (this.f11681c) {
            AbstractC0619m0.a("Cannot use a disposed snapshot");
        }
        if (this.f11673m && this.f11682d < 0) {
            AbstractC0619m0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g3 = g();
        A(g());
        Object obj = AbstractC0992o.f11707c;
        synchronized (obj) {
            try {
                long j3 = AbstractC0992o.f11709e;
                long j4 = 1;
                AbstractC0992o.f11709e = j3 + j4;
                AbstractC0992o.f11708d = AbstractC0992o.f11708d.e(j3);
                try {
                    C0981d c0981d = new C0981d(j3, AbstractC0992o.d(d(), g3 + j4, j3), AbstractC0992o.k(cVar, e(), true), this);
                    if (this.f11673m || this.f11681c) {
                        return c0981d;
                    }
                    long g6 = g();
                    synchronized (obj) {
                        long j5 = AbstractC0992o.f11709e;
                        AbstractC0992o.f11709e = j5 + j4;
                        s(j5);
                        AbstractC0992o.f11708d = AbstractC0992o.f11708d.e(g());
                    }
                    r(AbstractC0992o.d(d(), g6 + j4, g()));
                    return c0981d;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j3;
        A(g());
        if (this.f11673m || this.f11681c) {
            return;
        }
        long g3 = g();
        synchronized (AbstractC0992o.f11707c) {
            long j4 = AbstractC0992o.f11709e;
            j3 = 1;
            AbstractC0992o.f11709e = j4 + j3;
            s(j4);
            AbstractC0992o.f11708d = AbstractC0992o.f11708d.e(g());
        }
        r(AbstractC0992o.d(d(), g3 + j3, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0.AbstractC0997t w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0979b.w():f0.t");
    }

    public N x() {
        return this.f11668h;
    }

    @Override // f0.AbstractC0983f
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public l4.c e() {
        return this.f11665e;
    }

    public final AbstractC0997t z(long j3, N n3, HashMap hashMap, C0989l c0989l) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0989l c0989l2;
        Object[] objArr;
        long[] jArr;
        C0989l c0989l3;
        Object[] objArr2;
        long[] jArr2;
        int i6;
        long j4;
        ArrayList arrayList4;
        AbstractC0974D c6;
        C0989l d6 = d().e(g()).d(this.f11670j);
        Object[] objArr3 = n3.f12490b;
        long[] jArr3 = n3.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i7 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j5 = jArr3[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j5 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC0972B interfaceC0972B = (InterfaceC0972B) objArr3[(i7 << 3) + i9];
                            jArr2 = jArr3;
                            AbstractC0974D a = interfaceC0972B.a();
                            i6 = i9;
                            ArrayList arrayList5 = arrayList3;
                            AbstractC0974D s5 = AbstractC0992o.s(a, j3, c0989l);
                            if (s5 == null) {
                                c0989l3 = d6;
                                arrayList4 = arrayList2;
                                j4 = j5;
                            } else {
                                arrayList4 = arrayList2;
                                j4 = j5;
                                AbstractC0974D s6 = AbstractC0992o.s(a, g(), d6);
                                if (s6 == null) {
                                    c0989l3 = d6;
                                } else {
                                    c0989l3 = d6;
                                    if (s6.a != 1 && !s5.equals(s6)) {
                                        AbstractC0974D s7 = AbstractC0992o.s(a, g(), d());
                                        if (s7 == null) {
                                            AbstractC0992o.r();
                                            throw null;
                                        }
                                        if (hashMap == null || (c6 = (AbstractC0974D) hashMap.get(s5)) == null) {
                                            c6 = interfaceC0972B.c(s6, s5, s7);
                                        }
                                        if (c6 == null) {
                                            return new C0984g(this);
                                        }
                                        if (!c6.equals(s7)) {
                                            if (c6.equals(s5)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new X3.i(interfaceC0972B, s5.b(g())));
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(interfaceC0972B);
                                                arrayList3 = arrayList6;
                                            } else {
                                                arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList3.add(!c6.equals(s6) ? new X3.i(interfaceC0972B, c6) : new X3.i(interfaceC0972B, s6.b(g())));
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            c0989l3 = d6;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i6 = i9;
                            j4 = j5;
                        }
                        j5 = j4 >> 8;
                        i9 = i6 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d6 = c0989l3;
                    }
                    c0989l2 = d6;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i8 != 8) {
                        break;
                    }
                } else {
                    c0989l2 = d6;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i7 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i7++;
                jArr3 = jArr;
                objArr3 = objArr;
                d6 = c0989l2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                X3.i iVar = (X3.i) arrayList3.get(i10);
                InterfaceC0972B interfaceC0972B2 = (InterfaceC0972B) iVar.f9393c;
                AbstractC0974D abstractC0974D = (AbstractC0974D) iVar.f9394e;
                abstractC0974D.a = j3;
                synchronized (AbstractC0992o.f11707c) {
                    abstractC0974D.f11648b = interfaceC0972B2.a();
                    interfaceC0972B2.d(abstractC0974D);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                n3.l((InterfaceC0972B) arrayList2.get(i11));
            }
            ArrayList arrayList7 = this.f11669i;
            if (arrayList7 != null) {
                arrayList2 = Y3.m.z0(arrayList7, arrayList2);
            }
            this.f11669i = arrayList2;
        }
        return C0985h.f11684c;
    }
}
