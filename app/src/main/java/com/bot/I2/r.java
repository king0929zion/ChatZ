package I2;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class r extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2671h;

    /* renamed from: i, reason: collision with root package name */
    public int f2672i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f2673j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2674k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(v vVar, String str, InterfaceC0905c interfaceC0905c, int i6) {
        super(1, interfaceC0905c);
        this.f2671h = i6;
        this.f2673j = vVar;
        this.f2674k = str;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj;
        switch (this.f2671h) {
            case 0:
                return new r(this.f2673j, this.f2674k, interfaceC0905c, 0).r(X3.y.a);
            case 1:
                return new r(this.f2673j, this.f2674k, interfaceC0905c, 1).r(X3.y.a);
            default:
                return new r(this.f2673j, this.f2674k, interfaceC0905c, 2).r(X3.y.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [c4.a] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f2671h
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L55;
                default: goto L5;
            }
        L5:
            int r0 = r6.f2672i
            I2.v r1 = r6.f2673j
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L12
            X3.a.e(r7)
            goto L2f
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            X3.a.e(r7)
            com.bot.core.database.dao.ConversationDao r7 = r1.a
            r6.f2672i = r2
            java.lang.String r0 = r6.f2674k
            r2 = 20
            r3 = 0
            java.lang.Object r7 = r7.searchConversations(r0, r2, r3, r6)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r7 != r0) goto L2f
            goto L54
        L2f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = Y3.n.Z(r7, r2)
            r0.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L40:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r7.next()
            com.bot.core.database.entity.ConversationEntity r2 = (com.bot.core.database.entity.ConversationEntity) r2
            com.bot.core.model.ConversationInfo r2 = I2.v.g(r1, r2)
            r0.add(r2)
            goto L40
        L54:
            return r0
        L55:
            int r0 = r6.f2672i
            I2.v r1 = r6.f2673j
            r2 = 1
            if (r0 == 0) goto L6a
            if (r0 != r2) goto L62
            X3.a.e(r7)
            goto L7c
        L62:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L6a:
            X3.a.e(r7)
            com.bot.core.database.dao.ConversationDao r7 = r1.a
            r6.f2672i = r2
            java.lang.String r0 = r6.f2674k
            java.lang.Object r7 = r7.getConversation(r0, r6)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r7 != r0) goto L7c
            goto L84
        L7c:
            com.bot.core.database.entity.ConversationEntity r7 = (com.bot.core.database.entity.ConversationEntity) r7
            if (r7 == 0) goto L85
            com.bot.core.model.ConversationInfo r0 = I2.v.g(r1, r7)
        L84:
            return r0
        L85:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "对话不存在"
            r7.<init>(r0)
            throw r7
        L8d:
            int r0 = r6.f2672i
            java.lang.String r1 = r6.f2674k
            I2.v r2 = r6.f2673j
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto Lad
            if (r0 == r4) goto La9
            if (r0 != r3) goto La1
            X3.a.e(r7)
            goto Lc6
        La1:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        La9:
            X3.a.e(r7)
            goto Lbb
        Lad:
            X3.a.e(r7)
            com.bot.core.database.dao.MessageDao r7 = r2.f2687b
            r6.f2672i = r4
            java.lang.Object r7 = r7.deleteByConversationId(r1, r6)
            if (r7 != r5) goto Lbb
            goto Lc8
        Lbb:
            com.bot.core.database.dao.ConversationDao r7 = r2.a
            r6.f2672i = r3
            java.lang.Object r7 = r7.deleteConversation(r1, r6)
            if (r7 != r5) goto Lc6
            goto Lc8
        Lc6:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        Lc8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.r.r(java.lang.Object):java.lang.Object");
    }
}
