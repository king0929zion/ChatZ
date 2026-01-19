package F3;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import z3.u;
import z3.v;

/* loaded from: classes.dex */
public final class k {
    public final E3.d a;

    /* renamed from: b, reason: collision with root package name */
    public final t3.d f1606b;

    public k(E3.d dVar, t3.d dVar2) {
        Set keySet;
        AbstractC1276k.f(dVar2, "client");
        this.a = dVar;
        this.f1606b = dVar2;
        Map map = (Map) dVar.f1309f.e(w3.f.a);
        if (map == null || (keySet = map.keySet()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (obj instanceof u) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            u uVar = (u) obj2;
            if (v.b(this.f1606b, uVar) == null) {
                throw new IllegalArgumentException(("Consider installing " + uVar + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(F3.c r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof F3.g
            if (r0 == 0) goto L13
            r0 = r6
            F3.g r0 = (F3.g) r0
            int r1 = r0.f1595i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1595i = r1
            goto L18
        L13:
            F3.g r0 = new F3.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f1593g
            int r1 = r0.f1595i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r6)
            goto L59
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            X3.a.e(r6)
            b4.h r6 = r5.c()
            x4.w r1 = x4.C1940w.f15731e
            b4.f r6 = r6.r(r1)
            m4.AbstractC1276k.c(r6)
            x4.q r6 = (x4.InterfaceC1934q) r6
            r1 = r6
            x4.g0 r1 = (x4.g0) r1
            r1.n0()
            io.ktor.utils.io.y r5 = r5.d()     // Catch: java.lang.Throwable -> L4c
            i4.AbstractC1120d.e(r5)     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0.f1595i = r2
            x4.l0 r6 = (x4.l0) r6
            java.lang.Object r5 = r6.Q(r0)
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r5 != r6) goto L59
            return r6
        L59:
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.k.a(F3.c, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [d4.i, l4.e] */
    public final Object b(d4.c cVar) {
        return c(new d4.i(2, null), cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:3|(9:5|6|7|(1:(1:(1:(1:(2:13|14)(3:16|17|18))(3:19|20|21))(5:22|23|24|25|(2:27|28)(1:29)))(2:35|36))(3:44|45|(2:47|28)(1:48))|37|38|39|(3:41|25|(0)(0))|28))|7|(0)(0)|37|38|39|(0)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r1.a(r11, r0) == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(l4.e r10, d4.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof F3.h
            if (r0 == 0) goto L13
            r0 = r11
            F3.h r0 = (F3.h) r0
            int r1 = r0.f1600k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1600k = r1
            goto L18
        L13:
            F3.h r0 = new F3.h
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f1598i
            int r1 = r0.f1600k
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L64
            if (r1 == r6) goto L58
            if (r1 == r5) goto L47
            if (r1 == r4) goto L41
            if (r1 == r3) goto L35
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            java.lang.Object r10 = r0.f1596g
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            X3.a.e(r11)     // Catch: java.util.concurrent.CancellationException -> L3e
            goto La3
        L3e:
            r10 = move-exception
            goto La4
        L41:
            java.lang.Object r10 = r0.f1596g
            X3.a.e(r11)     // Catch: java.util.concurrent.CancellationException -> L3e
            return r10
        L47:
            java.lang.Object r10 = r0.f1597h
            F3.c r10 = (F3.c) r10
            java.lang.Object r1 = r0.f1596g
            F3.k r1 = (F3.k) r1
            X3.a.e(r11)     // Catch: java.lang.Throwable -> L53
            goto L87
        L53:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L96
        L58:
            java.lang.Object r10 = r0.f1597h
            l4.e r10 = (l4.e) r10
            java.lang.Object r1 = r0.f1596g
            F3.k r1 = (F3.k) r1
            X3.a.e(r11)     // Catch: java.util.concurrent.CancellationException -> L3e
            goto L75
        L64:
            X3.a.e(r11)
            r0.f1596g = r9     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f1597h = r10     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f1600k = r6     // Catch: java.util.concurrent.CancellationException -> L3e
            java.lang.Object r11 = r9.d(r0)     // Catch: java.util.concurrent.CancellationException -> L3e
            if (r11 != r7) goto L74
            goto La2
        L74:
            r1 = r9
        L75:
            F3.c r11 = (F3.c) r11     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f1596g = r1     // Catch: java.lang.Throwable -> L95
            r0.f1597h = r11     // Catch: java.lang.Throwable -> L95
            r0.f1600k = r5     // Catch: java.lang.Throwable -> L95
            java.lang.Object r10 = r10.m(r11, r0)     // Catch: java.lang.Throwable -> L95
            if (r10 != r7) goto L84
            goto La2
        L84:
            r8 = r11
            r11 = r10
            r10 = r8
        L87:
            r0.f1596g = r11     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f1597h = r2     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f1600k = r4     // Catch: java.util.concurrent.CancellationException -> L3e
            java.lang.Object r10 = r1.a(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L3e
            if (r10 != r7) goto L94
            goto La2
        L94:
            return r11
        L95:
            r10 = move-exception
        L96:
            r0.f1596g = r10     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f1597h = r2     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.f1600k = r3     // Catch: java.util.concurrent.CancellationException -> L3e
            java.lang.Object r11 = r1.a(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L3e
            if (r11 != r7) goto La3
        La2:
            return r7
        La3:
            throw r10     // Catch: java.util.concurrent.CancellationException -> L3e
        La4:
            java.lang.Throwable r10 = G3.b.b(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.k.c(l4.e, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(d4.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof F3.j
            if (r0 == 0) goto L13
            r0 = r5
            F3.j r0 = (F3.j) r0
            int r1 = r0.f1605i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1605i = r1
            goto L18
        L13:
            F3.j r0 = new F3.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1603g
            int r1 = r0.f1605i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            X3.a.e(r5)     // Catch: java.util.concurrent.CancellationException -> L25
            goto L49
        L25:
            r5 = move-exception
            goto L50
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            X3.a.e(r5)
            E3.d r5 = new E3.d     // Catch: java.util.concurrent.CancellationException -> L25
            r5.<init>()     // Catch: java.util.concurrent.CancellationException -> L25
            E3.d r1 = r4.a     // Catch: java.util.concurrent.CancellationException -> L25
            r5.d(r1)     // Catch: java.util.concurrent.CancellationException -> L25
            t3.d r1 = r4.f1606b     // Catch: java.util.concurrent.CancellationException -> L25
            r0.f1605i = r2     // Catch: java.util.concurrent.CancellationException -> L25
            java.lang.Object r5 = r1.d(r5, r0)     // Catch: java.util.concurrent.CancellationException -> L25
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L49
            return r0
        L49:
            u3.c r5 = (u3.C1759c) r5     // Catch: java.util.concurrent.CancellationException -> L25
            F3.c r5 = r5.e()     // Catch: java.util.concurrent.CancellationException -> L25
            return r5
        L50:
            java.lang.Throwable r5 = G3.b.b(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.k.d(d4.c):java.lang.Object");
    }

    public final String toString() {
        return "HttpStatement[" + this.a.a + ']';
    }
}
