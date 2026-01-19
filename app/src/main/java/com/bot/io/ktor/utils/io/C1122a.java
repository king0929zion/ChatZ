package io.ktor.utils.io;

/* renamed from: io.ktor.utils.io.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1122a extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public t f12104g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12105h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f12106i;

    /* renamed from: j, reason: collision with root package name */
    public int f12107j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122a(t tVar, d4.c cVar) {
        super(cVar);
        this.f12106i = tVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12105h = obj;
        this.f12107j |= Integer.MIN_VALUE;
        return this.f12106i.e(0, null, this);
    }
}
