package a3;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class u extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10696h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f10697i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f10698j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, InterfaceC0905c interfaceC0905c, String str) {
        super(2, interfaceC0905c);
        this.f10697i = wVar;
        this.f10698j = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((u) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new u(this.f10697i, interfaceC0905c, this.f10698j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r4.z(r6) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        if (r7 == r5) goto L23;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f10696h
            r1 = 0
            r2 = 2
            r3 = 1
            a3.w r4 = r6.f10697i
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L13
            X3.a.e(r7)
            goto L68
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            X3.a.e(r7)
            goto L3a
        L1f:
            X3.a.e(r7)
            r7 = 0
            r4.f10744i0 = r7
            Y2.W r7 = r4.f10729b
            r6.f10696h = r3
            r7.getClass()
            Y2.g r0 = new Y2.g
            java.lang.String r3 = r6.f10698j
            r0.<init>(r7, r3, r1)
            java.lang.Object r7 = r7.c(r6, r0)
            if (r7 != r5) goto L3a
            goto L67
        L3a:
            D2.i r7 = (D2.i) r7
            boolean r0 = r7 instanceof D2.h
            if (r0 == 0) goto L4a
            D2.h r7 = (D2.h) r7
            java.lang.Object r7 = r7.a
            com.bot.core.model.LLMSetting r7 = (com.bot.core.model.LLMSetting) r7
            r4.E(r7)
            goto L5f
        L4a:
            boolean r0 = r7 instanceof D2.f
            if (r0 == 0) goto L5b
            A4.g0 r0 = r4.f10720S
            D2.f r7 = (D2.f) r7
            java.lang.String r7 = r7.a
            r0.getClass()
            r0.l(r1, r7)
            goto L5f
        L5b:
            boolean r7 = r7 instanceof D2.g
            if (r7 == 0) goto L6b
        L5f:
            r6.f10696h = r2
            java.lang.Object r7 = r4.z(r6)
            if (r7 != r5) goto L68
        L67:
            return r5
        L68:
            X3.y r7 = X3.y.a
            return r7
        L6b:
            N0.e r7 = new N0.e
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.u.r(java.lang.Object):java.lang.Object");
    }
}
