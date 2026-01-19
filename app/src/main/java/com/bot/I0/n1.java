package I0;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class n1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f2333h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q1 f2334i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(q1 q1Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2334i = q1Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((n1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new n1(this.f2334i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f2333h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.f2334i.f2374c;
        this.f2333h = 1;
        Object e6 = viewTreeObserverOnGlobalLayoutListenerC0216x.f2409B.e(this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (e6 != enumC0927a) {
            e6 = yVar;
        }
        return e6 == enumC0927a ? enumC0927a : yVar;
    }
}
