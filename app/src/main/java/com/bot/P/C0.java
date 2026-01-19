package p;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class C0 {
    public final AtomicReference a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final H4.c f13564b = new H4.c();

    public static final void a(C0 c02, z0 z0Var) {
        AtomicReference atomicReference = c02.a;
        while (true) {
            z0 z0Var2 = (z0) atomicReference.get();
            if (z0Var2 != null && z0Var.a.compareTo(z0Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(z0Var2, z0Var)) {
                if (atomicReference.get() != z0Var2) {
                    break;
                }
            }
            if (z0Var2 != null) {
                z0Var2.f13830b.f(new E0.b("Mutation interrupted", 2));
                return;
            }
            return;
        }
    }
}
