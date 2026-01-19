package P2;

import A4.InterfaceC0007h;
import T.C0601d0;
import T.d1;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.C1286u;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class z0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5110h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x.s f5111i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f5112j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d1 f5113k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(x.s sVar, T.X x5, d1 d1Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5111i = sVar;
        this.f5112j = x5;
        this.f5113k = d1Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((z0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new z0(this.f5111i, this.f5112j, this.f5113k, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, m4.u] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, m4.u] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5110h;
        if (i6 == 0) {
            X3.a.e(obj);
            Object obj2 = new Object();
            x.s sVar = this.f5111i;
            obj2.f12971c = ((C0601d0) sVar.f15548e.f378b).g();
            Object obj3 = new Object();
            obj3.f12971c = ((C0601d0) sVar.f15548e.f379c).g();
            InterfaceC0007h g3 = A4.W.g(T.r.H(new C0361j0(sVar, 2)));
            C0378s0 c0378s0 = new C0378s0(this.f5111i, (C1286u) obj2, (C1286u) obj3, this.f5112j, this.f5113k);
            this.f5110h = 1;
            Object b5 = g3.b(c0378s0, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 == enumC0927a) {
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
