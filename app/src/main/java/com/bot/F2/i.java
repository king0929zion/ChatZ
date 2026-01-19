package F2;

import D.C0080m;
import X3.n;

/* loaded from: classes.dex */
public final class i {
    public static final a Companion = new Object();
    public final n a = X3.a.d(new C0080m(18));

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r7, java.lang.String r8, d4.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof F2.b
            if (r0 == 0) goto L13
            r0 = r9
            F2.b r0 = (F2.b) r0
            int r1 = r0.f1549i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1549i = r1
            goto L18
        L13:
            F2.b r0 = new F2.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f1547g
            int r1 = r0.f1549i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r9)
            goto L70
        L25:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2d:
            X3.a.e(r9)
            X3.i r9 = new X3.i
            java.lang.String r1 = "anthropic-version"
            java.lang.String r3 = "2023-06-01"
            r9.<init>(r1, r3)
            X3.i[] r9 = new X3.i[]{r9}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r3 = Y3.C.H(r2)
            r1.<init>(r3)
            Y3.B.a0(r1, r9)
            if (r8 == 0) goto L5f
            boolean r9 = u4.AbstractC1776n.Q(r8)
            if (r9 == 0) goto L52
            goto L5f
        L52:
            java.lang.CharSequence r8 = u4.AbstractC1776n.l0(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "x-api-key"
            r1.put(r9, r8)
        L5f:
            java.lang.String r8 = "/models"
            java.lang.String r7 = B3.e.n(r7, r8)
            r0.f1549i = r2
            java.lang.Object r9 = r6.c(r7, r1, r0)
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r9 != r7) goto L70
            return r7
        L70:
            java.lang.String r9 = (java.lang.String) r9
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>(r9)
            java.lang.String r8 = "data"
            org.json.JSONArray r7 = r7.optJSONArray(r8)
            if (r7 != 0) goto L82
            Y3.v r7 = Y3.v.f9812c
            return r7
        L82:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r7.length()
            r0 = 0
        L8c:
            if (r0 >= r9) goto Lde
            org.json.JSONObject r1 = r7.optJSONObject(r0)
            if (r1 != 0) goto L95
            goto Ldb
        L95:
            java.lang.String r2 = "id"
            java.lang.String r2 = r1.optString(r2)
            java.lang.String r3 = "optString(...)"
            m4.AbstractC1276k.e(r2, r3)
            java.lang.CharSequence r2 = u4.AbstractC1776n.l0(r2)
            java.lang.String r2 = r2.toString()
            int r3 = r2.length()
            if (r3 <= 0) goto Ldb
            java.lang.String r3 = "display_name"
            java.lang.String r3 = r1.optString(r3)
            m4.AbstractC1276k.c(r3)
            boolean r4 = u4.AbstractC1776n.Q(r3)
            r5 = 0
            if (r4 != 0) goto Lbf
            goto Lc0
        Lbf:
            r3 = r5
        Lc0:
            if (r3 != 0) goto Lc3
            r3 = r2
        Lc3:
            java.lang.String r4 = "owned_by"
            java.lang.String r1 = r1.optString(r4)
            m4.AbstractC1276k.c(r1)
            boolean r4 = u4.AbstractC1776n.Q(r1)
            if (r4 != 0) goto Ld3
            r5 = r1
        Ld3:
            com.bot.feature.settings.data.ModelConfig r1 = new com.bot.feature.settings.data.ModelConfig
            r1.<init>(r2, r3, r5)
            r8.add(r1)
        Ldb:
            int r0 = r0 + 1
            goto L8c
        Lde:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.a(java.lang.String, java.lang.String, d4.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.lang.String r6, java.lang.String r7, java.lang.String r8, d4.c r9) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.b(java.lang.String, java.lang.String, java.lang.String, d4.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (r9 != r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r9 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, java.util.Map r8, d4.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof F2.d
            if (r0 == 0) goto L13
            r0 = r9
            F2.d r0 = (F2.d) r0
            int r1 = r0.f1555i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1555i = r1
            goto L18
        L13:
            F2.d r0 = new F2.d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f1553g
            int r1 = r0.f1555i
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            X3.a.e(r9)
            goto La3
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            X3.a.e(r9)
            goto L81
        L37:
            X3.a.e(r9)
            X3.n r9 = r6.a
            java.lang.Object r9 = r9.getValue()
            t3.d r9 = (t3.d) r9
            E3.d r1 = new E3.d
            r1.<init>()
            I3.u r5 = I3.u.f2754b
            r1.c(r5)
            o4.AbstractC1410a.U(r1, r7)
            java.util.Set r7 = r8.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L57:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L73
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r5 = r8.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            s4.j.A(r1, r5, r8)
            goto L57
        L73:
            F3.k r7 = new F3.k
            r7.<init>(r1, r9)
            r0.f1555i = r3
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r4) goto L81
            goto La2
        L81:
            F3.c r9 = (F3.c) r9
            u3.c r7 = r9.b()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            m4.A r9 = m4.AbstractC1289x.b(r8)
            java.lang.reflect.Type r1 = s4.j.w(r9)
            m4.e r8 = m4.AbstractC1289x.a(r8)
            R3.a r3 = new R3.a
            r3.<init>(r8, r1, r9)
            r0.f1555i = r2
            java.lang.Object r9 = r7.a(r3, r0)
            if (r9 != r4) goto La3
        La2:
            return r4
        La3:
            if (r9 == 0) goto La8
            java.lang.String r9 = (java.lang.String) r9
            return r9
        La8:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.String"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.c(java.lang.String, java.util.Map, d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x018f, code lost:
    
        if (r4 != r14) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e3, code lost:
    
        if (u4.AbstractC1776n.Q(r4) == false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARN: Type inference failed for: r18v0, types: [F2.i] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, d4.c r25) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(d4.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof F2.f
            if (r0 == 0) goto L13
            r0 = r6
            F2.f r0 = (F2.f) r0
            int r1 = r0.f1562i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1562i = r1
            goto L18
        L13:
            F2.f r0 = new F2.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f1560g
            int r1 = r0.f1562i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L26
            X3.a.e(r6)     // Catch: java.lang.Exception -> L5e
            goto L5b
        L26:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2e:
            X3.a.e(r6)
            java.lang.String r6 = "https://bothub.bookab.info"
            char[] r1 = new char[r3]     // Catch: java.lang.Exception -> L5e
            r4 = 47
            r1[r2] = r4     // Catch: java.lang.Exception -> L5e
            java.lang.String r6 = u4.AbstractC1776n.n0(r6, r1)     // Catch: java.lang.Exception -> L5e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e
            r1.<init>()     // Catch: java.lang.Exception -> L5e
            r1.append(r6)     // Catch: java.lang.Exception -> L5e
            java.lang.String r6 = "/reasoning_config.json"
            r1.append(r6)     // Catch: java.lang.Exception -> L5e
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L5e
            r0.f1562i = r3     // Catch: java.lang.Exception -> L5e
            Y3.w r1 = Y3.w.f9813c     // Catch: java.lang.Exception -> L5e
            java.lang.Object r6 = r5.c(r6, r1, r0)     // Catch: java.lang.Exception -> L5e
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r6 != r0) goto L5b
            return r0
        L5b:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L5e
            return r6
        L5e:
            androidx.lifecycle.N r6 = i5.a.a
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r6.getClass()
            androidx.lifecycle.N.z(r0)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.e(d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r11 != r6) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(d4.c r11) {
        /*
            r10 = this;
            java.lang.Class<com.bot.core.model.VersionInfo> r0 = com.bot.core.model.VersionInfo.class
            boolean r1 = r11 instanceof F2.g
            if (r1 == 0) goto L15
            r1 = r11
            F2.g r1 = (F2.g) r1
            int r2 = r1.f1566j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f1566j = r2
            goto L1a
        L15:
            F2.g r1 = new F2.g
            r1.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r1.f1564h
            int r2 = r1.f1566j
            r3 = 2
            r4 = 1
            r5 = 0
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            X3.a.e(r11)     // Catch: java.lang.Exception -> L2e
            goto La7
        L2e:
            r11 = move-exception
            goto Lbd
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            int r2 = r1.f1563g
            X3.a.e(r11)     // Catch: java.lang.Exception -> L2e
            goto L85
        L3f:
            X3.a.e(r11)
            java.lang.String r11 = "https://bothub.bookab.info"
            char[] r2 = new char[r4]     // Catch: java.lang.Exception -> L2e
            r7 = 47
            r2[r5] = r7     // Catch: java.lang.Exception -> L2e
            java.lang.String r11 = u4.AbstractC1776n.n0(r11, r2)     // Catch: java.lang.Exception -> L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            r2.<init>()     // Catch: java.lang.Exception -> L2e
            r2.append(r11)     // Catch: java.lang.Exception -> L2e
            java.lang.String r11 = "/version.json"
            r2.append(r11)     // Catch: java.lang.Exception -> L2e
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Exception -> L2e
            X3.n r2 = r10.a     // Catch: java.lang.Exception -> L2e
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L2e
            t3.d r2 = (t3.d) r2     // Catch: java.lang.Exception -> L2e
            E3.d r7 = new E3.d     // Catch: java.lang.Exception -> L2e
            r7.<init>()     // Catch: java.lang.Exception -> L2e
            I3.u r8 = I3.u.f2754b     // Catch: java.lang.Exception -> L2e
            r7.c(r8)     // Catch: java.lang.Exception -> L2e
            o4.AbstractC1410a.U(r7, r11)     // Catch: java.lang.Exception -> L2e
            F3.k r11 = new F3.k     // Catch: java.lang.Exception -> L2e
            r11.<init>(r7, r2)     // Catch: java.lang.Exception -> L2e
            r1.f1563g = r5     // Catch: java.lang.Exception -> L2e
            r1.f1566j = r4     // Catch: java.lang.Exception -> L2e
            java.lang.Object r11 = r11.b(r1)     // Catch: java.lang.Exception -> L2e
            if (r11 != r6) goto L84
            goto La6
        L84:
            r2 = r5
        L85:
            F3.c r11 = (F3.c) r11     // Catch: java.lang.Exception -> L2e
            u3.c r11 = r11.b()     // Catch: java.lang.Exception -> L2e
            m4.A r7 = m4.AbstractC1289x.b(r0)     // Catch: java.lang.Exception -> L2e
            java.lang.reflect.Type r8 = s4.j.w(r7)     // Catch: java.lang.Exception -> L2e
            m4.e r0 = m4.AbstractC1289x.a(r0)     // Catch: java.lang.Exception -> L2e
            R3.a r9 = new R3.a     // Catch: java.lang.Exception -> L2e
            r9.<init>(r0, r8, r7)     // Catch: java.lang.Exception -> L2e
            r1.f1563g = r2     // Catch: java.lang.Exception -> L2e
            r1.f1566j = r3     // Catch: java.lang.Exception -> L2e
            java.lang.Object r11 = r11.a(r9, r1)     // Catch: java.lang.Exception -> L2e
            if (r11 != r6) goto La7
        La6:
            return r6
        La7:
            if (r11 == 0) goto Lb5
            com.bot.core.model.VersionInfo r11 = (com.bot.core.model.VersionInfo) r11     // Catch: java.lang.Exception -> L2e
            com.bot.core.model.ApiResponse r0 = new com.bot.core.model.ApiResponse     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = "OK"
            r2 = 200(0xc8, float:2.8E-43)
            r0.<init>(r4, r1, r11, r2)     // Catch: java.lang.Exception -> L2e
            return r0
        Lb5:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = "null cannot be cast to non-null type com.bot.core.model.VersionInfo"
            r11.<init>(r0)     // Catch: java.lang.Exception -> L2e
            throw r11     // Catch: java.lang.Exception -> L2e
        Lbd:
            com.bot.core.model.ApiResponse r0 = new com.bot.core.model.ApiResponse
            java.lang.String r11 = r11.getMessage()
            if (r11 != 0) goto Lc7
            java.lang.String r11 = "获取版本信息失败"
        Lc7:
            r1 = 0
            r2 = 503(0x1f7, float:7.05E-43)
            r0.<init>(r5, r11, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.i.f(d4.c):java.lang.Object");
    }
}
