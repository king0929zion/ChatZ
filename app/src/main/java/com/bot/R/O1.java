package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class O1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14106h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14107i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B0.D f14108j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d4.i f14109k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l4.c f14110l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1551a1 f14111m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O1(B0.D d6, l4.f fVar, l4.c cVar, C1551a1 c1551a1, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14108j = d6;
        this.f14109k = (d4.i) fVar;
        this.f14110l = cVar;
        this.f14111m = c1551a1;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((O1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l4.f, d4.i] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        O1 o12 = new O1(this.f14108j, this.f14109k, this.f14110l, this.f14111m, interfaceC0905c);
        o12.f14107i = obj;
        return o12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [l4.f, d4.i] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14106h;
        if (i6 == 0) {
            X3.a.e(obj);
            N1 n12 = new N1((InterfaceC1942y) this.f14107i, this.f14109k, this.f14110l, this.f14111m, null);
            this.f14106h = 1;
            Object h3 = AbstractC1573i.h(this.f14108j, n12, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (h3 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
