package A0;

/* loaded from: classes.dex */
public final class h extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public long f43g;

    /* renamed from: h, reason: collision with root package name */
    public long f44h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f45i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f46j;

    /* renamed from: k, reason: collision with root package name */
    public int f47k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, d4.c cVar) {
        super(cVar);
        this.f46j = jVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f45i = obj;
        this.f47k |= Integer.MIN_VALUE;
        return this.f46j.z(0L, 0L, this);
    }
}
