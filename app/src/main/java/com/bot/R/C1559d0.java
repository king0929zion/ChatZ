package r;

import b4.InterfaceC0905c;
import l4.InterfaceC1193a;

/* renamed from: r.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1559d0 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f14284f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14285g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l4.c f14286h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f14287i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f14288j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l4.e f14289k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559d0(l4.c cVar, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14286h = cVar;
        this.f14287i = interfaceC1193a;
        this.f14288j = interfaceC1193a2;
        this.f14289k = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1559d0) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1559d0 c1559d0 = new C1559d0(this.f14286h, this.f14287i, this.f14288j, this.f14289k, interfaceC0905c);
        c1559d0.f14285g = obj;
        return c1559d0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r9 == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:9:0x007b, B:11:0x0083, B:13:0x0090, B:15:0x009c, B:17:0x009f, B:20:0x00a2, B:24:0x00a8, B:28:0x0028, B:29:0x0056, B:31:0x005a, B:35:0x0030, B:36:0x0047, B:40:0x003c), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f14284f
            l4.a r1 = r8.f14288j
            r2 = 3
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L34
            if (r0 == r4) goto L2c
            if (r0 == r3) goto L24
            if (r0 != r2) goto L1c
            java.lang.Object r0 = r8.f14285g
            B0.V r0 = (B0.V) r0
            X3.a.e(r9)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L7b
        L19:
            r9 = move-exception
            goto Lae
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r0 = r8.f14285g
            B0.V r0 = (B0.V) r0
            X3.a.e(r9)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L56
        L2c:
            java.lang.Object r0 = r8.f14285g
            B0.V r0 = (B0.V) r0
            X3.a.e(r9)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L47
        L34:
            X3.a.e(r9)
            java.lang.Object r9 = r8.f14285g
            r0 = r9
            B0.V r0 = (B0.V) r0
            r8.f14285g = r0     // Catch: java.util.concurrent.CancellationException -> L19
            r8.f14284f = r4     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = r.f2.c(r0, r8, r3)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 != r5) goto L47
            goto L7a
        L47:
            B0.y r9 = (B0.y) r9     // Catch: java.util.concurrent.CancellationException -> L19
            long r6 = r9.a     // Catch: java.util.concurrent.CancellationException -> L19
            r8.f14285g = r0     // Catch: java.util.concurrent.CancellationException -> L19
            r8.f14284f = r3     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = r.AbstractC1571h0.d(r0, r6, r8)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 != r5) goto L56
            goto L7a
        L56:
            B0.y r9 = (B0.y) r9     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 == 0) goto Lab
            l4.c r3 = r8.f14286h     // Catch: java.util.concurrent.CancellationException -> L19
            long r6 = r9.f483c     // Catch: java.util.concurrent.CancellationException -> L19
            n0.b r4 = new n0.b     // Catch: java.util.concurrent.CancellationException -> L19
            r4.<init>(r6)     // Catch: java.util.concurrent.CancellationException -> L19
            r3.f(r4)     // Catch: java.util.concurrent.CancellationException -> L19
            long r3 = r9.a     // Catch: java.util.concurrent.CancellationException -> L19
            l4.e r9 = r8.f14289k     // Catch: java.util.concurrent.CancellationException -> L19
            Z2.c0 r6 = new Z2.c0     // Catch: java.util.concurrent.CancellationException -> L19
            r7 = 2
            r6.<init>(r7, r9)     // Catch: java.util.concurrent.CancellationException -> L19
            r8.f14285g = r0     // Catch: java.util.concurrent.CancellationException -> L19
            r8.f14284f = r2     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = r.AbstractC1571h0.g(r0, r3, r6, r8)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 != r5) goto L7b
        L7a:
            return r5
        L7b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.util.concurrent.CancellationException -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L19
            if (r9 == 0) goto La8
            B0.X r9 = r0.f419i     // Catch: java.util.concurrent.CancellationException -> L19
            B0.p r9 = r9.f427v     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r9 = r9.a     // Catch: java.util.concurrent.CancellationException -> L19
            int r0 = r9.size()     // Catch: java.util.concurrent.CancellationException -> L19
            r2 = 0
        L8e:
            if (r2 >= r0) goto La2
            java.lang.Object r3 = r9.get(r2)     // Catch: java.util.concurrent.CancellationException -> L19
            B0.y r3 = (B0.y) r3     // Catch: java.util.concurrent.CancellationException -> L19
            boolean r4 = B0.AbstractC0047x.c(r3)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r4 == 0) goto L9f
            r3.a()     // Catch: java.util.concurrent.CancellationException -> L19
        L9f:
            int r2 = r2 + 1
            goto L8e
        La2:
            l4.a r9 = r8.f14287i     // Catch: java.util.concurrent.CancellationException -> L19
            r9.b()     // Catch: java.util.concurrent.CancellationException -> L19
            goto Lab
        La8:
            r1.b()     // Catch: java.util.concurrent.CancellationException -> L19
        Lab:
            X3.y r9 = X3.y.a
            return r9
        Lae:
            r1.b()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1559d0.r(java.lang.Object):java.lang.Object");
    }
}
