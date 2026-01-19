package z3;

import m4.AbstractC1276k;
import u3.C1759c;

/* renamed from: z3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2030H implements S {
    public final t3.d a;

    /* renamed from: b, reason: collision with root package name */
    public int f16243b;

    /* renamed from: c, reason: collision with root package name */
    public C1759c f16244c;

    public C2030H(t3.d dVar) {
        AbstractC1276k.f(dVar, "client");
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // z3.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E3.d r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof z3.C2029G
            if (r0 == 0) goto L13
            r0 = r6
            z3.G r0 = (z3.C2029G) r0
            int r1 = r0.f16242j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16242j = r1
            goto L18
        L13:
            z3.G r0 = new z3.G
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f16240h
            int r1 = r0.f16242j
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            z3.H r5 = r0.f16239g
            X3.a.e(r6)
            goto L57
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            X3.a.e(r6)
            u3.c r6 = r4.f16244c
            if (r6 == 0) goto L3a
            x4.AbstractC1888A.j(r6, r2)
        L3a:
            int r6 = r4.f16243b
            r1 = 20
            if (r6 >= r1) goto L7b
            int r6 = r6 + r3
            r4.f16243b = r6
            t3.d r6 = r4.a
            E3.f r6 = r6.f14927j
            java.lang.Object r1 = r5.f1307d
            r0.f16239g = r4
            r0.f16242j = r3
            java.lang.Object r6 = r6.a(r5, r1, r0)
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r6 != r5) goto L56
            return r5
        L56:
            r5 = r4
        L57:
            boolean r0 = r6 instanceof u3.C1759c
            if (r0 == 0) goto L5e
            r2 = r6
            u3.c r2 = (u3.C1759c) r2
        L5e:
            if (r2 == 0) goto L63
            r5.f16244c = r2
            return r2
        L63:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L7b:
            I3.C r5 = new I3.C
            java.lang.String r6 = "Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required."
            r0 = 3
            r5.<init>(r6, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.C2030H.a(E3.d, d4.c):java.lang.Object");
    }
}
