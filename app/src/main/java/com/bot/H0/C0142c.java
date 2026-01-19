package H0;

/* renamed from: H0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142c implements m0.s {
    public static final C0142c a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f1888b;

    @Override // m0.s
    public final boolean b() {
        Boolean bool = f1888b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw B3.e.f("canFocus is read before it is written");
    }

    @Override // m0.s
    public final void e(boolean z5) {
        f1888b = Boolean.valueOf(z5);
    }
}
