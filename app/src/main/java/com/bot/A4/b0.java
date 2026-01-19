package A4;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class b0 extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public int f237h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ InterfaceC0008i f238i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f239j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f240k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f240k = d0Var;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        b0 b0Var = new b0(this.f240k, (InterfaceC0905c) obj3);
        b0Var.f238i = (InterfaceC0008i) obj;
        b0Var.f239j = intValue;
        return b0Var.r(X3.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
    
        if (r0.a(A4.Y.f226f, r9) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (x4.AbstractC1888A.m(Long.MAX_VALUE, r9) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r0.a(A4.Y.f225e, r9) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r0.a(A4.Y.f224c, r9) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (x4.AbstractC1888A.m(r7, r9) == r6) goto L32;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f237h
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L34
            if (r0 == r5) goto L30
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L24
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            A4.i r0 = r9.f238i
            X3.a.e(r10)
            goto L74
        L24:
            A4.i r0 = r9.f238i
            X3.a.e(r10)
            goto L64
        L2a:
            A4.i r0 = r9.f238i
            X3.a.e(r10)
            goto L57
        L30:
            X3.a.e(r10)
            goto L82
        L34:
            X3.a.e(r10)
            A4.i r0 = r9.f238i
            int r10 = r9.f239j
            if (r10 <= 0) goto L48
            r9.f237h = r5
            A4.Y r10 = A4.Y.f224c
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r6) goto L82
            goto L81
        L48:
            A4.d0 r10 = r9.f240k
            long r7 = r10.a
            r9.f238i = r0
            r9.f237h = r4
            java.lang.Object r10 = x4.AbstractC1888A.m(r7, r9)
            if (r10 != r6) goto L57
            goto L81
        L57:
            r9.f238i = r0
            r9.f237h = r3
            A4.Y r10 = A4.Y.f225e
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r6) goto L64
            goto L81
        L64:
            r9.f238i = r0
            r9.f237h = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r10 = x4.AbstractC1888A.m(r2, r9)
            if (r10 != r6) goto L74
            goto L81
        L74:
            r10 = 0
            r9.f238i = r10
            r9.f237h = r1
            A4.Y r10 = A4.Y.f226f
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r6) goto L82
        L81:
            return r6
        L82:
            X3.y r10 = X3.y.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.b0.r(java.lang.Object):java.lang.Object");
    }
}
