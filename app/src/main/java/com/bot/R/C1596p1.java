package r;

import H0.AbstractC0157l;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import l4.InterfaceC1193a;
import m0.EnumC1245A;

/* renamed from: r.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1596p1 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14441c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1620x1 f14442e;

    public /* synthetic */ C1596p1(C1620x1 c1620x1, int i6) {
        this.f14441c = i6;
        this.f14442e = c1620x1;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f14441c) {
            case 0:
                return Boolean.valueOf(this.f14442e.f11819q);
            default:
                m0.C c6 = this.f14442e.f14513S;
                if (!c6.f11806c.f11819q) {
                    return null;
                }
                EnumC1245A R02 = c6.R0();
                if (!R02.a()) {
                    return null;
                }
                if (R02.b()) {
                    return c6.P0(null);
                }
                m0.C h3 = ((m0.q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner()).h();
                if (h3 != null) {
                    return h3.P0(AbstractC0157l.u(c6));
                }
                return null;
        }
    }
}
