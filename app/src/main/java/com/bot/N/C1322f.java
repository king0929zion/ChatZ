package n;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;
import z4.C2052c;
import z4.InterfaceC2061l;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1322f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C2052c f13150h;

    /* renamed from: i, reason: collision with root package name */
    public int f13151i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f13152j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2061l f13153k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1316c f13154l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T.X f13155m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T.X f13156n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1322f(InterfaceC2061l interfaceC2061l, C1316c c1316c, T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13153k = interfaceC2061l;
        this.f13154l = c1316c;
        this.f13155m = x5;
        this.f13156n = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1322f) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1322f c1322f = new C1322f(this.f13153k, this.f13154l, this.f13155m, this.f13156n, interfaceC0905c);
        c1322f.f13152j = obj;
        return c1322f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f13151i
            z4.l r1 = r11.f13153k
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 != r2) goto L13
            z4.c r0 = r11.f13150h
            java.lang.Object r3 = r11.f13152j
            x4.y r3 = (x4.InterfaceC1942y) r3
            X3.a.e(r12)
            goto L36
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            X3.a.e(r12)
            java.lang.Object r12 = r11.f13152j
            x4.y r12 = (x4.InterfaceC1942y) r12
            z4.c r0 = r1.iterator()
            r3 = r12
        L27:
            r11.f13152j = r3
            r11.f13150h = r0
            r11.f13151i = r2
            java.lang.Object r12 = r0.b(r11)
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r12 != r4) goto L36
            return r4
        L36:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L61
            java.lang.Object r12 = r0.c()
            java.lang.Object r4 = r1.i()
            java.lang.Object r4 = z4.C2064o.a(r4)
            if (r4 != 0) goto L4e
            r6 = r12
            goto L4f
        L4e:
            r6 = r4
        L4f:
            n.e r5 = new n.e
            T.X r9 = r11.f13156n
            r10 = 0
            n.c r7 = r11.f13154l
            T.X r8 = r11.f13155m
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 3
            r4 = 0
            x4.AbstractC1888A.y(r3, r4, r5, r12)
            goto L27
        L61:
            X3.y r12 = X3.y.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1322f.r(java.lang.Object):java.lang.Object");
    }
}
