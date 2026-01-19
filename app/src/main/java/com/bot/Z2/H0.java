package Z2;

import a3.C0808F;
import b4.InterfaceC0905c;
import l4.InterfaceC1193a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class H0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0808F f9981i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f9982j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9983k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f9984l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9985m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9986n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9987o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f9988p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f9989q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f9990r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ T.X f9991s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T.X f9992t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ T.X f9993u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(C0808F c0808f, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InterfaceC1193a interfaceC1193a, T.X x5, T.X x6, T.X x7, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9981i = c0808f;
        this.f9982j = str;
        this.f9983k = str2;
        this.f9984l = str3;
        this.f9985m = str4;
        this.f9986n = str5;
        this.f9987o = str6;
        this.f9988p = str7;
        this.f9989q = str8;
        this.f9990r = interfaceC1193a;
        this.f9991s = x5;
        this.f9992t = x6;
        this.f9993u = x7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((H0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new H0(this.f9981i, this.f9982j, this.f9983k, this.f9984l, this.f9985m, this.f9986n, this.f9987o, this.f9988p, this.f9989q, this.f9990r, this.f9991s, this.f9992t, this.f9993u, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r13.f9981i.h(r0, r1, r13) == r12) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r0 == r12) goto L19;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f9980h
            r11 = 2
            r1 = 1
            c4.a r12 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L1d
            if (r0 == r1) goto L18
            if (r0 != r11) goto L10
            X3.a.e(r14)
            goto L6d
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L18:
            X3.a.e(r14)
            r0 = r14
            goto L42
        L1d:
            X3.a.e(r14)
            T.X r0 = r13.f9991s
            boolean r9 = Z2.AbstractC0783w.D(r0)
            r13.f9980h = r1
            a3.F r0 = r13.f9981i
            java.lang.String r1 = r13.f9982j
            java.lang.String r2 = r13.f9983k
            java.lang.String r3 = r13.f9984l
            java.lang.String r4 = r13.f9985m
            java.lang.String r5 = r13.f9986n
            java.lang.String r6 = r13.f9987o
            java.lang.String r7 = r13.f9988p
            java.lang.String r8 = r13.f9989q
            r10 = r13
            java.lang.Object r0 = r0.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r12) goto L42
            goto L6c
        L42:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L72
            T.X r1 = r13.f9992t
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L6d
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = Y3.m.J0(r1)
            r13.f9980h = r11
            a3.F r2 = r13.f9981i
            java.lang.Object r0 = r2.h(r0, r1, r13)
            if (r0 != r12) goto L6d
        L6c:
            return r12
        L6d:
            l4.a r0 = r13.f9990r
            r0.b()
        L72:
            T.X r0 = r13.f9993u
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            X3.y r0 = X3.y.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.H0.r(java.lang.Object):java.lang.Object");
    }
}
