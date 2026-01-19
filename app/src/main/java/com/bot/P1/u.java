package P1;

import N1.A;
import N1.B;
import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class u implements B, v {
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4637b;

    /* renamed from: c, reason: collision with root package name */
    public final Y3.j f4638c = new Y3.j();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4639d = new AtomicBoolean(false);

    public u(h hVar, boolean z5) {
        this.a = hVar;
        this.f4637b = z5;
    }

    @Override // N1.B
    public final Object a(d4.i iVar) {
        if (this.f4639d.get()) {
            h5.e.l0(21, "Connection is recycled");
            throw null;
        }
        InterfaceC0910h interfaceC0910h = iVar.f11435e;
        AbstractC1276k.c(interfaceC0910h);
        a aVar = (a) interfaceC0910h.r(a.f4552e);
        if (aVar != null && aVar.f4553c == this) {
            return Boolean.valueOf(!this.f4638c.isEmpty());
        }
        h5.e.l0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // N1.InterfaceC0293o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, l4.c r7, d4.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof P1.t
            if (r0 == 0) goto L13
            r0 = r8
            P1.t r0 = (P1.t) r0
            int r1 = r0.f4636m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4636m = r1
            goto L18
        L13:
            P1.t r0 = new P1.t
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f4634k
            int r1 = r0.f4636m
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            P1.h r6 = r0.f4633j
            l4.c r7 = r0.f4632i
            java.lang.String r1 = r0.f4631h
            P1.u r0 = r0.f4630g
            X3.a.e(r8)
            r8 = r6
            r6 = r1
            goto L70
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            X3.a.e(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.f4639d
            boolean r8 = r8.get()
            r1 = 21
            if (r8 != 0) goto L99
            b4.h r8 = r0.f11435e
            m4.AbstractC1276k.c(r8)
            F2.h r4 = P1.a.f4552e
            b4.f r8 = r8.r(r4)
            P1.a r8 = (P1.a) r8
            if (r8 == 0) goto L93
            P1.u r8 = r8.f4553c
            if (r8 != r5) goto L93
            r0.f4630g = r5
            r0.f4631h = r6
            r0.f4632i = r7
            P1.h r8 = r5.a
            r0.f4633j = r8
            r0.f4636m = r2
            H4.a r1 = r8.f4579e
            java.lang.Object r0 = r1.d(r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
        L70:
            P1.n r1 = new P1.n     // Catch: java.lang.Throwable -> L86
            P1.h r2 = r0.a     // Catch: java.lang.Throwable -> L86
            X1.c r6 = r2.c0(r6)     // Catch: java.lang.Throwable -> L86
            r1.<init>(r0, r6)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r6 = r7.f(r1)     // Catch: java.lang.Throwable -> L88
            i4.AbstractC1120d.h(r1, r3)     // Catch: java.lang.Throwable -> L86
            r8.c(r3)
            return r6
        L86:
            r6 = move-exception
            goto L8f
        L88:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L8a
        L8a:
            r7 = move-exception
            i4.AbstractC1120d.h(r1, r6)     // Catch: java.lang.Throwable -> L86
            throw r7     // Catch: java.lang.Throwable -> L86
        L8f:
            r8.c(r3)
            throw r6
        L93:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            h5.e.l0(r1, r6)
            throw r3
        L99:
            java.lang.String r6 = "Connection is recycled"
            h5.e.l0(r1, r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.u.b(java.lang.String, l4.c, d4.c):java.lang.Object");
    }

    @Override // P1.v
    public final X1.a c() {
        return this.a;
    }

    @Override // N1.B
    public final Object d(A a, l4.e eVar, d4.i iVar) {
        if (this.f4639d.get()) {
            h5.e.l0(21, "Connection is recycled");
            throw null;
        }
        InterfaceC0910h interfaceC0910h = iVar.f11435e;
        AbstractC1276k.c(interfaceC0910h);
        a aVar = (a) interfaceC0910h.r(a.f4552e);
        if (aVar != null && aVar.f4553c == this) {
            return g(a, eVar, iVar);
        }
        h5.e.l0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x0051, B:14:0x005d, B:19:0x0068, B:20:0x0096, B:24:0x0070, B:25:0x0075, B:26:0x0076, B:27:0x007c, B:28:0x0082), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x0051, B:14:0x005d, B:19:0x0068, B:20:0x0096, B:24:0x0070, B:25:0x0075, B:26:0x0076, B:27:0x007c, B:28:0x0082), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(N1.A r8, d4.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r9 instanceof P1.q
            if (r1 == 0) goto L15
            r1 = r9
            P1.q r1 = (P1.q) r1
            int r2 = r1.f4617l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f4617l = r2
            goto L1a
        L15:
            P1.q r1 = new P1.q
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f4615j
            int r2 = r1.f4617l
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            P1.h r8 = r1.f4614i
            N1.A r2 = r1.f4613h
            P1.u r1 = r1.f4612g
            X3.a.e(r9)
            r9 = r8
            r8 = r2
            goto L50
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            X3.a.e(r9)
            r1.f4612g = r7
            r1.f4613h = r8
            P1.h r9 = r7.a
            r1.f4614i = r9
            r1.f4617l = r3
            H4.a r2 = r9.f4579e
            java.lang.Object r1 = r2.d(r1)
            c4.a r2 = c4.EnumC0927a.f11114c
            if (r1 != r2) goto L4f
            return r2
        L4f:
            r1 = r7
        L50:
            r2 = 0
            Y3.j r4 = r1.f4638c     // Catch: java.lang.Throwable -> L6e
            P1.h r1 = r1.a     // Catch: java.lang.Throwable -> L6e
            int r5 = r4.f9805f     // Catch: java.lang.Throwable -> L6e
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L82
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L7c
            if (r8 == r3) goto L76
            r0 = 2
            if (r8 != r0) goto L70
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            h5.e.S(r8, r1)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L6e:
            r8 = move-exception
            goto La4
        L70:
            N0.e r8 = new N0.e     // Catch: java.lang.Throwable -> L6e
            r8.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r8     // Catch: java.lang.Throwable -> L6e
        L76:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            h5.e.S(r8, r1)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L7c:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            h5.e.S(r8, r1)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L82:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            r8.append(r5)     // Catch: java.lang.Throwable -> L6e
            r0 = 39
            r8.append(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6e
            h5.e.S(r8, r1)     // Catch: java.lang.Throwable -> L6e
        L96:
            P1.p r8 = new P1.p     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L6e
            r4.addLast(r8)     // Catch: java.lang.Throwable -> L6e
            X3.y r8 = X3.y.a     // Catch: java.lang.Throwable -> L6e
            r9.c(r2)
            return r8
        La4:
            r9.c(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.u.e(N1.A, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:12:0x0051, B:14:0x005b, B:16:0x0065, B:18:0x006e, B:19:0x00ab, B:23:0x0076, B:24:0x008b, B:26:0x0091, B:27:0x0097, B:28:0x00b1, B:29:0x00b8), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #0 {all -> 0x0074, blocks: (B:12:0x0051, B:14:0x005b, B:16:0x0065, B:18:0x006e, B:19:0x00ab, B:23:0x0076, B:24:0x008b, B:26:0x0091, B:27:0x0097, B:28:0x00b1, B:29:0x00b8), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r8, d4.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r9 instanceof P1.r
            if (r2 == 0) goto L17
            r2 = r9
            P1.r r2 = (P1.r) r2
            int r3 = r2.f4623l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f4623l = r3
            goto L1c
        L17:
            P1.r r2 = new P1.r
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.f4621j
            int r3 = r2.f4623l
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            boolean r8 = r2.f4620i
            P1.h r3 = r2.f4619h
            P1.u r2 = r2.f4618g
            X3.a.e(r9)
            goto L50
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            X3.a.e(r9)
            r2.f4618g = r7
            P1.h r3 = r7.a
            r2.f4619h = r3
            r2.f4620i = r8
            r2.f4623l = r4
            H4.a r9 = r3.f4579e
            java.lang.Object r9 = r9.d(r2)
            c4.a r2 = c4.EnumC0927a.f11114c
            if (r9 != r2) goto L4f
            return r2
        L4f:
            r2 = r7
        L50:
            r9 = 0
            Y3.j r4 = r2.f4638c     // Catch: java.lang.Throwable -> L74
            P1.h r2 = r2.a     // Catch: java.lang.Throwable -> L74
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto Lb1
            java.lang.Object r5 = Y3.r.f0(r4)     // Catch: java.lang.Throwable -> L74
            P1.p r5 = (P1.p) r5     // Catch: java.lang.Throwable -> L74
            r6 = 39
            if (r8 == 0) goto L8b
            r5.getClass()     // Catch: java.lang.Throwable -> L74
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L76
            java.lang.String r8 = "END TRANSACTION"
            h5.e.S(r8, r2)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L74:
            r8 = move-exception
            goto Lb9
        L76:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L74
            int r0 = r5.a     // Catch: java.lang.Throwable -> L74
            r8.append(r0)     // Catch: java.lang.Throwable -> L74
            r8.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            h5.e.S(r8, r2)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L8b:
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L97
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            h5.e.S(r8, r2)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L97:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L74
            int r0 = r5.a     // Catch: java.lang.Throwable -> L74
            r8.append(r0)     // Catch: java.lang.Throwable -> L74
            r8.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            h5.e.S(r8, r2)     // Catch: java.lang.Throwable -> L74
        Lab:
            X3.y r8 = X3.y.a     // Catch: java.lang.Throwable -> L74
            r3.c(r9)
            return r8
        Lb1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "Not in a transaction"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L74
            throw r8     // Catch: java.lang.Throwable -> L74
        Lb9:
            r3.c(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.u.f(boolean, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(N1.A r10, l4.e r11, d4.c r12) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.u.g(N1.A, l4.e, d4.c):java.lang.Object");
    }
}
