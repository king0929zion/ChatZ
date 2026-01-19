package B0;

import F0.InterfaceC0134w;
import h0.AbstractC1040q;
import java.util.List;
import k.C1151E;
import k.C1173u;
import m4.AbstractC1276k;

/* renamed from: B0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e {
    public final InterfaceC0134w a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f439b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f440c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f441d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f442e;

    /* renamed from: f, reason: collision with root package name */
    public final k.I f443f = new k.I();

    /* renamed from: g, reason: collision with root package name */
    public final C0039o f444g = new C0039o();

    /* renamed from: h, reason: collision with root package name */
    public final C1151E f445h = new C1151E(10);

    public C0029e(InterfaceC0134w interfaceC0134w) {
        this.a = interfaceC0134w;
    }

    /* JADX WARN: Multi-variable type inference failed */
                    public final void a(long j3, List list, boolean z5) {
        C1151E c1151e;
        int i6;
        C0038n c0038n;
        C0038n c0038n2;
        int size = list.size();
        C0039o c0039o = this.f444g;
        C0039o c0039o2 = c0039o;
        boolean z6 = true;
        int i7 = 0;
        while (true) {
            c1151e = this.f445h;
            if (i7 >= size) {
                break;
            }
            AbstractC1040q abstractC1040q = (AbstractC1040q) list.get(i7);
            if (abstractC1040q.f11819q) {
                abstractC1040q.f11818p = new C0028d(0, this, abstractC1040q);
                if (z6) {
                    V.e eVar = c0039o2.a;
                    Object r14 = eVar.f8759c;
                    int i8 = eVar.f8761f;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i8) {
                            c0038n2 = 0;
                            break;
                        }
                        c0038n2 = r14[i9];
                        if (AbstractC1276k.b(((C0038n) c0038n2).f461c, abstractC1040q)) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    c0038n = c0038n2;
                    if (c0038n != null) {
                        c0038n.f467i = true;
                        c0038n.f462d.a(j3);
                        if (z5) {
                            Object e6 = c1151e.e(j3);
                            if (e6 == null) {
                                e6 = new k.I();
                                c1151e.h(j3, e6);
                            }
                            ((k.I) e6).a(c0038n);
                        }
                        c0039o2 = c0038n;
                    } else {
                        z6 = false;
                    }
                }
                c0038n = new C0038n(abstractC1040q);
                c0038n.f462d.a(j3);
                if (z5) {
                    Object e7 = c1151e.e(j3);
                    if (e7 == null) {
                        e7 = new k.I();
                        c1151e.h(j3, e7);
                    }
                    ((k.I) e7).a(c0038n);
                }
                c0039o2.a.b(c0038n);
                c0039o2 = c0038n;
            }
            i7++;
        }
        if (z5) {
            long[] jArr = c1151e.f12447b;
            Object[] objArr = c1151e.f12448c;
            long[] jArr2 = c1151e.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j4 = jArr2[i10];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8;
                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((255 & j4) < 128) {
                                int i14 = (i10 << 3) + i13;
                                long j5 = jArr[i14];
                                k.I i15 = (k.I) objArr[i14];
                                i6 = i11;
                                V.e eVar2 = c0039o.a;
                                Object[] objArr2 = eVar2.f8759c;
                                int i16 = eVar2.f8761f;
                                for (int i17 = 0; i17 < i16; i17++) {
                                    ((C0038n) objArr2[i17]).f(j5, i15);
                                }
                            } else {
                                i6 = i11;
                            }
                            j4 >>= i6;
                            i13++;
                            i11 = i6;
                        }
                        if (i12 != i11) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        c1151e.a();
    }

    public final boolean b(C0033i c0033i, boolean z5) {
        C1173u c1173u = (C1173u) c0033i.f453e;
        InterfaceC0134w interfaceC0134w = this.a;
        C0039o c0039o = this.f444g;
        boolean a = c0039o.a(c1173u, interfaceC0134w, c0033i, z5);
        V.e eVar = c0039o.a;
        if (!a) {
            return false;
        }
        boolean z6 = true;
        this.f439b = true;
        Object[] objArr = eVar.f8759c;
        int i6 = eVar.f8761f;
        boolean z7 = false;
        for (int i7 = 0; i7 < i6; i7++) {
            z7 = ((C0038n) objArr[i7]).e(c0033i, z5) || z7;
        }
        Object[] objArr2 = eVar.f8759c;
        int i8 = eVar.f8761f;
        boolean z8 = false;
        for (int i9 = 0; i9 < i8; i9++) {
            z8 = ((C0038n) objArr2[i9]).d(c0033i) || z8;
        }
        c0039o.b(c0033i);
        if (!z8 && !z7) {
            z6 = false;
        }
        this.f439b = false;
        if (this.f442e) {
            this.f442e = false;
            k.I i10 = this.f443f;
            int i11 = i10.f12466b;
            for (int i12 = 0; i12 < i11; i12++) {
                d((AbstractC1040q) i10.f(i12));
            }
            i10.d();
        }
        if (this.f440c) {
            this.f440c = false;
            c();
        }
        if (this.f441d) {
            this.f441d = false;
            c0039o.a.g();
        }
        return z6;
    }

    public final void c() {
        if (this.f439b) {
            this.f440c = true;
            return;
        }
        C0039o c0039o = this.f444g;
        V.e eVar = c0039o.a;
        Object[] objArr = eVar.f8759c;
        int i6 = eVar.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            ((C0038n) objArr[i7]).c();
        }
        if (this.f441d) {
            this.f441d = true;
        } else {
            c0039o.a.g();
        }
    }

    public final void d(AbstractC1040q abstractC1040q) {
        if (this.f439b) {
            this.f442e = true;
            this.f443f.a(abstractC1040q);
            return;
        }
        C0039o c0039o = this.f444g;
        k.I i6 = c0039o.f469b;
        i6.d();
        i6.a(c0039o);
        while (i6.i()) {
            C0039o c0039o2 = (C0039o) i6.k(i6.f12466b - 1);
            int i7 = 0;
            while (true) {
                V.e eVar = c0039o2.a;
                if (i7 < eVar.f8761f) {
                    C0038n c0038n = (C0038n) eVar.f8759c[i7];
                    if (AbstractC1276k.b(c0038n.f461c, abstractC1040q)) {
                        c0039o2.a.j(c0038n);
                        c0038n.c();
                    } else {
                        i6.a(c0038n);
                        i7++;
                    }
                }
            }
        }
    }
}
