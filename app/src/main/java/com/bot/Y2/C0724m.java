package Y2;

import c4.EnumC0927a;

/* renamed from: Y2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724m extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9741g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0730t f9742h;

    /* renamed from: i, reason: collision with root package name */
    public int f9743i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0724m(C0730t c0730t, d4.c cVar) {
        super(cVar);
        this.f9742h = c0730t;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9741g = obj;
        this.f9743i |= Integer.MIN_VALUE;
        Object g3 = this.f9742h.g(this);
        return g3 == EnumC0927a.f11114c ? g3 : new X3.l(g3);
    }
}
