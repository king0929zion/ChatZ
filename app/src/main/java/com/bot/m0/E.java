package m0;

import F0.InterfaceC0115e;
import H0.AbstractC0157l;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import m4.AbstractC1277l;
import n0.C1354c;

/* loaded from: classes.dex */
public final class E extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C f12878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C f12879g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12880h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c.f f12881i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f12882j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(C c6, C c7, Object obj, int i6, c.f fVar, int i7) {
        super(1);
        this.f12877e = i7;
        this.f12878f = c6;
        this.f12879g = c7;
        this.f12882j = obj;
        this.f12880h = i6;
        this.f12881i = fVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f12877e) {
            case 0:
                InterfaceC0115e interfaceC0115e = (InterfaceC0115e) obj;
                C c6 = this.f12879g;
                if (this.f12878f != ((q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner()).h()) {
                    return Boolean.TRUE;
                }
                boolean C5 = AbstractC1249d.C(c6, (C) this.f12882j, this.f12880h, this.f12881i);
                Boolean valueOf = Boolean.valueOf(C5);
                if (C5 || !interfaceC0115e.a()) {
                    return valueOf;
                }
                return null;
            default:
                InterfaceC0115e interfaceC0115e2 = (InterfaceC0115e) obj;
                C c7 = this.f12879g;
                if (this.f12878f != ((q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c7)).getFocusOwner()).h()) {
                    return Boolean.TRUE;
                }
                boolean B5 = AbstractC1249d.B(this.f12880h, this.f12881i, c7, (C1354c) this.f12882j);
                Boolean valueOf2 = Boolean.valueOf(B5);
                if (B5 || !interfaceC0115e2.a()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
