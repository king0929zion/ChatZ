package p;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import t.C1679g;
import t.C1682j;
import x4.InterfaceC1942y;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1425c extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13683h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1682j f13684i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1679g f13685j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1425c(C1682j c1682j, C1679g c1679g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13684i = c1682j;
        this.f13685j = c1679g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1425c) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1425c(this.f13684i, this.f13685j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13683h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f13683h = 1;
            Object a = this.f13684i.a(this.f13685j, this);
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
        return X3.y.a;
    }
}
