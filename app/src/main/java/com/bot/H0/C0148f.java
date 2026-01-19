package H0;

import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* renamed from: H0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148f extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0148f f1912f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0148f f1913g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1914e;

    static {
        int i6 = 0;
        f1912f = new C0148f(i6, 0);
        f1913g = new C0148f(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0148f(int i6, int i7) {
        super(i6);
        this.f1914e = i7;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f1914e) {
            case 0:
                return new J(2);
            default:
                return new J(3);
        }
    }
}
