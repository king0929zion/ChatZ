package r;

/* renamed from: r.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583l0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public C1543U f14372g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14373h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1592o0 f14374i;

    /* renamed from: j, reason: collision with root package name */
    public int f14375j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1583l0(AbstractC1592o0 abstractC1592o0, d4.c cVar) {
        super(cVar);
        this.f14374i = abstractC1592o0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14373h = obj;
        this.f14375j |= Integer.MIN_VALUE;
        return AbstractC1592o0.R0(this.f14374i, null, this);
    }
}
