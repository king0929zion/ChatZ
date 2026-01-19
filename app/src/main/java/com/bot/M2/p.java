package M2;

/* loaded from: classes.dex */
public final class p extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public boolean f3371g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3372h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f3373i;

    /* renamed from: j, reason: collision with root package name */
    public int f3374j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, d4.c cVar) {
        super(cVar);
        this.f3373i = tVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3372h = obj;
        this.f3374j |= Integer.MIN_VALUE;
        return t.d(this.f3373i, null, null, null, false, this);
    }
}
