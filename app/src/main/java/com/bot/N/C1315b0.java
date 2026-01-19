package n;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;

/* renamed from: n.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315b0 extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public int f13086h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13087i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f13088j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1321e0 f13089k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y0 f13090l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f13091m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1315b0(Object obj, Object obj2, C1321e0 c1321e0, y0 y0Var, float f6, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f13087i = obj;
        this.f13088j = obj2;
        this.f13089k = c1321e0;
        this.f13090l = y0Var;
        this.f13091m = f6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        y0 y0Var = this.f13090l;
        float f6 = this.f13091m;
        return new C1315b0(this.f13087i, this.f13088j, this.f13089k, y0Var, f6, (InterfaceC0905c) obj).r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13086h;
        if (i6 == 0) {
            X3.a.e(obj);
            C1313a0 c1313a0 = new C1313a0(this.f13087i, this.f13088j, this.f13089k, this.f13090l, this.f13091m, null);
            this.f13086h = 1;
            Object l3 = AbstractC1888A.l(c1313a0, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (l3 == enumC0927a) {
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
