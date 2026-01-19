package I0;

import c4.EnumC0927a;

/* renamed from: I0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214w extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0216x f2395h;

    /* renamed from: i, reason: collision with root package name */
    public int f2396i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214w(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, d4.c cVar) {
        super(cVar);
        this.f2395h = viewTreeObserverOnGlobalLayoutListenerC0216x;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f2394g = obj;
        this.f2396i |= Integer.MIN_VALUE;
        this.f2395h.M(null, this);
        return EnumC0927a.f11114c;
    }
}
