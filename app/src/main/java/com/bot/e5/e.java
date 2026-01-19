package e5;

import d5.C0949i;
import d5.I;
import d5.q;
import java.io.IOException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: e, reason: collision with root package name */
    public final long f11603e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11604f;

    /* renamed from: g, reason: collision with root package name */
    public long f11605g;

    public e(I i6, long j3, boolean z5) {
        super(i6);
        this.f11603e = j3;
        this.f11604f = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [d5.i, java.lang.Object] */
    @Override // d5.q, d5.I
    public final long W(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "sink");
        long j4 = this.f11605g;
        long j5 = this.f11603e;
        if (j4 > j5) {
            j3 = 0;
        } else if (this.f11604f) {
            long j6 = j5 - j4;
            if (j6 == 0) {
                return -1L;
            }
            j3 = Math.min(j3, j6);
        }
        long W5 = super.W(j3, c0949i);
        if (W5 != -1) {
            this.f11605g += W5;
        }
        long j7 = this.f11605g;
        if ((j7 >= j5 || W5 != -1) && j7 <= j5) {
            return W5;
        }
        if (W5 > 0 && j7 > j5) {
            long j8 = c0949i.f11482e - (j7 - j5);
            Object obj = new Object();
            obj.Q(c0949i);
            c0949i.T(j8, obj);
            obj.skip(obj.f11482e);
        }
        throw new IOException("expected " + j5 + " bytes but got " + this.f11605g);
    }
}
