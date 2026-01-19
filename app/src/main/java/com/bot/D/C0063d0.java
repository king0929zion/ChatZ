package D;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.f2;
import x4.InterfaceC1942y;

/* renamed from: D.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063d0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f999h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.D f1000i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O.N0 f1001j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063d0(B0.D d6, O.N0 n02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f1000i = d6;
        this.f1001j = n02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0063d0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0063d0(this.f1000i, this.f1001j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f999h;
        if (i6 == 0) {
            X3.a.e(obj);
            I i7 = new I(this.f1001j, 1);
            this.f999h = 1;
            Object e6 = f2.e(this.f1000i, null, null, i7, this, 7);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (e6 == enumC0927a) {
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
