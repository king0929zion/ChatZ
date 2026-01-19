package y;

import b4.InterfaceC0905c;
import n.InterfaceC1351z;
import x4.InterfaceC1942y;

/* renamed from: y.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1983x extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f15944h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f15945i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1948E f15946j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1351z f15947k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r0.b f15948l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1983x(boolean z5, C1948E c1948e, InterfaceC1351z interfaceC1351z, r0.b bVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15945i = z5;
        this.f15946j = c1948e;
        this.f15947k = interfaceC1351z;
        this.f15948l = bVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1983x) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1983x(this.f15945i, this.f15946j, this.f15947k, this.f15948l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r13 == r5) goto L22;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f15944h
            r1 = 0
            r2 = 2
            r3 = 1
            y.E r4 = r12.f15946j
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L22
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L16
            X3.a.e(r13)     // Catch: java.lang.Throwable -> L13
            goto L57
        L13:
            r0 = move-exception
            r13 = r0
            goto L61
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            X3.a.e(r13)     // Catch: java.lang.Throwable -> L13
            goto L3a
        L22:
            X3.a.e(r13)
            boolean r13 = r12.f15945i     // Catch: java.lang.Throwable -> L13
            if (r13 == 0) goto L3a
            n.c r13 = r4.f15771p     // Catch: java.lang.Throwable -> L13
            java.lang.Float r0 = new java.lang.Float     // Catch: java.lang.Throwable -> L13
            r6 = 0
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L13
            r12.f15944h = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r13 = r13.e(r12, r0)     // Catch: java.lang.Throwable -> L13
            if (r13 != r5) goto L3a
            goto L56
        L3a:
            n.c r6 = r4.f15771p     // Catch: java.lang.Throwable -> L13
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L13
            r13 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L13
            n.z r8 = r12.f15947k     // Catch: java.lang.Throwable -> L13
            r0.b r13 = r12.f15948l     // Catch: java.lang.Throwable -> L13
            y.w r9 = new y.w     // Catch: java.lang.Throwable -> L13
            r9.<init>(r13, r4, r1)     // Catch: java.lang.Throwable -> L13
            r12.f15944h = r2     // Catch: java.lang.Throwable -> L13
            r11 = 4
            r10 = r12
            java.lang.Object r13 = n.C1316c.c(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L13
            if (r13 != r5) goto L57
        L56:
            return r5
        L57:
            n.j r13 = (n.C1330j) r13     // Catch: java.lang.Throwable -> L13
            int r13 = y.C1948E.f15756t
            r4.d(r1)
            X3.y r13 = X3.y.a
            return r13
        L61:
            int r0 = y.C1948E.f15756t
            r4.d(r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C1983x.r(java.lang.Object):java.lang.Object");
    }
}
