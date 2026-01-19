package N;

import H0.AbstractC0141b0;
import S0.P;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class r extends AbstractC0141b0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final P f3616b;

    /* renamed from: c, reason: collision with root package name */
    public final W0.d f3617c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3618d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3619e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3620f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3621g;

    public r(String str, P p5, W0.d dVar, int i6, boolean z5, int i7, int i8) {
        this.a = str;
        this.f3616b = p5;
        this.f3617c = dVar;
        this.f3618d = i6;
        this.f3619e = z5;
        this.f3620f = i7;
        this.f3621g = i8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [N.u, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f3629r = this.a;
        abstractC1040q.f3630s = this.f3616b;
        abstractC1040q.f3631t = this.f3617c;
        abstractC1040q.f3632u = this.f3618d;
        abstractC1040q.f3633v = this.f3619e;
        abstractC1040q.f3634w = this.f3620f;
        abstractC1040q.f3635x = this.f3621g;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        rVar.getClass();
        return AbstractC1276k.b(this.a, rVar.a) && AbstractC1276k.b(this.f3616b, rVar.f3616b) && AbstractC1276k.b(this.f3617c, rVar.f3617c) && this.f3618d == rVar.f3618d && this.f3619e == rVar.f3619e && this.f3620f == rVar.f3620f && this.f3621g == rVar.f3621g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // H0.AbstractC0141b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(h0.AbstractC1040q r12) {
        /*
            r11 = this;
            N.u r12 = (N.u) r12
            r12.getClass()
            S0.P r0 = r12.f3630s
            r1 = 0
            r2 = 1
            S0.P r3 = r11.f3616b
            if (r3 == r0) goto L1a
            S0.G r4 = r3.a
            S0.G r0 = r0.a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L18
            goto L1d
        L18:
            r0 = r2
            goto L1e
        L1a:
            r3.getClass()
        L1d:
            r0 = r1
        L1e:
            java.lang.String r4 = r12.f3629r
            java.lang.String r5 = r11.a
            boolean r4 = m4.AbstractC1276k.b(r4, r5)
            if (r4 == 0) goto L29
            goto L2f
        L29:
            r12.f3629r = r5
            r1 = 0
            r12.f3628B = r1
            r1 = r2
        L2f:
            S0.P r4 = r12.f3630s
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r12.f3630s = r3
            int r3 = r12.f3635x
            int r5 = r11.f3621g
            if (r3 == r5) goto L41
            r12.f3635x = r5
            r4 = r2
        L41:
            int r3 = r12.f3634w
            int r5 = r11.f3620f
            if (r3 == r5) goto L4a
            r12.f3634w = r5
            r4 = r2
        L4a:
            boolean r3 = r12.f3633v
            boolean r5 = r11.f3619e
            if (r3 == r5) goto L53
            r12.f3633v = r5
            r4 = r2
        L53:
            W0.d r3 = r12.f3631t
            W0.d r5 = r11.f3617c
            boolean r3 = m4.AbstractC1276k.b(r3, r5)
            if (r3 != 0) goto L60
            r12.f3631t = r5
            r4 = r2
        L60:
            int r3 = r12.f3632u
            int r5 = r11.f3618d
            if (r3 != r5) goto L68
            r2 = r4
            goto L6a
        L68:
            r12.f3632u = r5
        L6a:
            if (r1 != 0) goto L6e
            if (r2 == 0) goto L9a
        L6e:
            N.e r3 = r12.M0()
            java.lang.String r4 = r12.f3629r
            S0.P r5 = r12.f3630s
            W0.d r6 = r12.f3631t
            int r7 = r12.f3632u
            boolean r8 = r12.f3633v
            int r9 = r12.f3634w
            int r10 = r12.f3635x
            r3.a = r4
            r3.f3535b = r5
            r3.f3536c = r6
            r3.f3537d = r7
            r3.f3538e = r8
            r3.f3539f = r9
            r3.f3540g = r10
            long r4 = r3.f3552s
            r6 = 2
            long r4 = r4 << r6
            r6 = 2
            long r4 = r4 | r6
            r3.f3552s = r4
            r3.c()
        L9a:
            boolean r3 = r12.f11819q
            if (r3 != 0) goto L9f
            goto Lb9
        L9f:
            if (r1 != 0) goto La7
            if (r0 == 0) goto Laa
            N.s r3 = r12.f3627A
            if (r3 == 0) goto Laa
        La7:
            H0.AbstractC0157l.m(r12)
        Laa:
            if (r1 != 0) goto Lae
            if (r2 == 0) goto Lb4
        Lae:
            H0.AbstractC0157l.l(r12)
            H0.AbstractC0157l.k(r12)
        Lb4:
            if (r0 == 0) goto Lb9
            H0.AbstractC0157l.k(r12)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N.r.g(h0.q):void");
    }

    public final int hashCode() {
        return (((AbstractC1135a.d(AbstractC1135a.b(this.f3618d, (this.f3617c.hashCode() + B3.e.d(this.a.hashCode() * 31, 31, this.f3616b)) * 31, 31), 31, this.f3619e) + this.f3620f) * 31) + this.f3621g) * 31;
    }
}
