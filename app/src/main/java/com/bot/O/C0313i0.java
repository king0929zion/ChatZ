package O;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.C1316c;
import n.C1327h0;
import n0.C1353b;
import x4.InterfaceC1942y;

/* renamed from: O.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313i0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4132h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f4133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f4134j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0313i0(C1316c c1316c, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4133i = c1316c;
        this.f4134j = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0313i0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0313i0(this.f4133i, this.f4134j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4132h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1353b c1353b = new C1353b(this.f4134j);
            C1327h0 c1327h0 = AbstractC0317k0.f4144d;
            this.f4132h = 1;
            Object c6 = C1316c.c(this.f4133i, c1353b, c1327h0, null, this, 12);
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
