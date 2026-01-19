package X0;

import m4.AbstractC1277l;
import o0.C1382D;

/* renamed from: X0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684b extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0684b f9078f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0684b f9079g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0684b f9080h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0684b f9081i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0684b f9082j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0684b f9083k;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9084e;

    static {
        int i6 = 1;
        f9078f = new C0684b(i6, 0);
        f9079g = new C0684b(i6, 1);
        f9080h = new C0684b(i6, 2);
        f9081i = new C0684b(i6, 3);
        f9082j = new C0684b(i6, 4);
        f9083k = new C0684b(i6, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0684b(int i6, int i7) {
        super(i6);
        this.f9084e = i7;
    }

    @Override // l4.c
    public final /* synthetic */ Object f(Object obj) {
        switch (this.f9084e) {
            case 0:
                float[] fArr = ((C1382D) obj).a;
                return X3.y.a;
            case 1:
                float[] fArr2 = ((C1382D) obj).a;
                return X3.y.a;
            case 2:
                return X3.y.a;
            case 3:
                int i6 = ((j) obj).a;
                return X3.y.a;
            case 4:
                return X3.y.a;
            default:
                int i7 = ((j) obj).a;
                return X3.y.a;
        }
    }
}
