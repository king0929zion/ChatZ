package S0;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class C implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public static final C f7535c = new Object();

    @Override // l4.c
    public final Object f(Object obj) {
        if (AbstractC1276k.b(obj, Boolean.FALSE)) {
            return new o0.s(o0.s.f13481h);
        }
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return new o0.s(o0.y.c(((Integer) obj).intValue()));
    }
}
