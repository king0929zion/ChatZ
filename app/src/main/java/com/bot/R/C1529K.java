package r;

import T.C0607g0;
import c4.EnumC0927a;
import x4.AbstractC1888A;

/* renamed from: r.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1529K implements InterfaceC1623y1 {
    public final l4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final C1527J f14071b = new C1527J(this);

    /* renamed from: c, reason: collision with root package name */
    public final p.C0 f14072c = new p.C0();

    /* renamed from: d, reason: collision with root package name */
    public final C0607g0 f14073d;

    /* renamed from: e, reason: collision with root package name */
    public final C0607g0 f14074e;

    /* renamed from: f, reason: collision with root package name */
    public final C0607g0 f14075f;

    public C1529K(l4.c cVar) {
        this.a = cVar;
        Boolean bool = Boolean.FALSE;
        this.f14073d = T.r.A(bool);
        this.f14074e = T.r.A(bool);
        this.f14075f = T.r.A(bool);
    }

    @Override // r.InterfaceC1623y1
    public final Object a(p.x0 x0Var, l4.e eVar, d4.c cVar) {
        Object l3 = AbstractC1888A.l(new C1525I(this, x0Var, eVar, null), cVar);
        return l3 == EnumC0927a.f11114c ? l3 : X3.y.a;
    }

    @Override // r.InterfaceC1623y1
    public final boolean b() {
        return ((Boolean) this.f14073d.getValue()).booleanValue();
    }

    @Override // r.InterfaceC1623y1
    public final float e(float f6) {
        return ((Number) this.a.f(Float.valueOf(f6))).floatValue();
    }
}
