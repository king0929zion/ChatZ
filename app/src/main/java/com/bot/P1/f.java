package P1;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.C1288w;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4570h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4.e f4571i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1288w f4572j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l4.e eVar, C1288w c1288w, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4571i = eVar;
        this.f4572j = c1288w;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((f) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new f(this.f4571i, this.f4572j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4570h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        Object obj2 = this.f4572j.f12973c;
        this.f4570h = 1;
        Object m3 = this.f4571i.m(obj2, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return m3 == enumC0927a ? enumC0927a : m3;
    }
}
