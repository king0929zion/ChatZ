package N1;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class O extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public EnumC0289k[] f3695h;

    /* renamed from: i, reason: collision with root package name */
    public Q f3696i;

    /* renamed from: j, reason: collision with root package name */
    public B f3697j;

    /* renamed from: k, reason: collision with root package name */
    public int f3698k;

    /* renamed from: l, reason: collision with root package name */
    public int f3699l;

    /* renamed from: m, reason: collision with root package name */
    public int f3700m;

    /* renamed from: n, reason: collision with root package name */
    public int f3701n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ EnumC0289k[] f3702o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Q f3703p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B f3704q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(EnumC0289k[] enumC0289kArr, Q q3, B b5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3702o = enumC0289kArr;
        this.f3703p = q3;
        this.f3704q = b5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((O) p((InterfaceC0905c) obj2, (P1.o) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new O(this.f3702o, this.f3703p, this.f3704q, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (N1.Q.c(r6, r5, r11, r10) == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:10:0x0076). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f3701n
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 == r2) goto La
            if (r0 != r1) goto L1a
        La:
            int r0 = r10.f3700m
            int r3 = r10.f3699l
            int r4 = r10.f3698k
            N1.B r5 = r10.f3697j
            N1.Q r6 = r10.f3696i
            N1.k[] r7 = r10.f3695h
            X3.a.e(r11)
            goto L58
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            X3.a.e(r11)
            N1.k[] r11 = r10.f3702o
            int r0 = r11.length
            r3 = 0
            N1.Q r4 = r10.f3703p
            N1.B r5 = r10.f3704q
            r7 = r11
            r11 = r3
            r6 = r4
        L30:
            if (r3 >= r0) goto L78
            r4 = r7[r3]
            int r8 = r11 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L75
            c4.a r9 = c4.EnumC0927a.f11114c
            if (r4 == r2) goto L60
            if (r4 != r1) goto L5a
            r10.f3695h = r7
            r10.f3696i = r6
            r10.f3697j = r5
            r10.f3698k = r8
            r10.f3699l = r3
            r10.f3700m = r0
            r10.f3701n = r1
            java.lang.Object r11 = N1.Q.d(r6, r5, r11, r10)
            if (r11 != r9) goto L57
            goto L74
        L57:
            r4 = r8
        L58:
            r11 = r4
            goto L76
        L5a:
            N0.e r11 = new N0.e
            r11.<init>()
            throw r11
        L60:
            r10.f3695h = r7
            r10.f3696i = r6
            r10.f3697j = r5
            r10.f3698k = r8
            r10.f3699l = r3
            r10.f3700m = r0
            r10.f3701n = r2
            java.lang.Object r11 = N1.Q.c(r6, r5, r11, r10)
            if (r11 != r9) goto L57
        L74:
            return r9
        L75:
            r11 = r8
        L76:
            int r3 = r3 + r2
            goto L30
        L78:
            X3.y r11 = X3.y.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.O.r(java.lang.Object):java.lang.Object");
    }
}
