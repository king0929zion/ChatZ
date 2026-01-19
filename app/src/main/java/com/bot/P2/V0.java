package P2;

import T.C0621n0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import o0.C1395f;
import x4.AbstractC1888A;
import x4.AbstractC1898K;

/* loaded from: classes.dex */
public final class V0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4801h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4802i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4803j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4803j = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((V0) p((InterfaceC0905c) obj2, (C0621n0) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        V0 v02 = new V0(this.f4803j, interfaceC0905c);
        v02.f4802i = obj;
        return v02;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C0621n0 c0621n0 = (C0621n0) this.f4802i;
        int i6 = this.f4801h;
        if (i6 == 0) {
            X3.a.e(obj);
            E4.e eVar = AbstractC1898K.a;
            U0 u02 = new U0(this.f4803j, null);
            this.f4802i = c0621n0;
            this.f4801h = 1;
            obj = AbstractC1888A.H(eVar, u02, this);
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
        c0621n0.setValue(new W((C1395f) obj, false));
        return X3.y.a;
    }
}
