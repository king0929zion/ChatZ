package r;

/* renamed from: r.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1618x {
    public static final C1615w a = C1615w.a;

    default float a(float f6, float f7, float f8) {
        a.getClass();
        float f9 = f7 + f6;
        if ((f6 >= S.l.f7374V && f9 <= f8) || (f6 < S.l.f7374V && f9 > f8)) {
            return S.l.f7374V;
        }
        float f10 = f9 - f8;
        return Math.abs(f6) < Math.abs(f10) ? f6 : f10;
    }
}
