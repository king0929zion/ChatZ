package C4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f704c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f705e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f706f = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean b(k kVar, int i6) {
        while (true) {
            k c6 = c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f705e;
            if (c6 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c6 = (k) obj;
                    if (!c6.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c6);
                }
            }
            if (c6 instanceof i) {
                return (((i) c6).f702g & i6) == 0 && c6.b(kVar, i6);
            }
            atomicReferenceFieldUpdater.set(kVar, c6);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f704c;
            atomicReferenceFieldUpdater2.set(kVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c6, this, kVar)) {
                if (atomicReferenceFieldUpdater2.get(c6) != this) {
                    break;
                }
            }
            kVar.f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((C4.p) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final C4.k c() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = C4.k.f705e
            java.lang.Object r1 = r0.get(r9)
            C4.k r1 = (C4.k) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = C4.k.f704c
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof C4.p
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            C4.p r6 = (C4.p) r6
            C4.k r6 = r6.a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            C4.k r3 = (C4.k) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            m4.AbstractC1276k.d(r6, r4)
            r4 = r6
            C4.k r4 = (C4.k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: C4.k.c():C4.k");
    }

    public final void f(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f705e;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (f704c.get(this) != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (h()) {
                kVar.c();
                return;
            }
            return;
        }
    }

    public final k g() {
        k kVar;
        Object obj = f704c.get(this);
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null && (kVar = pVar.a) != null) {
            return kVar;
        }
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (k) obj;
    }

    public boolean h() {
        return f704c.get(this) instanceof p;
    }

    public String toString() {
        return new j(1, 0, AbstractC1888A.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC1888A.q(this);
    }
}
