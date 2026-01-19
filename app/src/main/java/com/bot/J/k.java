package J;

import X3.y;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class k extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public Throwable f2795h;

    /* renamed from: i, reason: collision with root package name */
    public int f2796i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f2797j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ K.f f2798k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, K.f fVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2797j = lVar;
        this.f2798k = fVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((k) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new k(this.f2797j, this.f2798k, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r8.f(r7) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r8.a(r5, r7) == r6) goto L37;
     */
    /* JADX WARN: Type inference failed for: r8v4, types: [d4.i, l4.c] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f2796i
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            J.l r5 = r7.f2797j
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L31
            if (r0 == r4) goto L2d
            if (r0 == r3) goto L26
            if (r0 == r2) goto L22
            if (r0 == r1) goto L1c
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Throwable r0 = r7.f2795h
            X3.a.e(r8)
            goto L6b
        L22:
            X3.a.e(r8)
            goto L59
        L26:
            X3.a.e(r8)     // Catch: java.lang.Throwable -> L2a
            goto L4c
        L2a:
            r8 = move-exception
            r0 = r8
            goto L5c
        L2d:
            X3.a.e(r8)     // Catch: java.lang.Throwable -> L2a
            goto L41
        L31:
            X3.a.e(r8)
            d4.i r8 = r5.f2800u     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto L41
            r7.f2796i = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = r8.f(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 != r6) goto L41
            goto L6a
        L41:
            K.f r8 = r7.f2798k     // Catch: java.lang.Throwable -> L2a
            r7.f2796i = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = r8.a(r5, r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 != r6) goto L4c
            goto L6a
        L4c:
            l4.c r8 = r5.f2801v
            if (r8 == 0) goto L59
            r7.f2796i = r2
            java.lang.Object r8 = r8.f(r7)
            if (r8 != r6) goto L59
            goto L6a
        L59:
            X3.y r8 = X3.y.a
            return r8
        L5c:
            l4.c r8 = r5.f2801v
            if (r8 == 0) goto L6b
            r7.f2795h = r0
            r7.f2796i = r1
            java.lang.Object r8 = r8.f(r7)
            if (r8 != r6) goto L6b
        L6a:
            return r6
        L6b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J.k.r(java.lang.Object):java.lang.Object");
    }
}
