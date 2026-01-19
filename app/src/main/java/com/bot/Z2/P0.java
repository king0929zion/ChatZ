package Z2;

import a3.C0808F;
import a3.C0810H;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class P0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0808F f10066i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0810H f10067j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f10068k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f10069l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(C0808F c0808f, C0810H c0810h, T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10066i = c0808f;
        this.f10067j = c0810h;
        this.f10068k = x5;
        this.f10069l = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((P0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new P0(this.f10066i, this.f10067j, this.f10068k, this.f10069l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10065h;
        if (i6 == 0) {
            X3.a.e(obj);
            String str = this.f10067j.a.a;
            this.f10065h = 1;
            obj = this.f10066i.f(str, this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.f10068k.setValue(Boolean.FALSE);
        if (booleanValue) {
            this.f10069l.setValue(null);
        }
        return X3.y.a;
    }
}
