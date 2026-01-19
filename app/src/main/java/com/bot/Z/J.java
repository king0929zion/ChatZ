package z;

import r.InterfaceC1619x0;
import s.C1643g;

/* loaded from: classes.dex */
public final class J implements InterfaceC1619x0 {
    public final C1643g a;

    /* renamed from: b, reason: collision with root package name */
    public final C2004b f16079b;

    public J(C1643g c1643g, C2004b c2004b) {
        this.a = c1643g;
        this.f16079b = c2004b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // r.InterfaceC1619x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(r.InterfaceC1563e1 r7, float r8, b4.InterfaceC0905c r9) {
        /*
            r6 = this;
            z.b r0 = r6.f16079b
            z.v r1 = r0.f16051d
            boolean r2 = r9 instanceof z.I
            if (r2 == 0) goto L17
            r2 = r9
            z.I r2 = (z.I) r2
            int r3 = r2.f16078i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f16078i = r3
            goto L1e
        L17:
            z.I r2 = new z.I
            d4.c r9 = (d4.c) r9
            r2.<init>(r6, r9)
        L1e:
            java.lang.Object r9 = r2.f16076g
            int r3 = r2.f16078i
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            X3.a.e(r9)
            goto L4a
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            X3.a.e(r9)
            W0.e r9 = new W0.e
            r3 = 20
            r9.<init>(r3, r6, r7)
            r2.f16078i = r4
            s.g r3 = r6.a
            java.lang.Object r9 = r3.d(r7, r8, r9, r2)
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r9 != r7) goto L4a
            return r7
        L4a:
            java.lang.Number r9 = (java.lang.Number) r9
            float r7 = r9.floatValue()
            T.c0 r8 = r1.f16173c
            float r8 = r8.g()
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L5c
            goto L97
        L5c:
            T.c0 r8 = r1.f16173c
            float r8 = r8.g()
            float r8 = java.lang.Math.abs(r8)
            double r2 = (double) r8
            r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L97
            T.d0 r8 = r1.f16172b
            int r8 = r8.g()
            r.K r1 = r0.f16058k
            boolean r1 = r1.b()
            if (r1 == 0) goto L92
            T.g0 r1 = r0.f16063p
            java.lang.Object r1 = r1.getValue()
            z.t r1 = (z.t) r1
            x4.y r1 = r1.f16169s
            z.B r2 = new z.B
            r3 = 0
            r2.<init>(r0, r3)
            r4 = 3
            x4.AbstractC1888A.y(r1, r3, r2, r4)
        L92:
            r1 = 0
            r0.t(r8, r9, r1)
            goto La2
        L97:
            T.c0 r8 = r1.f16173c
            float r8 = r8.g()
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
        La2:
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z.J.a(r.e1, float, b4.c):java.lang.Object");
    }
}
