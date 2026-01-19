package M3;

/* loaded from: classes.dex */
public final class e extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3414g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f3415h;

    /* renamed from: i, reason: collision with root package name */
    public int f3416i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, d4.c cVar) {
        super(cVar);
        this.f3415h = fVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3414g = obj;
        this.f3416i |= Integer.MIN_VALUE;
        return this.f3415h.a(null, null, null, this);
    }
}
