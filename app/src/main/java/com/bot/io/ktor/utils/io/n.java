package io.ktor.utils.io;

/* loaded from: classes.dex */
public final class n extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public t f12246g;

    /* renamed from: h, reason: collision with root package name */
    public U3.a f12247h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12248i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f12249j;

    /* renamed from: k, reason: collision with root package name */
    public int f12250k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, d4.c cVar) {
        super(cVar);
        this.f12249j = tVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12248i = obj;
        this.f12250k |= Integer.MIN_VALUE;
        return this.f12249j.W(null, this);
    }
}
