package n;

import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13213c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f13214e;

    public /* synthetic */ p0(y0 y0Var, int i6) {
        this.f13213c = i6;
        this.f13214e = y0Var;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f13213c) {
            case 0:
                y0 y0Var = this.f13214e;
                return Boolean.valueOf((AbstractC1276k.b(y0Var.f13280d.getValue(), y0Var.a.k()) && y0Var.f13283g.g() == Long.MIN_VALUE && !((Boolean) y0Var.f13284h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.f13214e.b());
        }
    }
}
