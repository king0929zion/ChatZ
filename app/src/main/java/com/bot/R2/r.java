package R2;

import T.X;
import X2.C0692g;
import b4.InterfaceC0905c;
import com.bot.core.model.ConversationInfo;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class r extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7021h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0692g f7022i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ConversationInfo f7023j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f7024k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X2.L f7025l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X f7026m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X f7027n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X f7028o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0692g c0692g, ConversationInfo conversationInfo, String str, X2.L l3, X x5, X x6, X x7, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f7022i = c0692g;
        this.f7023j = conversationInfo;
        this.f7024k = str;
        this.f7025l = l3;
        this.f7026m = x5;
        this.f7027n = x6;
        this.f7028o = x7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((r) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new r(this.f7022i, this.f7023j, this.f7024k, this.f7025l, this.f7026m, this.f7027n, this.f7028o, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (x4.AbstractC1888A.m(3000, r12) != r11) goto L33;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            X2.L r0 = r12.f7025l
            com.bot.core.model.ConversationInfo r1 = r12.f7023j
            java.lang.String r1 = r1.a
            int r2 = r12.f7021h
            T.X r3 = r12.f7028o
            T.X r4 = r12.f7027n
            T.X r5 = r12.f7026m
            X2.g r6 = r12.f7022i
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            c4.a r11 = c4.EnumC0927a.f11114c
            if (r2 == 0) goto L34
            if (r2 == r9) goto L30
            if (r2 == r8) goto L2a
            if (r2 != r7) goto L22
            X3.a.e(r13)
            goto L83
        L22:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2a:
            X3.a.e(r13)     // Catch: java.lang.Exception -> L2e
            goto L63
        L2e:
            r13 = move-exception
            goto L6a
        L30:
            X3.a.e(r13)     // Catch: java.lang.Exception -> L2e
            goto L40
        L34:
            X3.a.e(r13)
            r12.f7021h = r9     // Catch: java.lang.Exception -> L2e
            java.lang.Object r13 = r6.e(r1, r12)     // Catch: java.lang.Exception -> L2e
            if (r13 != r11) goto L40
            goto L82
        L40:
            java.lang.String r13 = r12.f7024k     // Catch: java.lang.Exception -> L2e
            boolean r13 = m4.AbstractC1276k.b(r1, r13)     // Catch: java.lang.Exception -> L2e
            if (r13 == 0) goto L52
            f0.s r13 = r0.f9214o     // Catch: java.lang.Exception -> L2e
            r13.clear()     // Catch: java.lang.Exception -> L2e
            java.lang.String r13 = ""
            r0.o(r13)     // Catch: java.lang.Exception -> L2e
        L52:
            r5.setValue(r1)     // Catch: java.lang.Exception -> L2e
            r4.setValue(r10)     // Catch: java.lang.Exception -> L2e
            r12.f7021h = r8     // Catch: java.lang.Exception -> L2e
            r8 = 400(0x190, double:1.976E-321)
            java.lang.Object r13 = x4.AbstractC1888A.m(r8, r12)     // Catch: java.lang.Exception -> L2e
            if (r13 != r11) goto L63
            goto L82
        L63:
            r6.g(r1)     // Catch: java.lang.Exception -> L2e
            r5.setValue(r10)     // Catch: java.lang.Exception -> L2e
            goto L86
        L6a:
            java.lang.String r13 = r13.getMessage()
            if (r13 != 0) goto L72
            java.lang.String r13 = "删除失败"
        L72:
            r3.setValue(r13)
            r4.setValue(r10)
            r12.f7021h = r7
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r13 = x4.AbstractC1888A.m(r0, r12)
            if (r13 != r11) goto L83
        L82:
            return r11
        L83:
            r3.setValue(r10)
        L86:
            X3.y r13 = X3.y.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.r.r(java.lang.Object):java.lang.Object");
    }
}
