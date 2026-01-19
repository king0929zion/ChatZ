package O;

import b4.InterfaceC0905c;
import n0.C1353b;

/* renamed from: O.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323n0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4161h;

    /* renamed from: i, reason: collision with root package name */
    public int f4162i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4163j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0323n0(Object obj, InterfaceC0905c interfaceC0905c, int i6) {
        super(2, interfaceC0905c);
        this.f4161h = i6;
        this.f4163j = obj;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C1353b c1353b = (C1353b) obj;
        switch (this.f4161h) {
            case 0:
                long j3 = c1353b.a;
                return new C0323n0((C0332s0) this.f4163j, (InterfaceC0905c) obj2, 0).r(X3.y.a);
            default:
                long j4 = c1353b.a;
                return new C0323n0((N0) this.f4163j, (InterfaceC0905c) obj2, 1).r(X3.y.a);
        }
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        switch (this.f4161h) {
            case 0:
                return new C0323n0((C0332s0) this.f4163j, interfaceC0905c, 0);
            default:
                return new C0323n0((N0) this.f4163j, interfaceC0905c, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        if (r0.s(r8) == r5) goto L24;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f4161h
            switch(r0) {
                case 0: goto L55;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f4163j
            O.N0 r0 = (O.N0) r0
            int r1 = r8.f4162i
            X3.y r2 = X3.y.a
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            X3.a.e(r9)
            goto L54
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            X3.a.e(r9)
            goto L33
        L27:
            X3.a.e(r9)
            r8.f4162i = r4
            java.lang.Object r9 = r0.s(r8)
            if (r9 != r5) goto L33
            goto L53
        L33:
            X3.i r9 = O.N0.a(r0)
            if (r9 == 0) goto L54
            java.lang.Object r1 = r9.f9393c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r9 = r9.f9394e
            S0.O r9 = (S0.O) r9
            long r6 = r9.a
            O.z r9 = r0.f4000i
            if (r9 == 0) goto L54
            r8.f4162i = r3
            java.lang.Object r9 = r9.c(r1, r6, r8)
            if (r9 != r5) goto L50
            goto L51
        L50:
            r9 = r2
        L51:
            if (r9 != r5) goto L54
        L53:
            r2 = r5
        L54:
            return r2
        L55:
            java.lang.Object r0 = r8.f4163j
            O.s0 r0 = (O.C0332s0) r0
            int r1 = r8.f4162i
            X3.y r2 = X3.y.a
            r3 = 1
            if (r1 == 0) goto L6e
            if (r1 != r3) goto L66
            X3.a.e(r9)
            goto L94
        L66:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L6e:
            X3.a.e(r9)
            X3.i r9 = r0.d()
            if (r9 == 0) goto L94
            java.lang.Object r1 = r9.f9393c
            S0.g r1 = (S0.C0545g) r1
            java.lang.Object r9 = r9.f9394e
            S0.O r9 = (S0.O) r9
            long r4 = r9.a
            O.z r9 = r0.f4212w
            if (r9 == 0) goto L94
            r8.f4162i = r3
            java.lang.Object r9 = r9.c(r1, r4, r8)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r9 != r0) goto L90
            goto L91
        L90:
            r9 = r2
        L91:
            if (r9 != r0) goto L94
            r2 = r0
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0323n0.r(java.lang.Object):java.lang.Object");
    }
}
