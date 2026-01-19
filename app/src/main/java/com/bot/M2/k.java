package M2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class k extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3338h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f3339i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3340j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3341k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f3342l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar, String str, String str2, A a, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3339i = tVar;
        this.f3340j = str;
        this.f3341k = str2;
        this.f3342l = a;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((k) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new k(this.f3339i, this.f3340j, this.f3341k, this.f3342l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f3338h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f3338h = 1;
            Object d6 = t.d(this.f3339i, this.f3340j, this.f3341k, this.f3342l, true, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (d6 == enumC0927a) {
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
