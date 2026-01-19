package x4;

import b4.AbstractC0903a;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class o0 extends AbstractC0903a implements InterfaceC1922e0 {

    /* renamed from: e, reason: collision with root package name */
    public static final o0 f15720e = new AbstractC0903a(C1940w.f15731e);

    @Override // x4.InterfaceC1922e0
    public final InterfaceC1900M H(boolean z5, boolean z6, l4.c cVar) {
        return p0.f15721c;
    }

    @Override // x4.InterfaceC1922e0
    public final Object Q(d4.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // x4.InterfaceC1922e0
    public final InterfaceC1900M S(l4.c cVar) {
        return p0.f15721c;
    }

    @Override // x4.InterfaceC1922e0
    public final boolean d() {
        return true;
    }

    @Override // x4.InterfaceC1922e0
    public final void f(CancellationException cancellationException) {
    }

    @Override // x4.InterfaceC1922e0
    public final InterfaceC1931n s(l0 l0Var) {
        return p0.f15721c;
    }

    @Override // x4.InterfaceC1922e0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // x4.InterfaceC1922e0
    public final CancellationException y() {
        throw new IllegalStateException("This job is always active");
    }
}
