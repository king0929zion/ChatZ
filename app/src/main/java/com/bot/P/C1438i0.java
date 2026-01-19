package p;

/* renamed from: p.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1438i0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1444l0 f13726h;

    /* renamed from: i, reason: collision with root package name */
    public int f13727i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1438i0(C1444l0 c1444l0, d4.c cVar) {
        super(cVar);
        this.f13726h = c1444l0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f13725g = obj;
        this.f13727i |= Integer.MIN_VALUE;
        return C1444l0.N0(this.f13726h, this);
    }
}
