package p;

import S2.C0580l0;
import T.C0601d0;
import Z2.C0789z;
import c4.EnumC0927a;
import com.vladsch.flexmark.util.format.TableCell;
import r.C1529K;
import r.InterfaceC1623y1;
import t.C1682j;

/* loaded from: classes.dex */
public final class P0 implements InterfaceC1623y1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e0.k f13614j = new e0.k(0, new C0789z(17), new O0(0));
    public final C0601d0 a;

    /* renamed from: f, reason: collision with root package name */
    public float f13619f;

    /* renamed from: b, reason: collision with root package name */
    public final C0601d0 f13615b = new C0601d0(0);

    /* renamed from: c, reason: collision with root package name */
    public final C0601d0 f13616c = new C0601d0(0);

    /* renamed from: d, reason: collision with root package name */
    public final C1682j f13617d = new C1682j();

    /* renamed from: e, reason: collision with root package name */
    public final C0601d0 f13618e = new C0601d0(TableCell.NOT_TRACKED);

    /* renamed from: g, reason: collision with root package name */
    public final C1529K f13620g = new C1529K(new W0.e(this, 10));

    /* renamed from: h, reason: collision with root package name */
    public final T.E f13621h = T.r.s(new C0580l0(this, 2));

    /* renamed from: i, reason: collision with root package name */
    public final T.E f13622i = T.r.s(new C0580l0(this, 3));

    public P0(int i6) {
        this.a = new C0601d0(i6);
    }

    @Override // r.InterfaceC1623y1
    public final Object a(x0 x0Var, l4.e eVar, d4.c cVar) {
        Object a = this.f13620g.a(x0Var, eVar, cVar);
        return a == EnumC0927a.f11114c ? a : X3.y.a;
    }

    @Override // r.InterfaceC1623y1
    public final boolean b() {
        return this.f13620g.b();
    }

    @Override // r.InterfaceC1623y1
    public final boolean c() {
        return ((Boolean) this.f13622i.getValue()).booleanValue();
    }

    @Override // r.InterfaceC1623y1
    public final boolean d() {
        return ((Boolean) this.f13621h.getValue()).booleanValue();
    }

    @Override // r.InterfaceC1623y1
    public final float e(float f6) {
        return this.f13620g.e(f6);
    }
}
