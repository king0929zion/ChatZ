package x4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import m4.AbstractC1276k;
import m4.AbstractC1291z;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1913a extends l0 implements InterfaceC0905c, InterfaceC1942y {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0910h f15679f;

    public AbstractC1913a(InterfaceC0910h interfaceC0910h, boolean z5, boolean z6) {
        super(z6);
        if (z5) {
            V((InterfaceC1922e0) interfaceC0910h.r(C1940w.f15731e));
        }
        this.f15679f = interfaceC0910h.Y(this);
    }

    @Override // x4.l0
    public final String F() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // x4.l0
    public final void U(N0.e eVar) {
        AbstractC1888A.t(this.f15679f, eVar);
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f15679f;
    }

    @Override // x4.l0
    public final void f0(Object obj) {
        if (!(obj instanceof C1936s)) {
            o0(obj);
        } else {
            C1936s c1936s = (C1936s) obj;
            n0(c1936s.a, C1936s.f15726b.get(c1936s) != 0);
        }
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        Throwable a = X3.l.a(obj);
        if (a != null) {
            obj = new C1936s(a, false);
        }
        Object a02 = a0(obj);
        if (a02 == AbstractC1888A.f15641e) {
            return;
        }
        x(a02);
    }

    public void n0(Throwable th, boolean z5) {
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        return this.f15679f;
    }

    public void o0(Object obj) {
    }

    public final void p0(EnumC1943z enumC1943z, AbstractC1913a abstractC1913a, l4.e eVar) {
        Object m3;
        int ordinal = enumC1943z.ordinal();
        X3.y yVar = X3.y.a;
        if (ordinal == 0) {
            try {
                C4.a.h(Y4.d.K(Y4.d.x(abstractC1913a, this, eVar)), yVar);
                return;
            } finally {
                k(X3.a.b(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                AbstractC1276k.f(eVar, "<this>");
                Y4.d.K(Y4.d.x(abstractC1913a, this, eVar)).k(yVar);
                return;
            }
            if (ordinal != 3) {
                throw new RuntimeException();
            }
            try {
                InterfaceC0910h interfaceC0910h = this.f15679f;
                Object l3 = C4.a.l(interfaceC0910h, null);
                try {
                    if (eVar instanceof d4.a) {
                        AbstractC1291z.b(2, eVar);
                        m3 = eVar.m(abstractC1913a, this);
                    } else {
                        m3 = Y4.d.Y(eVar, abstractC1913a, this);
                    }
                    C4.a.g(interfaceC0910h, l3);
                    if (m3 != EnumC0927a.f11114c) {
                        k(m3);
                    }
                } catch (Throwable th) {
                    C4.a.g(interfaceC0910h, l3);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }
}
