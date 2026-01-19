package a3;

import A4.C0022x;
import A4.InterfaceC0007h;
import A4.P;
import A4.Q;
import A4.V;
import A4.Z;
import A4.e0;
import A4.g0;
import Y2.C0717f;
import Y2.C0720i;
import Y2.L;
import Y2.W;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import com.bot.core.model.LLMSetting;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class w extends U {
    private static final C0819h Companion = new Object();

    /* renamed from: A, reason: collision with root package name */
    public final g0 f10702A;

    /* renamed from: B, reason: collision with root package name */
    public final Q f10703B;

    /* renamed from: C, reason: collision with root package name */
    public final g0 f10704C;

    /* renamed from: D, reason: collision with root package name */
    public final Q f10705D;

    /* renamed from: E, reason: collision with root package name */
    public final g0 f10706E;

    /* renamed from: F, reason: collision with root package name */
    public final Q f10707F;

    /* renamed from: G, reason: collision with root package name */
    public final g0 f10708G;

    /* renamed from: H, reason: collision with root package name */
    public final Q f10709H;

    /* renamed from: I, reason: collision with root package name */
    public final g0 f10710I;

    /* renamed from: J, reason: collision with root package name */
    public final Q f10711J;

    /* renamed from: K, reason: collision with root package name */
    public final g0 f10712K;

    /* renamed from: L, reason: collision with root package name */
    public final Q f10713L;

    /* renamed from: M, reason: collision with root package name */
    public final g0 f10714M;

    /* renamed from: N, reason: collision with root package name */
    public final Q f10715N;

    /* renamed from: O, reason: collision with root package name */
    public final g0 f10716O;

    /* renamed from: P, reason: collision with root package name */
    public final Q f10717P;

    /* renamed from: Q, reason: collision with root package name */
    public final g0 f10718Q;

    /* renamed from: R, reason: collision with root package name */
    public final Q f10719R;

    /* renamed from: S, reason: collision with root package name */
    public final g0 f10720S;

    /* renamed from: T, reason: collision with root package name */
    public final Q f10721T;

    /* renamed from: U, reason: collision with root package name */
    public final g0 f10722U;

    /* renamed from: V, reason: collision with root package name */
    public final Q f10723V;

    /* renamed from: W, reason: collision with root package name */
    public final g0 f10724W;

    /* renamed from: X, reason: collision with root package name */
    public final Q f10725X;

    /* renamed from: Y, reason: collision with root package name */
    public final g0 f10726Y;

    /* renamed from: Z, reason: collision with root package name */
    public final Q f10727Z;

    /* renamed from: a0, reason: collision with root package name */
    public final V f10728a0;

    /* renamed from: b, reason: collision with root package name */
    public final W f10729b;

    /* renamed from: b0, reason: collision with root package name */
    public final P f10730b0;

    /* renamed from: c, reason: collision with root package name */
    public final L f10731c;

    /* renamed from: c0, reason: collision with root package name */
    public final Q f10732c0;

    /* renamed from: d, reason: collision with root package name */
    public final I2.A f10733d;

    /* renamed from: d0, reason: collision with root package name */
    public final C0022x f10734d0;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f10735e;

    /* renamed from: e0, reason: collision with root package name */
    public final Q f10736e0;

    /* renamed from: f, reason: collision with root package name */
    public final Q f10737f;

    /* renamed from: f0, reason: collision with root package name */
    public final Q f10738f0;

    /* renamed from: g, reason: collision with root package name */
    public final g0 f10739g;

    /* renamed from: g0, reason: collision with root package name */
    public LLMSetting f10740g0;

    /* renamed from: h, reason: collision with root package name */
    public final Q f10741h;

    /* renamed from: h0, reason: collision with root package name */
    public String f10742h0;

    /* renamed from: i, reason: collision with root package name */
    public final g0 f10743i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f10744i0;

    /* renamed from: j, reason: collision with root package name */
    public final Q f10745j;

    /* renamed from: k, reason: collision with root package name */
    public final g0 f10746k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f10747l;

    /* renamed from: m, reason: collision with root package name */
    public final g0 f10748m;

    /* renamed from: n, reason: collision with root package name */
    public final Q f10749n;

    /* renamed from: o, reason: collision with root package name */
    public final g0 f10750o;

    /* renamed from: p, reason: collision with root package name */
    public final Q f10751p;

    /* renamed from: q, reason: collision with root package name */
    public final g0 f10752q;

    /* renamed from: r, reason: collision with root package name */
    public final Q f10753r;

    /* renamed from: s, reason: collision with root package name */
    public final g0 f10754s;

    /* renamed from: t, reason: collision with root package name */
    public final Q f10755t;

    /* renamed from: u, reason: collision with root package name */
    public final g0 f10756u;

    /* renamed from: v, reason: collision with root package name */
    public final Q f10757v;

    /* renamed from: w, reason: collision with root package name */
    public final g0 f10758w;

    /* renamed from: x, reason: collision with root package name */
    public final Q f10759x;

    /* renamed from: y, reason: collision with root package name */
    public final g0 f10760y;

    /* renamed from: z, reason: collision with root package name */
    public final Q f10761z;

    public w(W w5, L l3, C0720i c0720i, I2.A a) {
        AbstractC1276k.f(w5, "settingsRepository");
        AbstractC1276k.f(l3, "modelRepository");
        AbstractC1276k.f(c0720i, "providerRepository");
        AbstractC1276k.f(a, "reasoningConfigRepository");
        this.f10729b = w5;
        this.f10731c = l3;
        this.f10733d = a;
        g0 b5 = A4.W.b(FlexmarkHtmlConverter.DEFAULT_NODE);
        this.f10735e = b5;
        this.f10737f = new Q(b5);
        g0 b6 = A4.W.b(FlexmarkHtmlConverter.DEFAULT_NODE);
        this.f10739g = b6;
        this.f10741h = new Q(b6);
        g0 b7 = A4.W.b(Y3.v.f9812c);
        this.f10743i = b7;
        this.f10745j = new Q(b7);
        g0 b8 = A4.W.b(FlexmarkHtmlConverter.DEFAULT_NODE);
        this.f10746k = b8;
        Q q3 = new Q(b8);
        this.f10747l = q3;
        g0 b9 = A4.W.b(FlexmarkHtmlConverter.DEFAULT_NODE);
        this.f10748m = b9;
        Q q5 = new Q(b9);
        this.f10749n = q5;
        g0 b10 = A4.W.b(FlexmarkHtmlConverter.DEFAULT_NODE);
        this.f10750o = b10;
        this.f10751p = new Q(b10);
        g0 b11 = A4.W.b(FlexmarkHtmlConverter.DEFAULT_NODE);
        this.f10752q = b11;
        this.f10753r = new Q(b11);
        Float valueOf = Float.valueOf(1.0f);
        g0 b12 = A4.W.b(valueOf);
        this.f10754s = b12;
        this.f10755t = new Q(b12);
        g0 b13 = A4.W.b(valueOf);
        this.f10756u = b13;
        this.f10757v = new Q(b13);
        g0 b14 = A4.W.b(valueOf);
        this.f10758w = b14;
        this.f10759x = new Q(b14);
        g0 b15 = A4.W.b(valueOf);
        this.f10760y = b15;
        this.f10761z = new Q(b15);
        g0 b16 = A4.W.b(null);
        this.f10702A = b16;
        this.f10703B = new Q(b16);
        g0 b17 = A4.W.b(null);
        this.f10704C = b17;
        this.f10705D = new Q(b17);
        g0 b18 = A4.W.b(null);
        this.f10706E = b18;
        this.f10707F = new Q(b18);
        g0 b19 = A4.W.b(null);
        this.f10708G = b19;
        this.f10709H = new Q(b19);
        g0 b20 = A4.W.b(FlexmarkHtmlConverter.DEFAULT_NODE);
        this.f10710I = b20;
        this.f10711J = new Q(b20);
        g0 b21 = A4.W.b(FlexmarkHtmlConverter.DEFAULT_NODE);
        this.f10712K = b21;
        this.f10713L = new Q(b21);
        g0 b22 = A4.W.b(FlexmarkHtmlConverter.DEFAULT_NODE);
        this.f10714M = b22;
        this.f10715N = new Q(b22);
        g0 b23 = A4.W.b(FlexmarkHtmlConverter.DEFAULT_NODE);
        this.f10716O = b23;
        this.f10717P = new Q(b23);
        g0 b24 = A4.W.b(null);
        this.f10718Q = b24;
        this.f10719R = new Q(b24);
        g0 b25 = A4.W.b(null);
        this.f10720S = b25;
        this.f10721T = new Q(b25);
        Boolean bool = Boolean.FALSE;
        g0 b26 = A4.W.b(bool);
        this.f10722U = b26;
        this.f10723V = new Q(b26);
        g0 b27 = A4.W.b(bool);
        this.f10724W = b27;
        this.f10725X = new Q(b27);
        g0 b28 = A4.W.b(bool);
        this.f10726Y = b28;
        this.f10727Z = new Q(b28);
        V a6 = A4.W.a(1, 5, null);
        this.f10728a0 = a6;
        this.f10730b0 = new P(a6);
        this.f10732c0 = l3.f9638d;
        int i6 = 0;
        this.f10734d0 = new C0022x(7, new C0022x(i6, new C0717f(c0720i, null), c0720i.a.observeAll()), c0720i);
        this.f10736e0 = g(q3);
        this.f10738f0 = g(q5);
        this.f10742h0 = FlexmarkHtmlConverter.DEFAULT_NODE;
        AbstractC1888A.y(O.i(this), null, new C0823l(this, null), 3);
        AbstractC1888A.y(O.i(this), null, new r(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c9, code lost:
    
        if (r13 == r3) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0290, code lost:
    
        if (r13 == r3) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(a3.w r27, d4.c r28) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.w.e(a3.w, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(java.lang.String r21, d4.c r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof a3.v
            if (r2 == 0) goto L17
            r2 = r1
            a3.v r2 = (a3.v) r2
            int r3 = r2.f10701i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f10701i = r3
            goto L1c
        L17:
            a3.v r2 = new a3.v
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f10699g
            int r3 = r2.f10701i
            java.lang.String r4 = "new"
            r5 = 1
            if (r3 == 0) goto L33
            if (r3 != r5) goto L2b
            X3.a.e(r1)
            goto L50
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            X3.a.e(r1)
            boolean r1 = r0.f10744i0
            if (r1 == 0) goto L43
            java.lang.String r1 = r0.f10742h0
            boolean r1 = m4.AbstractC1276k.b(r1, r4)
            if (r1 == 0) goto L43
            return r4
        L43:
            r2.f10701i = r5
            r1 = r21
            java.lang.Object r1 = r0.j(r1, r2)
            c4.a r2 = c4.EnumC0927a.f11114c
            if (r1 != r2) goto L50
            return r2
        L50:
            r6 = r1
            com.bot.core.model.LLMSetting r6 = (com.bot.core.model.LLMSetting) r6
            if (r6 != 0) goto L61
            A4.g0 r1 = r0.f10720S
            r1.getClass()
            r2 = 0
            java.lang.String r3 = "未找到 Bot"
            r1.l(r2, r3)
            return r2
        L61:
            r0.f10744i0 = r5
            r0.f10742h0 = r4
            r17 = 0
            r19 = 8188(0x1ffc, float:1.1474E-41)
            java.lang.String r7 = ""
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            com.bot.core.model.LLMSetting r1 = com.bot.core.model.LLMSetting.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
            r0.f(r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.w.A(java.lang.String, d4.c):java.lang.Object");
    }

    public final void B() {
        if (this.f10744i0 && AbstractC1276k.b(this.f10742h0, "new")) {
            return;
        }
        this.f10744i0 = true;
        this.f10742h0 = "new";
        f(new LLMSetting("new", FlexmarkHtmlConverter.DEFAULT_NODE, null, FlexmarkHtmlConverter.DEFAULT_NODE, 1.0f, 1.0f, null, null, null, null, null, 0L, 0L, false), true);
    }

    public final void C(LLMSetting lLMSetting) {
        Iterable A02;
        g0 g0Var = this.f10743i;
        List<LLMSetting> list = (List) g0Var.getValue();
        boolean z5 = false;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AbstractC1276k.b(((LLMSetting) it.next()).a, lLMSetting.a)) {
                        z5 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (list.isEmpty()) {
            A02 = Y4.l.H(lLMSetting);
        } else if (z5) {
            ArrayList arrayList = new ArrayList(Y3.n.Z(list, 10));
            for (LLMSetting lLMSetting2 : list) {
                if (AbstractC1276k.b(lLMSetting2.a, lLMSetting.a)) {
                    lLMSetting2 = lLMSetting;
                }
                arrayList.add(lLMSetting2);
            }
            A02 = arrayList;
        } else {
            A02 = Y3.m.A0(list, lLMSetting);
        }
        List G02 = Y3.m.G0(A02, new I2.C(new I2.C(new B3.q(7), 6), 7));
        g0Var.getClass();
        g0Var.l(null, G02);
    }

    public final void D(String str, boolean z5) {
        AbstractC1276k.f(str, "model");
        g0 g0Var = this.f10746k;
        g0Var.getClass();
        g0Var.l(null, str);
        if (!z5 || this.f10744i0) {
            Boolean bool = Boolean.TRUE;
            g0 g0Var2 = this.f10726Y;
            g0Var2.getClass();
            g0Var2.l(null, bool);
            return;
        }
        g0 g0Var3 = this.f10748m;
        g0Var3.getClass();
        g0Var3.l(null, str);
        AbstractC1888A.y(O.i(this), null, new t(this, null), 3);
    }

    public final void E(LLMSetting lLMSetting) {
        boolean z5 = lLMSetting.f11209n;
        String str = lLMSetting.a;
        if (z5) {
            String str2 = str == null ? FlexmarkHtmlConverter.DEFAULT_NODE : str;
            g0 g0Var = this.f10735e;
            g0Var.getClass();
            g0Var.l(null, str2);
            String str3 = lLMSetting.f11198c;
            if (str3 == null) {
                str3 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            g0 g0Var2 = this.f10748m;
            g0Var2.getClass();
            g0Var2.l(null, str3);
            String str4 = lLMSetting.f11199d;
            if (str4 == null) {
                str4 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            g0 g0Var3 = this.f10752q;
            g0Var3.getClass();
            g0Var3.l(null, str4);
            Float valueOf = Float.valueOf(lLMSetting.f11200e);
            g0 g0Var4 = this.f10756u;
            g0Var4.getClass();
            g0Var4.l(null, valueOf);
            Float valueOf2 = Float.valueOf(lLMSetting.f11201f);
            g0 g0Var5 = this.f10760y;
            g0Var5.getClass();
            g0Var5.l(null, valueOf2);
            this.f10704C.k(lLMSetting.f11202g);
            this.f10708G.k(lLMSetting.f11203h);
            String str5 = lLMSetting.f11204i;
            if (str5 == null) {
                str5 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            g0 g0Var6 = this.f10712K;
            g0Var6.getClass();
            g0Var6.l(null, str5);
            String str6 = lLMSetting.f11205j;
            if (str6 == null) {
                str6 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            g0 g0Var7 = this.f10716O;
            g0Var7.getClass();
            g0Var7.l(null, str6);
        }
        if (str == null) {
            str = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        this.f10742h0 = str;
        this.f10744i0 = false;
        f(lLMSetting, false);
        this.f10740g0 = lLMSetting;
    }

    public final void f(LLMSetting lLMSetting, boolean z5) {
        this.f10739g.k(lLMSetting.f11197b);
        String str = lLMSetting.f11198c;
        String str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (str == null) {
            str = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        g0 g0Var = this.f10746k;
        g0Var.getClass();
        g0Var.l(null, str);
        String str3 = lLMSetting.f11199d;
        if (str3 == null) {
            str3 = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        g0 g0Var2 = this.f10750o;
        g0Var2.getClass();
        g0Var2.l(null, str3);
        Float valueOf = Float.valueOf(lLMSetting.f11200e);
        g0 g0Var3 = this.f10754s;
        g0Var3.getClass();
        g0Var3.l(null, valueOf);
        Float valueOf2 = Float.valueOf(lLMSetting.f11201f);
        g0 g0Var4 = this.f10758w;
        g0Var4.getClass();
        g0Var4.l(null, valueOf2);
        this.f10702A.k(lLMSetting.f11202g);
        this.f10706E.k(lLMSetting.f11203h);
        String str4 = lLMSetting.f11204i;
        if (str4 == null) {
            str4 = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        g0 g0Var5 = this.f10710I;
        g0Var5.getClass();
        g0Var5.l(null, str4);
        String str5 = lLMSetting.f11205j;
        if (str5 != null) {
            str2 = str5;
        }
        g0 g0Var6 = this.f10714M;
        g0Var6.getClass();
        g0Var6.l(null, str2);
        this.f10718Q.k(lLMSetting.f11206k);
        Boolean valueOf3 = Boolean.valueOf(z5);
        g0 g0Var7 = this.f10726Y;
        g0Var7.getClass();
        g0Var7.l(null, valueOf3);
    }

    public final Q g(Q q3) {
        Q q5 = this.f10733d.f2609e;
        return A4.W.m(new C0022x(new InterfaceC0007h[]{q3, this.f10732c0, this.f10734d0, q5}, new C0820i(this, null)), O.i(this), Z.a(2), new D2.c());
    }

    public final void h() {
        this.f10720S.k(null);
        g0 g0Var = this.f10731c.f9637c;
        g0Var.l(null, Y2.y.a((Y2.y) g0Var.getValue(), null, false, null, 11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (z(r0) == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r10 == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r9, d4.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a3.C0821j
            if (r0 == 0) goto L13
            r0 = r10
            a3.j r0 = (a3.C0821j) r0
            int r1 = r0.f10668i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10668i = r1
            goto L18
        L13:
            a3.j r0 = new a3.j
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f10666g
            int r1 = r0.f10668i
            A4.g0 r2 = r8.f10720S
            r3 = 2
            r4 = 1
            A4.g0 r5 = r8.f10722U
            r6 = 0
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L2f
            X3.a.e(r10)
            goto L74
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            X3.a.e(r10)
            goto L5c
        L3b:
            X3.a.e(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r5.getClass()
            r5.l(r6, r10)
            r2.k(r6)
            r0.f10668i = r4
            Y2.W r10 = r8.f10729b
            r10.getClass()
            Y2.P r1 = new Y2.P
            r1.<init>(r10, r9, r6)
            java.lang.Object r10 = r10.c(r0, r1)
            if (r10 != r7) goto L5c
            goto L73
        L5c:
            D2.i r10 = (D2.i) r10
            boolean r9 = r10 instanceof D2.h
            if (r9 == 0) goto L7d
            D2.h r10 = (D2.h) r10
            java.lang.Object r9 = r10.a
            com.bot.core.model.LLMSetting r9 = (com.bot.core.model.LLMSetting) r9
            r8.E(r9)
            r0.f10668i = r3
            java.lang.Object r9 = r8.z(r0)
            if (r9 != r7) goto L74
        L73:
            return r7
        L74:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r5.getClass()
            r5.l(r6, r9)
            goto La1
        L7d:
            boolean r9 = r10 instanceof D2.f
            r4 = 0
            if (r9 == 0) goto L95
            D2.f r10 = (D2.f) r10
            java.lang.String r9 = r10.a
            r2.getClass()
            r2.l(r6, r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r5.getClass()
            r5.l(r6, r9)
            goto La1
        L95:
            boolean r9 = r10 instanceof D2.g
            if (r9 == 0) goto La6
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r5.getClass()
            r5.l(r6, r9)
        La1:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        La6:
            N0.e r9 = new N0.e
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.w.i(java.lang.String, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r6, d4.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a3.C0822k
            if (r0 == 0) goto L13
            r0 = r7
            a3.k r0 = (a3.C0822k) r0
            int r1 = r0.f10672j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10672j = r1
            goto L18
        L13:
            a3.k r0 = new a3.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f10670h
            int r1 = r0.f10672j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            java.lang.String r6 = r0.f10669g
            X3.a.e(r7)
            goto L73
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            X3.a.e(r7)
            A4.g0 r7 = r5.f10743i
            java.lang.Object r7 = r7.getValue()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L3f:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r7.next()
            r4 = r1
            com.bot.core.model.LLMSetting r4 = (com.bot.core.model.LLMSetting) r4
            java.lang.String r4 = r4.a
            boolean r4 = m4.AbstractC1276k.b(r4, r6)
            if (r4 == 0) goto L3f
            goto L56
        L55:
            r1 = r3
        L56:
            com.bot.core.model.LLMSetting r1 = (com.bot.core.model.LLMSetting) r1
            if (r1 == 0) goto L5b
            return r1
        L5b:
            r0.f10669g = r6
            r0.f10672j = r2
            Y2.W r7 = r5.f10729b
            r7.getClass()
            Y2.T r1 = new Y2.T
            r2 = 1
            r1.<init>(r7, r3, r2)
            java.lang.Object r7 = r7.c(r0, r1)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r7 != r0) goto L73
            return r0
        L73:
            D2.i r7 = (D2.i) r7
            boolean r0 = r7 instanceof D2.h
            if (r0 == 0) goto L9b
            D2.h r7 = (D2.h) r7
            java.lang.Object r7 = r7.a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L83:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r7.next()
            r1 = r0
            com.bot.core.model.LLMSetting r1 = (com.bot.core.model.LLMSetting) r1
            java.lang.String r1 = r1.a
            boolean r1 = m4.AbstractC1276k.b(r1, r6)
            if (r1 == 0) goto L83
            r3 = r0
        L99:
            com.bot.core.model.LLMSetting r3 = (com.bot.core.model.LLMSetting) r3
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.w.j(java.lang.String, d4.c):java.lang.Object");
    }

    public final Q k() {
        return this.f10719R;
    }

    public final Q l() {
        return this.f10741h;
    }

    public final Q m() {
        return this.f10715N;
    }

    public final Q n() {
        return this.f10711J;
    }

    public final e0 o() {
        return this.f10721T;
    }

    public final Q p() {
        return this.f10727Z;
    }

    public final Q q() {
        return this.f10703B;
    }

    public final Q r() {
        return this.f10732c0;
    }

    public final Q s() {
        return this.f10751p;
    }

    public final Q t() {
        return this.f10707F;
    }

    public final Q u() {
        return this.f10736e0;
    }

    public final Q v() {
        return this.f10747l;
    }

    public final Q w() {
        return this.f10755t;
    }

    public final Q x() {
        return this.f10759x;
    }

    public final Q y() {
        return this.f10723V;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(d4.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a3.p
            if (r0 == 0) goto L13
            r0 = r5
            a3.p r0 = (a3.p) r0
            int r1 = r0.f10687i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10687i = r1
            goto L18
        L13:
            a3.p r0 = new a3.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10685g
            int r1 = r0.f10687i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L26
            X3.a.e(r5)
            goto L47
        L26:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2e:
            X3.a.e(r5)
            r0.f10687i = r3
            Y2.W r5 = r4.f10729b
            r5.getClass()
            Y2.T r1 = new Y2.T
            r3 = 1
            r1.<init>(r5, r2, r3)
            java.lang.Object r5 = r5.c(r0, r1)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L47
            return r0
        L47:
            D2.i r5 = (D2.i) r5
            boolean r0 = r5 instanceof D2.h
            if (r0 == 0) goto L72
            D2.h r5 = (D2.h) r5
            java.lang.Object r5 = r5.a
            java.util.List r5 = (java.util.List) r5
            B3.q r0 = new B3.q
            r1 = 7
            r0.<init>(r1)
            I2.C r1 = new I2.C
            r3 = 6
            r1.<init>(r0, r3)
            I2.C r0 = new I2.C
            r3 = 7
            r0.<init>(r1, r3)
            java.util.List r5 = Y3.m.G0(r5, r0)
            A4.g0 r0 = r4.f10743i
            r0.getClass()
            r0.l(r2, r5)
            goto L87
        L72:
            boolean r0 = r5 instanceof D2.f
            if (r0 == 0) goto L83
            D2.f r5 = (D2.f) r5
            java.lang.String r5 = r5.a
            A4.g0 r0 = r4.f10720S
            r0.getClass()
            r0.l(r2, r5)
            goto L87
        L83:
            boolean r5 = r5 instanceof D2.g
            if (r5 == 0) goto L8a
        L87:
            X3.y r5 = X3.y.a
            return r5
        L8a:
            N0.e r5 = new N0.e
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.w.z(d4.c):java.lang.Object");
    }
}
