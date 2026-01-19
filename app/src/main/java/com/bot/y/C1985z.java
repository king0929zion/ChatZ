package y;

import b4.InterfaceC0905c;
import n.InterfaceC1351z;
import x4.InterfaceC1942y;

/* renamed from: y.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1985z extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1351z f15954h;

    /* renamed from: i, reason: collision with root package name */
    public int f15955i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1948E f15956j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1351z f15957k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f15958l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1985z(C1948E c1948e, InterfaceC1351z interfaceC1351z, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15956j = c1948e;
        this.f15957k = interfaceC1351z;
        this.f15958l = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1985z) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1985z(this.f15956j, this.f15957k, this.f15958l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (n.C1316c.c(r8, r9, r2, r11, r14, 4) != r7) goto L30;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            r14 = this;
            y.E r0 = r14.f15956j
            n.c r1 = r0.f15770o
            int r2 = r14.f15955i
            long r3 = r14.f15958l
            r5 = 2
            r6 = 1
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r2 == 0) goto L25
            if (r2 == r6) goto L1f
            if (r2 != r5) goto L17
            X3.a.e(r15)     // Catch: java.util.concurrent.CancellationException -> L93
            goto L8b
        L17:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1f:
            n.z r2 = r14.f15954h
            X3.a.e(r15)     // Catch: java.util.concurrent.CancellationException -> L93
            goto L5f
        L25:
            X3.a.e(r15)
            T.g0 r15 = r1.f13094d     // Catch: java.util.concurrent.CancellationException -> L93
            java.lang.Object r15 = r15.getValue()     // Catch: java.util.concurrent.CancellationException -> L93
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.util.concurrent.CancellationException -> L93
            boolean r15 = r15.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L93
            n.z r2 = r14.f15957k
            if (r15 == 0) goto L41
            boolean r15 = r2 instanceof n.C1327h0     // Catch: java.util.concurrent.CancellationException -> L93
            if (r15 == 0) goto L3f
            n.h0 r2 = (n.C1327h0) r2     // Catch: java.util.concurrent.CancellationException -> L93
            goto L41
        L3f:
            n.h0 r2 = y.AbstractC1949F.a     // Catch: java.util.concurrent.CancellationException -> L93
        L41:
            T.g0 r15 = r1.f13094d     // Catch: java.util.concurrent.CancellationException -> L93
            java.lang.Object r15 = r15.getValue()     // Catch: java.util.concurrent.CancellationException -> L93
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.util.concurrent.CancellationException -> L93
            boolean r15 = r15.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L93
            if (r15 != 0) goto L64
            e1.j r15 = new e1.j     // Catch: java.util.concurrent.CancellationException -> L93
            r15.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L93
            r14.f15954h = r2     // Catch: java.util.concurrent.CancellationException -> L93
            r14.f15955i = r6     // Catch: java.util.concurrent.CancellationException -> L93
            java.lang.Object r15 = r1.e(r14, r15)     // Catch: java.util.concurrent.CancellationException -> L93
            if (r15 != r7) goto L5f
            goto L8a
        L5f:
            Y3.l r15 = r0.f15758c     // Catch: java.util.concurrent.CancellationException -> L93
            r15.b()     // Catch: java.util.concurrent.CancellationException -> L93
        L64:
            r10 = r2
            java.lang.Object r15 = r1.d()     // Catch: java.util.concurrent.CancellationException -> L93
            e1.j r15 = (e1.j) r15     // Catch: java.util.concurrent.CancellationException -> L93
            long r1 = r15.a     // Catch: java.util.concurrent.CancellationException -> L93
            long r1 = e1.j.d(r1, r3)     // Catch: java.util.concurrent.CancellationException -> L93
            n.c r8 = r0.f15770o     // Catch: java.util.concurrent.CancellationException -> L93
            e1.j r9 = new e1.j     // Catch: java.util.concurrent.CancellationException -> L93
            r9.<init>(r1)     // Catch: java.util.concurrent.CancellationException -> L93
            Q.U0 r11 = new Q.U0     // Catch: java.util.concurrent.CancellationException -> L93
            r11.<init>(r0, r1)     // Catch: java.util.concurrent.CancellationException -> L93
            r15 = 0
            r14.f15954h = r15     // Catch: java.util.concurrent.CancellationException -> L93
            r14.f15955i = r5     // Catch: java.util.concurrent.CancellationException -> L93
            r13 = 4
            r12 = r14
            java.lang.Object r15 = n.C1316c.c(r8, r9, r10, r11, r12, r13)     // Catch: java.util.concurrent.CancellationException -> L93
            if (r15 != r7) goto L8b
        L8a:
            return r7
        L8b:
            int r15 = y.C1948E.f15756t     // Catch: java.util.concurrent.CancellationException -> L93
            r15 = 0
            r0.f(r15)     // Catch: java.util.concurrent.CancellationException -> L93
            r0.f15762g = r15     // Catch: java.util.concurrent.CancellationException -> L93
        L93:
            X3.y r15 = X3.y.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C1985z.r(java.lang.Object):java.lang.Object");
    }
}
