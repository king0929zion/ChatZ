package F0;

import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;

/* loaded from: classes.dex */
public final class S extends j0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1458e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1459f;

    public /* synthetic */ S(Object obj, int i6) {
        this.f1458e = i6;
        this.f1459f = obj;
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        switch (this.f1458e) {
            case 0:
                return ((H0.S) this.f1459f).a();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0216x) this.f1459f).getDensity().a();
        }
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        switch (this.f1458e) {
            case 0:
                return ((H0.S) this.f1459f).b0();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0216x) this.f1459f).getDensity().b0();
        }
    }

    @Override // F0.j0
    public float d(C0127o c0127o) {
        float intBitsToFloat;
        int v02;
        switch (this.f1458e) {
            case 0:
                l4.e eVar = c0127o.a;
                if (eVar != null) {
                    return ((Number) eVar.m(this, Float.valueOf(Float.NaN))).floatValue();
                }
                H0.S s5 = (H0.S) this.f1459f;
                if (s5.f1801n) {
                    return Float.NaN;
                }
                H0.S s6 = s5;
                while (true) {
                    H0.z0 z0Var = s6.f1803p;
                    if (!Float.isNaN((z0Var == null || (v02 = Y3.k.v0(c0127o, (C0127o[]) z0Var.f2015b)) < 0) ? Float.NaN : ((float[]) z0Var.f2016c)[v02])) {
                        s6.v0(s5.D0(), c0127o);
                        InterfaceC0134w B02 = s6.B0();
                        InterfaceC0134w B03 = s5.B0();
                        switch (c0127o.f1499b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (B03.R(B02, (Float.floatToRawIntBits(r3) & 4294967295L) | (Float.floatToRawIntBits(((int) (B02.m() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (B03.R(B02, (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(((int) (B02.m() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    H0.S F02 = s6.F0();
                    if (F02 == null) {
                        s6.v0(s5.D0(), c0127o);
                        return Float.NaN;
                    }
                    s6 = F02;
                }
                break;
            default:
                return super.d(c0127o);
        }
    }

    @Override // F0.j0
    public final e1.m e() {
        switch (this.f1458e) {
            case 0:
                return ((H0.S) this.f1459f).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0216x) this.f1459f).getLayoutDirection();
        }
    }

    @Override // F0.j0
    public final int g() {
        switch (this.f1458e) {
            case 0:
                return ((H0.S) this.f1459f).j0();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0216x) this.f1459f).getRoot().f1722K.f1781p.f1485c;
        }
    }
}
