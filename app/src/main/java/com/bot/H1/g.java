package h1;

import X3.y;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class g extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: f, reason: collision with root package name */
    public static final g f11845f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f11846g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f11847h;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11848e;

    static {
        int i6 = 0;
        f11845f = new g(i6, 0);
        f11846g = new g(i6, 1);
        f11847h = new g(i6, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i6, int i7) {
        super(i6);
        this.f11848e = i7;
    }

    @Override // l4.InterfaceC1193a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f11848e) {
            case 0:
                return y.a;
            case 1:
                return y.a;
            default:
                return y.a;
        }
    }
}
