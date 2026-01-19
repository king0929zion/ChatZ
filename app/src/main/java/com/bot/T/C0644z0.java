package T;

import b0.C0879l;
import k.C1178z;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import v.AbstractC1787b;

/* renamed from: T.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644z0 implements InterfaceC0598c {

    /* renamed from: c, reason: collision with root package name */
    public final C1178z f8296c = new C1178z();

    /* renamed from: e, reason: collision with root package name */
    public final k.I f8297e = new k.I();

    /* renamed from: f, reason: collision with root package name */
    public final Object f8298f;

    public C0644z0(Object obj) {
        this.f8298f = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0017. Please report as an issue. */
    public final void a(H0.G0 g02, C0879l c0879l) {
        Exception exc;
        C1178z c1178z = this.f8296c;
        int i6 = c1178z.f12592b;
        k.I i7 = new k.I();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            k.I i10 = this.f8297e;
            if (i8 >= i6) {
                if (i9 != i10.f12466b) {
                    AbstractC0629s.a("Applier operation size mismatch");
                }
                i10.d();
                c1178z.f12592b = 0;
                g02.n();
                return;
            }
            int i11 = i8 + 1;
            try {
                try {
                    switch (c1178z.c(i8)) {
                        case 0:
                            g02.j();
                            i8 = i11;
                        case 1:
                            int i12 = i9 + 1;
                            g02.d(i10.f(i9));
                            i9 = i12;
                            i8 = i11;
                        case 2:
                            int i13 = i8 + 2;
                            i8 += 3;
                            g02.g(c1178z.c(i11), c1178z.c(i13));
                        case 3:
                            int i14 = i8 + 2;
                            try {
                                int i15 = i8 + 3;
                                try {
                                    i8 += 4;
                                    g02.f(c1178z.c(i11), c1178z.c(i14), c1178z.c(i15));
                                } catch (Exception e6) {
                                    exc = e6;
                                    i8 = i15;
                                    break;
                                }
                            } catch (Exception e7) {
                                exc = e7;
                                i8 = i14;
                                break;
                            }
                        case 4:
                            g02.a();
                            i8 = i11;
                        case AbstractC1787b.f15290g /* 5 */:
                            i8 += 2;
                            int i16 = i9 + 1;
                            g02.c(c1178z.c(i11), i10.f(i9));
                            i9 = i16;
                        case 6:
                            i8 += 2;
                            try {
                                c1178z.c(i11);
                                int i17 = i9 + 1;
                                i9 = i17;
                            } catch (Exception e8) {
                                exc = e8;
                                break;
                            }
                        case 7:
                            int i18 = i9 + 1;
                            Object f6 = i10.f(i9);
                            AbstractC1276k.d(f6, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            AbstractC1291z.b(2, f6);
                            i9 += 2;
                            g02.l(i10.f(i18), (l4.e) f6);
                            i8 = i11;
                        case 8:
                            Object obj = g02.f1704f;
                            if (obj instanceof InterfaceC0608h) {
                                InterfaceC0608h interfaceC0608h = (InterfaceC0608h) obj;
                                if (c0879l.f10993f.j(interfaceC0608h)) {
                                    interfaceC0608h.c();
                                }
                            }
                            i7.a(obj);
                            g02.e();
                            i8 = i11;
                        default:
                            i8 = i11;
                    }
                } catch (Throwable th) {
                    g02.n();
                    throw th;
                }
            } catch (Exception e9) {
                exc = e9;
                i8 = i11;
            }
            exc = e8;
            throw new C0612j(i10, i7, c1178z, i8 - 1, exc);
        }
    }

    @Override // T.InterfaceC0598c
    public final void c(int i6, Object obj) {
        C1178z c1178z = this.f8296c;
        c1178z.a(5);
        c1178z.a(i6);
        this.f8297e.a(obj);
    }

    @Override // T.InterfaceC0598c
    public final void d(Object obj) {
        this.f8296c.a(1);
        this.f8297e.a(obj);
    }

    @Override // T.InterfaceC0598c
    public final void e() {
        this.f8296c.a(8);
    }

    @Override // T.InterfaceC0598c
    public final void f(int i6, int i7, int i8) {
        C1178z c1178z = this.f8296c;
        c1178z.a(3);
        c1178z.a(i6);
        c1178z.a(i7);
        c1178z.a(i8);
    }

    @Override // T.InterfaceC0598c
    public final void g(int i6, int i7) {
        C1178z c1178z = this.f8296c;
        c1178z.a(2);
        c1178z.a(i6);
        c1178z.a(i7);
    }

    @Override // T.InterfaceC0598c
    public final void j() {
        this.f8296c.a(0);
    }

    @Override // T.InterfaceC0598c
    public final void l(Object obj, l4.e eVar) {
        this.f8296c.a(7);
        k.I i6 = this.f8297e;
        i6.a(eVar);
        i6.a(obj);
    }

    @Override // T.InterfaceC0598c
    public final void m(int i6, Object obj) {
        C1178z c1178z = this.f8296c;
        c1178z.a(6);
        c1178z.a(i6);
        this.f8297e.a(obj);
    }

    @Override // T.InterfaceC0598c
    public final Object o() {
        return this.f8298f;
    }
}
