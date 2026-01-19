package r;

/* renamed from: r.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1593o1 implements A0.a {

    /* renamed from: c, reason: collision with root package name */
    public final E1 f14427c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14428e;

    public C1593o1(E1 e12, boolean z5) {
        this.f14427c = e12;
        this.f14428e = z5;
    }

    @Override // A0.a
    public final long s0(long j3, long j4, int i6) {
        if (!this.f14428e) {
            return 0L;
        }
        E1 e12 = this.f14427c;
        if (e12.a.b()) {
            return 0L;
        }
        return e12.h(e12.d(e12.a.e(e12.d(e12.g(j4)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // A0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(long r4, long r6, b4.InterfaceC0905c r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof r.C1590n1
            if (r4 == 0) goto L13
            r4 = r8
            r.n1 r4 = (r.C1590n1) r4
            int r5 = r4.f14406j
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.f14406j = r5
            goto L1a
        L13:
            r.n1 r4 = new r.n1
            d4.c r8 = (d4.c) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.f14404h
            int r8 = r4.f14406j
            r0 = 1
            if (r8 == 0) goto L31
            if (r8 != r0) goto L29
            long r6 = r4.f14403g
            X3.a.e(r5)
            goto L4e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            X3.a.e(r5)
            boolean r5 = r3.f14428e
            r1 = 0
            if (r5 == 0) goto L56
            r.E1 r5 = r3.f14427c
            boolean r8 = r5.f14020i
            if (r8 == 0) goto L41
            goto L52
        L41:
            r4.f14403g = r6
            r4.f14406j = r0
            java.lang.Object r5 = r5.a(r6, r4)
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r5 != r4) goto L4e
            return r4
        L4e:
            e1.q r5 = (e1.q) r5
            long r1 = r5.a
        L52:
            long r1 = e1.q.d(r6, r1)
        L56:
            e1.q r4 = new e1.q
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1593o1.z(long, long, b4.c):java.lang.Object");
    }
}
