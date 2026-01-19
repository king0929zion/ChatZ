package F2;

/* loaded from: classes.dex */
public final class e extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public int f1556g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1557h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f1558i;

    /* renamed from: j, reason: collision with root package name */
    public int f1559j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, d4.c cVar) {
        super(cVar);
        this.f1558i = iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f1557h = obj;
        this.f1559j |= Integer.MIN_VALUE;
        return this.f1558i.d(null, null, null, null, null, null, this);
    }
}
