package A4;

import B4.AbstractC0050c;
import B4.AbstractC0054g;
import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import com.vladsch.flexmark.util.format.TableCell;
import x4.AbstractC1888A;
import x4.EnumC1943z;
import x4.InterfaceC1942y;
import z4.C2060k;
import z4.EnumC2050a;
import z4.InterfaceC2061l;

/* loaded from: classes.dex */
public abstract class W {
    public static final C4.u a = new C4.u("NO_VALUE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final C4.u f221b = new C4.u("NONE", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C4.u f222c = new C4.u("PENDING", 0);

    public static V a(int i6, int i7, EnumC2050a enumC2050a) {
        int i8 = (i7 & 1) != 0 ? 0 : 1;
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        if ((i7 & 4) != 0) {
            enumC2050a = EnumC2050a.f16327c;
        }
        if (i8 < 0) {
            throw new IllegalArgumentException(B3.e.h(i8, "replay cannot be negative, but was ").toString());
        }
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i8 <= 0 && i6 <= 0 && enumC2050a != EnumC2050a.f16327c) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC2050a).toString());
        }
        int i9 = i6 + i8;
        if (i9 < 0) {
            i9 = TableCell.NOT_TRACKED;
        }
        return new V(i8, i9, enumC2050a);
    }

    public static final g0 b(Object obj) {
        if (obj == null) {
            obj = AbstractC0050c.f579b;
        }
        return new g0(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(A4.i0 r4, Q.C0480w2 r5, java.lang.Throwable r6, d4.c r7) {
        /*
            boolean r0 = r7 instanceof A4.C0018t
            if (r0 == 0) goto L13
            r0 = r7
            A4.t r0 = (A4.C0018t) r0
            int r1 = r0.f307i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f307i = r1
            goto L18
        L13:
            A4.t r0 = new A4.t
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f306h
            int r1 = r0.f307i
            X3.y r2 = X3.y.a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            java.lang.Throwable r6 = r0.f305g
            X3.a.e(r7)     // Catch: java.lang.Throwable -> L29
            goto L42
        L29:
            r4 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            X3.a.e(r7)
            r0.f305g = r6     // Catch: java.lang.Throwable -> L29
            r0.f307i = r3     // Catch: java.lang.Throwable -> L29
            r5.d(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r2 != r4) goto L42
            return r4
        L42:
            return r2
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            X3.a.a(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.W.c(A4.i0, Q.w2, java.lang.Throwable, d4.c):java.lang.Object");
    }

    public static final void d(Object[] objArr, long j3, Object obj) {
        objArr[((int) j3) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC0007h e(InterfaceC0007h interfaceC0007h, int i6) {
        EnumC2050a enumC2050a;
        if (i6 < 0 && i6 != -2 && i6 != -1) {
            throw new IllegalArgumentException(B3.e.h(i6, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i6 == -1) {
            i6 = 0;
            enumC2050a = EnumC2050a.f16328e;
        } else {
            enumC2050a = EnumC2050a.f16327c;
        }
        return interfaceC0007h instanceof B4.w ? AbstractC0050c.b((B4.w) interfaceC0007h, null, i6, enumC2050a, 1) : new B4.i(interfaceC0007h, C0911i.f11057c, i6, enumC2050a);
    }

    public static final Object f(InterfaceC0007h interfaceC0007h, l4.e eVar, d4.i iVar) {
        int i6 = A.a;
        Object b5 = e(new B4.o(new A3.f(eVar, (InterfaceC0905c) null), interfaceC0007h, C0911i.f11057c, -2, EnumC2050a.f16327c), 0).b(B4.y.f640c, iVar);
        X3.y yVar = X3.y.a;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (b5 != enumC0927a) {
            b5 = yVar;
        }
        return b5 == enumC0927a ? b5 : yVar;
    }

    public static final InterfaceC0007h g(InterfaceC0007h interfaceC0007h) {
        if (interfaceC0007h instanceof e0) {
            return interfaceC0007h;
        }
        if (!(interfaceC0007h instanceof C0006g)) {
            return new C0006g(interfaceC0007h);
        }
        ((C0006g) interfaceC0007h).getClass();
        return interfaceC0007h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r10 == r5) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0056, B:20:0x006b, B:22:0x0073, B:32:0x0047, B:35:0x0052), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0085 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(A4.InterfaceC0008i r7, z4.w r8, boolean r9, b4.InterfaceC0905c r10) {
        /*
            boolean r0 = r10 instanceof A4.C0011l
            if (r0 == 0) goto L13
            r0 = r10
            A4.l r0 = (A4.C0011l) r0
            int r1 = r0.f277l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f277l = r1
            goto L18
        L13:
            A4.l r0 = new A4.l
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f276k
            int r1 = r0.f277l
            r2 = 0
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L37
            boolean r9 = r0.f275j
            z4.c r7 = r0.f274i
            z4.w r8 = r0.f273h
            A4.i r1 = r0.f272g
            X3.a.e(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f275j
            z4.c r7 = r0.f274i
            z4.w r8 = r0.f273h
            A4.i r1 = r0.f272g
            X3.a.e(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            X3.a.e(r10)
            boolean r10 = r7 instanceof A4.i0
            if (r10 != 0) goto La7
            z4.c r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f272g = r7     // Catch: java.lang.Throwable -> L35
            r0.f273h = r8     // Catch: java.lang.Throwable -> L35
            r0.f274i = r10     // Catch: java.lang.Throwable -> L35
            r0.f275j = r9     // Catch: java.lang.Throwable -> L35
            r0.f277l = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L67
            goto L87
        L67:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f272g = r1     // Catch: java.lang.Throwable -> L35
            r0.f273h = r8     // Catch: java.lang.Throwable -> L35
            r0.f274i = r7     // Catch: java.lang.Throwable -> L35
            r0.f275j = r9     // Catch: java.lang.Throwable -> L35
            r0.f277l = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.a(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L87:
            return r5
        L88:
            if (r9 == 0) goto L8d
            r8.f(r2)
        L8d:
            X3.y r7 = X3.y.a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto La6
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L9b:
            if (r2 != 0) goto La3
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r2 = x4.AbstractC1888A.a(r9, r7)
        La3:
            r8.f(r2)
        La6:
            throw r10
        La7:
            A4.i0 r7 = (A4.i0) r7
            java.lang.Throwable r7 = r7.f264c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.W.h(A4.i, z4.w, boolean, b4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [m4.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(A4.InterfaceC0007h r5, d4.c r6) {
        /*
            C4.u r0 = B4.AbstractC0050c.f579b
            boolean r1 = r6 instanceof A4.D
            if (r1 == 0) goto L15
            r1 = r6
            A4.D r1 = (A4.D) r1
            int r2 = r1.f160j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f160j = r2
            goto L1a
        L15:
            A4.D r1 = new A4.D
            r1.<init>(r6)
        L1a:
            java.lang.Object r6 = r1.f159i
            int r2 = r1.f160j
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            A4.q r5 = r1.f158h
            m4.w r1 = r1.f157g
            X3.a.e(r6)     // Catch: B4.C0048a -> L2b
            goto L5e
        L2b:
            r6 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            X3.a.e(r6)
            m4.w r6 = new m4.w
            r6.<init>()
            r6.f12973c = r0
            A4.q r2 = new A4.q
            r4 = 1
            r2.<init>(r6, r4)
            r1.f157g = r6     // Catch: B4.C0048a -> L56
            r1.f158h = r2     // Catch: B4.C0048a -> L56
            r1.f160j = r3     // Catch: B4.C0048a -> L56
            java.lang.Object r5 = r5.b(r2, r1)     // Catch: B4.C0048a -> L56
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r5 != r1) goto L54
            return r1
        L54:
            r1 = r6
            goto L5e
        L56:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L5a:
            java.lang.Object r2 = r6.f574c
            if (r2 != r5) goto L6b
        L5e:
            java.lang.Object r5 = r1.f12973c
            if (r5 == r0) goto L63
            return r5
        L63:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.W.i(A4.h, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [m4.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(A4.InterfaceC0007h r5, l4.e r6, d4.c r7) {
        /*
            C4.u r0 = B4.AbstractC0050c.f579b
            boolean r1 = r7 instanceof A4.E
            if (r1 == 0) goto L15
            r1 = r7
            A4.E r1 = (A4.E) r1
            int r2 = r1.f165k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f165k = r2
            goto L1a
        L15:
            A4.E r1 = new A4.E
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f164j
            int r2 = r1.f165k
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            A4.C r5 = r1.f163i
            m4.w r6 = r1.f162h
            d4.i r1 = r1.f161g
            l4.e r1 = (l4.e) r1
            X3.a.e(r7)     // Catch: B4.C0048a -> L2f
            goto L69
        L2f:
            r7 = move-exception
            goto L65
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            X3.a.e(r7)
            m4.w r7 = new m4.w
            r7.<init>()
            r7.f12973c = r0
            A4.C r2 = new A4.C
            r4 = 0
            r2.<init>(r6, r7, r4)
            r4 = r6
            d4.i r4 = (d4.i) r4     // Catch: B4.C0048a -> L60
            r1.f161g = r4     // Catch: B4.C0048a -> L60
            r1.f162h = r7     // Catch: B4.C0048a -> L60
            r1.f163i = r2     // Catch: B4.C0048a -> L60
            r1.f165k = r3     // Catch: B4.C0048a -> L60
            java.lang.Object r5 = r5.b(r2, r1)     // Catch: B4.C0048a -> L60
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r5 != r1) goto L5d
            return r1
        L5d:
            r1 = r6
            r6 = r7
            goto L69
        L60:
            r5 = move-exception
            r1 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L65:
            java.lang.Object r2 = r7.f574c
            if (r2 != r5) goto L82
        L69:
            java.lang.Object r5 = r6.f12973c
            if (r5 == r0) goto L6e
            return r5
        L6e:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L82:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.W.j(A4.h, l4.e, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [m4.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(A4.InterfaceC0007h r4, l4.e r5, d4.c r6) {
        /*
            boolean r0 = r6 instanceof A4.G
            if (r0 == 0) goto L13
            r0 = r6
            A4.G r0 = (A4.G) r0
            int r1 = r0.f174j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174j = r1
            goto L18
        L13:
            A4.G r0 = new A4.G
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f173i
            int r1 = r0.f174j
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            A4.C r4 = r0.f172h
            m4.w r5 = r0.f171g
            X3.a.e(r6)     // Catch: B4.C0048a -> L29
            goto L5a
        L29:
            r6 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            X3.a.e(r6)
            m4.w r6 = new m4.w
            r6.<init>()
            A4.C r1 = new A4.C
            r3 = 1
            r1.<init>(r5, r6, r3)
            r0.f171g = r6     // Catch: B4.C0048a -> L52
            r0.f172h = r1     // Catch: B4.C0048a -> L52
            r0.f174j = r2     // Catch: B4.C0048a -> L52
            java.lang.Object r4 = r4.b(r1, r0)     // Catch: B4.C0048a -> L52
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r4 != r5) goto L50
            return r5
        L50:
            r5 = r6
            goto L5a
        L52:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r1
        L56:
            java.lang.Object r0 = r6.f574c
            if (r0 != r4) goto L5d
        L5a:
            java.lang.Object r4 = r5.f12973c
            return r4
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.W.k(A4.h, l4.e, d4.c):java.lang.Object");
    }

    public static final InterfaceC0007h l(S s5, InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        return ((i6 == 0 || i6 == -3) && enumC2050a == EnumC2050a.f16327c) ? s5 : new B4.i(s5, interfaceC0910h, i6, enumC2050a);
    }

    public static final Q m(InterfaceC0007h interfaceC0007h, InterfaceC1942y interfaceC1942y, d0 d0Var, Object obj) {
        M.q qVar;
        AbstractC0054g abstractC0054g;
        InterfaceC0007h g3;
        InterfaceC2061l.f16372d.getClass();
        C2060k c2060k = C2060k.a;
        int i6 = 1;
        if (!(interfaceC0007h instanceof AbstractC0054g) || (g3 = (abstractC0054g = (AbstractC0054g) interfaceC0007h).g()) == null) {
            qVar = new M.q(i6, interfaceC0007h, C0911i.f11057c);
        } else {
            if (abstractC0054g.f590e != -3) {
            }
            qVar = new M.q(i6, g3, abstractC0054g.f589c);
        }
        g0 b5 = b(obj);
        AbstractC1888A.x(interfaceC1942y, (InterfaceC0910h) qVar.f3180f, d0Var.equals(Z.a) ? EnumC1943z.f15739c : EnumC1943z.f15742g, new J(d0Var, (InterfaceC0007h) qVar.f3179e, b5, obj, null));
        return new Q(b5);
    }
}
