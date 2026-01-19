package D;

import T.C0627q0;
import T.C0639x;
import T.InterfaceC0631t;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1123c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1125f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1126g;

    public /* synthetic */ o1(int i6, int i7, Object obj, Object obj2) {
        this.f1123c = i7;
        this.f1125f = obj;
        this.f1124e = i6;
        this.f1126g = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // l4.c
    public final Object f(Object obj) {
        InterfaceC0631t interfaceC0631t;
        long[] jArr;
        InterfaceC0631t interfaceC0631t2;
        long[] jArr2;
        int i6;
        switch (this.f1123c) {
            case 0:
                p1 p1Var = (p1) this.f1125f;
                F0.k0 k0Var = (F0.k0) this.f1126g;
                F0.j0 j0Var = (F0.j0) obj;
                int i7 = p1Var.f1131b;
                Z0 z02 = p1Var.a;
                X0.B b5 = p1Var.f1132c;
                d1 d1Var = (d1) p1Var.f1133d.b();
                z02.a(r.X0.f14183c, AbstractC0090r0.l(j0Var, i7, b5, d1Var != null ? d1Var.a : null, false, k0Var.f1485c), this.f1124e, k0Var.f1486e);
                F0.j0.l(j0Var, k0Var, 0, Math.round(-z02.a.g()));
                return X3.y.a;
            case 1:
                C0627q0 c0627q0 = (C0627q0) this.f1125f;
                k.H h3 = (k.H) this.f1126g;
                InterfaceC0631t interfaceC0631t3 = (InterfaceC0631t) obj;
                int i8 = c0627q0.f8194e;
                int i9 = this.f1124e;
                if (i8 == i9 && AbstractC1276k.b(h3, c0627q0.f8195f) && (interfaceC0631t3 instanceof C0639x)) {
                    long[] jArr3 = h3.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j3 = jArr3[i10];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = 0;
                                while (i13 < i12) {
                                    if ((255 & j3) < 128) {
                                        int i14 = (i10 << 3) + i13;
                                        Object obj2 = h3.f12461b[i14];
                                        boolean z5 = h3.f12462c[i14] != i9;
                                        if (z5) {
                                            i6 = i11;
                                            C0639x c0639x = (C0639x) interfaceC0631t3;
                                            interfaceC0631t2 = interfaceC0631t3;
                                            Y4.l.Q(c0639x.f8240j, obj2, c0627q0);
                                            if (obj2 instanceof T.E) {
                                                T.E e6 = (T.E) obj2;
                                                jArr2 = jArr3;
                                                if (!c0639x.f8240j.c(e6)) {
                                                    Y4.l.R(c0639x.f8243m, e6);
                                                }
                                                k.M m3 = c0627q0.f8196g;
                                                if (m3 != null) {
                                                    m3.k(obj2);
                                                }
                                            } else {
                                                jArr2 = jArr3;
                                            }
                                        } else {
                                            interfaceC0631t2 = interfaceC0631t3;
                                            jArr2 = jArr3;
                                            i6 = i11;
                                        }
                                        if (z5) {
                                            h3.f(i14);
                                        }
                                    } else {
                                        interfaceC0631t2 = interfaceC0631t3;
                                        jArr2 = jArr3;
                                        i6 = i11;
                                    }
                                    j3 >>= i6;
                                    i13++;
                                    i11 = i6;
                                    interfaceC0631t3 = interfaceC0631t2;
                                    jArr3 = jArr2;
                                }
                                interfaceC0631t = interfaceC0631t3;
                                jArr = jArr3;
                                if (i12 != i11) {
                                }
                            } else {
                                interfaceC0631t = interfaceC0631t3;
                                jArr = jArr3;
                            }
                            if (i10 != length) {
                                i10++;
                                interfaceC0631t3 = interfaceC0631t;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                return X3.y.a;
            default:
                p.N0 n02 = (p.N0) this.f1125f;
                F0.k0 k0Var2 = (F0.k0) this.f1126g;
                F0.j0 j0Var2 = (F0.j0) obj;
                int g3 = n02.f13605r.a.g();
                if (g3 < 0) {
                    g3 = 0;
                }
                int i15 = this.f1124e;
                if (g3 > i15) {
                    g3 = i15;
                }
                int i16 = -g3;
                boolean z6 = n02.f13606s;
                int i17 = z6 ? 0 : i16;
                if (!z6) {
                    i16 = 0;
                }
                j0Var2.f1484c = true;
                F0.j0.m(j0Var2, k0Var2, i17, i16);
                j0Var2.f1484c = false;
                return X3.y.a;
        }
    }

    public /* synthetic */ o1(p1 p1Var, F0.k0 k0Var, int i6) {
        this.f1123c = 0;
        this.f1125f = p1Var;
        this.f1126g = k0Var;
        this.f1124e = i6;
    }
}
