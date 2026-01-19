package z4;

import c4.EnumC0927a;

/* renamed from: z4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2056g extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2057h f16340h;

    /* renamed from: i, reason: collision with root package name */
    public int f16341i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2056g(C2057h c2057h, d4.c cVar) {
        super(cVar);
        this.f16340h = c2057h;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f16339g = obj;
        this.f16341i |= Integer.MIN_VALUE;
        Object E5 = this.f16340h.E(null, 0, 0L, this);
        return E5 == EnumC0927a.f11114c ? E5 : new C2064o(E5);
    }
}
