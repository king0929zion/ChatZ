package x4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: x4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1917c extends h0 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15681k = AtomicReferenceFieldUpdater.newUpdater(C1917c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: h, reason: collision with root package name */
    public final C1928k f15682h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1900M f15683i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1921e f15684j;

    public C1917c(C1921e c1921e, C1928k c1928k) {
        this.f15684j = c1921e;
        this.f15682h = c1928k;
    }

    @Override // x4.h0
    public final boolean j() {
        return false;
    }

    @Override // x4.h0
    public final void k(Throwable th) {
        C1928k c1928k = this.f15682h;
        if (th != null) {
            c1928k.getClass();
            C4.u H3 = c1928k.H(new C1936s(th, false), null);
            if (H3 != null) {
                c1928k.z(H3);
                C1919d c1919d = (C1919d) f15681k.get(this);
                if (c1919d != null) {
                    c1919d.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1921e.f15690b;
        C1921e c1921e = this.f15684j;
        if (atomicIntegerFieldUpdater.decrementAndGet(c1921e) == 0) {
            InterfaceC1891D[] interfaceC1891DArr = c1921e.a;
            ArrayList arrayList = new ArrayList(interfaceC1891DArr.length);
            for (InterfaceC1891D interfaceC1891D : interfaceC1891DArr) {
                arrayList.add(interfaceC1891D.j());
            }
            c1928k.k(arrayList);
        }
    }
}
