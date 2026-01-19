package B3;

/* loaded from: classes.dex */
public final class c extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public d f509g;

    /* renamed from: h, reason: collision with root package name */
    public String f510h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f511i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f512j;

    /* renamed from: k, reason: collision with root package name */
    public int f513k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, d4.c cVar) {
        super(cVar);
        this.f512j = dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f511i = obj;
        this.f513k |= Integer.MIN_VALUE;
        return this.f512j.d(null, this);
    }
}
