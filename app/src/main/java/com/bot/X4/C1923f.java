package x4;

import b4.InterfaceC0910h;
import java.util.concurrent.locks.LockSupport;
import m4.AbstractC1276k;

/* renamed from: x4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1923f extends AbstractC1913a {

    /* renamed from: g, reason: collision with root package name */
    public final Thread f15691g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1908V f15692h;

    public C1923f(InterfaceC0910h interfaceC0910h, Thread thread, AbstractC1908V abstractC1908V) {
        super(interfaceC0910h, true, true);
        this.f15691g = thread;
        this.f15692h = abstractC1908V;
    }

    @Override // x4.l0
    public final void v(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f15691g;
        if (AbstractC1276k.b(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
