package r;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;

/* renamed from: r.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1625z0 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f14523f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0910h f14525h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d4.h f14526i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1625z0(InterfaceC0910h interfaceC0910h, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14525h = interfaceC0910h;
        this.f14526i = (d4.h) eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1625z0) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d4.h, l4.e] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1625z0 c1625z0 = new C1625z0(this.f14525h, this.f14526i, interfaceC0905c);
        c1625z0.f14524g = obj;
        return c1625z0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r10 != r6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r10 == r6) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [B0.V, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [d4.h, l4.e] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:8:0x002a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006e -> B:8:0x002a). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f14523f
            B0.q r1 = B0.EnumC0041q.f477f
            b4.h r2 = r9.f14525h
            r3 = 3
            r4 = 2
            r5 = 1
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L36
            if (r0 == r5) goto L2e
            if (r0 == r4) goto L23
            if (r0 != r3) goto L1b
            java.lang.Object r0 = r9.f14524g
            B0.V r0 = (B0.V) r0
            X3.a.e(r10)
            goto L2a
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r0 = r9.f14524g
            B0.V r0 = (B0.V) r0
            X3.a.e(r10)     // Catch: java.util.concurrent.CancellationException -> L2c
        L2a:
            r10 = r0
            goto L3d
        L2c:
            r10 = move-exception
            goto L60
        L2e:
            java.lang.Object r0 = r9.f14524g
            B0.V r0 = (B0.V) r0
            X3.a.e(r10)     // Catch: java.util.concurrent.CancellationException -> L2c
            goto L51
        L36:
            X3.a.e(r10)
            java.lang.Object r10 = r9.f14524g
            B0.V r10 = (B0.V) r10
        L3d:
            boolean r0 = x4.AbstractC1888A.v(r2)
            if (r0 == 0) goto L72
            d4.h r0 = r9.f14526i     // Catch: java.util.concurrent.CancellationException -> L5c
            r9.f14524g = r10     // Catch: java.util.concurrent.CancellationException -> L5c
            r9.f14523f = r5     // Catch: java.util.concurrent.CancellationException -> L5c
            java.lang.Object r0 = r0.m(r10, r9)     // Catch: java.util.concurrent.CancellationException -> L5c
            if (r0 != r6) goto L50
            goto L70
        L50:
            r0 = r10
        L51:
            r9.f14524g = r0     // Catch: java.util.concurrent.CancellationException -> L2c
            r9.f14523f = r4     // Catch: java.util.concurrent.CancellationException -> L2c
            java.lang.Object r10 = r.AbstractC1573i.g(r0, r1, r9)     // Catch: java.util.concurrent.CancellationException -> L2c
            if (r10 != r6) goto L2a
            goto L70
        L5c:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L60:
            boolean r7 = x4.AbstractC1888A.v(r2)
            if (r7 == 0) goto L71
            r9.f14524g = r0
            r9.f14523f = r3
            java.lang.Object r10 = r.AbstractC1573i.g(r0, r1, r9)
            if (r10 != r6) goto L2a
        L70:
            return r6
        L71:
            throw r10
        L72:
            X3.y r10 = X3.y.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1625z0.r(java.lang.Object):java.lang.Object");
    }
}
