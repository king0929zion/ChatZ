package a3;

import A4.Q;
import A4.W;
import A4.g0;
import Y2.C0720i;
import Y2.L;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import java.util.Set;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.s0;

/* renamed from: a3.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808F extends U {

    /* renamed from: b, reason: collision with root package name */
    public final C0720i f10606b;

    /* renamed from: c, reason: collision with root package name */
    public final L f10607c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f10608d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f10609e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f10610f;

    /* renamed from: g, reason: collision with root package name */
    public final Q f10611g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f10612h;

    /* renamed from: i, reason: collision with root package name */
    public final Q f10613i;

    /* renamed from: j, reason: collision with root package name */
    public final g0 f10614j;

    /* renamed from: k, reason: collision with root package name */
    public final Q f10615k;

    /* renamed from: l, reason: collision with root package name */
    public final g0 f10616l;

    /* renamed from: m, reason: collision with root package name */
    public final g0 f10617m;

    /* renamed from: n, reason: collision with root package name */
    public final Q f10618n;

    /* renamed from: o, reason: collision with root package name */
    public s0 f10619o;

    public C0808F(C0720i c0720i, L l3) {
        AbstractC1276k.f(c0720i, "providerRepository");
        AbstractC1276k.f(l3, "modelRepository");
        this.f10606b = c0720i;
        this.f10607c = l3;
        g0 b5 = W.b(Y3.v.f9812c);
        this.f10608d = b5;
        this.f10609e = new Q(b5);
        g0 b6 = W.b(Boolean.FALSE);
        this.f10610f = b6;
        this.f10611g = new Q(b6);
        g0 b7 = W.b(null);
        this.f10612h = b7;
        this.f10613i = new Q(b7);
        g0 b8 = W.b(Y3.x.f9814c);
        this.f10614j = b8;
        this.f10615k = new Q(b8);
        this.f10616l = W.b(Y3.w.f9813c);
        g0 b9 = W.b(new C0809G());
        this.f10617m = b9;
        this.f10618n = new Q(b9);
        AbstractC1888A.y(O.i(this), null, new C0803A(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, d4.c r27) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0808F.e(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (g(r0) == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0055, code lost:
    
        if (r11 == r6) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r10, d4.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a3.y
            if (r0 == 0) goto L13
            r0 = r11
            a3.y r0 = (a3.y) r0
            int r1 = r0.f10768j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10768j = r1
            goto L18
        L13:
            a3.y r0 = new a3.y
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f10766h
            int r1 = r0.f10768j
            A4.g0 r2 = r9.f10612h
            r3 = 2
            r4 = 1
            r5 = 0
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            X3.a.e(r11)
            goto Lc4
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.String r10 = r0.f10765g
            X3.a.e(r11)
            goto L58
        L3c:
            X3.a.e(r11)
            r2.k(r5)
            r0.f10765g = r10
            r0.f10768j = r4
            Y2.i r11 = r9.f10606b
            r11.getClass()
            A4.n r1 = new A4.n
            r7 = 4
            r1.<init>(r11, r10, r5, r7)
            java.lang.Object r11 = r11.c(r0, r1)
            if (r11 != r6) goto L58
            goto Laf
        L58:
            D2.i r11 = (D2.i) r11
            boolean r1 = r11 instanceof D2.h
            if (r1 == 0) goto Lb0
            A4.g0 r11 = r9.f10608d
            java.lang.Object r1 = r11.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L6f:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L8a
            java.lang.Object r7 = r1.next()
            r8 = r7
            a3.H r8 = (a3.C0810H) r8
            com.bot.core.model.LLMProvider r8 = r8.a
            java.lang.String r8 = r8.a
            boolean r8 = m4.AbstractC1276k.b(r8, r10)
            if (r8 != 0) goto L6f
            r2.add(r7)
            goto L6f
        L8a:
            r11.getClass()
            r11.l(r5, r2)
            A4.g0 r11 = r9.f10616l
            java.lang.Object r1 = r11.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.util.LinkedHashMap r1 = Y3.B.e0(r1)
            r1.remove(r10)
            r11.getClass()
            r11.l(r5, r1)
            r0.f10765g = r5
            r0.f10768j = r3
            java.lang.Object r10 = r9.g(r0)
            if (r10 != r6) goto Lc4
        Laf:
            return r6
        Lb0:
            boolean r10 = r11 instanceof D2.f
            r4 = 0
            if (r10 == 0) goto Lc0
            D2.f r11 = (D2.f) r11
            java.lang.String r10 = r11.a
            r2.getClass()
            r2.l(r5, r10)
            goto Lc4
        Lc0:
            boolean r10 = r11 instanceof D2.g
            if (r10 == 0) goto Lc9
        Lc4:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            return r10
        Lc9:
            N0.e r10 = new N0.e
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0808F.f(java.lang.String, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(d4.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a3.C0805C
            if (r0 == 0) goto L13
            r0 = r5
            a3.C r0 = (a3.C0805C) r0
            int r1 = r0.f10588i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10588i = r1
            goto L18
        L13:
            a3.C r0 = new a3.C
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10586g
            int r1 = r0.f10588i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r5)
            goto L3d
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            X3.a.e(r5)
            r0.f10588i = r2
            Y2.L r5 = r4.f10607c
            java.lang.Object r5 = r5.m(r2, r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L3d
            return r0
        L3d:
            D2.i r5 = (D2.i) r5
            boolean r0 = r5 instanceof D2.f
            if (r0 == 0) goto L51
            D2.f r5 = (D2.f) r5
            java.lang.String r5 = r5.a
            A4.g0 r0 = r4.f10612h
            r0.getClass()
            r1 = 0
            r0.l(r1, r5)
            goto L60
        L51:
            boolean r0 = r5 instanceof D2.h
            if (r0 != 0) goto L60
            boolean r5 = r5 instanceof D2.g
            if (r5 == 0) goto L5a
            goto L60
        L5a:
            N0.e r5 = new N0.e
            r5.<init>()
            throw r5
        L60:
            X3.y r5 = X3.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0808F.g(d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (g(r0) == r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:19:0x003c, B:20:0x005e, B:22:0x0064, B:25:0x0078, B:27:0x007c, B:29:0x0088, B:31:0x0095, B:32:0x009a, B:34:0x0049), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:19:0x003c, B:20:0x005e, B:22:0x0064, B:25:0x0078, B:27:0x007c, B:29:0x0088, B:31:0x0095, B:32:0x009a, B:34:0x0049), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r9, java.util.List r10, d4.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof a3.C0806D
            if (r0 == 0) goto L13
            r0 = r11
            a3.D r0 = (a3.C0806D) r0
            int r1 = r0.f10592j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10592j = r1
            goto L18
        L13:
            a3.D r0 = new a3.D
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f10590h
            int r1 = r0.f10592j
            A4.g0 r2 = r8.f10612h
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L40
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L32
            java.lang.String r9 = r0.f10589g
            X3.a.e(r11)     // Catch: java.lang.Throwable -> L30
            goto L8d
        L30:
            r10 = move-exception
            goto L9b
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.String r9 = r0.f10589g
            X3.a.e(r11)     // Catch: java.lang.Throwable -> L30
            goto L5e
        L40:
            X3.a.e(r11)
            r2.k(r6)
            r8.i(r9, r4)
            Y2.i r11 = r8.f10606b     // Catch: java.lang.Throwable -> L30
            r0.f10589g = r9     // Catch: java.lang.Throwable -> L30
            r0.f10592j = r4     // Catch: java.lang.Throwable -> L30
            r11.getClass()     // Catch: java.lang.Throwable -> L30
            Y2.g r1 = new Y2.g     // Catch: java.lang.Throwable -> L30
            r1.<init>(r10, r11, r9, r6)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r11 = r11.c(r0, r1)     // Catch: java.lang.Throwable -> L30
            if (r11 != r7) goto L5e
            goto L77
        L5e:
            D2.i r11 = (D2.i) r11     // Catch: java.lang.Throwable -> L30
            boolean r10 = r11 instanceof D2.h     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L78
            D2.h r11 = (D2.h) r11     // Catch: java.lang.Throwable -> L30
            java.lang.Object r10 = r11.a     // Catch: java.lang.Throwable -> L30
            com.bot.core.model.LLMProvider r10 = (com.bot.core.model.LLMProvider) r10     // Catch: java.lang.Throwable -> L30
            r8.j(r10, r5)     // Catch: java.lang.Throwable -> L30
            r0.f10589g = r9     // Catch: java.lang.Throwable -> L30
            r0.f10592j = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r10 = r8.g(r0)     // Catch: java.lang.Throwable -> L30
            if (r10 != r7) goto L8d
        L77:
            return r7
        L78:
            boolean r10 = r11 instanceof D2.f     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L88
            D2.f r11 = (D2.f) r11     // Catch: java.lang.Throwable -> L30
            java.lang.String r10 = r11.a     // Catch: java.lang.Throwable -> L30
            r2.getClass()     // Catch: java.lang.Throwable -> L30
            r2.l(r6, r10)     // Catch: java.lang.Throwable -> L30
        L86:
            r4 = r5
            goto L8d
        L88:
            boolean r10 = r11 instanceof D2.g     // Catch: java.lang.Throwable -> L30
            if (r10 == 0) goto L95
            goto L86
        L8d:
            r8.i(r9, r5)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        L95:
            N0.e r10 = new N0.e     // Catch: java.lang.Throwable -> L30
            r10.<init>()     // Catch: java.lang.Throwable -> L30
            throw r10     // Catch: java.lang.Throwable -> L30
        L9b:
            r8.i(r9, r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0808F.h(java.lang.String, java.util.List, d4.c):java.lang.Object");
    }

    public final void i(String str, boolean z5) {
        g0 g0Var = this.f10614j;
        Set M02 = Y3.m.M0((Iterable) g0Var.getValue());
        if (z5) {
            M02.add(str);
        } else {
            M02.remove(str);
        }
        g0Var.getClass();
        g0Var.l(null, M02);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.bot.core.model.LLMProvider r13, boolean r14) {
        /*
            r12 = this;
            A4.g0 r8 = r12.f10608d
            java.lang.Object r1 = r8.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r2 = 10
            int r2 = Y3.n.Z(r1, r2)
            r9.<init>(r2)
            java.util.Iterator r10 = r1.iterator()
        L17:
            boolean r1 = r10.hasNext()
            r2 = 0
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r10.next()
            a3.H r1 = (a3.C0810H) r1
            com.bot.core.model.LLMProvider r3 = r1.a
            java.lang.String r3 = r3.a
            java.lang.String r4 = r13.a
            boolean r3 = m4.AbstractC1276k.b(r3, r4)
            if (r3 == 0) goto L69
            java.lang.String r3 = ""
            if (r14 == 0) goto L46
            java.lang.String r1 = r13.f11176l
            if (r1 == 0) goto L40
            java.lang.CharSequence r1 = u4.AbstractC1776n.l0(r1)
            java.lang.String r2 = r1.toString()
        L40:
            if (r2 != 0) goto L44
            r1 = r3
            goto L49
        L44:
            r1 = r2
            goto L49
        L46:
            java.lang.String r2 = r1.f10623b
            goto L44
        L49:
            java.lang.String r2 = r13.f11168d
            r4 = r3
            java.lang.String r3 = r13.f11169e
            r5 = r4
            java.lang.String r4 = r13.f11170f
            r6 = r5
            java.lang.String r5 = r13.f11171g
            java.lang.String r7 = r13.f11172h
            if (r7 != 0) goto L59
            r7 = r6
        L59:
            java.lang.String r11 = r13.f11173i
            if (r11 != 0) goto L62
            r0 = r7
            r7 = r6
            r6 = r0
        L60:
            r0 = r13
            goto L65
        L62:
            r6 = r7
            r7 = r11
            goto L60
        L65:
            a3.H r1 = a3.C0810H.a(r0, r1, r2, r3, r4, r5, r6, r7)
        L69:
            r9.add(r1)
            goto L17
        L6d:
            r8.getClass()
            r8.l(r2, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0808F.j(com.bot.core.model.LLMProvider, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01b8 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:23:0x005b, B:24:0x01b2, B:26:0x01b8, B:35:0x01d2, B:39:0x01f6, B:41:0x01fa, B:43:0x0209, B:45:0x0216, B:46:0x021b), top: B:22:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f6 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:23:0x005b, B:24:0x01b2, B:26:0x01b8, B:35:0x01d2, B:39:0x01f6, B:41:0x01fa, B:43:0x0209, B:45:0x0216, B:46:0x021b), top: B:22:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, boolean r37, d4.c r38) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0808F.k(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, d4.c):java.lang.Object");
    }
}
