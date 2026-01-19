package B0;

import H0.AbstractC0157l;
import I0.X0;
import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import e1.InterfaceC0961c;
import x4.C1928k;

/* loaded from: classes.dex */
public final class V implements InterfaceC0961c, InterfaceC0905c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f414c;

    /* renamed from: e, reason: collision with root package name */
    public final C1928k f415e;

    /* renamed from: f, reason: collision with root package name */
    public C1928k f416f;

    /* renamed from: g, reason: collision with root package name */
    public EnumC0041q f417g = EnumC0041q.f476e;

    /* renamed from: h, reason: collision with root package name */
    public final C0911i f418h = C0911i.f11057c;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X f419i;

    public V(X x5, C1928k c1928k) {
        this.f419i = x5;
        this.f414c = x5;
        this.f415e = c1928k;
    }

    @Override // e1.InterfaceC0961c
    public final float A(long j3) {
        return this.f414c.A(j3);
    }

    @Override // e1.InterfaceC0961c
    public final long O(float f6) {
        return this.f414c.O(f6);
    }

    @Override // e1.InterfaceC0961c
    public final float T(int i6) {
        return this.f414c.T(i6);
    }

    @Override // e1.InterfaceC0961c
    public final float V(float f6) {
        return f6 / this.f414c.a();
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f414c.a();
    }

    public final Object b(EnumC0041q enumC0041q, d4.a aVar) {
        C1928k c1928k = new C1928k(1, Y4.d.K(aVar));
        c1928k.t();
        this.f417g = enumC0041q;
        this.f416f = c1928k;
        return c1928k.s();
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f414c.b0();
    }

    public final long d() {
        X x5 = this.f419i;
        x5.getClass();
        long r02 = x5.r0(AbstractC0157l.v(x5).f1716E.d());
        long j3 = x5.f422A;
        float max = Math.max(S.l.f7374V, Float.intBitsToFloat((int) (r02 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        float max2 = Math.max(S.l.f7374V, Float.intBitsToFloat((int) (r02 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    @Override // e1.InterfaceC0961c
    public final float e0(float f6) {
        return this.f414c.a() * f6;
    }

    public final X0 g() {
        X x5 = this.f419i;
        x5.getClass();
        return AbstractC0157l.v(x5).f1716E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [x4.e0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [x4.e0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [l4.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r6, l4.e r8, d4.a r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof B0.S
            if (r0 == 0) goto L13
            r0 = r9
            B0.S r0 = (B0.S) r0
            int r1 = r0.f407j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f407j = r1
            goto L18
        L13:
            B0.S r0 = new B0.S
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f405h
            int r1 = r0.f407j
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            x4.s0 r6 = r0.f404g
            X3.a.e(r9)     // Catch: java.lang.Throwable -> L27
            goto L68
        L27:
            r7 = move-exception
            goto L6e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            X3.a.e(r9)
            r3 = 0
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 > 0) goto L4a
            x4.k r9 = r5.f416f
            if (r9 == 0) goto L4a
            B0.r r1 = new B0.r
            r1.<init>(r6)
            X3.k r1 = X3.a.b(r1)
            r9.k(r1)
        L4a:
            B0.X r9 = r5.f419i
            x4.y r9 = r9.A0()
            B0.T r1 = new B0.T
            r3 = 0
            r1.<init>(r6, r5, r3)
            r6 = 3
            x4.s0 r6 = x4.AbstractC1888A.y(r9, r3, r1, r6)
            r0.f404g = r6     // Catch: java.lang.Throwable -> L27
            r0.f407j = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r8.m(r5, r0)     // Catch: java.lang.Throwable -> L27
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r9 != r7) goto L68
            return r7
        L68:
            B0.b r7 = B0.C0026b.f433e
            r6.f(r7)
            return r9
        L6e:
            B0.b r8 = B0.C0026b.f433e
            r6.f(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.V.h(long, l4.e, d4.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r5, l4.e r7, d4.a r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof B0.U
            if (r0 == 0) goto L13
            r0 = r8
            B0.U r0 = (B0.U) r0
            int r1 = r0.f413i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f413i = r1
            goto L18
        L13:
            B0.U r0 = new B0.U
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f411g
            int r1 = r0.f413i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r8)     // Catch: B0.r -> L3c
            return r8
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            X3.a.e(r8)
            r0.f413i = r2     // Catch: B0.r -> L3c
            java.lang.Object r5 = r4.h(r5, r7, r0)     // Catch: B0.r -> L3c
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r5 != r6) goto L3b
            return r6
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.V.j(long, l4.e, d4.a):java.lang.Object");
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        X x5 = this.f419i;
        synchronized (x5.f429x) {
            x5.f428w.j(this);
        }
        this.f415e.k(obj);
    }

    @Override // e1.InterfaceC0961c
    public final int l0(float f6) {
        return this.f414c.l0(f6);
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        return this.f418h;
    }

    @Override // e1.InterfaceC0961c
    public final long r0(long j3) {
        return this.f414c.r0(j3);
    }

    @Override // e1.InterfaceC0961c
    public final long s(float f6) {
        return this.f414c.s(f6);
    }

    @Override // e1.InterfaceC0961c
    public final long t(long j3) {
        return this.f414c.t(j3);
    }

    @Override // e1.InterfaceC0961c
    public final float u0(long j3) {
        return this.f414c.u0(j3);
    }
}
