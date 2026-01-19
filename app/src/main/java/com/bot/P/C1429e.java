package p;

import b4.InterfaceC0905c;
import t.C1682j;
import t.C1684l;
import x4.InterfaceC1942y;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C1684l f13691h;

    /* renamed from: i, reason: collision with root package name */
    public int f13692i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f13693j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f13694k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1682j f13695l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1429e(r rVar, long j3, C1682j c1682j, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13693j = rVar;
        this.f13694k = j3;
        this.f13695l = c1682j;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1429e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1429e(this.f13693j, this.f13694k, this.f13695l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r7.f13695l.a(r0, r7) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (x4.AbstractC1888A.m(r5, r7) == r4) goto L17;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f13692i
            p.r r1 = r7.f13693j
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            t.l r0 = r7.f13691h
            X3.a.e(r8)
            goto L48
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            X3.a.e(r8)
            goto L34
        L20:
            X3.a.e(r8)
            boolean r8 = r1.R0()
            if (r8 == 0) goto L34
            long r5 = p.K.a
            r7.f13692i = r3
            java.lang.Object r8 = x4.AbstractC1888A.m(r5, r7)
            if (r8 != r4) goto L34
            goto L47
        L34:
            t.l r0 = new t.l
            long r5 = r7.f13694k
            r0.<init>(r5)
            r7.f13691h = r0
            r7.f13692i = r2
            t.j r8 = r7.f13695l
            java.lang.Object r8 = r8.a(r0, r7)
            if (r8 != r4) goto L48
        L47:
            return r4
        L48:
            r1.f13771E = r0
            X3.y r8 = X3.y.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1429e.r(java.lang.Object):java.lang.Object");
    }
}
