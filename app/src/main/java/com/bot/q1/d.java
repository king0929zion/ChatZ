package Q1;

import N1.A;
import N1.B;
import P1.v;
import d4.i;
import i4.AbstractC1120d;

/* loaded from: classes.dex */
public final class d implements B, v {
    public final a a;

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // N1.B
    public final Object a(i iVar) {
        return Boolean.valueOf(this.a.f6343c.U());
    }

    @Override // N1.InterfaceC0293o
    public final Object b(String str, l4.c cVar, d4.c cVar2) {
        g c02 = this.a.c0(str);
        try {
            Object f6 = cVar.f(c02);
            AbstractC1120d.h(c02, null);
            return f6;
        } finally {
        }
    }

    @Override // P1.v
    public final X1.a c() {
        return this.a;
    }

    @Override // N1.B
    public final Object d(A a, l4.e eVar, i iVar) {
        return e(a, eVar, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(N1.A r5, l4.e r6, d4.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof Q1.c
            if (r0 == 0) goto L13
            r0 = r7
            Q1.c r0 = (Q1.c) r0
            int r1 = r0.f6349k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6349k = r1
            goto L18
        L13:
            Q1.c r0 = new Q1.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f6347i
            int r1 = r0.f6349k
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            Y1.a r5 = r0.f6346h
            Q1.d r6 = r0.f6345g
            X3.a.e(r7)     // Catch: java.lang.Throwable -> L29
            goto L72
        L29:
            r7 = move-exception
            goto L87
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            X3.a.e(r7)
            Q1.a r7 = r4.a
            Y1.a r7 = r7.f6343c
            r7.U()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L56
            if (r5 == r2) goto L52
            r1 = 2
            if (r5 != r1) goto L4c
            r7.g()
            goto L59
        L4c:
            N0.e r5 = new N0.e
            r5.<init>()
            throw r5
        L52:
            r7.D()
            goto L59
        L56:
            r7.w()
        L59:
            P1.o r5 = new P1.o     // Catch: java.lang.Throwable -> L82
            r1 = 1
            r5.<init>(r4, r1)     // Catch: java.lang.Throwable -> L82
            r0.f6345g = r4     // Catch: java.lang.Throwable -> L82
            r0.f6346h = r7     // Catch: java.lang.Throwable -> L82
            r0.f6349k = r2     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r6.m(r5, r0)     // Catch: java.lang.Throwable -> L82
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r5 != r6) goto L6e
            return r6
        L6e:
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L72:
            r5.B()     // Catch: java.lang.Throwable -> L29
            r5.J()
            boolean r5 = r5.U()
            if (r5 != 0) goto L81
            r6.getClass()
        L81:
            return r7
        L82:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L87:
            r5.J()
            boolean r5 = r5.U()
            if (r5 != 0) goto L93
            r6.getClass()
        L93:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.d.e(N1.A, l4.e, d4.c):java.lang.Object");
    }
}
