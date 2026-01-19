package D;

import T.AbstractC0623o0;
import android.os.Build;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class F {
    public static final T.e1 a = new AbstractC0623o0(new C0080m(1));

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f758b;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
    
        if (r14.f(r11) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final S0.C0545g r10, final S0.P r11, final W0.d r12, final java.util.List r13, T.C0626q r14, int r15) {
        /*
            T.e1 r0 = D.F.a
            java.lang.Object r0 = r14.j(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r1 = 0
            if (r0 == 0) goto L92
            java.lang.String r2 = r10.f7630e
            int r2 = r2.length()
            boolean r2 = b(r2)
            if (r2 == 0) goto L92
            r2 = -518761746(0xffffffffe11452ee, float:-1.7100586E20)
            r14.b0(r2)
            T.e1 r2 = I0.AbstractC0204q0.f2364n
            java.lang.Object r2 = r14.j(r2)
            r5 = r2
            e1.m r5 = (e1.m) r5
            T.e1 r2 = I0.AbstractC0204q0.f2358h
            java.lang.Object r2 = r14.j(r2)
            r8 = r2
            e1.c r8 = (e1.InterfaceC0961c) r8
            r2 = r15 & 112(0x70, float:1.57E-43)
            r2 = r2 ^ 48
            r3 = 1
            r4 = 32
            if (r2 <= r4) goto L3e
            boolean r2 = r14.f(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            if (r2 != 0) goto L42
        L3e:
            r2 = r15 & 48
            if (r2 != r4) goto L44
        L42:
            r2 = r3
            goto L45
        L44:
            r2 = r1
        L45:
            int r4 = r5.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            boolean r4 = r14.d(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            r2 = r2 | r4
            boolean r4 = r14.h(r13)     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            r2 = r2 | r4
            r4 = r15 & 14
            r4 = r4 ^ 6
            r6 = 4
            if (r4 <= r6) goto L60
            boolean r4 = r14.f(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            if (r4 != 0) goto L66
        L60:
            r15 = r15 & 6
            if (r15 != r6) goto L65
            goto L66
        L65:
            r3 = r1
        L66:
            r15 = r2 | r3
            boolean r2 = r14.f(r8)     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            r15 = r15 | r2
            boolean r2 = r14.h(r12)     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            r15 = r15 | r2
            java.lang.Object r2 = r14.P()     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            if (r15 != 0) goto L7c
            T.e r15 = T.C0616l.a     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            if (r2 != r15) goto L89
        L7c:
            D.D r3 = new D.D     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            r7 = r10
            r4 = r11
            r9 = r12
            r6 = r13
            r3.<init>()     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            r14.m0(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            r2 = r3
        L89:
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
            r0.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L8e
        L8e:
            r14.p(r1)
            return
        L92:
            r10 = -523310345(0xffffffffe0ceeaf7, float:-1.1928001E20)
            r14.b0(r10)
            r14.p(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.F.a(S0.g, S0.P, W0.d, java.util.List, T.q, int):void");
    }

    public static final boolean b(int i6) {
        if (Build.VERSION.SDK_INT >= 28 && i6 >= 8 && i6 < 1000) {
            if (f758b == null) {
                f758b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = f758b;
            AbstractC1276k.c(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
