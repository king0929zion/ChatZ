package androidx.lifecycle;

import m4.AbstractC1276k;
import m4.C1270e;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: b, reason: collision with root package name */
    public static final N f10865b = new N(4);
    public final Object a;

    public Y(Z z5, W w5, F1.c cVar) {
        AbstractC1276k.f(z5, "store");
        AbstractC1276k.f(w5, "factory");
        AbstractC1276k.f(cVar, "defaultCreationExtras");
        this.a = new B0.H(z5, w5, cVar);
    }

    public U a(C1270e c1270e) {
        B0.H h3 = (B0.H) this.a;
        String b5 = c1270e.b();
        if (b5 != null) {
            return h3.g(c1270e, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public Y(B b5) {
        this.a = b5;
    }
}
