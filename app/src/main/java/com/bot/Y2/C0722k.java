package Y2;

import c4.EnumC0927a;

/* renamed from: Y2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722k extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9729g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0730t f9730h;

    /* renamed from: i, reason: collision with root package name */
    public int f9731i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0722k(C0730t c0730t, d4.c cVar) {
        super(cVar);
        this.f9730h = c0730t;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9729g = obj;
        this.f9731i |= Integer.MIN_VALUE;
        Object e6 = this.f9730h.e(null, null, this);
        return e6 == EnumC0927a.f11114c ? e6 : new X3.l(e6);
    }
}
