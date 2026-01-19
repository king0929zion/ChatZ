package S2;

import b4.InterfaceC0905c;
import n.C1316c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class B0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7682h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f7683i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1316c f7684j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f7685k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(C1316c c1316c, C1316c c1316c2, float f6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f7683i = c1316c;
        this.f7684j = c1316c2;
        this.f7685k = f6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((B0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new B0(this.f7683i, this.f7684j, this.f7685k, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (x4.AbstractC1888A.l(r8, r7) == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r1.e(r7, r8) == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r2.e(r7, r8) == r6) goto L20;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f7682h
            n.c r1 = r7.f7684j
            n.c r2 = r7.f7683i
            r3 = 3
            r4 = 2
            r5 = 1
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L27
            if (r0 == r5) goto L23
            if (r0 == r4) goto L1f
            if (r0 != r3) goto L17
            X3.a.e(r8)
            goto L58
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            X3.a.e(r8)
            goto L49
        L23:
            X3.a.e(r8)
            goto L39
        L27:
            X3.a.e(r8)
            java.lang.Float r8 = new java.lang.Float
            r0 = 0
            r8.<init>(r0)
            r7.f7682h = r5
            java.lang.Object r8 = r2.e(r7, r8)
            if (r8 != r6) goto L39
            goto L57
        L39:
            java.lang.Float r8 = new java.lang.Float
            float r0 = r7.f7685k
            r8.<init>(r0)
            r7.f7682h = r4
            java.lang.Object r8 = r1.e(r7, r8)
            if (r8 != r6) goto L49
            goto L57
        L49:
            S2.A0 r8 = new S2.A0
            r0 = 0
            r8.<init>(r2, r1, r0)
            r7.f7682h = r3
            java.lang.Object r8 = x4.AbstractC1888A.l(r8, r7)
            if (r8 != r6) goto L58
        L57:
            return r6
        L58:
            X3.y r8 = X3.y.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.B0.r(java.lang.Object):java.lang.Object");
    }
}
