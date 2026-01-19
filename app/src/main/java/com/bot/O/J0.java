package O;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class J0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3962h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0341z f3963i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3964j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f3965k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S0.O f3966l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N0 f3967m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X0.p f3968n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C0341z c0341z, String str, long j3, S0.O o5, N0 n02, X0.p pVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3963i = c0341z;
        this.f3964j = str;
        this.f3965k = j3;
        this.f3966l = o5;
        this.f3967m = n02;
        this.f3968n = pVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((J0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new J0(this.f3963i, this.f3964j, this.f3965k, this.f3966l, this.f3967m, this.f3968n, interfaceC0905c);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[RETURN] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f3962h
            java.lang.String r6 = r7.f3964j
            r1 = 1
            if (r0 == 0) goto L15
            if (r0 != r1) goto Ld
            X3.a.e(r8)
            goto L47
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            X3.a.e(r8)
            r7.f3962h = r1
            O.z r4 = r7.f3963i
            r4.getClass()
            int r8 = r6.length()
            r0 = 0
            if (r8 != 0) goto L27
            goto L2f
        L27:
            long r2 = r7.f3965k
            boolean r8 = S0.O.c(r2)
            if (r8 == 0) goto L31
        L2f:
            r8 = r0
            goto L42
        L31:
            O.y r1 = new O.y
            r5 = 0
            r1.<init>(r2, r4, r5, r6)
            b4.h r8 = r4.a
            O.x r2 = new O.x
            r2.<init>(r4, r1, r0)
            java.lang.Object r8 = x4.AbstractC1888A.H(r8, r2, r7)
        L42:
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r8 != r0) goto L47
            return r0
        L47:
            S0.O r8 = (S0.O) r8
            X3.y r0 = X3.y.a
            if (r8 == 0) goto L9b
            long r1 = r8.a
            r8 = 32
            long r3 = r1 >> r8
            int r8 = (int) r3
            X0.p r3 = r7.f3968n
            int r8 = r3.a(r8)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r4
            int r1 = (int) r1
            int r1 = r3.a(r1)
            long r1 = S0.F.b(r8, r1)
            S0.O r8 = r7.f3966l
            boolean r8 = S0.O.a(r1, r8)
            if (r8 != 0) goto L9b
            O.N0 r8 = r7.f3967m
            X0.v r4 = r8.n()
            S0.g r4 = r4.a
            java.lang.String r4 = r4.f7630e
            boolean r4 = m4.AbstractC1276k.b(r4, r6)
            if (r4 == 0) goto L9b
            X0.p r4 = r8.f3993b
            if (r3 != r4) goto L9b
            l4.c r3 = r8.f3994c
            X0.v r4 = r8.n()
            S0.g r4 = r4.a
            X0.v r4 = O.N0.e(r4, r1)
            r3.f(r4)
            S0.O r3 = new S0.O
            r3.<init>(r1)
            r8.f4013v = r3
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O.J0.r(java.lang.Object):java.lang.Object");
    }
}
