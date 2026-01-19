package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n0.C1353b;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class J1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14067h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d4.i f14068i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1551a1 f14069j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B0.y f14070k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J1(l4.f fVar, C1551a1 c1551a1, B0.y yVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14068i = (d4.i) fVar;
        this.f14069j = c1551a1;
        this.f14070k = yVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((J1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l4.f, d4.i] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new J1(this.f14068i, this.f14069j, this.f14070k, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l4.f, d4.i] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14067h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1353b c1353b = new C1353b(this.f14070k.f483c);
            this.f14067h = 1;
            Object d6 = this.f14068i.d(this.f14069j, c1353b, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (d6 == enumC0927a) {
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
