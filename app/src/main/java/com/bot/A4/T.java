package A4;

import m4.AbstractC1276k;
import x4.C1928k;
import x4.InterfaceC1900M;

/* loaded from: classes.dex */
public final class T implements InterfaceC1900M {

    /* renamed from: c, reason: collision with root package name */
    public final V f202c;

    /* renamed from: e, reason: collision with root package name */
    public final long f203e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f204f;

    /* renamed from: g, reason: collision with root package name */
    public final C1928k f205g;

    public T(V v5, long j3, Object obj, C1928k c1928k) {
        this.f202c = v5;
        this.f203e = j3;
        this.f204f = obj;
        this.f205g = c1928k;
    }

    @Override // x4.InterfaceC1900M
    public final void dispose() {
        V v5 = this.f202c;
        synchronized (v5) {
            if (this.f203e < v5.p()) {
                return;
            }
            Object[] objArr = v5.f216k;
            AbstractC1276k.c(objArr);
            long j3 = this.f203e;
            if (objArr[((int) j3) & (objArr.length - 1)] != this) {
                return;
            }
            W.d(objArr, j3, W.a);
            v5.k();
        }
    }
}
