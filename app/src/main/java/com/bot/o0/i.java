package O0;

/* loaded from: classes.dex */
public final class i {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public float f4305b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4306c;

    public i(int i6, e eVar) {
        this.a = i6;
        this.f4306c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4306c
            T0.j r0 = (T0.j) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f8316f
            int r3 = T0.g.d(r3, r6, r7)
            android.text.Layout r4 = r0.f8316f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = r2
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.a
            if (r1 != r4) goto L35
            float r6 = r5.f4305b
            return r6
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.a = r4
            r5.f4305b = r6
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.i.a(int, boolean, boolean, boolean):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(float r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof O0.h
            if (r0 == 0) goto L13
            r0 = r6
            O0.h r0 = (O0.h) r0
            int r1 = r0.f4304i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4304i = r1
            goto L18
        L13:
            O0.h r0 = new O0.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4302g
            int r1 = r0.f4304i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r6)
            goto L44
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            X3.a.e(r6)
            java.lang.Object r6 = r4.f4306c
            O0.e r6 = (O0.e) r6
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            r0.f4304i = r2
            java.lang.Object r6 = r6.m(r1, r0)
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r6 != r5) goto L44
            return r5
        L44:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.f4305b
            float r6 = r6 + r5
            r4.f4305b = r6
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.i.b(float, d4.c):java.lang.Object");
    }

    public i(T0.j jVar) {
        this.f4306c = jVar;
        this.a = -1;
    }
}
