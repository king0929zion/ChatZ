package r;

import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class g2 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public X3.e f14332g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1193a f14333h;

    /* renamed from: i, reason: collision with root package name */
    public float f14334i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f14335j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h2 f14336k;

    /* renamed from: l, reason: collision with root package name */
    public int f14337l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, d4.c cVar) {
        super(cVar);
        this.f14336k = h2Var;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14335j = obj;
        this.f14337l |= Integer.MIN_VALUE;
        return this.f14336k.a(null, null, this);
    }
}
