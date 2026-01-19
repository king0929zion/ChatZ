package l0;

import F0.AbstractC0137z;
import F0.InterfaceC0121i;
import F0.U;
import F0.W;
import F0.X;
import F0.k0;
import F0.n0;
import H0.InterfaceC0160o;
import H0.InterfaceC0170z;
import H0.L;
import H0.S;
import Y3.w;
import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import f0.C0987j;
import h0.AbstractC1040q;
import h0.InterfaceC1028e;
import n0.C1356e;
import o0.C1400k;
import q0.C1496b;
import t0.AbstractC1688b;

/* loaded from: classes.dex */
public final class n extends AbstractC1040q implements InterfaceC0170z, InterfaceC0160o {

    /* renamed from: r, reason: collision with root package name */
    public AbstractC1688b f12654r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12655s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1028e f12656t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0121i f12657u;

    /* renamed from: v, reason: collision with root package name */
    public float f12658v;

    /* renamed from: w, reason: collision with root package name */
    public C1400k f12659w;

    public static boolean N0(long j3) {
        return !C1356e.a(j3, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L))) & TableCell.NOT_TRACKED) < 2139095040;
    }

    public static boolean O0(long j3) {
        return !C1356e.a(j3, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32))) & TableCell.NOT_TRACKED) < 2139095040;
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    public final boolean M0() {
        return this.f12655s && this.f12654r.h() != 9205357640488583168L;
    }

    @Override // H0.InterfaceC0170z
    public final int P(S s5, U u5, int i6) {
        if (!M0()) {
            return u5.a0(i6);
        }
        long P02 = P0(AbstractC0960b.b(i6, 0, 13));
        return Math.max(C0959a.i(P02), u5.a0(i6));
    }

    public final long P0(long j3) {
        boolean z5 = false;
        boolean z6 = C0959a.d(j3) && C0959a.c(j3);
        if (C0959a.f(j3) && C0959a.e(j3)) {
            z5 = true;
        }
        if ((!M0() && z6) || z5) {
            return C0959a.a(j3, C0959a.h(j3), 0, C0959a.g(j3), 0, 10);
        }
        long h3 = this.f12654r.h();
        int round = O0(h3) ? Math.round(Float.intBitsToFloat((int) (h3 >> 32))) : C0959a.j(j3);
        int round2 = N0(h3) ? Math.round(Float.intBitsToFloat((int) (h3 & 4294967295L))) : C0959a.i(j3);
        int g3 = AbstractC0960b.g(j3, round);
        long floatToRawIntBits = (Float.floatToRawIntBits(AbstractC0960b.f(j3, round2)) & 4294967295L) | (Float.floatToRawIntBits(g3) << 32);
        if (M0()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!O0(this.f12654r.h()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f12654r.h() >> 32))) << 32) | (Float.floatToRawIntBits(!N0(this.f12654r.h()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f12654r.h() & 4294967295L))) & 4294967295L);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == S.l.f7374V || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == S.l.f7374V) ? 0L : AbstractC0137z.o(floatToRawIntBits2, this.f12657u.a(floatToRawIntBits2, floatToRawIntBits));
        }
        return C0959a.a(j3, AbstractC0960b.g(j3, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)))), 0, AbstractC0960b.f(j3, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)))), 0, 10);
    }

    @Override // H0.InterfaceC0170z
    public final W d(X x5, U u5, long j3) {
        k0 w5 = u5.w(P0(j3));
        return x5.D(w5.f1485c, w5.f1486e, w.f9813c, new n0(w5, 3));
    }

    @Override // H0.InterfaceC0170z
    public final int j(S s5, U u5, int i6) {
        if (!M0()) {
            return u5.o(i6);
        }
        long P02 = P0(AbstractC0960b.b(0, i6, 7));
        return Math.max(C0959a.j(P02), u5.o(i6));
    }

    @Override // H0.InterfaceC0160o
    public final void k0(L l3) {
        C1496b c1496b = l3.f1765c;
        long h3 = this.f12654r.h();
        long floatToRawIntBits = (Float.floatToRawIntBits(O0(h3) ? Float.intBitsToFloat((int) (h3 >> 32)) : Float.intBitsToFloat((int) (c1496b.c() >> 32))) << 32) | (Float.floatToRawIntBits(N0(h3) ? Float.intBitsToFloat((int) (h3 & 4294967295L)) : Float.intBitsToFloat((int) (c1496b.c() & 4294967295L))) & 4294967295L);
        long o5 = (Float.intBitsToFloat((int) (c1496b.c() >> 32)) == S.l.f7374V || Float.intBitsToFloat((int) (c1496b.c() & 4294967295L)) == S.l.f7374V) ? 0L : AbstractC0137z.o(floatToRawIntBits, this.f12657u.a(floatToRawIntBits, c1496b.c()));
        long a = this.f12656t.a((Math.round(Float.intBitsToFloat((int) (o5 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (o5 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (c1496b.c() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (c1496b.c() & 4294967295L))) & 4294967295L), l3.getLayoutDirection());
        float f6 = (int) (a >> 32);
        float f7 = (int) (a & 4294967295L);
        ((C0987j) c1496b.f13944e.f1972e).G(f6, f7);
        try {
            this.f12654r.g(l3, o5, this.f12658v, this.f12659w);
            ((C0987j) c1496b.f13944e.f1972e).G(-f6, -f7);
            l3.b();
        } catch (Throwable th) {
            ((C0987j) c1496b.f13944e.f1972e).G(-f6, -f7);
            throw th;
        }
    }

    @Override // H0.InterfaceC0170z
    public final int m0(S s5, U u5, int i6) {
        if (!M0()) {
            return u5.d(i6);
        }
        long P02 = P0(AbstractC0960b.b(i6, 0, 13));
        return Math.max(C0959a.i(P02), u5.d(i6));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f12654r + ", sizeToIntrinsics=" + this.f12655s + ", alignment=" + this.f12656t + ", alpha=" + this.f12658v + ", colorFilter=" + this.f12659w + ')';
    }

    @Override // H0.InterfaceC0170z
    public final int z0(S s5, U u5, int i6) {
        if (!M0()) {
            return u5.q(i6);
        }
        long P02 = P0(AbstractC0960b.b(0, i6, 7));
        return Math.max(C0959a.j(P02), u5.q(i6));
    }
}
