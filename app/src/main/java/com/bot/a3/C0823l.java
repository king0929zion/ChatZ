package a3;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: a3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823l extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10673h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f10674i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0823l(w wVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10674i = wVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0823l) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0823l(this.f10674i, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r0.z(r7) == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r8 == r6) goto L23;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            a3.w r0 = r7.f10674i
            A4.g0 r1 = r0.f10724W
            int r2 = r7.f10673h
            r3 = 0
            r4 = 2
            r5 = 1
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L15
            X3.a.e(r8)
            goto L6e
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            X3.a.e(r8)
            goto L40
        L21:
            X3.a.e(r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r1.getClass()
            r1.l(r3, r8)
            Y2.W r8 = r0.f10729b
            r7.f10673h = r5
            r8.getClass()
            Y2.T r2 = new Y2.T
            r5 = 0
            r2.<init>(r8, r3, r5)
            java.lang.Object r8 = r8.c(r7, r2)
            if (r8 != r6) goto L40
            goto L6d
        L40:
            D2.i r8 = (D2.i) r8
            boolean r2 = r8 instanceof D2.h
            if (r2 == 0) goto L50
            D2.h r8 = (D2.h) r8
            java.lang.Object r8 = r8.a
            com.bot.core.model.LLMSetting r8 = (com.bot.core.model.LLMSetting) r8
            r0.E(r8)
            goto L65
        L50:
            boolean r2 = r8 instanceof D2.f
            if (r2 == 0) goto L61
            A4.g0 r2 = r0.f10720S
            D2.f r8 = (D2.f) r8
            java.lang.String r8 = r8.a
            r2.getClass()
            r2.l(r3, r8)
            goto L65
        L61:
            boolean r8 = r8 instanceof D2.g
            if (r8 == 0) goto L79
        L65:
            r7.f10673h = r4
            java.lang.Object r8 = r0.z(r7)
            if (r8 != r6) goto L6e
        L6d:
            return r6
        L6e:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.getClass()
            r1.l(r3, r8)
            X3.y r8 = X3.y.a
            return r8
        L79:
            N0.e r8 = new N0.e
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0823l.r(java.lang.Object):java.lang.Object");
    }
}
