package k;

import F0.x0;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class Z extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public Object[] f12515f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f12516g;

    /* renamed from: h, reason: collision with root package name */
    public int f12517h;

    /* renamed from: i, reason: collision with root package name */
    public int f12518i;

    /* renamed from: j, reason: collision with root package name */
    public int f12519j;

    /* renamed from: k, reason: collision with root package name */
    public int f12520k;

    /* renamed from: l, reason: collision with root package name */
    public long f12521l;

    /* renamed from: m, reason: collision with root package name */
    public int f12522m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f12523n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x0 f12524o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(x0 x0Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f12524o = x0Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((Z) p((InterfaceC0905c) obj2, (t4.i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        Z z5 = new Z(this.f12524o, interfaceC0905c);
        z5.f12523n = obj;
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x008a). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f12522m
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 != r4) goto L22
            int r1 = r0.f12520k
            int r5 = r0.f12519j
            long r6 = r0.f12521l
            int r8 = r0.f12518i
            int r9 = r0.f12517h
            long[] r10 = r0.f12516g
            java.lang.Object[] r11 = r0.f12515f
            java.lang.Object r12 = r0.f12523n
            t4.i r12 = (t4.i) r12
            X3.a.e(r20)
            goto L8a
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2a:
            X3.a.e(r20)
            java.lang.Object r1 = r0.f12523n
            t4.i r1 = (t4.i) r1
            F0.x0 r5 = r0.f12524o
            java.lang.Object r5 = r5.f1542e
            k.M r5 = (k.M) r5
            java.lang.Object[] r6 = r5.f12486c
            long[] r5 = r5.a
            int r7 = r5.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L98
            r8 = r2
        L41:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L93
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r5
            r9 = r7
            r5 = r11
            r11 = r6
            r6 = r17
        L62:
            if (r1 >= r5) goto L8d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8a
            int r2 = r8 << 3
            int r2 = r2 + r1
            r2 = r11[r2]
            r0.f12523n = r12
            r0.f12515f = r11
            r0.f12516g = r10
            r0.f12517h = r9
            r0.f12518i = r8
            r0.f12521l = r6
            r0.f12519j = r5
            r0.f12520k = r1
            r0.f12522m = r4
            r12.b(r2, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            return r1
        L8a:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L62
        L8d:
            if (r5 != r3) goto L98
            r7 = r9
            r5 = r10
            r6 = r11
            r1 = r12
        L93:
            if (r8 == r7) goto L98
            int r8 = r8 + 1
            goto L41
        L98:
            X3.y r1 = X3.y.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.Z.r(java.lang.Object):java.lang.Object");
    }
}
