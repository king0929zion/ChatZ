package x4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class g0 extends l0 implements InterfaceC1934q {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(InterfaceC1922e0 interfaceC1922e0) {
        super(true);
        boolean z5 = true;
        V(interfaceC1922e0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l0.f15715e;
        InterfaceC1931n interfaceC1931n = (InterfaceC1931n) atomicReferenceFieldUpdater.get(this);
        C1932o c1932o = interfaceC1931n instanceof C1932o ? (C1932o) interfaceC1931n : null;
        if (c1932o != null) {
            l0 i6 = c1932o.i();
            while (!i6.M()) {
                InterfaceC1931n interfaceC1931n2 = (InterfaceC1931n) atomicReferenceFieldUpdater.get(i6);
                C1932o c1932o2 = interfaceC1931n2 instanceof C1932o ? (C1932o) interfaceC1931n2 : null;
                if (c1932o2 != null) {
                    i6 = c1932o2.i();
                }
            }
            this.f15695f = z5;
        }
        z5 = false;
        this.f15695f = z5;
    }

    @Override // x4.l0
    public final boolean M() {
        return this.f15695f;
    }

    @Override // x4.l0
    public final boolean P() {
        return true;
    }

    public final boolean n0() {
        return Z(X3.y.a);
    }
}
