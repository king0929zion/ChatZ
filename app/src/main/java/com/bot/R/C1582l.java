package r;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.AbstractC1276k;
import m4.C1285t;

/* renamed from: r.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1582l extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public int f14367h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14368i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1588n f14369j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1285t f14370k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f14371l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1582l(C1588n c1588n, C1285t c1285t, float f6, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f14369j = c1588n;
        this.f14370k = c1285t;
        this.f14371l = f6;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C1285t c1285t = this.f14370k;
        float f6 = this.f14371l;
        C1582l c1582l = new C1582l(this.f14369j, c1285t, f6, (InterfaceC0905c) obj3);
        c1582l.f14368i = (C1603s) obj;
        return c1582l.r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C1285t c1285t;
        int i6 = this.f14367h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1603s c1603s = (C1603s) this.f14368i;
            C1588n c1588n = this.f14369j;
            C1579k c1579k = new C1579k(0, c1588n, c1603s);
            InterfaceC1619x0 interfaceC1619x0 = c1588n.f14396P;
            if (interfaceC1619x0 == null) {
                AbstractC1276k.k("resolvedFlingBehavior");
                throw null;
            }
            C1285t c1285t2 = this.f14370k;
            this.f14368i = c1285t2;
            this.f14367h = 1;
            obj = interfaceC1619x0.a(c1579k, this.f14371l, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
            c1285t = c1285t2;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1285t = (C1285t) this.f14368i;
            X3.a.e(obj);
        }
        c1285t.f12970c = ((Number) obj).floatValue();
        return X3.y.a;
    }
}
