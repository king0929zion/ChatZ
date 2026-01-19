package X2;

import b4.InterfaceC0905c;
import java.util.ArrayList;
import java.util.List;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class E extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public I2.w f9159h;

    /* renamed from: i, reason: collision with root package name */
    public int f9160i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f9161j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9162k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Integer f9163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9165n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9166o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f9167p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f9168q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f9169r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9170s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f9171t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f9172u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f9173v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Integer f9174w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(L l3, String str, Integer num, String str2, String str3, String str4, String str5, String str6, List list, ArrayList arrayList, String str7, float f6, float f7, Integer num2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9161j = l3;
        this.f9162k = str;
        this.f9163l = num;
        this.f9164m = str2;
        this.f9165n = str3;
        this.f9166o = str4;
        this.f9167p = str5;
        this.f9168q = str6;
        this.f9169r = list;
        this.f9170s = arrayList;
        this.f9171t = str7;
        this.f9172u = f6;
        this.f9173v = f7;
        this.f9174w = num2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((E) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new E(this.f9161j, this.f9162k, this.f9163l, this.f9164m, this.f9165n, this.f9166o, this.f9167p, this.f9168q, this.f9169r, this.f9170s, this.f9171t, this.f9172u, this.f9173v, this.f9174w, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r5 == r12) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1 == r12) goto L16;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f9160i
            r2 = 0
            java.lang.String r4 = r0.f9162k
            r10 = 2
            r11 = 1
            X2.L r3 = r0.f9161j
            c4.a r12 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L2a
            if (r1 == r11) goto L24
            if (r1 != r10) goto L1c
            I2.w r1 = r0.f9159h
            X3.a.e(r18)
            r5 = r18
        L1a:
            r15 = r1
            goto L64
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            X3.a.e(r18)
            r1 = r18
            goto L36
        L2a:
            X3.a.e(r18)
            r0.f9160i = r11
            java.lang.Object r1 = X2.L.j(r3, r4, r0)
            if (r1 != r12) goto L36
            goto L63
        L36:
            r5 = r1
            com.bot.core.model.LLMProvider r5 = (com.bot.core.model.LLMProvider) r5
            A4.g0 r1 = r3.f9215p
            java.lang.Object r1 = r1.getValue()
            X2.i r1 = (X2.C0694i) r1
            boolean r6 = r1.f9303d
            java.lang.String r8 = r0.f9164m
            java.lang.String r9 = r0.f9165n
            java.lang.Integer r7 = r0.f9163l
            I2.w r1 = X2.L.e(r3, r4, r5, r6, r7, r8, r9)
            r0.f9159h = r1
            r0.f9160i = r10
            r3.getClass()
            E4.e r5 = x4.AbstractC1898K.a
            E4.d r5 = E4.d.f1360f
            X2.s r6 = new X2.s
            r6.<init>(r3, r2)
            java.lang.Object r5 = x4.AbstractC1888A.H(r5, r6, r0)
            if (r5 != r12) goto L1a
        L63:
            return r12
        L64:
            X2.O r5 = (X2.O) r5
            r3.getClass()
            H1.a r1 = androidx.lifecycle.O.i(r3)
            X2.K r6 = new X2.K
            java.lang.String r7 = r0.f9166o
            r6.<init>(r3, r7, r2)
            r7 = 3
            x4.AbstractC1888A.y(r1, r2, r6, r7)
            M2.t r1 = r3.f9202c
            java.util.List r14 = r5.a
            X2.k r2 = new X2.k
            r2.<init>(r3, r5, r11)
            r9 = r4
            java.lang.String r4 = r0.f9167p
            java.lang.String r5 = r0.f9166o
            java.lang.String r6 = r0.f9168q
            java.util.List r7 = r0.f9169r
            java.util.ArrayList r8 = r0.f9170s
            java.lang.String r10 = r0.f9171t
            float r11 = r0.f9172u
            float r12 = r0.f9173v
            java.lang.Integer r13 = r0.f9174w
            r3 = r1
            r16 = r2
            r3.h(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X3.y r1 = X3.y.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.E.r(java.lang.Object):java.lang.Object");
    }
}
