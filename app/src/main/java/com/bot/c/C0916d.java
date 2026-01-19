package c;

import java.util.UUID;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916d extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0916d f11068f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0916d f11069g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0916d f11070h;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11071e;

    static {
        int i6 = 0;
        f11068f = new C0916d(i6, 0);
        f11069g = new C0916d(i6, 1);
        f11070h = new C0916d(i6, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0916d(int i6, int i7) {
        super(i6);
        this.f11071e = i7;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f11071e) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
