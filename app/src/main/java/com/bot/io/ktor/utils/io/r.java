package io.ktor.utils.io;

/* loaded from: classes.dex */
public final class r extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public t f12270g;

    /* renamed from: h, reason: collision with root package name */
    public int f12271h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12272i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f12273j;

    /* renamed from: k, reason: collision with root package name */
    public int f12274k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, d4.c cVar) {
        super(cVar);
        this.f12273j = tVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12272i = obj;
        this.f12274k |= Integer.MIN_VALUE;
        return this.f12273j.a0(0, this);
    }
}
