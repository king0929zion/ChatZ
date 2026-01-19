package P2;

import D.AbstractC0095u;
import D.C0064e;
import D.C0072i;
import D.C0091s;
import D.C0103y;
import D.b1;
import F0.AbstractC0137z;
import F0.C0120h;
import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import M2.C0250a;
import O.AbstractC0336u0;
import Q.AbstractC0452p1;
import Q.C0474v0;
import Q.C0478w0;
import Q.L2;
import Q.M1;
import Q.R1;
import Q.f3;
import Q.t3;
import Q.u3;
import T.AbstractC0623o0;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import T.d1;
import T.e1;
import X2.C0694i;
import Z2.C0789z;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import b0.C0873f;
import b3.AbstractC0888d;
import b3.AbstractC0897m;
import b3.C0889e;
import com.bot.core.model.MessageAttachment;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.C0959a;
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
import i4.AbstractC1118b;
import j1.AbstractC1135a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import l4.InterfaceC1193a;
import m.AbstractC1205L;
import m.AbstractC1218Z;
import m.AbstractC1227i;
import m.AbstractC1244z;
import m.C1197D;
import m.C1204K;
import m.C1210Q;
import m.C1211S;
import m.C1212T;
import m.C1217Y;
import m.C1230l;
import m.InterfaceC1194A;
import m0.AbstractC1249d;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.AbstractC1324g;
import n.AbstractC1350y;
import n.C1316c;
import n.C1327h0;
import n.C1345t;
import n.InterfaceC1349x;
import p.AbstractC1464z;
import t0.AbstractC1688b;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1795f;
import v.C1810p;
import v.C1813t;
import v.C1814u;
import v.C1818y;
import w.AbstractC1829a;
import w0.InterfaceC1830a;
import x.C1856g;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;
import y2.AbstractC1992b;

/* loaded from: classes.dex */
public abstract class V {
    public static final C0873f a = new C0873f(new O.B(1), false, -1338993274);

    /* renamed from: b, reason: collision with root package name */
    public static final C0873f f4799b = new C0873f(new C0064e(1), false, -301703520);

    /* renamed from: c, reason: collision with root package name */
    public static final C0873f f4800c = new C0873f(new C0064e(2), false, 1537563254);

