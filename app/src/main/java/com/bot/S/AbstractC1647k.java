package s;

import java.util.concurrent.CancellationException;
import n.C1332k;
import r.InterfaceC1563e1;

/* renamed from: s.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1647k {
    public static final float a = 400;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, m4.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(r.InterfaceC1563e1 r9, float r10, n.C1336m r11, n.C1347v r12, l4.c r13, d4.c r14) {
        /*
            boolean r0 = r14 instanceof s.C1645i
            if (r0 == 0) goto L13
            r0 = r14
            s.i r0 = (s.C1645i) r0
            int r1 = r0.f14719k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14719k = r1
            goto L18
        L13:
            s.i r0 = new s.i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f14718j
            int r1 = r0.f14719k
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            float r10 = r0.f14715g
            m4.t r9 = r0.f14717i
            n.m r11 = r0.f14716h
            X3.a.e(r14)
            goto L6a
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            X3.a.e(r14)
            m4.t r5 = new m4.t
            r5.<init>()
            java.lang.Object r14 = r11.a()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4c
            r14 = r2
            goto L4d
        L4c:
            r14 = 0
        L4d:
            r14 = r14 ^ r2
            s.h r3 = new s.h
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f14716h = r11
            r0.f14717i = r5
            r0.f14715g = r4
            r0.f14719k = r2
            java.lang.Object r9 = n.AbstractC1318d.f(r11, r12, r14, r3, r0)
            c4.a r10 = c4.EnumC0927a.f11114c
            if (r9 != r10) goto L68
            return r10
        L68:
            r10 = r4
            r9 = r5
        L6a:
            s.a r12 = new s.a
            float r9 = r9.f12970c
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: s.AbstractC1647k.a(r.e1, float, n.m, n.v, l4.c, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, m4.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(r.InterfaceC1563e1 r16, float r17, float r18, n.C1336m r19, n.InterfaceC1334l r20, l4.c r21, d4.c r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof s.C1646j
            if (r2 == 0) goto L18
            r2 = r1
            s.j r2 = (s.C1646j) r2
            int r3 = r2.f14725l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f14725l = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            s.j r2 = new s.j
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f14724k
            int r2 = r8.f14725l
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            float r0 = r8.f14721h
            float r2 = r8.f14720g
            m4.t r3 = r8.f14723j
            n.m r4 = r8.f14722i
            X3.a.e(r1)
            r1 = r0
            r0 = r2
            goto L90
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            X3.a.e(r1)
            m4.t r12 = new m4.t
            r12.<init>()
            java.lang.Object r1 = r19.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L65
            r2 = r3
            goto L66
        L65:
            r2 = 0
        L66:
            r6 = r2 ^ 1
            s.h r10 = new s.h
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.f14722i = r2
            r8.f14723j = r12
            r8.f14720g = r0
            r8.f14721h = r1
            r8.f14725l = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = n.AbstractC1318d.h(r3, r4, r5, r6, r7, r8)
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r2 != r3) goto L8d
            return r3
        L8d:
            r4 = r19
            r3 = r12
        L90:
            java.lang.Object r2 = r4.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = d(r2, r1)
            s.a r2 = new s.a
            float r3 = r3.f12970c
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            n.m r0 = n.AbstractC1318d.l(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s.AbstractC1647k.b(r.e1, float, float, n.m, n.l, l4.c, d4.c):java.lang.Object");
    }

    public static final void c(C1332k c1332k, InterfaceC1563e1 interfaceC1563e1, l4.c cVar, float f6) {
        float f7;
        try {
            f7 = interfaceC1563e1.a(f6);
        } catch (CancellationException unused) {
            c1332k.a();
            f7 = S.l.f7374V;
        }
        cVar.f(Float.valueOf(f7));
        if (Math.abs(f6 - f7) > 0.5f) {
            c1332k.a();
        }
    }

    public static final float d(float f6, float f7) {
        return f7 == S.l.f7374V ? S.l.f7374V : (f7 <= S.l.f7374V ? f6 >= f7 : f6 <= f7) ? f6 : f7;
    }
}
