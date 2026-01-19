package J1;

import b4.InterfaceC0905c;
import n.C1321e0;
import n.y0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class A extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f2810h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2811i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1321e0 f2812j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I1.j f2813k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y0 f2814l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C1321e0 c1321e0, I1.j jVar, y0 y0Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2812j = c1321e0;
        this.f2813k = jVar;
        this.f2814l = y0Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((A) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        A a = new A(this.f2812j, this.f2813k, this.f2814l, interfaceC0905c);
        a.f2811i = obj;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[RETURN] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r16) {
        /*
            r15 = this;
            int r0 = r15.f2810h
            X3.y r6 = X3.y.a
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            X3.a.e(r16)
            return r6
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L18:
            X3.a.e(r16)
            return r6
        L1c:
            X3.a.e(r16)
            java.lang.Object r0 = r15.f2811i
            x4.y r0 = (x4.InterfaceC1942y) r0
            n.e0 r3 = r15.f2812j
            T.g0 r5 = r3.f13135c
            T.c0 r7 = r3.f13140h
            java.lang.Object r5 = r5.getValue()
            I1.j r8 = r15.f2813k
            boolean r5 = m4.AbstractC1276k.b(r5, r8)
            r9 = 0
            c4.a r10 = c4.EnumC0927a.f11114c
            if (r5 != 0) goto L51
            r15.f2810h = r2
            n.y0 r0 = r3.f13137e
            if (r0 != 0) goto L3f
            goto L4d
        L3f:
            n.Q r1 = r3.f13143k
            n.X r2 = new n.X
            r2.<init>(r0, r3, r8, r9)
            java.lang.Object r0 = n.C1308Q.a(r1, r2, r15)
            if (r0 != r10) goto L4d
            goto L4e
        L4d:
            r0 = r6
        L4e:
            if (r0 != r10) goto L89
            goto L88
        L51:
            n.y0 r2 = r15.f2814l
            T.E r2 = r2.f13288l
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            long r11 = r2.longValue()
            r2 = 1000000(0xf4240, float:1.401298E-39)
            long r13 = (long) r2
            long r11 = r11 / r13
            float r2 = r7.g()
            float r5 = r7.g()
            float r7 = (float) r11
            float r5 = r5 * r7
            int r5 = (int) r5
            r7 = 6
            n.D0 r5 = n.AbstractC1318d.s(r5, r7, r9)
            D.L r7 = new D.L
            r9 = 3
            r7.<init>(r0, r3, r8, r9)
            r15.f2810h = r1
            r1 = 0
            r0 = r2
            r2 = r5
            r5 = 4
            r4 = r15
            r3 = r7
            java.lang.Object r0 = n.AbstractC1318d.e(r0, r1, r2, r3, r4, r5)
            if (r0 != r10) goto L89
        L88:
            return r10
        L89:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.A.r(java.lang.Object):java.lang.Object");
    }
}
