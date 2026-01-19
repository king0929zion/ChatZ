package Y2;

import A4.C0012m;
import A4.C0022x;
import A4.g0;
import com.bot.core.model.ApiResponse;
import com.bot.feature.settings.data.ModelConfig;
import com.bot.feature.settings.data.VendorConfig;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import x4.t0;

/* loaded from: classes.dex */
public final class L extends H2.g {
    public static final z Companion = new Object();
    public final F2.i a;

    /* renamed from: b, reason: collision with root package name */
    public final C0720i f9636b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f9637c;

    /* renamed from: d, reason: collision with root package name */
    public final A4.Q f9638d;

    /* renamed from: e, reason: collision with root package name */
    public int f9639e;

    public L(F2.i iVar, C0720i c0720i) {
        AbstractC1276k.f(iVar, "apiService");
        AbstractC1276k.f(c0720i, "providerRepository");
        this.a = iVar;
        this.f9636b = c0720i;
        g0 b5 = A4.W.b(new y(Y3.v.f9812c, false, null, 0L));
        this.f9637c = b5;
        A4.Q q3 = new A4.Q(b5);
        this.f9638d = q3;
        t0 e6 = AbstractC1888A.e();
        E4.e eVar = AbstractC1898K.a;
        int i6 = 0;
        int i7 = 3;
        int i8 = 2;
        AbstractC1888A.y(AbstractC1888A.c(Y4.d.P(e6, E4.d.f1360f)), null, new C0012m(new C0022x(i8, new A4.M(new C0022x(7, new C0022x(i6, new C0717f(c0720i, null), c0720i.a.observeAll()), c0720i), q3, new X2.H(i7, 1, null)), new I(this, null)), null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0058, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0068, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0077, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r12v0, types: [H2.g, Y2.L] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, Y3.v] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(Y2.L r12, com.bot.core.model.LLMProvider r13, java.lang.String r14, d4.c r15) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.L.f(Y2.L, com.bot.core.model.LLMProvider, java.lang.String, d4.c):java.lang.Object");
    }

    public static final Object g(L l3, ApiResponse apiResponse) {
        l3.getClass();
        AbstractC1276k.f(apiResponse, "<this>");
        int i6 = apiResponse.f11150d;
        if (!apiResponse.a) {
            throw new H2.a(i6, apiResponse.f11148b);
        }
        Object obj = apiResponse.f11149c;
        if (obj != null) {
            return obj;
        }
        throw new H2.a(i6, "响应数据为空");
    }

    public static String i(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List list2 = ((VendorConfig) obj).f11272c;
            if (list2 == null || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (AbstractC1276k.b(((ModelConfig) it2.next()).a, str)) {
                        break loop0;
                    }
                }
            }
        }
        VendorConfig vendorConfig = (VendorConfig) obj;
        if (vendorConfig != null) {
            return vendorConfig.a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r0 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(com.bot.core.model.LLMProvider r5) {
        /*
            java.lang.String r0 = r5.f11176l
            java.lang.String r1 = r5.f11168d
            r2 = 0
            if (r0 == 0) goto L10
            java.lang.CharSequence r0 = u4.AbstractC1776n.l0(r0)
            java.lang.String r0 = r0.toString()
            goto L11
        L10:
            r0 = r2
        L11:
            java.lang.String r3 = ""
            if (r0 != 0) goto L16
            r0 = r3
        L16:
            boolean r0 = u4.AbstractC1776n.Q(r0)
            if (r0 == 0) goto L1e
            goto L9b
        L1e:
            java.lang.String r0 = r5.f11169e
            if (r0 == 0) goto L2c
            boolean r4 = u4.AbstractC1776n.Q(r0)
            if (r4 != 0) goto L29
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 != 0) goto L2e
        L2c:
            java.lang.String r0 = "openai"
        L2e:
            java.lang.String r4 = "google"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L8b
            java.lang.String r0 = r5.f11171g
            if (r0 == 0) goto L44
            boolean r4 = u4.AbstractC1776n.Q(r0)
            if (r4 != 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            if (r0 != 0) goto L46
        L44:
            java.lang.String r0 = "ai_studio"
        L46:
            java.lang.String r4 = "vertex_ai"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L7c
            java.lang.String r0 = r5.f11172h
            if (r0 == 0) goto L5b
            java.lang.CharSequence r0 = u4.AbstractC1776n.l0(r0)
            java.lang.String r0 = r0.toString()
            goto L5c
        L5b:
            r0 = r2
        L5c:
            if (r0 != 0) goto L5f
            r0 = r3
        L5f:
            boolean r0 = u4.AbstractC1776n.Q(r0)
            if (r0 != 0) goto L9b
            java.lang.String r5 = r5.f11173i
            if (r5 == 0) goto L71
            java.lang.CharSequence r5 = u4.AbstractC1776n.l0(r5)
            java.lang.String r2 = r5.toString()
        L71:
            if (r2 != 0) goto L74
            goto L75
        L74:
            r3 = r2
        L75:
            boolean r5 = u4.AbstractC1776n.Q(r3)
            if (r5 != 0) goto L9b
            goto L99
        L7c:
            java.lang.CharSequence r5 = u4.AbstractC1776n.l0(r1)
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            if (r5 <= 0) goto L9b
            goto L99
        L8b:
            java.lang.CharSequence r5 = u4.AbstractC1776n.l0(r1)
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            if (r5 <= 0) goto L9b
        L99:
            r5 = 1
            return r5
        L9b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.L.l(com.bot.core.model.LLMProvider):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (r7 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(d4.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Y2.C
            if (r0 == 0) goto L13
            r0 = r7
            Y2.C r0 = (Y2.C) r0
            int r1 = r0.f9593i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9593i = r1
            goto L18
        L13:
            Y2.C r0 = new Y2.C
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f9591g
            int r1 = r0.f9593i
            r2 = 0
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2b
            X3.a.e(r7)
            return r7
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            X3.a.e(r7)
            goto L4e
        L37:
            X3.a.e(r7)
            r0.f9593i = r4
            Y2.i r7 = r6.f9636b
            r7.getClass()
            O.o0 r1 = new O.o0
            r4 = 3
            r1.<init>(r7, r2, r4)
            java.lang.Object r7 = r7.c(r0, r1)
            if (r7 != r5) goto L4e
            goto L69
        L4e:
            D2.i r7 = (D2.i) r7
            boolean r1 = r7 instanceof D2.h
            if (r1 == 0) goto L6b
            D2.h r7 = (D2.h) r7
            java.lang.Object r7 = r7.a
            java.util.List r7 = (java.util.List) r7
            I2.u r1 = new I2.u
            r4 = 4
            r1.<init>(r7, r6, r2, r4)
            r0.f9593i = r3
            r7 = 3
            java.lang.Object r7 = r6.d(r7, r1, r0)
            if (r7 != r5) goto L6a
        L69:
            return r5
        L6a:
            return r7
        L6b:
            boolean r0 = r7 instanceof D2.f
            if (r0 == 0) goto L7b
            D2.f r0 = new D2.f
            D2.f r7 = (D2.f) r7
            java.lang.String r1 = r7.a
            int r7 = r7.f1282b
            r0.<init>(r1, r7)
            return r0
        L7b:
            boolean r7 = r7 instanceof D2.g
            if (r7 == 0) goto L82
            D2.g r7 = D2.g.a
            return r7
        L82:
            N0.e r7 = new N0.e
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.L.h(d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0053, code lost:
    
        if (r15 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x007b, code lost:
    
        if (r4 == null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, d4.c r22) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.L.j(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(d4.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Y2.H
            if (r0 == 0) goto L13
            r0 = r5
            Y2.H r0 = (Y2.H) r0
            int r1 = r0.f9624i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9624i = r1
            goto L18
        L13:
            Y2.H r0 = new Y2.H
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f9622g
            int r1 = r0.f9624i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r5)
            goto L3c
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            X3.a.e(r5)
            r0.f9624i = r2
            r5 = 0
            java.lang.Object r5 = r4.m(r5, r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L3c
            return r0
        L3c:
            D2.i r5 = (D2.i) r5
            boolean r0 = r5 instanceof D2.h
            if (r0 == 0) goto L53
            D2.h r5 = new D2.h
            A4.Q r0 = r4.f9638d
            A4.g0 r0 = r0.f201c
            java.lang.Object r0 = r0.getValue()
            Y2.y r0 = (Y2.y) r0
            java.util.List r0 = r0.a
            r5.<init>(r0)
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.L.k(d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(boolean r13, d4.c r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.L.m(boolean, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r8, d4.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Y2.K
            if (r0 == 0) goto L13
            r0 = r9
            Y2.K r0 = (Y2.K) r0
            int r1 = r0.f9635j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9635j = r1
            goto L18
        L13:
            Y2.K r0 = new Y2.K
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f9633h
            int r1 = r0.f9635j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.lang.String r8 = r0.f9632g
            X3.a.e(r9)
            goto L5b
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            X3.a.e(r9)
            A4.Q r9 = r7.f9638d
            A4.g0 r9 = r9.f201c
            java.lang.Object r9 = r9.getValue()
            Y2.y r9 = (Y2.y) r9
            java.util.List r1 = r9.a
            java.lang.String r1 = i(r8, r1)
            if (r1 == 0) goto L45
            return r1
        L45:
            long r3 = r9.f9788d
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L4e
            goto L7b
        L4e:
            r0.f9632g = r8
            r0.f9635j = r2
            java.lang.Object r9 = r7.k(r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r9 != r0) goto L5b
            return r0
        L5b:
            D2.i r9 = (D2.i) r9
            boolean r0 = r9 instanceof D2.h
            if (r0 == 0) goto L6c
            D2.h r9 = (D2.h) r9
            java.lang.Object r9 = r9.a
            java.util.List r9 = (java.util.List) r9
            java.lang.String r8 = i(r8, r9)
            return r8
        L6c:
            boolean r8 = r9 instanceof D2.f
            if (r8 != 0) goto L7b
            boolean r8 = r9 instanceof D2.g
            if (r8 == 0) goto L75
            goto L7b
        L75:
            N0.e r8 = new N0.e
            r8.<init>()
            throw r8
        L7b:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.L.n(java.lang.String, d4.c):java.lang.Object");
    }
}
