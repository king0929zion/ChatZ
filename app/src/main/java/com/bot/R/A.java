package R;

import Q.s3;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class A extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public Throwable f6673h;

    /* renamed from: i, reason: collision with root package name */
    public int f6674i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A4.O f6675j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s3 f6676k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(A4.O o5, s3 s3Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6675j = o5;
        this.f6676k = s3Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((A) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new A(this.f6675j, this.f6676k, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (A4.W.f(r5, r9, r8) == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r6.c(r9, r8) == r7) goto L30;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f6674i
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            A4.O r5 = r8.f6675j
            Q.s3 r6 = r8.f6676k
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L2d
            if (r0 == r4) goto L26
            if (r0 == r3) goto L22
            if (r0 == r2) goto L1c
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            java.lang.Throwable r0 = r8.f6673h
            X3.a.e(r9)
            goto L73
        L22:
            X3.a.e(r9)
            goto L5a
        L26:
            X3.a.e(r9)     // Catch: java.lang.Throwable -> L2a
            goto L46
        L2a:
            r9 = move-exception
            r0 = r9
            goto L5d
        L2d:
            X3.a.e(r9)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2a
            r0 = r5
            A4.g0 r0 = (A4.g0) r0     // Catch: java.lang.Throwable -> L2a
            r0.getClass()     // Catch: java.lang.Throwable -> L2a
            r0.l(r1, r9)     // Catch: java.lang.Throwable -> L2a
            p.x0 r9 = p.x0.f13825f     // Catch: java.lang.Throwable -> L2a
            r8.f6674i = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r9 = r6.c(r9, r8)     // Catch: java.lang.Throwable -> L2a
            if (r9 != r7) goto L46
            goto L72
        L46:
            boolean r9 = r6.b()
            if (r9 == 0) goto L5a
            R.z r9 = new R.z
            r9.<init>(r6, r1)
            r8.f6674i = r3
            java.lang.Object r9 = A4.W.f(r5, r9, r8)
            if (r9 != r7) goto L5a
            goto L72
        L5a:
            X3.y r9 = X3.y.a
            return r9
        L5d:
            boolean r9 = r6.b()
            if (r9 == 0) goto L73
            R.z r9 = new R.z
            r9.<init>(r6, r1)
            r8.f6673h = r0
            r8.f6674i = r2
            java.lang.Object r9 = A4.W.f(r5, r9, r8)
            if (r9 != r7) goto L73
        L72:
            return r7
        L73:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R.A.r(java.lang.Object):java.lang.Object");
    }
}
