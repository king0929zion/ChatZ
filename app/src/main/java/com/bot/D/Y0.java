package D;

import l4.InterfaceC1193a;
import r.InterfaceC1623y1;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC1623y1 {
    public final /* synthetic */ InterfaceC1623y1 a;

    /* renamed from: b, reason: collision with root package name */
    public final T.E f965b;

    /* renamed from: c, reason: collision with root package name */
    public final T.E f966c;

    public Y0(InterfaceC1623y1 interfaceC1623y1, final Z0 z02) {
        this.a = interfaceC1623y1;
        final int i6 = 0;
        this.f965b = T.r.s(new InterfaceC1193a() { // from class: D.X0
            @Override // l4.InterfaceC1193a
            public final Object b() {
                switch (i6) {
                    case 0:
                        Z0 z03 = z02;
                        return Boolean.valueOf(z03.a.g() < z03.f968b.g());
                    default:
                        return Boolean.valueOf(z02.a.g() > S.l.f7374V);
                }
            }
        });
        final int i7 = 1;
        this.f966c = T.r.s(new InterfaceC1193a() { // from class: D.X0
            @Override // l4.InterfaceC1193a
            public final Object b() {
                switch (i7) {
                    case 0:
                        Z0 z03 = z02;
                        return Boolean.valueOf(z03.a.g() < z03.f968b.g());
                    default:
                        return Boolean.valueOf(z02.a.g() > S.l.f7374V);
                }
            }
        });
    }

    @Override // r.InterfaceC1623y1
    public final Object a(p.x0 x0Var, l4.e eVar, d4.c cVar) {
        return this.a.a(x0Var, eVar, cVar);
    }

    @Override // r.InterfaceC1623y1
    public final boolean b() {
        return this.a.b();
    }

    @Override // r.InterfaceC1623y1
    public final boolean c() {
        return ((Boolean) this.f966c.getValue()).booleanValue();
    }

    @Override // r.InterfaceC1623y1
    public final boolean d() {
        return ((Boolean) this.f965b.getValue()).booleanValue();
    }

    @Override // r.InterfaceC1623y1
    public final float e(float f6) {
        return this.a.e(f6);
    }
}
