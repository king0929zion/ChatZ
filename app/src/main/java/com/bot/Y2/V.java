package Y2;

import b4.InterfaceC0905c;
import com.bot.core.model.LLMSetting;

/* loaded from: classes.dex */
public final class V extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public String f9686h;

    /* renamed from: i, reason: collision with root package name */
    public W f9687i;

    /* renamed from: j, reason: collision with root package name */
    public LLMSetting f9688j;

    /* renamed from: k, reason: collision with root package name */
    public int f9689k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f9690l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W f9691m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9692n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9693o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f9694p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f9695q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f9696r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f9697s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f9698t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f9699u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f9700v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f9701w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(String str, W w5, String str2, String str3, String str4, float f6, float f7, Integer num, Integer num2, String str5, String str6, String str7, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f9690l = str;
        this.f9691m = w5;
        this.f9692n = str2;
        this.f9693o = str3;
        this.f9694p = str4;
        this.f9695q = f6;
        this.f9696r = f7;
        this.f9697s = num;
        this.f9698t = num2;
        this.f9699u = str5;
        this.f9700v = str6;
        this.f9701w = str7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        String str = this.f9700v;
        String str2 = this.f9701w;
        return new V(this.f9690l, this.f9691m, this.f9692n, this.f9693o, this.f9694p, this.f9695q, this.f9696r, this.f9697s, this.f9698t, this.f9699u, str, str2, (InterfaceC0905c) obj).r(X3.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r4 == r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f9689k
            r2 = 3
            r3 = 2
            r4 = 1
            Y2.W r5 = r0.f9691m
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L38
            if (r1 == r4) goto L30
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            com.bot.core.model.LLMSetting r1 = r0.f9688j
            Y2.W r2 = r0.f9687i
            com.bot.core.database.entity.LLMSettingEntity r2 = (com.bot.core.database.entity.LLMSettingEntity) r2
            X3.a.e(r22)
            return r1
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            Y2.W r1 = r0.f9687i
            java.lang.String r3 = r0.f9686h
            X3.a.e(r22)
            r4 = r3
            r3 = r22
            goto L6e
        L30:
            java.lang.String r1 = r0.f9686h
            X3.a.e(r22)
            r4 = r22
            goto L5b
        L38:
            X3.a.e(r22)
            java.lang.String r1 = r0.f9690l
            java.lang.CharSequence r1 = u4.AbstractC1776n.l0(r1)
            java.lang.String r1 = r1.toString()
            boolean r7 = u4.AbstractC1776n.Q(r1)
            if (r7 != 0) goto Lc0
            com.bot.core.database.dao.LLMSettingDao r7 = r5.a
            r0.f9686h = r1
            r0.f9689k = r4
            java.lang.String r4 = r0.f9692n
            java.lang.Object r4 = r7.getById(r4, r0)
            if (r4 != r6) goto L5b
            goto Lbe
        L5b:
            com.bot.core.database.entity.LLMSettingEntity r4 = (com.bot.core.database.entity.LLMSettingEntity) r4
            if (r4 != 0) goto L7a
            r0.f9686h = r1
            r0.f9687i = r5
            r0.f9689k = r3
            java.lang.Object r3 = Y2.W.f(r5, r0)
            if (r3 != r6) goto L6c
            goto Lbe
        L6c:
            r4 = r1
            r1 = r5
        L6e:
            com.bot.core.model.LLMSetting r3 = (com.bot.core.model.LLMSetting) r3
            r1.getClass()
            com.bot.core.database.entity.LLMSettingEntity r1 = Y2.W.h(r3)
            r8 = r4
            r4 = r1
            goto L7b
        L7a:
            r8 = r1
        L7b:
            r5.getClass()
            com.bot.core.model.LLMSetting r7 = Y2.W.i(r4)
            java.lang.String r1 = r0.f9693o
            boolean r3 = u4.AbstractC1776n.Q(r1)
            r4 = 0
            if (r3 != 0) goto L8d
            r9 = r1
            goto L8e
        L8d:
            r9 = r4
        L8e:
            r18 = 0
            r20 = 14337(0x3801, float:2.009E-41)
            java.lang.String r10 = r0.f9694p
            float r11 = r0.f9695q
            float r12 = r0.f9696r
            java.lang.Integer r13 = r0.f9697s
            java.lang.Integer r14 = r0.f9698t
            java.lang.String r15 = r0.f9699u
            java.lang.String r1 = r0.f9700v
            java.lang.String r3 = r0.f9701w
            r16 = r1
            r17 = r3
            com.bot.core.model.LLMSetting r1 = com.bot.core.model.LLMSetting.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
            com.bot.core.database.dao.LLMSettingDao r3 = r5.a
            com.bot.core.database.entity.LLMSettingEntity r5 = Y2.W.h(r1)
            r0.f9686h = r4
            r0.f9687i = r4
            r0.f9688j = r1
            r0.f9689k = r2
            java.lang.Object r2 = r3.upsert(r5, r0)
            if (r2 != r6) goto Lbf
        Lbe:
            return r6
        Lbf:
            return r1
        Lc0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "请填写 Bot 名称"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.V.r(java.lang.Object):java.lang.Object");
    }
}
