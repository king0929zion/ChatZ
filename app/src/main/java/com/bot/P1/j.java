package P1;

/* loaded from: classes.dex */
public final class j extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public m f4586g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4587h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f4588i;

    /* renamed from: j, reason: collision with root package name */
    public int f4589j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, d4.c cVar) {
        super(cVar);
        this.f4588i = mVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f4587h = obj;
        this.f4589j |= Integer.MIN_VALUE;
        return this.f4588i.a(this);
    }
}
