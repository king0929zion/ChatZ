package Y2;

import b4.InterfaceC0905c;
import java.util.ArrayList;
import java.util.List;
import x4.InterfaceC1942y;
import z4.InterfaceC2061l;

/* loaded from: classes.dex */
public final class E extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2061l f9599h;

    /* renamed from: i, reason: collision with root package name */
    public List f9600i;

    /* renamed from: j, reason: collision with root package name */
    public L f9601j;

    /* renamed from: k, reason: collision with root package name */
    public int f9602k;

    /* renamed from: l, reason: collision with root package name */
    public int f9603l;

    /* renamed from: m, reason: collision with root package name */
    public int f9604m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f9605n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9606o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L f9607p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9608q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(ArrayList arrayList, L l3, ArrayList arrayList2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9606o = arrayList;
        this.f9607p = l3;
        this.f9608q = arrayList2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((E) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        E e6 = new E(this.f9606o, this.f9607p, this.f9608q, interfaceC0905c);
        e6.f9605n = obj;
        return e6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0078 -> B:5:0x007b). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f9605n
            x4.y r0 = (x4.InterfaceC1942y) r0
            int r1 = r13.f9604m
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            if (r1 != r2) goto L1a
            int r0 = r13.f9603l
            int r1 = r13.f9602k
            Y2.L r4 = r13.f9601j
            java.util.List r5 = r13.f9600i
            z4.l r6 = r13.f9599h
            X3.a.e(r14)
            goto L7b
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L22:
            X3.a.e(r14)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r1 = 6
            z4.h r7 = i4.AbstractC1120d.a(r14, r1, r3)
            java.util.ArrayList r14 = r13.f9606o
            int r1 = r14.size()
            r10 = 0
            r4 = r10
            r8 = r4
        L36:
            Y2.L r6 = r13.f9607p
            if (r4 >= r1) goto L57
            java.lang.Object r5 = r14.get(r4)
            int r11 = r4 + 1
            int r12 = r8 + 1
            if (r8 < 0) goto L53
            com.bot.core.model.LLMProvider r5 = (com.bot.core.model.LLMProvider) r5
            Y2.D r4 = new Y2.D
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r5 = 3
            x4.AbstractC1888A.y(r0, r3, r4, r5)
            r4 = r11
            r8 = r12
            goto L36
        L53:
            Y4.l.U()
            throw r3
        L57:
            int r14 = r14.size()
            java.util.ArrayList r0 = r13.f9608q
            r1 = r14
            r5 = r0
            r4 = r6
            r6 = r7
            r0 = r10
        L62:
            if (r0 >= r1) goto La3
            r13.f9605n = r3
            r13.f9599h = r6
            r13.f9600i = r5
            r13.f9601j = r4
            r13.f9602k = r1
            r13.f9603l = r0
            r13.f9604m = r2
            java.lang.Object r14 = r6.p(r13)
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r14 != r7) goto L7b
            return r7
        L7b:
            X3.i r14 = (X3.i) r14
            java.lang.Object r7 = r14.f9393c
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r14 = r14.f9394e
            com.bot.feature.settings.data.VendorConfig r14 = (com.bot.feature.settings.data.VendorConfig) r14
            r5.set(r7, r14)
            java.util.List r14 = Y3.m.J0(r5)
            A4.g0 r7 = r4.f9637c
            java.lang.Object r8 = r7.getValue()
            Y2.y r8 = (Y2.y) r8
            r9 = 8
            Y2.y r14 = Y2.y.a(r8, r14, r2, r3, r9)
            r7.l(r3, r14)
            int r0 = r0 + r2
            goto L62
        La3:
            boolean r14 = r6.n(r3)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.E.r(java.lang.Object):java.lang.Object");
    }
}
