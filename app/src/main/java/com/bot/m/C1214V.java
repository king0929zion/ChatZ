package m;

import e1.InterfaceC0961c;

/* renamed from: m.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1214V {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12765b;

    public C1214V(float f6, InterfaceC0961c interfaceC0961c) {
        this.a = f6;
        float a = interfaceC0961c.a();
        float f7 = AbstractC1215W.a;
        this.f12765b = a * 386.0878f * 160.0f * 0.84f;
    }

    public final C1213U a(float f6) {
        double b5 = b(f6);
        double d6 = AbstractC1215W.a;
        double d7 = d6 - 1.0d;
        return new C1213U(f6, (float) (Math.exp((d6 / d7) * b5) * this.a * this.f12765b), (long) (Math.exp(b5 / d7) * 1000.0d));
    }

    public final double b(float f6) {
        float[] fArr = AbstractC1220b.a;
        return Math.log((Math.abs(f6) * 0.35f) / (this.a * this.f12765b));
    }
}
