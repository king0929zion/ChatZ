package Q;

import T.C0607g0;

/* loaded from: classes.dex */
public final class L2 {
    public final H4.c a = new H4.c();

    /* renamed from: b, reason: collision with root package name */
    public final C0607g0 f5361b = T.r.A(null);

    public static Object b(L2 l22, String str, d4.i iVar, int i6) {
        l22.getClass();
        return l22.a(new J2(str, D2.f5208c), iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r10.d(r0) == r6) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v0, types: [Q.J2, H4.a] */
    /* JADX WARN: Type inference failed for: r9v7, types: [H4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Q.J2 r9, d4.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Q.K2
            if (r0 == 0) goto L13
            r0 = r10
            Q.K2 r0 = (Q.K2) r0
            int r1 = r0.f5344k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5344k = r1
            goto L18
        L13:
            Q.K2 r0 = new Q.K2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f5342i
            int r1 = r0.f5344k
            T.g0 r2 = r8.f5361b
            r3 = 2
            r4 = 1
            r5 = 0
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L43
            if (r1 == r4) goto L39
            if (r1 != r3) goto L31
            H4.a r9 = r0.f5341h
            X3.a.e(r10)     // Catch: java.lang.Throwable -> L2f
            goto L79
        L2f:
            r10 = move-exception
            goto L86
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            H4.a r9 = r0.f5341h
            Q.J2 r1 = r0.f5340g
            X3.a.e(r10)
            r10 = r9
            r9 = r1
            goto L55
        L43:
            X3.a.e(r10)
            r0.f5340g = r9
            H4.c r10 = r8.a
            r0.f5341h = r10
            r0.f5344k = r4
            java.lang.Object r1 = r10.d(r0)
            if (r1 != r6) goto L55
            goto L75
        L55:
            r0.f5340g = r9     // Catch: java.lang.Throwable -> L82
            r0.f5341h = r10     // Catch: java.lang.Throwable -> L82
            r0.f5344k = r3     // Catch: java.lang.Throwable -> L82
            x4.k r1 = new x4.k     // Catch: java.lang.Throwable -> L82
            b4.c r0 = Y4.d.K(r0)     // Catch: java.lang.Throwable -> L82
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L82
            r1.t()     // Catch: java.lang.Throwable -> L82
            Q.I2 r0 = new Q.I2     // Catch: java.lang.Throwable -> L82
            r0.<init>(r9, r1)     // Catch: java.lang.Throwable -> L82
            r2.setValue(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r1.s()     // Catch: java.lang.Throwable -> L82
            if (r9 != r6) goto L76
        L75:
            return r6
        L76:
            r7 = r10
            r10 = r9
            r9 = r7
        L79:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L80
            r9.c(r5)
            return r10
        L80:
            r10 = move-exception
            goto L8a
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L80
            throw r10     // Catch: java.lang.Throwable -> L80
        L8a:
            r9.c(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.L2.a(Q.J2, d4.c):java.lang.Object");
    }
}
