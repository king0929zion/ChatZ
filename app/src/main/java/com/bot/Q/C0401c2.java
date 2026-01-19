package Q;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.AbstractC1318d;
import n.InterfaceC1351z;

/* renamed from: Q.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401c2 extends d4.i implements l4.g {

    /* renamed from: h, reason: collision with root package name */
    public int f5725h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ R.r f5726i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ R.W f5727j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ EnumC0409e2 f5728k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0405d2 f5729l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5730m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1351z f5731n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401c2(C0405d2 c0405d2, float f6, InterfaceC1351z interfaceC1351z, InterfaceC0905c interfaceC0905c) {
        super(4, interfaceC0905c);
        this.f5729l = c0405d2;
        this.f5730m = f6;
        this.f5731n = interfaceC1351z;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        float f6 = this.f5730m;
        InterfaceC1351z interfaceC1351z = this.f5731n;
        C0401c2 c0401c2 = new C0401c2(this.f5729l, f6, interfaceC1351z, (InterfaceC0905c) obj4);
        c0401c2.f5726i = (R.r) obj;
        c0401c2.f5727j = (R.W) obj2;
        c0401c2.f5728k = (EnumC0409e2) obj3;
        return c0401c2.r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, m4.t] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5725h;
        if (i6 == 0) {
            X3.a.e(obj);
            R.r rVar = this.f5726i;
            float d6 = this.f5727j.d(this.f5728k);
            if (!Float.isNaN(d6)) {
                Object obj2 = new Object();
                C0405d2 c0405d2 = this.f5729l;
                float g3 = Float.isNaN(c0405d2.f5767d.f6833j.g()) ? S.l.f7374V : c0405d2.f5767d.f6833j.g();
                obj2.f12970c = g3;
                C0397b2 c0397b2 = new C0397b2(rVar, obj2, 0);
                this.f5726i = null;
                this.f5727j = null;
                this.f5725h = 1;
                Object c6 = AbstractC1318d.c(g3, d6, this.f5730m, this.f5731n, c0397b2, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (c6 == enumC0927a) {
                    return enumC0927a;
                }
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
