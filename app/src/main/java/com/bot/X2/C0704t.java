package X2;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: X2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704t extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9365h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f9366i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T f9367j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9368k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0704t(L l3, T t5, String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9366i = l3;
        this.f9367j = t5;
        this.f9368k = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0704t) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0704t(this.f9366i, this.f9367j, this.f9368k, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r10 == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0032, code lost:
    
        if (r10 == r8) goto L22;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f9365h
            r5 = 0
            r1 = 2
            r2 = 1
            X2.T r3 = r9.f9367j
            X2.L r7 = r9.f9366i
            c4.a r8 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L21
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            X3.a.e(r10)
            goto L5f
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            X3.a.e(r10)
            goto L35
        L21:
            X3.a.e(r10)
            java.lang.String r10 = r3.f9227b
            java.lang.String r0 = r3.f9229d
            r9.f9365h = r2
            O2.d r2 = r7.f9209j
            java.lang.String r4 = r9.f9368k
            java.lang.Object r10 = r2.a(r10, r4, r0, r9)
            if (r10 != r8) goto L35
            goto L5e
        L35:
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto La2
            boolean r10 = u4.AbstractC1776n.Q(r4)
            if (r10 == 0) goto L41
            goto La2
        L41:
            java.lang.String r10 = r3.f9228c
            boolean r10 = r4.equals(r10)
            if (r10 != 0) goto La2
            I2.v r2 = r7.f9201b
            java.lang.String r3 = r3.a
            r9.f9365h = r1
            r2.getClass()
            I2.u r1 = new I2.u
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r10 = r2.c(r9, r1)
            if (r10 != r8) goto L5f
        L5e:
            return r8
        L5f:
            D2.i r10 = (D2.i) r10
            boolean r0 = r10 instanceof D2.h
            if (r0 == 0) goto L86
            X2.M r0 = new X2.M
            D2.h r10 = (D2.h) r10
            java.lang.Object r10 = r10.a
            com.bot.core.model.ConversationInfo r10 = (com.bot.core.model.ConversationInfo) r10
            r0.<init>(r10)
            A4.V r10 = r7.f9218s
            boolean r10 = r10.h(r0)
            if (r10 != 0) goto La2
            H1.a r10 = androidx.lifecycle.O.i(r7)
            X2.m r1 = new X2.m
            r1.<init>(r7, r0, r5)
            r0 = 3
            x4.AbstractC1888A.y(r10, r5, r1, r0)
            goto La2
        L86:
            boolean r0 = r10 instanceof D2.f
            if (r0 == 0) goto L97
            A4.g0 r0 = r7.f9222w
            D2.f r10 = (D2.f) r10
            java.lang.String r10 = r10.a
            r0.getClass()
            r0.l(r5, r10)
            goto La2
        L97:
            boolean r10 = r10 instanceof D2.g
            if (r10 == 0) goto L9c
            goto La2
        L9c:
            N0.e r10 = new N0.e
            r10.<init>()
            throw r10
        La2:
            X3.y r10 = X3.y.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.C0704t.r(java.lang.Object):java.lang.Object");
    }
}
