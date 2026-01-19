package Y2;

import b4.InterfaceC0905c;
import com.bot.core.model.LLMSetting;

/* loaded from: classes.dex */
public final class O extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public String f9648h;

    /* renamed from: i, reason: collision with root package name */
    public LLMSetting f9649i;

    /* renamed from: j, reason: collision with root package name */
    public long f9650j;

    /* renamed from: k, reason: collision with root package name */
    public int f9651k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f9652l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W f9653m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9654n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9655o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f9656p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f9657q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Integer f9658r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f9659s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f9660t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f9661u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f9662v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(String str, W w5, String str2, String str3, float f6, float f7, Integer num, Integer num2, String str4, String str5, String str6, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f9652l = str;
        this.f9653m = w5;
        this.f9654n = str2;
        this.f9655o = str3;
        this.f9656p = f6;
        this.f9657q = f7;
        this.f9658r = num;
        this.f9659s = num2;
        this.f9660t = str4;
        this.f9661u = str5;
        this.f9662v = str6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        String str = this.f9661u;
        String str2 = this.f9662v;
        return new O(this.f9652l, this.f9653m, this.f9654n, this.f9655o, this.f9656p, this.f9657q, this.f9658r, this.f9659s, this.f9660t, str, str2, (InterfaceC0905c) obj).r(X3.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r4 == r5) goto L27;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f9651k
            Y2.W r2 = r0.f9653m
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            com.bot.core.model.LLMSetting r1 = r0.f9649i
            X3.a.e(r24)
            return r1
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1e:
            long r6 = r0.f9650j
            java.lang.String r1 = r0.f9648h
            X3.a.e(r24)
            r4 = r24
        L27:
            r8 = r1
            r18 = r6
            goto L51
        L2b:
            X3.a.e(r24)
            java.lang.String r1 = r0.f9652l
            java.lang.CharSequence r1 = u4.AbstractC1776n.l0(r1)
            java.lang.String r1 = r1.toString()
            boolean r6 = u4.AbstractC1776n.Q(r1)
            if (r6 != 0) goto Lac
            long r6 = java.lang.System.currentTimeMillis()
            com.bot.core.database.dao.LLMSettingDao r8 = r2.a
            r0.f9648h = r1
            r0.f9650j = r6
            r0.f9651k = r4
            java.lang.Object r4 = r8.getMaxSortOrder(r0)
            if (r4 != r5) goto L27
            goto Laa
        L51:
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L5f
            long r6 = r4.longValue()
            r9 = 1
            long r6 = r6 + r9
            r20 = r6
            goto L61
        L5f:
            r20 = r18
        L61:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = r0.f9654n
            boolean r4 = u4.AbstractC1776n.Q(r1)
            r6 = 0
            if (r4 != 0) goto L75
            r9 = r1
            r1 = r6
            goto L77
        L75:
            r1 = r6
            r9 = r1
        L77:
            com.bot.core.model.LLMSetting r6 = new com.bot.core.model.LLMSetting
            r22 = 0
            java.lang.String r10 = r0.f9655o
            float r11 = r0.f9656p
            float r12 = r0.f9657q
            java.lang.Integer r13 = r0.f9658r
            java.lang.Integer r14 = r0.f9659s
            java.lang.String r15 = r0.f9660t
            java.lang.String r4 = r0.f9661u
            java.lang.String r1 = r0.f9662v
            r17 = r1
            r16 = r4
            r1 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22)
            r4 = r6
            r6 = r18
            com.bot.core.database.dao.LLMSettingDao r2 = r2.a
            com.bot.core.database.entity.LLMSettingEntity r8 = Y2.W.h(r4)
            r0.f9648h = r1
            r0.f9649i = r4
            r0.f9650j = r6
            r0.f9651k = r3
            java.lang.Object r1 = r2.upsert(r8, r0)
            if (r1 != r5) goto Lab
        Laa:
            return r5
        Lab:
            return r4
        Lac:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "请填写 Bot 名称"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.O.r(java.lang.Object):java.lang.Object");
    }
}