    public static final void a(L2.c cVar, C0626q c0626q, int i6) {
        C1038o c1038o;
        boolean z5;
        C0144d c0144d;
        C0146e c0146e;
        C0146e c0146e2;
        int i7;
        C1038o c1038o2;
        boolean z6;
        C0146e c0146e3;
        boolean z7;
        AbstractC1276k.f(cVar, "message");
        List list = cVar.f3063g;
        c0626q.d0(103793771);
        int i8 = i6 | (c0626q.f(cVar) ? 4 : 2);
        if (c0626q.S(i8 & 1, (i8 & 3) != 2)) {
            C1818y c1818y = v.t0.a;
            F0.V d6 = AbstractC1806l.d(C1026c.f11789g, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, c1818y);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            C0146e c0146e4 = C0150g.f1928f;
            T.r.G(c0626q, d6, c0146e4);
            C0146e c0146e5 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e5);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e6 = C0150g.f1929g;
            T.r.x(c0626q, valueOf, c0146e6);
            C0144d c0144d2 = C0150g.f1930h;
            T.r.C(c0626q, c0144d2);
            C0146e c0146e7 = C0150g.f1926d;
            T.r.G(c0626q, c6, c0146e7);
            C1038o c1038o3 = C1038o.a;
            InterfaceC1041r z8 = AbstractC1787b.z(c1038o3, 12, 6);
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.g(4), C1026c.f11798p, c0626q, 6);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, z8);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a6, c0146e4);
            T.r.G(c0626q, l5, c0146e5);
            AbstractC1135a.n(hashCode2, c0626q, c0146e6, c0626q, c0144d2);
            T.r.G(c0626q, c7, c0146e7);
            if (list.isEmpty()) {
                c1038o = c1038o3;
                z5 = false;
                c0626q.b0(124822611);
            } else {
                c0626q.b0(126134066);
                c1038o = c1038o3;
                U2.a.j(cVar.a, list, AbstractC1787b.C(c1038o, S.l.f7374V, S.l.f7374V, S.l.f7374V, 8, 7), c0626q, 384);
                z5 = false;
            }
            c0626q.p(z5);
            if (cVar.f3062f.isEmpty()) {
                c0144d = c0144d2;
                c0146e = c0146e6;
                c0146e2 = c0146e7;
                i7 = 8;
                c1038o2 = c1038o;
                z6 = false;
                c0146e3 = c0146e5;
                c0626q.b0(124822611);
            } else {
                c0626q.b0(126427078);
                c0146e = c0146e6;
                i7 = 8;
                c1038o2 = c1038o;
                c0146e3 = c0146e5;
                c0144d = c0144d2;
                c0146e2 = c0146e7;
                U2.a.b(cVar.a, cVar.f3062f, AbstractC1787b.C(c1038o, S.l.f7374V, S.l.f7374V, S.l.f7374V, 8, 7), cVar.f3065i == L2.f.f3082e, cVar.f3064h, cVar.f3066j, cVar.f3067k, c0626q, 384);
                z6 = false;
            }
            c0626q.p(z6);
            if (cVar.f3064h == L2.e.f3074e) {
                c0626q.b0(126966292);
                InterfaceC1041r d7 = v.t0.d(c1038o2, 16);
                F0.V d8 = AbstractC1806l.d(C1026c.f11790h, z6);
                int hashCode3 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l6 = c0626q.l();
                InterfaceC1041r c8 = AbstractC1024a.c(c0626q, d7);
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f);
                } else {
                    c0626q.p0();
                }
                T.r.G(c0626q, d8, c0146e4);
                T.r.G(c0626q, l6, c0146e3);
                AbstractC1135a.n(hashCode3, c0626q, c0146e, c0626q, c0144d);
                T.r.G(c0626q, c8, c0146e2);
                z6 = false;
                L0.e(0, c0626q);
                c0626q.p(true);
            } else {
                c0626q.b0(124822611);
            }
            c0626q.p(z6);
            if (cVar.f3059c.length() > 0) {
                c0626q.b0(127239309);
                L0.d(cVar, new S0.P(((Q.N) c0626q.j(Q.O.a)).f5427q, s4.j.z(16), null, null, 0L, 0, s4.j.z(24), 16646140), c0626q, i7 | (i8 & 14));
                z7 = false;
            } else {
                z7 = false;
                c0626q.b0(124822611);
            }
            c0626q.p(z7);
            c0626q.p(true);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0342a(cVar, i6, 0);
        }
    }

    public static final void b(int i6, String str, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i7) {
        String str2 = str;
        C0626q c0626q2 = c0626q;
        c0626q2.d0(776067961);
        int i8 = i7 | (c0626q2.d(i6) ? 32 : 16) | (c0626q2.f(str2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q2.h(interfaceC1193a) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q2.S(i8 & 1, (i8 & 1171) != 1170)) {
            C.d a6 = C.e.a(22);
            InterfaceC1041r c6 = l0.h.c(v.t0.d(v.q0.a(), 86), a6);
            e1 e1Var = Q.O.a;
            InterfaceC1041r f6 = AbstractC1464z.f(c6, ((Q.N) c0626q2.j(e1Var)).f5384G, a6);
            boolean z5 = (i8 & 7168) == 2048;
            Object P5 = c0626q2.P();
            if (z5 || P5 == C0616l.a) {
                P5 = new C0348d(1, interfaceC1193a);
                c0626q2.m0(P5);
            }
            InterfaceC1041r z6 = AbstractC1787b.z(AbstractC1992b.a(31, f6, (InterfaceC1193a) P5, false), 8, 12);
            C1813t a7 = AbstractC1812s.a(AbstractC1799h.f15306d, C1026c.f11799q, c0626q2, 54);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, z6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, a7, C0150g.f1928f);
            T.r.G(c0626q2, l3, C0150g.f1927e);
            T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q2, C0150g.f1930h);
            T.r.G(c0626q2, c7, C0150g.f1926d);
            int i9 = i8 >> 3;
            AbstractC1688b L5 = Y3.C.L(i6, i9 & 14, c0626q2);
            long j3 = ((Q.N) c0626q2.j(e1Var)).f5427q;
            C1038o c1038o = C1038o.a;
            Q.A0.a(L5, str2, v.t0.j(c1038o, 24), j3, c0626q2, (i9 & 112) | 392, 0);
            AbstractC1787b.h(c0626q2, v.t0.d(c1038o, 6));
            str2 = str;
            f3.b(str2, null, ((Q.N) c0626q2.j(e1Var)).f5427q, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6130k, c0626q, (i8 >> 6) & 14, 0, 131066);
            c0626q2 = c0626q;
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(i6, str2, interfaceC1193a, i7);
        }
    }

    public static final void c(final boolean z5, final InterfaceC1193a interfaceC1193a, final InterfaceC1193a interfaceC1193a2, final InterfaceC1193a interfaceC1193a3, final InterfaceC1193a interfaceC1193a4, final boolean z6, final l4.c cVar, final D2.c cVar2, final boolean z7, final l4.c cVar3, C0626q c0626q, final int i6) {
        int i7;
        boolean z8;
        C0627q0 t5;
        l4.e eVar;
        AbstractC1276k.f(interfaceC1193a, "onDismiss");
        AbstractC1276k.f(interfaceC1193a2, "onCameraClick");
        AbstractC1276k.f(interfaceC1193a3, "onGalleryClick");
        AbstractC1276k.f(interfaceC1193a4, "onFileClick");
        AbstractC1276k.f(cVar, "onReasoningToggle");
        AbstractC1276k.f(cVar2, "reasoningSupport");
        AbstractC1276k.f(cVar3, "onWebSearchToggle");
        c0626q.d0(1978803361);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.g(z5) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(interfaceC1193a2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.h(interfaceC1193a3) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.h(interfaceC1193a4) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            z8 = z6;
            i7 |= c0626q.g(z8) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        } else {
            z8 = z6;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.h(cVar) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if ((12582912 & i6) == 0) {
            i7 |= c0626q.f(cVar2) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if ((100663296 & i6) == 0) {
            i7 |= c0626q.g(z7) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        if ((805306368 & i6) == 0) {
            i7 |= c0626q.h(cVar3) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        int i8 = i7;
        if (!c0626q.S(i8 & 1, (306783379 & i8) != 306783378)) {
            c0626q.V();
        } else {
            if (!z5) {
                t5 = c0626q.t();
                if (t5 != null) {
                    final int i9 = 0;
                    final boolean z9 = z8;
                    eVar = new l4.e() { // from class: P2.i
                        @Override // l4.e
                        public final Object m(Object obj, Object obj2) {
                            switch (i9) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    V.c(z5, interfaceC1193a, interfaceC1193a2, interfaceC1193a3, interfaceC1193a4, z9, cVar, cVar2, z7, cVar3, (C0626q) obj, T.r.J(i6 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    V.c(z5, interfaceC1193a, interfaceC1193a2, interfaceC1193a3, interfaceC1193a4, z9, cVar, cVar2, z7, cVar3, (C0626q) obj, T.r.J(i6 | 1));
                                    break;
                            }
                            return X3.y.a;
                        }
                    };
                    t5.f8193d = eVar;
                }
                return;
            }
            AbstractC0452p1.a(interfaceC1193a, null, AbstractC0452p1.f(0, 3, c0626q), S.l.f7374V, false, null, 0L, 0L, S.l.f7374V, 0L, null, null, null, AbstractC0874g.c(-906256257, new l4.f() { // from class: P2.j
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0391, code lost:
                
                    if (r5 == r0) goto L74;
                 */
                @Override // l4.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object d(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) {
                    /*
                        Method dump skipped, instructions count: 1360
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: P2.C0360j.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, c0626q), c0626q, (i8 >> 3) & 14);
        }
        t5 = c0626q.t();
        if (t5 != null) {
            final int i10 = 1;
            eVar = new l4.e() { // from class: P2.i
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    switch (i10) {
                        case 0:
                            ((Integer) obj2).intValue();
                            V.c(z5, interfaceC1193a, interfaceC1193a2, interfaceC1193a3, interfaceC1193a4, z6, cVar, cVar2, z7, cVar3, (C0626q) obj, T.r.J(i6 | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            V.c(z5, interfaceC1193a, interfaceC1193a2, interfaceC1193a3, interfaceC1193a4, z6, cVar, cVar2, z7, cVar3, (C0626q) obj, T.r.J(i6 | 1));
                            break;
                    }
                    return X3.y.a;
                }
            };
            t5.f8193d = eVar;
        }
    }

    public static final void d(final String str, final boolean z5, final l4.c cVar, final InterfaceC1193a interfaceC1193a, final InterfaceC1193a interfaceC1193a2, final X2.L l3, final List list, final List list2, final boolean z6, final l4.c cVar2, final D2.c cVar3, final boolean z7, final l4.c cVar4, final l4.c cVar5, final l4.c cVar6, final l4.c cVar7, final L2 l22, final InterfaceC1041r interfaceC1041r, C0626q c0626q, final int i6) {
        int i7;
        T.X x5;
        final int i8;
        int i9;
        c.l lVar;
        InterfaceC0961c interfaceC0961c;
        int i10;
        int i11;
        final int i12;
        c.l lVar2;
        C0970a c0970a;
        C0626q c0626q2;
        final int i13;
        AbstractC1276k.f(cVar, "onMessageChange");
        AbstractC1276k.f(interfaceC1193a, "onSend");
        AbstractC1276k.f(l3, "chatViewModel");
        AbstractC1276k.f(list, "imageStates");
        AbstractC1276k.f(list2, "fileStates");
        AbstractC1276k.f(cVar2, "onReasoningEnabledChange");
        AbstractC1276k.f(cVar3, "reasoningSupport");
        AbstractC1276k.f(cVar4, "onWebSearchEnabledChange");
        AbstractC1276k.f(cVar5, "onImageStatesChange");
        AbstractC1276k.f(cVar6, "onFileStatesChange");
        c0626q.d0(390511349);
        int i14 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.g(z5) ? 32 : 16);
        boolean h3 = c0626q.h(cVar);
        int i15 = PegdownExtensions.FENCED_CODE_BLOCKS;
        int i16 = i14 | (h3 ? PegdownExtensions.WIKILINKS : 128);
        boolean h6 = c0626q.h(interfaceC1193a);
        int i17 = PegdownExtensions.ANCHORLINKS;
        int i18 = i16 | (h6 ? 2048 : 1024) | (c0626q.h(interfaceC1193a2) ? 16384 : 8192) | (c0626q.h(l3) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS) | (c0626q.h(list) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT);
        boolean h7 = c0626q.h(list2);
        int i19 = PegdownExtensions.EXTANCHORLINKS;
        int i20 = i18 | (h7 ? 8388608 : 4194304) | (c0626q.g(z6) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC) | (c0626q.h(cVar2) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA);
        int i21 = 1769472 | (c0626q.f(cVar3) ? 4 : 2) | (c0626q.g(z7) ? 32 : 16);
        if (c0626q.h(cVar4)) {
            i15 = PegdownExtensions.WIKILINKS;
        }
        int i22 = i21 | i15;
        if (c0626q.h(cVar5)) {
            i17 = 2048;
        }
        int i23 = i22 | i17 | (c0626q.h(cVar6) ? 16384 : 8192);
        if (c0626q.f(interfaceC1041r)) {
            i19 = 8388608;
        }
        int i24 = i23 | i19;
        if (c0626q.S(i20 & 1, ((i20 & 306783379) == 306783378 && (i24 & 4793491) == 4793490) ? false : true)) {
            InterfaceC1830a interfaceC1830a = (InterfaceC1830a) c0626q.j(AbstractC0204q0.f2362l);
            final Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
            I0.S0 s02 = (I0.S0) c0626q.j(AbstractC0204q0.f2366p);
            InterfaceC0961c interfaceC0961c2 = (InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h);
            WeakHashMap weakHashMap = v.G0.f15220w;
            int max = Math.max(interfaceC0961c2.l0(U.a), Math.max(C1810p.f(c0626q).f15233n.e().f15269d, C1810p.f(c0626q).f15227h.e().f13503d) - C1810p.f(c0626q).f15222c.e().f13503d);
            float a6 = AbstractC1787b.j(C1810p.f(c0626q).f15224e, c0626q).a();
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (P5 == obj) {
                P5 = T.r.p(c0626q);
                c0626q.m0(P5);
            }
            final InterfaceC1942y interfaceC1942y = (InterfaceC1942y) P5;
            Object P6 = c0626q.P();
            if (P6 == obj) {
                P6 = new C0383v(l22, null);
                c0626q.m0(P6);
            }
            l4.e eVar = (l4.e) P6;
            AbstractC1276k.f(interfaceC1942y, "coroutineScope");
            AbstractC1276k.f(eVar, "showSnackbar");
            boolean f6 = c0626q.f(interfaceC1942y) | c0626q.f(eVar);
            Object P7 = c0626q.P();
            if (f6 || P7 == obj) {
                P7 = new C0364l(interfaceC1942y, eVar);
                c0626q.m0(P7);
            }
            final C0364l c0364l = (C0364l) P7;
            boolean z8 = (i20 & 896) == 256;
            Object P8 = c0626q.P();
            if (z8 || P8 == obj) {
                i7 = 0;
                P8 = new r(cVar, i7);
                c0626q.m0(P8);
            } else {
                i7 = 0;
            }
            l4.c cVar8 = (l4.c) P8;
            Object P9 = c0626q.P();
            if (P9 == obj) {
                P9 = T.r.A(Integer.valueOf(i7));
                c0626q.m0(P9);
            }
            T.X x6 = (T.X) P9;
            Object P10 = c0626q.P();
            if (P10 == obj) {
                P10 = new D.C(x6, 5);
                c0626q.m0(P10);
            }
            Object E5 = T.r.E(list2, c0626q);
            C0970a c0970a2 = new C0970a(0);
            boolean h8 = c0626q.h(context) | c0626q.h(l3) | c0626q.h(interfaceC1942y);
            Object P11 = c0626q.P();
            if (h8 || P11 == obj) {
                x5 = x6;
                i8 = 0;
                P11 = new l4.c() { // from class: P2.s
                    @Override // l4.c
                    public final Object f(Object obj2) {
                        switch (i8) {
                            case 0:
                                List list3 = (List) obj2;
                                AbstractC1276k.f(list3, "uris");
                                V.q(context, l3, interfaceC1942y, list3);
                                return X3.y.a;
                            default:
                                Bitmap bitmap = (Bitmap) obj2;
                                if (bitmap != null) {
                                    Context context2 = context;
                                    AbstractC1276k.f(context2, "context");
                                    File file = new File(context2.getCacheDir(), "temp_photo_" + System.currentTimeMillis() + ".jpg");
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    try {
                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        Uri fromFile = Uri.fromFile(file);
                                        AbstractC1276k.e(fromFile, "fromFile(...)");
                                        V.q(context2, l3, interfaceC1942y, Y4.l.H(fromFile));
                                    } finally {
                                    }
                                }
                                return X3.y.a;
                        }
                    }
                };
                c0626q.m0(P11);
            } else {
                x5 = x6;
                i8 = 0;
            }
            c.l P12 = Y4.l.P(c0970a2, (l4.c) P11, c0626q, i8);
            C0970a c0970a3 = new C0970a(6);
            boolean h9 = c0626q.h(context) | c0626q.h(l3) | c0626q.h(interfaceC1942y);
            Object P13 = c0626q.P();
            if (h9 || P13 == obj) {
                i9 = i20;
                final int i25 = 1;
                P13 = new l4.c() { // from class: P2.s
                    @Override // l4.c
                    public final Object f(Object obj2) {
                        switch (i25) {
                            case 0:
                                List list3 = (List) obj2;
                                AbstractC1276k.f(list3, "uris");
                                V.q(context, l3, interfaceC1942y, list3);
                                return X3.y.a;
                            default:
                                Bitmap bitmap = (Bitmap) obj2;
                                if (bitmap != null) {
                                    Context context2 = context;
                                    AbstractC1276k.f(context2, "context");
                                    File file = new File(context2.getCacheDir(), "temp_photo_" + System.currentTimeMillis() + ".jpg");
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    try {
                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        Uri fromFile = Uri.fromFile(file);
                                        AbstractC1276k.e(fromFile, "fromFile(...)");
                                        V.q(context2, l3, interfaceC1942y, Y4.l.H(fromFile));
                                    } finally {
                                    }
                                }
                                return X3.y.a;
                        }
                    }
                };
                c0626q.m0(P13);
            } else {
                i9 = i20;
            }
            c.l P14 = Y4.l.P(c0970a3, (l4.c) P13, c0626q, 0);
            C0970a c0970a4 = new C0970a(1);
            boolean f7 = c0626q.f(E5) | c0626q.h(list) | c0626q.h(context) | c0626q.h(l3) | c0626q.h(interfaceC1942y);
            Object P15 = c0626q.P();
            if (f7 || P15 == obj) {
                lVar = P12;
                interfaceC0961c = interfaceC0961c2;
                i10 = i24;
                i11 = i9;
                i12 = 0;
                lVar2 = P14;
                c0970a = c0970a4;
                c0626q2 = c0626q;
                Object c0379t = new C0379t(E5, list, context, l3, interfaceC1942y, l22, 0);
                c0626q2.m0(c0379t);
                P15 = c0379t;
            } else {
                lVar = P12;
                c0626q2 = c0626q;
                interfaceC0961c = interfaceC0961c2;
                i10 = i24;
                i11 = i9;
                i12 = 0;
                lVar2 = P14;
                c0970a = c0970a4;
            }
            final c.l P16 = Y4.l.P(c0970a, (l4.c) P15, c0626q2, i12);
            int intValue = ((Number) x5.getValue()).intValue();
            boolean f8 = c0626q2.f(c0364l);
            Object P17 = c0626q2.P();
            if (f8 || P17 == obj) {
                P17 = new InterfaceC1193a() { // from class: P2.u
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        switch (i12) {
                            case 0:
                                c0364l.a.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                break;
                            default:
                                c0364l.a.setValue(Boolean.FALSE);
                                break;
                        }
                        return X3.y.a;
                    }
                };
                c0626q2.m0(P17);
            }
            int i26 = i11 << 21;
            int i27 = ((i10 >> 21) & 14) | PegdownExtensions.SUPPRESS_ALL_HTML | (i26 & 29360128) | (i26 & 234881024) | ((i11 << 3) & 1879048192);
            int i28 = i11 >> 15;
            int i29 = ((i10 >> 3) & 14) | (i28 & 112) | (i28 & 896) | (i10 & 7168) | (57344 & i10);
            int i30 = i11 << 15;
            int i31 = ((i11 >> 27) & 14) | ((i10 << 3) & 112) | (i10 & 896);
            int i32 = i10;
            C0626q c0626q3 = c0626q2;
            final int i33 = i12;
            final c.l lVar3 = lVar2;
            e(interfaceC1041r, s02, interfaceC0961c, max, a6, cVar7, intValue, str, z5, z6, z7, list, list2, cVar5, cVar6, interfaceC1830a, (InterfaceC1193a) P17, cVar8, interfaceC1193a, interfaceC1193a2, cVar2, cVar3, cVar4, c0626q3, i27, i29 | (i30 & 234881024) | (i30 & 1879048192), i31);
            boolean booleanValue = ((Boolean) c0364l.a.getValue()).booleanValue();
            boolean f9 = c0626q3.f(c0364l);
            Object P18 = c0626q3.P();
            if (f9 || P18 == obj) {
                i13 = 1;
                P18 = new InterfaceC1193a() { // from class: P2.u
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        switch (i13) {
                            case 0:
                                c0364l.a.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                break;
                            default:
                                c0364l.a.setValue(Boolean.FALSE);
                                break;
                        }
                        return X3.y.a;
                    }
                };
                c0626q3.m0(P18);
            } else {
                i13 = 1;
            }
            InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) P18;
            boolean f10 = c0626q3.f(c0364l) | c0626q3.h(lVar3);
            Object P19 = c0626q3.P();
            if (f10 || P19 == obj) {
                P19 = new InterfaceC1193a() { // from class: P2.p
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        switch (i13) {
                            case 0:
                                c0364l.a.setValue(Boolean.FALSE);
                                lVar3.n0("image/*");
                                break;
                            case 1:
                                c0364l.a.setValue(Boolean.FALSE);
                                c.l lVar4 = lVar3;
                                AbstractC1276k.f(lVar4, "<this>");
                                lVar4.n0(null);
                                break;
                            default:
                                c0364l.a.setValue(Boolean.FALSE);
                                lVar3.n0(I2.D.a);
                                break;
                        }
                        return X3.y.a;
                    }
                };
                c0626q3.m0(P19);
            }
            InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P19;
            final c.l lVar4 = lVar;
            boolean f11 = c0626q3.f(c0364l) | c0626q3.h(lVar4);
            Object P20 = c0626q3.P();
            if (f11 || P20 == obj) {
                P20 = new InterfaceC1193a() { // from class: P2.p
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        switch (i33) {
                            case 0:
                                c0364l.a.setValue(Boolean.FALSE);
                                lVar4.n0("image/*");
                                break;
                            case 1:
                                c0364l.a.setValue(Boolean.FALSE);
                                c.l lVar42 = lVar4;
                                AbstractC1276k.f(lVar42, "<this>");
                                lVar42.n0(null);
                                break;
                            default:
                                c0364l.a.setValue(Boolean.FALSE);
                                lVar4.n0(I2.D.a);
                                break;
                        }
                        return X3.y.a;
                    }
                };
                c0626q3.m0(P20);
            }
            InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) P20;
            boolean f12 = c0626q3.f(c0364l) | c0626q3.h(P16);
            Object P21 = c0626q3.P();
            if (f12 || P21 == obj) {
                final int i34 = 2;
                P21 = new InterfaceC1193a() { // from class: P2.p
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        switch (i34) {
                            case 0:
                                c0364l.a.setValue(Boolean.FALSE);
                                P16.n0("image/*");
                                break;
                            case 1:
                                c0364l.a.setValue(Boolean.FALSE);
                                c.l lVar42 = P16;
                                AbstractC1276k.f(lVar42, "<this>");
                                lVar42.n0(null);
                                break;
                            default:
                                c0364l.a.setValue(Boolean.FALSE);
                                P16.n0(I2.D.a);
                                break;
                        }
                        return X3.y.a;
                    }
                };
                c0626q3.m0(P21);
            }
            int i35 = i32 << 21;
            c(booleanValue, interfaceC1193a3, interfaceC1193a4, interfaceC1193a5, (InterfaceC1193a) P21, z6, cVar2, cVar3, z7, cVar4, c0626q3, ((i11 >> 9) & 4128768) | (i35 & 29360128) | (i35 & 234881024) | (i35 & 1879048192));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(str, z5, cVar, interfaceC1193a, interfaceC1193a2, l3, list, list2, z6, cVar2, cVar3, z7, cVar4, cVar5, cVar6, cVar7, l22, interfaceC1041r, i6) { // from class: P2.q

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f5016c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f5017e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ l4.c f5018f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f5019g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f5020h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ X2.L f5021i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ List f5022j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ List f5023k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ boolean f5024l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ l4.c f5025m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ D2.c f5026n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ boolean f5027o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ l4.c f5028p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ l4.c f5029q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ l4.c f5030r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ l4.c f5031s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ L2 f5032t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f5033u;

                @Override // l4.e
                public final Object m(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int J4 = T.r.J(1);
                    V.d(this.f5016c, this.f5017e, this.f5018f, this.f5019g, this.f5020h, this.f5021i, this.f5022j, this.f5023k, this.f5024l, this.f5025m, this.f5026n, this.f5027o, this.f5028p, this.f5029q, this.f5030r, this.f5031s, this.f5032t, this.f5033u, (C0626q) obj2, J4);
                    return X3.y.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object, h0.r] */
    public static final void e(final InterfaceC1041r interfaceC1041r, final I0.S0 s02, final InterfaceC0961c interfaceC0961c, final int i6, final float f6, final l4.c cVar, final int i7, String str, boolean z5, final boolean z6, final boolean z7, final List list, final List list2, final l4.c cVar2, final l4.c cVar3, InterfaceC1830a interfaceC1830a, final InterfaceC1193a interfaceC1193a, l4.c cVar4, InterfaceC1193a interfaceC1193a2, InterfaceC1193a interfaceC1193a3, final l4.c cVar5, final D2.c cVar6, final l4.c cVar7, C0626q c0626q, final int i8, final int i9, final int i10) {
        String str2;
        boolean z8;
        InterfaceC1830a interfaceC1830a2;
        l4.c cVar8;
        InterfaceC1041r f7;
        I0.S0 s03;
        InterfaceC1349x interfaceC1349x;
        InterfaceC1041r f8;
        boolean z9;
        long j3;
        long c6;
        float f9;
        InterfaceC1193a interfaceC1193a4 = interfaceC1193a2;
        InterfaceC1193a interfaceC1193a5 = interfaceC1193a3;
        AbstractC1276k.f(interfaceC1041r, "modifier");
        AbstractC1276k.f(cVar, "onContentHeightChanged");
        AbstractC1276k.f(list, "imageStates");
        AbstractC1276k.f(list2, "fileStates");
        AbstractC1276k.f(cVar2, "onImageStatesChange");
        AbstractC1276k.f(cVar3, "onFileStatesChange");
        AbstractC1276k.f(interfaceC1830a, "hapticFeedback");
        AbstractC1276k.f(interfaceC1193a, "onToggleAttachmentSheet");
        AbstractC1276k.f(cVar4, "onMessageChange");
        AbstractC1276k.f(interfaceC1193a4, "onSend");
        AbstractC1276k.f(interfaceC1193a5, "onStop");
        AbstractC1276k.f(cVar5, "onReasoningEnabledChange");
        AbstractC1276k.f(cVar6, "reasoningSupport");
        AbstractC1276k.f(cVar7, "onWebSearchEnabledChange");
        c0626q.d0(-1288684491);
        int i11 = (i8 & 6) == 0 ? i8 | (c0626q.f(interfaceC1041r) ? 4 : 2) : i8;
        if ((i8 & 48) == 0) {
            i11 |= c0626q.f(s02) ? 32 : 16;
        }
        int i12 = i8 & 384;
        int i13 = PegdownExtensions.FENCED_CODE_BLOCKS;
        if (i12 == 0) {
            i11 |= c0626q.f(interfaceC0961c) ? 256 : 128;
        }
        int i14 = i8 & 3072;
        int i15 = PegdownExtensions.ANCHORLINKS;
        if (i14 == 0) {
            i11 |= c0626q.d(i6) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i11 |= c0626q.c(f6) ? 16384 : 8192;
        }
        int i16 = i8 & PegdownExtensions.SUPPRESS_ALL_HTML;
        int i17 = PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        if (i16 == 0) {
            i11 |= c0626q.h(cVar) ? PegdownExtensions.SUPPRESS_INLINE_HTML : 65536;
        }
        int i18 = i8 & 1572864;
        int i19 = PegdownExtensions.SUBSCRIPT;
        if (i18 == 0) {
            i11 |= c0626q.d(i7) ? PegdownExtensions.RELAXEDHRULES : 524288;
        }
        int i20 = i8 & 12582912;
        int i21 = PegdownExtensions.EXTANCHORLINKS;
        if (i20 == 0) {
            i11 |= c0626q.f(str) ? PegdownExtensions.EXTANCHORLINKS_WRAP : 4194304;
        }
        int i22 = i8 & 100663296;
        int i23 = PegdownExtensions.TOC;
        if (i22 == 0) {
            i11 |= c0626q.g(z5) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : 33554432;
        }
        if ((i8 & 805306368) == 0) {
            i11 |= c0626q.g(z6) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        int i24 = i11;
        int i25 = (i9 & 6) == 0 ? i9 | (c0626q.g(z7) ? 4 : 2) : i9;
        if ((i9 & 48) == 0) {
            i25 |= c0626q.h(list) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i25 |= c0626q.h(list2) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            if (c0626q.h(cVar2)) {
                i15 = 2048;
            }
            i25 |= i15;
        }
        if ((i9 & 24576) == 0) {
            i25 |= c0626q.h(cVar3) ? 16384 : 8192;
        }
        if ((i9 & PegdownExtensions.SUPPRESS_ALL_HTML) == 0) {
            if (c0626q.h(interfaceC1830a)) {
                i17 = PegdownExtensions.SUPPRESS_INLINE_HTML;
            }
            i25 |= i17;
        }
        if ((i9 & 1572864) == 0) {
            if (c0626q.h(interfaceC1193a)) {
                i19 = PegdownExtensions.RELAXEDHRULES;
            }
            i25 |= i19;
        }
        if ((i9 & 12582912) == 0) {
            if (c0626q.h(cVar4)) {
                i21 = PegdownExtensions.EXTANCHORLINKS_WRAP;
            }
            i25 |= i21;
        }
        if ((i9 & 100663296) == 0) {
            if (c0626q.h(interfaceC1193a4)) {
                i23 = PegdownExtensions.MULTI_LINE_IMAGE_URLS;
            }
            i25 |= i23;
        }
        if ((805306368 & i9) == 0) {
            i25 |= c0626q.h(interfaceC1193a5) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        int i26 = i25;
        int i27 = (i10 & 6) == 0 ? i10 | (c0626q.h(cVar5) ? 4 : 2) : i10;
        if ((i10 & 48) == 0) {
            i27 |= c0626q.f(cVar6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            if (c0626q.h(cVar7)) {
                i13 = 256;
            }
            i27 |= i13;
        }
        if (c0626q.S(i24 & 1, ((i24 & 306783379) == 306783378 && (i26 & 306783379) == 306783378 && (i27 & 147) == 146) ? false : true)) {
            C1033j c1033j = C1026c.f11786c;
            F0.V d6 = AbstractC1806l.d(c1033j, false);
            int hashCode = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z10 = c0626q.z();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, interfaceC1041r);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a a6 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a6);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.b());
            T.r.G(c0626q, z10, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode), c0626q, c0626q, c7);
            C1810p c1810p = C1810p.f15333b;
            InterfaceC1041r h3 = c1810p.h();
            F0.V d7 = AbstractC1806l.d(c1033j, false);
            int hashCode2 = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z11 = c0626q.z();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q, h3);
            InterfaceC1193a a7 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a7);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d7, C0150g.b());
            T.r.G(c0626q, z11, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode2), c0626q, c0626q, c8);
            C1038o c1038o = C1038o.a;
            InterfaceC1041r d8 = v.t0.d(v.t0.c(c1038o), 120 + f6);
            C1033j c1033j2 = C1026c.f11793k;
            InterfaceC1041r e6 = c1810p.e(d8, c1033j2);
            o0.s a8 = o0.s.a(o0.s.f13480g);
            AbstractC0623o0 abstractC0623o0 = Q.O.a;
            AbstractC1806l.a(l0.h.b(AbstractC1464z.e(e6, androidx.lifecycle.N.x(Y4.l.I(a8, o0.s.a(o0.s.c(0.3f, ((Q.N) c0626q.j(abstractC0623o0)).a())), o0.s.a(o0.s.c(0.6f, ((Q.N) c0626q.j(abstractC0623o0)).a())), o0.s.a(o0.s.c(0.85f, ((Q.N) c0626q.j(abstractC0623o0)).a())), o0.s.a(o0.s.c(0.95f, ((Q.N) c0626q.j(abstractC0623o0)).a()))))), 25), c0626q, 0);
            c0626q.r();
            InterfaceC1041r C5 = AbstractC1787b.C(c1810p.e(v.t0.c(c1038o), c1033j2), S.l.f7374V, S.l.f7374V, S.l.f7374V, interfaceC0961c.T(i6), 7);
            F0.V d9 = AbstractC1806l.d(c1033j, false);
            int hashCode3 = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z12 = c0626q.z();
            InterfaceC1041r c9 = AbstractC1024a.c(c0626q, C5);
            InterfaceC1193a a9 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a9);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d9, C0150g.b());
            T.r.G(c0626q, z12, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode3), c0626q, c0626q, c9);
            InterfaceC1041r c10 = v.t0.c(c1038o);
            boolean z13 = (i24 & 458752) == 131072;
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (z13 || P5 == obj) {
                P5 = new r(cVar, 1);
                c0626q.m0(P5);
            }
            InterfaceC1041r n3 = AbstractC0137z.n(c10, (l4.c) P5);
            C1813t a10 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
            int hashCode4 = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z14 = c0626q.z();
            InterfaceC1041r c11 = AbstractC1024a.c(c0626q, n3);
            InterfaceC1193a a11 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a11);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a10, C0150g.b());
            T.r.G(c0626q, z14, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode4), c0626q, c0626q, c11);
            float f10 = d3.b.a;
            float f11 = 34;
            float f12 = ((e1.f) AbstractC1117a.c(e1.f.a((f10 - f11) / 2), e1.f.a(0))).f11571c;
            float f13 = 16;
            float f14 = 8;
            InterfaceC1041r z15 = AbstractC1787b.z(v.t0.c(c1038o), f13, f14);
            float f15 = 12;
            v.p0 a12 = v.o0.a(AbstractC1799h.g(f15), C1026c.f11797o, c0626q, 54);
            int hashCode5 = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z16 = c0626q.z();
            InterfaceC1041r c12 = AbstractC1024a.c(c0626q, z15);
            InterfaceC1193a a13 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a13);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a12, C0150g.b());
            T.r.G(c0626q, z16, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode5), c0626q, c0626q, c12);
            f7 = AbstractC1464z.f(l0.h.c(v.t0.j(c1038o, f10), C.e.a), ((Q.N) c0626q.j(abstractC0623o0)).f5431u, o0.y.f13496b);
            int i28 = i24 & 112;
            boolean z17 = ((i26 & 3670016) == 1048576) | (i28 == 32);
            Object P6 = c0626q.P();
            if (z17 || P6 == obj) {
                s03 = s02;
                P6 = new D.r(13, s03, interfaceC1193a);
                c0626q.m0(P6);
            } else {
                s03 = s02;
            }
            InterfaceC1041r a14 = AbstractC1992b.a(31, f7, (InterfaceC1193a) P6, false);
            F0.V d10 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode6 = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z18 = c0626q.z();
            InterfaceC1041r c13 = AbstractC1024a.c(c0626q, a14);
            InterfaceC1193a a15 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a15);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d10, C0150g.b());
            T.r.G(c0626q, z18, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode6), c0626q, c0626q, c13);
            Q.A0.a(Y3.C.L(R.drawable.add, 0, c0626q), h5.e.j0(R.string.chat_features, c0626q), v.t0.j(c1038o, 24), ((Q.N) c0626q.j(abstractC0623o0)).b(), c0626q, 392, 0);
            c0626q.r();
            boolean f16 = c0626q.f(list) | c0626q.f(list2);
            Object P7 = c0626q.P();
            if (f16 || P7 == obj) {
                ArrayList arrayList = new ArrayList();
                int i29 = 0;
                interfaceC1349x = null;
                for (Object obj2 : list) {
                    int i30 = i29 + 1;
                    if (i29 < 0) {
                        Y4.l.U();
                        throw null;
                    }
                    arrayList.add(new Y(i29, (L2.b) obj2));
                    i29 = i30;
                }
                int i31 = 0;
                for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                    Object next = it.next();
                    int i32 = i31 + 1;
                    if (i31 < 0) {
                        Y4.l.U();
                        throw null;
                    }
                    arrayList.add(new X(i31, (L2.a) next));
                    i31 = i32;
                }
                P7 = Y3.m.J0(arrayList);
                c0626q.m0(P7);
            } else {
                interfaceC1349x = null;
            }
            List list3 = (List) P7;
            double d11 = 1.0f;
            if (d11 <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            InterfaceC1041r c14 = l0.h.c(v.t0.f(f10, S.l.f7374V, 2, new v.Z(1.0f, true)), C.e.a(22));
            AbstractC0623o0 abstractC0623o02 = Q.O.a;
            f8 = AbstractC1464z.f(c14, ((Q.N) c0626q.j(abstractC0623o02)).f5431u, o0.y.f13496b);
            C1033j c1033j3 = C1026c.f11786c;
            F0.V d12 = AbstractC1806l.d(c1033j3, false);
            int hashCode7 = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z19 = c0626q.z();
            InterfaceC1041r c15 = AbstractC1024a.c(c0626q, f8);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a a16 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a16);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d12, C0150g.b());
            T.r.G(c0626q, z19, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode7), c0626q, c0626q, c15);
            InterfaceC1041r B5 = AbstractC1787b.B(v.t0.c(c1038o), 10, f12, 6, f12);
            C1813t a17 = AbstractC1812s.a(AbstractC1799h.g(f14), C1026c.f11798p, c0626q, 6);
            int hashCode8 = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z20 = c0626q.z();
            InterfaceC1041r c16 = AbstractC1024a.c(c0626q, B5);
            InterfaceC1193a a18 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a18);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a17, C0150g.b());
            T.r.G(c0626q, z20, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode8), c0626q, c0626q, c16);
            boolean z21 = !list3.isEmpty();
            InterfaceC1349x interfaceC1349x2 = interfaceC1349x;
            C1210Q a19 = AbstractC1205L.a(AbstractC1318d.s(150, 6, interfaceC1349x2), 14).a(AbstractC1205L.b(AbstractC1318d.s(150, 6, interfaceC1349x2), 2));
            C1211S a20 = AbstractC1205L.d(AbstractC1318d.s(150, 6, interfaceC1349x2), 14).a(AbstractC1205L.c(AbstractC1318d.s(120, 6, interfaceC1349x2), 2));
            I0.S0 s04 = s03;
            C0873f c17 = AbstractC0874g.c(-1543002163, new B(list3, list, s04, cVar2, cVar3, list2), c0626q);
            C1814u c1814u = C1814u.a;
            AbstractC1244z.b(c1814u, z21, null, a19, a20, null, c17, c0626q, 1600518, 18);
            AbstractC1244z.b(c1814u, z6 || z7, null, AbstractC1205L.a(AbstractC1318d.s(150, 6, null), 14).a(AbstractC1205L.b(AbstractC1318d.s(150, 6, null), 2)), AbstractC1205L.d(AbstractC1318d.s(150, 6, null), 14).a(AbstractC1205L.c(AbstractC1318d.s(120, 6, null), 2)), null, AbstractC0874g.c(-1005738826, new l4.f() { // from class: P2.C
                @Override // l4.f
                public final Object d(Object obj3, Object obj4, Object obj5) {
                    C0626q c0626q2 = (C0626q) obj4;
                    ((Integer) obj5).getClass();
                    AbstractC1276k.f((InterfaceC1194A) obj3, "$this$AnimatedVisibility");
                    InterfaceC1041r d13 = v.t0.d(v.t0.a, 34);
                    C1795f g3 = AbstractC1799h.g(8);
                    C1032i c1032i = C1026c.f11796n;
                    final boolean z22 = z6;
                    boolean g6 = c0626q2.g(z22);
                    final D2.c cVar9 = cVar6;
                    boolean f17 = g6 | c0626q2.f(cVar9);
                    final l4.c cVar10 = cVar5;
                    boolean f18 = f17 | c0626q2.f(cVar10);
                    final boolean z23 = z7;
                    boolean g7 = f18 | c0626q2.g(z23);
                    final l4.c cVar11 = cVar7;
                    boolean f19 = g7 | c0626q2.f(cVar11);
                    Object P8 = c0626q2.P();
                    if (f19 || P8 == C0616l.a) {
                        l4.c cVar12 = new l4.c() { // from class: P2.y
                            @Override // l4.c
                            public final Object f(Object obj6) {
                                C1856g c1856g = (C1856g) obj6;
                                AbstractC1276k.f(c1856g, "$this$LazyRow");
                                if (z22) {
                                    D2.c cVar13 = cVar9;
                                    if (cVar13.a) {
                                        C1856g.n(c1856g, "reasoning_chip", new C0873f(new D.Q0(2, (Object) cVar13, cVar10), true, -338733836), 2);
                                    }
                                }
                                if (z23) {
                                    C1856g.n(c1856g, "search_chip", new C0873f(new b1(cVar11, 7), true, 1160583339), 2);
                                }
                                return X3.y.a;
                            }
                        };
                        c0626q2.m0(cVar12);
                        P8 = cVar12;
                    }
                    AbstractC1118b.b(d13, null, null, g3, c1032i, null, false, null, (l4.c) P8, c0626q2, 221190, 462);
                    return X3.y.a;
                }
            }, c0626q), c0626q, 1600518, 18);
            Object P8 = c0626q.P();
            if (P8 == obj) {
                int length = str.length();
                str2 = str;
                P8 = T.r.A(new X0.v(S0.F.b(length, length), str2, 4));
                c0626q.m0(P8);
            } else {
                str2 = str;
            }
            T.X x5 = (T.X) P8;
            boolean z22 = (i24 & 29360128) == 8388608;
            Object P9 = c0626q.P();
            if (z22 || P9 == obj) {
                P9 = new K(x5, null, str2);
                c0626q.m0(P9);
            }
            T.r.f(c0626q, str2, (l4.e) P9);
            Object P10 = c0626q.P();
            if (P10 == obj) {
                P10 = new m0.w();
                c0626q.m0(P10);
            }
            m0.w wVar = (m0.w) P10;
            Integer valueOf = Integer.valueOf(i7);
            boolean z23 = (i28 == 32) | ((i24 & 3670016) == 1048576);
            Object P11 = c0626q.P();
            if (z23 || P11 == obj) {
                P11 = new L(i7, wVar, s04, null);
                c0626q.m0(P11);
            }
            T.r.f(c0626q, valueOf, (l4.e) P11);
            InterfaceC1041r c18 = v.t0.c(c1038o);
            v.p0 a21 = v.o0.a(AbstractC1799h.g(f15), C1026c.f11797o, c0626q, 54);
            int hashCode9 = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z24 = c0626q.z();
            InterfaceC1041r c19 = AbstractC1024a.c(c0626q, c18);
            InterfaceC1193a a22 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a22);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a21, C0150g.b());
            T.r.G(c0626q, z24, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode9), c0626q, c0626q, c19);
            if (d11 <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            v.Z z25 = new v.Z(1.0f, true);
            C1032i c1032i = C1026c.f11796n;
            InterfaceC1041r c20 = z25.c(new Object());
            F0.V d13 = AbstractC1806l.d(c1033j3, false);
            int hashCode10 = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z26 = c0626q.z();
            InterfaceC1041r c21 = AbstractC1024a.c(c0626q, c20);
            InterfaceC1193a a23 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a23);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d13, C0150g.b());
            T.r.G(c0626q, z26, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode10), c0626q, c0626q, c21);
            X0.v vVar = (X0.v) x5.getValue();
            S0.P p5 = new S0.P(((Q.N) c0626q.j(abstractC0623o02)).b(), s4.j.z(16), null, null, 0L, 0, 0L, 16777212);
            o0.N n5 = new o0.N(((Q.N) c0626q.j(abstractC0623o02)).d());
            InterfaceC1041r j4 = AbstractC1249d.j(v.t0.c(c1038o), wVar);
            boolean z27 = (i26 & 29360128) == 8388608;
            Object P12 = c0626q.P();
            if (z27 || P12 == obj) {
                cVar8 = cVar4;
                P12 = new D(cVar8, x5, 0);
                c0626q.m0(P12);
            } else {
                cVar8 = cVar4;
            }
            AbstractC0095u.a(vVar, (l4.c) P12, j4, false, p5, null, null, 6, null, null, n5, AbstractC0874g.c(-26218914, new E(x5, 0), c0626q), c0626q, 805306368);
            c0626q.r();
            v.p0 a24 = v.o0.a(AbstractC1799h.g(f13), c1032i, c0626q, 54);
            int hashCode11 = Long.hashCode(T.r.u(c0626q));
            InterfaceC0617l0 z28 = c0626q.z();
            InterfaceC1041r c22 = AbstractC1024a.c(c0626q, c1038o);
            InterfaceC1193a a25 = C0150g.a();
            c0626q.f0();
            if (c0626q.D()) {
                c0626q.k(a25);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a24, C0150g.b());
            T.r.G(c0626q, z28, C0150g.c());
            B3.e.w(c0626q, Integer.valueOf(hashCode11), c0626q, c0626q, c22);
            boolean z29 = AbstractC1776n.l0(str2).toString().length() > 0;
            if (!list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((L2.a) it2.next()).f3053e) {
                        z9 = true;
                        break;
                    }
                }
            }
            z9 = false;
            boolean z30 = z5 || (z29 && !z9);
            boolean z31 = o0.y.t(R1.r(c0626q).a()) < 0.5f;
            if (z31) {
                c0626q.b0(-1152738656);
                j3 = o0.s.c(0.28f, R1.r(c0626q).d());
                c0626q.s();
            } else {
                c0626q.b0(-1152601171);
                j3 = R1.r(c0626q).f5428r;
                c0626q.s();
            }
            if (z31) {
                c0626q.b0(-1152396385);
                c6 = o0.s.c(0.8f, R1.r(c0626q).b());
                c0626q.s();
            } else {
                c0626q.b0(-1152257257);
                c6 = o0.s.c(0.75f, R1.r(c0626q).c());
                c0626q.s();
            }
            if (z5) {
                c0626q.b0(-37160382);
                j3 = R1.r(c0626q).f5433w;
                c0626q.s();
            } else if (z30) {
                c0626q.b0(-37157596);
                j3 = R1.r(c0626q).d();
                c0626q.s();
            } else {
                c0626q.b0(-37155789);
                c0626q.s();
            }
            if (z5) {
                c0626q.b0(-37149148);
                c6 = R1.r(c0626q).f5434x;
                c0626q.s();
            } else if (z30) {
                c0626q.b0(-37146298);
                c6 = R1.r(c0626q).f5405b;
                c0626q.s();
            } else {
                c0626q.b0(-37144431);
                c0626q.s();
            }
            long j5 = c6;
            C1345t c1345t = AbstractC1350y.a;
            d1 a26 = AbstractC1218Z.a(j3, AbstractC1318d.s(220, 2, c1345t), "sendContainerColor", c0626q, 384, 8);
            d1 a27 = AbstractC1218Z.a(j5, AbstractC1318d.s(220, 2, c1345t), "sendContentColor", c0626q, 384, 8);
            d1 b5 = AbstractC1324g.b(z30 ? 1.0f : z31 ? 0.85f : 0.75f, AbstractC1318d.s(200, 2, c1345t), "sendIconAlpha", c0626q, 3072, 20);
            Object P13 = c0626q.P();
            if (P13 == obj) {
                f9 = 1.0f;
                P13 = AbstractC1318d.a(1.0f);
                c0626q.m0(P13);
            } else {
                f9 = 1.0f;
            }
            C1316c c1316c = (C1316c) P13;
            Object P14 = c0626q.P();
            if (P14 == obj) {
                P14 = AbstractC1318d.a(f9);
                c0626q.m0(P14);
            }
            C1316c c1316c2 = (C1316c) P14;
            Boolean valueOf2 = Boolean.valueOf(z30);
            boolean g3 = c0626q.g(z30) | c0626q.h(c1316c) | c0626q.h(c1316c2);
            Object P15 = c0626q.P();
            if (g3 || P15 == obj) {
                P15 = new Q(z30, c1316c, c1316c2, null);
                c0626q.m0(P15);
            }
            T.r.f(c0626q, valueOf2, (l4.e) P15);
            boolean z32 = z30;
            C0474v0 a28 = C0478w0.a(((o0.s) a26.getValue()).a, ((o0.s) a27.getValue()).a, ((o0.s) a26.getValue()).a, ((o0.s) a27.getValue()).a, c0626q);
            InterfaceC1041r c23 = l0.h.c(v.t0.j(c1038o, f11), C.e.a);
            float floatValue = ((Number) c1316c.d()).floatValue();
            InterfaceC1041r j6 = l0.h.j(c23, floatValue, floatValue);
            interfaceC1830a2 = interfaceC1830a;
            boolean h6 = c0626q.h(interfaceC1830a2) | ((i24 & 234881024) == 67108864) | ((i26 & 1879048192) == 536870912) | ((i26 & 234881024) == 67108864);
            Object P16 = c0626q.P();
            if (h6 || P16 == obj) {
                z8 = z5;
                interfaceC1193a4 = interfaceC1193a2;
                interfaceC1193a5 = interfaceC1193a3;
                P16 = new F(interfaceC1830a2, z8, interfaceC1193a5, interfaceC1193a4);
                c0626q.m0(P16);
            } else {
                z8 = z5;
                interfaceC1193a4 = interfaceC1193a2;
                interfaceC1193a5 = interfaceC1193a3;
            }
            R1.e(1572864, a28, c0626q, AbstractC0874g.c(-2110737987, new G(z8, c1316c2, b5), c0626q), j6, (InterfaceC1193a) P16, null, z32);
            c0626q.r();
            c0626q.r();
            c0626q.r();
            c0626q.r();
            c0626q.r();
            c0626q.r();
            c0626q.r();
            c0626q.r();
        } else {
            str2 = str;
            z8 = z5;
            interfaceC1830a2 = interfaceC1830a;
            cVar8 = cVar4;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            final InterfaceC1830a interfaceC1830a3 = interfaceC1830a2;
            final String str3 = str2;
            final boolean z33 = z8;
            final InterfaceC1193a interfaceC1193a6 = interfaceC1193a5;
            final InterfaceC1193a interfaceC1193a7 = interfaceC1193a4;
            final l4.c cVar9 = cVar8;
            t5.f(new l4.e() { // from class: P2.H
                @Override // l4.e
                public final Object m(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    int J4 = T.r.J(i8 | 1);
                    int J5 = T.r.J(i9);
                    int J6 = T.r.J(i10);
                    V.e(InterfaceC1041r.this, s02, interfaceC0961c, i6, f6, cVar, i7, str3, z33, z6, z7, list, list2, cVar2, cVar3, interfaceC1830a3, interfaceC1193a, cVar9, interfaceC1193a7, interfaceC1193a6, cVar5, cVar6, cVar7, (C0626q) obj3, J4, J5, J6);
                    return X3.y.a;
                }
            });
        }
    }

    public static final void f(L2.a aVar, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        InterfaceC1193a interfaceC1193a2;
        long j3;
        boolean z5;
        boolean z6;
        C1038o c1038o;
        C0626q c0626q2 = c0626q;
        C1033j c1033j = C1026c.f11790h;
        AbstractC1276k.f(aVar, "fileState");
        String str = aVar.f3050b;
        AbstractC1276k.f(interfaceC1193a, "onDeleteClick");
        c0626q2.d0(1517031958);
        int i7 = i6 | (c0626q2.f(aVar) ? 4 : 2) | (c0626q2.h(interfaceC1193a) ? 32 : 16);
        if (c0626q2.S(i7 & 1, (i7 & 19) != 18)) {
            float f6 = AbstractC0350e.f4916d;
            C.d a6 = C.e.a(f6);
            if (o0.y.t(R1.r(c0626q2).f5424n) < 0.5f) {
                c0626q2.b0(-2041502853);
                j3 = R1.r(c0626q2).f5426p;
                c0626q2.p(false);
            } else {
                c0626q2.b0(-2041448076);
                j3 = R1.r(c0626q2).f5428r;
                c0626q2.p(false);
            }
            float f7 = AbstractC0350e.a;
            C1038o c1038o2 = C1038o.a;
            InterfaceC1041r f8 = AbstractC1464z.f(l0.h.c(v.t0.j(c1038o2, f7), a6), j3, o0.y.f13496b);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, f8);
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
            C1810p c1810p = C1810p.f15333b;
            C1818y c1818y = v.t0.f15349c;
            float f9 = 8;
            InterfaceC1041r B5 = AbstractC1787b.B(c1818y, f9, 10, f9, f9);
            C1813t a7 = AbstractC1812s.a(AbstractC1799h.g(4), C1026c.f11799q, c0626q2, 54);
            int hashCode2 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, B5);
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
            Q.A0.a(Y3.C.L(R.drawable.ic_description, 0, c0626q2), str, null, R1.r(c0626q2).f5427q, c0626q2, 8, 4);
            f3.b(str, null, R1.r(c0626q).f5427q, 0L, null, 0L, new d1.k(3), 0L, 2, false, 1, 0, R1.t(c0626q).f6134o, c0626q, 0, 24960, 109562);
            c0626q2 = c0626q;
            Long l6 = aVar.f3051c;
            String b5 = l6 != null ? AbstractC1992b.b(l6.longValue()) : null;
            if (b5 != null) {
                c0626q2.b0(-1290151174);
                f3.b(b5, null, R1.r(c0626q2).f5429s, 0L, null, 0L, new d1.k(3), 0L, 2, false, 1, 0, R1.t(c0626q2).f6134o, c0626q, 0, 24960, 109562);
                c0626q2 = c0626q;
                z5 = false;
            } else {
                z5 = false;
                c0626q2.b0(-1292884568);
            }
            c0626q2.p(z5);
            c0626q2.p(true);
            if (aVar.f3053e) {
                c0626q2.b0(2110497874);
                InterfaceC1041r f10 = AbstractC1464z.f(c1818y, o0.s.c(0.5f, o0.s.f13475b), C.e.a(f6));
                F0.V d7 = AbstractC1806l.d(c1033j, z5);
                int hashCode3 = Long.hashCode(c0626q2.f8164T);
                InterfaceC0617l0 l7 = c0626q2.l();
                InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, f10);
                c0626q2.f0();
                if (c0626q2.f8163S) {
                    c0626q2.k(c0148f);
                } else {
                    c0626q2.p0();
                }
                T.r.G(c0626q2, d7, c0146e);
                T.r.G(c0626q2, l7, c0146e2);
                AbstractC1135a.n(hashCode3, c0626q2, c0146e3, c0626q2, c0144d);
                T.r.G(c0626q2, c8, c0146e4);
                M1.a(v.t0.j(c1038o2, 24), o0.s.f13477d, S.l.f7374V, 0L, 0, S.l.f7374V, c0626q, 54, 60);
                c0626q2 = c0626q;
                c0626q2.p(true);
                c0626q2.p(z5);
                c1038o = c1038o2;
            } else {
                if (aVar.f3054f) {
                    c0626q2.b0(2111035538);
                    c1038o = c1038o2;
                    long j4 = o0.s.f13478e;
                    InterfaceC1041r f11 = AbstractC1464z.f(c1818y, o0.s.c(0.3f, j4), C.e.a(f6));
                    F0.V d8 = AbstractC1806l.d(c1033j, false);
                    int hashCode4 = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l8 = c0626q2.l();
                    InterfaceC1041r c9 = AbstractC1024a.c(c0626q2, f11);
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f);
                    } else {
                        c0626q2.p0();
                    }
                    T.r.G(c0626q2, d8, c0146e);
                    T.r.G(c0626q2, l8, c0146e2);
                    AbstractC1135a.n(hashCode4, c0626q2, c0146e3, c0626q2, c0144d);
                    T.r.G(c0626q2, c9, c0146e4);
                    z6 = false;
                    Q.A0.a(Y3.C.L(R.drawable.ic_description, 0, c0626q2), null, null, j4, c0626q2, 3128, 4);
                    c0626q2.p(true);
                } else {
                    z6 = z5;
                    c1038o = c1038o2;
                    c0626q2.b0(2107352242);
                }
                c0626q2.p(z6);
            }
            interfaceC1193a2 = interfaceC1193a;
            AbstractC0350e.a(AbstractC1787b.w(c1810p.e(c1038o, C1026c.f11788f), -6, 6), interfaceC1193a2, c0626q2, i7 & 112);
            c0626q2.p(true);
        } else {
            interfaceC1193a2 = interfaceC1193a;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new I.m(i6, 6, aVar, interfaceC1193a2);
        }
    }

    public static final void g(L2.b bVar, List list, int i6, I0.S0 s02, l4.c cVar, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i7) {
        C1818y c1818y;
        int i8;
        C1038o c1038o;
        C1033j c1033j;
        C0146e c0146e;
        boolean z5;
        InterfaceC1193a interfaceC1193a2 = interfaceC1193a;
        C0626q c0626q2 = c0626q;
        C1033j c1033j2 = C1026c.f11790h;
        AbstractC1276k.f(bVar, "imageState");
        AbstractC1276k.f(list, "imageStates");
        AbstractC1276k.f(cVar, "onImageClick");
        AbstractC1276k.f(interfaceC1193a2, "onDeleteClick");
        c0626q2.d0(-524243901);
        int i9 = i7 | (c0626q2.f(bVar) ? 4 : 2) | (c0626q2.h(list) ? 32 : 16) | (c0626q2.d(i6) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q2.f(s02) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q2.h(interfaceC1193a2) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS);
        if (c0626q2.S(i9 & 1, (74899 & i9) != 74898)) {
            C0889e c0889e = (C0889e) c0626q2.j(AbstractC0897m.a);
            Object P5 = c0626q2.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = T.r.A(new e1.j(0L));
                c0626q2.m0(P5);
            }
            T.X x5 = (T.X) P5;
            Comparable comparable = bVar.a;
            if (comparable == null) {
                comparable = bVar.f3055b;
            }
            boolean f6 = c0626q2.f(comparable);
            Object P6 = c0626q2.P();
            if (f6 || P6 == c0602e) {
                P6 = T.r.A(Float.valueOf(1.0f));
                c0626q2.m0(P6);
            }
            T.X x6 = (T.X) P6;
            float f7 = AbstractC0350e.a;
            Comparable comparable2 = comparable;
            float f8 = ((e1.f) AbstractC1117a.h(new e1.f(((Number) x6.getValue()).floatValue() * f7), new e1.f(AbstractC0350e.f4914b), new e1.f(AbstractC0350e.f4915c))).f11571c;
            C1038o c1038o2 = C1038o.a;
            InterfaceC1041r n3 = v.t0.n(v.t0.d(c1038o2, f7), f8);
            float f9 = AbstractC0350e.f4916d;
            InterfaceC1041r c6 = l0.h.c(n3, C.e.a(f9));
            Object P7 = c0626q2.P();
            if (P7 == c0602e) {
                P7 = new D(cVar, x5, 1);
                c0626q2.m0(P7);
            }
            InterfaceC1041r m3 = AbstractC0137z.m(c6, (l4.c) P7);
            boolean h3 = ((i9 & 7168) == 2048) | c0626q2.h(list) | c0626q2.f(c0889e) | ((i9 & 896) == 256);
            Object P8 = c0626q2.P();
            if (h3 || P8 == c0602e) {
                P8 = new Z(s02, list, c0889e, i6);
                c0626q2.m0(P8);
            }
            InterfaceC1041r a6 = AbstractC1992b.a(31, m3, (InterfaceC1193a) P8, false);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, a6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            C0146e c0146e2 = C0150g.f1928f;
            T.r.G(c0626q2, d6, c0146e2);
            C0146e c0146e3 = C0150g.f1927e;
            T.r.G(c0626q2, l3, c0146e3);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e4 = C0150g.f1929g;
            T.r.x(c0626q2, valueOf, c0146e4);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q2, c0144d);
            C0146e c0146e5 = C0150g.f1926d;
            T.r.G(c0626q2, c7, c0146e5);
            C1810p c1810p = C1810p.f15333b;
            C1818y c1818y2 = v.t0.f15349c;
            boolean f10 = c0626q2.f(x6);
            Object P9 = c0626q2.P();
            if (f10 || P9 == c0602e) {
                P9 = new C0103y(x6, 7);
                c0626q2.m0(P9);
            }
            j2.n.a(comparable2, null, c1818y2, null, a, (l4.c) P9, C0120h.a, c0626q2, 1573296, 48, 128696);
            c0626q2 = c0626q2;
            if (bVar.f3056c) {
                c0626q2.b0(392492441);
                InterfaceC1041r f11 = AbstractC1464z.f(c1818y2, o0.s.c(0.5f, o0.s.f13475b), C.e.a(f9));
                F0.V d7 = AbstractC1806l.d(c1033j2, false);
                int hashCode2 = Long.hashCode(c0626q2.f8164T);
                InterfaceC0617l0 l5 = c0626q2.l();
                InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, f11);
                c0626q2.f0();
                if (c0626q2.f8163S) {
                    c0626q2.k(c0148f);
                } else {
                    c0626q2.p0();
                }
                T.r.G(c0626q2, d7, c0146e2);
                T.r.G(c0626q2, l5, c0146e3);
                AbstractC1135a.n(hashCode2, c0626q2, c0146e4, c0626q2, c0144d);
                T.r.G(c0626q2, c8, c0146e5);
                c1038o = c1038o2;
                c1033j = c1033j2;
                c0146e = c0146e5;
                c1818y = c1818y2;
                M1.a(v.t0.j(c1038o2, 24), o0.s.f13477d, S.l.f7374V, 0L, 0, S.l.f7374V, c0626q, 54, 60);
                c0626q2 = c0626q;
                z5 = true;
                c0626q2.p(true);
                c0626q2.p(false);
                i8 = 388821049;
            } else {
                c1818y = c1818y2;
                i8 = 388821049;
                c1038o = c1038o2;
                c1033j = c1033j2;
                c0146e = c0146e5;
                z5 = true;
                c0626q2.b0(388821049);
                c0626q2.p(false);
            }
            if (bVar.f3057d) {
                c0626q2.b0(393036212);
                long j3 = o0.s.f13478e;
                InterfaceC1041r f12 = AbstractC1464z.f(c1818y, o0.s.c(0.3f, j3), C.e.a(f9));
                F0.V d8 = AbstractC1806l.d(c1033j, false);
                int hashCode3 = Long.hashCode(c0626q2.f8164T);
                InterfaceC0617l0 l6 = c0626q2.l();
                InterfaceC1041r c9 = AbstractC1024a.c(c0626q2, f12);
                c0626q2.f0();
                if (c0626q2.f8163S) {
                    c0626q2.k(c0148f);
                } else {
                    c0626q2.p0();
                }
                T.r.G(c0626q2, d8, c0146e2);
                T.r.G(c0626q2, l6, c0146e3);
                AbstractC1135a.n(hashCode3, c0626q2, c0146e4, c0626q2, c0144d);
                T.r.G(c0626q2, c9, c0146e);
                Q.A0.a(Y3.C.L(R.drawable.broken_image, 0, c0626q2), h5.e.j0(R.string.chat_upload_failed, c0626q2), null, j3, c0626q2, 3080, 4);
                c0626q2.p(z5);
            } else {
                c0626q2.b0(i8);
            }
            c0626q2.p(false);
            interfaceC1193a2 = interfaceC1193a;
            AbstractC0350e.a(AbstractC1787b.w(c1810p.e(c1038o, C1026c.f11788f), -6, 6), interfaceC1193a2, c0626q2, (i9 >> 12) & 112);
            c0626q2.p(z5);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new C0343a0(bVar, list, i6, s02, cVar, interfaceC1193a2, i7);
        }
    }

    public static final void h(final int i6, final int i7, final int i8, final C0345b0 c0345b0, boolean z5, final InterfaceC1193a interfaceC1193a, C0626q c0626q, final int i9, final int i10) {
        boolean z6;
        int i11;
        final boolean z7;
        boolean z8;
        C0626q c0626q2 = c0626q;
        c0626q2.d0(333077475);
        int i12 = i9 | (c0626q2.d(i6) ? 4 : 2) | (c0626q2.d(i7) ? 32 : 16) | (c0626q2.d(i8) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q2.f(c0345b0) ? 2048 : PegdownExtensions.ANCHORLINKS);
        int i13 = i10 & 16;
        if (i13 != 0) {
            i11 = i12 | 24576;
            z6 = z5;
        } else {
            z6 = z5;
            i11 = i12 | (c0626q2.g(z6) ? 16384 : 8192);
        }
        int i14 = i11 | (c0626q2.h(interfaceC1193a) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS);
        if (c0626q2.S(i14 & 1, (74899 & i14) != 74898)) {
            z7 = i13 != 0 ? true : z6;
            float f6 = 16;
            C.d a6 = C.e.a(f6);
            C1038o c1038o = C1038o.a;
            InterfaceC1041r z9 = AbstractC1787b.z(AbstractC1464z.f(l0.h.c(c1038o, a6), c0345b0.a, o0.y.f13496b), 12, 7);
            v.p0 a7 = v.o0.a(AbstractC1799h.g(8), C1026c.f11796n, c0626q2, 54);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, z9);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, a7, C0150g.f1928f);
            T.r.G(c0626q2, l3, C0150g.f1927e);
            T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q2, C0150g.f1930h);
            T.r.G(c0626q2, c6, C0150g.f1926d);
            Q.A0.a(Y3.C.L(i6, i14 & 14, c0626q2), h5.e.j0(i7, c0626q2), v.t0.j(c1038o, f6), c0345b0.f4828b, c0626q2, 392, 0);
            f3.b(h5.e.j0(i7, c0626q2), null, c0345b0.f4828b, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6132m, c0626q, 0, 0, 131066);
            c0626q2 = c0626q;
            if (z7) {
                c0626q2.b0(1503053335);
                z8 = false;
                AbstractC1688b L5 = Y3.C.L(R.drawable.close, 0, c0626q2);
                String j02 = h5.e.j0(i8, c0626q2);
                long j3 = c0345b0.f4828b;
                InterfaceC1041r j4 = v.t0.j(c1038o, f6);
                boolean z10 = (i14 & 458752) == 131072;
                Object P5 = c0626q2.P();
                if (z10 || P5 == C0616l.a) {
                    P5 = new C0348d(2, interfaceC1193a);
                    c0626q2.m0(P5);
                }
                Q.A0.a(L5, j02, AbstractC1992b.a(15, j4, (InterfaceC1193a) P5, false), j3, c0626q2, 8, 0);
            } else {
                z8 = false;
                c0626q2.b0(1473234435);
            }
            c0626q2.p(z8);
            c0626q2.p(true);
        } else {
            c0626q2.V();
            z7 = z6;
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(i6, i7, i8, c0345b0, z7, interfaceC1193a, i9, i10) { // from class: P2.A

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f4640c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f4641e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f4642f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ C0345b0 f4643g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f4644h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f4645i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ int f4646j;

                {
                    this.f4646j = i10;
                }

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(1);
                    V.h(this.f4640c, this.f4641e, this.f4642f, this.f4643g, this.f4644h, this.f4645i, (C0626q) obj, J4, this.f4646j);
                    return X3.y.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0626  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final java.lang.String r75, final java.util.List r76, final x.s r77, final java.lang.String r78, final boolean r79, final int r80, final int r81, final boolean r82, java.lang.String r83, final l4.InterfaceC1193a r84, final l4.InterfaceC1193a r85, final l4.c r86, final l4.InterfaceC1193a r87, final l4.InterfaceC1193a r88, final l4.InterfaceC1193a r89, final l4.InterfaceC1193a r90, final java.lang.String r91, final l4.InterfaceC1193a r92, final X2.L r93, final java.util.List r94, final java.util.List r95, final boolean r96, final l4.c r97, final D2.c r98, final boolean r99, final l4.c r100, final l4.c r101, final l4.c r102, final java.util.List r103, final boolean r104, final boolean r105, final java.lang.String r106, final l4.c r107, T.C0626q r108, final int r109) {
        /*
            Method dump skipped, instructions count: 2220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.V.i(java.lang.String, java.util.List, x.s, java.lang.String, boolean, int, int, boolean, java.lang.String, l4.a, l4.a, l4.c, l4.a, l4.a, l4.a, l4.a, java.lang.String, l4.a, X2.L, java.util.List, java.util.List, boolean, l4.c, D2.c, boolean, l4.c, l4.c, l4.c, java.util.List, boolean, boolean, java.lang.String, l4.c, T.q, int):void");
    }

    public static final boolean j(d1 d1Var) {
        return ((Boolean) d1Var.getValue()).booleanValue();
    }

    public static final void k(final boolean z5, final List list, final x.s sVar, final float f6, final float f7, final float f8, final float f9, final float f10, C0626q c0626q, final int i6) {
        AbstractC1276k.f(list, "messageList");
        AbstractC1276k.f(sVar, "lazyListState");
        c0626q.d0(-1851768805);
        int i7 = i6 | (c0626q.g(z5) ? 4 : 2) | (c0626q.h(list) ? 32 : 16) | (c0626q.f(sVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.c(f6) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.c(f7) ? 16384 : 8192) | (c0626q.c(f9) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT) | (c0626q.c(f10) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS);
        if (c0626q.S(i7 & 1, (4793491 & i7) != 4793490)) {
            C1818y c1818y = v.t0.f15349c;
            final InterfaceC1041r C5 = AbstractC1787b.C(AbstractC1787b.A(f8, S.l.f7374V, 2, c1818y), S.l.f7374V, f9, S.l.f7374V, f10, 5);
            F0.V d6 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, c1818y);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            String str = (z5 && list.isEmpty()) ? "loading" : list.isEmpty() ? "empty" : "messages";
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = new I2.x(27);
                c0626q.m0(P5);
            }
            AbstractC1227i.a(str, null, (l4.c) P5, null, "content_transition", null, AbstractC0874g.c(-392553109, new l4.g() { // from class: P2.A0
                @Override // l4.g
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean z6;
                    String str2 = (String) obj2;
                    C0626q c0626q2 = (C0626q) obj3;
                    ((Integer) obj4).getClass();
                    AbstractC1276k.f((C1230l) obj, "$this$AnimatedContent");
                    AbstractC1276k.f(str2, "state");
                    int hashCode2 = str2.hashCode();
                    if (hashCode2 == -462094004) {
                        z6 = false;
                        if (str2.equals("messages")) {
                            c0626q2.b0(647089766);
                            C1818y c1818y2 = v.t0.f15349c;
                            float f11 = 8;
                            v.k0 k0Var = new v.k0(f11, f6, f11, f7);
                            C1795f g3 = AbstractC1799h.g(12);
                            List list2 = list;
                            boolean h3 = c0626q2.h(list2);
                            Object P6 = c0626q2.P();
                            if (h3 || P6 == C0616l.a) {
                                P6 = new C0250a(list2, 2);
                                c0626q2.m0(P6);
                            }
                            AbstractC1118b.a(c1818y2, sVar, k0Var, g3, null, null, false, null, (l4.c) P6, c0626q2, 24582, 488);
                            c0626q2.p(z6);
                            return X3.y.a;
                        }
                    } else if (hashCode2 != 96634189) {
                        if (hashCode2 == 336650556 && str2.equals("loading")) {
                            c0626q2.b0(646347564);
                            AbstractC0888d.g(InterfaceC1041r.this, c0626q2, 0);
                            c0626q2.p(false);
                            return X3.y.a;
                        }
                        z6 = false;
                    } else {
                        if (str2.equals("empty")) {
                            c0626q2.b0(646525969);
                            F0.V d7 = AbstractC1806l.d(C1026c.f11790h, false);
                            int hashCode3 = Long.hashCode(c0626q2.f8164T);
                            InterfaceC0617l0 l5 = c0626q2.l();
                            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, C5);
                            InterfaceC0152h.a.getClass();
                            InterfaceC1193a interfaceC1193a = C0150g.f1924b;
                            c0626q2.f0();
                            if (c0626q2.f8163S) {
                                c0626q2.k(interfaceC1193a);
                            } else {
                                c0626q2.p0();
                            }
                            T.r.G(c0626q2, d7, C0150g.f1928f);
                            T.r.G(c0626q2, l5, C0150g.f1927e);
                            T.r.x(c0626q2, Integer.valueOf(hashCode3), C0150g.f1929g);
                            T.r.C(c0626q2, C0150g.f1930h);
                            T.r.G(c0626q2, c7, C0150g.f1926d);
                            f3.b(h5.e.j0(R.string.chat_empty_prompt, c0626q2), null, ((Q.N) c0626q2.j(Q.O.a)).f5427q, s4.j.z(24), W0.k.f8837k, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 1597440, 0, 262058);
                            c0626q2.p(true);
                            c0626q2.p(false);
                            return X3.y.a;
                        }
                        z6 = false;
                    }
                    c0626q2.b0(643819607);
                    c0626q2.p(z6);
                    return X3.y.a;
                }
            }, c0626q), c0626q, 1597824);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(z5, list, sVar, f6, f7, f8, f9, f10, i6) { // from class: P2.B0

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f4660c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f4661e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ x.s f4662f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f4663g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f4664h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ float f4665i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ float f4666j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ float f4667k;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(196609);
                    V.k(this.f4660c, this.f4661e, this.f4662f, this.f4663g, this.f4664h, this.f4665i, this.f4666j, this.f4667k, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void l(final String str, final boolean z5, final boolean z6, final InterfaceC1193a interfaceC1193a, final InterfaceC1193a interfaceC1193a2, final InterfaceC1193a interfaceC1193a3, final float f6, final float f7, InterfaceC1041r interfaceC1041r, C0626q c0626q, final int i6) {
        InterfaceC1041r interfaceC1041r2;
        AbstractC1276k.f(str, "assistantName");
        AbstractC1276k.f(interfaceC1193a, "onMenuClick");
        AbstractC1276k.f(interfaceC1193a2, "onNewChatClick");
        AbstractC1276k.f(interfaceC1193a3, "onModelSelectorClick");
        c0626q.d0(-1682922464);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.g(z5) ? 32 : 16) | (c0626q.g(z6) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(interfaceC1193a) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.h(interfaceC1193a2) ? 16384 : 8192) | (c0626q.h(interfaceC1193a3) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS) | (c0626q.c(f6) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT);
        if (c0626q.S(i7 & 1, (38347923 & i7) != 38347922)) {
            final float f8 = f6 + f7;
            interfaceC1041r2 = interfaceC1041r;
            AbstractC1787b.a(v.t0.d(interfaceC1041r2.c(v.t0.a), f8), null, false, AbstractC0874g.c(-497936758, new l4.f() { // from class: P2.G0
                @Override // l4.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    C.d dVar;
                    String str2;
                    C0146e c0146e;
                    long j3;
                    v.r rVar = (v.r) obj;
                    C0626q c0626q2 = (C0626q) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    AbstractC1276k.f(rVar, "$this$BoxWithConstraints");
                    if ((intValue & 6) == 0) {
                        intValue |= c0626q2.f(rVar) ? 4 : 2;
                    }
                    if (c0626q2.S(intValue & 1, (intValue & 19) != 18)) {
                        float f9 = 20;
                        float f10 = d3.b.a;
                        float f11 = 8;
                        float f12 = 2;
                        float f13 = (f9 * f12) + (f10 * f12);
                        InterfaceC0961c interfaceC0961c = rVar.a;
                        long j4 = rVar.f15342b;
                        float f14 = 0;
                        float f15 = ((e1.f) AbstractC1117a.c(new e1.f(((e1.f) AbstractC1117a.c(new e1.f((C0959a.d(j4) ? interfaceC0961c.T(C0959a.h(j4)) : Float.POSITIVE_INFINITY) - f13), new e1.f(f14))).f11571c - (f11 * f12)), new e1.f(f14))).f11571c;
                        AbstractC0888d.a(f8, null, S.l.f7374V, c0626q2, 0);
                        InterfaceC1041r A5 = AbstractC1787b.A(f9, S.l.f7374V, 2, C1810p.f15333b.e(v.t0.d(v.t0.a, f7), C1026c.f11792j));
                        C1032i c1032i = C1026c.f11796n;
                        v.p0 a6 = v.o0.a(AbstractC1799h.f15307e, c1032i, c0626q2, 54);
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
                        C0146e c0146e2 = C0150g.f1928f;
                        T.r.G(c0626q2, a6, c0146e2);
                        C0146e c0146e3 = C0150g.f1927e;
                        T.r.G(c0626q2, l3, c0146e3);
                        Integer valueOf = Integer.valueOf(hashCode);
                        C0146e c0146e4 = C0150g.f1929g;
                        T.r.x(c0626q2, valueOf, c0146e4);
                        C0144d c0144d = C0150g.f1930h;
                        T.r.C(c0626q2, c0144d);
                        C0146e c0146e5 = C0150g.f1926d;
                        T.r.G(c0626q2, c6, c0146e5);
                        C1038o c1038o = C1038o.a;
                        InterfaceC1041r j5 = v.t0.j(c1038o, f10);
                        long j6 = R1.r(c0626q2).f5431u;
                        C.d dVar2 = C.e.a;
                        InterfaceC1041r c7 = l0.h.c(AbstractC1464z.f(j5, j6, dVar2), dVar2);
                        InterfaceC1193a interfaceC1193a4 = interfaceC1193a;
                        boolean f16 = c0626q2.f(interfaceC1193a4);
                        Object P5 = c0626q2.P();
                        C0602e c0602e = C0616l.a;
                        if (f16 || P5 == c0602e) {
                            dVar = dVar2;
                            P5 = new C0348d(4, interfaceC1193a4);
                            c0626q2.m0(P5);
                        } else {
                            dVar = dVar2;
                        }
                        InterfaceC1041r a7 = AbstractC1992b.a(31, c7, (InterfaceC1193a) P5, false);
                        C1033j c1033j = C1026c.f11790h;
                        F0.V d6 = AbstractC1806l.d(c1033j, false);
                        int hashCode2 = Long.hashCode(c0626q2.f8164T);
                        InterfaceC0617l0 l5 = c0626q2.l();
                        InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, a7);
                        c0626q2.f0();
                        if (c0626q2.f8163S) {
                            c0626q2.k(c0148f);
                        } else {
                            c0626q2.p0();
                        }
                        T.r.G(c0626q2, d6, c0146e2);
                        T.r.G(c0626q2, l5, c0146e3);
                        AbstractC1135a.n(hashCode2, c0626q2, c0146e4, c0626q2, c0144d);
                        T.r.G(c0626q2, c8, c0146e5);
                        Q.A0.a(Y3.C.L(R.drawable.ic_sort, 0, c0626q2), h5.e.j0(R.string.chat_menu, c0626q2), null, R1.r(c0626q2).f5427q, c0626q2, 8, 4);
                        c0626q2.p(true);
                        InterfaceC1041r f17 = AbstractC1464z.f(l0.h.c(v.t0.d(v.t0.o(S.l.f7374V, f15, 1, c1038o), f10), C.e.a(26)), R1.r(c0626q2).f5431u, o0.y.f13496b);
                        InterfaceC1193a interfaceC1193a5 = interfaceC1193a3;
                        boolean f18 = c0626q2.f(interfaceC1193a5);
                        Object P6 = c0626q2.P();
                        if (f18 || P6 == c0602e) {
                            P6 = new C0348d(5, interfaceC1193a5);
                            c0626q2.m0(P6);
                        }
                        InterfaceC1041r A6 = AbstractC1787b.A(f11, S.l.f7374V, 2, AbstractC1992b.a(31, f17, (InterfaceC1193a) P6, false));
                        v.p0 a8 = v.o0.a(AbstractC1799h.a, c1032i, c0626q2, 48);
                        int hashCode3 = Long.hashCode(c0626q2.f8164T);
                        InterfaceC0617l0 l6 = c0626q2.l();
                        InterfaceC1041r c9 = AbstractC1024a.c(c0626q2, A6);
                        c0626q2.f0();
                        if (c0626q2.f8163S) {
                            c0626q2.k(c0148f);
                        } else {
                            c0626q2.p0();
                        }
                        T.r.G(c0626q2, a8, c0146e2);
                        T.r.G(c0626q2, l6, c0146e3);
                        AbstractC1135a.n(hashCode3, c0626q2, c0146e4, c0626q2, c0144d);
                        T.r.G(c0626q2, c9, c0146e5);
                        boolean z7 = z5;
                        boolean z8 = z7 && !z6;
                        if (z8) {
                            str2 = B3.e.j(c0626q2, 563632320, R.string.model_selection_loading, c0626q2, false);
                        } else {
                            c0626q2.b0(563732419);
                            c0626q2.p(false);
                            str2 = str;
                        }
                        String str3 = str2;
                        if (1.0f <= 0.0d) {
                            AbstractC1829a.a("invalid weight; must be greater than zero");
                        }
                        v.Z z9 = new v.Z(1.0f, false);
                        W0.k kVar = W0.k.f8835i;
                        if (z8) {
                            c0626q2.b0(563961478);
                            c0146e = c0146e3;
                            j3 = R1.r(c0626q2).f5429s;
                            c0626q2.p(false);
                        } else {
                            c0146e = c0146e3;
                            c0626q2.b0(564056493);
                            j3 = R1.r(c0626q2).f5427q;
                            c0626q2.p(false);
                        }
                        C.d dVar3 = dVar;
                        C0146e c0146e6 = c0146e;
                        f3.b(str3, z9, j3, 0L, kVar, 0L, null, 0L, 2, false, 1, 0, null, c0626q2, 1572864, 24960, 241592);
                        C0626q c0626q3 = c0626q2;
                        AbstractC1787b.h(c0626q3, v.t0.n(c1038o, 4));
                        if (z7) {
                            c0626q3.b0(564345816);
                            M1.a(v.t0.j(c1038o, 16), R1.r(c0626q3).f5429s, f12, 0L, 0, S.l.f7374V, c0626q3, 390, 56);
                            c0626q3 = c0626q3;
                            c0626q3.p(false);
                        } else {
                            c0626q3.b0(564615051);
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q3), h5.e.j0(R.string.chat_dropdown_arrow, c0626q3), null, R1.r(c0626q3).f5427q, c0626q3, 8, 4);
                            c0626q3.p(false);
                        }
                        c0626q3.p(true);
                        InterfaceC1041r c10 = l0.h.c(AbstractC1464z.f(v.t0.j(c1038o, f10), R1.r(c0626q3).f5431u, dVar3), dVar3);
                        InterfaceC1193a interfaceC1193a6 = interfaceC1193a2;
                        boolean f19 = c0626q3.f(interfaceC1193a6);
                        Object P7 = c0626q3.P();
                        if (f19 || P7 == c0602e) {
                            P7 = new C0348d(6, interfaceC1193a6);
                            c0626q3.m0(P7);
                        }
                        InterfaceC1041r a9 = AbstractC1992b.a(31, c10, (InterfaceC1193a) P7, false);
                        F0.V d7 = AbstractC1806l.d(c1033j, false);
                        int hashCode4 = Long.hashCode(c0626q3.f8164T);
                        InterfaceC0617l0 l7 = c0626q3.l();
                        InterfaceC1041r c11 = AbstractC1024a.c(c0626q3, a9);
                        c0626q3.f0();
                        if (c0626q3.f8163S) {
                            c0626q3.k(c0148f);
                        } else {
                            c0626q3.p0();
                        }
                        T.r.G(c0626q3, d7, c0146e2);
                        T.r.G(c0626q3, l7, c0146e6);
                        AbstractC1135a.n(hashCode4, c0626q3, c0146e4, c0626q3, c0144d);
                        T.r.G(c0626q3, c11, c0146e5);
                        Q.A0.a(Y3.C.L(R.drawable.cuida_edit_outline, 0, c0626q3), null, null, R1.r(c0626q3).f5427q, c0626q3, 56, 4);
                        c0626q3.p(true);
                        c0626q3.p(true);
                    } else {
                        c0626q2.V();
                    }
                    return X3.y.a;
                }
            }, c0626q), c0626q, 3072, 6);
        } else {
            interfaceC1041r2 = interfaceC1041r;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            final InterfaceC1041r interfaceC1041r3 = interfaceC1041r2;
            t5.f8193d = new l4.e(str, z5, z6, interfaceC1193a, interfaceC1193a2, interfaceC1193a3, f6, f7, interfaceC1041r3, i6) { // from class: P2.H0

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f4730c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f4731e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f4732f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f4733g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f4734h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f4735i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ float f4736j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ float f4737k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f4738l;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(113246209);
                    V.l(this.f4730c, this.f4731e, this.f4732f, this.f4733g, this.f4734h, this.f4735i, this.f4736j, this.f4737k, this.f4738l, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void m(final boolean z5, final float f6, final InterfaceC1193a interfaceC1193a, final InterfaceC1041r interfaceC1041r, C0626q c0626q, final int i6) {
        AbstractC1276k.f(interfaceC1193a, "onClick");
        c0626q.d0(350867767);
        int i7 = i6 | (c0626q.g(z5) ? 4 : 2) | (c0626q.c(f6) ? 32 : 16) | (c0626q.h(interfaceC1193a) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.f(interfaceC1041r) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            C1210Q a6 = AbstractC1205L.b(AbstractC1318d.s(120, 6, null), 2).a(new C1210Q(new m.d0((C1212T) null, (m.b0) null, (C1197D) null, new C1217Y(0.85f, o0.O.f13454b, AbstractC1318d.r(0.75f, 260.0f, null, 4)), (LinkedHashMap) null, 119)));
            C1327h0 r5 = AbstractC1318d.r(0.85f, 240.0f, null, 4);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = new D0(0);
                c0626q.m0(P5);
            }
            C1210Q a7 = a6.a(new C1210Q(new m.d0((C1212T) null, new m.b0(new C1204K((l4.c) P5, 0), r5), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125)));
            C1211S a8 = AbstractC1205L.c(AbstractC1318d.s(100, 6, null), 2).a(new C1211S(new m.d0((C1212T) null, (m.b0) null, (C1197D) null, new C1217Y(0.92f, o0.O.f13454b, AbstractC1318d.s(100, 6, null)), (LinkedHashMap) null, 119)));
            n.D0 s5 = AbstractC1318d.s(120, 6, null);
            Object P6 = c0626q.P();
            if (P6 == c0602e) {
                P6 = new D0(1);
                c0626q.m0(P6);
            }
            AbstractC1244z.c(z5, AbstractC1787b.C(interfaceC1041r, S.l.f7374V, S.l.f7374V, S.l.f7374V, f6 + 8, 7), a7, a8.a(new C1211S(new m.d0((C1212T) null, new m.b0(new C1204K((l4.c) P6, 2), s5), (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 125))), null, AbstractC0874g.c(430469135, new E0(0, interfaceC1193a), c0626q), c0626q, (i7 & 14) | PegdownExtensions.SUPPRESS_ALL_HTML, 16);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(z5, f6, interfaceC1193a, interfaceC1041r, i6) { // from class: P2.F0

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f4688c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f4689e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f4690f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f4691g;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(1);
                    V.m(this.f4688c, this.f4689e, this.f4690f, this.f4691g, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r1 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(com.bot.core.model.MessageAttachment r28, T.C0626q r29, int r30) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.V.n(com.bot.core.model.MessageAttachment, T.q, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    public static final void o(L2.c cVar, C0626q c0626q, int i6) {
        int i7;
        C1033j c1033j;
        int i8;
        C1038o c1038o;
        C1033j c1033j2;
        boolean z5;
        ?? r15;
        C1031h c1031h = C1026c.f11800r;
        C1033j c1033j3 = C1026c.f11791i;
        AbstractC1276k.f(cVar, "message");
        List<MessageAttachment> list = cVar.f3061e;
        List list2 = cVar.f3060d;
        c0626q.d0(2066292767);
        int i9 = i6 | (c0626q.f(cVar) ? 4 : 2);
        if (c0626q.S(i9 & 1, (i9 & 3) != 2)) {
            C0889e c0889e = (C0889e) c0626q.j(AbstractC0897m.a);
            boolean isEmpty = list.isEmpty();
            C1038o c1038o2 = C1038o.a;
            if (isEmpty) {
                i7 = i9;
                c1033j = c1033j3;
                i8 = 1454243907;
                c0626q.b0(1454243907);
                c0626q.p(false);
            } else {
                c0626q.b0(1456727968);
                InterfaceC1041r z6 = AbstractC1787b.z(v.t0.a, 12, 2);
                F0.V d6 = AbstractC1806l.d(c1033j3, false);
                int hashCode = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l3 = c0626q.l();
                InterfaceC1041r c6 = AbstractC1024a.c(c0626q, z6);
                InterfaceC0152h.a.getClass();
                C0148f c0148f = C0150g.f1924b;
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f);
                } else {
                    c0626q.p0();
                }
                C0146e c0146e = C0150g.f1928f;
                T.r.G(c0626q, d6, c0146e);
                C0146e c0146e2 = C0150g.f1927e;
                T.r.G(c0626q, l3, c0146e2);
                Integer valueOf = Integer.valueOf(hashCode);
                C0146e c0146e3 = C0150g.f1929g;
                T.r.x(c0626q, valueOf, c0146e3);
                C0144d c0144d = C0150g.f1930h;
                T.r.C(c0626q, c0144d);
                i7 = i9;
                C0146e c0146e4 = C0150g.f1926d;
                T.r.G(c0626q, c6, c0146e4);
                float f6 = 6;
                InterfaceC1041r y5 = AbstractC1787b.y(c1038o2, f6);
                C1813t a6 = AbstractC1812s.a(AbstractC1799h.g(f6), c1031h, c0626q, 54);
                c1033j = c1033j3;
                int hashCode2 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l5 = c0626q.l();
                InterfaceC1041r c7 = AbstractC1024a.c(c0626q, y5);
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f);
                } else {
                    c0626q.p0();
                }
                T.r.G(c0626q, a6, c0146e);
                T.r.G(c0626q, l5, c0146e2);
                AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
                T.r.G(c0626q, c7, c0146e4);
                c0626q.b0(-1353033643);
                for (MessageAttachment messageAttachment : list) {
                    MessageAttachment.Companion companion = MessageAttachment.Companion;
                    n(messageAttachment, c0626q, 8);
                }
                c0626q.p(false);
                c0626q.p(true);
                c0626q.p(true);
                c0626q.p(false);
                i8 = 1454243907;
            }
            if (list2.isEmpty()) {
                c1038o = c1038o2;
                c1033j2 = c1033j;
                z5 = true;
                r15 = 0;
                c0626q.b0(i8);
            } else {
                c0626q.b0(1457483128);
                boolean f7 = c0626q.f(list2);
                Object P5 = c0626q.P();
                Object obj = C0616l.a;
                if (f7 || P5 == obj) {
                    c0626q.m0(list2);
                } else {
                    list2 = P5;
                }
                List list3 = list2;
                InterfaceC1041r z7 = AbstractC1787b.z(v.t0.a, 12, 2);
                c1033j2 = c1033j;
                F0.V d7 = AbstractC1806l.d(c1033j2, false);
                int hashCode3 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l6 = c0626q.l();
                InterfaceC1041r c8 = AbstractC1024a.c(c0626q, z7);
                InterfaceC0152h.a.getClass();
                C0148f c0148f2 = C0150g.f1924b;
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f2);
                } else {
                    c0626q.p0();
                }
                T.r.G(c0626q, d7, C0150g.f1928f);
                T.r.G(c0626q, l6, C0150g.f1927e);
                T.r.x(c0626q, Integer.valueOf(hashCode3), C0150g.f1929g);
                T.r.C(c0626q, C0150g.f1930h);
                T.r.G(c0626q, c8, C0150g.f1926d);
                InterfaceC1041r y6 = AbstractC1787b.y(c1038o2, 6);
                C1810p c1810p = AbstractC1799h.a;
                z5 = true;
                C1795f c1795f = new C1795f(8, true, new C0789z(18));
                boolean f8 = ((i7 & 14) == 4) | c0626q.f(c0889e) | c0626q.h(list3);
                Object P6 = c0626q.P();
                if (f8 || P6 == obj) {
                    P6 = new C0091s(cVar, c0889e, list3, 11);
                    c0626q.m0(P6);
                }
                c1038o = c1038o2;
                r15 = 0;
                AbstractC1118b.b(y6, null, null, c1795f, null, null, false, null, (l4.c) P6, c0626q, 24582, 494);
                c0626q.p(true);
            }
            c0626q.p(r15);
            if (AbstractC1776n.Q(cVar.f3059c)) {
                c0626q.b0(1454243907);
            } else {
                c0626q.b0(1462522178);
                InterfaceC1041r z8 = AbstractC1787b.z(v.t0.a, 12, 2);
                F0.V d8 = AbstractC1806l.d(c1033j2, r15);
                int hashCode4 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l7 = c0626q.l();
                InterfaceC1041r c9 = AbstractC1024a.c(c0626q, z8);
                InterfaceC0152h.a.getClass();
                C0148f c0148f3 = C0150g.f1924b;
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f3);
                } else {
                    c0626q.p0();
                }
                C0146e c0146e5 = C0150g.f1928f;
                T.r.G(c0626q, d8, c0146e5);
                C0146e c0146e6 = C0150g.f1927e;
                T.r.G(c0626q, l7, c0146e6);
                Integer valueOf2 = Integer.valueOf(hashCode4);
                C0146e c0146e7 = C0150g.f1929g;
                T.r.x(c0626q, valueOf2, c0146e7);
                C0144d c0144d2 = C0150g.f1930h;
                T.r.C(c0626q, c0144d2);
                C0146e c0146e8 = C0150g.f1926d;
                T.r.G(c0626q, c9, c0146e8);
                float f9 = 20;
                InterfaceC1041r z9 = AbstractC1787b.z(AbstractC1464z.f(l0.h.k(c1038o, (float) r15, C.e.b(f9, f9, 6, f9), 28), ((Q.N) c0626q.j(Q.O.a)).f5407c, C.e.a(f9)), 16, 10);
                F0.V d9 = AbstractC1806l.d(C1026c.f11786c, r15);
                int hashCode5 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l8 = c0626q.l();
                InterfaceC1041r c10 = AbstractC1024a.c(c0626q, z9);
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(c0148f3);
                } else {
                    c0626q.p0();
                }
                T.r.G(c0626q, d9, c0146e5);
                T.r.G(c0626q, l8, c0146e6);
                AbstractC1135a.n(hashCode5, c0626q, c0146e7, c0626q, c0144d2);
                T.r.G(c0626q, c10, c0146e8);
                AbstractC0336u0.c(null, AbstractC0874g.c(-113628515, new C0342a(cVar), c0626q), c0626q, 48);
                c0626q.p(z5);
                c0626q.p(z5);
            }
            c0626q.p(r15);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0342a(cVar, i6, 3);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(4:23|(3:27|28|(1:30))|18|19)|12|(1:16)|18|19))|35|6|7|(0)(0)|12|(2:14|16)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r7 >= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        r4 = Y3.m.K0(((X2.C0694i) r5.f9216q.f201c.getValue()).a);
        r4.set(r7, L2.b.a((L2.b) r4.get(r7), null, true, 3));
        r5.q(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(android.content.Context r4, X2.L r5, android.net.Uri r6, int r7, d4.c r8) {
        /*
            boolean r0 = r8 instanceof P2.C0368n
            if (r0 == 0) goto L13
            r0 = r8
            P2.n r0 = (P2.C0368n) r0
            int r1 = r0.f4995j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4995j = r1
            goto L18
        L13:
            P2.n r0 = new P2.n
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4994i
            int r1 = r0.f4995j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            int r7 = r0.f4993h
            X2.L r5 = r0.f4992g
            X3.a.e(r8)     // Catch: java.lang.Exception -> L99
            goto L61
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            X3.a.e(r8)
            if (r7 < 0) goto Lce
            A4.Q r8 = r5.f9216q
            A4.g0 r8 = r8.f201c
            java.lang.Object r8 = r8.getValue()
            X2.i r8 = (X2.C0694i) r8
            java.util.List r8 = r8.a
            int r8 = r8.size()
            if (r7 >= r8) goto Lce
            r0.f4992g = r5     // Catch: java.lang.Exception -> L99
            r0.f4993h = r7     // Catch: java.lang.Exception -> L99
            r0.f4995j = r2     // Catch: java.lang.Exception -> L99
            E4.e r8 = x4.AbstractC1898K.a     // Catch: java.lang.Exception -> L99
            E4.d r8 = E4.d.f1360f     // Catch: java.lang.Exception -> L99
            P2.o r1 = new P2.o     // Catch: java.lang.Exception -> L99
            r1.<init>(r4, r6, r3)     // Catch: java.lang.Exception -> L99
            java.lang.Object r8 = x4.AbstractC1888A.H(r8, r1, r0)     // Catch: java.lang.Exception -> L99
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r8 != r4) goto L61
            return r4
        L61:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L99
            if (r7 < 0) goto Lce
            A4.Q r4 = r5.f9216q     // Catch: java.lang.Exception -> L99
            A4.g0 r4 = r4.f201c     // Catch: java.lang.Exception -> L99
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L99
            X2.i r4 = (X2.C0694i) r4     // Catch: java.lang.Exception -> L99
            java.util.List r4 = r4.a     // Catch: java.lang.Exception -> L99
            int r4 = r4.size()     // Catch: java.lang.Exception -> L99
            if (r7 >= r4) goto Lce
            A4.Q r4 = r5.f9216q     // Catch: java.lang.Exception -> L99
            A4.g0 r4 = r4.f201c     // Catch: java.lang.Exception -> L99
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L99
            X2.i r4 = (X2.C0694i) r4     // Catch: java.lang.Exception -> L99
            java.util.List r4 = r4.a     // Catch: java.lang.Exception -> L99
            java.util.ArrayList r4 = Y3.m.K0(r4)     // Catch: java.lang.Exception -> L99
            java.lang.Object r6 = r4.get(r7)     // Catch: java.lang.Exception -> L99
            L2.b r6 = (L2.b) r6     // Catch: java.lang.Exception -> L99
            r0 = 0
            L2.b r6 = L2.b.a(r6, r8, r0, r2)     // Catch: java.lang.Exception -> L99
            r4.set(r7, r6)     // Catch: java.lang.Exception -> L99
            r5.q(r4)     // Catch: java.lang.Exception -> L99
            goto Lce
        L99:
            if (r7 < 0) goto Lce
            A4.Q r4 = r5.f9216q
            A4.g0 r4 = r4.f201c
            java.lang.Object r4 = r4.getValue()
            X2.i r4 = (X2.C0694i) r4
            java.util.List r4 = r4.a
            int r4 = r4.size()
            if (r7 >= r4) goto Lce
            A4.Q r4 = r5.f9216q
            A4.g0 r4 = r4.f201c
            java.lang.Object r4 = r4.getValue()
            X2.i r4 = (X2.C0694i) r4
            java.util.List r4 = r4.a
            java.util.ArrayList r4 = Y3.m.K0(r4)
            java.lang.Object r6 = r4.get(r7)
            L2.b r6 = (L2.b) r6
            r8 = 3
            L2.b r6 = L2.b.a(r6, r3, r2, r8)
            r4.set(r7, r6)
            r5.q(r4)
        Lce:
            X3.y r4 = X3.y.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.V.p(android.content.Context, X2.L, android.net.Uri, int, d4.c):java.lang.Object");
    }

    public static final void q(Context context, X2.L l3, InterfaceC1942y interfaceC1942y, List list) {
        AbstractC1276k.f(context, "context");
        AbstractC1276k.f(l3, "chatViewModel");
        AbstractC1276k.f(list, "uris");
        if (list.isEmpty()) {
            return;
        }
        List list2 = ((C0694i) l3.f9216q.f201c.getValue()).a;
        int size = list2.size();
        ArrayList arrayList = new ArrayList(Y3.n.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new L2.b((Uri) it.next(), null, true, false));
        }
        l3.q(Y3.m.z0(list2, arrayList));
        AbstractC1888A.y(interfaceC1942y, null, new C0366m(list, context, l3, size, null), 3);
    }

    public static final String r(Context context, Uri uri) {
        Uri uri2;
        if (AbstractC1276k.b(uri.getScheme(), "content")) {
            uri2 = uri;
            Cursor query = context.getContentResolver().query(uri2, null, null, null, null);
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex("_display_name");
                    if (query.moveToFirst() && columnIndex >= 0) {
                        String string = query.getString(columnIndex);
                        query.close();
                        return string;
                    }
                    query.close();
                } finally {
                }
            }
        } else {
            uri2 = uri;
            if (AbstractC1276k.b(uri2.getScheme(), "file")) {
                String path = uri2.getPath();
                File file = path != null ? new File(path) : null;
                if (file != null) {
                    return file.getName();
                }
                return null;
            }
        }
        return uri2.getLastPathSegment();
    }

    public static final C0345b0 s(long j3, C0626q c0626q) {
        boolean z5 = o0.y.t(((Q.N) c0626q.j(Q.O.a)).f5424n) < 0.5f;
        long c6 = o0.s.c(z5 ? 0.24f : 0.18f, j3);
        if (z5) {
            j3 = o0.s.c(0.95f, j3);
        }
        return new C0345b0(c6, j3);
    }
}
