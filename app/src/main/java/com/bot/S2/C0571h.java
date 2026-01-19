package S2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.List;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import x4.InterfaceC1942y;

/* renamed from: S2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571h extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public T.X f7761h;

    /* renamed from: i, reason: collision with root package name */
    public int f7762i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f7763j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f7764k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f7765l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f7766m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f7767n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T.X f7768o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0571h(String str, long j3, long j4, long j5, long j6, T.X x5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f7763j = str;
        this.f7764k = j3;
        this.f7765l = j4;
        this.f7766m = j5;
        this.f7767n = j6;
        this.f7768o = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0571h) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0571h(this.f7763j, this.f7764k, this.f7765l, this.f7766m, this.f7767n, this.f7768o, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        T.X x5;
        int i6 = this.f7762i;
        if (i6 == 0) {
            X3.a.e(obj);
            x5 = this.f7768o;
            this.f7761h = x5;
            this.f7762i = 1;
            obj = AbstractC1888A.H(AbstractC1898K.a, new C0573i(this.f7763j, this.f7764k, this.f7765l, this.f7766m, this.f7767n, null), this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x5 = this.f7761h;
            X3.a.e(obj);
        }
        x5.setValue((List) obj);
        return X3.y.a;
    }
}
