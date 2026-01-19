package P1;

import N1.A;

/* loaded from: classes.dex */
public final class q extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public u f4612g;

    /* renamed from: h, reason: collision with root package name */
    public A f4613h;

    /* renamed from: i, reason: collision with root package name */
    public h f4614i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4615j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f4616k;

    /* renamed from: l, reason: collision with root package name */
    public int f4617l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, d4.c cVar) {
        super(cVar);
        this.f4616k = uVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f4615j = obj;
        this.f4617l |= Integer.MIN_VALUE;
        return this.f4616k.e(null, this);
    }
}
