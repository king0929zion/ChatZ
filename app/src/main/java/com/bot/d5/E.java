package d5;

import java.util.concurrent.atomic.AtomicReference;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class E {
    public static final D a = new D(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f11453b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f11454c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f11453b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i6 = 0; i6 < highestOneBit; i6++) {
            atomicReferenceArr[i6] = new AtomicReference();
        }
        f11454c = atomicReferenceArr;
    }

    public static final void a(D d6) {
        AbstractC1276k.f(d6, "segment");
        if (d6.f11451f != null || d6.f11452g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (d6.f11449d) {
            return;
        }
        AtomicReference atomicReference = f11454c[(int) (Thread.currentThread().getId() & (f11453b - 1))];
        D d7 = a;
        D d8 = (D) atomicReference.getAndSet(d7);
        if (d8 == d7) {
            return;
        }
        int i6 = d8 != null ? d8.f11448c : 0;
        if (i6 >= 65536) {
            atomicReference.set(d8);
            return;
        }
        d6.f11451f = d8;
        d6.f11447b = 0;
        d6.f11448c = i6 + 8192;
        atomicReference.set(d6);
    }

    public static final D b() {
        AtomicReference atomicReference = f11454c[(int) (Thread.currentThread().getId() & (f11453b - 1))];
        D d6 = a;
        D d7 = (D) atomicReference.getAndSet(d6);
        if (d7 == d6) {
            return new D();
        }
        if (d7 == null) {
            atomicReference.set(null);
            return new D();
        }
        atomicReference.set(d7.f11451f);
        d7.f11451f = null;
        d7.f11448c = 0;
        return d7;
    }
}
