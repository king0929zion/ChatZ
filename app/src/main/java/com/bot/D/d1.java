package D;

import F0.InterfaceC0134w;
import n0.C1354c;

/* loaded from: classes.dex */
public final class d1 {
    public final S0.L a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0134w f1002b = null;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0134w f1003c;

    public d1(InterfaceC0134w interfaceC0134w, S0.L l3) {
        this.a = l3;
        this.f1003c = interfaceC0134w;
    }

    public final long a(long j3) {
        C1354c c1354c;
        InterfaceC0134w interfaceC0134w = this.f1002b;
        C1354c c1354c2 = C1354c.f13294e;
        if (interfaceC0134w != null) {
            if (interfaceC0134w.j()) {
                InterfaceC0134w interfaceC0134w2 = this.f1003c;
                c1354c = interfaceC0134w2 != null ? interfaceC0134w2.Q(interfaceC0134w, true) : null;
            } else {
                c1354c = c1354c2;
            }
            if (c1354c != null) {
                c1354c2 = c1354c;
            }
        }
        int i6 = (int) (j3 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i6);
        float f6 = c1354c2.a;
        if (intBitsToFloat >= f6) {
            float intBitsToFloat2 = Float.intBitsToFloat(i6);
            f6 = c1354c2.f13296c;
            if (intBitsToFloat2 <= f6) {
                f6 = Float.intBitsToFloat(i6);
            }
        }
        int i7 = (int) (j3 & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i7);
        float f7 = c1354c2.f13295b;
        if (intBitsToFloat3 >= f7) {
            float intBitsToFloat4 = Float.intBitsToFloat(i7);
            f7 = c1354c2.f13297d;
            if (intBitsToFloat4 <= f7) {
                f7 = Float.intBitsToFloat(i7);
            }
        }
        return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
    }

    public final int b(long j3, boolean z5) {
        if (z5) {
            j3 = a(j3);
        }
        return this.a.f7599b.g(d(j3));
    }

    public final boolean c(long j3) {
        long d6 = d(a(j3));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d6));
        S0.L l3 = this.a;
        int e6 = l3.f7599b.e(intBitsToFloat);
        int i6 = (int) (d6 >> 32);
        return Float.intBitsToFloat(i6) >= l3.g(e6) && Float.intBitsToFloat(i6) <= l3.h(e6);
    }

    public final long d(long j3) {
        InterfaceC0134w interfaceC0134w;
        InterfaceC0134w interfaceC0134w2 = this.f1002b;
        if (interfaceC0134w2 == null) {
            return j3;
        }
        if (!interfaceC0134w2.j()) {
            interfaceC0134w2 = null;
        }
        if (interfaceC0134w2 == null || (interfaceC0134w = this.f1003c) == null) {
            return j3;
        }
        InterfaceC0134w interfaceC0134w3 = interfaceC0134w.j() ? interfaceC0134w : null;
        return interfaceC0134w3 == null ? j3 : interfaceC0134w2.R(interfaceC0134w3, j3);
    }

    public final long e(long j3) {
        InterfaceC0134w interfaceC0134w;
        InterfaceC0134w interfaceC0134w2 = this.f1002b;
        if (interfaceC0134w2 == null) {
            return j3;
        }
        if (!interfaceC0134w2.j()) {
            interfaceC0134w2 = null;
        }
        if (interfaceC0134w2 == null || (interfaceC0134w = this.f1003c) == null) {
            return j3;
        }
        InterfaceC0134w interfaceC0134w3 = interfaceC0134w.j() ? interfaceC0134w : null;
        return interfaceC0134w3 == null ? j3 : interfaceC0134w3.R(interfaceC0134w2, j3);
    }
}
