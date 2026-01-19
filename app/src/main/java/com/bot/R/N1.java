package r;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class N1 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public x4.s0 f14093f;

    /* renamed from: g, reason: collision with root package name */
    public int f14094g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14095h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f14096i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d4.i f14097j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l4.c f14098k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1551a1 f14099l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public N1(InterfaceC1942y interfaceC1942y, l4.f fVar, l4.c cVar, C1551a1 c1551a1, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14096i = interfaceC1942y;
        this.f14097j = (d4.i) fVar;
        this.f14098k = cVar;
        this.f14099l = c1551a1;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((N1) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l4.f, d4.i] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        N1 n12 = new N1(this.f14096i, this.f14097j, this.f14098k, this.f14099l, interfaceC0905c);
        n12.f14095h = obj;
        return n12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r11 == r6) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [x4.e0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [l4.f, d4.i] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f14094g
            x4.y r1 = r10.f14096i
            r2 = 2
            r3 = 1
            r.a1 r4 = r10.f14099l
            r5 = 0
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L21
            if (r0 != r2) goto L19
            java.lang.Object r0 = r10.f14095h
            x4.e0 r0 = (x4.InterfaceC1922e0) r0
            X3.a.e(r11)
            goto L70
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            x4.s0 r0 = r10.f14093f
            java.lang.Object r3 = r10.f14095h
            B0.V r3 = (B0.V) r3
            X3.a.e(r11)
            goto L4e
        L2b:
            X3.a.e(r11)
            java.lang.Object r11 = r10.f14095h
            B0.V r11 = (B0.V) r11
            r.q0 r0 = r.f2.a
            r.M1 r0 = new r.M1
            r0.<init>(r4, r5)
            x4.s0 r0 = x4.AbstractC1888A.y(r1, r5, r0, r3)
            r10.f14095h = r11
            r10.f14093f = r0
            r10.f14094g = r3
            r3 = 3
            java.lang.Object r3 = r.f2.c(r11, r10, r3)
            if (r3 != r6) goto L4b
            goto L6f
        L4b:
            r9 = r3
            r3 = r11
            r11 = r9
        L4e:
            B0.y r11 = (B0.y) r11
            r11.a()
            r.q0 r7 = r.f2.a
            d4.i r8 = r10.f14097j
            if (r8 == r7) goto L61
            r.J1 r7 = new r.J1
            r7.<init>(r8, r4, r11, r5)
            r.f2.g(r1, r0, r7)
        L61:
            r10.f14095h = r0
            r10.f14093f = r5
            r10.f14094g = r2
            B0.q r11 = B0.EnumC0041q.f476e
            java.lang.Object r11 = r.f2.i(r3, r11, r10)
            if (r11 != r6) goto L70
        L6f:
            return r6
        L70:
            B0.y r11 = (B0.y) r11
            if (r11 != 0) goto L7d
            r.K1 r11 = new r.K1
            r11.<init>(r4, r5)
            r.f2.g(r1, r0, r11)
            goto L94
        L7d:
            r11.a()
            r.L1 r2 = new r.L1
            r2.<init>(r4, r5)
            r.f2.g(r1, r0, r2)
            long r0 = r11.f483c
            n0.b r11 = new n0.b
            r11.<init>(r0)
            l4.c r0 = r10.f14098k
            r0.f(r11)
        L94:
            X3.y r11 = X3.y.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r.N1.r(java.lang.Object):java.lang.Object");
    }
}
