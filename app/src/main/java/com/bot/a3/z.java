package a3;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class z extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10769h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0808F f10770i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f10771j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f10772k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10773l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f10774m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f10775n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f10776o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f10777p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0808F c0808f, String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10770i = c0808f;
        this.f10771j = str;
        this.f10772k = str2;
        this.f10773l = str3;
        this.f10774m = str4;
        this.f10775n = str5;
        this.f10776o = str6;
        this.f10777p = str7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((z) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new z(this.f10770i, this.f10771j, this.f10772k, this.f10773l, this.f10774m, this.f10775n, this.f10776o, this.f10777p, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r0 == r12) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002b, code lost:
    
        if (x4.AbstractC1888A.m(400, r13) == r12) goto L15;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f10769h
            r1 = 2
            r9 = 1
            r10 = 0
            a3.F r11 = r13.f10770i
            c4.a r12 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L20
            if (r0 == r9) goto L1c
            if (r0 != r1) goto L14
            X3.a.e(r14)
            r0 = r14
            goto L5a
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1c:
            X3.a.e(r14)
            goto L2e
        L20:
            X3.a.e(r14)
            r13.f10769h = r9
            r2 = 400(0x190, double:1.976E-321)
            java.lang.Object r0 = x4.AbstractC1888A.m(r2, r13)
            if (r0 != r12) goto L2e
            goto L59
        L2e:
            A4.g0 r0 = r11.f10617m
            java.lang.Object r2 = r0.getValue()
            a3.G r2 = (a3.C0809G) r2
            a3.G r2 = a3.C0809G.a(r2, r9, r10)
            r0.getClass()
            r0.l(r10, r2)
            Y2.L r0 = r11.f10607c
            r13.f10769h = r1
            java.lang.String r1 = r13.f10771j
            java.lang.String r2 = r13.f10772k
            java.lang.String r3 = r13.f10773l
            java.lang.String r4 = r13.f10774m
            java.lang.String r5 = r13.f10775n
            java.lang.String r6 = r13.f10776o
            java.lang.String r7 = r13.f10777p
            r8 = r13
            java.lang.Object r0 = r0.j(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r12) goto L5a
        L59:
            return r12
        L5a:
            D2.i r0 = (D2.i) r0
            boolean r1 = r0 instanceof D2.h
            r2 = 0
            if (r1 == 0) goto L75
            A4.g0 r1 = r11.f10617m
            a3.G r3 = new a3.G
            D2.h r0 = (D2.h) r0
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            r3.<init>(r10, r0, r2)
            r1.getClass()
            r1.l(r10, r3)
            goto Lb0
        L75:
            boolean r1 = r0 instanceof D2.f
            if (r1 == 0) goto L9a
            A4.g0 r1 = r11.f10617m
            java.lang.Object r3 = r1.getValue()
            a3.G r3 = (a3.C0809G) r3
            D2.f r0 = (D2.f) r0
            java.lang.String r4 = r0.a
            a3.G r2 = a3.C0809G.a(r3, r2, r4)
            r1.getClass()
            r1.l(r10, r2)
            A4.g0 r1 = r11.f10612h
            java.lang.String r0 = r0.a
            r1.getClass()
            r1.l(r10, r0)
            goto Lb0
        L9a:
            boolean r0 = r0 instanceof D2.g
            if (r0 == 0) goto Lb3
            A4.g0 r0 = r11.f10617m
            java.lang.Object r1 = r0.getValue()
            a3.G r1 = (a3.C0809G) r1
            a3.G r1 = a3.C0809G.a(r1, r9, r10)
            r0.getClass()
            r0.l(r10, r1)
        Lb0:
            X3.y r0 = X3.y.a
            return r0
        Lb3:
            N0.e r0 = new N0.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.z.r(java.lang.Object):java.lang.Object");
    }
}
