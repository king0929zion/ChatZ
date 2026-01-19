package I2;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class s extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public int f2675h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f2676i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2677j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2678k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, int i6, int i7, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f2676i = vVar;
        this.f2677j = i6;
        this.f2678k = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f2677j;
        int i7 = this.f2678k;
        return new s(this.f2676i, i6, i7, (InterfaceC0905c) obj).r(X3.y.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057 A[LOOP:0: B:8:0x0051->B:10:0x0057, LOOP_END] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f2675h
            r1 = 1
            I2.v r2 = r3.f2676i
            if (r0 == 0) goto L1e
            if (r0 == r1) goto L1a
            r1 = 2
            if (r0 != r1) goto L12
            X3.a.e(r4)
            java.util.List r4 = (java.util.List) r4
            goto L34
        L12:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L1a:
            X3.a.e(r4)
            goto L32
        L1e:
            X3.a.e(r4)
            com.bot.core.database.dao.ConversationDao r4 = r2.a
            r3.f2675h = r1
            int r0 = r3.f2677j
            int r1 = r3.f2678k
            java.lang.Object r4 = r4.getConversations(r0, r1, r3)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r4 != r0) goto L32
            return r0
        L32:
            java.util.List r4 = (java.util.List) r4
        L34:
            androidx.lifecycle.N r0 = i5.a.a
            r4.size()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.getClass()
            androidx.lifecycle.N.k(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Y3.n.Z(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L51:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r4.next()
            com.bot.core.database.entity.ConversationEntity r1 = (com.bot.core.database.entity.ConversationEntity) r1
            com.bot.core.model.ConversationInfo r1 = I2.v.g(r2, r1)
            r0.add(r1)
            goto L51
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.s.r(java.lang.Object):java.lang.Object");
    }
}
