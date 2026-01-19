package O0;

import X3.y;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class d extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final d f4289f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f4290g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f4291h;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4292e;

    static {
        int i6 = 1;
        f4289f = new d(i6, 0);
        f4290g = new d(i6, 1);
        f4291h = new d(i6, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i6, int i7) {
        super(i6);
        this.f4292e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f4292e) {
            case 0:
                ((Number) obj).longValue();
                return y.a;
            case 1:
                return Integer.valueOf(((k) obj).f4307b);
            default:
                return Integer.valueOf(((k) obj).f4308c.b());
        }
    }
}
