package B0;

import x4.s0;

/* loaded from: classes.dex */
public final class S extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public s0 f404g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f405h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f406i;

    /* renamed from: j, reason: collision with root package name */
    public int f407j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(V v5, d4.a aVar) {
        super(aVar);
        this.f406i = v5;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f405h = obj;
        this.f407j |= Integer.MIN_VALUE;
        return this.f406i.h(0L, null, this);
    }
}
