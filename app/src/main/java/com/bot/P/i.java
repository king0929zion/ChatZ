package P;

import B0.B;
import S.l;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.C1316c;
import n.InterfaceC1334l;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class i extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4423h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B f4424i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1334l f4425j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(B b5, InterfaceC1334l interfaceC1334l, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4424i = b5;
        this.f4425j = interfaceC1334l;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((i) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new i(this.f4424i, this.f4425j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4423h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1316c c1316c = (C1316c) this.f4424i.f379c;
            Float f6 = new Float(l.f7374V);
            this.f4423h = 1;
            Object c6 = C1316c.c(c1316c, f6, this.f4425j, null, this, 12);
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
        return y.a;
    }
}
