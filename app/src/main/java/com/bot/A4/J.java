package A4;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class J extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f181h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d0 f182i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h f183j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g0 f184k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f185l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(d0 d0Var, InterfaceC0007h interfaceC0007h, g0 g0Var, Object obj, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f182i = d0Var;
        this.f183j = interfaceC0007h;
        this.f184k = g0Var;
        this.f185l = obj;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((J) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new J(this.f182i, this.f183j, this.f184k, this.f185l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (r5.b(r7, r17) == r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r5.b(r7, r17) == r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (A4.W.j(r1, r2, r17) == r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (A4.W.f(r1, r3, r17) == r8) goto L28;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [d4.i, l4.e] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f181h
            r2 = 4
            r3 = 3
            r4 = 1
            A4.h r5 = r0.f183j
            r6 = 2
            A4.g0 r7 = r0.f184k
            c4.a r8 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L29
            if (r1 == r4) goto L25
            if (r1 == r6) goto L21
            if (r1 == r3) goto L25
            if (r1 != r2) goto L19
            goto L25
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            X3.a.e(r18)
            goto L52
        L25:
            X3.a.e(r18)
            goto L92
        L29:
            X3.a.e(r18)
            A4.a0 r1 = A4.Z.a
            A4.d0 r9 = r0.f182i
            if (r9 != r1) goto L3b
            r0.f181h = r4
            java.lang.Object r1 = r5.b(r7, r0)
            if (r1 != r8) goto L92
            goto L91
        L3b:
            A4.a0 r1 = A4.Z.f228b
            r10 = 0
            if (r9 != r1) goto L5b
            B4.G r1 = r7.i()
            A4.H r2 = new A4.H
            r2.<init>(r6, r10)
            r0.f181h = r6
            java.lang.Object r1 = A4.W.j(r1, r2, r0)
            if (r1 != r8) goto L52
            goto L91
        L52:
            r0.f181h = r3
            java.lang.Object r1 = r5.b(r7, r0)
            if (r1 != r8) goto L92
            goto L91
        L5b:
            B4.G r13 = r7.i()
            A4.b0 r12 = new A4.b0
            r12.<init>(r9, r10)
            int r1 = A4.A.a
            B4.o r11 = new B4.o
            r15 = -2
            z4.a r16 = z4.EnumC2050a.f16327c
            b4.i r14 = b4.C0911i.f11057c
            r11.<init>(r12, r13, r14, r15, r16)
            A4.c0 r1 = new A4.c0
            r1.<init>(r6, r10)
            A4.x r3 = new A4.x
            r3.<init>(r4, r11, r1)
            A4.h r1 = A4.W.g(r3)
            A4.h r1 = A4.W.g(r1)
            A4.I r3 = new A4.I
            java.lang.Object r4 = r0.f185l
            r3.<init>(r5, r7, r4, r10)
            r0.f181h = r2
            java.lang.Object r1 = A4.W.f(r1, r3, r0)
            if (r1 != r8) goto L92
        L91:
            return r8
        L92:
            X3.y r1 = X3.y.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.J.r(java.lang.Object):java.lang.Object");
    }
}
