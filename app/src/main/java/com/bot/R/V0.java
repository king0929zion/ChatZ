package r;

/* loaded from: classes.dex */
public final class V0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ M1.b f14164h;

    /* renamed from: i, reason: collision with root package name */
    public int f14165i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(M1.b bVar, d4.c cVar) {
        super(cVar);
        this.f14164h = bVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14163g = obj;
        this.f14165i |= Integer.MIN_VALUE;
        return this.f14164h.i(null, null, this);
    }
}
