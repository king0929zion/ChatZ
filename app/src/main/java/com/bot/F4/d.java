package F4;

/* loaded from: classes.dex */
public final class d extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public e f1616g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1617h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f1618i;

    /* renamed from: j, reason: collision with root package name */
    public int f1619j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, d4.c cVar) {
        super(cVar);
        this.f1618i = eVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f1617h = obj;
        this.f1619j |= Integer.MIN_VALUE;
        return this.f1618i.d(this);
    }
}
