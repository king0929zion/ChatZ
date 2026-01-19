package Q;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import f0.C0996s;
import t.C1682j;
import x4.InterfaceC1942y;

/* renamed from: Q.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437l2 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5968h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1682j f5969i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0996s f5970j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0437l2(C1682j c1682j, C0996s c0996s, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5969i = c1682j;
        this.f5970j = c0996s;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0437l2) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0437l2(this.f5969i, this.f5970j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5968h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return X3.y.a;
        }
        X3.a.e(obj);
        A4.V v5 = this.f5969i.a;
        C0465t c0465t = new C0465t(this.f5970j, 1);
        this.f5968h = 1;
        v5.getClass();
        A4.V.l(v5, c0465t, this);
        return EnumC0927a.f11114c;
    }
}
