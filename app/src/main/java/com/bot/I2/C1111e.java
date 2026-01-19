package i2;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import s2.C1661i;
import x4.InterfaceC1942y;

/* renamed from: i2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1111e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f12058h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1115i f12059i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1661i f12060j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1111e(C1115i c1115i, C1661i c1661i, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12059i = c1115i;
        this.f12060j = c1661i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1111e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1111e(this.f12059i, this.f12060j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f12058h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        this.f12058h = 1;
        Object a = C1115i.a(this.f12059i, this.f12060j, 1, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return a == enumC0927a ? enumC0927a : a;
    }
}
