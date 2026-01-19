package k;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class O extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public Z.c f12494f;

    /* renamed from: g, reason: collision with root package name */
    public P f12495g;

    /* renamed from: h, reason: collision with root package name */
    public long[] f12496h;

    /* renamed from: i, reason: collision with root package name */
    public int f12497i;

    /* renamed from: j, reason: collision with root package name */
    public int f12498j;

    /* renamed from: k, reason: collision with root package name */
    public int f12499k;

    /* renamed from: l, reason: collision with root package name */
    public int f12500l;

    /* renamed from: m, reason: collision with root package name */
    public long f12501m;

    /* renamed from: n, reason: collision with root package name */
    public int f12502n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f12503o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P f12504p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z.c f12505q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p5, Z.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12504p = p5;
        this.f12505q = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((O) p((InterfaceC0905c) obj2, (t4.i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        O o5 = new O(this.f12504p, this.f12505q, interfaceC0905c);
        o5.f12503o = obj;
        return o5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:14:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x0095). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f12502n
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L25
            int r1 = r0.f12500l
            int r5 = r0.f12499k
            long r6 = r0.f12501m
            int r8 = r0.f12498j
            int r9 = r0.f12497i
            long[] r10 = r0.f12496h
            k.P r11 = r0.f12495g
            Z.c r12 = r0.f12494f
            java.lang.Object r13 = r0.f12503o
            t4.i r13 = (t4.i) r13
            X3.a.e(r21)
            goto L95
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            X3.a.e(r21)
            java.lang.Object r1 = r0.f12503o
            t4.i r1 = (t4.i) r1
            k.P r5 = r0.f12504p
            k.N r6 = r5.f12507e
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La5
            Z.c r8 = r0.f12505q
            r9 = r2
        L42:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L65:
            if (r1 >= r5) goto L98
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L95
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f9851e = r2
            k.N r3 = r11.f12507e
            java.lang.Object[] r3 = r3.f12490b
            r2 = r3[r2]
            r0.f12503o = r13
            r0.f12494f = r12
            r0.f12495g = r11
            r0.f12496h = r10
            r0.f12497i = r9
            r0.f12498j = r8
            r0.f12501m = r6
            r0.f12499k = r5
            r0.f12500l = r1
            r0.f12502n = r4
            r13.b(r2, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            return r1
        L95:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L65
        L98:
            if (r5 != r3) goto La5
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        La0:
            if (r9 == r7) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            X3.y r1 = X3.y.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.O.r(java.lang.Object):java.lang.Object");
    }
}
