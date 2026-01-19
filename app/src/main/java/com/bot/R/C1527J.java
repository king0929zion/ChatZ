package r;

/* renamed from: r.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1527J implements InterfaceC1563e1 {
    public final /* synthetic */ C1529K a;

    public C1527J(C1529K c1529k) {
        this.a = c1529k;
    }

    @Override // r.InterfaceC1563e1
    public final float a(float f6) {
        if (Float.isNaN(f6)) {
            return S.l.f7374V;
        }
        C1529K c1529k = this.a;
        float floatValue = ((Number) c1529k.a.f(Float.valueOf(f6))).floatValue();
        c1529k.f14074e.setValue(Boolean.valueOf(floatValue > S.l.f7374V));
        c1529k.f14075f.setValue(Boolean.valueOf(floatValue < S.l.f7374V));
        return floatValue;
    }
}
