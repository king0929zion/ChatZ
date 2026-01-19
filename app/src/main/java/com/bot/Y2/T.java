package Y2;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class T extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9677h;

    /* renamed from: i, reason: collision with root package name */
    public int f9678i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W f9679j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(W w5, InterfaceC0905c interfaceC0905c, int i6) {
        super(1, interfaceC0905c);
        this.f9677h = i6;
        this.f9679j = w5;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj;
        switch (this.f9677h) {
            case 0:
                return new T(this.f9679j, interfaceC0905c, 0).r(X3.y.a);
            default:
                return new T(this.f9679j, interfaceC0905c, 1).r(X3.y.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r6 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (Y2.W.f(r3, r5) == r4) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [c4.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f9677h
            switch(r0) {
                case 0: goto L63;
                default: goto L5;
            }
        L5:
            int r0 = r5.f9678i
            r1 = 2
            r2 = 1
            Y2.W r3 = r5.f9679j
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L23
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L17
            X3.a.e(r6)
            goto L3a
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1f:
            X3.a.e(r6)
            goto L2f
        L23:
            X3.a.e(r6)
            r5.f9678i = r2
            java.lang.Object r6 = Y2.W.f(r3, r5)
            if (r6 != r4) goto L2f
            goto L62
        L2f:
            com.bot.core.database.dao.LLMSettingDao r6 = r3.a
            r5.f9678i = r1
            java.lang.Object r6 = r6.getAll(r5)
            if (r6 != r4) goto L3a
            goto L62
        L3a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = Y3.n.Z(r6, r0)
            r4.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L4b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r6.next()
            com.bot.core.database.entity.LLMSettingEntity r0 = (com.bot.core.database.entity.LLMSettingEntity) r0
            r3.getClass()
            com.bot.core.model.LLMSetting r0 = Y2.W.i(r0)
            r4.add(r0)
            goto L4b
        L62:
            return r4
        L63:
            int r0 = r5.f9678i
            r1 = 1
            if (r0 == 0) goto L76
            if (r0 != r1) goto L6e
            X3.a.e(r6)
            goto L86
        L6e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L76:
            X3.a.e(r6)
            r5.f9678i = r1
            Y2.W r6 = r5.f9679j
            java.lang.Object r6 = Y2.W.f(r6, r5)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r6 != r0) goto L86
            r6 = r0
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.T.r(java.lang.Object):java.lang.Object");
    }
}
