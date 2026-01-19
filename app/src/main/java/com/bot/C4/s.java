package C4;

import b4.InterfaceC0910h;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.BasedOptionsHolder;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x4.q0;

/* loaded from: classes.dex */
public abstract class s implements b implements q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f714g = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: f, reason: collision with root package name */
    public final long f715f;

    public s(long j3, s sVar, int i6) {
        super(sVar);
        this.f715f = j3;
        this.cleanedAndPointers$volatile = i6 << 16;
    }

    @Override // C4.b
    public final boolean d() {
        return f714g.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f714g.addAndGet(this, BasedOptionsHolder.F_APPLICATION_OPTIONS) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i6, InterfaceC0910h interfaceC0910h);

    public final void i() {
        if (f714g.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = f714g;
            i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, PegdownExtensions.SUPPRESS_HTML_BLOCKS + i6));
        return true;
    }
}
