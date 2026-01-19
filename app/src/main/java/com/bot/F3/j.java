package F3;

/* loaded from: classes.dex */
public final class j extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f1604h;

    /* renamed from: i, reason: collision with root package name */
    public int f1605i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, d4.c cVar) {
        super(cVar);
        this.f1604h = kVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f1603g = obj;
        this.f1605i |= Integer.MIN_VALUE;
        return this.f1604h.d(this);
    }
}
