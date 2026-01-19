package a3;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class s extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f10693i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10693i = wVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((s) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new s(this.f10693i, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r4.z(r6) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
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
            int r0 = r6.f10692h
            r1 = 0
            r2 = 2
            r3 = 1
            a3.w r4 = r6.f10693i
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L13
            X3.a.e(r7)
            goto L64
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            X3.a.e(r7)
            goto L36
        L1f:
            X3.a.e(r7)
            Y2.W r7 = r4.f10729b
            r6.f10692h = r3
            r7.getClass()
            Y2.T r0 = new Y2.T
            r3 = 0
            r0.<init>(r7, r1, r3)
            java.lang.Object r7 = r7.c(r6, r0)
            if (r7 != r5) goto L36
            goto L63
        L36:
            D2.i r7 = (D2.i) r7
            boolean r0 = r7 instanceof D2.h
            if (r0 == 0) goto L46
            D2.h r7 = (D2.h) r7
            java.lang.Object r7 = r7.a
            com.bot.core.model.LLMSetting r7 = (com.bot.core.model.LLMSetting) r7
            r4.E(r7)
            goto L5b
        L46:
            boolean r0 = r7 instanceof D2.f
            if (r0 == 0) goto L57
            A4.g0 r0 = r4.f10720S
            D2.f r7 = (D2.f) r7
            java.lang.String r7 = r7.a
            r0.getClass()
            r0.l(r1, r7)
            goto L5b
        L57:
            boolean r7 = r7 instanceof D2.g
            if (r7 == 0) goto L67
        L5b:
            r6.f10692h = r2
            java.lang.Object r7 = r4.z(r6)
            if (r7 != r5) goto L64
        L63:
            return r5
        L64:
            X3.y r7 = X3.y.a
            return r7
        L67:
            N0.e r7 = new N0.e
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.s.r(java.lang.Object):java.lang.Object");
    }
}
