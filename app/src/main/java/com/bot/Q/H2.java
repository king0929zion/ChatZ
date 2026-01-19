package Q;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.C1316c;
import n.C1327h0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class H2 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5279h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f5280i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5281j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1327h0 f5282k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2(C1316c c1316c, boolean z5, C1327h0 c1327h0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5280i = c1316c;
        this.f5281j = z5;
        this.f5282k = c1327h0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((H2) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new H2(this.f5280i, this.f5281j, this.f5282k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5279h;
        if (i6 == 0) {
            X3.a.e(obj);
            Float f6 = new Float(this.f5281j ? 1.0f : 0.8f);
            this.f5279h = 1;
            Object c6 = C1316c.c(this.f5280i, f6, this.f5282k, null, this, 12);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (c6 == enumC0927a) {
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
