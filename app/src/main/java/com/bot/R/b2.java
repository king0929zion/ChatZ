package r;

import b4.InterfaceC0905c;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class b2 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14249h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14250i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1922e0 f14251j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d4.i f14252k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b2(InterfaceC1922e0 interfaceC1922e0, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14251j = interfaceC1922e0;
        this.f14252k = (d4.i) eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((b2) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d4.i, l4.e] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        b2 b2Var = new b2(this.f14251j, this.f14252k, interfaceC0905c);
        b2Var.f14250i = obj;
        return b2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r4.f14252k.m(r0, r4) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r4.f14251j.Q(r4) == r3) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v5, types: [d4.i, l4.e] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f14249h
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
            java.lang.Object r0 = r4.f14250i
            x4.y r0 = (x4.InterfaceC1942y) r0
            X3.a.e(r5)
            goto L35
        L20:
            X3.a.e(r5)
            java.lang.Object r5 = r4.f14250i
            r0 = r5
            x4.y r0 = (x4.InterfaceC1942y) r0
            r4.f14250i = r0
            r4.f14249h = r2
            x4.e0 r5 = r4.f14251j
            java.lang.Object r5 = r5.Q(r4)
            if (r5 != r3) goto L35
            goto L42
        L35:
            r5 = 0
            r4.f14250i = r5
            r4.f14249h = r1
            d4.i r5 = r4.f14252k
            java.lang.Object r5 = r5.m(r0, r4)
            if (r5 != r3) goto L43
        L42:
            return r3
        L43:
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b2.r(java.lang.Object):java.lang.Object");
    }
}
