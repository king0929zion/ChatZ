package D;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import t.C1682j;
import t.C1683k;
import t.C1684l;
import t.C1685m;
import t.InterfaceC1681i;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class S0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public T.X f897h;

    /* renamed from: i, reason: collision with root package name */
    public int f898i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f899j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f900k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1682j f901l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(T.X x5, boolean z5, C1682j c1682j, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f899j = x5;
        this.f900k = z5;
        this.f901l = c1682j;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((S0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new S0(this.f899j, this.f900k, this.f901l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        T.X x5;
        int i6 = this.f898i;
        if (i6 == 0) {
            X3.a.e(obj);
            x5 = this.f899j;
            C1684l c1684l = (C1684l) x5.getValue();
            if (c1684l != null) {
                InterfaceC1681i c1685m = this.f900k ? new C1685m(c1684l) : new C1683k(c1684l);
                C1682j c1682j = this.f901l;
                if (c1682j != null) {
                    this.f897h = x5;
                    this.f898i = 1;
                    Object a = c1682j.a(c1685m, this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (a == enumC0927a) {
                        return enumC0927a;
                    }
                }
            }
            return X3.y.a;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        x5 = this.f897h;
        X3.a.e(obj);
        x5.setValue(null);
        return X3.y.a;
    }
}
