package T;

import b0.AbstractC0869b;
import x4.C1928k;

/* renamed from: T.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600d extends AbstractC0869b {
    public C1928k a;

    /* renamed from: b, reason: collision with root package name */
    public l4.c f8076b;

    @Override // b0.AbstractC0869b
    public final void a() {
        this.f8076b = null;
        this.a = null;
    }

    @Override // b0.AbstractC0869b
    public final void b(Throwable th) {
        C1928k c1928k = this.a;
        if (c1928k != null) {
            c1928k.k(X3.a.b(th));
        }
    }
}
