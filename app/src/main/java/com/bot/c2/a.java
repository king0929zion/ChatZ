package C2;

/* loaded from: classes.dex */
public final class a extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public F3.c f662g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f663h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f664i;

    /* renamed from: j, reason: collision with root package name */
    public int f665j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d4.c cVar) {
        super(cVar);
        this.f664i = bVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f663h = obj;
        this.f665j |= Integer.MIN_VALUE;
        return this.f664i.a(this);
    }
}
