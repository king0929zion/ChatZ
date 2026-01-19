package O;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class R0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4033h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d4.i f4034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public R0(InterfaceC0905c interfaceC0905c, l4.c cVar) {
        super(2, interfaceC0905c);
        this.f4034i = (d4.i) cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((R0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d4.i, l4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new R0(interfaceC0905c, this.f4034i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [d4.i, l4.c] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f4033h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f4033h = 1;
            Object f6 = this.f4034i.f(this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (f6 == enumC0927a) {
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
