package O;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: O.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339x extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public H4.a f4239h;

    /* renamed from: i, reason: collision with root package name */
    public C0341z f4240i;

    /* renamed from: j, reason: collision with root package name */
    public int f4241j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0341z f4242k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d4.i f4243l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0339x(C0341z c0341z, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4242k = c0341z;
        this.f4243l = (d4.i) eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0339x) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d4.i, l4.e] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0339x(this.f4242k, this.f4243l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003f, code lost:
    
        if (r10.d(r9) == r5) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [H4.a] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [H4.a] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [d4.i, l4.e] */
    /* JADX WARN: Type inference failed for: r3v7, types: [H4.a] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f4241j
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L25
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L14
            X3.a.e(r10)
            return r10
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            H4.a r0 = r9.f4239h
            X3.a.e(r10)     // Catch: java.lang.Throwable -> L22
            goto L69
        L22:
            r10 = move-exception
            goto L87
        L25:
            O.z r0 = r9.f4240i
            H4.a r3 = r9.f4239h
            X3.a.e(r10)
            r10 = r3
            goto L42
        L2e:
            X3.a.e(r10)
            O.z r0 = r9.f4242k
            H4.c r10 = r0.f4259e
            r9.f4239h = r10
            r9.f4240i = r0
            r9.f4241j = r3
            java.lang.Object r3 = r10.d(r9)
            if (r3 != r5) goto L42
            goto L85
        L42:
            android.view.textclassifier.TextClassifier r3 = r0.f4260f     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L52
            boolean r6 = I.u.x(r3)     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L6d
            goto L52
        L4d:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L87
        L52:
            O.w r3 = new O.w     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L4d
            r9.f4239h = r10     // Catch: java.lang.Throwable -> L4d
            r9.f4240i = r4     // Catch: java.lang.Throwable -> L4d
            r9.f4241j = r2     // Catch: java.lang.Throwable -> L4d
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r0 = x4.AbstractC1888A.I(r6, r3, r9)     // Catch: java.lang.Throwable -> L4d
            if (r0 != r5) goto L66
            goto L85
        L66:
            r8 = r0
            r0 = r10
            r10 = r8
        L69:
            r3 = r10
            android.view.textclassifier.TextClassifier r3 = (android.view.textclassifier.TextClassifier) r3     // Catch: java.lang.Throwable -> L22
            r10 = r0
        L6d:
            r10.c(r4)
            O.v r10 = new O.v
            d4.i r0 = r9.f4243l
            r10.<init>(r3, r0, r4)
            r9.f4239h = r4
            r9.f4240i = r4
            r9.f4241j = r1
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Object r10 = x4.AbstractC1888A.I(r0, r10, r9)
            if (r10 != r5) goto L86
        L85:
            return r5
        L86:
            return r10
        L87:
            r0.c(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0339x.r(java.lang.Object):java.lang.Object");
    }
}
