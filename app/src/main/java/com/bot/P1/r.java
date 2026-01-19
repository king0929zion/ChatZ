package P1;

/* loaded from: classes.dex */
public final class r extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public u f4618g;

    /* renamed from: h, reason: collision with root package name */
    public h f4619h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4620i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4621j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f4622k;

    /* renamed from: l, reason: collision with root package name */
    public int f4623l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, d4.c cVar) {
        super(cVar);
        this.f4622k = uVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f4621j = obj;
        this.f4623l |= Integer.MIN_VALUE;
        return this.f4622k.f(false, this);
    }
}
