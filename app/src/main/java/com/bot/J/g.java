package J;

import X3.y;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class g extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f2785h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f2786i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2787j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ K.f f2788k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f2789l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, long j3, K.f fVar, f fVar2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2786i = hVar;
        this.f2787j = j3;
        this.f2788k = fVar;
        this.f2789l = fVar2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((g) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new g(this.f2786i, this.f2787j, this.f2788k, this.f2789l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r6.f2788k.a(r6.f2789l, r6) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r7.m(r0, r6) == r3) goto L17;
     */
    /* JADX WARN: Type inference failed for: r7v2, types: [d4.i, l4.e] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f2785h
            r1 = 2
            r2 = 1
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            X3.a.e(r7)
            goto L42
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            X3.a.e(r7)
            goto L35
        L1c:
            X3.a.e(r7)
            J.h r7 = r6.f2786i
            d4.i r7 = r7.f2790t
            if (r7 == 0) goto L35
            n0.b r0 = new n0.b
            long r4 = r6.f2787j
            r0.<init>(r4)
            r6.f2785h = r2
            java.lang.Object r7 = r7.m(r0, r6)
            if (r7 != r3) goto L35
            goto L41
        L35:
            r6.f2785h = r1
            K.f r7 = r6.f2788k
            J.f r0 = r6.f2789l
            java.lang.Object r7 = r7.a(r0, r6)
            if (r7 != r3) goto L42
        L41:
            return r3
        L42:
            X3.y r7 = X3.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: J.g.r(java.lang.Object):java.lang.Object");
    }
}
