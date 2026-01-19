package T;

import A4.InterfaceC0007h;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public final class Z0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f8054h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f8055i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0910h f8056j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h f8057k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(InterfaceC0910h interfaceC0910h, InterfaceC0007h interfaceC0007h, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8056j = interfaceC0910h;
        this.f8057k = interfaceC0007h;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((Z0) p((InterfaceC0905c) obj2, (C0621n0) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        Z0 z02 = new Z0(this.f8056j, this.f8057k, interfaceC0905c);
        z02.f8055i = obj;
        return z02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4.b(r0, r6) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (x4.AbstractC1888A.H(r3, r0, r6) == r5) goto L17;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f8054h
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L13:
            X3.a.e(r7)
            goto L4a
        L17:
            X3.a.e(r7)
            java.lang.Object r7 = r6.f8055i
            T.n0 r7 = (T.C0621n0) r7
            b4.i r0 = b4.C0911i.f11057c
            b4.h r3 = r6.f8056j
            boolean r0 = m4.AbstractC1276k.b(r3, r0)
            A4.h r4 = r6.f8057k
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L3b
            D1.a r0 = new D1.a
            r1 = 2
            r0.<init>(r7, r1)
            r6.f8054h = r2
            java.lang.Object r7 = r4.b(r0, r6)
            if (r7 != r5) goto L4a
            goto L49
        L3b:
            T.Y0 r0 = new T.Y0
            r2 = 0
            r0.<init>(r4, r7, r2)
            r6.f8054h = r1
            java.lang.Object r7 = x4.AbstractC1888A.H(r3, r0, r6)
            if (r7 != r5) goto L4a
        L49:
            return r5
        L4a:
            X3.y r7 = X3.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T.Z0.r(java.lang.Object):java.lang.Object");
    }
}
