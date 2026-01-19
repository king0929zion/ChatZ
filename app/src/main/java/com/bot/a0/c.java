package A0;

/* loaded from: classes.dex */
public final class c extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f33g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f34h;

    /* renamed from: i, reason: collision with root package name */
    public int f35i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, d4.c cVar) {
        super(cVar);
        this.f34h = eVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f33g = obj;
        this.f35i |= Integer.MIN_VALUE;
        return this.f34h.a(0L, 0L, this);
    }
}
