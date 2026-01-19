package Z2;

import b4.InterfaceC0905c;
import n.C1316c;
import x4.InterfaceC1942y;

/* renamed from: Z2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764m extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10254h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1316c f10255i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f10256j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f10257k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f10258l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0764m(C1316c c1316c, float f6, String str, T.X x5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10255i = c1316c;
        this.f10256j = f6;
        this.f10257k = str;
        this.f10258l = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0764m) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0764m(this.f10255i, this.f10256j, this.f10257k, this.f10258l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (n.C1316c.c(r11.f10255i, r0, r2, null, r11, 12) == r10) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (n.C1316c.c(r11.f10255i, r1, r0, null, r11, 12) == r10) goto L18;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f10254h
            java.lang.String r6 = r11.f10257k
            r1 = 1
            T.X r7 = r11.f10258l
            r2 = 2
            r8 = 0
            if (r0 == 0) goto L1f
            if (r0 == r1) goto L1b
            if (r0 != r2) goto L13
            X3.a.e(r12)
            goto L74
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1b:
            X3.a.e(r12)
            goto L56
        L1f:
            X3.a.e(r12)
            n.c r0 = r11.f10255i
            java.lang.Object r0 = r0.d()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r3 = r11.f10256j
            float r3 = -r3
            float r5 = (float) r2
            float r5 = r3 / r5
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r5 = 6
            r9 = 200(0xc8, float:2.8E-43)
            c4.a r10 = c4.EnumC0927a.f11114c
            if (r0 >= 0) goto L5a
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r3)
            n.D0 r2 = n.AbstractC1318d.s(r9, r5, r8)
            r11.f10254h = r1
            r1 = r0
            n.c r0 = r11.f10255i
            r3 = 0
            r5 = 12
            r4 = r11
            java.lang.Object r0 = n.C1316c.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r10) goto L56
            goto L73
        L56:
            r7.setValue(r6)
            goto L83
        L5a:
            java.lang.Float r1 = new java.lang.Float
            r0 = 0
            r1.<init>(r0)
            n.D0 r0 = n.AbstractC1318d.s(r9, r5, r8)
            r11.f10254h = r2
            r2 = r0
            n.c r0 = r11.f10255i
            r3 = 0
            r5 = 12
            r4 = r11
            java.lang.Object r0 = n.C1316c.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r10) goto L74
        L73:
            return r10
        L74:
            java.lang.Object r0 = r7.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m4.AbstractC1276k.b(r0, r6)
            if (r0 == 0) goto L83
            r7.setValue(r8)
        L83:
            X3.y r0 = X3.y.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.C0764m.r(java.lang.Object):java.lang.Object");
    }
}
