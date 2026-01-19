package c;

import X3.y;

/* loaded from: classes.dex */
public final class l extends h5.e {

    /* renamed from: e, reason: collision with root package name */
    public final C0913a f11083e;

    public l(C0913a c0913a) {
        this.f11083e = c0913a;
    }

    public final void n0(Object obj) {
        y yVar;
        e.h hVar = this.f11083e.a;
        if (hVar != null) {
            hVar.n0(obj);
            yVar = y.a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
