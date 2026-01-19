package F2;

/* loaded from: classes.dex */
public final class d extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1553g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f1554h;

    /* renamed from: i, reason: collision with root package name */
    public int f1555i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, d4.c cVar) {
        super(cVar);
        this.f1554h = iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f1553g = obj;
        this.f1555i |= Integer.MIN_VALUE;
        return this.f1554h.c(null, null, this);
    }
}
