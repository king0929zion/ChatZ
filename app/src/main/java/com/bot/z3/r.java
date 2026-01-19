package z3;

import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final B3.j f16298d = new B3.j(3);

    /* renamed from: e, reason: collision with root package name */
    public static final N3.a f16299e = new N3.a("HttpResponseValidator");
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16300b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16301c;

    public r(List list, List list2, boolean z5) {
        this.a = list;
        this.f16300b = list2;
        this.f16301c = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(z3.r r4, java.lang.Throwable r5, E3.b r6, d4.c r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof z3.C2046p
            if (r0 == 0) goto L16
            r0 = r7
            z3.p r0 = (z3.C2046p) r0
            int r1 = r0.f16292i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f16292i = r1
            goto L1b
        L16:
            z3.p r0 = new z3.p
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f16290g
            int r0 = r0.f16292i
            if (r0 == 0) goto L34
            r4 = 1
            r5 = 0
            if (r0 == r4) goto L28
            r4 = 2
            if (r0 != r4) goto L2c
        L28:
            X3.a.e(r7)
            goto L5d
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            X3.a.e(r7)
            f5.a r7 = z3.AbstractC2049t.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Processing exception "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " for request "
            r0.append(r5)
            I3.H r5 = r6.getUrl()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.c(r5)
            java.util.List r4 = r4.f16300b
            java.util.Iterator r4 = r4.iterator()
            r5 = r4
        L5d:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L70
            java.lang.Object r4 = r5.next()
            if (r4 != 0) goto L6a
            goto L5d
        L6a:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.r.a(z3.r, java.lang.Throwable, E3.b, d4.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(z3.r r4, F3.c r5, d4.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof z3.C2047q
            if (r0 == 0) goto L16
            r0 = r6
            z3.q r0 = (z3.C2047q) r0
            int r1 = r0.f16297k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f16297k = r1
            goto L1b
        L16:
            z3.q r0 = new z3.q
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f16295i
            int r1 = r0.f16297k
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.util.Iterator r4 = r0.f16294h
            F3.c r5 = r0.f16293g
            X3.a.e(r6)
            goto L5c
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            X3.a.e(r6)
            f5.a r6 = z3.AbstractC2049t.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Validating response for request "
            r1.<init>(r3)
            u3.c r3 = r5.b()
            E3.b r3 = r3.d()
            I3.H r3 = r3.getUrl()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r6.c(r1)
            java.util.List r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
        L5c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L77
            java.lang.Object r6 = r4.next()
            l4.e r6 = (l4.e) r6
            r0.f16293g = r5
            r0.f16294h = r4
            r0.f16297k = r2
            java.lang.Object r6 = r6.m(r5, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r6 != r1) goto L5c
            return r1
        L77:
            X3.y r4 = X3.y.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.r.b(z3.r, F3.c, d4.c):java.lang.Object");
    }
}
