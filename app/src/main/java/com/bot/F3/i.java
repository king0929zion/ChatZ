package F3;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import i4.AbstractC1118b;
import u3.C1759c;

/* loaded from: classes.dex */
public final class i extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f1601h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1602i;

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((i) p((InterfaceC0905c) obj2, (c) obj)).r(y.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d4.i, F3.i, b4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        ?? iVar = new d4.i(2, interfaceC0905c);
        iVar.f1602i = obj;
        return iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f1601h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1759c b5 = ((c) this.f1602i).b();
            this.f1601h = 1;
            obj = AbstractC1118b.t(b5, this);
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
        return ((C1759c) obj).e();
    }
}
