package H2;

import D2.h;
import D2.i;
import X3.l;
import z3.C2034d;
import z3.T;

/* loaded from: classes.dex */
public abstract class g {
    public static final b Companion = new Object();

    public static final Exception a(g gVar, Exception exc) {
        gVar.getClass();
        if (exc instanceof C2034d) {
            C2034d c2034d = (C2034d) exc;
            int i6 = c2034d.f16259c.g().f2769c;
            String str = c2034d.f16267e;
            if (str == null) {
                str = "Client error";
            }
            return new a(i6, str);
        }
        if (!(exc instanceof T)) {
            return exc;
        }
        T t5 = (T) exc;
        int i7 = t5.f16259c.g().f2769c;
        String str2 = t5.f16260e;
        if (str2 == null) {
            str2 = "Server error";
        }
        return new a(i7, str2);
    }

    public static i e(Object obj) {
        String message;
        Throwable a = l.a(obj);
        if (a == null) {
            return new h(obj);
        }
        boolean z5 = a instanceof a;
        a aVar = z5 ? (a) a : null;
        if ((aVar == null || (message = aVar.f2025e) == null) && (message = a.getMessage()) == null) {
            message = "未知错误";
        }
        a aVar2 = z5 ? (a) a : null;
        return new D2.f(message, aVar2 != null ? aVar2.f2024c : -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, l4.c r6, d4.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof H2.c
            if (r0 == 0) goto L13
            r0 = r7
            H2.c r0 = (H2.c) r0
            int r1 = r0.f2028i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2028i = r1
            goto L18
        L13:
            H2.c r0 = new H2.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f2026g
            int r1 = r0.f2028i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r7)
            goto L45
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            X3.a.e(r7)
            E4.e r7 = x4.AbstractC1898K.a
            E4.d r7 = E4.d.f1360f
            H2.d r1 = new H2.d
            r3 = 0
            r1.<init>(r5, r6, r4, r3)
            r0.f2028i = r2
            java.lang.Object r7 = x4.AbstractC1888A.H(r7, r1, r0)
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r7 != r5) goto L45
            return r5
        L45:
            X3.l r7 = (X3.l) r7
            java.lang.Object r5 = r7.f9396c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.g.b(int, l4.c, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(b4.InterfaceC0905c r5, l4.c r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof H2.e
            if (r0 == 0) goto L13
            r0 = r5
            H2.e r0 = (H2.e) r0
            int r1 = r0.f2045j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2045j = r1
            goto L18
        L13:
            H2.e r0 = new H2.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2043h
            int r1 = r0.f2045j
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            H2.g r6 = r0.f2042g
            X3.a.e(r5)
            X3.l r5 = (X3.l) r5
            java.lang.Object r5 = r5.f9396c
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            X3.a.e(r5)
            r0.f2042g = r4
            r0.f2045j = r2
            java.lang.Object r5 = r4.b(r2, r6, r0)
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r5 != r6) goto L43
            return r6
        L43:
            r6 = r4
        L44:
            r6.getClass()
            D2.i r5 = e(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.g.c(b4.c, l4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r5, l4.c r6, d4.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof H2.f
            if (r0 == 0) goto L13
            r0 = r7
            H2.f r0 = (H2.f) r0
            int r1 = r0.f2049j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2049j = r1
            goto L18
        L13:
            H2.f r0 = new H2.f
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f2047h
            int r1 = r0.f2049j
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            H2.g r5 = r0.f2046g
            X3.a.e(r7)
            X3.l r7 = (X3.l) r7
            java.lang.Object r6 = r7.f9396c
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            X3.a.e(r7)
            r0.f2046g = r4
            r0.f2049j = r2
            java.lang.Object r6 = r4.b(r5, r6, r0)
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r6 != r5) goto L43
            return r5
        L43:
            r5 = r4
        L44:
            r5.getClass()
            D2.i r5 = e(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.g.d(int, l4.c, d4.c):java.lang.Object");
    }
}
