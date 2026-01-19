package p;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import t.C1682j;
import t.C1684l;
import x4.InterfaceC1942y;

/* renamed from: p.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447n extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13756h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f13757i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1684l f13758j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1447n(r rVar, C1684l c1684l, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13757i = rVar;
        this.f13758j = c1684l;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1447n) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1447n(this.f13757i, this.f13758j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13756h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1682j c1682j = this.f13757i.f13781t;
            if (c1682j != null) {
                this.f13756h = 1;
                Object a = c1682j.a(this.f13758j, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (a == enumC0927a) {
                    return enumC0927a;
                }
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
