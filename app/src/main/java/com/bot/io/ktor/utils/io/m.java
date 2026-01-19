package io.ktor.utils.io;

/* loaded from: classes.dex */
public final class m extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public t f12240g;

    /* renamed from: h, reason: collision with root package name */
    public l4.c f12241h;

    /* renamed from: i, reason: collision with root package name */
    public int f12242i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f12243j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t f12244k;

    /* renamed from: l, reason: collision with root package name */
    public int f12245l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, d4.c cVar) {
        super(cVar);
        this.f12244k = tVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12243j = obj;
        this.f12245l |= Integer.MIN_VALUE;
        return t.S(this.f12244k, 0, null, this);
    }
}
