package z;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class o extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f16137h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2004b f16138i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C2004b c2004b, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f16138i = c2004b;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((o) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new o(this.f16138i, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r6 = r6.f(r0.f16172b.g() - 1, n.AbstractC1318d.r(S.l.f7374V, S.l.f7374V, null, 7), r5);
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f16137h
            X3.y r1 = X3.y.a
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Ld
            X3.a.e(r6)
            return r1
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            X3.a.e(r6)
            z.b r6 = r5.f16138i
            z.v r0 = r6.f16051d
            r5.f16137h = r2
            float r3 = z.H.a
            T.d0 r3 = r0.f16172b
            int r3 = r3.g()
            int r3 = r3 - r2
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r3 < 0) goto L39
            T.d0 r0 = r0.f16172b
            int r0 = r0.g()
            int r0 = r0 - r2
            java.lang.Object r6 = z.E.g(r6, r0, r5)
            if (r6 != r4) goto L39
            goto L3a
        L39:
            r6 = r1
        L3a:
            if (r6 != r4) goto L3d
            return r4
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.o.r(java.lang.Object):java.lang.Object");
    }
}
