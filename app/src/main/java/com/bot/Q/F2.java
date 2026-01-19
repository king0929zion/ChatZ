package Q;

import I0.InterfaceC0181f;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class F2 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5239h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I2 f5240i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0181f f5241j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(I2 i22, InterfaceC0181f interfaceC0181f, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5240i = i22;
        this.f5241j = interfaceC0181f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((F2) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new F2(this.f5240i, this.f5241j, interfaceC0905c);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b A[RETURN] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f5239h
            Q.I2 r1 = r9.f5240i
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Ld
            X3.a.e(r10)
            goto L6c
        Ld:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L15:
            X3.a.e(r10)
            if (r1 == 0) goto L79
            Q.J2 r10 = r1.a
            Q.D2 r10 = r10.f5317b
            int r10 = r10.ordinal()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r10 == 0) goto L39
            if (r10 == r2) goto L36
            r0 = 2
            if (r10 != r0) goto L30
            r5 = r3
            goto L3b
        L30:
            N0.e r10 = new N0.e
            r10.<init>()
            throw r10
        L36:
            r5 = 10000(0x2710, double:4.9407E-320)
            goto L3b
        L39:
            r5 = 4000(0xfa0, double:1.9763E-320)
        L3b:
            I0.f r10 = r9.f5241j
            if (r10 != 0) goto L40
            goto L60
        L40:
            I0.g r10 = (I0.C0183g) r10
            android.view.accessibility.AccessibilityManager r10 = r10.a
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L4c
            goto L60
        L4c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r7 = 29
            if (r0 < r7) goto L60
            int r0 = (int) r5
            r5 = 3
            int r10 = I0.AbstractC0178d0.a(r10, r0, r5)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r10 != r0) goto L5e
            goto L61
        L5e:
            long r3 = (long) r10
            goto L61
        L60:
            r3 = r5
        L61:
            r9.f5239h = r2
            java.lang.Object r10 = x4.AbstractC1888A.m(r3, r9)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r10 != r0) goto L6c
            return r0
        L6c:
            x4.k r10 = r1.f5297b
            boolean r0 = r10.y()
            if (r0 == 0) goto L79
            Q.T2 r0 = Q.T2.f5525c
            r10.k(r0)
        L79:
            X3.y r10 = X3.y.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.F2.r(java.lang.Object):java.lang.Object");
    }
}
