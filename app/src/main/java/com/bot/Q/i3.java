package Q;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.C1316c;
import n.InterfaceC1334l;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class i3 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5889h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k3 f5890i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f5891j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k3 k3Var, float f6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5890i = k3Var;
        this.f5891j = f6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((i3) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new i3(this.f5890i, this.f5891j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5889h;
        if (i6 == 0) {
            X3.a.e(obj);
            k3 k3Var = this.f5890i;
            C1316c c1316c = k3Var.f5949v;
            if (c1316c != null) {
                Float f6 = new Float(this.f5891j);
                InterfaceC1334l interfaceC1334l = k3Var.f5948u ? a3.f5654f : k3Var.f5947t;
                this.f5889h = 1;
                obj = C1316c.c(c1316c, f6, interfaceC1334l, null, this, 12);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (obj == enumC0927a) {
                    return enumC0927a;
                }
            }
            return X3.y.a;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        X3.a.e(obj);
        return X3.y.a;
    }
}
