package p;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import t.C1682j;
import t.InterfaceC1681i;
import x4.InterfaceC1900M;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class Z extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13668h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1682j f13669i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1681i f13670j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1900M f13671k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C1682j c1682j, InterfaceC1681i interfaceC1681i, InterfaceC1900M interfaceC1900M, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13669i = c1682j;
        this.f13670j = interfaceC1681i;
        this.f13671k = interfaceC1900M;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((Z) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new Z(this.f13669i, this.f13670j, this.f13671k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13668h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f13668h = 1;
            Object a = this.f13669i.a(this.f13670j, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (a == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        InterfaceC1900M interfaceC1900M = this.f13671k;
        if (interfaceC1900M != null) {
            interfaceC1900M.dispose();
        }
        return X3.y.a;
    }
}
