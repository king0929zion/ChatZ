package r;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class U0 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public Object f14155f;

    /* renamed from: g, reason: collision with root package name */
    public int f14156g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14157h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y3.l f14158i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(Y3.l lVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14158i = lVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((U0) p((InterfaceC0905c) obj2, (t4.i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        U0 u02 = new U0(this.f14158i, interfaceC0905c);
        u02.f14157h = obj;
        return u02;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0035 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f14156g
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            java.lang.Object r0 = r3.f14155f
            java.lang.Object r2 = r3.f14157h
            t4.i r2 = (t4.i) r2
            X3.a.e(r4)
            goto L36
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L19:
            X3.a.e(r4)
            java.lang.Object r4 = r3.f14157h
            t4.i r4 = (t4.i) r4
            r2 = r4
        L21:
            Y3.l r4 = r3.f14158i
            java.lang.Object r4 = r4.b()
            if (r4 == 0) goto L35
            r3.f14157h = r2
            r3.f14155f = r4
            r3.f14156g = r1
            r2.b(r4, r3)
            c4.a r4 = c4.EnumC0927a.f11114c
            return r4
        L35:
            r0 = 0
        L36:
            if (r0 != 0) goto L21
            X3.y r4 = X3.y.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r.U0.r(java.lang.Object):java.lang.Object");
    }
}
