package I0;

import k.C1148B;
import z4.C2052c;

/* loaded from: classes.dex */
public final class A extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public C1148B f2124g;

    /* renamed from: h, reason: collision with root package name */
    public C2052c f2125h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2126i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D f2127j;

    /* renamed from: k, reason: collision with root package name */
    public int f2128k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d6, d4.c cVar) {
        super(cVar);
        this.f2127j = d6;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f2126i = obj;
        this.f2128k |= Integer.MIN_VALUE;
        return this.f2127j.e(this);
    }
}
