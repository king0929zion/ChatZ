package O;

import b4.InterfaceC0905c;
import m4.C1287v;
import m4.C1288w;
import x4.InterfaceC1942y;

/* renamed from: O.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330r0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f4186h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0332s0 f4187i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1288w f4188j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1288w f4189k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1287v f4190l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0330r0(C0332s0 c0332s0, C1288w c1288w, C1288w c1288w2, C1287v c1287v, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4187i = c0332s0;
        this.f4188j = c1288w;
        this.f4189k = c1288w2;
        this.f4190l = c1287v;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0330r0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0330r0(this.f4187i, this.f4188j, this.f4189k, this.f4190l, interfaceC0905c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            O.s0 r0 = r13.f4187i
            O.z0 r1 = r0.a
            int r2 = r13.f4186h
            m4.w r3 = r13.f4189k
            m4.w r4 = r13.f4188j
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L1c
            if (r2 != r6) goto L14
            X3.a.e(r14)
            goto L55
        L14:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1c:
            X3.a.e(r14)
            O.z r9 = r0.f4212w
            if (r9 == 0) goto L58
            java.lang.Object r14 = r4.f12973c
            r11 = r14
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Object r14 = r3.f12973c
            S0.O r14 = (S0.O) r14
            long r7 = r14.a
            r13.f4186h = r6
            int r14 = r11.length()
            if (r14 != 0) goto L37
            goto L3d
        L37:
            boolean r14 = S0.O.c(r7)
            if (r14 == 0) goto L3f
        L3d:
            r14 = r5
            goto L50
        L3f:
            O.y r6 = new O.y
            r10 = 0
            r6.<init>(r7, r9, r10, r11)
            b4.h r14 = r9.a
            O.x r2 = new O.x
            r2.<init>(r9, r6, r5)
            java.lang.Object r14 = x4.AbstractC1888A.H(r14, r2, r13)
        L50:
            c4.a r2 = c4.EnumC0927a.f11114c
            if (r14 != r2) goto L55
            return r2
        L55:
            S0.O r14 = (S0.O) r14
            goto L59
        L58:
            r14 = r5
        L59:
            X3.y r2 = X3.y.a
            if (r14 == 0) goto Lc6
            long r6 = r14.a
            java.lang.Object r14 = r3.f12973c
            boolean r14 = S0.O.a(r6, r14)
            if (r14 != 0) goto Lc6
            k.E r14 = r1.f4265c
            m4.v r3 = r13.f4190l
            long r8 = r3.f12972c
            java.lang.Object r14 = r14.e(r8)
            O.r r14 = (O.r) r14
            if (r14 == 0) goto Lc6
            S0.g r8 = r14.d()
            java.lang.Object r4 = r4.f12973c
            if (r8 != r4) goto Lc6
            N.h r14 = r14.f4182c
            java.lang.Object r14 = r14.b()
            S0.L r14 = (S0.L) r14
            if (r14 != 0) goto L88
            goto Lc6
        L88:
            O.G r4 = new O.G
            O.F r8 = new O.F
            r9 = 32
            long r9 = r6 >> r9
            int r9 = (int) r9
            d1.j r10 = O.AbstractC0336u0.u(r14, r9)
            long r11 = r3.f12972c
            r8.<init>(r10, r9, r11)
            O.F r9 = new O.F
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r10
            int r6 = (int) r6
            d1.j r14 = O.AbstractC0336u0.u(r14, r6)
            long r10 = r3.f12972c
            r9.<init>(r14, r6, r10)
            r14 = 0
            r4.<init>(r8, r9, r14)
            k.E r14 = k.AbstractC1171s.a
            k.E r14 = new k.E
            r14.<init>()
            r14.h(r10, r4)
            T.g0 r1 = r1.f4273k
            r1.setValue(r14)
            l4.c r14 = r0.f4193d
            r14.f(r4)
            r0.f4209t = r5
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0330r0.r(java.lang.Object):java.lang.Object");
    }
}
