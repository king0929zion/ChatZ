package a3;

/* renamed from: a3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805C extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f10586g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0808F f10587h;

    /* renamed from: i, reason: collision with root package name */
    public int f10588i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0805C(C0808F c0808f, d4.c cVar) {
        super(cVar);
        this.f10587h = c0808f;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f10586g = obj;
        this.f10588i |= Integer.MIN_VALUE;
        return this.f10587h.g(this);
    }
}
