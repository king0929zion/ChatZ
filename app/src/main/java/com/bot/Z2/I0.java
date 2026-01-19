package Z2;

import a3.C0808F;
import b4.InterfaceC0905c;
import l4.InterfaceC1193a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class I0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10001h;

    /* renamed from: i, reason: collision with root package name */
    public int f10002i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f10003j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0808F f10004k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10005l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f10006m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f10007n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f10008o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f10009p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f10010q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10011r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10012s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f10013t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f10014u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f10015v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ T.X f10016w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ T.X f10017x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(boolean z5, C0808F c0808f, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z6, InterfaceC1193a interfaceC1193a, T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10003j = z5;
        this.f10004k = c0808f;
        this.f10005l = str;
        this.f10006m = str2;
        this.f10007n = str3;
        this.f10008o = str4;
        this.f10009p = str5;
        this.f10010q = str6;
        this.f10011r = str7;
        this.f10012s = str8;
        this.f10013t = str9;
        this.f10014u = z6;
        this.f10015v = interfaceC1193a;
        this.f10016w = x5;
        this.f10017x = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((I0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new I0(this.f10003j, this.f10004k, this.f10005l, this.f10006m, this.f10007n, this.f10008o, this.f10009p, this.f10010q, this.f10011r, this.f10012s, this.f10013t, this.f10014u, this.f10015v, this.f10016w, this.f10017x, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r1 == r14) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r0 == r14) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0085 A[ADDED_TO_REGION] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r16) {
        /*
            r15 = this;
            int r0 = r15.f10002i
            r12 = 2
            r13 = 1
            c4.a r14 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L22
            if (r0 == r13) goto L1c
            if (r0 != r12) goto L14
            int r0 = r15.f10001h
            X3.a.e(r16)
            r1 = r16
            goto L78
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1c:
            X3.a.e(r16)
            r0 = r16
            goto L4d
        L22:
            X3.a.e(r16)
            boolean r0 = r15.f10003j
            if (r0 == 0) goto L54
            T.X r0 = r15.f10016w
            boolean r10 = Z2.AbstractC0783w.D(r0)
            r15.f10002i = r13
            a3.F r0 = r15.f10004k
            java.lang.String r1 = r15.f10005l
            java.lang.String r2 = r15.f10006m
            java.lang.String r3 = r15.f10007n
            java.lang.String r4 = r15.f10008o
            java.lang.String r5 = r15.f10009p
            java.lang.String r6 = r15.f10010q
            java.lang.String r7 = r15.f10011r
            java.lang.String r8 = r15.f10012s
            java.lang.String r9 = r15.f10013t
            r11 = r15
            java.lang.Object r0 = r0.k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r14) goto L4d
            goto L77
        L4d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L55
        L54:
            r0 = r13
        L55:
            boolean r1 = r15.f10014u
            if (r0 == 0) goto L7f
            if (r1 == 0) goto L7f
            T.X r1 = r15.f10017x
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = Y3.m.J0(r1)
            r15.f10001h = r0
            r15.f10002i = r12
            a3.F r2 = r15.f10004k
            java.lang.String r3 = r15.f10005l
            java.lang.Object r1 = r2.h(r3, r1, r15)
            if (r1 != r14) goto L78
        L77:
            return r14
        L78:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r13 = r1.booleanValue()
            goto L83
        L7f:
            if (r1 != 0) goto L82
            goto L83
        L82:
            r13 = 0
        L83:
            if (r0 == 0) goto L8c
            if (r13 == 0) goto L8c
            l4.a r0 = r15.f10015v
            r0.b()
        L8c:
            X3.y r0 = X3.y.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.I0.r(java.lang.Object):java.lang.Object");
    }
}
