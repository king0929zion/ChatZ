package D;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class D0 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public B0.y f748f;

    /* renamed from: g, reason: collision with root package name */
    public int f749g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f750h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H0 f751i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(H0 h02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f751i = h02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((D0) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        D0 d02 = new D0(this.f751i, interfaceC0905c);
        d02.f750h = obj;
        return d02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r13 != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
    
        if (r13 == r4) goto L16;
     */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:6:0x0053). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f749g
            D.H0 r1 = r12.f751i
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L28
            if (r0 == r3) goto L20
            if (r0 != r2) goto L18
            B0.y r0 = r12.f748f
            java.lang.Object r3 = r12.f750h
            B0.V r3 = (B0.V) r3
            X3.a.e(r13)
            goto L53
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r0 = r12.f750h
            B0.V r0 = (B0.V) r0
            X3.a.e(r13)
            goto L3b
        L28:
            X3.a.e(r13)
            java.lang.Object r13 = r12.f750h
            r0 = r13
            B0.V r0 = (B0.V) r0
            r12.f750h = r0
            r12.f749g = r3
            java.lang.Object r13 = r.f2.c(r0, r12, r2)
            if (r13 != r4) goto L3b
            goto L52
        L3b:
            B0.y r13 = (B0.y) r13
            long r5 = r13.f483c
            r1.d()
            r3 = r0
            r0 = r13
        L44:
            r12.f750h = r3
            r12.f748f = r0
            r12.f749g = r2
            B0.q r13 = B0.EnumC0041q.f476e
            java.lang.Object r13 = r3.b(r13, r12)
            if (r13 != r4) goto L53
        L52:
            return r4
        L53:
            B0.p r13 = (B0.C0040p) r13
            java.lang.Object r13 = r13.a
            int r5 = r13.size()
            r6 = 0
        L5c:
            if (r6 >= r5) goto L76
            java.lang.Object r7 = r13.get(r6)
            B0.y r7 = (B0.y) r7
            long r8 = r7.a
            long r10 = r0.a
            boolean r8 = B0.AbstractC0047x.e(r8, r10)
            if (r8 == 0) goto L73
            boolean r7 = r7.f484d
            if (r7 == 0) goto L73
            goto L44
        L73:
            int r6 = r6 + 1
            goto L5c
        L76:
            r1.c()
            X3.y r13 = X3.y.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: D.D0.r(java.lang.Object):java.lang.Object");
    }
}
