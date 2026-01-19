package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: r.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1600r extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14451h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14452i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.g f14453j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1606t f14454k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600r(l4.g gVar, C1606t c1606t, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14453j = gVar;
        this.f14454k = c1606t;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1600r) p((InterfaceC0905c) obj2, (X3.i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1600r c1600r = new C1600r(this.f14453j, this.f14454k, interfaceC0905c);
        c1600r.f14452i = obj;
        return c1600r;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14451h;
        if (i6 == 0) {
            X3.a.e(obj);
            X3.i iVar = (X3.i) this.f14452i;
            C1517E c1517e = (C1517E) iVar.f9393c;
            Object obj2 = iVar.f9394e;
            C1603s c1603s = this.f14454k.f14476j;
            this.f14451h = 1;
            Object i7 = this.f14453j.i(c1603s, c1517e, obj2, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (i7 == enumC0927a) {
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
