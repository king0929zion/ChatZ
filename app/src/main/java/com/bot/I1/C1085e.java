package i1;

import java.util.UUID;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* renamed from: i1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1085e extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: f, reason: collision with root package name */
    public static final C1085e f11980f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1085e f11981g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1085e f11982h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1085e f11983i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11984e;

    static {
        int i6 = 0;
        f11980f = new C1085e(i6, 0);
        f11981g = new C1085e(i6, 1);
        f11982h = new C1085e(i6, 2);
        f11983i = new C1085e(i6, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1085e(int i6, int i7) {
        super(i6);
        this.f11984e = i7;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f11984e) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
