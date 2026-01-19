package I3;

import java.util.ArrayList;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class q extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: f, reason: collision with root package name */
    public static final q f2751f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f2752g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2753e;

    static {
        int i6 = 0;
        f2751f = new q(i6, 0);
        f2752g = new q(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i6, int i7) {
        super(i6);
        this.f2753e = i7;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f2753e) {
            case 0:
                return new ArrayList();
            default:
                return new ArrayList();
        }
    }
}
