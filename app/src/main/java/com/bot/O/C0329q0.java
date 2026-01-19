package O;

import b4.InterfaceC0905c;

/* renamed from: O.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329q0 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f4177f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4178g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0332s0 f4179h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f4180i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0329q0(C0332s0 c0332s0, L l3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4179h = c0332s0;
        this.f4180i = l3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0329q0) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0329q0 c0329q0 = new C0329q0(this.f4179h, this.f4180i, interfaceC0905c);
        c0329q0.f4178g = obj;
        return c0329q0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r5 == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r5 == r3) goto L15;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f4177f
            r1 = 2
            r2 = 1
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            X3.a.e(r5)
            goto L47
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r0 = r4.f4178g
            B0.V r0 = (B0.V) r0
            X3.a.e(r5)
            goto L37
        L20:
            X3.a.e(r5)
            java.lang.Object r5 = r4.f4178g
            r0 = r5
            B0.V r0 = (B0.V) r0
            r4.f4178g = r0
            r4.f4177f = r2
            r.q0 r5 = r.f2.a
            B0.q r5 = B0.EnumC0041q.f476e
            java.lang.Object r5 = r.f2.d(r0, r5, r4)
            if (r5 != r3) goto L37
            goto L46
        L37:
            B0.y r5 = (B0.y) r5
            r2 = 0
            r4.f4178g = r2
            r4.f4177f = r1
            B0.q r1 = B0.EnumC0041q.f475c
            java.lang.Object r5 = r.AbstractC1571h0.a(r0, r5, r1, r4)
            if (r5 != r3) goto L47
        L46:
            return r3
        L47:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L5d
            O.s0 r5 = r4.f4179h
            D.i0 r5 = r5.e()
            if (r5 == 0) goto L58
            goto L5d
        L58:
            O.L r5 = r4.f4180i
            r5.b()
        L5d:
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0329q0.r(java.lang.Object):java.lang.Object");
    }
}
