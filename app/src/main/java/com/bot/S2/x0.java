package S2;

import b4.InterfaceC0905c;
import n.C1316c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class x0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7917h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f7918i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1316c f7919j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(C1316c c1316c, C1316c c1316c2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f7918i = c1316c;
        this.f7919j = c1316c2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((x0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new x0(this.f7918i, this.f7919j, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (x4.AbstractC1888A.l(r9, r8) == r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r2.e(r8, r9) == r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r3.e(r8, r9) == r7) goto L20;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f7917h
            r1 = 0
            n.c r2 = r8.f7919j
            n.c r3 = r8.f7918i
            r4 = 3
            r5 = 2
            r6 = 1
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L28
            if (r0 == r6) goto L24
            if (r0 == r5) goto L20
            if (r0 != r4) goto L18
            X3.a.e(r9)
            goto L56
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            X3.a.e(r9)
            goto L47
        L24:
            X3.a.e(r9)
            goto L39
        L28:
            X3.a.e(r9)
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r1)
            r8.f7917h = r6
            java.lang.Object r9 = r3.e(r8, r9)
            if (r9 != r7) goto L39
            goto L55
        L39:
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r1)
            r8.f7917h = r5
            java.lang.Object r9 = r2.e(r8, r9)
            if (r9 != r7) goto L47
            goto L55
        L47:
            S2.w0 r9 = new S2.w0
            r0 = 0
            r9.<init>(r3, r2, r0)
            r8.f7917h = r4
            java.lang.Object r9 = x4.AbstractC1888A.l(r9, r8)
            if (r9 != r7) goto L56
        L55:
            return r7
        L56:
            X3.y r9 = X3.y.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.x0.r(java.lang.Object):java.lang.Object");
    }
}
