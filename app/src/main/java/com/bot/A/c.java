package A;

import n0.C1354c;

/* loaded from: classes.dex */
public final class c extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public C1354c f2g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f3h;

    /* renamed from: i, reason: collision with root package name */
    public int f4i;

    /* renamed from: j, reason: collision with root package name */
    public int f5j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f7l;

    /* renamed from: m, reason: collision with root package name */
    public int f8m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, d4.c cVar) {
        super(cVar);
        this.f7l = dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f6k = obj;
        this.f8m |= Integer.MIN_VALUE;
        return this.f7l.a(null, this);
    }
}
