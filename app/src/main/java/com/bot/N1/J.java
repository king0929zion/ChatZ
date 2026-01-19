package N1;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class J extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3667h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3668i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f3669j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Q q3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3669j = q3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((J) p((InterfaceC0905c) obj2, (B) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        J j3 = new J(this.f3669j, interfaceC0905c);
        j3.f3668i = obj;
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r7 == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r7 == r3) goto L19;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f3667h
            r1 = 2
            r2 = 1
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            X3.a.e(r7)     // Catch: android.database.SQLException -> L54
            goto L51
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r0 = r6.f3668i
            N1.B r0 = (N1.B) r0
            X3.a.e(r7)
            goto L33
        L20:
            X3.a.e(r7)
            java.lang.Object r7 = r6.f3668i
            r0 = r7
            N1.B r0 = (N1.B) r0
            r6.f3668i = r0
            r6.f3667h = r2
            java.lang.Object r7 = r0.a(r6)
            if (r7 != r3) goto L33
            goto L50
        L33:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3c
            goto L54
        L3c:
            N1.A r7 = N1.A.f3641e     // Catch: android.database.SQLException -> L54
            N1.I r2 = new N1.I     // Catch: android.database.SQLException -> L54
            N1.Q r4 = r6.f3669j     // Catch: android.database.SQLException -> L54
            r5 = 0
            r2.<init>(r4, r5)     // Catch: android.database.SQLException -> L54
            r6.f3668i = r5     // Catch: android.database.SQLException -> L54
            r6.f3667h = r1     // Catch: android.database.SQLException -> L54
            java.lang.Object r7 = r0.d(r7, r2, r6)     // Catch: android.database.SQLException -> L54
            if (r7 != r3) goto L51
        L50:
            return r3
        L51:
            java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L54
            return r7
        L54:
            Y3.x r7 = Y3.x.f9814c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.J.r(java.lang.Object):java.lang.Object");
    }
}
