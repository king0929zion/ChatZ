package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n0.C1353b;

/* renamed from: r.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1617w1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14503h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ long f14504i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1620x1 f14505j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1617w1(C1620x1 c1620x1, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14505j = c1620x1;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        long j3 = ((C1353b) obj).a;
        C1617w1 c1617w1 = new C1617w1(this.f14505j, (InterfaceC0905c) obj2);
        c1617w1.f14504i = j3;
        return c1617w1.r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1617w1 c1617w1 = new C1617w1(this.f14505j, interfaceC0905c);
        c1617w1.f14504i = ((C1353b) obj).a;
        return c1617w1;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14503h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        long j3 = this.f14504i;
        E1 e12 = this.f14505j.f14511Q;
        this.f14503h = 1;
        Object a = AbstractC1587m1.a(e12, j3, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return a == enumC0927a ? enumC0927a : a;
    }
}
