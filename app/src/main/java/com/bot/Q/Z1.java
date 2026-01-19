package Q;

import R.C0513s;
import T.C0599c0;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class Z1 implements A0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0405d2 f5638c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f5639e;

    public Z1(C0405d2 c0405d2, l4.c cVar) {
        this.f5638c = c0405d2;
        this.f5639e = cVar;
    }

    public final long a(float f6) {
        return (Float.floatToRawIntBits(S.l.f7374V) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
    }

    @Override // A0.a
    public final long a0(long j3, int i6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f6 = S.l.f7374V;
        if (intBitsToFloat >= S.l.f7374V || i6 != 1) {
            return 0L;
        }
        C0513s c0513s = this.f5638c.f5767d;
        float e6 = c0513s.e(intBitsToFloat);
        C0599c0 c0599c0 = c0513s.f6833j;
        if (!Float.isNaN(c0599c0.g())) {
            f6 = c0599c0.g();
        }
        c0599c0.h(e6);
        return a(e6 - f6);
    }

    @Override // A0.a
    public final long s0(long j3, long j4, int i6) {
        if (i6 != 1) {
            return 0L;
        }
        C0513s c0513s = this.f5638c.f5767d;
        float e6 = c0513s.e(Float.intBitsToFloat((int) (j4 & 4294967295L)));
        C0599c0 c0599c0 = c0513s.f6833j;
        float g3 = Float.isNaN(c0599c0.g()) ? S.l.f7374V : c0599c0.g();
        c0599c0.h(e6);
        return a(e6 - g3);
    }

    @Override // A0.a
    public final Object y0(long j3, InterfaceC0905c interfaceC0905c) {
        float c6 = e1.q.c(j3);
        C0405d2 c0405d2 = this.f5638c;
        float f6 = c0405d2.f5767d.f();
        float c7 = c0405d2.f5767d.d().c();
        if (c6 >= S.l.f7374V || f6 <= c7) {
            j3 = 0;
        } else {
            this.f5639e.f(new Float(c6));
        }
        return new e1.q(j3);
    }

    @Override // A0.a
    public final Object z(long j3, long j4, InterfaceC0905c interfaceC0905c) {
        this.f5639e.f(new Float(e1.q.c(j4)));
        return new e1.q(j4);
    }
}
