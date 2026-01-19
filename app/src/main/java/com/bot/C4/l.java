package C4;

import com.vladsch.flexmark.util.sequence.builder.Seg;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a6 = nVar.a(runnable);
            if (a6 == 0) {
                return true;
            }
            if (a6 == 1) {
                n c6 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c6) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a6 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c6 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c6) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) a.get(this);
        nVar.getClass();
        long j3 = n.f708f.get(nVar);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & Seg.MAX_TEXT_OFFSET;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d6 = nVar.d();
            if (d6 != n.f709g) {
                return d6;
            }
            n c6 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c6) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
