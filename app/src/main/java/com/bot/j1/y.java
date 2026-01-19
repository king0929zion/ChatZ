package J1;

import T.C0599c0;
import T.X;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.List;
import n.C1321e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class y extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f2899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1321e0 f2900i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X f2901j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0599c0 f2902k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C1321e0 c1321e0, X x5, C0599c0 c0599c0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2900i = c1321e0;
        this.f2901j = x5;
        this.f2902k = c0599c0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((y) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new y(this.f2900i, this.f2901j, this.f2902k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f2899h;
        if (i6 == 0) {
            X3.a.e(obj);
            I1.j jVar = (I1.j) ((List) this.f2901j.getValue()).get(((List) r3.getValue()).size() - 2);
            float g3 = this.f2902k.g();
            this.f2899h = 1;
            Object A5 = this.f2900i.A(g3, jVar, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (A5 == enumC0927a) {
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
