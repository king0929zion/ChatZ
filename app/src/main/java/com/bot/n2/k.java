package n2;

import android.content.Context;
import i2.C1109c;
import java.util.List;
import s2.C1661i;
import s2.C1663k;
import t2.C1723g;

/* loaded from: classes.dex */
public final class k {
    public final C1661i a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13401c;

    /* renamed from: d, reason: collision with root package name */
    public final C1661i f13402d;

    /* renamed from: e, reason: collision with root package name */
    public final C1723g f13403e;

    /* renamed from: f, reason: collision with root package name */
    public final C1109c f13404f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13405g;

    public k(C1661i c1661i, List list, int i6, C1661i c1661i2, C1723g c1723g, C1109c c1109c, boolean z5) {
        this.a = c1661i;
        this.f13400b = list;
        this.f13401c = i6;
        this.f13402d = c1661i2;
        this.f13403e = c1723g;
        this.f13404f = c1109c;
        this.f13405g = z5;
    }

    public final void a(C1661i c1661i, C1370i c1370i) {
        Context context = c1661i.a;
        C1661i c1661i2 = this.a;
        if (context != c1661i2.a) {
            throw new IllegalStateException(("Interceptor '" + c1370i + "' cannot modify the request's context.").toString());
        }
        if (c1661i.f14766b == C1663k.a) {
            throw new IllegalStateException(("Interceptor '" + c1370i + "' cannot set the request's data to null.").toString());
        }
        if (c1661i.f14767c != c1661i2.f14767c) {
            throw new IllegalStateException(("Interceptor '" + c1370i + "' cannot modify the request's target.").toString());
        }
        if (c1661i.f14785u != c1661i2.f14785u) {
            throw new IllegalStateException(("Interceptor '" + c1370i + "' cannot modify the request's lifecycle.").toString());
        }
        if (c1661i.f14786v == c1661i2.f14786v) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + c1370i + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(s2.C1661i r12, d4.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof n2.C1371j
            if (r0 == 0) goto L13
            r0 = r13
            n2.j r0 = (n2.C1371j) r0
            int r1 = r0.f13399k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13399k = r1
            goto L18
        L13:
            n2.j r0 = new n2.j
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f13397i
            int r1 = r0.f13399k
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            n2.i r12 = r0.f13396h
            n2.k r0 = r0.f13395g
            X3.a.e(r13)
            goto L70
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            X3.a.e(r13)
            java.util.List r13 = r11.f13400b
            int r1 = r11.f13401c
            if (r1 <= 0) goto L45
            int r3 = r1 + (-1)
            java.lang.Object r3 = r13.get(r3)
            n2.i r3 = (n2.C1370i) r3
            r11.a(r12, r3)
        L45:
            java.lang.Object r13 = r13.get(r1)
            n2.i r13 = (n2.C1370i) r13
            int r6 = r1 + 1
            n2.k r3 = new n2.k
            i2.c r9 = r11.f13404f
            boolean r10 = r11.f13405g
            s2.i r4 = r11.a
            java.util.List r5 = r11.f13400b
            t2.g r8 = r11.f13403e
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f13395g = r11
            r0.f13396h = r13
            r0.f13399k = r2
            java.lang.Object r12 = r13.d(r3, r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r12 != r0) goto L6c
            return r0
        L6c:
            r0 = r13
            r13 = r12
            r12 = r0
            r0 = r11
        L70:
            s2.j r13 = (s2.AbstractC1662j) r13
            s2.i r1 = r13.a()
            r0.a(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.k.b(s2.i, d4.c):java.lang.Object");
    }
}
