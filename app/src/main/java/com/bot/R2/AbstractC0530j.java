package R2;

import B0.Q;
import D.AbstractC0095u;
import D.C0058b;
import D.C0060c;
import D.C0064e;
import D.Q0;
import F0.V;
import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.C0158m;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import O.C0299b0;
import O.C0300c;
import O.U0;
import O.x0;
import P2.C0348d;
import P2.D0;
import Q.A0;
import Q.AbstractC0452p1;
import Q.C0405d2;
import Q.C0458r0;
import Q.C0483x1;
import Q.M1;
import Q.N;
import Q.O;
import Q.R1;
import Q.Y1;
import Q.b3;
import Q.f3;
import Q.t3;
import Q.u3;
import S0.P;
import T.AbstractC0623o0;
import T.C0602e;
import T.C0616l;
import T.C0625p0;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import T.d1;
import T.e1;
import X2.U;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import b0.C0873f;
import b3.AbstractC0888d;
import com.bot.core.model.ConversationInfo;
import com.bot.core.model.LLMSetting;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import f.C0970a;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1031h;
import h0.C1032i;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import i4.AbstractC1121e;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.Arrays;
import l4.InterfaceC1193a;
import m.AbstractC1205L;
import m.AbstractC1244z;
import m.InterfaceC1194A;
import m0.AbstractC1249d;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.AbstractC1324g;
import n.C1347v;
import o0.C1386H;
import o4.AbstractC1410a;
import p.AbstractC1464z;
import r.AbstractC1552b;
import r.AbstractC1573i;
import r.C1517E;
import r.C1606t;
import s.AbstractC1647k;
import s.C1643g;
import t.C1682j;
import t0.AbstractC1688b;
import u0.C1745f;
import u0.C1746g;
import u0.C1750k;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1813t;
import v.C1814u;
import v.C1818y;
import v.InterfaceC1797g;
import v.Z;
import v.k0;
import v.o0;
import v.p0;
import v.t0;
import w.AbstractC1829a;
import y2.AbstractC1992b;

