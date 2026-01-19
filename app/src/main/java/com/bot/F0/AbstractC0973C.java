package f0;

import b0.C0868a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: f0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0973C implements InterfaceC0972B {

    /* renamed from: c, reason: collision with root package name */
    public final C0868a f11647c = new AtomicInteger(0);

    public final boolean e(int i6) {
        return (i6 & this.f11647c.get()) != 0;
    }

    public final void f(int i6) {
        C0868a c0868a;
        int i7;
        do {
            c0868a = this.f11647c;
            i7 = c0868a.get();
            if ((i7 & i6) != 0) {
                return;
            }
        } while (!c0868a.compareAndSet(i7, i7 | i6));
    }
}
