package r;

import B0.AbstractC0047x;
import B0.C0040p;
import Q.C0488y2;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.AbstractC1888A;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public abstract class f2 {
    public static final C1598q0 a = new C1598q0(3, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(B0.V r7, d4.a r8) {
        /*
            boolean r0 = r8 instanceof r.I1
            if (r0 == 0) goto L13
            r0 = r8
            r.I1 r0 = (r.I1) r0
            int r1 = r0.f14066i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14066i = r1
            goto L18
        L13:
            r.I1 r0 = new r.I1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14065h
            int r1 = r0.f14066i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            B0.V r7 = r0.f14064g
            X3.a.e(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            X3.a.e(r8)
        L32:
            r0.f14064g = r7
            r0.f14066i = r2
            B0.q r8 = B0.EnumC0041q.f476e
            java.lang.Object r8 = r7.b(r8, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r8 != r1) goto L41
            return r1
        L41:
            B0.p r8 = (B0.C0040p) r8
            java.lang.Object r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4b:
            if (r5 >= r3) goto L59
            java.lang.Object r6 = r1.get(r5)
            B0.y r6 = (B0.y) r6
            r6.a()
            int r5 = r5 + 1
            goto L4b
        L59:
            java.lang.Object r8 = r8.a
            int r1 = r8.size()
        L5f:
            if (r4 >= r1) goto L6f
            java.lang.Object r3 = r8.get(r4)
            B0.y r3 = (B0.y) r3
            boolean r3 = r3.f484d
            if (r3 == 0) goto L6c
            goto L32
        L6c:
            int r4 = r4 + 1
            goto L5f
        L6f:
            X3.y r7 = X3.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f2.a(B0.V, d4.a):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(B0.V r5, boolean r6, B0.EnumC0041q r7, b4.InterfaceC0905c r8) {
        /*
            boolean r0 = r8 instanceof r.F1
            if (r0 == 0) goto L13
            r0 = r8
            r.F1 r0 = (r.F1) r0
            int r1 = r0.f14035k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14035k = r1
            goto L18
        L13:
            r.F1 r0 = new r.F1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14034j
            int r1 = r0.f14035k
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r5 = r0.f14033i
            B0.q r6 = r0.f14032h
            B0.V r7 = r0.f14031g
            X3.a.e(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            X3.a.e(r8)
        L3a:
            r0.f14031g = r5
            r0.f14032h = r7
            r0.f14033i = r6
            r0.f14035k = r2
            java.lang.Object r8 = r5.b(r7, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r8 != r1) goto L4b
            return r1
        L4b:
            B0.p r8 = (B0.C0040p) r8
            r1 = 0
            boolean r3 = f(r8, r6, r1)
            if (r3 == 0) goto L3a
            java.lang.Object r5 = r8.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f2.b(B0.V, boolean, B0.q, b4.c):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0043 -> B:10:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(B0.V r5, B0.EnumC0041q r6, d4.a r7) {
        /*
            boolean r0 = r7 instanceof r.G1
            if (r0 == 0) goto L13
            r0 = r7
            r.G1 r0 = (r.G1) r0
            int r1 = r0.f14051j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14051j = r1
            goto L18
        L13:
            r.G1 r0 = new r.G1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14050i
            int r1 = r0.f14051j
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            B0.q r5 = r0.f14049h
            B0.V r6 = r0.f14048g
            X3.a.e(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L46
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            X3.a.e(r7)
        L37:
            r0.f14048g = r5
            r0.f14049h = r6
            r0.f14051j = r2
            java.lang.Object r7 = r5.b(r6, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r7 != r1) goto L46
            return r1
        L46:
            B0.p r7 = (B0.C0040p) r7
            r1 = 0
            boolean r3 = f(r7, r1, r2)
            if (r3 == 0) goto L37
            java.lang.Object r5 = r7.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f2.d(B0.V, B0.q, d4.a):java.lang.Object");
    }

    public static Object e(B0.D d6, Z2.X x5, C0488y2 c0488y2, l4.c cVar, InterfaceC0905c interfaceC0905c, int i6) {
        Z2.X x6 = (i6 & 1) != 0 ? null : x5;
        l4.f fVar = c0488y2;
        if ((i6 & 4) != 0) {
            fVar = a;
        }
        Object l3 = AbstractC1888A.l(new a2(d6, fVar, null, x6, (i6 & 8) != 0 ? null : cVar, null), interfaceC0905c);
        return l3 == EnumC0927a.f11114c ? l3 : X3.y.a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final boolean f(C0040p c0040p, boolean z5, boolean z6) {
        if (z6) {
            Object r7 = c0040p.a;
            int size = r7.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    if (((B0.y) r7.get(i6)).f489i != 2) {
                        break;
                    }
                    i6++;
                } else if ((c0040p.f472d & 33) == 0) {
                    return false;
                }
            }
        }
        Object r5 = c0040p.a;
        int size2 = r5.size();
        for (int i7 = 0; i7 < size2; i7++) {
            B0.y yVar = (B0.y) r5.get(i7);
            if (!(z5 ? AbstractC0047x.a(yVar) : AbstractC0047x.b(yVar))) {
                return false;
            }
        }
        return true;
    }

    public static x4.s0 g(InterfaceC1942y interfaceC1942y, InterfaceC1922e0 interfaceC1922e0, l4.e eVar) {
        return AbstractC1888A.y(interfaceC1942y, null, new b2(interfaceC1922e0, eVar, null), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [m4.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(B0.V r6, B0.EnumC0041q r7, d4.a r8) {
        /*
            boolean r0 = r8 instanceof r.c2
            if (r0 == 0) goto L13
            r0 = r8
            r.c2 r0 = (r.c2) r0
            int r1 = r0.f14277i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14277i = r1
            goto L18
        L13:
            r.c2 r0 = new r.c2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14276h
            int r1 = r0.f14277i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            m4.w r6 = r0.f14275g
            X3.a.e(r8)     // Catch: B0.r -> L5a
            goto L57
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            X3.a.e(r8)
            m4.w r8 = new m4.w
            r8.<init>()
            r.H0 r1 = r.C1524H0.a
            r8.f12973c = r1
            I0.X0 r1 = r6.g()     // Catch: B0.r -> L5a
            long r3 = r1.b()     // Catch: B0.r -> L5a
            r.d2 r1 = new r.d2     // Catch: B0.r -> L5a
            r5 = 0
            r1.<init>(r7, r8, r5)     // Catch: B0.r -> L5a
            r0.f14275g = r8     // Catch: B0.r -> L5a
            r0.f14277i = r2     // Catch: B0.r -> L5a
            java.lang.Object r6 = r6.h(r3, r1, r0)     // Catch: B0.r -> L5a
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r6 != r7) goto L56
            return r7
        L56:
            r6 = r8
        L57:
            java.lang.Object r6 = r6.f12973c
            return r6
        L5a:
            r.J0 r6 = r.C1528J0.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f2.h(B0.V, B0.q, d4.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (r15 == r5) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009e -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(B0.V r13, B0.EnumC0041q r14, d4.a r15) {
        /*
            boolean r0 = r15 instanceof r.e2
            if (r0 == 0) goto L13
            r0 = r15
            r.e2 r0 = (r.e2) r0
            int r1 = r0.f14306j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14306j = r1
            goto L18
        L13:
            r.e2 r0 = new r.e2
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f14305i
            int r1 = r0.f14306j
            r2 = 2
            r3 = 0
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r2) goto L33
            B0.q r13 = r0.f14304h
            B0.V r14 = r0.f14303g
            X3.a.e(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La1
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            B0.q r13 = r0.f14304h
            B0.V r14 = r0.f14303g
            X3.a.e(r15)
            goto L56
        L43:
            X3.a.e(r15)
        L46:
            r0.f14303g = r13
            r0.f14304h = r14
            r0.f14306j = r4
            java.lang.Object r15 = r13.b(r14, r0)
            if (r15 != r5) goto L53
            goto La0
        L53:
            r12 = r14
            r14 = r13
            r13 = r12
        L56:
            B0.p r15 = (B0.C0040p) r15
            java.lang.Object r15 = r15.a
            int r1 = r15.size()
            r6 = r3
        L5f:
            if (r6 >= r1) goto Lc0
            java.lang.Object r7 = r15.get(r6)
            B0.y r7 = (B0.y) r7
            boolean r7 = B0.AbstractC0047x.c(r7)
            if (r7 != 0) goto Lbd
            int r1 = r15.size()
            r6 = r3
        L72:
            if (r6 >= r1) goto L92
            java.lang.Object r7 = r15.get(r6)
            B0.y r7 = (B0.y) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb8
            B0.X r8 = r14.f419i
            long r8 = r8.f422A
            long r10 = r14.d()
            boolean r7 = B0.AbstractC0047x.f(r7, r8, r10)
            if (r7 == 0) goto L8f
            goto Lb8
        L8f:
            int r6 = r6 + 1
            goto L72
        L92:
            r0.f14303g = r14
            r0.f14304h = r13
            r0.f14306j = r2
            B0.q r15 = B0.EnumC0041q.f477f
            java.lang.Object r15 = r14.b(r15, r0)
            if (r15 != r5) goto L2e
        La0:
            return r5
        La1:
            B0.p r15 = (B0.C0040p) r15
            java.lang.Object r15 = r15.a
            int r1 = r15.size()
            r6 = r3
        Laa:
            if (r6 >= r1) goto L46
            java.lang.Object r7 = r15.get(r6)
            B0.y r7 = (B0.y) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lba
        Lb8:
            r13 = 0
            return r13
        Lba:
            int r6 = r6 + 1
            goto Laa
        Lbd:
            int r6 = r6 + 1
            goto L5f
        Lc0:
            java.lang.Object r13 = r15.get(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f2.i(B0.V, B0.q, d4.a):java.lang.Object");
    }
}
