package z;

import n.C1327h0;

/* loaded from: classes.dex */
public final class z extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public int f16181g;

    /* renamed from: h, reason: collision with root package name */
    public C1327h0 f16182h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f16183i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E f16184j;

    /* renamed from: k, reason: collision with root package name */
    public int f16185k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(E e6, d4.c cVar) {
        super(cVar);
        this.f16184j = e6;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f16183i = obj;
        this.f16185k |= Integer.MIN_VALUE;
        return this.f16184j.f(0, null, this);
    }
}
