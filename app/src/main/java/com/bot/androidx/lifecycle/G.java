package androidx.lifecycle;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import x4.InterfaceC1942y;
import y4.C1998d;

/* loaded from: classes.dex */
public final class G extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10837h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10838i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O f10839j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ EnumC0842p f10840k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D1.c f10841l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(O o5, EnumC0842p enumC0842p, D1.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10839j = o5;
        this.f10840k = enumC0842p;
        this.f10841l = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((G) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        G g3 = new G(this.f10839j, this.f10840k, this.f10841l, interfaceC0905c);
        g3.f10838i = obj;
        return g3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10837h;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f10838i;
            E4.e eVar = AbstractC1898K.a;
            C1998d c1998d = C4.o.a.f16023i;
            F f6 = new F(this.f10839j, this.f10840k, interfaceC1942y, this.f10841l, null);
            this.f10837h = 1;
            Object H3 = AbstractC1888A.H(c1998d, f6, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (H3 == enumC0927a) {
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
