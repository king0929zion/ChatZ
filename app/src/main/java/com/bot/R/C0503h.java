package R;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: R.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503h extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f6779h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4.e f6780i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6781j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f6782k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0503h(l4.e eVar, Object obj, InterfaceC1942y interfaceC1942y, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6780i = eVar;
        this.f6781j = obj;
        this.f6782k = interfaceC1942y;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0503h) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0503h(this.f6780i, this.f6781j, this.f6782k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6779h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f6779h = 1;
            Object m3 = this.f6780i.m(this.f6781j, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (m3 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        AbstractC1888A.j(this.f6782k, new C0500e());
        return X3.y.a;
    }
}
