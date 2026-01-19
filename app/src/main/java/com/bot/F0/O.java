package F0;

import T.C0611i0;

/* loaded from: classes.dex */
public final class O {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f1437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1438c;

    public /* synthetic */ O(Q q3, Object obj, int i6) {
        this.a = i6;
        this.f1437b = q3;
        this.f1438c = obj;
    }

    private final void a() {
    }

    public H b() {
        Q q3 = this.f1437b;
        H0.J j3 = (H0.J) q3.f1451m.g(this.f1438c);
        if (j3 != null) {
            return (H) q3.f1447i.g(j3);
        }
        return null;
    }

    public final boolean c() {
        C0611i0 c0611i0;
        switch (this.a) {
            case 0:
                return true;
            default:
                H b5 = b();
                if (b5 == null || (c0611i0 = b5.f1416f) == null) {
                    return true;
                }
                return c0611i0.c();
        }
    }
}
