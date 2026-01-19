package h1;

import X3.y;
import m4.AbstractC1277l;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1048b extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1048b f11829f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1048b f11830g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1048b f11831h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1048b f11832i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11833e;

    static {
        int i6 = 1;
        f11829f = new C1048b(i6, 0);
        f11830g = new C1048b(i6, 1);
        f11831h = new C1048b(i6, 2);
        f11832i = new C1048b(i6, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1048b(int i6, int i7) {
        super(i6);
        this.f11833e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f11833e) {
            case 0:
                i iVar = (i) obj;
                iVar.getHandler().post(new I.c(4, iVar.f11871u));
                return y.a;
            case 1:
                return y.a;
            case 2:
                return y.a;
            default:
                return y.a;
        }
    }
}
