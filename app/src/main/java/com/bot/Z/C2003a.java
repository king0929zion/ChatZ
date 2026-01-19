package z;

import b4.InterfaceC0905c;
import i4.AbstractC1117a;
import java.util.concurrent.CancellationException;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2003a implements A0.a {

    /* renamed from: c, reason: collision with root package name */
    public final C2004b f16080c;

    public C2003a(C2004b c2004b) {
        this.f16080c = c2004b;
    }

    @Override // A0.a
    public final long a0(long j3, int i6) {
        C2004b c2004b = this.f16080c;
        v vVar = c2004b.f16051d;
        if (i6 != 1 || Math.abs(vVar.f16173c.g()) <= 1.0E-6d) {
            return 0L;
        }
        int i7 = (int) (j3 >> 32);
        if (Math.abs(Float.intBitsToFloat(i7)) <= S.l.f7374V) {
            return 0L;
        }
        float g3 = vVar.f16173c.g() * c2004b.n();
        float f6 = ((c2004b.l().f16152b + c2004b.l().f16153c) * (-Math.signum(vVar.f16173c.g()))) + g3;
        if (vVar.f16173c.g() > S.l.f7374V) {
            f6 = g3;
            g3 = f6;
        }
        float f7 = -c2004b.f16058k.e(-AbstractC1117a.e(Float.intBitsToFloat(i7), g3, f6));
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    @Override // A0.a
    public final long s0(long j3, long j4, int i6) {
        if (i6 != 2 || Float.intBitsToFloat((int) (j4 >> 32)) == S.l.f7374V) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // A0.a
    public final Object z(long j3, long j4, InterfaceC0905c interfaceC0905c) {
        return new e1.q(e1.q.a(j4, S.l.f7374V, S.l.f7374V, 1));
    }
}
