package w3;

import X3.n;
import b4.InterfaceC0908f;
import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x4.AbstractC1898K;
import x4.C1940w;
import x4.InterfaceC1934q;
import x4.g0;

/* renamed from: w3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1847d implements InterfaceC1846c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15425f = AtomicIntegerFieldUpdater.newUpdater(AbstractC1847d.class, "closed");

    /* renamed from: c, reason: collision with root package name */
    public final E4.d f15426c;
    private volatile /* synthetic */ int closed = 0;

    /* renamed from: e, reason: collision with root package name */
    public final n f15427e;

    public AbstractC1847d() {
        E4.e eVar = AbstractC1898K.a;
        this.f15426c = E4.d.f1360f;
        this.f15427e = X3.a.d(new A0.b(this, 21));
    }

    @Override // x4.InterfaceC1942y
    public InterfaceC0910h c() {
        return (InterfaceC0910h) this.f15427e.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f15425f.compareAndSet(this, 0, 1)) {
            InterfaceC0908f r5 = c().r(C1940w.f15731e);
            InterfaceC1934q interfaceC1934q = r5 instanceof InterfaceC1934q ? (InterfaceC1934q) r5 : null;
            if (interfaceC1934q == null) {
                return;
            }
            ((g0) interfaceC1934q).n0();
        }
    }
}
