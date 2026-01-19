package C4;

import com.vladsch.flexmark.util.sequence.builder.Seg;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f707e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f708f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final u f709g = new u("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f711c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f712d;

    public n(int i6, boolean z5) {
        this.a = i6;
        this.f710b = z5;
        int i7 = i6 - 1;
        this.f711c = i7;
        this.f712d = new AtomicReferenceArray(i6);
        if (i7 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i6 & i7) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f708f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) != 0) {
                return (2305843009213693952L & j3) != 0 ? 2 : 1;
            }
            int i6 = (int) (1073741823 & j3);
            int i7 = (int) ((1152921503533105152L & j3) >> 30);
            int i8 = this.f711c;
            if (((i7 + 2) & i8) == (i6 & i8)) {
                return 1;
            }
            boolean z5 = this.f710b;
            AtomicReferenceArray atomicReferenceArray = this.f712d;
            if (z5 || atomicReferenceArray.get(i7 & i8) == null) {
                if (f708f.compareAndSet(this, j3, ((-1152921503533105153L) & j3) | (((i7 + 1) & Seg.MAX_TEXT_OFFSET) << 30))) {
                    atomicReferenceArray.set(i7 & i8, obj);
                    n nVar = this;
                    while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                        nVar = nVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVar.f712d;
                        int i9 = nVar.f711c & i7;
                        Object obj2 = atomicReferenceArray2.get(i9);
                        if ((obj2 instanceof m) && ((m) obj2).a == i7) {
                            atomicReferenceArray2.set(i9, obj);
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i10 = this.a;
                if (i10 < 1024 || ((i7 - i6) & Seg.MAX_TEXT_OFFSET) > (i10 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        do {
            atomicLongFieldUpdater = f708f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f708f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j4 = 1152921504606846976L | j3;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j3, j4)) {
                j3 = j4;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f707e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.a * 2, nVar.f710b);
            int i6 = (int) (1073741823 & j3);
            int i7 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i8 = nVar.f711c;
                int i9 = i6 & i8;
                if (i9 == (i8 & i7)) {
                    break;
                }
                Object obj = nVar.f712d.get(i9);
                if (obj == null) {
                    obj = new m(i6);
                }
                nVar3.f712d.set(nVar3.f711c & i6, obj);
                i6++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f708f;
            long j3 = atomicLongFieldUpdater.get(nVar);
            if ((j3 & 1152921504606846976L) != 0) {
                return f709g;
            }
            int i6 = (int) (j3 & 1073741823);
            int i7 = nVar.f711c;
            int i8 = i6 & i7;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i7) == i8) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f712d;
            Object obj = atomicReferenceArray.get(i8);
            boolean z5 = nVar.f710b;
            if (obj == null) {
                if (z5) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j4 = (i6 + 1) & Seg.MAX_TEXT_OFFSET;
                if (f708f.compareAndSet(nVar, j3, (j3 & (-1073741824)) | j4)) {
                    atomicReferenceArray.set(i8, null);
                    return obj;
                }
                nVar = this;
                if (z5) {
                    while (true) {
                        long j5 = atomicLongFieldUpdater.get(nVar);
                        int i9 = (int) (j5 & 1073741823);
                        if ((j5 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            if (f708f.compareAndSet(nVar2, j5, (j5 & (-1073741824)) | j4)) {
                                nVar2.f712d.set(i9 & nVar2.f711c, null);
                                nVar = null;
                            } else {
                                nVar = nVar2;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
