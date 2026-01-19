package T;

import b4.C0911i;
import b4.InterfaceC0910h;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.C1940w;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class E0 implements InterfaceC1942y, B0 {

    /* renamed from: g, reason: collision with root package name */
    public static final C0606g f7947g = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0910h f7948c;

    /* renamed from: e, reason: collision with root package name */
    public final E0 f7949e = this;

    /* renamed from: f, reason: collision with root package name */
    public volatile InterfaceC0910h f7950f;

    public E0(InterfaceC0910h interfaceC0910h) {
        this.f7948c = interfaceC0910h;
    }

    @Override // T.B0
    public final void a() {
        d();
    }

    @Override // T.B0
    public final void b() {
        d();
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        InterfaceC0910h interfaceC0910h;
        InterfaceC0910h interfaceC0910h2 = this.f7950f;
        if (interfaceC0910h2 == null || interfaceC0910h2 == f7947g) {
            g0.d dVar = (g0.d) this.f7948c.r(g0.d.f11769e);
            InterfaceC0910h d02 = dVar != null ? new D0(dVar, this) : C0911i.f11057c;
            synchronized (this.f7949e) {
                try {
                    InterfaceC0910h interfaceC0910h3 = this.f7950f;
                    if (interfaceC0910h3 == null) {
                        InterfaceC0910h interfaceC0910h4 = this.f7948c;
                        interfaceC0910h = interfaceC0910h4.Y(new x4.g0((InterfaceC1922e0) interfaceC0910h4.r(C1940w.f15731e))).Y(C0911i.f11057c).Y(d02);
                    } else if (interfaceC0910h3 == f7947g) {
                        InterfaceC0910h interfaceC0910h5 = this.f7948c;
                        x4.g0 g0Var = new x4.g0((InterfaceC1922e0) interfaceC0910h5.r(C1940w.f15731e));
                        g0Var.B(new J(0));
                        interfaceC0910h = interfaceC0910h5.Y(g0Var).Y(C0911i.f11057c).Y(d02);
                    } else {
                        interfaceC0910h = interfaceC0910h3;
                    }
                    this.f7950f = interfaceC0910h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC0910h2 = interfaceC0910h;
        }
        AbstractC1276k.c(interfaceC0910h2);
        return interfaceC0910h2;
    }

    public final void d() {
        synchronized (this.f7949e) {
            try {
                InterfaceC0910h interfaceC0910h = this.f7950f;
                if (interfaceC0910h == null) {
                    this.f7950f = f7947g;
                } else {
                    AbstractC1888A.i(interfaceC0910h, new J(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T.B0
    public final void e() {
    }
}
