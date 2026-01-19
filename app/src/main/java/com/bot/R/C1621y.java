package r;

/* renamed from: r.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1621y implements InterfaceC1618x {
    @Override // r.InterfaceC1618x
    public final float a(float f6, float f7, float f8) {
        float abs = Math.abs((f7 + f6) - f6);
        boolean z5 = abs <= f8;
        float f9 = (0.3f * f8) - (S.l.f7374V * abs);
        float f10 = f8 - f9;
        if (z5 && f10 < abs) {
            f9 = f8 - abs;
        }
        return f6 - f9;
    }
}
