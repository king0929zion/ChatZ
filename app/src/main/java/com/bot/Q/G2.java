package Q;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import l4.InterfaceC1193a;
import n.C1316c;
import n.C1327h0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class G2 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5263h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f5264i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5265j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1327h0 f5266k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f5267l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G2(C1316c c1316c, boolean z5, C1327h0 c1327h0, InterfaceC1193a interfaceC1193a, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5264i = c1316c;
        this.f5265j = z5;
        this.f5266k = c1327h0;
        this.f5267l = interfaceC1193a;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((G2) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new G2(this.f5264i, this.f5265j, this.f5266k, this.f5267l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        G2 g22;
        int i6 = this.f5263h;
        if (i6 == 0) {
            X3.a.e(obj);
            Float f6 = new Float(this.f5265j ? 1.0f : S.l.f7374V);
            this.f5263h = 1;
            g22 = this;
            Object c6 = C1316c.c(this.f5264i, f6, this.f5266k, null, g22, 12);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (c6 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            g22 = this;
        }
        g22.f5267l.b();
        return X3.y.a;
    }
}
