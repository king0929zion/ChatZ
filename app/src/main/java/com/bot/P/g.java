package P;

import A4.C0005f;
import A4.V;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class g extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4416h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4417i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f4418j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4418j = aVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((g) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        g gVar = new g(this.f4418j, interfaceC0905c);
        gVar.f4417i = obj;
        return gVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4416h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return y.a;
        }
        X3.a.e(obj);
        InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f4417i;
        a aVar = this.f4418j;
        V v5 = aVar.f4392r.a;
        C0005f c0005f = new C0005f(5, aVar, interfaceC1942y);
        this.f4416h = 1;
        v5.getClass();
        V.l(v5, c0005f, this);
        return EnumC0927a.f11114c;
    }
}
