package r;

import b4.InterfaceC0905c;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class T1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14151h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1922e0 f14152i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1551a1 f14153j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(InterfaceC1922e0 interfaceC1922e0, C1551a1 c1551a1, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14152i = interfaceC1922e0;
        this.f14153j = c1551a1;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((T1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new T1(this.f14152i, this.f14153j, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r4.f14153j.e(r4) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r4.f14152i.Q(r4) == r3) goto L15;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f14151h
            r1 = 2
            r2 = 1
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            X3.a.e(r5)
            goto L35
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            X3.a.e(r5)
            goto L2a
        L1c:
            X3.a.e(r5)
            r4.f14151h = r2
            x4.e0 r5 = r4.f14152i
            java.lang.Object r5 = r5.Q(r4)
            if (r5 != r3) goto L2a
            goto L34
        L2a:
            r4.f14151h = r1
            r.a1 r5 = r4.f14153j
            java.lang.Object r5 = r5.e(r4)
            if (r5 != r3) goto L35
        L34:
            return r3
        L35:
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r.T1.r(java.lang.Object):java.lang.Object");
    }
}