/* renamed from: R2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0530j {
    public static final C0873f a = new C0873f(new C0064e(7), false, -1359879112);

    /* renamed from: b, reason: collision with root package name */
    public static final C0873f f6940b = new C0873f(new C0064e(8), false, -2049710602);

    /* renamed from: c, reason: collision with root package name */
    public static final C0873f f6941c = new C0873f(new B4.z(15), false, -2102366767);

    /* renamed from: d, reason: collision with root package name */
    public static final C0873f f6942d = new C0873f(new B4.z(16), false, 1375316438);

    /* renamed from: e, reason: collision with root package name */
    public static final C0873f f6943e = new C0873f(new C0064e(9), false, 408228515);

    /* renamed from: f, reason: collision with root package name */
    public static final C0873f f6944f = new C0873f(new B4.z(17), false, -1971963800);

    /* renamed from: g, reason: collision with root package name */
    public static final C0873f f6945g = new C0873f(new B4.z(18), false, 509210793);

    /* renamed from: h, reason: collision with root package name */
    public static final C0873f f6946h = new C0873f(new C0064e(10), false, -1698896370);

    /* renamed from: i, reason: collision with root package name */
    public static final C0873f f6947i = new C0873f(new C0064e(11), false, 224304311);

    /* renamed from: j, reason: collision with root package name */
    public static final C0873f f6948j = new C0873f(new C0064e(12), false, 82024470);

    /* renamed from: k, reason: collision with root package name */
    public static final C0873f f6949k = new C0873f(new C0064e(13), false, -1681799813);

    /* renamed from: l, reason: collision with root package name */
    public static final C0873f f6950l = new C0873f(new C0064e(14), false, -307894036);

    /* renamed from: m, reason: collision with root package name */
    public static final C0873f f6951m = new C0873f(new C0064e(15), false, -1642902219);

    public static final void a(final ConversationInfo conversationInfo, final boolean z5, final boolean z6, final boolean z7, final InterfaceC1193a interfaceC1193a, final InterfaceC1193a interfaceC1193a2, C0626q c0626q, final int i6) {
        long j3;
        C0148f c0148f;
        long j4;
        boolean z8;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(interfaceC1193a, "onClick");
        AbstractC1276k.f(interfaceC1193a2, "onLongPress");
        c0626q2.d0(1589166690);
        int i7 = i6 | (c0626q2.h(conversationInfo) ? 4 : 2) | (c0626q2.g(z5) ? 32 : 16) | (c0626q2.g(z6) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q2.g(z7) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q2.h(interfaceC1193a) ? 16384 : 8192) | (c0626q2.h(interfaceC1193a2) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS);
        if (c0626q2.S(i7 & 1, (74899 & i7) != 74898)) {
            c0626q2.b0(-1819142325);
            C1818y c1818y = t0.a;
            InterfaceC1041r m3 = AbstractC1464z.m(c1818y, !z6, interfaceC1193a2, interfaceC1193a, 238);
            if (z6) {
                c0626q2.b0(-1819148972);
                j3 = o0.s.c(0.1f, ((N) c0626q2.j(O.a)).f5433w);
                c0626q2.p(false);
            } else if (z5) {
                c0626q2.b0(-1819146091);
                j3 = o0.s.c(0.12f, ((N) c0626q2.j(O.a)).a);
                c0626q2.p(false);
            } else {
                c0626q2.b0(-1819144371);
                c0626q2.p(false);
                j3 = o0.s.f13480g;
            }
            InterfaceC1041r f6 = AbstractC1464z.f(m3, j3, o0.y.f13496b);
            if (z6) {
                c0626q2.b0(546185654);
                Object P5 = c0626q2.P();
                if (P5 == C0616l.a) {
                    P5 = new D0(15);
                    c0626q2.m0(P5);
                }
                f6 = o0.y.o(f6, (l4.c) P5);
                c0626q2.p(false);
            } else {
                c0626q2.b0(17622905);
                c0626q2.p(false);
            }
            c0626q2.p(false);
            V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, f6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f2 = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f2);
            } else {
                c0626q2.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q2, d6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q2, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q2, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q2, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q2, c6, c0146e4);
            InterfaceC1041r f7 = t0.f(z.f7075b, S.l.f7374V, 2, AbstractC1787b.x(c1818y, z.a));
            p0 a6 = o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q2, 48);
            int hashCode2 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, f7);
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f2);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, a6, c0146e);
            T.r.G(c0626q2, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q2, c0146e3, c0626q2, c0144d);
            T.r.G(c0626q2, c7, c0146e4);
            String str = conversationInfo.f11153b;
            long z9 = s4.j.z(16);
            W0.k kVar = z5 ? W0.k.f8835i : W0.k.f8834h;
            if (z5) {
                c0626q2.b0(103446611);
                c0148f = c0148f2;
                j4 = ((N) c0626q2.j(O.a)).a;
                c0626q2.p(false);
            } else {
                c0148f = c0148f2;
                c0626q2.b0(103449013);
                j4 = ((N) c0626q2.j(O.a)).f5427q;
                c0626q2.p(false);
            }
            long j5 = j4;
            if (1.0f <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            C0148f c0148f3 = c0148f;
            f3.b(str, new Z(1.0f, true), j5, z9, kVar, 0L, null, 0L, 0, false, 1, 0, null, c0626q, 24576, 24576, 245672);
            c0626q2 = c0626q;
            C1038o c1038o = C1038o.a;
            if (z6) {
                c0626q2.b0(-1087880584);
                float f8 = 20;
                InterfaceC1041r j6 = t0.j(AbstractC1787b.C(c1038o, 12, S.l.f7374V, S.l.f7374V, S.l.f7374V, 14), f8);
                V d7 = AbstractC1806l.d(C1026c.f11790h, false);
                int hashCode3 = Long.hashCode(c0626q2.f8164T);
                InterfaceC0617l0 l6 = c0626q2.l();
                InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, j6);
                c0626q2.f0();
                if (c0626q2.f8163S) {
                    c0626q2.k(c0148f3);
                } else {
                    c0626q2.p0();
                }
                T.r.G(c0626q2, d7, c0146e);
                T.r.G(c0626q2, l6, c0146e2);
                AbstractC1135a.n(hashCode3, c0626q2, c0146e3, c0626q2, c0144d);
                T.r.G(c0626q2, c8, c0146e4);
                M1.a(t0.j(c1038o, f8), ((N) c0626q2.j(O.a)).f5433w, 2, 0L, 0, S.l.f7374V, c0626q2, 390, 56);
                z8 = true;
                c0626q2.p(true);
                c0626q2.p(false);
            } else {
                z8 = true;
                if (z7) {
                    c0626q2.b0(-1087317562);
                    M1.a(t0.j(AbstractC1787b.C(c1038o, 12, S.l.f7374V, S.l.f7374V, S.l.f7374V, 14), 16), ((N) c0626q2.j(O.a)).a, 2, 0L, 0, S.l.f7374V, c0626q2, 390, 56);
                } else {
                    c0626q2.b0(-1090670026);
                }
                c0626q2.p(false);
            }
            c0626q2.p(z8);
            c0626q2.p(z8);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(z5, z6, z7, interfaceC1193a, interfaceC1193a2, i6) { // from class: R2.a

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f6917e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f6918f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f6919g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f6920h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f6921i;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(9);
                    AbstractC0530j.a(ConversationInfo.this, this.f6917e, this.f6918f, this.f6919g, this.f6920h, this.f6921i, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void b(ConversationInfo conversationInfo, C0405d2 c0405d2, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, InterfaceC1193a interfaceC1193a3, C0626q c0626q, int i6) {
        AbstractC1276k.f(c0405d2, "sheetState");
        AbstractC1276k.f(interfaceC1193a, "onDismiss");
        AbstractC1276k.f(interfaceC1193a2, "onRename");
        AbstractC1276k.f(interfaceC1193a3, "onDelete");
        c0626q.d0(933392176);
        int i7 = i6 | (c0626q.f(c0405d2) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 9361) != 9360)) {
            AbstractC0452p1.a(interfaceC1193a, null, c0405d2, S.l.f7374V, false, null, 0L, 0L, S.l.f7374V, 0L, null, null, null, AbstractC0874g.c(2008054546, new Q0(3, interfaceC1193a2, interfaceC1193a3), c0626q), c0626q, 6 | ((i7 << 3) & 896));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new I.s(conversationInfo, c0405d2, interfaceC1193a, interfaceC1193a2, interfaceC1193a3, i6);
        }
    }

    public static final void c(InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, boolean z5, C0626q c0626q, int i6) {
        AbstractC1276k.f(interfaceC1193a, "onConfirm");
        AbstractC1276k.f(interfaceC1193a2, "onDismiss");
        c0626q.d0(1383257884);
        int i7 = i6 | (c0626q.h(interfaceC1193a) ? 4 : 2) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            R1.a(interfaceC1193a2, AbstractC0874g.c(988239716, new C0524d(interfaceC1193a, z5, 0), c0626q), null, AbstractC0874g.c(1655621606, new C0522b(2, interfaceC1193a2), c0626q), f6944f, f6945g, null, 0L, 0L, 0L, 0L, S.l.f7374V, null, c0626q, 1772598);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0525e(interfaceC1193a, interfaceC1193a2, z5, i6, 0);
        }
    }

    public static final void d(LLMSetting lLMSetting, boolean z5, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        long j3;
        String str;
        long j4;
        C0626q c0626q2 = c0626q;
        String str2 = lLMSetting.f11197b;
        c0626q2.d0(1393540789);
        int i7 = i6 | (c0626q2.f(lLMSetting) ? 4 : 2) | (c0626q2.g(z5) ? 32 : 16) | (c0626q2.h(interfaceC1193a) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q2.S(i7 & 1, (i7 & 147) != 146)) {
            if (z5) {
                c0626q2.b0(-180086104);
                j3 = o0.s.c(0.12f, ((N) c0626q2.j(O.a)).a);
                c0626q2.p(false);
            } else {
                c0626q2.b0(-180012820);
                c0626q2.p(false);
                j3 = o0.s.f13480g;
            }
            C1818y c1818y = t0.a;
            boolean z6 = (i7 & 896) == 256;
            Object P5 = c0626q2.P();
            if (z6 || P5 == C0616l.a) {
                P5 = new C0348d(15, interfaceC1193a);
                c0626q2.m0(P5);
            }
            InterfaceC1041r f6 = AbstractC1464z.f(AbstractC1992b.a(31, c1818y, (InterfaceC1193a) P5, false), j3, o0.y.f13496b);
            V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, f6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q2, d6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q2, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q2, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q2, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q2, c6, c0146e4);
            InterfaceC1041r f7 = t0.f(z.f7075b, S.l.f7374V, 2, AbstractC1787b.x(c1818y, z.a));
            p0 a6 = o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q2, 48);
            int hashCode2 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, f7);
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, a6, c0146e);
            T.r.G(c0626q2, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q2, c0146e3, c0626q2, c0144d);
            T.r.G(c0626q2, c7, c0146e4);
            String str3 = lLMSetting.a;
            if (AbstractC1776n.Q(str2)) {
                str = str3 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : str3;
            } else {
                str = str2;
            }
            AbstractC0888d.b(22, 384, c0626q2, null, str, lLMSetting.f11206k);
            if (AbstractC1776n.Q(str2)) {
                str2 = str3 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : str3;
            }
            String str4 = str2;
            long z7 = s4.j.z(16);
            W0.k kVar = z5 ? W0.k.f8835i : W0.k.f8834h;
            if (z5) {
                c0626q2.b0(1610379802);
                j4 = ((N) c0626q2.j(O.a)).a;
                c0626q2.p(false);
            } else {
                c0626q2.b0(1610458232);
                j4 = ((N) c0626q2.j(O.a)).f5427q;
                c0626q2.p(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            f3.b(str4, AbstractC1787b.C(new Z(1.0f, true), 16, S.l.f7374V, S.l.f7374V, S.l.f7374V, 14), j4, z7, kVar, 0L, null, 0L, 0, false, 1, 0, null, c0626q, 24576, 24576, 245672);
            c0626q2 = c0626q;
            c0626q2.p(true);
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new P2.G(lLMSetting, z5, interfaceC1193a, i6, 2);
        }
    }

    public static final void e(boolean z5, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        c0626q.d0(18501801);
        int i7 = (c0626q.g(z5) ? 4 : 2) | i6 | (c0626q.h(interfaceC1193a) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            d1 b5 = AbstractC1324g.b(z5 ? S.l.f7374V : -90.0f, AbstractC1318d.s(150, 6, null), null, c0626q, 48, 28);
            boolean z6 = (i7 & 112) == 32;
            Object P5 = c0626q.P();
            if (z6 || P5 == C0616l.a) {
                P5 = new C0348d(16, interfaceC1193a);
                c0626q.m0(P5);
            }
            i(((Number) b5.getValue()).floatValue(), 0, c0626q, AbstractC1464z.k(C1038o.a, false, null, (InterfaceC1193a) P5, 15), h5.e.j0(R.string.drawer_bots_toggle, c0626q), h5.e.j0(R.string.model_config_bots_title, c0626q));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0524d(z5, interfaceC1193a, i6);
        }
    }

    public static final void f(InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        int i7;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(interfaceC1193a, "onNavigateToSetting");
        c0626q2.d0(-225614751);
        if ((i6 & 6) == 0) {
            i7 = i6 | (c0626q2.h(interfaceC1193a) ? 4 : 2);
        } else {
            i7 = i6;
        }
        if (c0626q2.S(i7 & 1, (i7 & 3) != 2)) {
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q2, 0);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            C1038o c1038o = C1038o.a;
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, c1038o);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q2, a6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q2, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q2, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q2, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q2, c6, c0146e4);
            C1818y c1818y = t0.a;
            boolean z5 = (i7 & 14) == 4;
            Object P5 = c0626q2.P();
            if (z5 || P5 == C0616l.a) {
                P5 = new C0348d(14, interfaceC1193a);
                c0626q2.m0(P5);
            }
            float f6 = 16;
            InterfaceC1041r y5 = AbstractC1787b.y(AbstractC1992b.a(31, c1818y, (InterfaceC1193a) P5, false), f6);
            C1032i c1032i = C1026c.f11796n;
            p0 a7 = o0.a(AbstractC1799h.f15307e, c1032i, c0626q2, 54);
            int hashCode2 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, y5);
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, a7, c0146e);
            T.r.G(c0626q2, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q2, c0146e3, c0626q2, c0144d);
            T.r.G(c0626q2, c7, c0146e4);
            p0 a8 = o0.a(AbstractC1799h.a, c1032i, c0626q2, 48);
            int hashCode3 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l6 = c0626q2.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, c1038o);
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, a8, c0146e);
            T.r.G(c0626q2, l6, c0146e2);
            AbstractC1135a.n(hashCode3, c0626q2, c0146e3, c0626q2, c0144d);
            T.r.G(c0626q2, c8, c0146e4);
            C1746g c1746g = AbstractC1121e.a;
            if (c1746g == null) {
                float f7 = (float) 24.0d;
                C1745f c1745f = new C1745f("Settings", f7, f7, 24.0f, 24.0f, 0L, 0, false, 224);
                o0.N n3 = new o0.N(o0.y.c(0));
                o0.N n5 = new o0.N(o0.y.d(4278190080L));
                Q4.m mVar = new Q4.m(1);
                mVar.a.add(new u0.o(10.325f, 4.317f));
                mVar.e(0.426f, -1.756f, 2.924f, -1.756f, 3.35f, S.l.f7374V);
                mVar.c(1.724f, 1.724f, 2.573f, 1.066f, false);
                mVar.e(1.543f, -0.94f, 3.31f, 0.826f, 2.37f, 2.37f);
                mVar.c(1.724f, 1.724f, 1.065f, 2.572f, false);
                mVar.e(1.756f, 0.426f, 1.756f, 2.924f, S.l.f7374V, 3.35f);
                mVar.c(1.724f, 1.724f, -1.066f, 2.573f, false);
                mVar.e(0.94f, 1.543f, -0.826f, 3.31f, -2.37f, 2.37f);
                mVar.c(1.724f, 1.724f, -2.572f, 1.065f, false);
                mVar.e(-0.426f, 1.756f, -2.924f, 1.756f, -3.35f, S.l.f7374V);
                mVar.c(1.724f, 1.724f, -2.573f, -1.066f, false);
                mVar.e(-1.543f, 0.94f, -3.31f, -0.826f, -2.37f, -2.37f);
                mVar.c(1.724f, 1.724f, -1.065f, -2.572f, false);
                mVar.e(-1.756f, -0.426f, -1.756f, -2.924f, S.l.f7374V, -3.35f);
                mVar.c(1.724f, 1.724f, 1.066f, -2.573f, false);
                mVar.e(-0.94f, -1.543f, 0.826f, -3.31f, 2.37f, -2.37f);
                mVar.e(1.0f, 0.608f, 2.296f, 0.07f, 2.572f, -1.065f);
                C1750k c1750k = C1750k.f15089c;
                ArrayList arrayList = mVar.a;
                arrayList.add(c1750k);
                C1745f.a(c1745f, arrayList, n3, n5, 2.0f, 1, 1, 4.0f);
                o0.N n6 = new o0.N(o0.y.c(0));
                o0.N n7 = new o0.N(o0.y.d(4278190080L));
                ArrayList arrayList2 = new ArrayList(32);
                arrayList2.add(new u0.o(12.0f, 12.0f));
                arrayList2.add(new u0.w(-3.0f, S.l.f7374V));
                arrayList2.add(new u0.s(3.0f, 3.0f, S.l.f7374V, true, true, 6.0f, S.l.f7374V));
                arrayList2.add(new u0.s(3.0f, 3.0f, S.l.f7374V, true, true, -6.0f, S.l.f7374V));
                C1745f.a(c1745f, arrayList2, n6, n7, 2.0f, 1, 1, 4.0f);
                c1746g = c1745f.b();
                AbstractC1121e.a = c1746g;
            }
            String j02 = h5.e.j0(R.string.settings_title, c0626q2);
            InterfaceC1041r j3 = t0.j(c1038o, 24);
            e1 e1Var = O.a;
            A0.b(c1746g, j02, j3, ((N) c0626q2.j(e1Var)).f5427q, c0626q2, 384, 0);
            AbstractC1787b.h(c0626q2, t0.n(c1038o, f6));
            f3.b(h5.e.j0(R.string.settings_title, c0626q2), null, ((N) c0626q2.j(e1Var)).f5427q, s4.j.z(18), null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6129j, c0626q, 24576, 0, 131050);
            c0626q2 = c0626q;
            c0626q2.p(true);
            c0626q2.p(true);
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new C0458r0(i6, 1, interfaceC1193a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a47  */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final X2.C0692g r75, final X2.L r76, final java.util.List r77, final java.lang.String r78, final l4.c r79, final com.bot.core.model.VersionInfo r80, final X2.U r81, final boolean r82, final boolean r83, final l4.InterfaceC1193a r84, final l4.InterfaceC1193a r85, final boolean r86, final java.lang.String r87, final l4.InterfaceC1193a r88, l4.InterfaceC1193a r89, final R2.A r90, final l4.c r91, T.C0626q r92, final int r93) {
        /*
            Method dump skipped, instructions count: 2723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.AbstractC0530j.g(X2.g, X2.L, java.util.List, java.lang.String, l4.c, com.bot.core.model.VersionInfo, X2.U, boolean, boolean, l4.a, l4.a, boolean, java.lang.String, l4.a, l4.a, R2.A, l4.c, T.q, int):void");
    }

    public static final void h(int i6, C0626q c0626q) {
        C0626q c0626q2 = c0626q;
        c0626q2.d0(346619346);
        if (c0626q2.S(i6 & 1, i6 != 0)) {
            InterfaceC1041r A5 = AbstractC1787b.A(S.l.f7374V, 24, 1, t0.a);
            V d6 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, A5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, d6, C0150g.f1928f);
            T.r.G(c0626q2, l3, C0150g.f1927e);
            T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q2, C0150g.f1930h);
            T.r.G(c0626q2, c6, C0150g.f1926d);
            f3.b(h5.e.j0(R.string.chat_search_no_results, c0626q2), null, ((N) c0626q2.j(O.a)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6130k, c0626q, 0, 0, 131066);
            c0626q2 = c0626q;
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new B4.z(i6, 19);
        }
    }

    public static final void i(float f6, int i6, C0626q c0626q, InterfaceC1041r interfaceC1041r, String str, String str2) {
        C0626q c0626q2 = c0626q;
        c0626q2.d0(1278701577);
        int i7 = i6 | (c0626q.f(interfaceC1041r) ? 4 : 2) | (c0626q2.d(R.drawable.icon_park_outline_down) ? 32 : 16) | (c0626q2.f(str) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q2.f(str2) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q2.c(f6) ? 16384 : 8192);
        if (c0626q2.S(i7 & 1, (i7 & 9363) != 9362)) {
            C1818y c1818y = t0.a;
            InterfaceC1041r c6 = interfaceC1041r.c(c1818y);
            V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, c6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q2, d6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q2, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q2, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q2, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q2, c7, c0146e4);
            InterfaceC1041r f7 = t0.f(z.f7075b, S.l.f7374V, 2, AbstractC1787b.x(c1818y, z.a));
            p0 a6 = o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q2, 48);
            int hashCode2 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, f7);
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, a6, c0146e);
            T.r.G(c0626q2, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q2, c0146e3, c0626q2, c0144d);
            T.r.G(c0626q2, c8, c0146e4);
            int i8 = i7 >> 3;
            AbstractC1688b L5 = Y3.C.L(R.drawable.icon_park_outline_down, i8 & 14, c0626q2);
            e1 e1Var = O.a;
            long j3 = ((N) c0626q2.j(e1Var)).f5429s;
            C1038o c1038o = C1038o.a;
            A0.a(L5, str, l0.h.i(t0.j(c1038o, 22), f6), j3, c0626q2, 8 | (i8 & 112), 0);
            f3.b(str2, AbstractC1787b.C(c1038o, 16, S.l.f7374V, S.l.f7374V, S.l.f7374V, 14), ((N) c0626q2.j(e1Var)).f5427q, s4.j.z(16), W0.k.f8835i, 0L, null, 0L, 0, false, 1, 0, null, c0626q2, ((i7 >> 9) & 14) | 1597488, 24576, 245672);
            c0626q2 = c0626q2;
            c0626q2.p(true);
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new C0531k(interfaceC1041r, str, str2, f6, i6);
        }
    }

    public static final void j(InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        AbstractC1276k.f(interfaceC1193a, "onCloseDrawer");
        c0626q.d0(1893778069);
        int i7 = (c0626q.h(interfaceC1193a) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            InterfaceC1041r A5 = AbstractC1787b.A(S.l.f7374V, 48, 1, t0.a);
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11799q, c0626q, 48);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, A5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            R1.b(interfaceC1193a, null, false, C.e.a(20), null, null, null, null, f6949k, c0626q, (i7 & 14) | 805306368, 502);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0522b(i6, 3, interfaceC1193a);
        }
    }

    public static final void k(final String str, final l4.c cVar, final A a6, final boolean z5, final l4.c cVar2, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        int i7;
        boolean z6;
        boolean z7;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(str, "searchQuery");
        AbstractC1276k.f(cVar, "onSearchQueryChange");
        c0626q2.d0(-1249486651);
        if ((i6 & 6) == 0) {
            i7 = (c0626q2.f(str) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q2.h(cVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q2.d(a6 == null ? -1 : a6.ordinal()) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q2.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q2.h(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q2.h(interfaceC1193a) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        int i8 = i7;
        if (c0626q2.S(i8 & 1, (i8 & 74899) != 74898)) {
            final m0.n nVar = (m0.n) c0626q2.j(AbstractC0204q0.f2359i);
            Object P5 = c0626q2.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = new C1682j();
                c0626q2.m0(P5);
            }
            final C1682j c1682j = (C1682j) P5;
            C0483x1 c0483x1 = C0483x1.a;
            final b3 c6 = C0483x1.c(6, c0626q2);
            float f6 = d3.b.a;
            float f7 = ((e1.f) AbstractC1117a.c(new e1.f((56 - f6) / 2), new e1.f(0))).f11571c;
            float f8 = 12;
            float f9 = 8;
            final k0 k0Var = new k0(f8, f9, f8, f9);
            final C.d a7 = C.e.a(26);
            e1 e1Var = O.a;
            final long j3 = ((N) c0626q2.j(e1Var)).f5428r;
            final long c7 = o0.s.c(0.75f, ((N) c0626q2.j(e1Var)).f5429s);
            final long c8 = o0.s.c(0.7f, ((N) c0626q2.j(e1Var)).f5429s);
            InterfaceC1041r z8 = AbstractC1787b.z(t0.a, f8, f7);
            p0 a8 = o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q2, 48);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c9 = AbstractC1024a.c(c0626q2, z8);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q2, a8, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q2, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q2, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q2, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q2, c9, c0146e4);
            T.r.b(new C0625p0[]{Q.D0.f5207c.a(new e1.f(f6)), U0.a.a(c6.f5700k)}, AbstractC0874g.c(474683113, new l4.e() { // from class: R2.B
                {
                    float f10 = d3.b.a;
                }

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    float f10 = d3.b.a;
                    C0626q c0626q3 = (C0626q) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c0626q3.S(intValue & 1, (intValue & 3) != 2)) {
                        P p5 = ((t3) c0626q3.j(u3.a)).f6129j;
                        e1 e1Var2 = O.a;
                        P a9 = P.a(p5, ((N) c0626q3.j(e1Var2)).f5427q, 0L, null, null, null, 0L, null, 0L, null, 16777214);
                        o0.N n3 = new o0.N(((N) c0626q3.j(e1Var2)).a);
                        if (1.0f <= 0.0d) {
                            AbstractC1829a.a("invalid weight; must be greater than zero");
                        }
                        InterfaceC1041r d6 = t0.d(new Z(1.0f, true), f10);
                        final l4.c cVar3 = cVar2;
                        boolean f11 = c0626q3.f(cVar3);
                        Object P6 = c0626q3.P();
                        if (f11 || P6 == C0616l.a) {
                            P6 = new P2.r(cVar3, 3);
                            c0626q3.m0(P6);
                        }
                        InterfaceC1041r s5 = AbstractC1249d.s(d6, (l4.c) P6);
                        final long j4 = c8;
                        final long j5 = c7;
                        final long j6 = j3;
                        final C.d dVar = a7;
                        final b3 b3Var = c6;
                        final A a10 = a6;
                        final String str2 = str;
                        final l4.c cVar4 = cVar;
                        final m0.n nVar2 = nVar;
                        final C1682j c1682j2 = c1682j;
                        final k0 k0Var2 = k0Var;
                        final boolean z9 = z5;
                        AbstractC0095u.b(str2, cVar4, s5, false, false, a9, null, null, true, 0, 0, null, null, c1682j2, n3, AbstractC0874g.c(-1710974810, new l4.f() { // from class: R2.D
                            @Override // l4.f
                            public final Object d(Object obj3, Object obj4, Object obj5) {
                                l4.e eVar = (l4.e) obj3;
                                C0626q c0626q4 = (C0626q) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                AbstractC1276k.f(eVar, "innerTextField");
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= c0626q4.h(eVar) ? 4 : 2;
                                }
                                if (c0626q4.S(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    C0483x1 c0483x12 = C0483x1.a;
                                    C0873f c10 = AbstractC0874g.c(-1042266002, new C(j4, 2), c0626q4);
                                    A a11 = a10;
                                    m0.n nVar3 = nVar2;
                                    l4.c cVar5 = cVar3;
                                    boolean z10 = z9;
                                    long j7 = j5;
                                    C0873f c11 = AbstractC0874g.c(-1846681267, new C0300c(a11, nVar3, cVar5, z10, j7), c0626q4);
                                    int i9 = intValue2;
                                    String str3 = str2;
                                    c0483x12.b(str3, eVar, true, true, X0.C.a, c1682j2, false, null, c10, c11, AbstractC0874g.c(-1211534017, new C0060c(str3, cVar4, j7), c0626q4), null, b3Var, k0Var2, AbstractC0874g.c(-1743058311, new C0058b(dVar, j6), c0626q4), c0626q4, ((i9 << 3) & 112) | 906194304, 14155782, 14528);
                                } else {
                                    c0626q4.V();
                                }
                                return X3.y.a;
                            }
                        }, c0626q3), c0626q3, 100663296, 199680, 7896);
                    } else {
                        c0626q3.V();
                    }
                    return X3.y.a;
                }
            }, c0626q), c0626q, 56);
            if (interfaceC1193a != null) {
                c0626q.b0(-1244120412);
                C1038o c1038o = C1038o.a;
                AbstractC1787b.h(c0626q, t0.n(c1038o, 10));
                InterfaceC1041r f10 = AbstractC1464z.f(l0.h.c(t0.j(c1038o, f6), C.e.a), j3, o0.y.f13496b);
                boolean z9 = (i8 & 458752) == 131072;
                Object P6 = c0626q.P();
                if (z9 || P6 == c0602e) {
                    P6 = new C0348d(17, interfaceC1193a);
                    c0626q.m0(P6);
                }
                z7 = false;
                InterfaceC1041r a9 = AbstractC1992b.a(31, f10, (InterfaceC1193a) P6, false);
                V d6 = AbstractC1806l.d(C1026c.f11790h, false);
                int hashCode2 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l5 = c0626q.l();
                InterfaceC1041r c10 = AbstractC1024a.c(c0626q, a9);
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f);
                } else {
                    c0626q.p0();
                }
                T.r.G(c0626q, d6, c0146e);
                T.r.G(c0626q, l5, c0146e2);
                AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
                T.r.G(c0626q, c10, c0146e4);
                A0.a(Y3.C.L(R.drawable.cuida_edit_outline, 0, c0626q), h5.e.j0(R.string.chat_new_chat, c0626q), null, c7, c0626q, 8, 4);
                c0626q2 = c0626q;
                z6 = true;
                c0626q2.p(true);
            } else {
                c0626q2 = c0626q;
                z6 = true;
                z7 = false;
                c0626q2.b0(-1251439047);
            }
            c0626q2.p(z7);
            c0626q2.p(z6);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new Q.L(str, cVar, a6, z5, cVar2, interfaceC1193a, i6, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v37 */
    public static final void l(final String str, final String str2, final U u5, final boolean z5, final boolean z6, final InterfaceC1193a interfaceC1193a, final InterfaceC1193a interfaceC1193a2, final InterfaceC1041r interfaceC1041r, C0626q c0626q, final int i6) {
        C0626q c0626q2;
        InterfaceC1041r interfaceC1041r2;
        String j3;
        boolean z7;
        C0602e c0602e;
        C0146e c0146e;
        int i7;
        int i8;
        C0626q c0626q3;
        Object r02;
        C0626q c0626q4;
        C0626q c0626q5 = c0626q;
        AbstractC1276k.f(u5, "downloadState");
        AbstractC1276k.f(interfaceC1193a, "onStartDownload");
        AbstractC1276k.f(interfaceC1193a2, "onToggleNotes");
        c0626q5.d0(-1078504774);
        int i9 = i6 | (c0626q5.f(str) ? 4 : 2) | (c0626q5.f(str2) ? 32 : 16) | (c0626q5.f(u5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q5.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q5.g(z6) ? 16384 : 8192) | (c0626q5.h(interfaceC1193a) ? 131072 : PegdownExtensions.SUPPRESS_HTML_BLOCKS) | (c0626q5.h(interfaceC1193a2) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT);
        if (c0626q5.S(i9 & 1, (4793491 & i9) != 4793490)) {
            Context context = (Context) c0626q5.j(AndroidCompositionLocals_androidKt.f10780b);
            boolean z8 = u5.f9230b;
            float f6 = u5.f9231c;
            long j4 = u5.f9232d;
            long j5 = u5.f9233e;
            C0970a c0970a = new C0970a(3);
            int i10 = 458752 & i9;
            boolean z9 = i10 == 131072;
            Object P5 = c0626q5.P();
            C0602e c0602e2 = C0616l.a;
            if (z9 || P5 == c0602e2) {
                P5 = new x0(6, interfaceC1193a);
                c0626q5.m0(P5);
            }
            c.l P6 = Y4.l.P(c0970a, (l4.c) P5, c0626q5, 0);
            C0970a c0970a2 = new C0970a(5);
            Object P7 = c0626q5.P();
            if (P7 == c0602e2) {
                P7 = new D0(19);
                c0626q5.m0(P7);
            }
            c.l P8 = Y4.l.P(c0970a2, (l4.c) P7, c0626q5, 48);
            C.d a6 = C.e.a(26);
            long j6 = R1.r(c0626q5).f5384G;
            long j7 = R1.r(c0626q5).a;
            long c6 = o0.s.c(0.12f, j7);
            final long j8 = R1.r(c0626q5).f5429s;
            final String obj = AbstractC1776n.l0(str2).toString();
            boolean Q5 = AbstractC1776n.Q(obj);
            C1038o c1038o = C1038o.a;
            if (Q5 || z8) {
                c0626q5.b0(916086064);
                c0626q5.p(false);
                interfaceC1041r2 = c1038o;
            } else {
                c0626q5.b0(916027474);
                boolean z10 = (i9 & 3670016) == 1048576;
                Object P9 = c0626q5.P();
                if (z10 || P9 == c0602e2) {
                    P9 = new C0348d(18, interfaceC1193a2);
                    c0626q5.m0(P9);
                }
                interfaceC1041r2 = AbstractC1464z.k(c1038o, false, null, (InterfaceC1193a) P9, 15);
                c0626q5.p(false);
            }
            InterfaceC1797g interfaceC1797g = (z8 || (z5 && !AbstractC1776n.Q(obj))) ? AbstractC1799h.f15305c : AbstractC1799h.f15306d;
            C1818y c1818y = t0.a;
            InterfaceC1041r c7 = l0.h.c(interfaceC1041r.c(c1818y), a6);
            C1386H c1386h = o0.y.f13496b;
            InterfaceC1041r c8 = AbstractC1464z.f(c7, j6, c1386h).c(interfaceC1041r2);
            float f7 = 10;
            InterfaceC1041r A5 = AbstractC1787b.A(f7, S.l.f7374V, 2, c8);
            C1031h c1031h = C1026c.f11798p;
            C1813t a7 = AbstractC1812s.a(interfaceC1797g, c1031h, c0626q5, 0);
            int hashCode = Long.hashCode(c0626q5.f8164T);
            InterfaceC0617l0 l3 = c0626q5.l();
            InterfaceC1041r c9 = AbstractC1024a.c(c0626q5, A5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q5.f0();
            if (c0626q5.f8163S) {
                c0626q5.k(c0148f);
            } else {
                c0626q5.p0();
            }
            C0146e c0146e2 = C0150g.f1928f;
            T.r.G(c0626q5, a7, c0146e2);
            C0146e c0146e3 = C0150g.f1927e;
            T.r.G(c0626q5, l3, c0146e3);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e4 = C0150g.f1929g;
            T.r.x(c0626q5, valueOf, c0146e4);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q5, c0144d);
            C0146e c0146e5 = C0150g.f1926d;
            T.r.G(c0626q5, c9, c0146e5);
            p0 a8 = o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q5, 48);
            int hashCode2 = Long.hashCode(c0626q5.f8164T);
            InterfaceC0617l0 l5 = c0626q5.l();
            InterfaceC1041r c10 = AbstractC1024a.c(c0626q5, c1818y);
            c0626q5.f0();
            if (c0626q5.f8163S) {
                c0626q5.k(c0148f);
            } else {
                c0626q5.p0();
            }
            T.r.G(c0626q5, a8, c0146e2);
            T.r.G(c0626q5, l5, c0146e3);
            AbstractC1135a.n(hashCode2, c0626q5, c0146e4, c0626q5, c0144d);
            T.r.G(c0626q5, c10, c0146e5);
            InterfaceC1041r f8 = AbstractC1464z.f(l0.h.c(t0.j(c1038o, 28), C.e.a), c6, c1386h);
            V d6 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode3 = Long.hashCode(c0626q5.f8164T);
            InterfaceC0617l0 l6 = c0626q5.l();
            InterfaceC1041r c11 = AbstractC1024a.c(c0626q5, f8);
            c0626q5.f0();
            if (c0626q5.f8163S) {
                c0626q5.k(c0148f);
            } else {
                c0626q5.p0();
            }
            T.r.G(c0626q5, d6, c0146e2);
            T.r.G(c0626q5, l6, c0146e3);
            AbstractC1135a.n(hashCode3, c0626q5, c0146e4, c0626q5, c0144d);
            T.r.G(c0626q5, c11, c0146e5);
            A0.a(Y3.C.L(R.drawable.ic_arrow_upward, 0, c0626q5), null, t0.j(c1038o, 18), j7, c0626q5, 440, 0);
            c0626q5.p(true);
            AbstractC1787b.h(c0626q5, t0.n(c1038o, f7));
            if (AbstractC1776n.Q(str)) {
                j3 = B3.e.j(c0626q5, 821923354, R.string.update_banner_title, c0626q5, false);
            } else {
                c0626q5.b0(821807166);
                j3 = h5.e.k0(R.string.update_banner_title_with_version, new Object[]{str}, c0626q5);
                c0626q5.p(false);
            }
            P p5 = R1.t(c0626q5).f6127h;
            long j9 = R1.r(c0626q5).f5427q;
            if (1.0f <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            f3.b(j3, new Z(1.0f, true), j9, 0L, null, 0L, null, 0L, 2, false, 1, 0, p5, c0626q, 0, 24960, 110584);
            C0626q c0626q6 = c0626q;
            float f9 = 2;
            k0 k0Var = new k0(f7, f9, f7, f9);
            if (z8) {
                c0626q6.b0(822388292);
                Object P10 = c0626q6.P();
                if (P10 == c0602e2) {
                    P10 = new O.A(19);
                    c0626q6.m0(P10);
                }
                R1.o((InterfaceC1193a) P10, null, false, null, null, k0Var, f6950l, c0626q, 817889670, 378);
                C0626q c0626q7 = c0626q;
                c0626q7.p(false);
                c0602e = c0602e2;
                r02 = 0;
                c0146e = c0146e5;
                i8 = 4;
                c0626q3 = c0626q7;
            } else {
                c0626q6.b0(822610996);
                boolean h3 = (i10 == 131072) | c0626q6.h(context) | ((i9 & 57344) == 16384) | c0626q6.h(P6) | c0626q6.h(P8);
                Object P11 = c0626q6.P();
                if (h3 || P11 == c0602e2) {
                    z7 = false;
                    c0602e = c0602e2;
                    c0146e = c0146e5;
                    i7 = 4;
                    Y1 y12 = new Y1(z6, context, P6, P8, interfaceC1193a);
                    c0626q6.m0(y12);
                    P11 = y12;
                } else {
                    c0602e = c0602e2;
                    z7 = false;
                    c0146e = c0146e5;
                    i7 = 4;
                }
                boolean z11 = z7;
                i8 = i7;
                R1.o((InterfaceC1193a) P11, null, z6, null, null, k0Var, f6951m, c0626q6, ((i9 >> 6) & 896) | 817889280, 378);
                c0626q6.p(z11);
                r02 = z11;
                c0626q3 = c0626q6;
            }
            c0626q3.p(true);
            if (z8) {
                c0626q3.b0(-1938039938);
                final float e6 = AbstractC1117a.e(f6, S.l.f7374V, 1.0f);
                InterfaceC1041r C5 = AbstractC1787b.C(c1038o, S.l.f7374V, S.l.f7374V, S.l.f7374V, 8, 7);
                C1813t a9 = AbstractC1812s.a(AbstractC1799h.f15305c, c1031h, c0626q3, r02);
                int hashCode4 = Long.hashCode(c0626q3.f8164T);
                InterfaceC0617l0 l7 = c0626q3.l();
                InterfaceC1041r c12 = AbstractC1024a.c(c0626q3, C5);
                c0626q3.f0();
                if (c0626q3.f8163S) {
                    c0626q3.k(c0148f);
                } else {
                    c0626q3.p0();
                }
                T.r.G(c0626q3, a9, c0146e2);
                T.r.G(c0626q3, l7, c0146e3);
                AbstractC1135a.n(hashCode4, c0626q3, c0146e4, c0626q3, c0144d);
                T.r.G(c0626q3, c12, c0146e);
                boolean c13 = c0626q3.c(e6);
                Object P12 = c0626q3.P();
                if (c13 || P12 == c0602e) {
                    P12 = new InterfaceC1193a() { // from class: R2.E
                        @Override // l4.InterfaceC1193a
                        public final Object b() {
                            return Float.valueOf(e6);
                        }
                    };
                    c0626q3.m0(P12);
                }
                C0146e c0146e6 = c0146e;
                M1.b((InterfaceC1193a) P12, l0.h.c(t0.d(c1818y, i8), C.e.a(999)), j7, R1.r(c0626q3).f5428r, 0, S.l.f7374V, null, c0626q, 0);
                AbstractC1787b.h(c0626q, t0.d(c1038o, 6));
                p0 a10 = o0.a(AbstractC1799h.f15307e, C1026c.f11795m, c0626q, 6);
                int hashCode5 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l8 = c0626q.l();
                InterfaceC1041r c14 = AbstractC1024a.c(c0626q, c1818y);
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f);
                } else {
                    c0626q.p0();
                }
                T.r.G(c0626q, a10, c0146e2);
                T.r.G(c0626q, l8, c0146e3);
                AbstractC1135a.n(hashCode5, c0626q, c0146e4, c0626q, c0144d);
                T.r.G(c0626q, c14, c0146e6);
                f3.b(((int) (f6 * 100)) + "%", null, j8, 0L, null, 0L, null, 0L, 0, false, 0, 0, R1.t(c0626q).f6131l, c0626q, 0, 0, 131066);
                f3.b(j5 > 0 ? AbstractC1135a.g(Q2.a.g(j4), " / ", Q2.a.g(j5)) : Q2.a.g(j4), null, j8, 0L, null, 0L, null, 0L, 0, false, 0, 0, R1.t(c0626q).f6131l, c0626q, 0, 0, 131066);
                C0626q c0626q8 = c0626q;
                c0626q8.p(true);
                c0626q8.p(true);
                c0626q8.p(false);
                c0626q4 = c0626q8;
            } else {
                c0626q3.b0(-1936766954);
                AbstractC1244z.b(C1814u.a, z5 && !AbstractC1776n.Q(obj), null, AbstractC1205L.a(null, 15).a(AbstractC1205L.b(null, 3)), AbstractC1205L.d(null, 15).a(AbstractC1205L.c(null, 3)), null, AbstractC0874g.c(-1128215380, new l4.f() { // from class: R2.F
                    @Override // l4.f
                    public final Object d(Object obj2, Object obj3, Object obj4) {
                        C0626q c0626q9 = (C0626q) obj3;
                        ((Integer) obj4).getClass();
                        AbstractC1276k.f((InterfaceC1194A) obj2, "$this$AnimatedVisibility");
                        InterfaceC1041r C6 = AbstractC1787b.C(C1038o.a, S.l.f7374V, S.l.f7374V, S.l.f7374V, 8, 7);
                        C1813t a11 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q9, 0);
                        int hashCode6 = Long.hashCode(c0626q9.f8164T);
                        InterfaceC0617l0 l9 = c0626q9.l();
                        InterfaceC1041r c15 = AbstractC1024a.c(c0626q9, C6);
                        InterfaceC0152h.a.getClass();
                        C0148f c0148f2 = C0150g.f1924b;
                        c0626q9.f0();
                        if (c0626q9.f8163S) {
                            c0626q9.k(c0148f2);
                        } else {
                            c0626q9.p0();
                        }
                        T.r.G(c0626q9, a11, C0150g.f1928f);
                        T.r.G(c0626q9, l9, C0150g.f1927e);
                        T.r.x(c0626q9, Integer.valueOf(hashCode6), C0150g.f1929g);
                        T.r.C(c0626q9, C0150g.f1930h);
                        T.r.G(c0626q9, c15, C0150g.f1926d);
                        f3.b(obj, null, j8, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q9.j(u3.a)).f6131l, c0626q9, 0, 0, 131066);
                        c0626q9.p(true);
                        return X3.y.a;
                    }
                }, c0626q3), c0626q3, 1600518, 18);
                c0626q3.p(false);
                c0626q4 = c0626q3;
            }
            c0626q4.p(true);
            c0626q2 = c0626q4;
        } else {
            c0626q5.V();
            c0626q2 = c0626q5;
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(str, str2, u5, z5, z6, interfaceC1193a, interfaceC1193a2, interfaceC1041r, i6) { // from class: R2.G

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f6888c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f6889e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ U f6890f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f6891g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f6892h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f6893i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f6894j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f6895k;

                @Override // l4.e
                public final Object m(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int J4 = T.r.J(12582913);
                    AbstractC0530j.l(this.f6888c, this.f6889e, this.f6890f, this.f6891g, this.f6892h, this.f6893i, this.f6894j, this.f6895k, (C0626q) obj2, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void m(final boolean z5, final boolean z6, C0626q c0626q, final int i6) {
        boolean z7;
        C0626q c0626q2 = c0626q;
        c0626q2.d0(-1291355667);
        int i7 = i6 | (c0626q2.g(z5) ? 4 : 2) | (c0626q2.g(z6) ? 32 : 16);
        if (c0626q2.S(i7 & 1, (i7 & 19) != 18)) {
            InterfaceC1041r A5 = AbstractC1787b.A(S.l.f7374V, 16, 1, t0.a);
            V d6 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, A5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, d6, C0150g.f1928f);
            T.r.G(c0626q2, l3, C0150g.f1927e);
            T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q2, C0150g.f1930h);
            T.r.G(c0626q2, c6, C0150g.f1926d);
            if (z5) {
                c0626q2.b0(1927691093);
                M1.a(t0.j(C1038o.a, 24), ((N) c0626q2.j(O.a)).a, S.l.f7374V, 0L, 0, S.l.f7374V, c0626q2, 6, 60);
                c0626q2.p(false);
                z7 = true;
            } else {
                if (z6) {
                    c0626q2.b0(1927937109);
                    f3.b(h5.e.j0(R.string.chat_load_more_hint, c0626q2), null, o0.s.c(0.6f, ((N) c0626q2.j(O.a)).f5429s), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6131l, c0626q, 0, 0, 131066);
                    c0626q2 = c0626q;
                    c0626q2.p(false);
                } else {
                    c0626q2.b0(1928237902);
                    f3.b(h5.e.j0(R.string.chat_no_more_conversations, c0626q2), null, o0.s.c(0.6f, ((N) c0626q2.j(O.a)).f5429s), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6131l, c0626q, 0, 0, 131066);
                    c0626q2 = c0626q;
                    c0626q2.p(false);
                }
                z7 = true;
            }
            c0626q2.p(z7);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(i6, z5, z6) { // from class: R2.f

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f6933c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f6934e;

                {
                    this.f6933c = z5;
                    this.f6934e = z6;
                }

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(1);
                    AbstractC0530j.m(this.f6933c, this.f6934e, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void n(String str, l4.c cVar, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, C0626q c0626q, int i6) {
        AbstractC1276k.f(str, "currentName");
        AbstractC1276k.f(cVar, "onNameChange");
        AbstractC1276k.f(interfaceC1193a, "onConfirm");
        AbstractC1276k.f(interfaceC1193a2, "onDismiss");
        c0626q.d0(229185949);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.h(interfaceC1193a) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            R1.a(interfaceC1193a2, AbstractC0874g.c(-722703787, new C0522b(0, interfaceC1193a), c0626q), null, AbstractC0874g.c(-1412535277, new C0522b(1, interfaceC1193a2), c0626q), f6941c, AbstractC0874g.c(1847684784, new I.m(9, str, cVar), c0626q), null, 0L, 0L, 0L, 0L, S.l.f7374V, null, c0626q, 1772598);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new K.d(str, cVar, interfaceC1193a, interfaceC1193a2, i6, 2);
        }
    }

    public static final void o(final float f6, final float f7, final boolean z5, l4.c cVar, C0873f c0873f, C0873f c0873f2, C0626q c0626q, final int i6) {
        C0873f c0873f3;
        final C0873f c0873f4;
        int i7;
        boolean z6;
        final l4.c cVar2 = cVar;
        c0626q.d0(-1288012903);
        int i8 = i6 | (c0626q.c(f6) ? 4 : 2) | (c0626q.c(f7) ? 32 : 16) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(cVar2) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i8 & 1, (74899 & i8) != 74898)) {
            AbstractC0623o0 abstractC0623o0 = AbstractC0204q0.f2358h;
            InterfaceC0961c interfaceC0961c = (InterfaceC0961c) c0626q.j(abstractC0623o0);
            final float e02 = interfaceC0961c.e0(f6);
            float e03 = interfaceC0961c.e0(f7);
            Object P5 = c0626q.P();
            H h3 = H.f6896c;
            H h6 = H.f6897e;
            Object obj = C0616l.a;
            if (P5 == obj) {
                P5 = new C1606t(z5 ? h6 : h3);
                c0626q.m0(P5);
            }
            C1606t c1606t = (C1606t) P5;
            n.D0 d02 = AbstractC1552b.a;
            Object P6 = c0626q.P();
            if (P6 == obj) {
                P6 = new D0(20);
                c0626q.m0(P6);
            }
            l4.c cVar3 = (l4.c) P6;
            n.D0 d03 = AbstractC1552b.a;
            n.D0 d04 = AbstractC1552b.a;
            Object obj2 = (InterfaceC0961c) c0626q.j(abstractC0623o0);
            boolean f8 = c0626q.f(obj2) | c0626q.f(d04);
            Object P7 = c0626q.P();
            if (f8 || P7 == obj) {
                C1347v c1347v = AbstractC1573i.f14347b;
                C0158m c0158m = new C0158m(c1606t, cVar3, new Y3.l(obj2, 17), 11);
                float f9 = AbstractC1647k.a;
                Object c1643g = new C1643g(c0158m, c1347v, d04);
                c0626q.m0(c1643g);
                P7 = c1643g;
            }
            C1643g c1643g2 = (C1643g) P7;
            Boolean valueOf = Boolean.valueOf(z5);
            Float valueOf2 = Float.valueOf(e02);
            int i9 = i8 & 896;
            boolean z7 = i9 == 256;
            Object P8 = c0626q.P();
            if (z7 || P8 == obj) {
                P8 = new K(z5, c1606t, null);
                c0626q.m0(P8);
            }
            T.r.h(valueOf, valueOf2, (l4.e) P8, c0626q);
            Object value = c1606t.f14471e.getValue();
            int i10 = i8 & 7168;
            boolean z8 = (i9 == 256) | (i10 == 2048);
            Object P9 = c0626q.P();
            if (z8 || P9 == obj) {
                P9 = new L(c1606t, z5, cVar2, null);
                c0626q.m0(P9);
            }
            T.r.f(c0626q, value, (l4.e) P9);
            boolean c6 = c0626q.c(e02);
            Object P10 = c0626q.P();
            if (c6 || P10 == obj) {
                e0.k kVar = new e0.k(4);
                kVar.m(h3, S.l.f7374V);
                kVar.m(h6, e02);
                ArrayList arrayList = (ArrayList) kVar.f11564e;
                float[] fArr = (float[]) kVar.f11565f;
                int size = arrayList.size();
                AbstractC1276k.f(fArr, "<this>");
                Y4.d.w(size, fArr.length);
                float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
                AbstractC1276k.e(copyOfRange, "copyOfRange(...)");
                P10 = new C1517E(arrayList, copyOfRange);
                c0626q.m0(P10);
            }
            C1517E c1517e = (C1517E) P10;
            Float valueOf3 = Float.valueOf(e02);
            boolean h7 = c0626q.h(c1517e);
            Object P11 = c0626q.P();
            if (h7 || P11 == obj) {
                P11 = new M(c1606t, c1517e, null);
                c0626q.m0(P11);
            }
            T.r.f(c0626q, valueOf3, (l4.e) P11);
            float g3 = c1606t.f14472f.g();
            final float e6 = Float.isNaN(g3) ? 0.0f : AbstractC1117a.e(g3, S.l.f7374V, e02);
            float e7 = e02 > S.l.f7374V ? AbstractC1117a.e(e6 / e02, S.l.f7374V, 1.0f) : 0.0f;
            boolean z9 = e7 > 0.01f;
            final float f10 = e03 * e7;
            float f11 = (f7 * e7) + f6;
            C1818y c1818y = t0.f15349c;
            InterfaceC1041r f12 = AbstractC1573i.f(c1818y, c1606t, c1643g2);
            C1033j c1033j = C1026c.f11786c;
            V d6 = AbstractC1806l.d(c1033j, false);
            float f13 = e7;
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, f12);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a = C0150g.f1924b;
            c0626q.f0();
            boolean z10 = z9;
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q, d6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e2);
            Integer valueOf4 = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q, valueOf4, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q, c7, c0146e4);
            InterfaceC1041r c8 = t0.n(C1038o.a, f11).c(t0.f15348b);
            boolean c9 = c0626q.c(e6) | c0626q.c(e02);
            Object P12 = c0626q.P();
            if (c9 || P12 == obj) {
                i7 = i10;
                final int i11 = 0;
                P12 = new l4.c() { // from class: R2.I
                    @Override // l4.c
                    public final Object f(Object obj3) {
                        InterfaceC0961c interfaceC0961c2 = (InterfaceC0961c) obj3;
                        switch (i11) {
                            case 0:
                                AbstractC1276k.f(interfaceC0961c2, "$this$offset");
                                return new e1.j((AbstractC1410a.K(e6 - e02) << 32) | (0 & 4294967295L));
                            default:
                                AbstractC1276k.f(interfaceC0961c2, "$this$offset");
                                return new e1.j((AbstractC1410a.K(e6 + e02) << 32) | (0 & 4294967295L));
                        }
                    }
                };
                c0626q.m0(P12);
            } else {
                i7 = i10;
            }
            InterfaceC1041r v5 = AbstractC1787b.v(c8, (l4.c) P12);
            long j3 = ((N) c0626q.j(O.a)).f5426p;
            C1386H c1386h = o0.y.f13496b;
            InterfaceC1041r f14 = AbstractC1464z.f(v5, j3, c1386h);
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c10 = AbstractC1024a.c(c0626q, f14);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a6, c0146e);
            T.r.G(c0626q, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c10, c0146e4);
            c0873f3 = c0873f;
            c0873f3.d(C1814u.a, c0626q, 54);
            final int i12 = 1;
            c0626q.p(true);
            boolean c11 = c0626q.c(e6) | c0626q.c(f10);
            Object P13 = c0626q.P();
            if (c11 || P13 == obj) {
                P13 = new l4.c() { // from class: R2.I
                    @Override // l4.c
                    public final Object f(Object obj3) {
                        InterfaceC0961c interfaceC0961c2 = (InterfaceC0961c) obj3;
                        switch (i12) {
                            case 0:
                                AbstractC1276k.f(interfaceC0961c2, "$this$offset");
                                return new e1.j((AbstractC1410a.K(e6 - f10) << 32) | (0 & 4294967295L));
                            default:
                                AbstractC1276k.f(interfaceC0961c2, "$this$offset");
                                return new e1.j((AbstractC1410a.K(e6 + f10) << 32) | (0 & 4294967295L));
                        }
                    }
                };
                c0626q.m0(P13);
            }
            InterfaceC1041r v6 = AbstractC1787b.v(c1818y, (l4.c) P13);
            V d7 = AbstractC1806l.d(c1033j, false);
            int hashCode3 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l6 = c0626q.l();
            InterfaceC1041r c12 = AbstractC1024a.c(c0626q, v6);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d7, c0146e);
            T.r.G(c0626q, l6, c0146e2);
            AbstractC1135a.n(hashCode3, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c12, c0146e4);
            c0873f4 = c0873f2;
            c0873f4.m(c0626q, 6);
            if (z10) {
                c0626q.b0(730862396);
                InterfaceC1041r f15 = AbstractC1464z.f(c1818y, o0.s.c(AbstractC1117a.e(f13 * 0.6f, S.l.f7374V, 0.6f), o0.s.f13475b), c1386h);
                boolean z11 = i7 == 2048;
                Object P14 = c0626q.P();
                if (z11 || P14 == obj) {
                    cVar2 = cVar;
                    P14 = new C0299b0(cVar2, 1);
                    c0626q.m0(P14);
                } else {
                    cVar2 = cVar;
                }
                z6 = false;
                AbstractC1806l.a(Q.a(f15, X3.y.a, (PointerInputEventHandler) P14), c0626q, 0);
            } else {
                cVar2 = cVar;
                z6 = false;
                c0626q.b0(726572213);
            }
            c0626q.p(z6);
            c0626q.p(true);
            c0626q.p(true);
        } else {
            c0873f3 = c0873f;
            c0873f4 = c0873f2;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            final C0873f c0873f5 = c0873f3;
            t5.f8193d = new l4.e(f6, f7, z5, cVar2, c0873f5, c0873f4, i6) { // from class: R2.J

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f6902c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f6903e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f6904f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ l4.c f6905g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ C0873f f6906h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ C0873f f6907i;

                @Override // l4.e
                public final Object m(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int J4 = T.r.J(221185);
                    AbstractC0530j.o(this.f6902c, this.f6903e, this.f6904f, this.f6905g, this.f6906h, this.f6907i, (C0626q) obj3, J4);
                    return X3.y.a;
                }
            };
        }
    }
}
