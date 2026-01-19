package Q0;

import j1.AbstractC1135a;
import java.util.Arrays;
import y.C1964d;

/* loaded from: classes.dex */
public final class c {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6324b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6325c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6326d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6327e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f6328f;

    /* renamed from: g, reason: collision with root package name */
    public final C1964d f6329g;

    public c(long j3, long j4, long j5, long j6, long j7, float[] fArr, C1964d c1964d) {
        this.a = j3;
        this.f6324b = j4;
        this.f6325c = j5;
        this.f6326d = j6;
        this.f6327e = j7;
        this.f6328f = fArr;
        this.f6329g = c1964d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto L65
        L5:
            r1 = 0
            if (r7 == 0) goto L66
            java.lang.Class<Q0.c> r2 = Q0.c.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L11
            goto L66
        L11:
            Q0.c r7 = (Q0.c) r7
            long r2 = r6.a
            long r4 = r7.a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            long r2 = r6.f6324b
            long r4 = r7.f6324b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            goto L66
        L25:
            long r2 = r6.f6327e
            long r4 = r7.f6327e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2e
            goto L66
        L2e:
            long r2 = r6.f6325c
            long r4 = r7.f6325c
            boolean r2 = e1.j.c(r2, r4)
            if (r2 != 0) goto L39
            goto L66
        L39:
            long r2 = r6.f6326d
            long r4 = r7.f6326d
            boolean r2 = e1.j.c(r2, r4)
            if (r2 != 0) goto L44
            goto L66
        L44:
            float[] r2 = r7.f6328f
            float[] r3 = r6.f6328f
            if (r3 != 0) goto L50
            if (r2 != 0) goto L4e
            r2 = r0
            goto L57
        L4e:
            r2 = r1
            goto L57
        L50:
            if (r2 != 0) goto L53
            goto L4e
        L53:
            boolean r2 = r3.equals(r2)
        L57:
            if (r2 != 0) goto L5a
            goto L66
        L5a:
            y.d r2 = r6.f6329g
            y.d r7 = r7.f6329g
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L65
            goto L66
        L65:
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int c6 = AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f6324b), 31, this.f6327e), 31, this.f6325c), 31, this.f6326d);
        float[] fArr = this.f6328f;
        return this.f6329g.hashCode() + ((c6 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
