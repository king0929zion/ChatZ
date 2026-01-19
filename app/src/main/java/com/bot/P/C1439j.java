package p;

import b4.InterfaceC0905c;
import t.C1682j;
import t.C1684l;
import x4.InterfaceC1942y;

/* renamed from: p.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1439j extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1682j f13729i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1684l f13730j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f13731k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f13732l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1439j(C1682j c1682j, C1684l c1684l, boolean z5, r rVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13729i = c1682j;
        this.f13730j = c1684l;
        this.f13731k = z5;
        this.f13732l = rVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1439j) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1439j(this.f13729i, this.f13730j, this.f13731k, this.f13732l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r7.f13729i.a(r3, r7) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (x4.AbstractC1888A.m(r5, r7) == r4) goto L15;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f13728h
            r1 = 2
            r2 = 1
            t.l r3 = r7.f13730j
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            X3.a.e(r8)
            goto L37
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            X3.a.e(r8)
            goto L2c
        L1e:
            X3.a.e(r8)
            long r5 = p.K.a
            r7.f13728h = r2
            java.lang.Object r8 = x4.AbstractC1888A.m(r5, r7)
            if (r8 != r4) goto L2c
            goto L36
        L2c:
            r7.f13728h = r1
            t.j r8 = r7.f13729i
            java.lang.Object r8 = r8.a(r3, r7)
            if (r8 != r4) goto L37
        L36:
            return r4
        L37:
            boolean r8 = r7.f13731k
            p.r r0 = r7.f13732l
            if (r8 == 0) goto L40
            r0.f13775I = r3
            goto L42
        L40:
            r0.f13771E = r3
        L42:
            X3.y r8 = X3.y.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1439j.r(java.lang.Object):java.lang.Object");
    }
}
