package P2;

import Q.L2;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: P2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383v extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5078h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f5079i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L2 f5080j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383v(L2 l22, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5080j = l22;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0383v) p((InterfaceC0905c) obj2, (String) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0383v c0383v = new C0383v(this.f5080j, interfaceC0905c);
        c0383v.f5079i = obj;
        return c0383v;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        String str = (String) this.f5079i;
        int i6 = this.f5078h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f5079i = null;
            this.f5078h = 1;
            Object b5 = L2.b(this.f5080j, str, this, 14);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 == enumC0927a) {
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
