package A0;

/* loaded from: classes.dex */
public final class d extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f36g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f37h;

    /* renamed from: i, reason: collision with root package name */
    public int f38i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, d4.c cVar) {
        super(cVar);
        this.f37h = eVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f36g = obj;
        this.f38i |= Integer.MIN_VALUE;
        return this.f37h.b(0L, this);
    }
}
