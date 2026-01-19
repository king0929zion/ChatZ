package N1;

import D.C0080m;
import D.P0;
import com.bot.core.database.data.AppDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f3708l = {"INSERT", "UPDATE", "DELETE"};
    public final AppDatabase_Impl a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3709b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3710c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3711d;

    /* renamed from: e, reason: collision with root package name */
    public final P0 f3712e;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f3714g;

    /* renamed from: h, reason: collision with root package name */
    public final C0290l f3715h;

    /* renamed from: i, reason: collision with root package name */
    public final A3.c f3716i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f3717j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1193a f3718k = new C0080m(24);

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f3713f = new LinkedHashMap();

    public Q(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z5, P0 p02) {
        String str;
        this.a = appDatabase_Impl;
        this.f3709b = linkedHashMap;
        this.f3710c = linkedHashMap2;
        this.f3711d = z5;
        this.f3712e = p02;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i6 = 0; i6 < length; i6++) {
            String str2 = strArr[i6];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            AbstractC1276k.e(lowerCase, "toLowerCase(...)");
            this.f3713f.put(lowerCase, Integer.valueOf(i6));
            String str3 = (String) this.f3709b.get(strArr[i6]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                AbstractC1276k.e(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i6] = lowerCase;
        }
        this.f3714g = strArr2;
        for (Map.Entry entry : this.f3709b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            AbstractC1276k.e(lowerCase2, "toLowerCase(...)");
            if (this.f3713f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                AbstractC1276k.e(lowerCase3, "toLowerCase(...)");
                LinkedHashMap linkedHashMap3 = this.f3713f;
                linkedHashMap3.put(lowerCase3, Y3.B.Y(lowerCase2, linkedHashMap3));
            }
        }
        this.f3715h = new C0290l(this.f3714g.length);
        this.f3716i = new A3.c(this.f3714g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(N1.Q r4, N1.InterfaceC0293o r5, d4.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof N1.D
            if (r0 == 0) goto L16
            r0 = r6
            N1.D r0 = (N1.D) r0
            int r1 = r0.f3646j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f3646j = r1
            goto L1b
        L16:
            N1.D r0 = new N1.D
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f3644h
            int r6 = r0.f3646j
            r1 = 2
            r2 = 1
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r6 == 0) goto L41
            if (r6 == r2) goto L39
            if (r6 != r1) goto L31
            java.lang.Object r5 = r0.f3643g
            java.util.Set r5 = (java.util.Set) r5
            X3.a.e(r4)
            return r5
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            java.lang.Object r5 = r0.f3643g
            N1.o r5 = (N1.InterfaceC0293o) r5
            X3.a.e(r4)
            goto L58
        L41:
            X3.a.e(r4)
            I2.x r4 = new I2.x
            r6 = 19
            r4.<init>(r6)
            r0.f3643g = r5
            r0.f3646j = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.b(r6, r4, r0)
            if (r4 != r3) goto L58
            goto L6f
        L58:
            java.util.Set r4 = (java.util.Set) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L70
            r0.f3643g = r4
            r0.f3646j = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = N1.C.a(r5, r6, r0)
            if (r5 != r3) goto L70
        L6f:
            return r3
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.Q.a(N1.Q, N1.o, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:13:0x007a, B:15:0x0085, B:32:0x0046, B:36:0x0053, B:40:0x0065), top: B:31:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(N1.Q r7, d4.c r8) {
        /*
            com.bot.core.database.data.AppDatabase_Impl r0 = r7.a
            boolean r1 = r8 instanceof N1.H
            if (r1 == 0) goto L15
            r1 = r8
            N1.H r1 = (N1.H) r1
            int r2 = r1.f3663k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f3663k = r2
            goto L1a
        L15:
            N1.H r1 = new N1.H
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.f3661i
            int r2 = r1.f3663k
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            M.q r7 = r1.f3660h
            N1.Q r0 = r1.f3659g
            X3.a.e(r8)     // Catch: java.lang.Throwable -> L2f
            r6 = r8
            r8 = r7
            r7 = r0
            r0 = r6
            goto L7a
        L2f:
            r8 = move-exception
            goto L99
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            X3.a.e(r8)
            M.q r8 = r0.f3792g
            boolean r2 = r8.i()
            Y3.x r4 = Y3.x.f9814c
            if (r2 == 0) goto L9d
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f3717j     // Catch: java.lang.Throwable -> L90
            r5 = 0
            boolean r2 = r2.compareAndSet(r3, r5)     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto L53
            r8.x()
            return r4
        L53:
            l4.a r2 = r7.f3718k     // Catch: java.lang.Throwable -> L90
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L90
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto L65
            r8.x()
            return r4
        L65:
            N1.J r2 = new N1.J     // Catch: java.lang.Throwable -> L90
            r4 = 0
            r2.<init>(r7, r4)     // Catch: java.lang.Throwable -> L90
            r1.f3659g = r7     // Catch: java.lang.Throwable -> L90
            r1.f3660h = r8     // Catch: java.lang.Throwable -> L90
            r1.f3663k = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.i(r5, r2, r1)     // Catch: java.lang.Throwable -> L90
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r0 != r1) goto L7a
            return r1
        L7a:
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L90
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L95
            A3.c r1 = r7.f3716i     // Catch: java.lang.Throwable -> L90
            r1.n(r0)     // Catch: java.lang.Throwable -> L90
            D.P0 r7 = r7.f3712e     // Catch: java.lang.Throwable -> L90
            r7.f(r0)     // Catch: java.lang.Throwable -> L90
            goto L95
        L90:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            goto L99
        L95:
            r8.x()
            return r0
        L99:
            r7.x()
            throw r8
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.Q.b(N1.Q, d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00df, code lost:
    
        if (N1.C.a(r10, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e1, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (N1.C.a(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00df -> B:11:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(N1.Q r17, N1.B r18, int r19, d4.c r20) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.Q.c(N1.Q, N1.B, int, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v4, types: [N1.o] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0082 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(N1.Q r7, N1.B r8, int r9, d4.c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof N1.M
            if (r0 == 0) goto L16
            r0 = r10
            N1.M r0 = (N1.M) r0
            int r1 = r0.f3690n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f3690n = r1
            goto L1b
        L16:
            N1.M r0 = new N1.M
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f3688l
            int r1 = r0.f3690n
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            int r7 = r0.f3687k
            int r8 = r0.f3686j
            java.lang.String[] r9 = r0.f3685i
            java.lang.String r1 = r0.f3684h
            N1.o r3 = r0.f3683g
            X3.a.e(r10)
            r10 = r9
            r9 = r3
            goto L85
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            X3.a.e(r10)
            java.lang.String[] r7 = r7.f3714g
            r7 = r7[r9]
            java.lang.String[] r9 = N1.Q.f3708l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4e:
            if (r8 >= r7) goto L87
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = B3.e.g(r5, r4, r3)
            r0.f3683g = r9
            r0.f3684h = r1
            r0.f3685i = r10
            r0.f3686j = r8
            r0.f3687k = r7
            r0.f3690n = r2
            java.lang.Object r3 = N1.C.a(r9, r3, r0)
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r3 != r4) goto L85
            return r4
        L85:
            int r8 = r8 + r2
            goto L4e
        L87:
            X3.y r7 = X3.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.Q.d(N1.Q, N1.B, int, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(d4.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof N1.N
            if (r0 == 0) goto L13
            r0 = r6
            N1.N r0 = (N1.N) r0
            int r1 = r0.f3694j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3694j = r1
            goto L18
        L13:
            N1.N r0 = new N1.N
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f3692h
            int r1 = r0.f3694j
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            M.q r0 = r0.f3691g
            X3.a.e(r6)     // Catch: java.lang.Throwable -> L27
            goto L53
        L27:
            r6 = move-exception
            goto L59
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            X3.a.e(r6)
            com.bot.core.database.data.AppDatabase_Impl r6 = r5.a
            M.q r1 = r6.f3792g
            boolean r3 = r1.i()
            if (r3 == 0) goto L5d
            N1.P r3 = new N1.P     // Catch: java.lang.Throwable -> L57
            r4 = 0
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L57
            r0.f3691g = r1     // Catch: java.lang.Throwable -> L57
            r0.f3694j = r2     // Catch: java.lang.Throwable -> L57
            r2 = 0
            java.lang.Object r6 = r6.i(r2, r3, r0)     // Catch: java.lang.Throwable -> L57
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r6 != r0) goto L52
            return r0
        L52:
            r0 = r1
        L53:
            r0.x()
            goto L5d
        L57:
            r6 = move-exception
            r0 = r1
        L59:
            r0.x()
            throw r6
        L5d:
            X3.y r6 = X3.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.Q.e(d4.c):java.lang.Object");
    }
}
