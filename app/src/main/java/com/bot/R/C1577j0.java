package r;

/* renamed from: r.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1577j0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC1592o0 f14354h;

    /* renamed from: i, reason: collision with root package name */
    public int f14355i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1577j0(AbstractC1592o0 abstractC1592o0, d4.c cVar) {
        super(cVar);
        this.f14354h = abstractC1592o0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14353g = obj;
        this.f14355i |= Integer.MIN_VALUE;
        return AbstractC1592o0.P0(this.f14354h, this);
    }
}
