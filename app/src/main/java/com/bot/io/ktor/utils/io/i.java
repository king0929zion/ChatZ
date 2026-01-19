package io.ktor.utils.io;

/* loaded from: classes.dex */
public final class i extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public t f12159g;

    /* renamed from: h, reason: collision with root package name */
    public int f12160h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12161i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f12162j;

    /* renamed from: k, reason: collision with root package name */
    public int f12163k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t tVar, d4.c cVar) {
        super(cVar);
        this.f12162j = tVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12161i = obj;
        this.f12163k |= Integer.MIN_VALUE;
        return this.f12162j.E(0, this);
    }
}
