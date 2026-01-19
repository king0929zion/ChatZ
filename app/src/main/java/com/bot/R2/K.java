package R2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import p.x0;
import r.AbstractC1552b;
import r.C1558d;
import r.C1606t;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class K extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f6908h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f6909i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1606t f6910j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(boolean z5, C1606t c1606t, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6909i = z5;
        this.f6910j = c1606t;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((K) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new K(this.f6909i, this.f6910j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6908h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        H h3 = this.f6909i ? H.f6897e : H.f6896c;
        C1606t c1606t = this.f6910j;
        if (c1606t.f14471e.getValue() != h3) {
            this.f6908h = 1;
            c1606t.getClass();
            Object a = c1606t.a(h3, x0.f13823c, new C1558d(c1606t, AbstractC1552b.a, null), this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (a != enumC0927a) {
                a = yVar;
            }
            if (a == enumC0927a) {
                return enumC0927a;
            }
        }
        return yVar;
    }
}
