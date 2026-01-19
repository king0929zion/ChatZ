package Q;

import b4.InterfaceC0905c;

/* renamed from: Q.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447o0 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f6021f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0439m0 f6023h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0447o0(C0439m0 c0439m0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6023h = c0439m0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0447o0) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0447o0 c0447o0 = new C0447o0(this.f6023h, interfaceC0905c);
        c0447o0.f6022g = obj;
        return c0447o0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r5 == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
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
            int r0 = r4.f6021f
            r1 = 2
            r2 = 1
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            X3.a.e(r5)
            goto L43
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r0 = r4.f6022g
            B0.V r0 = (B0.V) r0
            X3.a.e(r5)
            goto L33
        L20:
            X3.a.e(r5)
            java.lang.Object r5 = r4.f6022g
            r0 = r5
            B0.V r0 = (B0.V) r0
            r4.f6022g = r0
            r4.f6021f = r2
            java.lang.Object r5 = r.f2.c(r0, r4, r2)
            if (r5 != r3) goto L33
            goto L42
        L33:
            B0.y r5 = (B0.y) r5
            r5 = 0
            r4.f6022g = r5
            r4.f6021f = r1
            B0.q r5 = B0.EnumC0041q.f475c
            java.lang.Object r5 = r.f2.i(r0, r5, r4)
            if (r5 != r3) goto L43
        L42:
            return r3
        L43:
            B0.y r5 = (B0.y) r5
            if (r5 == 0) goto L4c
            Q.m0 r5 = r4.f6023h
            r5.b()
        L4c:
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.C0447o0.r(java.lang.Object):java.lang.Object");
    }
}
