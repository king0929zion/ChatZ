package P1;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4.e f4568i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f4569j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l4.e eVar, u uVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4568i = eVar;
        this.f4569j = uVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new e(this.f4568i, this.f4569j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4567h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        this.f4567h = 1;
        Object m3 = this.f4568i.m(this.f4569j, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return m3 == enumC0927a ? enumC0927a : m3;
    }
}
