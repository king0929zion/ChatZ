package L3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i {
    public final N4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3128b;

    public i(N4.c cVar) {
        this.a = cVar;
        List list = a.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((M3.d) it.next()).getClass();
            arrayList.add(new M3.f(cVar));
        }
        this.f3128b = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.nio.charset.Charset r13, R3.a r14, io.ktor.utils.io.y r15, d4.c r16) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.i.a(java.nio.charset.Charset, R3.a, io.ktor.utils.io.y, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r10v1, types: [d4.i, l4.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(I3.C0241e r10, java.nio.charset.Charset r11, R3.a r12, java.lang.Object r13, d4.c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof L3.g
            if (r0 == 0) goto L13
            r0 = r14
            L3.g r0 = (L3.g) r0
            int r1 = r0.f3126n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3126n = r1
            goto L18
        L13:
            L3.g r0 = new L3.g
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.f3124l
            int r1 = r0.f3126n
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r13 = r0.f3123k
            R3.a r12 = r0.f3122j
            java.nio.charset.Charset r11 = r0.f3121i
            I3.e r10 = r0.f3120h
            L3.i r0 = r0.f3119g
            X3.a.e(r14)
            goto L6b
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            X3.a.e(r14)
            A4.k r4 = new A4.k
            java.util.ArrayList r14 = r9.f3128b
            r4.<init>(r14)
            L3.f r3 = new L3.f
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            L3.h r10 = new L3.h
            r11 = 0
            r12 = 2
            r10.<init>(r12, r11)
            r0.f3119g = r9
            r0.f3120h = r5
            r0.f3121i = r6
            r0.f3122j = r7
            r0.f3123k = r8
            r0.f3126n = r2
            java.lang.Object r14 = A4.W.k(r3, r10, r0)
            c4.a r10 = c4.EnumC0927a.f11114c
            if (r14 != r10) goto L66
            return r10
        L66:
            r0 = r9
            r10 = r5
            r11 = r6
            r12 = r7
            r13 = r8
        L6b:
            J3.d r14 = (J3.d) r14
            if (r14 == 0) goto L70
            return r14
        L70:
            N4.c r14 = r0.a     // Catch: I4.e -> L79
            F2.h r14 = r14.f3883b     // Catch: I4.e -> L79
            kotlinx.serialization.KSerializer r12 = Y3.C.R(r14, r12)     // Catch: I4.e -> L79
            goto L81
        L79:
            N4.c r12 = r0.a
            F2.h r12 = r12.f3883b
            kotlinx.serialization.KSerializer r12 = Y3.C.z(r13, r12)
        L81:
            N4.c r14 = r0.a
            kotlinx.serialization.KSerializer r12 = (kotlinx.serialization.KSerializer) r12
            java.lang.String r12 = r14.b(r12, r13)
            J3.e r13 = new J3.e
            java.lang.String r14 = "<this>"
            m4.AbstractC1276k.f(r10, r14)
            java.lang.String r14 = "charset"
            m4.AbstractC1276k.f(r11, r14)
            java.lang.String r14 = r10.f2742d
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            m4.AbstractC1276k.e(r14, r0)
            java.lang.String r0 = "text"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto Lab
            goto Lb3
        Lab:
            java.lang.String r11 = T3.a.d(r11)
            I3.e r10 = r10.g(r11)
        Lb3:
            r13.<init>(r12, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.i.b(I3.e, java.nio.charset.Charset, R3.a, java.lang.Object, d4.c):java.lang.Object");
    }
}
