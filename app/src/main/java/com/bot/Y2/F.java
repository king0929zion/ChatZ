package Y2;

/* loaded from: classes.dex */
public final class F extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9609g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L f9610h;

    /* renamed from: i, reason: collision with root package name */
    public int f9611i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(L l3, d4.c cVar) {
        super(cVar);
        this.f9610h = l3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9609g = obj;
        this.f9611i |= Integer.MIN_VALUE;
        return this.f9610h.j(null, null, null, null, null, null, null, this);
    }
}
