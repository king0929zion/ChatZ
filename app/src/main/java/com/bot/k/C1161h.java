package k;

import b4.InterfaceC0905c;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1161h extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public C1162i f12546f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f12547g;

    /* renamed from: h, reason: collision with root package name */
    public int f12548h;

    /* renamed from: i, reason: collision with root package name */
    public int f12549i;

    /* renamed from: j, reason: collision with root package name */
    public int f12550j;

    /* renamed from: k, reason: collision with root package name */
    public int f12551k;

    /* renamed from: l, reason: collision with root package name */
    public long f12552l;

    /* renamed from: m, reason: collision with root package name */
    public int f12553m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f12554n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1162i f12555o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161h(C1162i c1162i, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12555o = c1162i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1161h) p((InterfaceC0905c) obj2, (t4.i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1161h c1161h = new C1161h(this.f12555o, interfaceC0905c);
        c1161h.f12554n = obj;
        return c1161h;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004c -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004e -> B:6:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0069 -> B:5:0x0096). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f12553m
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 != r4) goto L23
            int r1 = r0.f12551k
            int r5 = r0.f12550j
            long r6 = r0.f12552l
            int r8 = r0.f12549i
            int r9 = r0.f12548h
            long[] r10 = r0.f12547g
            k.i r11 = r0.f12546f
            java.lang.Object r12 = r0.f12554n
            t4.i r12 = (t4.i) r12
            X3.a.e(r20)
            goto L96
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2b:
            X3.a.e(r20)
            java.lang.Object r1 = r0.f12554n
            t4.i r1 = (t4.i) r1
            k.i r5 = r0.f12555o
            k.M r6 = r5.f12557e
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            r8 = r2
        L3e:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L9f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r5
            r5 = r12
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r6
            r9 = r7
            r6 = r17
        L60:
            if (r1 >= r5) goto L99
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L96
            int r2 = r8 << 3
            int r2 = r2 + r1
            Y.a r3 = new Y.a
            k.M r13 = r11.f12557e
            java.lang.Object[] r14 = r13.f12485b
            r14 = r14[r2]
            java.lang.Object[] r13 = r13.f12486c
            r2 = r13[r2]
            r13 = 1
            r3.<init>(r13, r14, r2)
            r0.f12554n = r12
            r0.f12546f = r11
            r0.f12547g = r10
            r0.f12548h = r9
            r0.f12549i = r8
            r0.f12552l = r6
            r0.f12550j = r5
            r0.f12551k = r1
            r0.f12553m = r4
            r12.b(r3, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            return r1
        L96:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L60
        L99:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r12
        L9f:
            if (r8 == r7) goto La4
            int r8 = r8 + 1
            goto L3e
        La4:
            X3.y r1 = X3.y.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C1161h.r(java.lang.Object):java.lang.Object");
    }
}
