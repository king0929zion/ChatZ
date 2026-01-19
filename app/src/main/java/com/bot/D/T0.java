package D;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n0.C1353b;
import r.C1551a1;
import t.C1682j;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class T0 extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public int f920h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ C1551a1 f921i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f922j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f923k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f924l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1682j f925m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(InterfaceC1942y interfaceC1942y, T.X x5, C1682j c1682j, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f923k = interfaceC1942y;
        this.f924l = x5;
        this.f925m = c1682j;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j3 = ((C1353b) obj2).a;
        T.X x5 = this.f924l;
        C1682j c1682j = this.f925m;
        T0 t02 = new T0(this.f923k, x5, c1682j, (InterfaceC0905c) obj3);
        t02.f921i = (C1551a1) obj;
        t02.f922j = j3;
        return t02.r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f920h;
        InterfaceC1942y interfaceC1942y = this.f923k;
        if (i6 == 0) {
            X3.a.e(obj);
            C1551a1 c1551a1 = this.f921i;
            AbstractC1888A.y(interfaceC1942y, null, new R0(this.f924l, this.f922j, this.f925m, null), 3);
            this.f920h = 1;
            obj = c1551a1.g(this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        AbstractC1888A.y(interfaceC1942y, null, new S0(this.f924l, ((Boolean) obj).booleanValue(), this.f925m, null), 3);
        return X3.y.a;
    }
}
