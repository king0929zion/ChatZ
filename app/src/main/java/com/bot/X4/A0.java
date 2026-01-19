package x4;

import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public final class A0 extends AbstractC1939v {

    /* renamed from: f, reason: collision with root package name */
    public static final A0 f15647f = new AbstractC1939v();

    @Override // x4.AbstractC1939v
    public final void d0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        E0 e02 = (E0) interfaceC0910h.r(E0.f15652f);
        if (e02 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        e02.f15653e = true;
    }

    @Override // x4.AbstractC1939v
    public final AbstractC1939v g0(int i6) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // x4.AbstractC1939v
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
