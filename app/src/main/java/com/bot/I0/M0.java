package I0;

import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class M0 extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: f, reason: collision with root package name */
    public static final M0 f2219f;

    /* renamed from: g, reason: collision with root package name */
    public static final M0 f2220g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2221e;

    static {
        int i6 = 0;
        f2219f = new M0(i6, 0);
        f2220g = new M0(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M0(int i6, int i7) {
        super(i6);
        this.f2221e = i7;
    }

    @Override // l4.InterfaceC1193a
    public final /* bridge */ /* synthetic */ Object b() {
        switch (this.f2221e) {
            case 0:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
