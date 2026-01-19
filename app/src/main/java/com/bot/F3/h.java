package F3;

/* loaded from: classes.dex */
public final class h extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f1596g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1597h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f1599j;

    /* renamed from: k, reason: collision with root package name */
    public int f1600k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, d4.c cVar) {
        super(cVar);
        this.f1599j = kVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f1598i = obj;
        this.f1600k |= Integer.MIN_VALUE;
        return this.f1599j.c(null, this);
    }
}
