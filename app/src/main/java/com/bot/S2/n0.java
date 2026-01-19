package S2;

import b4.InterfaceC0905c;
import n.C1316c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class n0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7832h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f7833i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(C1316c c1316c, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f7833i = c1316c;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((n0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new n0(this.f7833i, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (n.C1316c.c(r10.f7833i, r5, r6, null, r10, 12) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r10.f7833i.e(r10, r11) == r3) goto L15;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f7832h
            r1 = 1
            r2 = 2
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L18
            if (r0 != r2) goto L10
            X3.a.e(r11)
            goto L4e
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            X3.a.e(r11)
            goto L30
        L1c:
            X3.a.e(r11)
            java.lang.Float r11 = new java.lang.Float
            r0 = 0
            r11.<init>(r0)
            r10.f7832h = r1
            n.c r0 = r10.f7833i
            java.lang.Object r11 = r0.e(r10, r11)
            if (r11 != r3) goto L30
            goto L4d
        L30:
            java.lang.Float r5 = new java.lang.Float
            r11 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r11)
            r11 = 240(0xf0, float:3.36E-43)
            n.t r0 = n.AbstractC1350y.f13276b
            n.D0 r6 = n.AbstractC1318d.s(r11, r2, r0)
            r10.f7832h = r2
            n.c r4 = r10.f7833i
            r7 = 0
            r9 = 12
            r8 = r10
            java.lang.Object r11 = n.C1316c.c(r4, r5, r6, r7, r8, r9)
            if (r11 != r3) goto L4e
        L4d:
            return r3
        L4e:
            X3.y r11 = X3.y.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.n0.r(java.lang.Object):java.lang.Object");
    }
}
