package I0;

import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class P extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2229g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S f2230h;

    /* renamed from: i, reason: collision with root package name */
    public int f2231i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s5, d4.c cVar) {
        super(cVar);
        this.f2230h = s5;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f2229g = obj;
        this.f2231i |= Integer.MIN_VALUE;
        this.f2230h.a(null, this);
        return EnumC0927a.f11114c;
    }
}
