package z4;

import B0.M;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x4.AbstractC1888A;
import x4.AbstractC1913a;
import x4.C1936s;
import x4.f0;
import x4.k0;
import x4.l0;

/* loaded from: classes.dex */
public final class t extends AbstractC1913a implements u, InterfaceC2061l {

    /* renamed from: g, reason: collision with root package name */
    public final C2057h f16380g;

    public t(InterfaceC0910h interfaceC0910h, C2057h c2057h, boolean z5, boolean z6) {
        super(interfaceC0910h, z5, z6);
        this.f16380g = c2057h;
    }

    @Override // x4.l0
    public final void C(CancellationException cancellationException) {
        this.f16380g.h(cancellationException, true);
        B(cancellationException);
    }

    @Override // z4.x
    public Object a(InterfaceC0905c interfaceC0905c, Object obj) {
        return this.f16380g.a(interfaceC0905c, obj);
    }

    @Override // z4.w
    public final M.q b() {
        return this.f16380g.b();
    }

    @Override // x4.l0, x4.InterfaceC1922e0
    public final void f(CancellationException cancellationException) {
        Object obj = l0.f15714c.get(this);
        if (obj instanceof C1936s) {
            return;
        }
        if ((obj instanceof k0) && ((k0) obj).c()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new f0(F(), null, this);
        }
        C(cancellationException);
    }

    @Override // z4.w
    public final Object i() {
        return this.f16380g.i();
    }

    @Override // z4.w
    public final C2052c iterator() {
        C2057h c2057h = this.f16380g;
        c2057h.getClass();
        return new C2052c(c2057h);
    }

    @Override // z4.w
    public final Object m(B4.s sVar) {
        C2057h c2057h = this.f16380g;
        c2057h.getClass();
        return C2057h.D(c2057h, sVar);
    }

    @Override // z4.x
    public boolean n(Throwable th) {
        return this.f16380g.h(th, false);
    }

    @Override // x4.AbstractC1913a
    public final void n0(Throwable th, boolean z5) {
        if (this.f16380g.h(th, false) || z5) {
            return;
        }
        AbstractC1888A.t(this.f15679f, th);
    }

    @Override // x4.AbstractC1913a
    public final void o0(Object obj) {
        this.f16380g.n(null);
    }

    @Override // z4.w
    public final Object p(InterfaceC0905c interfaceC0905c) {
        return this.f16380g.p(interfaceC0905c);
    }

    public final void q0(M m3) {
        C2057h c2057h = this.f16380g;
        c2057h.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2057h.f16350m;
        while (!atomicReferenceFieldUpdater.compareAndSet(c2057h, null, m3)) {
            if (atomicReferenceFieldUpdater.get(c2057h) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(c2057h);
                    C4.u uVar = AbstractC2059j.f16368q;
                    if (obj != uVar) {
                        if (obj == AbstractC2059j.f16369r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    C4.u uVar2 = AbstractC2059j.f16369r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c2057h, uVar, uVar2)) {
                        if (atomicReferenceFieldUpdater.get(c2057h) != uVar) {
                            break;
                        }
                    }
                    m3.f(c2057h.q());
                    return;
                }
            }
        }
    }

    @Override // z4.x
    public Object t(Object obj) {
        return this.f16380g.t(obj);
    }
}
