package z4;

import c4.EnumC0927a;

/* renamed from: z4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2055f extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2057h f16337h;

    /* renamed from: i, reason: collision with root package name */
    public int f16338i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2055f(C2057h c2057h, d4.c cVar) {
        super(cVar);
        this.f16337h = c2057h;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f16336g = obj;
        this.f16338i |= Integer.MIN_VALUE;
        Object D4 = C2057h.D(this.f16337h, this);
        return D4 == EnumC0927a.f11114c ? D4 : new C2064o(D4);
    }
}
