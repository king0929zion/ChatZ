package z;

import i4.AbstractC1117a;
import r.InterfaceC1618x;

/* renamed from: z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2012j implements InterfaceC1618x {

    /* renamed from: b, reason: collision with root package name */
    public final C2004b f16116b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1618x f16117c;

    public C2012j(C2004b c2004b, InterfaceC1618x interfaceC1618x) {
        this.f16116b = c2004b;
        this.f16117c = interfaceC1618x;
    }

    @Override // r.InterfaceC1618x
    public final float a(float f6, float f7, float f8) {
        float a = this.f16117c.a(f6, f7, f8);
        boolean z5 = false;
        if (f6 <= S.l.f7374V ? f6 + f7 <= S.l.f7374V : f6 + f7 > f8) {
            z5 = true;
        }
        float abs = Math.abs(a);
        C2004b c2004b = this.f16116b;
        if (abs == S.l.f7374V || !z5) {
            if (Math.abs(c2004b.f16053f) < 1.0E-6d) {
                return S.l.f7374V;
            }
            float f9 = c2004b.f16053f * (-1.0f);
            if (((Boolean) c2004b.f16047G.getValue()).booleanValue()) {
                f9 += c2004b.o();
            }
            return AbstractC1117a.e(f9, -f8, f8);
        }
        float f10 = c2004b.f16053f * (-1);
        while (a > S.l.f7374V && f10 < a) {
            f10 += c2004b.o();
        }
        while (a < S.l.f7374V && f10 > a) {
            f10 -= c2004b.o();
        }
        return f10;
    }
}
