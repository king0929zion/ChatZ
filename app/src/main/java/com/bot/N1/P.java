package N1;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class P extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3705h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3706i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f3707j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3707j = q3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((P) p((InterfaceC0905c) obj2, (B) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        P p5 = new P(this.f3707j, interfaceC0905c);
        p5.f3706i = obj;
        return p5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0035, code lost:
    
        if (r6 == r5) goto L48;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.f3705h
            X3.y r2 = X3.y.a
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L26
            if (r0 == r4) goto L1c
            if (r0 != r3) goto L14
            X3.a.e(r21)
            return r2
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L1c:
            java.lang.Object r0 = r1.f3706i
            N1.B r0 = (N1.B) r0
            X3.a.e(r21)
            r6 = r21
            goto L39
        L26:
            X3.a.e(r21)
            java.lang.Object r0 = r1.f3706i
            N1.B r0 = (N1.B) r0
            r1.f3706i = r0
            r1.f3705h = r4
            java.lang.Object r6 = r0.a(r1)
            if (r6 != r5) goto L39
            goto Laa
        L39:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L43
            goto Lab
        L43:
            N1.Q r6 = r1.f3707j
            N1.l r7 = r6.f3715h
            java.lang.Object r8 = r7.f3756c
            long[] r8 = (long[]) r8
            java.lang.Object r9 = r7.f3755b
            java.util.concurrent.locks.ReentrantLock r9 = (java.util.concurrent.locks.ReentrantLock) r9
            r9.lock()
            boolean r10 = r7.a     // Catch: java.lang.Throwable -> L80
            r11 = 0
            if (r10 != 0) goto L5c
            r9.unlock()
            r13 = r11
            goto L96
        L5c:
            r10 = 0
            r7.a = r10     // Catch: java.lang.Throwable -> L80
            int r12 = r8.length     // Catch: java.lang.Throwable -> L80
            N1.k[] r13 = new N1.EnumC0289k[r12]     // Catch: java.lang.Throwable -> L80
            r14 = r10
            r15 = r14
        L64:
            if (r14 >= r12) goto L8f
            r16 = r8[r14]     // Catch: java.lang.Throwable -> L80
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 <= 0) goto L6f
            goto L70
        L6f:
            r4 = r10
        L70:
            java.lang.Object r10 = r7.f3757d     // Catch: java.lang.Throwable -> L80
            boolean[] r10 = (boolean[]) r10     // Catch: java.lang.Throwable -> L80
            boolean r3 = r10[r14]     // Catch: java.lang.Throwable -> L80
            if (r4 == r3) goto L85
            r10[r14] = r4     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L82
            N1.k r3 = N1.EnumC0289k.f3752e     // Catch: java.lang.Throwable -> L80
        L7e:
            r15 = 1
            goto L87
        L80:
            r0 = move-exception
            goto Lac
        L82:
            N1.k r3 = N1.EnumC0289k.f3753f     // Catch: java.lang.Throwable -> L80
            goto L7e
        L85:
            N1.k r3 = N1.EnumC0289k.f3751c     // Catch: java.lang.Throwable -> L80
        L87:
            r13[r14] = r3     // Catch: java.lang.Throwable -> L80
            int r14 = r14 + 1
            r3 = 2
            r4 = 1
            r10 = 0
            goto L64
        L8f:
            if (r15 == 0) goto L92
            goto L93
        L92:
            r13 = r11
        L93:
            r9.unlock()
        L96:
            if (r13 == 0) goto Lab
            N1.O r3 = new N1.O
            r3.<init>(r13, r6, r0, r11)
            r1.f3706i = r11
            r4 = 2
            r1.f3705h = r4
            N1.A r4 = N1.A.f3641e
            java.lang.Object r0 = r0.d(r4, r3, r1)
            if (r0 != r5) goto Lab
        Laa:
            return r5
        Lab:
            return r2
        Lac:
            r9.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.P.r(java.lang.Object):java.lang.Object");
    }
}
