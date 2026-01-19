package p;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import t.C1682j;
import t.C1683k;
import x4.InterfaceC1900M;
import x4.InterfaceC1942y;

/* renamed from: p.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1433g extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13709h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1682j f13710i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1683k f13711j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1900M f13712k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1433g(C1682j c1682j, C1683k c1683k, InterfaceC1900M interfaceC1900M, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13710i = c1682j;
        this.f13711j = c1683k;
        this.f13712k = interfaceC1900M;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1433g) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1433g(this.f13710i, this.f13711j, this.f13712k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13709h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f13709h = 1;
            Object a = this.f13710i.a(this.f13711j, this);
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
        InterfaceC1900M interfaceC1900M = this.f13712k;
        if (interfaceC1900M != null) {
            interfaceC1900M.dispose();
        }
        return X3.y.a;
    }
}
