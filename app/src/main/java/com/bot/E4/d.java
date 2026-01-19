package E4;

import C4.v;
import b4.C0911i;
import b4.InterfaceC0910h;
import java.util.concurrent.Executor;
import x4.AbstractC1909W;
import x4.AbstractC1939v;

/* loaded from: classes.dex */
public final class d extends AbstractC1909W implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final d f1360f = new AbstractC1939v();

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC1939v f1361g;

    /* JADX WARN: Type inference failed for: r0v0, types: [x4.v, E4.d] */
    static {
        l lVar = l.f1372f;
        int i6 = v.a;
        if (64 >= i6) {
            i6 = 64;
        }
        f1361g = lVar.g0(C4.a.j(i6, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // x4.AbstractC1939v
    public final void d0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        f1361g.d0(interfaceC0910h, runnable);
    }

    @Override // x4.AbstractC1939v
    public final void e0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        f1361g.e0(interfaceC0910h, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d0(C0911i.f11057c, runnable);
    }

    @Override // x4.AbstractC1939v
    public final AbstractC1939v g0(int i6) {
        return l.f1372f.g0(i6);
    }

    @Override // x4.AbstractC1939v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
