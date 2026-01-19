package androidx.lifecycle;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class D extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public H4.a f10818h;

    /* renamed from: i, reason: collision with root package name */
    public D1.c f10819i;

    /* renamed from: j, reason: collision with root package name */
    public int f10820j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ H4.c f10821k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D1.c f10822l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(H4.c cVar, D1.c cVar2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10821k = cVar;
        this.f10822l = cVar2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((D) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new D(this.f10821k, this.f10822l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r7.d(r6) == r4) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [H4.a] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f10820j
            r1 = 2
            r2 = 1
            r3 = 0
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L26
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            H4.a r0 = r6.f10818h
            X3.a.e(r7)     // Catch: java.lang.Throwable -> L13
            goto L4d
        L13:
            r7 = move-exception
            goto L57
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            D1.c r0 = r6.f10819i
            H4.a r2 = r6.f10818h
            X3.a.e(r7)
            r7 = r2
            goto L3a
        L26:
            X3.a.e(r7)
            H4.c r7 = r6.f10821k
            r6.f10818h = r7
            D1.c r0 = r6.f10822l
            r6.f10819i = r0
            r6.f10820j = r2
            java.lang.Object r2 = r7.d(r6)
            if (r2 != r4) goto L3a
            goto L4b
        L3a:
            androidx.lifecycle.C r2 = new androidx.lifecycle.C     // Catch: java.lang.Throwable -> L53
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L53
            r6.f10818h = r7     // Catch: java.lang.Throwable -> L53
            r6.f10819i = r3     // Catch: java.lang.Throwable -> L53
            r6.f10820j = r1     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = x4.AbstractC1888A.l(r2, r6)     // Catch: java.lang.Throwable -> L53
            if (r0 != r4) goto L4c
        L4b:
            return r4
        L4c:
            r0 = r7
        L4d:
            r0.c(r3)
            X3.y r7 = X3.y.a
            return r7
        L53:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L57:
            r0.c(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.D.r(java.lang.Object):java.lang.Object");
    }
}
