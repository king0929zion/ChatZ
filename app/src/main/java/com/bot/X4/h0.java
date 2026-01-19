package x4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class h0 extends C4.k implements InterfaceC1900M, InterfaceC1914a0 {

    /* renamed from: g, reason: collision with root package name */
    public l0 f15698g;

    @Override // x4.InterfaceC1914a0
    public final boolean d() {
        return true;
    }

    @Override // x4.InterfaceC1900M
    public final void dispose() {
        l0 i6 = i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l0.f15714c;
            Object obj = atomicReferenceFieldUpdater.get(i6);
            if (obj instanceof h0) {
                if (obj != this) {
                    return;
                }
                C1902O c1902o = AbstractC1888A.f15646j;
                while (!atomicReferenceFieldUpdater.compareAndSet(i6, obj, c1902o)) {
                    if (atomicReferenceFieldUpdater.get(i6) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC1914a0) || ((InterfaceC1914a0) obj).e() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C4.k.f704c;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C4.p) {
                    C4.k kVar = ((C4.p) obj2).a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                C4.k kVar2 = (C4.k) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C4.k.f706f;
                C4.p pVar = (C4.p) atomicReferenceFieldUpdater3.get(kVar2);
                if (pVar == null) {
                    pVar = new C4.p(kVar2);
                    atomicReferenceFieldUpdater3.set(kVar2, pVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                kVar2.c();
                return;
            }
        }
    }

    @Override // x4.InterfaceC1914a0
    public final n0 e() {
        return null;
    }

    public InterfaceC1922e0 getParent() {
        return i();
    }

    public final l0 i() {
        l0 l0Var = this.f15698g;
        if (l0Var != null) {
            return l0Var;
        }
        AbstractC1276k.k("job");
        throw null;
    }

    public abstract boolean j();

    public abstract void k(Throwable th);

    @Override // C4.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1888A.q(this) + "[job@" + AbstractC1888A.q(i()) + ']';
    }
}
