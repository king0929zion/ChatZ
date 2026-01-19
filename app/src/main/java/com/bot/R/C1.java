package r;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class C1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public long f13990h;

    /* renamed from: i, reason: collision with root package name */
    public int f13991i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f13992j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E1 f13993k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(E1 e12, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13993k = e12;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        long j3 = ((e1.q) obj).a;
        C1 c12 = new C1(this.f13993k, (InterfaceC0905c) obj2);
        c12.f13992j = j3;
        return c12.r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1 c12 = new C1(this.f13993k, interfaceC0905c);
        c12.f13992j = ((e1.q) obj).a;
        return c12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f13991i
            r1 = 3
            r2 = 2
            r3 = 1
            r.E1 r4 = r14.f13993k
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L2f
            if (r0 == r3) goto L29
            if (r0 == r2) goto L21
            if (r0 != r1) goto L19
            long r0 = r14.f13990h
            long r2 = r14.f13992j
            X3.a.e(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r2 = r14.f13990h
            long r6 = r14.f13992j
            X3.a.e(r15)
            goto L57
        L29:
            long r6 = r14.f13992j
            X3.a.e(r15)
            goto L41
        L2f:
            X3.a.e(r15)
            long r6 = r14.f13992j
            A0.e r15 = r4.f14017f
            r14.f13992j = r6
            r14.f13991i = r3
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r5) goto L41
            goto L6e
        L41:
            e1.q r15 = (e1.q) r15
            long r8 = r15.a
            long r8 = e1.q.d(r6, r8)
            r14.f13992j = r6
            r14.f13990h = r8
            r14.f13991i = r2
            java.lang.Object r15 = r4.a(r8, r14)
            if (r15 != r5) goto L56
            goto L6e
        L56:
            r2 = r8
        L57:
            e1.q r15 = (e1.q) r15
            long r11 = r15.a
            A0.e r8 = r4.f14017f
            long r9 = e1.q.d(r2, r11)
            r14.f13992j = r6
            r14.f13990h = r11
            r14.f13991i = r1
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r2 = r6
            r0 = r11
        L71:
            e1.q r15 = (e1.q) r15
            long r4 = r15.a
            long r0 = e1.q.d(r0, r4)
            long r0 = e1.q.d(r2, r0)
            e1.q r15 = new e1.q
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1.r(java.lang.Object):java.lang.Object");
    }
}
