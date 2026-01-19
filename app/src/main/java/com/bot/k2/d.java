package k2;

/* loaded from: classes.dex */
public final class d extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f12602g;

    /* renamed from: h, reason: collision with root package name */
    public H4.e f12603h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12604i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f12605j;

    /* renamed from: k, reason: collision with root package name */
    public int f12606k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, d4.c cVar) {
        super(cVar);
        this.f12605j = eVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12604i = obj;
        this.f12606k |= Integer.MIN_VALUE;
        return this.f12605j.a(this);
    }
}
