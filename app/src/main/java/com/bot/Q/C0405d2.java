package Q;

import R.C0513s;
import c4.EnumC0927a;
import java.util.Map;
import l4.InterfaceC1193a;
import n.AbstractC1318d;
import n.InterfaceC1334l;
import n.InterfaceC1351z;

/* renamed from: Q.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405d2 {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.c f5765b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1334l f5766c;

    /* renamed from: d, reason: collision with root package name */
    public final C0513s f5767d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1351z f5768e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1351z f5769f;

    public C0405d2(boolean z5, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, EnumC0409e2 enumC0409e2, l4.c cVar) {
        this.a = z5;
        this.f5765b = cVar;
        if (z5 && enumC0409e2 == EnumC0409e2.f5778f) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        this.f5766c = AbstractC0393a2.f5649b;
        this.f5767d = new C0513s(enumC0409e2, new O.x0(5, interfaceC1193a), interfaceC1193a2, new A.b(this, 26), cVar);
        this.f5768e = AbstractC1318d.q();
        this.f5769f = AbstractC1318d.q();
    }

    public static Object a(C0405d2 c0405d2, EnumC0409e2 enumC0409e2, InterfaceC1351z interfaceC1351z, d4.i iVar) {
        Object a = c0405d2.f5767d.a(enumC0409e2, p.x0.f13823c, new C0401c2(c0405d2, c0405d2.f5767d.f6834k.g(), interfaceC1351z, null), iVar);
        return a == EnumC0927a.f11114c ? a : X3.y.a;
    }

    public final Object b(d4.i iVar) {
        Object a;
        l4.c cVar = this.f5765b;
        EnumC0409e2 enumC0409e2 = EnumC0409e2.f5777e;
        return (((Boolean) cVar.f(enumC0409e2)).booleanValue() && (a = a(this, enumC0409e2, this.f5768e, iVar)) == EnumC0927a.f11114c) ? a : X3.y.a;
    }

    public final Object c(d4.i iVar) {
        Object a;
        l4.c cVar = this.f5765b;
        EnumC0409e2 enumC0409e2 = EnumC0409e2.f5776c;
        return (((Boolean) cVar.f(enumC0409e2)).booleanValue() && (a = a(this, enumC0409e2, this.f5769f, iVar)) == EnumC0927a.f11114c) ? a : X3.y.a;
    }

    public final boolean d() {
        return this.f5767d.f6830g.getValue() != EnumC0409e2.f5776c;
    }

    public final Object e(d4.i iVar) {
        Object a;
        if (this.a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        l4.c cVar = this.f5765b;
        EnumC0409e2 enumC0409e2 = EnumC0409e2.f5778f;
        return (((Boolean) cVar.f(enumC0409e2)).booleanValue() && (a = a(this, enumC0409e2, this.f5769f, iVar)) == EnumC0927a.f11114c) ? a : X3.y.a;
    }

    public final Object f(d4.i iVar) {
        Object a;
        Map map = this.f5767d.d().a;
        EnumC0409e2 enumC0409e2 = EnumC0409e2.f5778f;
        if (!map.containsKey(enumC0409e2)) {
            enumC0409e2 = EnumC0409e2.f5777e;
        }
        return (((Boolean) this.f5765b.f(enumC0409e2)).booleanValue() && (a = a(this, enumC0409e2, this.f5768e, iVar)) == EnumC0927a.f11114c) ? a : X3.y.a;
    }
}
