package z3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class I implements S {
    public final l4.f a;

    /* renamed from: b, reason: collision with root package name */
    public final S f16245b;

    public I(l4.f fVar, S s5) {
        AbstractC1276k.f(fVar, "interceptor");
        this.a = fVar;
        this.f16245b = s5;
    }

    @Override // z3.S
    public final Object a(E3.d dVar, d4.c cVar) {
        return this.a.d(this.f16245b, dVar, cVar);
    }
}
