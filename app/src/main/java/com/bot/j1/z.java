package J1;

import b4.InterfaceC0905c;
import n.C1321e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class z extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f2903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2904i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1321e0 f2905j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I1.j f2906k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(float f6, C1321e0 c1321e0, I1.j jVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2904i = f6;
        this.f2905j = c1321e0;
        this.f2906k = jVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((z) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new z(this.f2904i, this.f2905j, this.f2906k, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (m4.AbstractC1276k.b(r2.f13134b.getValue(), r3) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r9 != r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        if (r2.A(r4, r2.f13134b.getValue(), r8) == r7) goto L29;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f2903h
            X3.y r1 = X3.y.a
            n.e0 r2 = r8.f2905j
            r3 = 0
            float r4 = r8.f2904i
            r5 = 2
            r6 = 1
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L23
            if (r0 == r6) goto L1f
            if (r0 != r5) goto L17
            X3.a.e(r9)
            return r1
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            X3.a.e(r9)
            goto L39
        L23:
            X3.a.e(r9)
            int r9 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r9 <= 0) goto L39
            r8.f2903h = r6
            T.g0 r9 = r2.f13134b
            java.lang.Object r9 = r9.getValue()
            java.lang.Object r9 = r2.A(r4, r9, r8)
            if (r9 != r7) goto L39
            goto L70
        L39:
            int r9 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r9 != 0) goto L71
            r8.f2903h = r5
            n.y0 r9 = r2.f13137e
            if (r9 != 0) goto L45
        L43:
            r9 = r1
            goto L6e
        L45:
            T.g0 r0 = r2.f13135c
            java.lang.Object r0 = r0.getValue()
            I1.j r3 = r8.f2906k
            boolean r0 = m4.AbstractC1276k.b(r0, r3)
            if (r0 == 0) goto L60
            T.g0 r0 = r2.f13134b
            java.lang.Object r0 = r0.getValue()
            boolean r0 = m4.AbstractC1276k.b(r0, r3)
            if (r0 == 0) goto L60
            goto L43
        L60:
            n.Q r0 = r2.f13143k
            n.X r4 = new n.X
            r5 = 0
            r4.<init>(r2, r3, r9, r5)
            java.lang.Object r9 = n.C1308Q.a(r0, r4, r8)
            if (r9 != r7) goto L43
        L6e:
            if (r9 != r7) goto L71
        L70:
            return r7
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.z.r(java.lang.Object):java.lang.Object");
    }
}
