package p;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n0.C1353b;
import r.C1551a1;
import t.C1682j;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class P extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public int f13610h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ C1551a1 f13611i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f13612j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f13613k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s5, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f13613k = s5;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j3 = ((C1353b) obj2).a;
        P p5 = new P(this.f13613k, (InterfaceC0905c) obj3);
        p5.f13611i = (C1551a1) obj;
        p5.f13612j = j3;
        return p5.r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Object obj2;
        int i6 = this.f13610h;
        X3.y yVar = X3.y.a;
        if (i6 == 0) {
            X3.a.e(obj);
            C1551a1 c1551a1 = this.f13611i;
            long j3 = this.f13612j;
            S s5 = this.f13613k;
            if (s5.f13786y) {
                this.f13610h = 1;
                C1682j c1682j = s5.f13781t;
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (c1682j == null || (obj2 = AbstractC1888A.l(new C1431f(c1551a1, j3, c1682j, s5, null), this)) != enumC0927a) {
                    obj2 = yVar;
                }
                if (obj2 == enumC0927a) {
                    return enumC0927a;
                }
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return yVar;
    }
}
