package t;

import A4.C0005f;
import A4.V;
import T.X;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.ArrayList;
import x4.InterfaceC1942y;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1678f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14823h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1682j f14824i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X f14825j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1678f(C1682j c1682j, X x5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14824i = c1682j;
        this.f14825j = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1678f) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1678f(this.f14824i, this.f14825j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14823h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return y.a;
        }
        X3.a.e(obj);
        ArrayList arrayList = new ArrayList();
        V v5 = this.f14824i.a;
        C0005f c0005f = new C0005f(8, arrayList, this.f14825j);
        this.f14823h = 1;
        v5.getClass();
        V.l(v5, c0005f, this);
        return EnumC0927a.f11114c;
    }
}
