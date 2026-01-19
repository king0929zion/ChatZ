package h1;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f11842h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f11843i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f11844j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f11843i = iVar;
        this.f11844j = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((f) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new f(this.f11843i, this.f11844j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f11842h;
        if (i6 == 0) {
            X3.a.e(obj);
            A0.e eVar = this.f11843i.f11854c;
            this.f11842h = 1;
            Object b5 = eVar.b(this.f11844j, this);
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
        return y.a;
    }
}
