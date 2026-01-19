package A;

import B0.C0028d;
import H0.i0;
import X3.y;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class i extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f17h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f18i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f19j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0028d f20k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, i0 i0Var, C0028d c0028d, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f18i = lVar;
        this.f19j = i0Var;
        this.f20k = c0028d;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((i) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new i(this.f18i, this.f19j, this.f20k, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cf, code lost:
    
        if (r0 == r14) goto L41;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f17h
            X3.y r1 = X3.y.a
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Ld
            X3.a.e(r14)
            return r1
        Ld:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L15:
            X3.a.e(r14)
            A.l r14 = r13.f18i
            r.D r3 = r14.f29r
            A.h r0 = new A.h
            H0.i0 r4 = r13.f19j
            B0.d r5 = r13.f20k
            r0.<init>(r14, r4, r5)
            r13.f17h = r2
            r3.getClass()
            java.lang.Object r14 = r0.b()
            r4 = r14
            n0.c r4 = (n0.C1354c) r4
            c4.a r14 = c4.EnumC0927a.f11114c
            if (r4 == 0) goto Ld2
            r7 = 0
            r9 = 3
            r5 = 0
            boolean r4 = r.C1515D.N0(r3, r4, r5, r7, r9)
            if (r4 != 0) goto Ld2
            x4.k r4 = new x4.k
            b4.c r5 = Y4.d.K(r13)
            r4.<init>(r2, r5)
            r4.t()
            r.A r5 = new r.A
            r5.<init>(r0, r4)
            r.u r6 = r3.f13999w
            V.e r7 = r6.a
            java.lang.Object r0 = r0.b()
            n0.c r0 = (n0.C1354c) r0
            if (r0 != 0) goto L61
            r4.k(r1)
            goto Lcb
        L61:
            Z2.X r8 = new Z2.X
            r9 = 14
            r8.<init>(r9, r6, r5)
            r4.v(r8)
            int r6 = r7.f8761f
            r8 = 0
            r4.g r6 = i4.AbstractC1117a.z(r8, r6)
            int r9 = r6.f14679c
            int r6 = r6.f14680e
            if (r9 > r6) goto Lbf
        L78:
            java.lang.Object[] r10 = r7.f8759c
            r10 = r10[r6]
            r.A r10 = (r.C1509A) r10
            A.h r10 = r10.a
            java.lang.Object r10 = r10.b()
            n0.c r10 = (n0.C1354c) r10
            if (r10 != 0) goto L89
            goto Lba
        L89:
            n0.c r11 = r0.f(r10)
            boolean r12 = r11.equals(r0)
            if (r12 == 0) goto L98
            int r6 = r6 + r2
            r7.a(r6, r5)
            goto Lc2
        L98:
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto Lba
            java.util.concurrent.CancellationException r10 = new java.util.concurrent.CancellationException
            java.lang.String r11 = "bringIntoView call interrupted by a newer, non-overlapping call"
            r10.<init>(r11)
            int r11 = r7.f8761f
            int r11 = r11 - r2
            if (r11 > r6) goto Lba
        Laa:
            java.lang.Object[] r12 = r7.f8759c
            r12 = r12[r6]
            r.A r12 = (r.C1509A) r12
            x4.k r12 = r12.f13960b
            r12.w(r10)
            if (r11 == r6) goto Lba
            int r11 = r11 + 1
            goto Laa
        Lba:
            if (r6 == r9) goto Lbf
            int r6 = r6 + (-1)
            goto L78
        Lbf:
            r7.a(r8, r5)
        Lc2:
            boolean r0 = r3.f14002z
            if (r0 != 0) goto Lcb
            r5 = 0
            r3.O0(r5)
        Lcb:
            java.lang.Object r0 = r4.s()
            if (r0 != r14) goto Ld2
            goto Ld3
        Ld2:
            r0 = r1
        Ld3:
            if (r0 != r14) goto Ld6
            return r14
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A.i.r(java.lang.Object):java.lang.Object");
    }
}
