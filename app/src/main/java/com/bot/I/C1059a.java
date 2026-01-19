package i;

import h5.e;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059a extends e {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C1059a f11931f;

    /* renamed from: g, reason: collision with root package name */
    public static final M1.e f11932g = new M1.e(1);

    /* renamed from: e, reason: collision with root package name */
    public final C1061c f11933e = new C1061c();

    public static C1059a n0() {
        if (f11931f != null) {
            return f11931f;
        }
        synchronized (C1059a.class) {
            try {
                if (f11931f == null) {
                    f11931f = new C1059a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11931f;
    }
}
