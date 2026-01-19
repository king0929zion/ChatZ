package r;

import m4.C1287v;

/* renamed from: r.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1626z1 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public C1287v f14527g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14528h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E1 f14529i;

    /* renamed from: j, reason: collision with root package name */
    public int f14530j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626z1(E1 e12, d4.c cVar) {
        super(cVar);
        this.f14529i = e12;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14528h = obj;
        this.f14530j |= Integer.MIN_VALUE;
        return this.f14529i.a(0L, this);
    }
}
