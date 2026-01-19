package x4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: x4.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1918c0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15685h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y3.l f15686i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1918c0(Y3.l lVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15686i = lVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1918c0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1918c0 c1918c0 = new C1918c0(this.f15686i, interfaceC0905c);
        c1918c0.f15685h = obj;
        return c1918c0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6;
        X3.a.e(obj);
        InterfaceC0910h c6 = ((InterfaceC1942y) this.f15685h).c();
        Y3.l lVar = this.f15686i;
        try {
            w0 w0Var = new w0();
            w0Var.f15734i = AbstractC1888A.u(AbstractC1888A.r(c6), true, w0Var);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w0.f15732j;
            try {
                do {
                    i6 = atomicIntegerFieldUpdater.get(w0Var);
                    if (i6 != 0) {
                        if (i6 != 2 && i6 != 3) {
                            w0.m(i6);
                            throw null;
                        }
                    }
                    return lVar.b();
                } while (!atomicIntegerFieldUpdater.compareAndSet(w0Var, i6, 0));
                return lVar.b();
            } finally {
                w0Var.l();
            }
        } catch (InterruptedException e6) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e6);
        }
    }
}
