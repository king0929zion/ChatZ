package r;

import A4.C0010k;
import R.C0505j;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import l4.InterfaceC1193a;
import x4.InterfaceC1942y;

/* renamed from: r.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1570h extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14338h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14339i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f14340j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l4.e f14341k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570h(InterfaceC1193a interfaceC1193a, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14340j = interfaceC1193a;
        this.f14341k = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1570h) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1570h c1570h = new C1570h(this.f14340j, this.f14341k, interfaceC0905c);
        c1570h.f14339i = obj;
        return c1570h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [m4.w, java.lang.Object] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14338h;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f14339i;
            ?? obj2 = new Object();
            C0010k H3 = T.r.H(this.f14340j);
            C0505j c0505j = new C0505j(obj2, interfaceC1942y, this.f14341k, 1);
            this.f14338h = 1;
            Object b5 = H3.b(c0505j, this);
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
