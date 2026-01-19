package io.ktor.utils.io;

/* loaded from: classes.dex */
public final class p extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public t f12258g;

    /* renamed from: h, reason: collision with root package name */
    public U3.d f12259h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12260i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f12261j;

    /* renamed from: k, reason: collision with root package name */
    public int f12262k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, d4.c cVar) {
        super(cVar);
        this.f12261j = tVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12260i = obj;
        this.f12262k |= Integer.MIN_VALUE;
        return this.f12261j.Z(null, this);
    }
}
