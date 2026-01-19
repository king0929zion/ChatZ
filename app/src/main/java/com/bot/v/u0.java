package v;

import D.c1;
import H0.InterfaceC0170z;
import e1.AbstractC0960b;
import e1.C0959a;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
public final class u0 extends AbstractC1040q implements InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public float f15356r;

    /* renamed from: s, reason: collision with root package name */
    public float f15357s;

    /* renamed from: t, reason: collision with root package name */
    public float f15358t;

    /* renamed from: u, reason: collision with root package name */
    public float f15359u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15360v;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long M0(F0.X r7) {
        /*
            r6 = this;
            float r0 = r6.f15358t
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f15358t
            int r0 = r7.l0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f15359u
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f15359u
            int r3 = r7.l0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f15356r
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f15356r
            int r4 = r7.l0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f15357s
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f15357s
            int r7 = r7.l0(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = e1.AbstractC0960b.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v.u0.M0(F0.X):long");
    }

    @Override // H0.InterfaceC0170z
    public final int P(H0.S s5, F0.U u5, int i6) {
        long M02 = M0(s5);
        if (C0959a.e(M02)) {
            return C0959a.g(M02);
        }
        if (!this.f15360v) {
            i6 = AbstractC0960b.g(M02, i6);
        }
        return AbstractC0960b.f(M02, u5.a0(i6));
    }

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        int j4;
        int h3;
        int i6;
        int g3;
        long a;
        long M02 = M0(x5);
        if (this.f15360v) {
            a = AbstractC0960b.e(j3, M02);
        } else {
            if (Float.isNaN(this.f15356r)) {
                j4 = C0959a.j(j3);
                int h6 = C0959a.h(M02);
                if (j4 > h6) {
                    j4 = h6;
                }
            } else {
                j4 = C0959a.j(M02);
            }
            if (Float.isNaN(this.f15358t)) {
                h3 = C0959a.h(j3);
                int j5 = C0959a.j(M02);
                if (h3 < j5) {
                    h3 = j5;
                }
            } else {
                h3 = C0959a.h(M02);
            }
            if (Float.isNaN(this.f15357s)) {
                i6 = C0959a.i(j3);
                int g6 = C0959a.g(M02);
                if (i6 > g6) {
                    i6 = g6;
                }
            } else {
                i6 = C0959a.i(M02);
            }
            if (Float.isNaN(this.f15359u)) {
                g3 = C0959a.g(j3);
                int i7 = C0959a.i(M02);
                if (g3 < i7) {
                    g3 = i7;
                }
            } else {
                g3 = C0959a.g(M02);
            }
            a = AbstractC0960b.a(j4, h3, i6, g3);
        }
        F0.k0 w5 = u5.w(a);
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new c1(w5, 10));
    }

    @Override // H0.InterfaceC0170z
    public final int j(H0.S s5, F0.U u5, int i6) {
        long M02 = M0(s5);
        if (C0959a.f(M02)) {
            return C0959a.h(M02);
        }
        if (!this.f15360v) {
            i6 = AbstractC0960b.f(M02, i6);
        }
        return AbstractC0960b.g(M02, u5.o(i6));
    }

    @Override // H0.InterfaceC0170z
    public final int m0(H0.S s5, F0.U u5, int i6) {
        long M02 = M0(s5);
        if (C0959a.e(M02)) {
            return C0959a.g(M02);
        }
        if (!this.f15360v) {
            i6 = AbstractC0960b.g(M02, i6);
        }
        return AbstractC0960b.f(M02, u5.d(i6));
    }

    @Override // H0.InterfaceC0170z
    public final int z0(H0.S s5, F0.U u5, int i6) {
        long M02 = M0(s5);
        if (C0959a.f(M02)) {
            return C0959a.h(M02);
        }
        if (!this.f15360v) {
            i6 = AbstractC0960b.f(M02, i6);
        }
        return AbstractC0960b.g(M02, u5.q(i6));
    }
}
