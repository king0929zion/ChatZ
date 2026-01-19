package B0;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class T extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f408h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f409i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V f410j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(long j3, V v5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f409i = j3;
        this.f410j = v5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((T) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new T(this.f409i, this.f410j, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (x4.AbstractC1888A.m(8, r10) == r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (x4.AbstractC1888A.m(r3 - 8, r10) == r7) goto L15;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f408h
            r1 = 8
            long r3 = r10.f409i
            r5 = 2
            r6 = 1
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L20
            if (r0 == r6) goto L1c
            if (r0 != r5) goto L14
            X3.a.e(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            X3.a.e(r11)
            goto L2e
        L20:
            X3.a.e(r11)
            long r8 = r3 - r1
            r10.f408h = r6
            java.lang.Object r11 = x4.AbstractC1888A.m(r8, r10)
            if (r11 != r7) goto L2e
            goto L36
        L2e:
            r10.f408h = r5
            java.lang.Object r11 = x4.AbstractC1888A.m(r1, r10)
            if (r11 != r7) goto L37
        L36:
            return r7
        L37:
            B0.V r11 = r10.f410j
            x4.k r11 = r11.f416f
            if (r11 == 0) goto L49
            B0.r r0 = new B0.r
            r0.<init>(r3)
            X3.k r0 = X3.a.b(r0)
            r11.k(r0)
        L49:
            X3.y r11 = X3.y.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.T.r(java.lang.Object):java.lang.Object");
    }
}
