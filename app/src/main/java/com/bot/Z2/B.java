package Z2;

import D.C0103y;
import Q.C0415g0;
import T.C0607g0;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class B {
    public final x.s a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1942y f9889b;

    /* renamed from: c, reason: collision with root package name */
    public final C0415g0 f9890c;

    /* renamed from: d, reason: collision with root package name */
    public final D.C f9891d;

    /* renamed from: e, reason: collision with root package name */
    public final C0103y f9892e;

    /* renamed from: f, reason: collision with root package name */
    public final C0607g0 f9893f;

    /* renamed from: g, reason: collision with root package name */
    public final C0607g0 f9894g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9895h;

    public B(x.s sVar, InterfaceC1942y interfaceC1942y, C0415g0 c0415g0, D.C c6, C0103y c0103y) {
        AbstractC1276k.f(sVar, "lazyListState");
        AbstractC1276k.f(interfaceC1942y, "coroutineScope");
        this.a = sVar;
        this.f9889b = interfaceC1942y;
        this.f9890c = c0415g0;
        this.f9891d = c6;
        this.f9892e = c0103y;
        this.f9893f = T.r.A(null);
        this.f9894g = T.r.A(Float.valueOf(S.l.f7374V));
    }

    public final void a(float f6) {
        this.f9894g.setValue(Float.valueOf(f6));
    }
}
