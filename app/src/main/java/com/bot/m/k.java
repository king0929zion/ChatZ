package M;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class k extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3170h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1922e0 f3171i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f3172j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC1922e0 interfaceC1922e0, m mVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3171i = interfaceC1922e0;
        this.f3172j = mVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((k) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new k(this.f3171i, this.f3172j, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (x4.AbstractC1888A.m(500, r11) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r12 == r10) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:9:0x0077). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f3170h
            r1 = 0
            r2 = 500(0x1f4, double:2.47E-321)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            M.m r9 = r11.f3172j
            c4.a r10 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L38
            if (r0 == r8) goto L34
            if (r0 == r7) goto L2b
            if (r0 == r6) goto L27
            if (r0 != r5) goto L1f
            X3.a.e(r12)     // Catch: java.lang.Throwable -> L1d
            goto L77
        L1d:
            r12 = move-exception
            goto L7d
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            X3.a.e(r12)     // Catch: java.lang.Throwable -> L1d
            goto L69
        L2b:
            X3.a.e(r12)     // Catch: java.lang.Throwable -> L1d
            N0.e r12 = new N0.e     // Catch: java.lang.Throwable -> L1d
            r12.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r12     // Catch: java.lang.Throwable -> L1d
        L34:
            X3.a.e(r12)
            goto L51
        L38:
            X3.a.e(r12)
            x4.e0 r12 = r11.f3171i
            if (r12 == 0) goto L51
            r11.f3170h = r8
            r0 = 0
            r12.f(r0)
            java.lang.Object r12 = r12.Q(r11)
            if (r12 != r10) goto L4c
            goto L4e
        L4c:
            X3.y r12 = X3.y.a
        L4e:
            if (r12 != r10) goto L51
            goto L76
        L51:
            T.c0 r12 = r9.f3176c     // Catch: java.lang.Throwable -> L1d
            r12.h(r4)     // Catch: java.lang.Throwable -> L1d
            boolean r12 = r9.a     // Catch: java.lang.Throwable -> L1d
            if (r12 != 0) goto L60
            r11.f3170h = r7     // Catch: java.lang.Throwable -> L1d
            x4.AbstractC1888A.h(r11)     // Catch: java.lang.Throwable -> L1d
            return r10
        L60:
            r11.f3170h = r6     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r12 = x4.AbstractC1888A.m(r2, r11)     // Catch: java.lang.Throwable -> L1d
            if (r12 != r10) goto L69
            goto L76
        L69:
            T.c0 r12 = r9.f3176c     // Catch: java.lang.Throwable -> L1d
            r12.h(r1)     // Catch: java.lang.Throwable -> L1d
            r11.f3170h = r5     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r12 = x4.AbstractC1888A.m(r2, r11)     // Catch: java.lang.Throwable -> L1d
            if (r12 != r10) goto L77
        L76:
            return r10
        L77:
            T.c0 r12 = r9.f3176c     // Catch: java.lang.Throwable -> L1d
            r12.h(r4)     // Catch: java.lang.Throwable -> L1d
            goto L60
        L7d:
            T.c0 r0 = r9.f3176c
            r0.h(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: M.k.r(java.lang.Object):java.lang.Object");
    }
}
