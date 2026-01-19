package z;

/* loaded from: classes.dex */
public final class I extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16076g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ J f16077h;

    /* renamed from: i, reason: collision with root package name */
    public int f16078i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j3, d4.c cVar) {
        super(cVar);
        this.f16077h = j3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f16076g = obj;
        this.f16078i |= Integer.MIN_VALUE;
        return this.f16077h.a(null, S.l.f7374V, this);
    }
}
