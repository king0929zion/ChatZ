package Z2;

import D.C0062d;
import D.C0064e;
import D.C0069g0;
import D.C0072i;
import D.C0086p;
import D.C0091s;
import D.C0096u0;
import D.C0103y;
import F0.AbstractC0137z;
import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.C0162q;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import I0.C0172a0;
import O.C0298b;
import O.C0310h;
import P2.C0343a0;
import P2.C0348d;
import P2.C0355g0;
import Q.AbstractC0451p0;
import Q.C0415g0;
import Q.C0443n0;
import Q.C0483x1;
import Q.D1;
import Q.L2;
import Q.R1;
import Q.a3;
import Q.b3;
import Q.f3;
import Q.t3;
import Q.u3;
import R2.C0522b;
import R2.C0524d;
import R2.C0525e;
import R2.C0533m;
import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.C0638w0;
import T.InterfaceC0617l0;
import Y2.EnumC0731u;
import a3.C0808F;
import a3.C0810H;
import a3.C0811I;
import a3.C0818g;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import b0.C0873f;
import b3.AbstractC0902r;
import com.bot.core.model.LLMProvider;
import com.bot.core.model.LLMSetting;
import com.bot.core.model.McpHeader;
import com.bot.core.model.McpServer;
import com.bot.core.model.McpTool;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import f0.AbstractC0997t;
import f0.C0996s;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1032i;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1041r;
import i1.AbstractC1087g;
import i4.AbstractC1118b;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlinx.serialization.json.JsonNull;
import l4.InterfaceC1193a;
import m.AbstractC1205L;
import m.AbstractC1244z;
import m.C1210Q;
import m.C1211S;
import m0.AbstractC1249d;
import m4.AbstractC1276k;
import m4.C1274i;
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
import x4.InterfaceC1942y;
import y2.AbstractC1992b;

/* renamed from: Z2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0783w {

    /* renamed from: A, reason: collision with root package name */
    public static final C0873f f10382A;

    /* renamed from: C, reason: collision with root package name */
    public static final C0873f f10384C;

    /* renamed from: D, reason: collision with root package name */
    public static final C0873f f10385D;

    /* renamed from: E, reason: collision with root package name */
    public static final C0873f f10386E;

    /* renamed from: I, reason: collision with root package name */
    public static final C0873f f10390I;

    /* renamed from: J, reason: collision with root package name */
    public static final C0873f f10391J;

    /* renamed from: K, reason: collision with root package name */
    public static final C0873f f10392K;

    /* renamed from: L, reason: collision with root package name */
    public static final C0873f f10393L;

    /* renamed from: M, reason: collision with root package name */
    public static final C0873f f10394M;

    /* renamed from: N, reason: collision with root package name */
    public static final C0873f f10395N;

    /* renamed from: O, reason: collision with root package name */
    public static final C0873f f10396O;

    /* renamed from: P, reason: collision with root package name */
    public static final C0873f f10397P;

    /* renamed from: Q, reason: collision with root package name */
    public static final C0873f f10398Q;

    /* renamed from: R, reason: collision with root package name */
    public static final C0873f f10399R;

    /* renamed from: S, reason: collision with root package name */
    public static final C0873f f10400S;

    /* renamed from: T, reason: collision with root package name */
    public static final C0873f f10401T;

    /* renamed from: U, reason: collision with root package name */
    public static final C0873f f10402U;

    /* renamed from: h, reason: collision with root package name */
    public static final C0873f f10421h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0873f f10423i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0873f f10425j;

    /* renamed from: l, reason: collision with root package name */
    public static final C0873f f10429l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0873f f10431m;

    /* renamed from: o, reason: collision with root package name */
    public static final C0873f f10435o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0873f f10437p;

    /* renamed from: t, reason: collision with root package name */
    public static final C0873f f10443t;

    /* renamed from: v, reason: collision with root package name */
    public static final C0873f f10445v;

    /* renamed from: w, reason: collision with root package name */
    public static final C0873f f10446w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0873f f10447x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0873f f10448y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0873f f10449z;
    public static final C0873f a = new C0873f(new C0064e(17), false, -2070207383);

    /* renamed from: b, reason: collision with root package name */
    public static final C0873f f10409b = new C0873f(new C0064e(18), false, 1770758674);

    /* renamed from: c, reason: collision with root package name */
    public static final C0873f f10411c = new C0873f(new C0064e(19), false, 490447084);

    /* renamed from: d, reason: collision with root package name */
    public static final C0873f f10413d = new C0873f(new C0064e(20), false, 1923289205);

    /* renamed from: e, reason: collision with root package name */
    public static final C0873f f10415e = new C0873f(new C0064e(21), false, 1382859699);

    /* renamed from: f, reason: collision with root package name */
    public static final C0873f f10417f = new C0873f(new S0.A(28), false, 1747576654);

    /* renamed from: g, reason: collision with root package name */
    public static final C0873f f10419g = new C0873f(new S0.A(29), false, -670121747);

    /* renamed from: k, reason: collision with root package name */
    public static final C0873f f10427k = new C0873f(new C0064e(22), false, 913115591);

    /* renamed from: n, reason: collision with root package name */
    public static final C0873f f10433n = new C0873f(new C0064e(23), false, 808386955);

    /* renamed from: q, reason: collision with root package name */
    public static final C0873f f10439q = new C0873f(new C0064e(24), false, 941746018);

    /* renamed from: r, reason: collision with root package name */
    public static final C0873f f10441r = new C0873f(new C0064e(25), false, 1235787014);

    /* renamed from: s, reason: collision with root package name */
    public static final C0873f f10442s = new C0873f(new C0064e(26), false, 1079806472);

    /* renamed from: u, reason: collision with root package name */
    public static final C0873f f10444u = new C0873f(new C0064e(27), false, -417299988);

    /* renamed from: B, reason: collision with root package name */
    public static final C0873f f10383B = new C0873f(new C0064e(28), false, 1420064522);

    /* renamed from: F, reason: collision with root package name */
    public static final C0873f f10387F = new C0873f(new C0064e(29), false, 941654877);

    /* renamed from: G, reason: collision with root package name */
    public static final C0873f f10388G = new C0873f(new C0787y(0), false, -1097808610);

    /* renamed from: H, reason: collision with root package name */
    public static final C0873f f10389H = new C0873f(new C0787y(1), false, 459766758);

    /* renamed from: V, reason: collision with root package name */
    public static final C0873f f10403V = new C0873f(new C0787y(2), false, -1585375235);

    /* renamed from: W, reason: collision with root package name */
    public static final C0873f f10404W = new C0873f(new C0787y(3), false, -1107017382);

    /* renamed from: X, reason: collision with root package name */
    public static final C0873f f10405X = new C0873f(new C0787y(4), false, -929010361);

    /* renamed from: Y, reason: collision with root package name */
    public static final C0873f f10406Y = new C0873f(new C0789z(0), false, 1451174028);

    /* renamed from: Z, reason: collision with root package name */
    public static final C0873f f10407Z = new C0873f(new C0789z(1), false, 20654223);

    /* renamed from: a0, reason: collision with root package name */
    public static final C0873f f10408a0 = new C0873f(new C0789z(2), false, 1333802448);

    /* renamed from: b0, reason: collision with root package name */
    public static final C0873f f10410b0 = new C0873f(new C0789z(3), false, -2090343249);

    /* renamed from: c0, reason: collision with root package name */
    public static final C0873f f10412c0 = new C0873f(new C0789z(4), false, -1846382288);

    /* renamed from: d0, reason: collision with root package name */
    public static final C0873f f10414d0 = new C0873f(new C0787y(5), false, -369171354);

    /* renamed from: e0, reason: collision with root package name */
    public static final C0873f f10416e0 = new C0873f(new C0787y(6), false, -1876928115);

    /* renamed from: f0, reason: collision with root package name */
    public static final C0873f f10418f0 = new C0873f(new C0787y(7), false, -661790984);

    /* renamed from: g0, reason: collision with root package name */
    public static final C0873f f10420g0 = new C0873f(new C0789z(5), false, 891295815);

    /* renamed from: h0, reason: collision with root package name */
    public static final C0873f f10422h0 = new C0873f(new C0789z(6), false, 567287432);

    /* renamed from: i0, reason: collision with root package name */
    public static final C0873f f10424i0 = new C0873f(new C0789z(7), false, 1437688456);

    /* renamed from: j0, reason: collision with root package name */
    public static final C0873f f10426j0 = new C0873f(new C0789z(8), false, 1113680073);

    /* renamed from: k0, reason: collision with root package name */
    public static final C0873f f10428k0 = new C0873f(new C0789z(9), false, 1984081097);

    /* renamed from: l0, reason: collision with root package name */
    public static final C0873f f10430l0 = new C0873f(new C0789z(10), false, 1660072714);

    /* renamed from: m0, reason: collision with root package name */
    public static final C0873f f10432m0 = new C0873f(new C0787y(8), false, 1572532749);

    /* renamed from: n0, reason: collision with root package name */
    public static final C0873f f10434n0 = new C0873f(new C0787y(9), false, -1143928363);

    /* renamed from: o0, reason: collision with root package name */
    public static final C0873f f10436o0 = new C0873f(new C0787y(10), false, 1052294931);

    /* renamed from: p0, reason: collision with root package name */
    public static final C0873f f10438p0 = new C0873f(new C0787y(11), false, 1328590996);

    /* renamed from: q0, reason: collision with root package name */
    public static final C0873f f10440q0 = new C0873f(new C0787y(12), false, -1562582901);

    static {
        final int i6 = 0;
        f10421h = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -399548719);
        final int i7 = 1;
        f10423i = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -1099615089);
        final int i8 = 2;
        f10425j = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i8) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 122987536);
        final int i9 = 3;
        f10429l = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -1801584270);
        final int i10 = 4;
        f10431m = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -594913381);
        final int i11 = 5;
        f10435o = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -1579650730);
        final int i12 = 6;
        f10437p = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 583651479);
        final int i13 = 7;
        f10443t = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -1125185779);
        final int i14 = 8;
        f10445v = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -574929021);
        final int i15 = 9;
        f10446w = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i15) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -1579423046);
        final int i16 = 10;
        f10447x = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i16) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 1239641969);
        final int i17 = 11;
        f10448y = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i17) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -507375822);
        final int i18 = 12;
        f10449z = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i18) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 2040573683);
        final int i19 = 13;
        f10382A = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i19) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 293555892);
        final int i20 = 14;
        f10384C = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i20) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 1484395167);
        final int i21 = 15;
        f10385D = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i21) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 800164862);
        final int i22 = 16;
        f10386E = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i22) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -568295748);
        final int i23 = 29;
        f10390I = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i23) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 1958142054);
        final int i24 = 17;
        f10391J = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i24) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -1407665147);
        final int i25 = 18;
        f10392K = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i25) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 2028205409);
        final int i26 = 19;
        f10393L = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i26) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -1600608845);
        final int i27 = 20;
        f10394M = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i27) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -537420236);
        final int i28 = 21;
        f10395N = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i28) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -140272865);
        final int i29 = 22;
        f10396O = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i29) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -570619138);
        final int i30 = 23;
        f10397P = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i30) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 1469834518);
        final int i31 = 24;
        f10398Q = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i31) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 223926581);
        final int i32 = 25;
        f10399R = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i32) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 922915744);
        final int i33 = 26;
        f10400S = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i33) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -1723311209);
        final int i34 = 27;
        f10401T = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i34) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, 2000780217);
        final int i35 = 28;
        f10402U = new C0873f(new l4.e() { // from class: Z2.x
            @Override // l4.e
            public final Object m(Object obj, Object obj2) {
                switch (i35) {
                    case 0:
                        C0626q c0626q = (C0626q) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_name_label, c0626q), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q, 0, 0, 262142);
                        } else {
                            c0626q.V();
                        }
                        return X3.y.a;
                    case 1:
                        C0626q c0626q2 = (C0626q) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_label, c0626q2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q2, 0, 0, 262142);
                        } else {
                            c0626q2.V();
                        }
                        return X3.y.a;
                    case 2:
                        C0626q c0626q3 = (C0626q) obj;
                        int intValue3 = ((Integer) obj2).intValue();
                        if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_server_address_placeholder, c0626q3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                        } else {
                            c0626q3.V();
                        }
                        return X3.y.a;
                    case 3:
                        C0626q c0626q4 = (C0626q) obj;
                        int intValue4 = ((Integer) obj2).intValue();
                        if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_key_label, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                        } else {
                            c0626q4.V();
                        }
                        return X3.y.a;
                    case 4:
                        C0626q c0626q5 = (C0626q) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        if (c0626q5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_header_value_label, c0626q5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q5, 0, 0, 262142);
                        } else {
                            c0626q5.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15290g /* 5 */:
                        C0626q c0626q6 = (C0626q) obj;
                        int intValue6 = ((Integer) obj2).intValue();
                        if (c0626q6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_label, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                        } else {
                            c0626q6.V();
                        }
                        return X3.y.a;
                    case 6:
                        C0626q c0626q7 = (C0626q) obj;
                        int intValue7 = ((Integer) obj2).intValue();
                        if (c0626q7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_transport_placeholder, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                        } else {
                            c0626q7.V();
                        }
                        return X3.y.a;
                    case 7:
                        C0626q c0626q8 = (C0626q) obj;
                        int intValue8 = ((Integer) obj2).intValue();
                        if (c0626q8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.mcp_delete_title, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                        } else {
                            c0626q8.V();
                        }
                        return X3.y.a;
                    case 8:
                        C0626q c0626q9 = (C0626q) obj;
                        int intValue9 = ((Integer) obj2).intValue();
                        if (c0626q9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_bot_name, c0626q9), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q9, 0, 0, 262142);
                        } else {
                            c0626q9.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15287d /* 9 */:
                        C0626q c0626q10 = (C0626q) obj;
                        int intValue10 = ((Integer) obj2).intValue();
                        if (c0626q10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_prompt, c0626q10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q10, 0, 0, 262142);
                        } else {
                            c0626q10.V();
                        }
                        return X3.y.a;
                    case AbstractC1787b.f15289f /* 10 */:
                        C0626q c0626q11 = (C0626q) obj;
                        int intValue11 = ((Integer) obj2).intValue();
                        if (c0626q11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_max_output_tokens, c0626q11), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q11, 0, 0, 262142);
                        } else {
                            c0626q11.V();
                        }
                        return X3.y.a;
                    case 11:
                        C0626q c0626q12 = (C0626q) obj;
                        int intValue12 = ((Integer) obj2).intValue();
                        if (c0626q12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_reasoning_budget, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                        } else {
                            c0626q12.V();
                        }
                        return X3.y.a;
                    case 12:
                        C0626q c0626q13 = (C0626q) obj;
                        int intValue13 = ((Integer) obj2).intValue();
                        if (c0626q13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_headers, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                        } else {
                            c0626q13.V();
                        }
                        return X3.y.a;
                    case 13:
                        C0626q c0626q14 = (C0626q) obj;
                        int intValue14 = ((Integer) obj2).intValue();
                        if (c0626q14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_custom_body, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                        } else {
                            c0626q14.V();
                        }
                        return X3.y.a;
                    case 14:
                        C0626q c0626q15 = (C0626q) obj;
                        int intValue15 = ((Integer) obj2).intValue();
                        if (c0626q15.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model, c0626q15), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q15, 0, 0, 262142);
                        } else {
                            c0626q15.V();
                        }
                        return X3.y.a;
                    case 15:
                        C0626q c0626q16 = (C0626q) obj;
                        int intValue16 = ((Integer) obj2).intValue();
                        if (c0626q16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_config_default_model_empty, c0626q16), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q16, 0, 0, 262142);
                        } else {
                            c0626q16.V();
                        }
                        return X3.y.a;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        C0626q c0626q17 = (C0626q) obj;
                        int intValue17 = ((Integer) obj2).intValue();
                        if (c0626q17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.outline_keyboard_arrow_down_24, 0, c0626q17), null, null, 0L, c0626q17, 56, 12);
                        } else {
                            c0626q17.V();
                        }
                        return X3.y.a;
                    case 17:
                        C0626q c0626q18 = (C0626q) obj;
                        int intValue18 = ((Integer) obj2).intValue();
                        if (c0626q18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_placeholder, c0626q18), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q18, 0, 0, 262142);
                        } else {
                            c0626q18.V();
                        }
                        return X3.y.a;
                    case 18:
                        C0626q c0626q19 = (C0626q) obj;
                        int intValue19 = ((Integer) obj2).intValue();
                        if (c0626q19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_api_schema_label, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                        } else {
                            c0626q19.V();
                        }
                        return X3.y.a;
                    case 19:
                        C0626q c0626q20 = (C0626q) obj;
                        int intValue20 = ((Integer) obj2).intValue();
                        if (c0626q20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_openai_mode_label, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                        } else {
                            c0626q20.V();
                        }
                        return X3.y.a;
                    case 20:
                        C0626q c0626q21 = (C0626q) obj;
                        int intValue21 = ((Integer) obj2).intValue();
                        if (c0626q21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_mode_label, c0626q21), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262142);
                        } else {
                            c0626q21.V();
                        }
                        return X3.y.a;
                    case 21:
                        C0626q c0626q22 = (C0626q) obj;
                        int intValue22 = ((Integer) obj2).intValue();
                        if (c0626q22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_label, c0626q22), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262142);
                        } else {
                            c0626q22.V();
                        }
                        return X3.y.a;
                    case 22:
                        C0626q c0626q23 = (C0626q) obj;
                        int intValue23 = ((Integer) obj2).intValue();
                        if (c0626q23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_project_id_placeholder, c0626q23), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262142);
                        } else {
                            c0626q23.V();
                        }
                        return X3.y.a;
                    case 23:
                        C0626q c0626q24 = (C0626q) obj;
                        int intValue24 = ((Integer) obj2).intValue();
                        if (c0626q24.S(intValue24 & 1, (intValue24 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_label, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                        } else {
                            c0626q24.V();
                        }
                        return X3.y.a;
                    case 24:
                        C0626q c0626q25 = (C0626q) obj;
                        int intValue25 = ((Integer) obj2).intValue();
                        if (c0626q25.S(intValue25 & 1, (intValue25 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_google_location_placeholder, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                        } else {
                            c0626q25.V();
                        }
                        return X3.y.a;
                    case 25:
                        C0626q c0626q26 = (C0626q) obj;
                        int intValue26 = ((Integer) obj2).intValue();
                        if (c0626q26.S(intValue26 & 1, (intValue26 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_base_url_input_label, c0626q26), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q26, 0, 0, 262142);
                        } else {
                            c0626q26.V();
                        }
                        return X3.y.a;
                    case 26:
                        C0626q c0626q27 = (C0626q) obj;
                        int intValue27 = ((Integer) obj2).intValue();
                        if (c0626q27.S(intValue27 & 1, (intValue27 & 3) != 2)) {
                            Q.A0.a(Y3.C.L(R.drawable.close, 0, c0626q27), h5.e.j0(R.string.button_clear, c0626q27), null, ((Q.N) c0626q27.j(Q.O.a)).f5427q, c0626q27, 8, 4);
                        } else {
                            c0626q27.V();
                        }
                        return X3.y.a;
                    case 27:
                        C0626q c0626q28 = (C0626q) obj;
                        int intValue28 = ((Integer) obj2).intValue();
                        if (c0626q28.S(intValue28 & 1, (intValue28 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_label, c0626q28), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q28, 0, 0, 262142);
                        } else {
                            c0626q28.V();
                        }
                        return X3.y.a;
                    case 28:
                        C0626q c0626q29 = (C0626q) obj;
                        int intValue29 = ((Integer) obj2).intValue();
                        if (c0626q29.S(intValue29 & 1, (intValue29 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_models_search_placeholder, c0626q29), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q29, 0, 0, 262142);
                        } else {
                            c0626q29.V();
                        }
                        return X3.y.a;
                    default:
                        C0626q c0626q30 = (C0626q) obj;
                        int intValue30 = ((Integer) obj2).intValue();
                        if (c0626q30.S(intValue30 & 1, (intValue30 & 3) != 2)) {
                            f3.b(h5.e.j0(R.string.model_services_add_name_label, c0626q30), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q30, 0, 0, 262142);
                        } else {
                            c0626q30.V();
                        }
                        return X3.y.a;
                }
            }
        }, false, -1287505832);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(final a3.w r38, l4.InterfaceC1193a r39, final l4.c r40, T.C0626q r41, int r42) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.AbstractC0783w.A(a3.w, l4.a, l4.c, T.q, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r4 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(com.bot.feature.settings.data.ModelConfig r32, boolean r33, l4.c r34, T.C0626q r35, int r36) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.AbstractC0783w.B(com.bot.feature.settings.data.ModelConfig, boolean, l4.c, T.q, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0510 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0579 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0598 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0612 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x062b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0644 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x065d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x070f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x072a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x077e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0987 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0734 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x069a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0681 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(final a3.C0808F r69, java.lang.String r70, final l4.InterfaceC1193a r71, l4.c r72, T.C0626q r73, int r74) {
        /*
            Method dump skipped, instructions count: 2605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.AbstractC0783w.C(a3.F, java.lang.String, l4.a, l4.c, T.q, int):void");
    }

    public static final boolean D(T.X x5) {
        return ((Boolean) x5.getValue()).booleanValue();
    }

    public static final void E(C0808F c0808f, InterfaceC1193a interfaceC1193a, final l4.c cVar, final l4.c cVar2, InterfaceC1193a interfaceC1193a2, InterfaceC1193a interfaceC1193a3, C0626q c0626q, int i6) {
        C0626q c0626q2;
        Object obj;
        x.s sVar;
        final T.X x5;
        float f6;
        C0602e c0602e;
        boolean z5;
        C0626q c0626q3;
        final T.X x6;
        int i7;
        boolean z6;
        InterfaceC1942y interfaceC1942y;
        final T.X x7;
        Object obj2;
        InterfaceC1193a interfaceC1193a4;
        int i8;
        L2 l22;
        int i9;
        InterfaceC1193a interfaceC1193a5;
        float f7;
        T.X x8;
        InterfaceC1942y interfaceC1942y2;
        LLMProvider lLMProvider;
        C0626q c0626q4 = c0626q;
        AbstractC1276k.f(c0808f, "modelServiceViewModel");
        AbstractC1276k.f(interfaceC1193a, "onBackClick");
        AbstractC1276k.f(cVar, "onProviderClick");
        AbstractC1276k.f(cVar2, "onProviderEditClick");
        AbstractC1276k.f(interfaceC1193a2, "onAddProviderClick");
        AbstractC1276k.f(interfaceC1193a3, "onSearchClick");
        c0626q4.d0(1068272967);
        int i10 = i6 | (c0626q4.h(c0808f) ? 4 : 2) | (c0626q4.h(interfaceC1193a) ? 32 : 16) | (c0626q4.h(cVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q4.h(cVar2) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q4.h(interfaceC1193a2) ? 16384 : 8192) | (c0626q4.h(interfaceC1193a3) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS);
        if (c0626q4.S(i10 & 1, (74899 & i10) != 74898)) {
            T.X r5 = Y4.d.r(c0808f.f10609e, c0626q4);
            T.X r6 = Y4.d.r(c0808f.f10611g, c0626q4);
            T.X r7 = Y4.d.r(c0808f.f10613i, c0626q4);
            Object P5 = c0626q4.P();
            C0602e c0602e2 = C0616l.a;
            Object obj3 = P5;
            if (P5 == c0602e2) {
                L2 l23 = new L2();
                c0626q4.m0(l23);
                obj3 = l23;
            }
            L2 l24 = (L2) obj3;
            Object P6 = c0626q4.P();
            Object obj4 = P6;
            if (P6 == c0602e2) {
                InterfaceC1942y p5 = T.r.p(c0626q4);
                c0626q4.m0(p5);
                obj4 = p5;
            }
            InterfaceC1942y interfaceC1942y3 = (InterfaceC1942y) obj4;
            x.s a6 = x.u.a(c0626q4);
            int i11 = (((Boolean) r6.getValue()).booleanValue() ? 1 : 0) + 1;
            int i12 = i10 & 14;
            boolean d6 = (i12 == 4 || c0626q4.h(c0808f)) | c0626q4.d(i11);
            Object P7 = c0626q4.P();
            Object obj5 = P7;
            if (d6 || P7 == c0602e2) {
                C0062d c0062d = new C0062d(i11, 3, c0808f);
                c0626q4.m0(c0062d);
                obj5 = c0062d;
            }
            l4.e eVar = (l4.e) obj5;
            boolean z7 = i12 == 4 || c0626q4.h(c0808f);
            Object P8 = c0626q4.P();
            if (z7 || P8 == c0602e2) {
                C0776s0 c0776s0 = new C0776s0(c0808f, 1);
                c0626q4.m0(c0776s0);
                obj = c0776s0;
            } else {
                obj = P8;
            }
            InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) obj;
            boolean f8 = c0626q4.f(r5) | c0626q4.d(i11);
            Object P9 = c0626q4.P();
            Object obj6 = P9;
            if (f8 || P9 == c0602e2) {
                M0 m02 = new M0(i11, 0, r5);
                c0626q4.m0(m02);
                obj6 = m02;
            }
            T.X E5 = T.r.E(eVar, c0626q4);
            T.X E6 = T.r.E(interfaceC1193a6, c0626q4);
            T.X E7 = T.r.E((l4.c) obj6, c0626q4);
            Object P10 = c0626q4.P();
            Object obj7 = P10;
            if (P10 == c0602e2) {
                InterfaceC1942y p6 = T.r.p(c0626q4);
                c0626q4.m0(p6);
                obj7 = p6;
            }
            InterfaceC1942y interfaceC1942y4 = (InterfaceC1942y) obj7;
            boolean f9 = c0626q4.f(a6) | c0626q4.f(interfaceC1942y4);
            Object P11 = c0626q4.P();
            if (f9 || P11 == c0602e2) {
                sVar = a6;
                P11 = new Z0(sVar, interfaceC1942y4, new C0415g0(E5, 11), new D.C(E6, 23), new A0(E7, 9));
                c0626q4.m0(P11);
            } else {
                sVar = a6;
            }
            final Z0 z02 = (Z0) P11;
            final InterfaceC1830a interfaceC1830a = (InterfaceC1830a) c0626q4.j(AbstractC0204q0.f2362l);
            Object P12 = c0626q4.P();
            Object obj8 = P12;
            if (P12 == c0602e2) {
                C0607g0 A5 = T.r.A(null);
                c0626q4.m0(A5);
                obj8 = A5;
            }
            final T.X x9 = (T.X) obj8;
            Object P13 = c0626q4.P();
            Object obj9 = P13;
            if (P13 == c0602e2) {
                C0607g0 A6 = T.r.A(null);
                c0626q4.m0(A6);
                obj9 = A6;
            }
            T.X x10 = (T.X) obj9;
            Object P14 = c0626q4.P();
            Object obj10 = P14;
            if (P14 == c0602e2) {
                C0607g0 A7 = T.r.A(Boolean.FALSE);
                c0626q4.m0(A7);
                obj10 = A7;
            }
            T.X x11 = (T.X) obj10;
            WeakHashMap weakHashMap = v.G0.f15220w;
            float f10 = 56;
            final float c6 = AbstractC1787b.j(C1810p.f(c0626q4).f15225f, c0626q4).c() + f10;
            String str = (String) r7.getValue();
            boolean z8 = i12 == 4 || c0626q4.h(c0808f);
            Object P15 = c0626q4.P();
            Object obj11 = P15;
            if (z8 || P15 == c0602e2) {
                C0776s0 c0776s02 = new C0776s0(c0808f, 2);
                c0626q4.m0(c0776s02);
                obj11 = c0776s02;
            }
            AbstractC0902r.a(l24, str, (InterfaceC1193a) obj11, null, c0626q4, 6);
            if (((C0810H) x10.getValue()) != null) {
                c0626q4.b0(-785684400);
                C0810H c0810h = (C0810H) x10.getValue();
                String str2 = (c0810h == null || (lLMProvider = c0810h.a) == null) ? null : lLMProvider.f11167c;
                if (str2 == null) {
                    str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                boolean booleanValue = ((Boolean) x11.getValue()).booleanValue();
                boolean h3 = (i12 == 4 || c0626q4.h(c0808f)) | c0626q4.h(interfaceC1942y3);
                Object P16 = c0626q4.P();
                if (h3 || P16 == c0602e2) {
                    f6 = f10;
                    c0602e = c0602e2;
                    x6 = r6;
                    x8 = x11;
                    i7 = i10;
                    interfaceC1942y2 = interfaceC1942y3;
                    x7 = r5;
                    P2.J0 j02 = new P2.J0(interfaceC1942y2, x10, x8, c0808f, 6);
                    c0626q4.m0(j02);
                    P16 = j02;
                } else {
                    f6 = f10;
                    c0602e = c0602e2;
                    interfaceC1942y2 = interfaceC1942y3;
                    x6 = r6;
                    x8 = x11;
                    i7 = i10;
                    x7 = r5;
                }
                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P16;
                Object P17 = c0626q4.P();
                Object obj12 = P17;
                if (P17 == c0602e) {
                    C0355g0 c0355g0 = new C0355g0(x8, x10, 5);
                    c0626q4.m0(c0355g0);
                    obj12 = c0355g0;
                }
                x5 = x10;
                c0626q3 = c0626q4;
                interfaceC1942y = interfaceC1942y2;
                z5 = true;
                i(str2, booleanValue, interfaceC1193a7, (InterfaceC1193a) obj12, c0626q3, 3072);
                z6 = false;
            } else {
                x5 = x10;
                f6 = f10;
                c0602e = c0602e2;
                z5 = true;
                c0626q3 = c0626q4;
                x6 = r6;
                i7 = i10;
                z6 = false;
                interfaceC1942y = interfaceC1942y3;
                x7 = r5;
                c0626q3.b0(-791106021);
            }
            c0626q3.p(z6);
            C1818y c1818y = v.t0.f15349c;
            InterfaceC1041r f11 = AbstractC1464z.f(c1818y, ((Q.N) c0626q3.j(Q.O.a)).f5424n, o0.y.f13496b);
            String str3 = (String) x9.getValue();
            Object P18 = c0626q3.P();
            if (P18 == c0602e) {
                P18 = new C0746d(x9, 2);
                c0626q3.m0(P18);
            }
            InterfaceC1041r a7 = B0.Q.a(f11, str3, (PointerInputEventHandler) P18);
            C1033j c1033j = C1026c.f11786c;
            F0.V d7 = AbstractC1806l.d(c1033j, false);
            int hashCode = Long.hashCode(c0626q3.f8164T);
            InterfaceC0617l0 l3 = c0626q3.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q3, a7);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q3.f0();
            if (c0626q3.f8163S) {
                c0626q3.k(c0148f);
            } else {
                c0626q3.p0();
            }
            T.r.G(c0626q3, d7, C0150g.f1928f);
            T.r.G(c0626q3, l3, C0150g.f1927e);
            T.r.x(c0626q3, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q3, C0150g.f1930h);
            T.r.G(c0626q3, c7, C0150g.f1926d);
            C1810p c1810p = C1810p.f15333b;
            float f12 = 20;
            float f13 = 12;
            v.k0 g3 = AbstractC1787b.g(f12, f12, f13, 2);
            C1795f g6 = AbstractC1799h.g(f13);
            boolean c8 = ((i7 & 7168) == 2048 ? z5 : false) | c0626q3.c(c6) | c0626q3.f(x6) | c0626q3.f(x7) | c0626q3.h(z02) | c0626q3.h(interfaceC1942y) | c0626q3.h(interfaceC1830a) | ((i7 & 896) == 256 ? z5 : false);
            Object P19 = c0626q3.P();
            if (c8 || P19 == c0602e) {
                interfaceC1193a4 = interfaceC1193a2;
                i8 = i7;
                final InterfaceC1942y interfaceC1942y5 = interfaceC1942y;
                l22 = l24;
                i9 = 16;
                interfaceC1193a5 = interfaceC1193a3;
                obj2 = new l4.c() { // from class: Z2.N0
                    @Override // l4.c
                    public final Object f(Object obj13) {
                        C1856g c1856g = (C1856g) obj13;
                        AbstractC1276k.f(c1856g, "$this$LazyColumn");
                        C1856g.n(c1856g, "top_spacing", new C0873f(new C0740a(c6, 1), true, 318503202), 2);
                        if (((Boolean) x6.getValue()).booleanValue()) {
                            C1856g.n(c1856g, null, AbstractC0783w.f10403V, 3);
                        }
                        List list = (List) x7.getValue();
                        c1856g.o(list.size(), new C0069g0(15, new C0789z(11), list), new P2.S(list, 12), new C0873f(new W0(list, z02, interfaceC1942y5, x9, cVar2, interfaceC1830a, cVar, x5), true, 2039820996));
                        return X3.y.a;
                    }
                };
                f7 = c6;
                c0626q3.m0(obj2);
            } else {
                interfaceC1193a4 = interfaceC1193a2;
                obj2 = P19;
                i8 = i7;
                f7 = c6;
                l22 = l24;
                i9 = 16;
                interfaceC1193a5 = interfaceC1193a3;
            }
            AbstractC1118b.a(c1818y, sVar, g3, g6, null, null, false, null, (l4.c) obj2, c0626q3, 24966, 488);
            String j03 = h5.e.j0(R.string.model_services_title, c0626q3);
            String j04 = h5.e.j0(R.string.settings_back, c0626q3);
            C0873f c9 = AbstractC0874g.c(1707310240, new I.m(i9, interfaceC1193a4, interfaceC1193a5), c0626q3);
            C1038o c1038o = C1038o.a;
            float f14 = f7;
            C0626q c0626q5 = c0626q3;
            R(j03, j04, f14, f6, interfaceC1193a, c9, c1810p.e(c1038o, c1033j), c0626q5, (57344 & (i8 << 9)) | 199680, 0);
            C0626q c0626q6 = c0626q5;
            R1.l(l22, AbstractC1787b.C(c1810p.e(c1038o, C1026c.f11787e), S.l.f7374V, f14 + f13, S.l.f7374V, S.l.f7374V, 13), f10404W, c0626q6, 390);
            c0626q6.p(true);
            c0626q2 = c0626q6;
        } else {
            c0626q4.V();
            c0626q2 = c0626q4;
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new W2.q(c0808f, interfaceC1193a, cVar, cVar2, interfaceC1193a2, interfaceC1193a3, i6);
        }
    }

    public static final void F(C0808F c0808f, InterfaceC1193a interfaceC1193a, l4.c cVar, C0626q c0626q, int i6) {
        List list;
        L2 l22;
        C0873f c0873f;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(c0808f, "modelServiceViewModel");
        AbstractC1276k.f(interfaceC1193a, "onBackClick");
        AbstractC1276k.f(cVar, "onProviderClick");
        c0626q2.d0(734156090);
        int i7 = i6 | (c0626q2.h(c0808f) ? 4 : 2) | (c0626q2.h(interfaceC1193a) ? 32 : 16) | (c0626q2.h(cVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q2.S(i7 & 1, (i7 & 147) != 146)) {
            T.X r5 = Y4.d.r(c0808f.f10609e, c0626q2);
            T.X r6 = Y4.d.r(c0808f.f10611g, c0626q2);
            T.X r7 = Y4.d.r(c0808f.f10613i, c0626q2);
            Object P5 = c0626q2.P();
            Object obj = C0616l.a;
            if (P5 == obj) {
                P5 = new L2();
                c0626q2.m0(P5);
            }
            L2 l23 = (L2) P5;
            Object[] objArr = new Object[0];
            Object P6 = c0626q2.P();
            if (P6 == obj) {
                P6 = new C0782v0(9);
                c0626q2.m0(P6);
            }
            T.X x5 = (T.X) e0.l.e(objArr, (InterfaceC1193a) P6, c0626q2, 48);
            Object P7 = c0626q2.P();
            if (P7 == obj) {
                P7 = new m0.w();
                c0626q2.m0(P7);
            }
            m0.w wVar = (m0.w) P7;
            I0.S0 s02 = (I0.S0) c0626q2.j(AbstractC0204q0.f2366p);
            boolean f6 = c0626q2.f(s02);
            Object P8 = c0626q2.P();
            if (f6 || P8 == obj) {
                P8 = new X0(wVar, s02, null);
                c0626q2.m0(P8);
            }
            T.r.f(c0626q2, X3.y.a, (l4.e) P8);
            WeakHashMap weakHashMap = v.G0.f15220w;
            float c6 = AbstractC1787b.j(C1810p.f(c0626q2).f15225f, c0626q2).c();
            String str = (String) r7.getValue();
            boolean z5 = (i7 & 14) == 4 || c0626q2.h(c0808f);
            Object P9 = c0626q2.P();
            if (z5 || P9 == obj) {
                P9 = new C0776s0(c0808f, 3);
                c0626q2.m0(P9);
            }
            L2 l24 = l23;
            AbstractC0902r.a(l24, str, (InterfaceC1193a) P9, null, c0626q2, 6);
            String obj2 = AbstractC1776n.l0((String) x5.getValue()).toString();
            if (AbstractC1776n.Q(obj2)) {
                list = (List) r5.getValue();
            } else {
                List list2 = (List) r5.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    C0810H c0810h = (C0810H) obj3;
                    if (AbstractC1776n.G(c0810h.a.f11167c, obj2, true) || AbstractC1776n.G(c0810h.a.f11166b, obj2, true)) {
                        arrayList.add(obj3);
                    }
                }
                list = arrayList;
            }
            boolean f7 = c0626q2.f(list);
            Object P10 = c0626q2.P();
            if (f7 || P10 == obj) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    if (((C0810H) obj4).a.f11175k) {
                        arrayList2.add(obj4);
                    } else {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList2.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj5 = arrayList2.get(i8);
                    i8++;
                    L2 l25 = l24;
                    String str2 = ((C0810H) obj5).a.f11176l;
                    if (str2 == null || AbstractC1776n.Q(str2)) {
                        arrayList5.add(obj5);
                    } else {
                        arrayList4.add(obj5);
                    }
                    l24 = l25;
                }
                l22 = l24;
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList3.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj6 = arrayList3.get(i9);
                    i9++;
                    int i10 = size2;
                    String str3 = ((C0810H) obj6).a.f11176l;
                    if (str3 == null || AbstractC1776n.Q(str3)) {
                        arrayList7.add(obj6);
                    } else {
                        arrayList6.add(obj6);
                    }
                    size2 = i10;
                }
                P10 = Y3.m.z0(Y3.m.z0(Y3.m.z0(arrayList4, arrayList5), arrayList6), arrayList7);
                c0626q2.m0(P10);
            } else {
                l22 = l24;
            }
            List list3 = (List) P10;
            C1818y c1818y = v.t0.f15349c;
            InterfaceC1041r f8 = AbstractC1464z.f(c1818y, ((Q.N) c0626q2.j(Q.O.a)).f5424n, o0.y.f13496b);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, f8);
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
            C1810p c1810p = C1810p.f15333b;
            float f9 = 20;
            InterfaceC1041r C5 = AbstractC1787b.C(c1818y, f9, c6, f9, S.l.f7374V, 8);
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q2, 0);
            int hashCode2 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, C5);
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
            InterfaceC1041r j3 = AbstractC1249d.j(v.t0.a, wVar);
            String str4 = (String) x5.getValue();
            C.d a7 = C.e.a(30);
            int i11 = 12;
            if (AbstractC1776n.Q((String) x5.getValue())) {
                c0626q2.b0(-903834240);
                c0626q2.p(false);
                c0873f = null;
            } else {
                c0626q2.b0(-904289382);
                c0873f = AbstractC0874g.c(308117873, new C0415g0(x5, i11), c0626q2);
                c0626q2.p(false);
            }
            boolean f10 = c0626q2.f(x5);
            Object P11 = c0626q2.P();
            if (f10 || P11 == obj) {
                P11 = new A0(x5, 11);
                c0626q2.m0(P11);
            }
            L2 l26 = l22;
            D1.a(str4, (l4.c) P11, j3, false, false, null, f10408a0, f10410b0, AbstractC0874g.c(-1219521650, new C0522b(9, interfaceC1193a), c0626q2), c0873f, null, false, null, null, null, true, 0, 0, a7, null, c0626q, 114819072, 12582912, 6159416);
            c0626q2 = c0626q;
            float f11 = 12;
            v.k0 e6 = AbstractC1787b.e(f11, 1);
            C1795f g3 = AbstractC1799h.g(f11);
            boolean f12 = c0626q2.f(r6) | c0626q2.h(list3) | ((i7 & 896) == 256);
            Object P12 = c0626q2.P();
            if (f12 || P12 == obj) {
                P12 = new C0091s(list3, (Object) r6, cVar, 19);
                c0626q2.m0(P12);
            }
            AbstractC1118b.a(c1818y, null, e6, g3, null, null, false, null, (l4.c) P12, c0626q2, 24966, 490);
            c0626q2.p(true);
            R1.l(l26, AbstractC1787b.C(c1810p.e(C1038o.a, C1026c.f11787e), S.l.f7374V, c6 + f11, S.l.f7374V, S.l.f7374V, 13), f10416e0, c0626q2, 390);
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new D.L(c0808f, interfaceC1193a, cVar, i6, 15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x00df, code lost:
    
        if ((r5 == null || u4.AbstractC1776n.Q(r5)) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
    
        if ((r5 == null || u4.AbstractC1776n.Q(r5)) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(a3.C0810H r18, final a3.C0809G r19, final l4.e r20, final l4.e r21, T.C0626q r22, int r23) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.AbstractC0783w.G(a3.H, a3.G, l4.e, l4.e, T.q, int):void");
    }

    public static final void H(final C0810H c0810h, final boolean z5, final Integer num, final String str, final boolean z6, final l4.c cVar, final l4.c cVar2, final l4.c cVar3, final String str2, final String str3, final String str4, final String str5, final String str6, final l4.c cVar4, final l4.c cVar5, final l4.c cVar6, final l4.c cVar7, final l4.c cVar8, final l4.c cVar9, C0626q c0626q, final int i6) {
        int i7;
        final boolean z7;
        Integer num2;
        String str7;
        boolean z8;
        c0626q.d0(1243172297);
        if ((i6 & 6) == 0) {
            i7 = ((i6 & 8) == 0 ? c0626q.f(c0810h) : c0626q.h(c0810h) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            z7 = z5;
            i7 |= c0626q.g(z7) ? 32 : 16;
        } else {
            z7 = z5;
        }
        if ((i6 & 384) == 0) {
            num2 = num;
            i7 |= c0626q.f(num2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        } else {
            num2 = num;
        }
        if ((i6 & 3072) == 0) {
            str7 = str;
            i7 |= c0626q.f(str7) ? 2048 : PegdownExtensions.ANCHORLINKS;
        } else {
            str7 = str;
        }
        if ((i6 & 24576) == 0) {
            z8 = z6;
            i7 |= c0626q.g(z8) ? 16384 : 8192;
        } else {
            z8 = z6;
        }
        if ((i6 & PegdownExtensions.SUPPRESS_ALL_HTML) == 0) {
            i7 |= c0626q.h(cVar) ? 131072 : 65536;
        }
        if ((i6 & 1572864) == 0) {
            i7 |= c0626q.h(cVar2) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i7 |= c0626q.h(cVar3) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i7 |= c0626q.f(str2) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i7 |= c0626q.f(str3) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        if (c0626q.S(i7 & 1, ((i7 & 306783379) == 306783378 && ((((((((((c0626q.f(str4) ? (char) 4 : (char) 2) | (c0626q.f(str5) ? SequenceUtils.SPC : (char) 16)) | (c0626q.f(str6) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS)) | (c0626q.h(cVar4) ? 2048 : PegdownExtensions.ANCHORLINKS)) | (c0626q.h(cVar5) ? (char) 16384 : (char) 8192)) | (c0626q.h(cVar6) ? (char) 0 : (char) 0)) | (c0626q.h(cVar7) ? (char) 0 : (char) 0)) | (c0626q.h(cVar8) ? (char) 0 : (char) 0)) | (c0626q.h(cVar9) ? (char) 0 : (char) 0)) & 38347923) == 38347922) ? false : true)) {
            final String str8 = str7;
            final boolean z9 = z8;
            final Integer num3 = num2;
            R1.c(v.t0.a, g1.a, null, null, AbstractC0874g.c(113211963, new l4.f() { // from class: Z2.D0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v33, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r5v39 */
                /* JADX WARN: Type inference failed for: r5v69 */
                @Override // l4.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    String str9;
                    Object obj4;
                    C0810H c0810h2;
                    String str10;
                    C1038o c1038o;
                    String str11;
                    boolean z10;
                    String str12;
                    String str13;
                    Object obj5;
                    Object obj6;
                    Object obj7;
                    C0148f c0148f;
                    C1032i c1032i;
                    long j3;
                    LLMProvider lLMProvider;
                    C0146e c0146e;
                    C0144d c0144d;
                    C0146e c0146e2;
                    C0148f c0148f2;
                    C0146e c0146e3;
                    C0146e c0146e4;
                    C0626q c0626q2;
                    boolean z11;
                    Object obj8;
                    String str14;
                    Object obj9;
                    String str15;
                    boolean z12;
                    boolean z13;
                    String str16;
                    boolean z14;
                    float f6;
                    D0 d02;
                    Object obj10;
                    Object obj11;
                    int i8;
                    int i9;
                    C0626q c0626q3;
                    boolean z15;
                    String str17;
                    Object obj12;
                    C0626q c0626q4;
                    Object r5;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    String str18;
                    Object obj13;
                    String str19;
                    C0810H c0810h3 = c0810h;
                    LLMProvider lLMProvider2 = c0810h3.a;
                    C0626q c0626q5 = (C0626q) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    C1032i c1032i2 = C1026c.f11796n;
                    AbstractC1276k.f((C1814u) obj, "$this$Card");
                    if (c0626q5.S(intValue & 1, (intValue & 17) != 16)) {
                        C1038o c1038o2 = C1038o.a;
                        InterfaceC1041r y5 = AbstractC1787b.y(c1038o2, 16);
                        C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q5, 0);
                        int hashCode = Long.hashCode(c0626q5.f8164T);
                        InterfaceC0617l0 l3 = c0626q5.l();
                        InterfaceC1041r c6 = AbstractC1024a.c(c0626q5, y5);
                        InterfaceC0152h.a.getClass();
                        C0148f c0148f3 = C0150g.f1924b;
                        c0626q5.f0();
                        if (c0626q5.f8163S) {
                            c0626q5.k(c0148f3);
                        } else {
                            c0626q5.p0();
                        }
                        C0146e c0146e5 = C0150g.f1928f;
                        T.r.G(c0626q5, a6, c0146e5);
                        C0146e c0146e6 = C0150g.f1927e;
                        T.r.G(c0626q5, l3, c0146e6);
                        Integer valueOf = Integer.valueOf(hashCode);
                        C0146e c0146e7 = C0150g.f1929g;
                        T.r.x(c0626q5, valueOf, c0146e7);
                        C0144d c0144d2 = C0150g.f1930h;
                        T.r.C(c0626q5, c0144d2);
                        C0146e c0146e8 = C0150g.f1926d;
                        T.r.G(c0626q5, c6, c0146e8);
                        String str20 = str2;
                        if (AbstractC1776n.Q(str20)) {
                            str20 = "openai";
                        }
                        String str21 = str4;
                        if (AbstractC1776n.Q(str21)) {
                            str21 = "ai_studio";
                        }
                        String str22 = str3;
                        if (AbstractC1776n.Q(str22)) {
                            str22 = "chat_completions";
                            str9 = str22;
                        } else {
                            str9 = "chat_completions";
                        }
                        boolean z16 = str20.equals("google") && str21.equals("vertex_ai");
                        boolean z17 = z9;
                        boolean z18 = z7;
                        Integer num4 = num3;
                        if (z17) {
                            c0626q5.b0(1769289190);
                            C0096u0 c0096u0 = new C0096u0(0, 6, 119);
                            c0626q5.b0(1769853359);
                            C0873f c7 = AbstractC0874g.c(-1306199812, new C0062d(num4.intValue(), c0810h3), c0626q5);
                            c0626q5.p(false);
                            c1032i = c1032i2;
                            c1038o = c1038o2;
                            obj4 = "openai";
                            c0810h2 = c0810h3;
                            str11 = str22;
                            obj5 = "ai_studio";
                            z10 = z18;
                            str12 = str21;
                            str13 = str9;
                            obj6 = "vertex_ai";
                            obj7 = "google";
                            str10 = str20;
                            D1.a(str8, cVar, v.t0.a, !z18, false, null, AbstractC0783w.f10390I, AbstractC0783w.f10391J, c7, null, null, false, null, c0096u0, null, true, 0, 0, null, null, c0626q5, 14156160, 12779520, 8224304);
                            c0626q2 = c0626q5;
                            AbstractC1787b.h(c0626q2, v.t0.d(c1038o, 12));
                            c0626q2.p(false);
                            c0146e2 = c0146e6;
                            lLMProvider = lLMProvider2;
                            c0148f2 = c0148f3;
                            c0146e3 = c0146e5;
                            c0146e4 = c0146e7;
                            c0144d = c0144d2;
                            c0146e = c0146e8;
                            z11 = true;
                        } else {
                            obj4 = "openai";
                            c0810h2 = c0810h3;
                            str10 = str20;
                            c1038o = c1038o2;
                            str11 = str22;
                            z10 = z18;
                            str12 = str21;
                            str13 = str9;
                            obj5 = "ai_studio";
                            obj6 = "vertex_ai";
                            obj7 = "google";
                            c0626q5.b0(1770443692);
                            C1818y c1818y = v.t0.a;
                            v.p0 a7 = v.o0.a(AbstractC1799h.a, c1032i2, c0626q5, 48);
                            int hashCode2 = Long.hashCode(c0626q5.f8164T);
                            InterfaceC0617l0 l5 = c0626q5.l();
                            InterfaceC1041r c8 = AbstractC1024a.c(c0626q5, c1818y);
                            c0626q5.f0();
                            if (c0626q5.f8163S) {
                                c0148f = c0148f3;
                                c0626q5.k(c0148f);
                            } else {
                                c0148f = c0148f3;
                                c0626q5.p0();
                            }
                            T.r.G(c0626q5, a7, c0146e5);
                            T.r.G(c0626q5, l5, c0146e6);
                            AbstractC1135a.n(hashCode2, c0626q5, c0146e7, c0626q5, c0144d2);
                            T.r.G(c0626q5, c8, c0146e8);
                            c0626q5.b0(-2052433902);
                            int intValue2 = num4.intValue();
                            AbstractC1688b L5 = Y3.C.L(intValue2, 0, c0626q5);
                            String str23 = lLMProvider2.f11167c;
                            InterfaceC1041r j4 = v.t0.j(c1038o, 28);
                            if (AbstractC0783w.V(Integer.valueOf(intValue2))) {
                                c0626q5.b0(-978575476);
                                c1032i = c1032i2;
                                j3 = ((Q.N) c0626q5.j(Q.O.a)).f5427q;
                                c0626q5.p(false);
                            } else {
                                c1032i = c1032i2;
                                c0626q5.b0(-978574802);
                                c0626q5.p(false);
                                j3 = o0.s.f13481h;
                            }
                            long j5 = j3;
                            lLMProvider = lLMProvider2;
                            c0146e = c0146e8;
                            c0144d = c0144d2;
                            Q.A0.a(L5, str23, j4, j5, c0626q5, 392, 0);
                            AbstractC1787b.h(c0626q5, v.t0.n(c1038o, 12));
                            c0626q5.p(false);
                            c0146e2 = c0146e6;
                            c0148f2 = c0148f;
                            c0146e3 = c0146e5;
                            c0146e4 = c0146e7;
                            f3.b(lLMProvider.f11167c, null, ((Q.N) c0626q5.j(Q.O.a)).f5427q, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q5.j(u3.a)).f6127h, c0626q5, 0, 0, 131066);
                            c0626q2 = c0626q5;
                            z11 = true;
                            c0626q2.p(true);
                            AbstractC1787b.h(c0626q2, v.t0.d(c1038o, 12));
                            c0626q2.p(false);
                        }
                        C1818y c1818y2 = v.t0.a;
                        v.p0 a8 = v.o0.a(AbstractC1799h.a, c1032i, c0626q2, 48);
                        int hashCode3 = Long.hashCode(c0626q2.f8164T);
                        InterfaceC0617l0 l6 = c0626q2.l();
                        InterfaceC1041r c9 = AbstractC1024a.c(c0626q2, c1818y2);
                        c0626q2.f0();
                        if (c0626q2.f8163S) {
                            c0626q2.k(c0148f2);
                        } else {
                            c0626q2.p0();
                        }
                        T.r.G(c0626q2, a8, c0146e3);
                        T.r.G(c0626q2, l6, c0146e2);
                        AbstractC1135a.n(hashCode3, c0626q2, c0146e4, c0626q2, c0144d);
                        T.r.G(c0626q2, c9, c0146e);
                        String j02 = h5.e.j0(R.string.model_services_enabled_label, c0626q2);
                        S0.P p5 = ((t3) c0626q2.j(u3.a)).f6130k;
                        if (1.0f <= 0.0d) {
                            AbstractC1829a.a("invalid weight; must be greater than zero");
                        }
                        C0626q c0626q6 = c0626q2;
                        boolean z19 = z11;
                        f3.b(j02, new v.Z(1.0f, z11), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, p5, c0626q6, 0, 0, 131068);
                        boolean z20 = lLMProvider.f11175k;
                        final boolean z21 = z10;
                        boolean z22 = !z21;
                        a3.a(z20, cVar9, null, z22, null, c0626q6, 0, 108);
                        C0626q c0626q7 = c0626q6;
                        c0626q7.p(z19);
                        float f7 = 12;
                        AbstractC1787b.h(c0626q7, v.t0.d(c1038o, f7));
                        Object obj14 = obj4;
                        Object obj15 = obj7;
                        final List I5 = Y4.l.I(new X3.i(obj14, h5.e.j0(R.string.model_services_api_schema_openai, c0626q7)), new X3.i(obj15, h5.e.j0(R.string.model_services_api_schema_google, c0626q7)), new X3.i("anthropic", h5.e.j0(R.string.model_services_api_schema_anthropic, c0626q7)));
                        Iterator it = I5.iterator();
                        while (true) {
                            obj8 = null;
                            if (!it.hasNext()) {
                                str14 = str10;
                                obj9 = null;
                                break;
                            }
                            obj9 = it.next();
                            str14 = str10;
                            if (AbstractC1276k.b(((X3.i) obj9).f9393c, str14)) {
                                break;
                            }
                            str10 = str14;
                        }
                        X3.i iVar = (X3.i) obj9;
                        if (iVar == null || (str15 = (String) iVar.f9394e) == null) {
                            str15 = (String) ((X3.i) Y3.m.o0(I5)).f9394e;
                        }
                        final String str24 = str15;
                        Object P5 = c0626q7.P();
                        C0602e c0602e = C0616l.a;
                        Object obj16 = P5;
                        if (P5 == c0602e) {
                            C0607g0 A5 = T.r.A(Boolean.FALSE);
                            c0626q7.m0(A5);
                            obj16 = A5;
                        }
                        final T.X x5 = (T.X) obj16;
                        boolean booleanValue = ((Boolean) x5.getValue()).booleanValue();
                        boolean g3 = c0626q7.g(z21);
                        Object P6 = c0626q7.P();
                        Object obj17 = P6;
                        if (g3 || P6 == c0602e) {
                            final int i16 = 1;
                            l4.c cVar10 = new l4.c() { // from class: Z2.p0
                                @Override // l4.c
                                public final Object f(Object obj18) {
                                    int i17 = i16;
                                    ((Boolean) obj18).getClass();
                                    switch (i17) {
                                        case 0:
                                            if (!z21) {
                                                x5.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                                            }
                                            return X3.y.a;
                                        case 1:
                                            if (!z21) {
                                                x5.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                                            }
                                            return X3.y.a;
                                        default:
                                            if (!z21) {
                                                x5.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                                            }
                                            return X3.y.a;
                                    }
                                }
                            };
                            c0626q7.m0(cVar10);
                            obj17 = cVar10;
                        }
                        final int i17 = 1;
                        final l4.c cVar11 = cVar4;
                        String str25 = str14;
                        final boolean z23 = z21;
                        AbstractC0451p0.a(booleanValue, (l4.c) obj17, null, AbstractC0874g.c(1944036039, new l4.f() { // from class: Z2.q0
                            @Override // l4.f
                            public final Object d(Object obj18, Object obj19, Object obj20) {
                                T.X x6;
                                T.X x7;
                                T.X x8;
                                C0443n0 c0443n0 = (C0443n0) obj18;
                                C0626q c0626q8 = (C0626q) obj19;
                                switch (i17) {
                                    case 0:
                                        int intValue3 = ((Integer) obj20).intValue();
                                        AbstractC1276k.f(c0443n0, "$this$ExposedDropdownMenuBox");
                                        if ((intValue3 & 6) == 0) {
                                            intValue3 |= (intValue3 & 8) == 0 ? c0626q8.f(c0443n0) : c0626q8.h(c0443n0) ? 4 : 2;
                                        }
                                        if (c0626q8.S(intValue3 & 1, (intValue3 & 19) != 18)) {
                                            boolean z24 = !z21;
                                            InterfaceC1041r c10 = c0443n0.b().c(v.t0.a);
                                            Object P7 = c0626q8.P();
                                            Object obj21 = C0616l.a;
                                            if (P7 == obj21) {
                                                P7 = new S2.Y(15);
                                                c0626q8.m0(P7);
                                            }
                                            C0873f c0873f = AbstractC0783w.f10394M;
                                            T.X x9 = x5;
                                            int i18 = intValue3;
                                            D1.a(str24, (l4.c) P7, c10, z24, true, null, c0873f, null, null, AbstractC0874g.c(-154299055, new C0415g0(x9, 3), c0626q8), null, false, null, null, null, false, 0, 0, null, null, c0626q8, 806903856, 0, 8388000);
                                            boolean booleanValue2 = ((Boolean) x9.getValue()).booleanValue();
                                            Object P8 = c0626q8.P();
                                            if (P8 == obj21) {
                                                x6 = x9;
                                                P8 = new D.C(x6, 19);
                                                c0626q8.m0(P8);
                                            } else {
                                                x6 = x9;
                                            }
                                            c0443n0.a(booleanValue2, (InterfaceC1193a) P8, null, null, false, null, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(-1620573736, new J(I5, cVar11, x6, 1), c0626q8), c0626q8, 48, 6 | ((i18 << 3) & 112), 1020);
                                        } else {
                                            c0626q8.V();
                                        }
                                        return X3.y.a;
                                    case 1:
                                        int intValue4 = ((Integer) obj20).intValue();
                                        AbstractC1276k.f(c0443n0, "$this$ExposedDropdownMenuBox");
                                        if ((intValue4 & 6) == 0) {
                                            intValue4 |= (intValue4 & 8) == 0 ? c0626q8.f(c0443n0) : c0626q8.h(c0443n0) ? 4 : 2;
                                        }
                                        if (c0626q8.S(intValue4 & 1, (intValue4 & 19) != 18)) {
                                            boolean z25 = !z21;
                                            InterfaceC1041r c11 = c0443n0.b().c(v.t0.a);
                                            Object P9 = c0626q8.P();
                                            Object obj22 = C0616l.a;
                                            if (P9 == obj22) {
                                                P9 = new S2.Y(17);
                                                c0626q8.m0(P9);
                                            }
                                            C0873f c0873f2 = AbstractC0783w.f10392K;
                                            T.X x10 = x5;
                                            int i19 = intValue4;
                                            D1.a(str24, (l4.c) P9, c11, z25, true, null, c0873f2, null, null, AbstractC0874g.c(-1098518530, new C0415g0(x10, 5), c0626q8), null, false, null, null, null, false, 0, 0, null, null, c0626q8, 806903856, 0, 8388000);
                                            boolean booleanValue3 = ((Boolean) x10.getValue()).booleanValue();
                                            Object P10 = c0626q8.P();
                                            if (P10 == obj22) {
                                                x7 = x10;
                                                P10 = new D.C(x7, 21);
                                                c0626q8.m0(P10);
                                            } else {
                                                x7 = x10;
                                            }
                                            c0443n0.a(booleanValue3, (InterfaceC1193a) P10, null, null, false, null, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(1211215621, new J(I5, cVar11, x7, 2), c0626q8), c0626q8, 48, 6 | ((i19 << 3) & 112), 1020);
                                        } else {
                                            c0626q8.V();
                                        }
                                        return X3.y.a;
                                    default:
                                        int intValue5 = ((Integer) obj20).intValue();
                                        AbstractC1276k.f(c0443n0, "$this$ExposedDropdownMenuBox");
                                        if ((intValue5 & 6) == 0) {
                                            intValue5 |= (intValue5 & 8) == 0 ? c0626q8.f(c0443n0) : c0626q8.h(c0443n0) ? 4 : 2;
                                        }
                                        if (c0626q8.S(intValue5 & 1, (intValue5 & 19) != 18)) {
                                            boolean z26 = !z21;
                                            InterfaceC1041r c12 = c0443n0.b().c(v.t0.a);
                                            Object P11 = c0626q8.P();
                                            Object obj23 = C0616l.a;
                                            if (P11 == obj23) {
                                                P11 = new S2.Y(18);
                                                c0626q8.m0(P11);
                                            }
                                            C0873f c0873f3 = AbstractC0783w.f10393L;
                                            T.X x11 = x5;
                                            int i20 = intValue5;
                                            D1.a(str24, (l4.c) P11, c12, z26, true, null, c0873f3, null, null, AbstractC0874g.c(-1217487664, new C0415g0(x11, 6), c0626q8), null, false, null, null, null, false, 0, 0, null, null, c0626q8, 806903856, 0, 8388000);
                                            boolean booleanValue4 = ((Boolean) x11.getValue()).booleanValue();
                                            Object P12 = c0626q8.P();
                                            if (P12 == obj23) {
                                                x8 = x11;
                                                P12 = new D.C(x8, 22);
                                                c0626q8.m0(P12);
                                            } else {
                                                x8 = x11;
                                            }
                                            c0443n0.a(booleanValue4, (InterfaceC1193a) P12, null, null, false, null, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(1611204951, new J(I5, cVar11, x8, 3), c0626q8), c0626q8, 48, 6 | ((i20 << 3) & 112), 1020);
                                        } else {
                                            c0626q8.V();
                                        }
                                        return X3.y.a;
                                }
                            }
                        }, c0626q7), c0626q7, 3072);
                        AbstractC1787b.h(c0626q7, v.t0.d(c1038o, f7));
                        if (str25.equals(obj14)) {
                            c0626q7.b0(1774258366);
                            final List I6 = Y4.l.I(new X3.i(str13, h5.e.j0(R.string.model_services_openai_mode_chat, c0626q7)), new X3.i("responses", h5.e.j0(R.string.model_services_openai_mode_responses, c0626q7)));
                            Iterator it2 = I6.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj13 = null;
                                    break;
                                }
                                obj13 = it2.next();
                                String str26 = str11;
                                if (AbstractC1276k.b(((X3.i) obj13).f9393c, str26)) {
                                    break;
                                }
                                str11 = str26;
                            }
                            X3.i iVar2 = (X3.i) obj13;
                            if (iVar2 == null || (str19 = (String) iVar2.f9394e) == null) {
                                str19 = (String) ((X3.i) Y3.m.o0(I6)).f9394e;
                            }
                            final String str27 = str19;
                            Object P7 = c0626q7.P();
                            Object obj18 = P7;
                            if (P7 == c0602e) {
                                C0607g0 A6 = T.r.A(Boolean.FALSE);
                                c0626q7.m0(A6);
                                obj18 = A6;
                            }
                            final T.X x6 = (T.X) obj18;
                            boolean booleanValue2 = ((Boolean) x6.getValue()).booleanValue();
                            boolean g6 = c0626q7.g(z23);
                            Object P8 = c0626q7.P();
                            Object obj19 = P8;
                            if (g6 || P8 == c0602e) {
                                final int i18 = 2;
                                l4.c cVar12 = new l4.c() { // from class: Z2.p0
                                    @Override // l4.c
                                    public final Object f(Object obj182) {
                                        int i172 = i18;
                                        ((Boolean) obj182).getClass();
                                        switch (i172) {
                                            case 0:
                                                if (!z23) {
                                                    x6.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                                                }
                                                return X3.y.a;
                                            case 1:
                                                if (!z23) {
                                                    x6.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                                                }
                                                return X3.y.a;
                                            default:
                                                if (!z23) {
                                                    x6.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                                                }
                                                return X3.y.a;
                                        }
                                    }
                                };
                                c0626q7.m0(cVar12);
                                obj19 = cVar12;
                            }
                            final int i19 = 2;
                            final l4.c cVar13 = cVar5;
                            C0873f c10 = AbstractC0874g.c(-1901237735, new l4.f() { // from class: Z2.q0
                                @Override // l4.f
                                public final Object d(Object obj182, Object obj192, Object obj20) {
                                    T.X x62;
                                    T.X x7;
                                    T.X x8;
                                    C0443n0 c0443n0 = (C0443n0) obj182;
                                    C0626q c0626q8 = (C0626q) obj192;
                                    switch (i19) {
                                        case 0:
                                            int intValue3 = ((Integer) obj20).intValue();
                                            AbstractC1276k.f(c0443n0, "$this$ExposedDropdownMenuBox");
                                            if ((intValue3 & 6) == 0) {
                                                intValue3 |= (intValue3 & 8) == 0 ? c0626q8.f(c0443n0) : c0626q8.h(c0443n0) ? 4 : 2;
                                            }
                                            if (c0626q8.S(intValue3 & 1, (intValue3 & 19) != 18)) {
                                                boolean z24 = !z23;
                                                InterfaceC1041r c102 = c0443n0.b().c(v.t0.a);
                                                Object P72 = c0626q8.P();
                                                Object obj21 = C0616l.a;
                                                if (P72 == obj21) {
                                                    P72 = new S2.Y(15);
                                                    c0626q8.m0(P72);
                                                }
                                                C0873f c0873f = AbstractC0783w.f10394M;
                                                T.X x9 = x6;
                                                int i182 = intValue3;
                                                D1.a(str27, (l4.c) P72, c102, z24, true, null, c0873f, null, null, AbstractC0874g.c(-154299055, new C0415g0(x9, 3), c0626q8), null, false, null, null, null, false, 0, 0, null, null, c0626q8, 806903856, 0, 8388000);
                                                boolean booleanValue22 = ((Boolean) x9.getValue()).booleanValue();
                                                Object P82 = c0626q8.P();
                                                if (P82 == obj21) {
                                                    x62 = x9;
                                                    P82 = new D.C(x62, 19);
                                                    c0626q8.m0(P82);
                                                } else {
                                                    x62 = x9;
                                                }
                                                c0443n0.a(booleanValue22, (InterfaceC1193a) P82, null, null, false, null, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(-1620573736, new J(I6, cVar13, x62, 1), c0626q8), c0626q8, 48, 6 | ((i182 << 3) & 112), 1020);
                                            } else {
                                                c0626q8.V();
                                            }
                                            return X3.y.a;
                                        case 1:
                                            int intValue4 = ((Integer) obj20).intValue();
                                            AbstractC1276k.f(c0443n0, "$this$ExposedDropdownMenuBox");
                                            if ((intValue4 & 6) == 0) {
                                                intValue4 |= (intValue4 & 8) == 0 ? c0626q8.f(c0443n0) : c0626q8.h(c0443n0) ? 4 : 2;
                                            }
                                            if (c0626q8.S(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                boolean z25 = !z23;
                                                InterfaceC1041r c11 = c0443n0.b().c(v.t0.a);
                                                Object P9 = c0626q8.P();
                                                Object obj22 = C0616l.a;
                                                if (P9 == obj22) {
                                                    P9 = new S2.Y(17);
                                                    c0626q8.m0(P9);
                                                }
                                                C0873f c0873f2 = AbstractC0783w.f10392K;
                                                T.X x10 = x6;
                                                int i192 = intValue4;
                                                D1.a(str27, (l4.c) P9, c11, z25, true, null, c0873f2, null, null, AbstractC0874g.c(-1098518530, new C0415g0(x10, 5), c0626q8), null, false, null, null, null, false, 0, 0, null, null, c0626q8, 806903856, 0, 8388000);
                                                boolean booleanValue3 = ((Boolean) x10.getValue()).booleanValue();
                                                Object P10 = c0626q8.P();
                                                if (P10 == obj22) {
                                                    x7 = x10;
                                                    P10 = new D.C(x7, 21);
                                                    c0626q8.m0(P10);
                                                } else {
                                                    x7 = x10;
                                                }
                                                c0443n0.a(booleanValue3, (InterfaceC1193a) P10, null, null, false, null, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(1211215621, new J(I6, cVar13, x7, 2), c0626q8), c0626q8, 48, 6 | ((i192 << 3) & 112), 1020);
                                            } else {
                                                c0626q8.V();
                                            }
                                            return X3.y.a;
                                        default:
                                            int intValue5 = ((Integer) obj20).intValue();
                                            AbstractC1276k.f(c0443n0, "$this$ExposedDropdownMenuBox");
                                            if ((intValue5 & 6) == 0) {
                                                intValue5 |= (intValue5 & 8) == 0 ? c0626q8.f(c0443n0) : c0626q8.h(c0443n0) ? 4 : 2;
                                            }
                                            if (c0626q8.S(intValue5 & 1, (intValue5 & 19) != 18)) {
                                                boolean z26 = !z23;
                                                InterfaceC1041r c12 = c0443n0.b().c(v.t0.a);
                                                Object P11 = c0626q8.P();
                                                Object obj23 = C0616l.a;
                                                if (P11 == obj23) {
                                                    P11 = new S2.Y(18);
                                                    c0626q8.m0(P11);
                                                }
                                                C0873f c0873f3 = AbstractC0783w.f10393L;
                                                T.X x11 = x6;
                                                int i20 = intValue5;
                                                D1.a(str27, (l4.c) P11, c12, z26, true, null, c0873f3, null, null, AbstractC0874g.c(-1217487664, new C0415g0(x11, 6), c0626q8), null, false, null, null, null, false, 0, 0, null, null, c0626q8, 806903856, 0, 8388000);
                                                boolean booleanValue4 = ((Boolean) x11.getValue()).booleanValue();
                                                Object P12 = c0626q8.P();
                                                if (P12 == obj23) {
                                                    x8 = x11;
                                                    P12 = new D.C(x8, 22);
                                                    c0626q8.m0(P12);
                                                } else {
                                                    x8 = x11;
                                                }
                                                c0443n0.a(booleanValue4, (InterfaceC1193a) P12, null, null, false, null, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(1611204951, new J(I6, cVar13, x8, 3), c0626q8), c0626q8, 48, 6 | ((i20 << 3) & 112), 1020);
                                            } else {
                                                c0626q8.V();
                                            }
                                            return X3.y.a;
                                    }
                                }
                            }, c0626q7);
                            z23 = z23;
                            AbstractC0451p0.a(booleanValue2, (l4.c) obj19, null, c10, c0626q7, 3072);
                            AbstractC1787b.h(c0626q7, v.t0.d(c1038o, f7));
                            z12 = false;
                        } else {
                            z12 = false;
                            c0626q7.b0(1740927569);
                        }
                        c0626q7.p(z12);
                        if (str25.equals(obj15)) {
                            c0626q7.b0(1776449539);
                            final List I7 = Y4.l.I(new X3.i(obj5, h5.e.j0(R.string.model_services_google_mode_ai_studio, c0626q7)), new X3.i(obj6, h5.e.j0(R.string.model_services_google_mode_vertex, c0626q7)));
                            Iterator it3 = I7.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next = it3.next();
                                String str28 = str12;
                                if (AbstractC1276k.b(((X3.i) next).f9393c, str28)) {
                                    obj8 = next;
                                    break;
                                }
                                str12 = str28;
                            }
                            X3.i iVar3 = (X3.i) obj8;
                            if (iVar3 == null || (str18 = (String) iVar3.f9394e) == null) {
                                str18 = (String) ((X3.i) Y3.m.o0(I7)).f9394e;
                            }
                            final String str29 = str18;
                            Object P9 = c0626q7.P();
                            Object obj20 = P9;
                            if (P9 == c0602e) {
                                C0607g0 A7 = T.r.A(Boolean.FALSE);
                                c0626q7.m0(A7);
                                obj20 = A7;
                            }
                            final T.X x7 = (T.X) obj20;
                            boolean booleanValue3 = ((Boolean) x7.getValue()).booleanValue();
                            boolean g7 = c0626q7.g(z23);
                            Object P10 = c0626q7.P();
                            Object obj21 = P10;
                            if (g7 || P10 == c0602e) {
                                final int i20 = 0;
                                l4.c cVar14 = new l4.c() { // from class: Z2.p0
                                    @Override // l4.c
                                    public final Object f(Object obj182) {
                                        int i172 = i20;
                                        ((Boolean) obj182).getClass();
                                        switch (i172) {
                                            case 0:
                                                if (!z23) {
                                                    x7.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                                                }
                                                return X3.y.a;
                                            case 1:
                                                if (!z23) {
                                                    x7.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                                                }
                                                return X3.y.a;
                                            default:
                                                if (!z23) {
                                                    x7.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                                                }
                                                return X3.y.a;
                                        }
                                    }
                                };
                                c0626q7.m0(cVar14);
                                obj21 = cVar14;
                            }
                            final int i21 = 0;
                            final l4.c cVar15 = cVar6;
                            final boolean z24 = z23;
                            AbstractC0451p0.a(booleanValue3, (l4.c) obj21, null, AbstractC0874g.c(-838049126, new l4.f() { // from class: Z2.q0
                                @Override // l4.f
                                public final Object d(Object obj182, Object obj192, Object obj202) {
                                    T.X x62;
                                    T.X x72;
                                    T.X x8;
                                    C0443n0 c0443n0 = (C0443n0) obj182;
                                    C0626q c0626q8 = (C0626q) obj192;
                                    switch (i21) {
                                        case 0:
                                            int intValue3 = ((Integer) obj202).intValue();
                                            AbstractC1276k.f(c0443n0, "$this$ExposedDropdownMenuBox");
                                            if ((intValue3 & 6) == 0) {
                                                intValue3 |= (intValue3 & 8) == 0 ? c0626q8.f(c0443n0) : c0626q8.h(c0443n0) ? 4 : 2;
                                            }
                                            if (c0626q8.S(intValue3 & 1, (intValue3 & 19) != 18)) {
                                                boolean z242 = !z24;
                                                InterfaceC1041r c102 = c0443n0.b().c(v.t0.a);
                                                Object P72 = c0626q8.P();
                                                Object obj212 = C0616l.a;
                                                if (P72 == obj212) {
                                                    P72 = new S2.Y(15);
                                                    c0626q8.m0(P72);
                                                }
                                                C0873f c0873f = AbstractC0783w.f10394M;
                                                T.X x9 = x7;
                                                int i182 = intValue3;
                                                D1.a(str29, (l4.c) P72, c102, z242, true, null, c0873f, null, null, AbstractC0874g.c(-154299055, new C0415g0(x9, 3), c0626q8), null, false, null, null, null, false, 0, 0, null, null, c0626q8, 806903856, 0, 8388000);
                                                boolean booleanValue22 = ((Boolean) x9.getValue()).booleanValue();
                                                Object P82 = c0626q8.P();
                                                if (P82 == obj212) {
                                                    x62 = x9;
                                                    P82 = new D.C(x62, 19);
                                                    c0626q8.m0(P82);
                                                } else {
                                                    x62 = x9;
                                                }
                                                c0443n0.a(booleanValue22, (InterfaceC1193a) P82, null, null, false, null, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(-1620573736, new J(I7, cVar15, x62, 1), c0626q8), c0626q8, 48, 6 | ((i182 << 3) & 112), 1020);
                                            } else {
                                                c0626q8.V();
                                            }
                                            return X3.y.a;
                                        case 1:
                                            int intValue4 = ((Integer) obj202).intValue();
                                            AbstractC1276k.f(c0443n0, "$this$ExposedDropdownMenuBox");
                                            if ((intValue4 & 6) == 0) {
                                                intValue4 |= (intValue4 & 8) == 0 ? c0626q8.f(c0443n0) : c0626q8.h(c0443n0) ? 4 : 2;
                                            }
                                            if (c0626q8.S(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                boolean z25 = !z24;
                                                InterfaceC1041r c11 = c0443n0.b().c(v.t0.a);
                                                Object P92 = c0626q8.P();
                                                Object obj22 = C0616l.a;
                                                if (P92 == obj22) {
                                                    P92 = new S2.Y(17);
                                                    c0626q8.m0(P92);
                                                }
                                                C0873f c0873f2 = AbstractC0783w.f10392K;
                                                T.X x10 = x7;
                                                int i192 = intValue4;
                                                D1.a(str29, (l4.c) P92, c11, z25, true, null, c0873f2, null, null, AbstractC0874g.c(-1098518530, new C0415g0(x10, 5), c0626q8), null, false, null, null, null, false, 0, 0, null, null, c0626q8, 806903856, 0, 8388000);
                                                boolean booleanValue32 = ((Boolean) x10.getValue()).booleanValue();
                                                Object P102 = c0626q8.P();
                                                if (P102 == obj22) {
                                                    x72 = x10;
                                                    P102 = new D.C(x72, 21);
                                                    c0626q8.m0(P102);
                                                } else {
                                                    x72 = x10;
                                                }
                                                c0443n0.a(booleanValue32, (InterfaceC1193a) P102, null, null, false, null, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(1211215621, new J(I7, cVar15, x72, 2), c0626q8), c0626q8, 48, 6 | ((i192 << 3) & 112), 1020);
                                            } else {
                                                c0626q8.V();
                                            }
                                            return X3.y.a;
                                        default:
                                            int intValue5 = ((Integer) obj202).intValue();
                                            AbstractC1276k.f(c0443n0, "$this$ExposedDropdownMenuBox");
                                            if ((intValue5 & 6) == 0) {
                                                intValue5 |= (intValue5 & 8) == 0 ? c0626q8.f(c0443n0) : c0626q8.h(c0443n0) ? 4 : 2;
                                            }
                                            if (c0626q8.S(intValue5 & 1, (intValue5 & 19) != 18)) {
                                                boolean z26 = !z24;
                                                InterfaceC1041r c12 = c0443n0.b().c(v.t0.a);
                                                Object P11 = c0626q8.P();
                                                Object obj23 = C0616l.a;
                                                if (P11 == obj23) {
                                                    P11 = new S2.Y(18);
                                                    c0626q8.m0(P11);
                                                }
                                                C0873f c0873f3 = AbstractC0783w.f10393L;
                                                T.X x11 = x7;
                                                int i202 = intValue5;
                                                D1.a(str29, (l4.c) P11, c12, z26, true, null, c0873f3, null, null, AbstractC0874g.c(-1217487664, new C0415g0(x11, 6), c0626q8), null, false, null, null, null, false, 0, 0, null, null, c0626q8, 806903856, 0, 8388000);
                                                boolean booleanValue4 = ((Boolean) x11.getValue()).booleanValue();
                                                Object P12 = c0626q8.P();
                                                if (P12 == obj23) {
                                                    x8 = x11;
                                                    P12 = new D.C(x8, 22);
                                                    c0626q8.m0(P12);
                                                } else {
                                                    x8 = x11;
                                                }
                                                c0443n0.a(booleanValue4, (InterfaceC1193a) P12, null, null, false, null, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(1611204951, new J(I7, cVar15, x8, 3), c0626q8), c0626q8, 48, 6 | ((i202 << 3) & 112), 1020);
                                            } else {
                                                c0626q8.V();
                                            }
                                            return X3.y.a;
                                    }
                                }
                            }, c0626q7), c0626q7, 3072);
                            AbstractC1787b.h(c0626q7, v.t0.d(c1038o, f7));
                            z13 = false;
                        } else {
                            z13 = false;
                            c0626q7.b0(1740927569);
                        }
                        c0626q7.p(z13);
                        if (str25.equals(obj15) && z16) {
                            c0626q7.b0(1778627723);
                            C1818y c1818y3 = v.t0.a;
                            z14 = z22;
                            f6 = f7;
                            obj11 = "anthropic";
                            obj10 = obj15;
                            d02 = this;
                            str16 = str25;
                            i8 = 6;
                            D1.a(str5, cVar7, c1818y3, z14, false, null, AbstractC0783w.f10395N, AbstractC0783w.f10396O, null, null, null, false, null, new C0096u0(z13 ? 1 : 0, 6, 119), null, true, 0, 0, null, null, c0626q7, 14156160, 12779520, 8224560);
                            AbstractC1787b.h(c0626q7, v.t0.d(c1038o, f6));
                            D1.a(str6, cVar8, c1818y3, z14, false, null, AbstractC0783w.f10397P, AbstractC0783w.f10398Q, null, null, null, false, null, new C0096u0(0, 6, 119), null, true, 0, 0, null, null, c0626q7, 14156160, 12779520, 8224560);
                            C0626q c0626q8 = c0626q7;
                            AbstractC1787b.h(c0626q8, v.t0.d(c1038o, f6));
                            z15 = false;
                            c0626q8.p(false);
                            i9 = 1740927569;
                            c0626q3 = c0626q8;
                        } else {
                            str16 = str25;
                            z14 = z22;
                            f6 = f7;
                            d02 = this;
                            obj10 = obj15;
                            obj11 = "anthropic";
                            i8 = 6;
                            i9 = 1740927569;
                            c0626q7.b0(1740927569);
                            c0626q7.p(z13);
                            z15 = z13;
                            c0626q3 = c0626q7;
                        }
                        if (z16) {
                            str17 = str16;
                            obj12 = obj10;
                            c0626q3.b0(i9);
                            r5 = z15;
                            c0626q4 = c0626q3;
                        } else {
                            c0626q3.b0(1779960351);
                            String str30 = str16;
                            Object obj22 = obj10;
                            if (str30.equals(obj22)) {
                                i14 = 1780007068;
                                i15 = R.string.model_services_google_ai_studio_base_url_placeholder;
                            } else {
                                i14 = 1780128557;
                                i15 = R.string.model_services_base_url_placeholder;
                            }
                            String j6 = B3.e.j(c0626q3, i14, i15, c0626q3, z15);
                            C1818y c1818y4 = v.t0.a;
                            String str31 = c0810h2.f10624c;
                            C0096u0 c0096u02 = new C0096u0(5, i8, 115);
                            C0873f c0873f = AbstractC0783w.f10399R;
                            C0873f c11 = AbstractC0874g.c(492569471, new K(j6, 5, (byte) 0), c0626q3);
                            l4.c cVar16 = cVar2;
                            C0626q c0626q9 = c0626q3;
                            str17 = str30;
                            obj12 = obj22;
                            D1.a(str31, cVar16, c1818y4, z14, false, null, c0873f, c11, null, null, null, false, null, c0096u02, null, true, 0, 0, null, null, c0626q9, 14156160, 12779520, 8224560);
                            C0626q c0626q10 = c0626q9;
                            AbstractC1787b.h(c0626q10, v.t0.d(c1038o, f6));
                            r5 = 0;
                            c0626q4 = c0626q10;
                        }
                        c0626q4.p(r5);
                        if (z16) {
                            i10 = 1780985552;
                            i11 = R.string.model_services_vertex_access_token_label;
                        } else {
                            i10 = 1781087356;
                            i11 = R.string.model_services_api_key_label;
                        }
                        String j7 = B3.e.j(c0626q4, i10, i11, c0626q4, r5);
                        if (z16) {
                            i12 = -773824360;
                            i13 = R.string.model_services_vertex_access_token_placeholder;
                        } else if (str17.equals(obj12)) {
                            i12 = -773820589;
                            i13 = R.string.model_services_google_api_key_placeholder;
                        } else if (str17.equals(obj11)) {
                            i12 = -773816874;
                            i13 = R.string.model_services_anthropic_api_key_placeholder;
                        } else {
                            i12 = -773813876;
                            i13 = R.string.model_services_api_key_placeholder;
                        }
                        C0626q c0626q11 = c0626q4;
                        D1.a(c0810h2.f10623b, cVar3, v.t0.a, z14, false, null, AbstractC0874g.c(-1735079733, new K(j7, 6, (byte) 0), c0626q4), AbstractC0874g.c(1856491306, new K(B3.e.j(c0626q4, i12, i13, c0626q4, r5), 7, (byte) 0), c0626q4), null, null, null, false, null, new C0096u0(r5, 7, 119), null, true, 0, 0, null, null, c0626q11, 14156160, 12779520, 8224560);
                        c0626q11.p(true);
                    } else {
                        c0626q5.V();
                    }
                    return X3.y.a;
                }
            }, c0626q), c0626q, 196614, 28);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: Z2.E0
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(i6 | 1);
                    AbstractC0783w.H(C0810H.this, z5, num, str, z6, cVar, cVar2, cVar3, str2, str3, str4, str5, str6, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void I(C0810H c0810h, InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6, int i7) {
        int i8;
        InterfaceC1041r interfaceC1041r2;
        AbstractC1276k.f(c0810h, "state");
        AbstractC1276k.f(interfaceC1193a, "onClick");
        c0626q.d0(-1379330984);
        int i9 = i6 | ((i6 & 8) == 0 ? c0626q.f(c0810h) : c0626q.h(c0810h) ? 4 : 2) | (c0626q.h(interfaceC1193a) ? 32 : 16);
        int i10 = i7 & 4;
        if (i10 != 0) {
            i8 = i9 | 384;
        } else {
            i8 = i9 | (c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        }
        if (c0626q.S(i8 & 1, (i8 & 147) != 146)) {
            InterfaceC1041r interfaceC1041r3 = i10 != 0 ? C1038o.a : interfaceC1041r;
            LLMProvider lLMProvider = c0810h.a;
            AbstractC1276k.f(lLMProvider, "provider");
            Integer W5 = W(lLMProvider.f11166b);
            InterfaceC1041r c6 = interfaceC1041r3.c(v.t0.a);
            C.d dVar = g1.a;
            InterfaceC1041r c7 = l0.h.c(c6, dVar);
            boolean z5 = (i8 & 112) == 32;
            Object P5 = c0626q.P();
            if (z5 || P5 == C0616l.a) {
                P5 = new K0(2, interfaceC1193a);
                c0626q.m0(P5);
            }
            R1.c(AbstractC1992b.a(31, c7, (InterfaceC1193a) P5, false), dVar, null, null, AbstractC0874g.c(-1999200346, new D.Q0(9, W5, c0810h), c0626q), c0626q, PegdownExtensions.SUPPRESS_ALL_HTML, 28);
            interfaceC1041r2 = interfaceC1041r3;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new L0(c0810h, interfaceC1193a, interfaceC1041r2, i6, i7);
        }
    }

    public static final void J(InterfaceC1041r interfaceC1041r, boolean z5, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, C0626q c0626q, int i6) {
        boolean z6;
        InterfaceC1193a interfaceC1193a3;
        c0626q.d0(172743818);
        int i7 = i6 | (c0626q.f(interfaceC1041r) ? 4 : 2) | (c0626q.g(z5) ? 32 : 16) | (c0626q.h(interfaceC1193a) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(interfaceC1193a2) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            InterfaceC1041r A5 = AbstractC1787b.A(16, S.l.f7374V, 2, interfaceC1041r);
            v.p0 a6 = v.o0.a(AbstractC1799h.g(12), C1026c.f11796n, c0626q, 54);
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
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q, a6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q, c6, c0146e4);
            float f6 = 48;
            C1038o c1038o = C1038o.a;
            InterfaceC1041r j3 = v.t0.j(c1038o, f6);
            long d6 = o0.y.d(4278221567L);
            C.d dVar = C.e.a;
            InterfaceC1041r c7 = l0.h.c(AbstractC1464z.f(j3, d6, dVar), dVar);
            boolean z7 = (i7 & 896) == 256;
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (z7 || P5 == c0602e) {
                P5 = new K0(0, interfaceC1193a);
                c0626q.m0(P5);
            }
            InterfaceC1041r a7 = AbstractC1992b.a(31, c7, (InterfaceC1193a) P5, false);
            C1033j c1033j = C1026c.f11790h;
            F0.V d7 = AbstractC1806l.d(c1033j, false);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q, a7);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d7, c0146e);
            T.r.G(c0626q, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c8, c0146e4);
            AbstractC1688b L5 = Y3.C.L(R.drawable.edit, 0, c0626q);
            String j02 = h5.e.j0(R.string.model_services_edit_action, c0626q);
            long j4 = o0.s.f13477d;
            float f7 = 22;
            Q.A0.a(L5, j02, v.t0.j(c1038o, f7), j4, c0626q, 3464, 0);
            c0626q.p(true);
            InterfaceC1041r a8 = l0.h.a(l0.h.c(AbstractC1464z.f(v.t0.j(c1038o, f6), o0.y.d(4294916912L), dVar), dVar), z5 ? 1.0f : 0.4f);
            boolean z8 = (i7 & 7168) == 2048;
            Object P6 = c0626q.P();
            if (z8 || P6 == c0602e) {
                interfaceC1193a3 = interfaceC1193a2;
                P6 = new K0(1, interfaceC1193a3);
                c0626q.m0(P6);
            } else {
                interfaceC1193a3 = interfaceC1193a2;
            }
            z6 = z5;
            InterfaceC1041r a9 = AbstractC1992b.a(29, a8, (InterfaceC1193a) P6, z6);
            F0.V d8 = AbstractC1806l.d(c1033j, false);
            int hashCode3 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l6 = c0626q.l();
            InterfaceC1041r c9 = AbstractC1024a.c(c0626q, a9);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d8, c0146e);
            T.r.G(c0626q, l6, c0146e2);
            AbstractC1135a.n(hashCode3, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c9, c0146e4);
            Q.A0.a(Y3.C.L(R.drawable.delete, 0, c0626q), h5.e.j0(R.string.button_delete, c0626q), v.t0.j(c1038o, f7), j4, c0626q, 3464, 0);
            c0626q.p(true);
            c0626q.p(true);
        } else {
            z6 = z5;
            interfaceC1193a3 = interfaceC1193a2;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new Q2.g((Object) interfaceC1041r, z6, interfaceC1193a, interfaceC1193a3, i6, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [int] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [int] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    public static final void K(C0811I c0811i, D2.e eVar, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        float f6;
        C1038o c1038o;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(c0811i, "searchServiceViewModel");
        AbstractC1276k.f(interfaceC1193a, "onBackClick");
        c0626q2.d0(-994364770);
        int i13 = i6 | (c0626q2.h(c0811i) ? 4 : 2) | (c0626q2.d(eVar.ordinal()) ? 32 : 16) | (c0626q2.h(interfaceC1193a) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q2.S(i13 & 1, (i13 & 147) != 146)) {
            T.X r5 = Y4.d.r(c0811i.f10632d, c0626q2);
            T.X r6 = Y4.d.r(c0811i.f10633e, c0626q2);
            T.X r7 = Y4.d.r(c0811i.f10634f, c0626q2);
            WeakHashMap weakHashMap = v.G0.f15220w;
            float f7 = 56;
            float c6 = AbstractC1787b.j(C1810p.f(c0626q2).f15225f, c0626q2).c() + f7;
            C1818y c1818y = v.t0.f15349c;
            T.e1 e1Var = Q.O.a;
            InterfaceC1041r f8 = AbstractC1464z.f(c1818y, ((Q.N) c0626q2.j(e1Var)).f5424n, o0.y.f13496b);
            C1033j c1033j = C1026c.f11786c;
            F0.V d6 = AbstractC1806l.d(c1033j, false);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, f8);
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
            C1810p c1810p = C1810p.f15333b;
            float f9 = 20;
            float f10 = 12;
            InterfaceC1041r r8 = AbstractC1464z.r(AbstractC1787b.C(c1818y, f9, c6 + f10, f9, S.l.f7374V, 8), AbstractC1464z.q(c0626q2), true);
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q2, 0);
            int hashCode2 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, r8);
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
            int ordinal = eVar.ordinal();
            C1038o c1038o2 = C1038o.a;
            if (ordinal != 0) {
                C0602e c0602e = C0616l.a;
                if (ordinal == 1) {
                    f6 = f7;
                    c0626q2.b0(97443238);
                    f3.b(h5.e.j0(R.string.search_service_ollama_subtitle, c0626q2), AbstractC1787b.C(c1038o2, S.l.f7374V, S.l.f7374V, S.l.f7374V, f10, 7), ((Q.N) c0626q2.j(e1Var)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6130k, c0626q2, 48, 0, 131064);
                    C1818y c1818y2 = v.t0.a;
                    String str = (String) r5.getValue();
                    boolean h3 = c0626q2.h(c0811i);
                    Object P5 = c0626q2.P();
                    if (h3 || P5 == c0602e) {
                        i7 = 7;
                        z6 = true;
                        i8 = 119;
                        z7 = 0;
                        c1038o = c1038o2;
                        D.P0 p02 = new D.P0(1, c0811i, C0811I.class, "updateOllamaApiKey", "updateOllamaApiKey(Ljava/lang/String;)V", 0, 0, 8);
                        c0626q2.m0(p02);
                        P5 = p02;
                    } else {
                        z7 = 0;
                        i7 = 7;
                        z6 = true;
                        i8 = 119;
                        c1038o = c1038o2;
                    }
                    z5 = z6;
                    D1.a(str, (l4.c) ((C1274i) P5), c1818y2, false, false, null, f10420g0, f10422h0, null, null, null, false, null, new C0096u0(z7, i7, i8), null, true, 0, 0, null, null, c0626q2, 14156160, 12779520, 8224568);
                    c0626q2 = c0626q2;
                    c0626q2.p(z7);
                } else if (ordinal == 2) {
                    f6 = f7;
                    c0626q2.b0(98432262);
                    f3.b(h5.e.j0(R.string.search_service_metaso_subtitle, c0626q2), AbstractC1787b.C(c1038o2, S.l.f7374V, S.l.f7374V, S.l.f7374V, f10, 7), ((Q.N) c0626q2.j(e1Var)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6130k, c0626q2, 48, 0, 131064);
                    C1818y c1818y3 = v.t0.a;
                    String str2 = (String) r6.getValue();
                    boolean h6 = c0626q2.h(c0811i);
                    Object P6 = c0626q2.P();
                    if (h6 || P6 == c0602e) {
                        i9 = 7;
                        z8 = true;
                        i10 = 119;
                        z9 = 0;
                        D.P0 p03 = new D.P0(1, c0811i, C0811I.class, "updateMetasoApiKey", "updateMetasoApiKey(Ljava/lang/String;)V", 0, 0, 9);
                        c0626q2.m0(p03);
                        P6 = p03;
                    } else {
                        z9 = 0;
                        i9 = 7;
                        z8 = true;
                        i10 = 119;
                    }
                    D1.a(str2, (l4.c) ((C1274i) P6), c1818y3, false, false, null, f10424i0, f10426j0, null, null, null, false, null, new C0096u0(z9, i9, i10), null, true, 0, 0, null, null, c0626q2, 14156160, 12779520, 8224568);
                    c0626q2 = c0626q2;
                    c0626q2.p(z9);
                    z5 = z8;
                    c1038o = c1038o2;
                } else {
                    if (ordinal != 3) {
                        c0626q2.b0(1942786958);
                        c0626q2.p(false);
                        throw new RuntimeException();
                    }
                    c0626q2.b0(99418031);
                    f6 = f7;
                    f3.b(h5.e.j0(R.string.search_service_exa_subtitle, c0626q2), AbstractC1787b.C(c1038o2, S.l.f7374V, S.l.f7374V, S.l.f7374V, f10, 7), ((Q.N) c0626q2.j(e1Var)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(u3.a)).f6130k, c0626q2, 48, 0, 131064);
                    C1818y c1818y4 = v.t0.a;
                    String str3 = (String) r7.getValue();
                    boolean h7 = c0626q2.h(c0811i);
                    Object P7 = c0626q2.P();
                    if (h7 || P7 == c0602e) {
                        z10 = true;
                        i11 = 119;
                        i12 = 7;
                        z11 = 0;
                        D.P0 p04 = new D.P0(1, c0811i, C0811I.class, "updateExaApiKey", "updateExaApiKey(Ljava/lang/String;)V", 0, 0, 10);
                        c0626q2.m0(p04);
                        P7 = p04;
                    } else {
                        i11 = 119;
                        i12 = 7;
                        z10 = true;
                        z11 = 0;
                    }
                    D1.a(str3, (l4.c) ((C1274i) P7), c1818y4, false, false, null, f10428k0, f10430l0, null, null, null, false, null, new C0096u0(z11, i12, i11), null, true, 0, 0, null, null, c0626q2, 14156160, 12779520, 8224568);
                    c0626q2 = c0626q2;
                    c0626q2.p(z11);
                    z5 = z10;
                    c1038o = c1038o2;
                }
            } else {
                f6 = f7;
                c1038o = c1038o2;
                z5 = true;
                c0626q2.b0(96817472);
                R1.c(v.t0.a, C.e.a(16), null, null, f10418f0, c0626q2, 196614, 28);
                c0626q2.p(false);
            }
            c0626q2.p(z5);
            R(h5.e.j0(X(eVar), c0626q2), h5.e.j0(R.string.settings_back, c0626q2), c6, f6, interfaceC1193a, null, c1810p.e(c1038o, c1033j), c0626q, (57344 & (i13 << 6)) | 3072, 32);
            c0626q2 = c0626q;
            c0626q2.p(z5);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new D.L(c0811i, eVar, interfaceC1193a, i6, 16);
        }
    }

    public static final void L(final a1 a1Var, InterfaceC1193a interfaceC1193a, final InterfaceC1193a interfaceC1193a2, C0626q c0626q, int i6) {
        long j3;
        c0626q.d0(-1624566138);
        int i7 = i6 | (c0626q.f(a1Var) ? 4 : 2) | (c0626q.h(interfaceC1193a) ? 32 : 16) | (c0626q.h(interfaceC1193a2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            boolean z5 = a1Var.f10146c;
            boolean z6 = a1Var.f10147d;
            final int i8 = z5 ? z6 ? R.string.search_service_api_key_configured : R.string.search_service_api_key_missing : R.string.search_service_no_config_required;
            if (!z5 || z6) {
                c0626q.b0(-1757792318);
                j3 = ((Q.N) c0626q.j(Q.O.a)).f5429s;
                c0626q.p(false);
            } else {
                c0626q.b0(-1757845235);
                j3 = ((Q.N) c0626q.j(Q.O.a)).f5433w;
                c0626q.p(false);
            }
            final long j4 = j3;
            C1818y c1818y = v.t0.a;
            C.d dVar = g1.a;
            InterfaceC1041r c6 = l0.h.c(c1818y, dVar);
            boolean z7 = (i7 & 112) == 32;
            Object P5 = c0626q.P();
            if (z7 || P5 == C0616l.a) {
                P5 = new K0(3, interfaceC1193a);
                c0626q.m0(P5);
            }
            R1.c(AbstractC1992b.a(31, c6, (InterfaceC1193a) P5, false), dVar, null, null, AbstractC0874g.c(831152888, new l4.f() { // from class: Z2.b1
                @Override // l4.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    C1038o c1038o;
                    int i9;
                    int i10;
                    C0626q c0626q2 = (C0626q) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    AbstractC1276k.f((C1814u) obj, "$this$Card");
                    if (c0626q2.S(intValue & 1, (intValue & 17) != 16)) {
                        C1038o c1038o2 = C1038o.a;
                        InterfaceC1041r y5 = AbstractC1787b.y(c1038o2, 16);
                        C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q2, 0);
                        int hashCode = Long.hashCode(c0626q2.f8164T);
                        InterfaceC0617l0 l3 = c0626q2.l();
                        InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, y5);
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
                        T.r.G(c0626q2, c7, c0146e4);
                        C1818y c1818y2 = v.t0.a;
                        C1032i c1032i = C1026c.f11796n;
                        C1810p c1810p = AbstractC1799h.a;
                        v.p0 a7 = v.o0.a(c1810p, c1032i, c0626q2, 48);
                        int hashCode2 = Long.hashCode(c0626q2.f8164T);
                        InterfaceC0617l0 l5 = c0626q2.l();
                        InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, c1818y2);
                        c0626q2.f0();
                        if (c0626q2.f8163S) {
                            c0626q2.k(c0148f);
                        } else {
                            c0626q2.p0();
                        }
                        T.r.G(c0626q2, a7, c0146e);
                        T.r.G(c0626q2, l5, c0146e2);
                        AbstractC1135a.n(hashCode2, c0626q2, c0146e3, c0626q2, c0144d);
                        T.r.G(c0626q2, c8, c0146e4);
                        if (1.0f <= 0.0d) {
                            AbstractC1829a.a("invalid weight; must be greater than zero");
                        }
                        v.Z z8 = new v.Z(1.0f, true);
                        v.p0 a8 = v.o0.a(c1810p, c1032i, c0626q2, 48);
                        int hashCode3 = Long.hashCode(c0626q2.f8164T);
                        InterfaceC0617l0 l6 = c0626q2.l();
                        InterfaceC1041r c9 = AbstractC1024a.c(c0626q2, z8);
                        c0626q2.f0();
                        if (c0626q2.f8163S) {
                            c0626q2.k(c0148f);
                        } else {
                            c0626q2.p0();
                        }
                        T.r.G(c0626q2, a8, c0146e);
                        T.r.G(c0626q2, l6, c0146e2);
                        AbstractC1135a.n(hashCode3, c0626q2, c0146e3, c0626q2, c0144d);
                        T.r.G(c0626q2, c9, c0146e4);
                        a1 a1Var2 = a1.this;
                        D2.e eVar = a1Var2.a;
                        int ordinal = eVar.ordinal();
                        if (ordinal == 0) {
                            c1038o = c1038o2;
                            i9 = 0;
                            c0626q2.b0(1623499814);
                            Q.A0.a(Y3.C.L(R.drawable.bing, 0, c0626q2), null, v.t0.j(c1038o, 24), o0.s.f13481h, c0626q2, 3512, 0);
                            c0626q2.p(false);
                        } else if (ordinal == 1) {
                            c1038o = c1038o2;
                            i9 = 0;
                            c0626q2.b0(1623510152);
                            Q.A0.a(Y3.C.L(R.drawable.ollama, 0, c0626q2), null, v.t0.j(c1038o, 24), o0.s.f13481h, c0626q2, 3512, 0);
                            c0626q2.p(false);
                        } else if (ordinal == 2) {
                            c1038o = c1038o2;
                            i9 = 0;
                            c0626q2.b0(1623520552);
                            Q.A0.a(Y3.C.L(R.drawable.metaso, 0, c0626q2), null, v.t0.j(c1038o, 24), o0.s.f13481h, c0626q2, 3512, 0);
                            c0626q2.p(false);
                        } else {
                            if (ordinal != 3) {
                                c0626q2.b0(1623498790);
                                c0626q2.p(false);
                                throw new RuntimeException();
                            }
                            c0626q2.b0(1623530853);
                            i9 = 0;
                            c1038o = c1038o2;
                            Q.A0.a(Y3.C.L(R.drawable.exa, 0, c0626q2), null, v.t0.j(c1038o, 24), o0.s.f13481h, c0626q2, 3512, 0);
                            c0626q2.p(false);
                        }
                        AbstractC1787b.h(c0626q2, v.t0.n(c1038o, 12));
                        String j02 = h5.e.j0(AbstractC0783w.X(eVar), c0626q2);
                        T.e1 e1Var = u3.a;
                        S0.P p5 = ((t3) c0626q2.j(e1Var)).f6127h;
                        T.e1 e1Var2 = Q.O.a;
                        C1038o c1038o3 = c1038o;
                        f3.b(j02, null, ((Q.N) c0626q2.j(e1Var2)).f5427q, 0L, null, 0L, null, 0L, 2, false, 1, 0, p5, c0626q2, 0, 24960, 110586);
                        c0626q2.p(true);
                        T.r.a(Q.D0.f5207c.a(new e1.f(i9)), AbstractC0874g.c(1601454610, new I.m(17, a1Var2, interfaceC1193a2), c0626q2), c0626q2, 56);
                        c0626q2.p(true);
                        int ordinal2 = eVar.ordinal();
                        if (ordinal2 == 0) {
                            i10 = R.string.search_service_bing_subtitle;
                        } else if (ordinal2 == 1) {
                            i10 = R.string.search_service_ollama_subtitle;
                        } else if (ordinal2 == 2) {
                            i10 = R.string.search_service_metaso_subtitle;
                        } else {
                            if (ordinal2 != 3) {
                                throw new RuntimeException();
                            }
                            i10 = R.string.search_service_exa_subtitle;
                        }
                        f3.b(h5.e.j0(i10, c0626q2), AbstractC1787b.C(c1038o3, S.l.f7374V, 6, S.l.f7374V, S.l.f7374V, 13), ((Q.N) c0626q2.j(e1Var2)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(e1Var)).f6131l, c0626q2, 48, 0, 131064);
                        f3.b(h5.e.j0(i8, c0626q2), AbstractC1787b.C(c1038o3, S.l.f7374V, 4, S.l.f7374V, S.l.f7374V, 13), j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(e1Var)).f6131l, c0626q2, 48, 0, 131064);
                        c0626q2.p(true);
                    } else {
                        c0626q2.V();
                    }
                    return X3.y.a;
                }
            }, c0626q), c0626q, PegdownExtensions.SUPPRESS_ALL_HTML, 28);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.L(a1Var, interfaceC1193a, interfaceC1193a2, i6, 18);
        }
    }

    public static final void M(C0811I c0811i, InterfaceC1193a interfaceC1193a, l4.c cVar, C0626q c0626q, int i6) {
        AbstractC1276k.f(c0811i, "searchServiceViewModel");
        AbstractC1276k.f(interfaceC1193a, "onBackClick");
        AbstractC1276k.f(cVar, "onServiceClick");
        c0626q.d0(-1498354379);
        int i7 = i6 | (c0626q.h(c0811i) ? 4 : 2) | (c0626q.h(interfaceC1193a) ? 32 : 16) | (c0626q.h(cVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            T.X r5 = Y4.d.r(c0811i.f10631c, c0626q);
            T.X r6 = Y4.d.r(c0811i.f10632d, c0626q);
            T.X r7 = Y4.d.r(c0811i.f10633e, c0626q);
            T.X r8 = Y4.d.r(c0811i.f10634f, c0626q);
            WeakHashMap weakHashMap = v.G0.f15220w;
            float f6 = 56;
            float c6 = AbstractC1787b.j(C1810p.f(c0626q).f15225f, c0626q).c() + f6;
            boolean f7 = c0626q.f((String) r8.getValue()) | c0626q.d(((D2.e) r5.getValue()).ordinal()) | c0626q.f((String) r6.getValue()) | c0626q.f((String) r7.getValue());
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (f7 || P5 == obj) {
                D2.e eVar = (D2.e) r5.getValue();
                D2.e eVar2 = D2.e.BING;
                a1 a1Var = new a1(eVar2, eVar == eVar2, false, true);
                D2.e eVar3 = (D2.e) r5.getValue();
                D2.e eVar4 = D2.e.OLLAMA;
                a1 a1Var2 = new a1(eVar4, eVar3 == eVar4, true, !AbstractC1776n.Q((String) r6.getValue()));
                D2.e eVar5 = (D2.e) r5.getValue();
                D2.e eVar6 = D2.e.METASO;
                a1 a1Var3 = new a1(eVar6, eVar5 == eVar6, true, !AbstractC1776n.Q((String) r7.getValue()));
                D2.e eVar7 = (D2.e) r5.getValue();
                D2.e eVar8 = D2.e.EXA;
                P5 = Y4.l.I(a1Var, a1Var2, a1Var3, new a1(eVar8, eVar7 == eVar8, true, !AbstractC1776n.Q((String) r8.getValue())));
                c0626q.m0(P5);
            }
            List list = (List) P5;
            C1818y c1818y = v.t0.f15349c;
            InterfaceC1041r f8 = AbstractC1464z.f(c1818y, ((Q.N) c0626q.j(Q.O.a)).f5424n, o0.y.f13496b);
            C1033j c1033j = C1026c.f11786c;
            F0.V d6 = AbstractC1806l.d(c1033j, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, f8);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a2 = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a2);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c7, C0150g.f1926d);
            C1810p c1810p = C1810p.f15333b;
            float f9 = 20;
            float f10 = 12;
            v.k0 k0Var = new v.k0(f9, c6 + f10, f9, f10);
            C1795f g3 = AbstractC1799h.g(f10);
            boolean h3 = ((i7 & 896) == 256) | c0626q.h(list) | c0626q.h(c0811i);
            Object P6 = c0626q.P();
            if (h3 || P6 == obj) {
                P6 = new C0091s(list, (Object) c0811i, cVar, 20);
                c0626q.m0(P6);
            }
            AbstractC1118b.a(c1818y, null, k0Var, g3, null, null, false, null, (l4.c) P6, c0626q, 24582, 490);
            R(h5.e.j0(R.string.search_services_title, c0626q), h5.e.j0(R.string.settings_back, c0626q), c6, f6, interfaceC1193a, null, c1810p.e(C1038o.a, c1033j), c0626q, ((i7 << 9) & 57344) | 3072, 32);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.L(c0811i, interfaceC1193a, cVar, i6, 17);
        }
    }

    public static final void N(final InterfaceC1193a interfaceC1193a, final InterfaceC1193a interfaceC1193a2, final InterfaceC1193a interfaceC1193a3, final InterfaceC1193a interfaceC1193a4, final InterfaceC1193a interfaceC1193a5, final InterfaceC1193a interfaceC1193a6, final G2.d dVar, C0626q c0626q, final int i6) {
        C0626q c0626q2;
        String j3;
        String j4;
        T.X x5;
        int i7;
        T.X x6;
        T.X x7;
        G2.d dVar2;
        Object obj;
        boolean z5;
        int i8;
        int i9;
        AbstractC1276k.f(interfaceC1193a, "onBackClick");
        AbstractC1276k.f(interfaceC1193a2, "onModelConfigClick");
        AbstractC1276k.f(interfaceC1193a3, "onModelServiceClick");
        AbstractC1276k.f(interfaceC1193a4, "onSearchServiceClick");
        AbstractC1276k.f(interfaceC1193a5, "onMcpClick");
        AbstractC1276k.f(interfaceC1193a6, "onAboutClick");
        c0626q.d0(-1777955448);
        int i10 = i6 | (c0626q.h(interfaceC1193a) ? 4 : 2) | (c0626q.h(interfaceC1193a2) ? 32 : 16) | (c0626q.h(interfaceC1193a3) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(interfaceC1193a4) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.h(interfaceC1193a5) ? 16384 : 8192) | (c0626q.h(interfaceC1193a6) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS) | (c0626q.h(dVar) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT);
        if (c0626q.S(i10 & 1, (599187 & i10) != 599186)) {
            Object P5 = c0626q.P();
            Object obj2 = C0616l.a;
            if (P5 == obj2) {
                P5 = T.r.A(Boolean.FALSE);
                c0626q.m0(P5);
            }
            T.X x8 = (T.X) P5;
            T.X r5 = Y4.d.r(dVar.f1655d, c0626q);
            T.X r6 = Y4.d.r(dVar.f1657f, c0626q);
            boolean d6 = c0626q.d(((G2.e) r5.getValue()).ordinal());
            Object P6 = c0626q.P();
            if (d6 || P6 == obj2) {
                P6 = T.r.A((G2.e) r5.getValue());
                c0626q.m0(P6);
            }
            T.X x9 = (T.X) P6;
            Object P7 = c0626q.P();
            if (P7 == obj2) {
                P7 = T.r.A(Boolean.FALSE);
                c0626q.m0(P7);
            }
            T.X x10 = (T.X) P7;
            WeakHashMap weakHashMap = v.G0.f15220w;
            float f6 = 56;
            float c6 = AbstractC1787b.j(C1810p.f(c0626q).f15225f, c0626q).c() + f6;
            int ordinal = ((G2.e) r5.getValue()).ordinal();
            if (ordinal == 0) {
                j3 = B3.e.j(c0626q, 781828877, R.string.theme_system, c0626q, false);
            } else if (ordinal == 1) {
                j3 = B3.e.j(c0626q, 781830956, R.string.theme_light, c0626q, false);
            } else {
                if (ordinal != 2) {
                    c0626q.b0(781827459);
                    c0626q.p(false);
                    throw new RuntimeException();
                }
                j3 = B3.e.j(c0626q, 781832971, R.string.theme_dark, c0626q, false);
            }
            int ordinal2 = ((G2.a) r6.getValue()).ordinal();
            if (ordinal2 == 0) {
                j4 = B3.e.j(c0626q, 781836848, R.string.language_system, c0626q, false);
            } else if (ordinal2 == 1) {
                j4 = B3.e.j(c0626q, 781839057, R.string.language_chinese, c0626q, false);
            } else {
                if (ordinal2 != 2) {
                    c0626q.b0(781835382);
                    c0626q.p(false);
                    throw new RuntimeException();
                }
                j4 = B3.e.j(c0626q, 781841297, R.string.language_english, c0626q, false);
            }
            C1818y c1818y = v.t0.f15349c;
            InterfaceC1041r f7 = AbstractC1464z.f(c1818y, ((Q.N) c0626q.j(Q.O.a)).f5424n, o0.y.f13496b);
            C1033j c1033j = C1026c.f11786c;
            F0.V d7 = AbstractC1806l.d(c1033j, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, f7);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d7, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c7, C0150g.f1926d);
            C1810p c1810p = C1810p.f15333b;
            float f8 = 20;
            v.k0 k0Var = new v.k0(f8, c6 + 12, f8, f8);
            C1795f g3 = AbstractC1799h.g(16);
            boolean f9 = ((i10 & 896) == 256) | ((i10 & 112) == 32) | ((i10 & 7168) == 2048) | ((i10 & 57344) == 16384) | c0626q.f(j3) | c0626q.f(j4) | ((458752 & i10) == 131072);
            Object P8 = c0626q.P();
            if (f9 || P8 == obj2) {
                String str = j4;
                x5 = x9;
                i7 = i10;
                C0638w0 c0638w0 = new C0638w0(interfaceC1193a3, interfaceC1193a2, interfaceC1193a4, interfaceC1193a5, j3, str, x8, x10, interfaceC1193a6);
                x6 = x10;
                x7 = x8;
                c0626q.m0(c0638w0);
                P8 = c0638w0;
            } else {
                i7 = i10;
                x6 = x10;
                x5 = x9;
                x7 = x8;
            }
            T.X x11 = x5;
            AbstractC1118b.a(c1818y, null, k0Var, g3, null, null, false, null, (l4.c) P8, c0626q, 24582, 490);
            R(h5.e.j0(R.string.settings_title, c0626q), h5.e.j0(R.string.settings_back, c0626q), c6, f6, interfaceC1193a, null, c1810p.e(C1038o.a, c1033j), c0626q, ((i7 << 12) & 57344) | 3072, 32);
            c0626q2 = c0626q;
            if (((Boolean) x7.getValue()).booleanValue()) {
                c0626q2.b0(-683570979);
                List I5 = Y4.l.I(new X3.i(G2.e.f1658c, h5.e.j0(R.string.theme_system, c0626q2)), new X3.i(G2.e.f1659e, h5.e.j0(R.string.theme_light, c0626q2)), new X3.i(G2.e.f1660f, h5.e.j0(R.string.theme_dark, c0626q2)));
                String j02 = h5.e.j0(R.string.theme_dialog_title, c0626q2);
                G2.e eVar = (G2.e) x11.getValue();
                boolean f10 = c0626q2.f(x11);
                Object P9 = c0626q2.P();
                obj = obj2;
                if (f10 || P9 == obj) {
                    i9 = 12;
                    P9 = new A0(x11, 12);
                    c0626q2.m0(P9);
                } else {
                    i9 = 12;
                }
                l4.c cVar = (l4.c) P9;
                int i11 = i7 & 3670016;
                i8 = PegdownExtensions.RELAXEDHRULES;
                dVar2 = dVar;
                boolean f11 = (i11 == 1048576 || c0626q2.h(dVar2)) | c0626q2.f(x11);
                Object P10 = c0626q2.P();
                if (f11 || P10 == obj) {
                    P10 = new A.g(dVar2, x11, x7, i9);
                    c0626q2.m0(P10);
                }
                InterfaceC1193a interfaceC1193a7 = (InterfaceC1193a) P10;
                Object P11 = c0626q2.P();
                if (P11 == obj) {
                    P11 = new D.C(x7, 27);
                    c0626q2.m0(P11);
                }
                e(j02, I5, eVar, cVar, interfaceC1193a7, (InterfaceC1193a) P11, c0626q2, PegdownExtensions.SUPPRESS_ALL_HTML);
                z5 = false;
            } else {
                dVar2 = dVar;
                obj = obj2;
                z5 = false;
                i8 = PegdownExtensions.RELAXEDHRULES;
                c0626q2.b0(-690894016);
            }
            c0626q2.p(z5);
            if (((Boolean) x6.getValue()).booleanValue()) {
                c0626q2.b0(-682727593);
                Context context = (Context) c0626q2.j(AndroidCompositionLocals_androidKt.f10780b);
                boolean d8 = c0626q2.d(((G2.a) r6.getValue()).ordinal());
                Object P12 = c0626q2.P();
                if (d8 || P12 == obj) {
                    P12 = T.r.A((G2.a) r6.getValue());
                    c0626q2.m0(P12);
                }
                T.X x12 = (T.X) P12;
                List I6 = Y4.l.I(new X3.i(G2.a.f1647f, h5.e.j0(R.string.language_system, c0626q2)), new X3.i(G2.a.f1648g, h5.e.j0(R.string.language_chinese, c0626q2)), new X3.i(G2.a.f1649h, h5.e.j0(R.string.language_english, c0626q2)));
                String j03 = h5.e.j0(R.string.language_dialog_title, c0626q2);
                G2.a aVar = (G2.a) x12.getValue();
                boolean f12 = c0626q2.f(x12);
                Object P13 = c0626q2.P();
                if (f12 || P13 == obj) {
                    P13 = new A0(x12, 13);
                    c0626q2.m0(P13);
                }
                l4.c cVar2 = (l4.c) P13;
                boolean f13 = c0626q2.f(x12) | (((i7 & 3670016) == i8 || c0626q2.h(dVar2)) ? true : z5) | c0626q2.h(context);
                Object P14 = c0626q2.P();
                if (f13 || P14 == obj) {
                    P2.J0 j04 = new P2.J0((Object) dVar2, (Object) context, (Object) x12, (T.d1) x6, 7);
                    c0626q2.m0(j04);
                    P14 = j04;
                }
                InterfaceC1193a interfaceC1193a8 = (InterfaceC1193a) P14;
                Object P15 = c0626q2.P();
                if (P15 == obj) {
                    P15 = new D.C(x6, 28);
                    c0626q2.m0(P15);
                }
                e(j03, I6, aVar, cVar2, interfaceC1193a8, (InterfaceC1193a) P15, c0626q2, PegdownExtensions.SUPPRESS_ALL_HTML);
            } else {
                c0626q2.b0(-690894016);
            }
            c0626q2.p(z5);
            c0626q2.p(true);
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(interfaceC1193a2, interfaceC1193a3, interfaceC1193a4, interfaceC1193a5, interfaceC1193a6, dVar, i6) { // from class: Z2.d1

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f10180e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f10181f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f10182g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f10183h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f10184i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ G2.d f10185j;

                @Override // l4.e
                public final Object m(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int J4 = T.r.J(2097153);
                    AbstractC0783w.N(InterfaceC1193a.this, this.f10180e, this.f10181f, this.f10182g, this.f10183h, this.f10184i, this.f10185j, (C0626q) obj3, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void O(List list, InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6) {
        C0626q c0626q2;
        c0626q.d0(-599046186);
        int i7 = (c0626q.h(list) ? 4 : 2) | i6 | 48;
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            c0626q2 = c0626q;
            R1.c(v.t0.a, g1.a, null, null, AbstractC0874g.c(1609096264, new U2.l(list, 2), c0626q), c0626q2, 196656, 28);
            interfaceC1041r = C1038o.a;
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new U2.m(list, interfaceC1041r, i6, 1);
        }
    }

    public static final void P(f1 f1Var, C0626q c0626q, int i6) {
        InterfaceC1041r interfaceC1041r;
        long j3;
        boolean z5;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(f1Var, "item");
        c0626q2.d0(-1460409646);
        int i7 = i6 | (c0626q2.f(f1Var) ? 4 : 2);
        if (c0626q2.S(i7 & 1, (i7 & 3) != 2)) {
            InterfaceC1193a interfaceC1193a = f1Var.f10207e;
            C1038o c1038o = C1038o.a;
            if (interfaceC1193a != null) {
                c0626q2.b0(955068651);
                boolean z6 = (i7 & 14) == 4;
                Object P5 = c0626q2.P();
                if (z6 || P5 == C0616l.a) {
                    P5 = new Y3.l(f1Var, 5);
                    c0626q2.m0(P5);
                }
                interfaceC1041r = AbstractC1992b.a(31, c1038o, (InterfaceC1193a) P5, false);
                c0626q2.p(false);
            } else {
                c0626q2.b0(955141656);
                c0626q2.p(false);
                interfaceC1041r = c1038o;
            }
            o0.s sVar = f1Var.f10206d;
            if (sVar == null) {
                c0626q2.b0(1000645442);
                j3 = ((Q.N) c0626q2.j(Q.O.a)).f5429s;
                c0626q2.p(false);
            } else {
                c0626q2.b0(1000643954);
                c0626q2.p(false);
                j3 = sVar.a;
            }
            long j4 = j3;
            float f6 = 14;
            InterfaceC1041r z7 = AbstractC1787b.z(v.t0.a.c(interfaceC1041r), 16, f6);
            v.p0 a6 = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q2, 48);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, z7);
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
            AbstractC1688b L5 = Y3.C.L(f1Var.a, 0, c0626q2);
            String str = f1Var.f10204b;
            InterfaceC1041r j5 = v.t0.j(c1038o, 24);
            T.e1 e1Var = Q.O.a;
            Q.A0.a(L5, str, j5, ((Q.N) c0626q2.j(e1Var)).f5427q, c0626q2, 392, 0);
            AbstractC1787b.h(c0626q2, v.t0.n(c1038o, f6));
            C1813t a7 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q2, 0);
            int hashCode2 = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l5 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, c1038o);
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
            String str2 = f1Var.f10204b;
            T.e1 e1Var2 = u3.a;
            f3.b(str2, null, ((Q.N) c0626q2.j(e1Var)).f5427q, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(e1Var2)).f6127h, c0626q, 0, 0, 131066);
            c0626q2 = c0626q;
            String str3 = f1Var.f10205c;
            if (str3 == null || AbstractC1776n.Q(str3)) {
                z5 = false;
                c0626q2.b0(-457887478);
            } else {
                c0626q2.b0(-454745473);
                f3.b(f1Var.f10205c, null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q2.j(e1Var2)).f6131l, c0626q, 0, 0, 131066);
                c0626q2 = c0626q;
                z5 = false;
            }
            c0626q2.p(z5);
            c0626q2.p(true);
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new B4.D(i6, 24, f1Var);
        }
    }

    public static final void Q(String str, C0626q c0626q, int i6) {
        AbstractC1276k.f(str, Attribute.TITLE_ATTR);
        c0626q.d0(1537853344);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2);
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            f3.b(str, AbstractC1787b.C(C1038o.a, 8, S.l.f7374V, S.l.f7374V, S.l.f7374V, 14), ((Q.N) c0626q.j(Q.O.a)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q.j(u3.a)).f6128i, c0626q, (i7 & 14) | 48, 0, 131064);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new K(str, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(final java.lang.String r49, final java.lang.String r50, final float r51, final float r52, final l4.InterfaceC1193a r53, l4.e r54, final h0.InterfaceC1041r r55, T.C0626q r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.AbstractC0783w.R(java.lang.String, java.lang.String, float, float, l4.a, l4.e, h0.r, T.q, int, int):void");
    }

    public static final void S(List list, String str, l4.c cVar, C0626q c0626q, int i6) {
        T.X x5;
        c0626q.d0(-1553705082);
        int i7 = i6 | (c0626q.h(list) ? 4 : 2) | (c0626q.f(str) ? 32 : 16) | (c0626q.h(cVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = T.r.A(Boolean.FALSE);
                c0626q.m0(P5);
            }
            T.X x6 = (T.X) P5;
            C0483x1 c0483x1 = C0483x1.a;
            long c6 = o0.s.c(0.6f, R1.r(c0626q).f5428r);
            long c7 = o0.s.c(0.45f, R1.r(c0626q).f5428r);
            long j3 = R1.r(c0626q).f5427q;
            long j4 = R1.r(c0626q).f5427q;
            long j5 = R1.r(c0626q).f5429s;
            long j6 = R1.r(c0626q).f5429s;
            long j7 = R1.r(c0626q).f5429s;
            long j8 = R1.r(c0626q).f5429s;
            long j9 = o0.s.f13481h;
            b3 a6 = C0483x1.d((Q.N) c0626q.j(Q.O.a), c0626q).a(j3, j4, j9, j9, c6, c7, j9, j9, j9, j9, null, j9, j9, j9, j9, j9, j9, j9, j9, j7, j8, j9, j9, j5, j6, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9, j9);
            boolean booleanValue = ((Boolean) x6.getValue()).booleanValue();
            Object P6 = c0626q.P();
            if (P6 == c0602e) {
                x5 = x6;
                P6 = new C0103y(x5, 16);
                c0626q.m0(P6);
            } else {
                x5 = x6;
            }
            AbstractC0451p0.a(booleanValue, (l4.c) P6, null, AbstractC0874g.c(671989552, new C0533m(str, a6, x5, list, cVar), c0626q), c0626q, 3120);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.L(list, str, cVar, i6, 10);
        }
    }

    public static final boolean T(String str) {
        Object b5;
        String obj = AbstractC1776n.l0(str).toString();
        if (obj.length() == 0) {
            return true;
        }
        try {
            b5 = E2.b.a.c(obj);
        } catch (Throwable th) {
            b5 = X3.a.b(th);
        }
        if (b5 instanceof X3.k) {
            b5 = null;
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) b5;
        if (bVar == null) {
            return false;
        }
        return bVar instanceof kotlinx.serialization.json.c;
    }

    public static final boolean U(String str) {
        Object b5;
        String obj = AbstractC1776n.l0(str).toString();
        if (obj.length() == 0) {
            return true;
        }
        try {
            b5 = E2.b.a.c(obj);
        } catch (Throwable th) {
            b5 = X3.a.b(th);
        }
        if (b5 instanceof X3.k) {
            b5 = null;
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) b5;
        if (bVar != null) {
            kotlinx.serialization.json.c cVar = bVar instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar : null;
            if (cVar != null) {
                Collection<kotlinx.serialization.json.b> values = cVar.f12633c.values();
                if ((values instanceof Collection) && values.isEmpty()) {
                    return true;
                }
                for (kotlinx.serialization.json.b bVar2 : values) {
                    kotlinx.serialization.json.d dVar = bVar2 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar2 : null;
                    if (dVar != null && !(dVar instanceof JsonNull)) {
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean V(Integer num) {
        return Y3.m.j0(Y3.k.C0(new Integer[]{Integer.valueOf(R.drawable.grok), Integer.valueOf(R.drawable.groq), Integer.valueOf(R.drawable.openai), Integer.valueOf(R.drawable.ollama), Integer.valueOf(R.drawable.openrouter), Integer.valueOf(R.drawable.xiaomimimo), Integer.valueOf(R.drawable.mingcute_ai_fill)}), num);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013a, code lost:
    
        if (r1.equals("claude") == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0154, code lost:
    
        return java.lang.Integer.valueOf(com.tencent.mmkv.R.drawable.claude);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
    
        if (r1.equals("anthropic") == false) goto L90;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer W(java.lang.String r1) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.AbstractC0783w.W(java.lang.String):java.lang.Integer");
    }

    public static final int X(D2.e eVar) {
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return R.string.search_service_bing_title;
        }
        if (ordinal == 1) {
            return R.string.search_service_ollama_title;
        }
        if (ordinal == 2) {
            return R.string.search_service_metaso_title;
        }
        if (ordinal == 3) {
            return R.string.search_service_exa_title;
        }
        throw new RuntimeException();
    }

    public static final void a(InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        int i7;
        int i8;
        AbstractC1276k.f(interfaceC1193a, "onBackClick");
        c0626q.d0(560677503);
        int i9 = i6 | (c0626q.h(interfaceC1193a) ? 4 : 2);
        if (c0626q.S(i9 & 1, (i9 & 3) != 2)) {
            C0172a0 c0172a0 = (C0172a0) c0626q.j(AbstractC0204q0.f2368r);
            Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
            WeakHashMap weakHashMap = v.G0.f15220w;
            float f6 = 56;
            float c6 = AbstractC1787b.j(C1810p.f(c0626q).f15225f, c0626q).c() + f6;
            C1818y c1818y = v.t0.f15349c;
            InterfaceC1041r f7 = AbstractC1464z.f(c1818y, ((Q.N) c0626q.j(Q.O.a)).f5424n, o0.y.f13496b);
            C1033j c1033j = C1026c.f11786c;
            F0.V d6 = AbstractC1806l.d(c1033j, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, f7);
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
            T.r.G(c0626q, c7, C0150g.f1926d);
            C1810p c1810p = C1810p.f15333b;
            float f8 = 20;
            v.k0 k0Var = new v.k0(f8, c6 + 12, f8, f8);
            C1795f g3 = AbstractC1799h.g(16);
            boolean h3 = c0626q.h(c0172a0) | c0626q.h(context);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new C0086p(29, c0172a0, context);
                c0626q.m0(P5);
            }
            AbstractC1118b.a(c1818y, null, k0Var, g3, null, null, false, null, (l4.c) P5, c0626q, 24582, 490);
            i7 = i6;
            i8 = 4;
            R(h5.e.j0(R.string.settings_about, c0626q), h5.e.j0(R.string.settings_back, c0626q), c6, f6, interfaceC1193a, null, c1810p.e(C1038o.a, c1033j), c0626q, ((i9 << 12) & 57344) | 3072, 32);
            c0626q.p(true);
        } else {
            i7 = i6;
            i8 = 4;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0522b(i7, i8, interfaceC1193a);
        }
    }

    public static final void b(LLMSetting lLMSetting, boolean z5, InterfaceC1041r interfaceC1041r, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        c0626q.d0(-355470562);
        int i7 = i6 | (c0626q.f(lLMSetting) ? 4 : 2) | (c0626q.g(z5) ? 32 : 16) | (c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(interfaceC1193a) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            boolean z6 = true;
            C.d dVar = g1.a;
            InterfaceC1041r c6 = l0.h.c(interfaceC1041r, dVar);
            if ((i7 & 7168) != 2048) {
                z6 = false;
            }
            Object P5 = c0626q.P();
            if (z6 || P5 == C0616l.a) {
                P5 = new C0348d(20, interfaceC1193a);
                c0626q.m0(P5);
            }
            R1.c(AbstractC1992b.a(31, c6, (InterfaceC1193a) P5, false), dVar, null, null, AbstractC0874g.c(-519541616, new C0310h(lLMSetting, z5, 1), c0626q), c0626q, PegdownExtensions.SUPPRESS_ALL_HTML, 28);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new Q2.g(lLMSetting, z5, interfaceC1041r, interfaceC1193a, i6, 5);
        }
    }

    public static final void c(InterfaceC1041r interfaceC1041r, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, C0626q c0626q, int i6) {
        InterfaceC1193a interfaceC1193a3;
        c0626q.d0(687000167);
        int i7 = i6 | (c0626q.f(interfaceC1041r) ? 4 : 2) | (c0626q.h(interfaceC1193a) ? 32 : 16) | (c0626q.h(interfaceC1193a2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            InterfaceC1041r A5 = AbstractC1787b.A(16, S.l.f7374V, 2, interfaceC1041r);
            v.p0 a6 = v.o0.a(AbstractC1799h.g(12), C1026c.f11796n, c0626q, 54);
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
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q, a6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q, c6, c0146e4);
            float f6 = 48;
            C1038o c1038o = C1038o.a;
            InterfaceC1041r j3 = v.t0.j(c1038o, f6);
            long d6 = o0.y.d(4278221567L);
            C.d dVar = C.e.a;
            InterfaceC1041r c7 = l0.h.c(AbstractC1464z.f(j3, d6, dVar), dVar);
            boolean z5 = (i7 & 112) == 32;
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (z5 || P5 == c0602e) {
                P5 = new C0348d(21, interfaceC1193a);
                c0626q.m0(P5);
            }
            InterfaceC1041r a7 = AbstractC1992b.a(31, c7, (InterfaceC1193a) P5, false);
            C1033j c1033j = C1026c.f11790h;
            F0.V d7 = AbstractC1806l.d(c1033j, false);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q, a7);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d7, c0146e);
            T.r.G(c0626q, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c8, c0146e4);
            AbstractC1688b L5 = Y3.C.L(R.drawable.outline_content_copy_24, 0, c0626q);
            String j02 = h5.e.j0(R.string.bot_copy, c0626q);
            long j4 = o0.s.f13477d;
            float f7 = 22;
            Q.A0.a(L5, j02, v.t0.j(c1038o, f7), j4, c0626q, 3464, 0);
            c0626q.p(true);
            InterfaceC1041r c9 = l0.h.c(AbstractC1464z.f(v.t0.j(c1038o, f6), o0.y.d(4294916912L), dVar), dVar);
            boolean z6 = (i7 & 896) == 256;
            Object P6 = c0626q.P();
            if (z6 || P6 == c0602e) {
                interfaceC1193a3 = interfaceC1193a2;
                P6 = new C0348d(22, interfaceC1193a3);
                c0626q.m0(P6);
            } else {
                interfaceC1193a3 = interfaceC1193a2;
            }
            InterfaceC1041r a8 = AbstractC1992b.a(31, c9, (InterfaceC1193a) P6, false);
            F0.V d8 = AbstractC1806l.d(c1033j, false);
            int hashCode3 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l6 = c0626q.l();
            InterfaceC1041r c10 = AbstractC1024a.c(c0626q, a8);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d8, c0146e);
            T.r.G(c0626q, l6, c0146e2);
            AbstractC1135a.n(hashCode3, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c10, c0146e4);
            Q.A0.a(Y3.C.L(R.drawable.delete, 0, c0626q), h5.e.j0(R.string.bot_delete, c0626q), v.t0.j(c1038o, f7), j4, c0626q, 3464, 0);
            c0626q.p(true);
            c0626q.p(true);
        } else {
            interfaceC1193a3 = interfaceC1193a2;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.L(interfaceC1041r, interfaceC1193a, interfaceC1193a3, i6, 7);
        }
    }

    public static final void d(EnumC0731u enumC0731u, String str, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-977148221);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.d(enumC0731u.ordinal()) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(str) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            AbstractC1244z.c(enumC0731u != EnumC0731u.f9773c, null, AbstractC1205L.b(null, 3).a(AbstractC1205L.a(null, 15)), AbstractC1205L.c(null, 3).a(AbstractC1205L.d(null, 15)), null, AbstractC0874g.c(510789867, new D.Q0(8, enumC0731u, str), c0626q), c0626q, 200064, 18);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(i6, 8, enumC0731u, str);
        }
    }

    public static final void e(String str, List list, Object obj, l4.c cVar, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, C0626q c0626q, int i6) {
        InterfaceC1193a interfaceC1193a3;
        C0626q c0626q2;
        InterfaceC1193a interfaceC1193a4;
        l4.c cVar2;
        Object obj2;
        List list2;
        String str2;
        AbstractC1276k.f(str, Attribute.TITLE_ATTR);
        AbstractC1276k.f(cVar, "onOptionSelected");
        AbstractC1276k.f(interfaceC1193a, "onConfirm");
        AbstractC1276k.f(interfaceC1193a2, "onCancel");
        c0626q.d0(58675316);
        int i7 = (c0626q.f(str) ? 4 : 2) | i6 | (c0626q.h(list) ? 32 : 16) | (c0626q.f(obj) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(cVar) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.h(interfaceC1193a) ? 16384 : 8192);
        if (c0626q.S(i7 & 1, (74899 & i7) != 74898)) {
            e1 e1Var = new e1(str, list, obj, cVar, interfaceC1193a2, interfaceC1193a);
            str2 = str;
            list2 = list;
            obj2 = obj;
            cVar2 = cVar;
            interfaceC1193a3 = interfaceC1193a2;
            interfaceC1193a4 = interfaceC1193a;
            c0626q2 = c0626q;
            AbstractC1087g.c(interfaceC1193a3, null, AbstractC0874g.c(-343624309, e1Var, c0626q), c0626q2, 390, 2);
        } else {
            interfaceC1193a3 = interfaceC1193a2;
            c0626q2 = c0626q;
            interfaceC1193a4 = interfaceC1193a;
            cVar2 = cVar;
            obj2 = obj;
            list2 = list;
            str2 = str;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new e1(str2, list2, obj2, cVar2, interfaceC1193a4, interfaceC1193a3, i6);
        }
    }

    public static final void f(final boolean z5, final String str, final l4.c cVar, final l4.e eVar, final boolean z6, C0626q c0626q, final int i6) {
        c0626q.d0(1393790213);
        int i7 = i6 | (c0626q.g(z5) ? 4 : 2) | (c0626q.f(str) ? 32 : 16) | (c0626q.g(z6) ? 16384 : 8192);
        if (c0626q.S(i7 & 1, (i7 & 9363) != 9362)) {
            InterfaceC1041r A5 = AbstractC1787b.A(S.l.f7374V, 8, 1, v.t0.a);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = new C0745c0(0, eVar);
                c0626q.m0(P5);
            }
            InterfaceC1041r m3 = AbstractC0137z.m(A5, (l4.c) P5);
            boolean z7 = ((57344 & i7) == 16384) | ((i7 & 14) == 4);
            Object P6 = c0626q.P();
            if (z7 || P6 == c0602e) {
                P6 = new C0298b(z6, z5, cVar);
                c0626q.m0(P6);
            }
            InterfaceC1041r s5 = AbstractC1249d.s(m3, (l4.c) P6);
            Object P7 = c0626q.P();
            if (P7 == c0602e) {
                P7 = new S2.Y(14);
                c0626q.m0(P7);
            }
            int i8 = i7 >> 3;
            D1.a(str, (l4.c) P7, s5, z6, true, null, f10384C, f10385D, null, f10386E, null, false, null, null, null, false, 0, 0, null, null, c0626q, (i8 & 14) | 819486768 | (i8 & 7168), 0, 8387872);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(z5, str, cVar, eVar, z6, i6) { // from class: Z2.d0

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f10174c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f10175e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ l4.c f10176f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ l4.e f10177g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f10178h;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(3457);
                    AbstractC0783w.f(this.f10174c, this.f10175e, this.f10176f, this.f10177g, this.f10178h, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void g(InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, boolean z5, C0626q c0626q, int i6) {
        c0626q.d0(1309391386);
        int i7 = i6 | (c0626q.h(interfaceC1193a) ? 4 : 2) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            R1.a(interfaceC1193a2, AbstractC0874g.c(-1466531630, new C0524d(interfaceC1193a, z5, 2), c0626q), null, AbstractC0874g.c(-2006961136, new C0522b(5, interfaceC1193a2), c0626q), f10417f, f10419g, null, 0L, 0L, 0L, 0L, S.l.f7374V, null, c0626q, 1772598);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0525e(interfaceC1193a, interfaceC1193a2, z5, i6, 1);
        }
    }

    public static final void h(String str, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, C0626q c0626q, int i6) {
        c0626q.d0(-446584127);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.h(interfaceC1193a) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            R1.a(interfaceC1193a2, AbstractC0874g.c(-813224695, new C0522b(7, interfaceC1193a), c0626q), null, AbstractC0874g.c(-969205237, new C0522b(8, interfaceC1193a2), c0626q), f10443t, AbstractC0874g.c(-1203176050, new K(str, 1, (byte) 0), c0626q), null, 0L, 0L, 0L, 0L, S.l.f7374V, null, c0626q, 1772598);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.L(str, interfaceC1193a, interfaceC1193a2, i6, 12);
        }
    }

    public static final void i(String str, boolean z5, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, C0626q c0626q, int i6) {
        c0626q.d0(2095402304);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.g(z5) ? 32 : 16) | (c0626q.h(interfaceC1193a) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            boolean z6 = (i7 & 112) == 32;
            Object P5 = c0626q.P();
            if (z6 || P5 == C0616l.a) {
                P5 = new O0(z5, interfaceC1193a2, 0);
                c0626q.m0(P5);
            }
            R1.a((InterfaceC1193a) P5, AbstractC0874g.c(454060424, new C0524d(interfaceC1193a, z5, 4), c0626q), null, AbstractC0874g.c(952617226, new C0524d(interfaceC1193a2, z5, 5), c0626q), f10406Y, AbstractC0874g.c(1700452429, new K(str, 11, (byte) 0), c0626q), null, 0L, 0L, 0L, 0L, S.l.f7374V, null, c0626q, 1772592);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new Q2.g((Object) str, z5, interfaceC1193a, interfaceC1193a2, i6, 6);
        }
    }

    public static final void j(C c6, l4.c cVar, l4.c cVar2, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        c0626q.d0(915756980);
        int i7 = i6 | (c0626q.f(c6) ? 4 : 2) | (c0626q.h(cVar) ? 32 : 16) | (c0626q.h(cVar2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(interfaceC1193a) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = new A.d();
                c0626q.m0(P5);
            }
            A.d dVar = (A.d) P5;
            Object P6 = c0626q.P();
            if (P6 == c0602e) {
                P6 = T.r.p(c0626q);
                c0626q.m0(P6);
            }
            R1.c(A.e.a(v.t0.a, dVar), g1.a, null, null, AbstractC0874g.c(30980610, new P2.B(c6, (InterfaceC1942y) P6, dVar, cVar, cVar2, interfaceC1193a), c0626q), c0626q, PegdownExtensions.SUPPRESS_ALL_HTML, 28);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new K.d(c6, cVar, cVar2, interfaceC1193a, i6, 4);
        }
    }

    public static final void k(C0818g c0818g, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        AbstractC1276k.f(c0818g, "mcpViewModel");
        AbstractC1276k.f(interfaceC1193a, "onBackClick");
        c0626q.d0(633725281);
        int i7 = (c0626q.h(c0818g) ? 4 : 2) | i6 | (c0626q.h(interfaceC1193a) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            int i8 = i7 & 14;
            boolean z5 = i8 == 4 || c0626q.h(c0818g);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (z5 || P5 == c0602e) {
                P5 = new F(c0818g, 0);
                c0626q.m0(P5);
            }
            T.r.d(X3.y.a, (l4.c) P5, c0626q);
            String j02 = h5.e.j0(R.string.mcp_add_title, c0626q);
            boolean z6 = (i8 == 4 || c0626q.h(c0818g)) | ((i7 & 112) == 32);
            Object P6 = c0626q.P();
            if (z6 || P6 == c0602e) {
                P6 = new G(c0818g, interfaceC1193a, 0);
                c0626q.m0(P6);
            }
            int i9 = i7 << 6;
            m(j02, null, c0818g, interfaceC1193a, (l4.c) P6, c0626q, (i9 & 896) | 560 | (i9 & 7168));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new I.m(i6, 13, c0818g, interfaceC1193a);
        }
    }

    public static final void l(C0818g c0818g, String str, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        Object obj;
        AbstractC1276k.f(c0818g, "mcpViewModel");
        AbstractC1276k.f(interfaceC1193a, "onBackClick");
        c0626q.d0(1981177605);
        int i7 = i6 | (c0626q.h(c0818g) ? 4 : 2) | (c0626q.f(str) ? 32 : 16) | (c0626q.h(interfaceC1193a) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            T.X r5 = Y4.d.r(c0818g.f10658d, c0626q);
            boolean f6 = ((i7 & 112) == 32) | c0626q.f((List) r5.getValue());
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (f6 || P5 == c0602e) {
                Iterator it = ((List) r5.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (AbstractC1276k.b(((McpServer) obj).a, str)) {
                            break;
                        }
                    }
                }
                P5 = (McpServer) obj;
                c0626q.m0(P5);
            }
            McpServer mcpServer = (McpServer) P5;
            int i8 = i7 & 14;
            boolean z5 = i8 == 4 || c0626q.h(c0818g);
            Object P6 = c0626q.P();
            if (z5 || P6 == c0602e) {
                P6 = new F(c0818g, 1);
                c0626q.m0(P6);
            }
            T.r.d(X3.y.a, (l4.c) P6, c0626q);
            String j02 = h5.e.j0(R.string.mcp_edit_title, c0626q);
            boolean z6 = (i8 == 4 || c0626q.h(c0818g)) | ((i7 & 896) == 256);
            Object P7 = c0626q.P();
            if (z6 || P7 == c0602e) {
                P7 = new G(c0818g, interfaceC1193a, 1);
                c0626q.m0(P7);
            }
            McpServer.Companion companion = McpServer.Companion;
            m(j02, mcpServer, c0818g, interfaceC1193a, (l4.c) P7, c0626q, ((i7 << 3) & 7168) | ((i7 << 6) & 896) | 576);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.L(c0818g, str, interfaceC1193a, i6, 9);
        }
    }

    public static final void m(String str, final McpServer mcpServer, C0818g c0818g, InterfaceC1193a interfaceC1193a, final l4.c cVar, C0626q c0626q, int i6) {
        int i7;
        C0626q c0626q2;
        T.X x5;
        List list;
        Object obj;
        Object o5;
        final McpServer mcpServer2;
        X.c cVar2;
        T.X x6;
        String str2;
        T.X x7;
        int i8;
        Object obj2;
        final C0996s c0996s;
        T.X x8;
        final T.X x9;
        C0626q c0626q3 = c0626q;
        c0626q3.d0(1044479229);
        if ((i6 & 6) == 0) {
            i7 = (c0626q3.f(str) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= (i6 & 64) == 0 ? c0626q3.f(mcpServer) : c0626q3.h(mcpServer) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= (i6 & PegdownExtensions.STRIKETHROUGH) == 0 ? c0626q3.f(c0818g) : c0626q3.h(c0818g) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q3.h(interfaceC1193a) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q3.h(cVar) ? 16384 : 8192;
        }
        final int i9 = 1;
        final int i10 = 0;
        if (c0626q3.S(i7 & 1, (i7 & 9363) != 9362)) {
            Object[] objArr = {mcpServer != null ? mcpServer.a : null};
            int i11 = i7 & 112;
            boolean z5 = i11 == 32 || ((i7 & 64) != 0 && c0626q3.h(mcpServer));
            Object P5 = c0626q3.P();
            Object obj3 = C0616l.a;
            if (z5 || P5 == obj3) {
                P5 = new InterfaceC1193a() { // from class: Z2.H
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        String str3;
                        int i12 = i10;
                        String str4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                        McpServer mcpServer3 = mcpServer;
                        switch (i12) {
                            case 0:
                                return T.r.A(Boolean.valueOf(mcpServer3 != null ? mcpServer3.f11212b : true));
                            case 1:
                                str3 = mcpServer3 != null ? mcpServer3.f11213c : null;
                                if (str3 != null) {
                                    str4 = str3;
                                }
                                return T.r.A(str4);
                            case 2:
                                List list2 = D2.a.a;
                                String str5 = mcpServer3 != null ? mcpServer3.f11214d : null;
                                AbstractC1276k.b(str5 != null ? AbstractC1776n.l0(str5).toString() : null, "Streamable HTTP");
                                return T.r.A("Streamable HTTP");
                            default:
                                str3 = mcpServer3 != null ? mcpServer3.f11215e : null;
                                if (str3 != null) {
                                    str4 = str3;
                                }
                                return T.r.A(str4);
                        }
                    }
                };
                c0626q3.m0(P5);
            }
            T.X x10 = (T.X) e0.l.e(objArr, (InterfaceC1193a) P5, c0626q3, 0);
            Object[] objArr2 = {mcpServer != null ? mcpServer.a : null};
            boolean z6 = i11 == 32 || ((i7 & 64) != 0 && c0626q3.h(mcpServer));
            Object P6 = c0626q3.P();
            if (z6 || P6 == obj3) {
                P6 = new InterfaceC1193a() { // from class: Z2.H
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        String str3;
                        int i12 = i9;
                        String str4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                        McpServer mcpServer3 = mcpServer;
                        switch (i12) {
                            case 0:
                                return T.r.A(Boolean.valueOf(mcpServer3 != null ? mcpServer3.f11212b : true));
                            case 1:
                                str3 = mcpServer3 != null ? mcpServer3.f11213c : null;
                                if (str3 != null) {
                                    str4 = str3;
                                }
                                return T.r.A(str4);
                            case 2:
                                List list2 = D2.a.a;
                                String str5 = mcpServer3 != null ? mcpServer3.f11214d : null;
                                AbstractC1276k.b(str5 != null ? AbstractC1776n.l0(str5).toString() : null, "Streamable HTTP");
                                return T.r.A("Streamable HTTP");
                            default:
                                str3 = mcpServer3 != null ? mcpServer3.f11215e : null;
                                if (str3 != null) {
                                    str4 = str3;
                                }
                                return T.r.A(str4);
                        }
                    }
                };
                c0626q3.m0(P6);
            }
            T.X x11 = (T.X) e0.l.e(objArr2, (InterfaceC1193a) P6, c0626q3, 0);
            Object[] objArr3 = {mcpServer != null ? mcpServer.a : null};
            boolean z7 = i11 == 32 || ((i7 & 64) != 0 && c0626q3.h(mcpServer));
            Object P7 = c0626q3.P();
            if (z7 || P7 == obj3) {
                final int i12 = 2;
                P7 = new InterfaceC1193a() { // from class: Z2.H
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        String str3;
                        int i122 = i12;
                        String str4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                        McpServer mcpServer3 = mcpServer;
                        switch (i122) {
                            case 0:
                                return T.r.A(Boolean.valueOf(mcpServer3 != null ? mcpServer3.f11212b : true));
                            case 1:
                                str3 = mcpServer3 != null ? mcpServer3.f11213c : null;
                                if (str3 != null) {
                                    str4 = str3;
                                }
                                return T.r.A(str4);
                            case 2:
                                List list2 = D2.a.a;
                                String str5 = mcpServer3 != null ? mcpServer3.f11214d : null;
                                AbstractC1276k.b(str5 != null ? AbstractC1776n.l0(str5).toString() : null, "Streamable HTTP");
                                return T.r.A("Streamable HTTP");
                            default:
                                str3 = mcpServer3 != null ? mcpServer3.f11215e : null;
                                if (str3 != null) {
                                    str4 = str3;
                                }
                                return T.r.A(str4);
                        }
                    }
                };
                c0626q3.m0(P7);
            }
            T.X x12 = (T.X) e0.l.e(objArr3, (InterfaceC1193a) P7, c0626q3, 0);
            Object[] objArr4 = {mcpServer != null ? mcpServer.a : null};
            boolean z8 = i11 == 32 || ((i7 & 64) != 0 && c0626q3.h(mcpServer));
            Object P8 = c0626q3.P();
            boolean z9 = z8;
            final int i13 = 3;
            if (z9 || P8 == obj3) {
                P8 = new InterfaceC1193a() { // from class: Z2.H
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        String str3;
                        int i122 = i13;
                        String str4 = FlexmarkHtmlConverter.DEFAULT_NODE;
                        McpServer mcpServer3 = mcpServer;
                        switch (i122) {
                            case 0:
                                return T.r.A(Boolean.valueOf(mcpServer3 != null ? mcpServer3.f11212b : true));
                            case 1:
                                str3 = mcpServer3 != null ? mcpServer3.f11213c : null;
                                if (str3 != null) {
                                    str4 = str3;
                                }
                                return T.r.A(str4);
                            case 2:
                                List list2 = D2.a.a;
                                String str5 = mcpServer3 != null ? mcpServer3.f11214d : null;
                                AbstractC1276k.b(str5 != null ? AbstractC1776n.l0(str5).toString() : null, "Streamable HTTP");
                                return T.r.A("Streamable HTTP");
                            default:
                                str3 = mcpServer3 != null ? mcpServer3.f11215e : null;
                                if (str3 != null) {
                                    str4 = str3;
                                }
                                return T.r.A(str4);
                        }
                    }
                };
                c0626q3.m0(P8);
            }
            final T.X x13 = (T.X) e0.l.e(objArr4, (InterfaceC1193a) P8, c0626q3, 0);
            boolean f6 = c0626q3.f(mcpServer != null ? mcpServer.a : null);
            Object P9 = c0626q3.P();
            if (f6 || P9 == obj3) {
                C0996s c0996s2 = new C0996s();
                if (mcpServer != null && (list = mcpServer.f11216f) != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        T.X x14 = x10;
                        McpHeader mcpHeader = (McpHeader) it.next();
                        c0996s2.add(new C(mcpHeader.a, 1, mcpHeader.f11210b));
                        it = it;
                        x10 = x14;
                    }
                }
                x5 = x10;
                c0626q3.m0(c0996s2);
                obj = c0996s2;
            } else {
                x5 = x10;
                obj = P9;
            }
            C0996s c0996s3 = (C0996s) obj;
            Object P10 = c0626q3.P();
            if (P10 == obj3) {
                P10 = D2.a.a;
                c0626q3.m0(P10);
            }
            List list2 = (List) P10;
            T.X r5 = Y4.d.r(c0818g.f10660f, c0626q3);
            String str3 = (String) x12.getValue();
            String str4 = (String) x13.getValue();
            c0996s3.getClass();
            X.c cVar3 = AbstractC0997t.f(c0996s3).f11747c;
            boolean f7 = c0626q3.f(x12) | c0626q3.f(x13) | c0626q3.f(c0996s3) | (i11 == 32 || ((i7 & 64) != 0 && c0626q3.h(mcpServer))) | c0626q3.f(x11) | ((i7 & 896) == 256 || ((i7 & PegdownExtensions.STRIKETHROUGH) != 0 && c0626q3.h(c0818g)));
            Object P11 = c0626q3.P();
            if (f7 || P11 == obj3) {
                mcpServer2 = mcpServer;
                cVar2 = cVar3;
                x6 = r5;
                str2 = str3;
                x7 = x12;
                i8 = i7;
                obj2 = obj3;
                c0996s = c0996s3;
                x8 = x5;
                o5 = new O(c0996s, mcpServer2, c0818g, x7, x13, x11, null);
                x13 = x13;
                x9 = x11;
                c0626q3.m0(o5);
            } else {
                cVar2 = cVar3;
                c0996s = c0996s3;
                x6 = r5;
                str2 = str3;
                x8 = x5;
                x7 = x12;
                i8 = i7;
                o5 = P11;
                obj2 = obj3;
                x9 = x11;
                mcpServer2 = mcpServer;
            }
            T.r.g(str2, str4, cVar2, (l4.e) o5, c0626q3);
            WeakHashMap weakHashMap = v.G0.f15220w;
            float f8 = 56;
            float c6 = AbstractC1787b.j(C1810p.f(c0626q3).f15225f, c0626q3).c() + f8;
            boolean z10 = (AbstractC1776n.Q((String) x9.getValue()) || AbstractC1776n.Q((String) x7.getValue()) || AbstractC1776n.Q((String) x13.getValue())) ? false : true;
            boolean f9 = c0626q3.f(c0996s) | (i11 == 32 || ((i8 & 64) != 0 && c0626q3.h(mcpServer2))) | ((i8 & 57344) == 16384) | c0626q3.f(x8) | c0626q3.f(x9) | c0626q3.f(x7) | c0626q3.f(x13);
            Object P12 = c0626q3.P();
            if (f9 || P12 == obj2) {
                final T.X x15 = x7;
                final T.X x16 = x8;
                Object obj4 = new InterfaceC1193a() { // from class: Z2.I
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        String uuid;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = C0996s.this.listIterator();
                        while (true) {
                            C0162q c0162q = (C0162q) listIterator;
                            if (!c0162q.hasNext()) {
                                break;
                            }
                            C c7 = (C) c0162q.next();
                            String obj5 = AbstractC1776n.l0(c7.f9899b).toString();
                            Object mcpHeader2 = AbstractC1776n.Q(obj5) ? null : new McpHeader(obj5, AbstractC1776n.l0(c7.f9900c).toString());
                            if (mcpHeader2 != null) {
                                arrayList.add(mcpHeader2);
                            }
                        }
                        McpServer mcpServer3 = mcpServer2;
                        if (mcpServer3 == null || (uuid = mcpServer3.a) == null) {
                            uuid = UUID.randomUUID().toString();
                            AbstractC1276k.e(uuid, "toString(...)");
                        }
                        String str5 = uuid;
                        boolean booleanValue = ((Boolean) x16.getValue()).booleanValue();
                        String obj6 = AbstractC1776n.l0((String) x9.getValue()).toString();
                        List list3 = D2.a.a;
                        String str6 = (String) x15.getValue();
                        AbstractC1276k.b(str6 != null ? AbstractC1776n.l0(str6).toString() : null, "Streamable HTTP");
                        cVar.f(new McpServer(str5, booleanValue, obj6, "Streamable HTTP", AbstractC1776n.l0((String) x13.getValue()).toString(), arrayList));
                        return X3.y.a;
                    }
                };
                x7 = x15;
                c0626q3.m0(obj4);
                P12 = obj4;
            }
            InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P12;
            C1818y c1818y = v.t0.f15349c;
            InterfaceC1041r f10 = AbstractC1464z.f(c1818y, ((Q.N) c0626q3.j(Q.O.a)).f5424n, o0.y.f13496b);
            C1033j c1033j = C1026c.f11786c;
            F0.V d6 = AbstractC1806l.d(c1033j, false);
            int hashCode = Long.hashCode(c0626q3.f8164T);
            InterfaceC0617l0 l3 = c0626q3.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q3, f10);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a3 = C0150g.f1924b;
            c0626q3.f0();
            if (c0626q3.f8163S) {
                c0626q3.k(interfaceC1193a3);
            } else {
                c0626q3.p0();
            }
            T.r.G(c0626q3, d6, C0150g.f1928f);
            T.r.G(c0626q3, l3, C0150g.f1927e);
            T.r.x(c0626q3, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q3, C0150g.f1930h);
            T.r.G(c0626q3, c7, C0150g.f1926d);
            C1810p c1810p = C1810p.f15333b;
            InterfaceC1041r s5 = AbstractC1787b.s(c1818y);
            float f11 = 20;
            v.k0 k0Var = new v.k0(f11, c6 + 12, f11, 24);
            C1795f g3 = AbstractC1799h.g(16);
            T.X x17 = x6;
            boolean f12 = c0626q3.f(x8) | c0626q3.f(x9) | c0626q3.h(list2) | c0626q3.f(x7) | c0626q3.f(x13) | c0626q3.f(c0996s) | c0626q3.f(x17);
            Object P13 = c0626q3.P();
            if (f12 || P13 == obj2) {
                P13 = new J1.t(c0996s, x8, x9, list2, x7, x13, x17);
                c0626q3.m0(P13);
            }
            AbstractC1118b.a(s5, null, k0Var, g3, null, null, false, null, (l4.c) P13, c0626q3, 24576, 490);
            R(str, h5.e.j0(R.string.settings_back, c0626q3), c6, f8, interfaceC1193a, AbstractC0874g.c(-1929087484, new C0524d(z10, interfaceC1193a2), c0626q3), c1810p.e(C1038o.a, c1033j), c0626q, (i8 & 14) | 199680 | ((i8 << 3) & 57344), 0);
            C0626q c0626q4 = c0626q;
            c0626q4.p(true);
            c0626q2 = c0626q4;
        } else {
            c0626q3.V();
            c0626q2 = c0626q3;
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new C0343a0(str, mcpServer, c0818g, interfaceC1193a, cVar, i6);
        }
    }

    public static final void n(McpServer mcpServer, InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6) {
        c0626q.d0(-2039014306);
        int i7 = (c0626q.h(mcpServer) ? 4 : 2) | i6 | (c0626q.h(interfaceC1193a) ? 32 : 16) | (c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            InterfaceC1041r c6 = interfaceC1041r.c(v.t0.a);
            C.d dVar = g1.a;
            InterfaceC1041r c7 = l0.h.c(c6, dVar);
            boolean z5 = (i7 & 112) == 32;
            Object P5 = c0626q.P();
            if (z5 || P5 == C0616l.a) {
                P5 = new C0348d(26, interfaceC1193a);
                c0626q.m0(P5);
            }
            R1.c(AbstractC1992b.a(31, c7, (InterfaceC1193a) P5, false), dVar, null, null, AbstractC0874g.c(-986391892, new D.b1(mcpServer, 13), c0626q), c0626q, PegdownExtensions.SUPPRESS_ALL_HTML, 28);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.L(mcpServer, interfaceC1193a, interfaceC1041r, i6);
        }
    }

    public static final void o(C0818g c0818g, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, l4.c cVar, C0626q c0626q, int i6) {
        boolean z5;
        C1033j c1033j;
        AbstractC1276k.f(c0818g, "mcpViewModel");
        AbstractC1276k.f(interfaceC1193a, "onBackClick");
        AbstractC1276k.f(interfaceC1193a2, "onAddClick");
        AbstractC1276k.f(cVar, "onServerClick");
        c0626q.d0(320151384);
        int i7 = i6 | (c0626q.h(c0818g) ? 4 : 2) | (c0626q.h(interfaceC1193a) ? 32 : 16) | (c0626q.h(interfaceC1193a2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(cVar) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            T.X r5 = Y4.d.r(c0818g.f10658d, c0626q);
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (P5 == obj) {
                P5 = T.r.p(c0626q);
                c0626q.m0(P5);
            }
            Object obj2 = (InterfaceC1942y) P5;
            Object P6 = c0626q.P();
            if (P6 == obj) {
                P6 = T.r.A(null);
                c0626q.m0(P6);
            }
            T.X x5 = (T.X) P6;
            Object P7 = c0626q.P();
            if (P7 == obj) {
                P7 = T.r.A(null);
                c0626q.m0(P7);
            }
            T.X x6 = (T.X) P7;
            WeakHashMap weakHashMap = v.G0.f15220w;
            float f6 = 56;
            float c6 = AbstractC1787b.j(C1810p.f(c0626q).f15225f, c0626q).c() + f6;
            boolean f7 = c0626q.f((List) r5.getValue());
            Object P8 = c0626q.P();
            if (f7 || P8 == obj) {
                List list = (List) r5.getValue();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((McpServer) obj3).f11212b) {
                        arrayList.add(obj3);
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                P8 = Y3.m.z0(arrayList, arrayList2);
                c0626q.m0(P8);
            }
            Object obj4 = (List) P8;
            C1818y c1818y = v.t0.f15349c;
            InterfaceC1041r f8 = AbstractC1464z.f(c1818y, ((Q.N) c0626q.j(Q.O.a)).f5424n, o0.y.f13496b);
            String str = (String) x5.getValue();
            Object P9 = c0626q.P();
            if (P9 == obj) {
                P9 = new C0746d(x5, 1);
                c0626q.m0(P9);
            }
            InterfaceC1041r a6 = B0.Q.a(f8, str, (PointerInputEventHandler) P9);
            C1033j c1033j2 = C1026c.f11786c;
            F0.V d6 = AbstractC1806l.d(c1033j2, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, a6);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a3 = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a3);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c7, C0150g.f1926d);
            C1810p c1810p = C1810p.f15333b;
            McpServer mcpServer = (McpServer) x6.getValue();
            if (mcpServer != null) {
                c0626q.b0(1786025598);
                String str2 = mcpServer.f11213c;
                boolean h3 = c0626q.h(mcpServer) | ((i7 & 14) == 4 || c0626q.h(c0818g));
                Object P10 = c0626q.P();
                if (h3 || P10 == obj) {
                    P10 = new A.g(mcpServer, c0818g, x6, 11);
                    c0626q.m0(P10);
                }
                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) P10;
                Object P11 = c0626q.P();
                if (P11 == obj) {
                    P11 = new D.C(x6, 18);
                    c0626q.m0(P11);
                }
                h(str2, interfaceC1193a4, (InterfaceC1193a) P11, c0626q, 384);
                z5 = false;
            } else {
                z5 = false;
                c0626q.b0(1782232624);
            }
            c0626q.p(z5);
            float f9 = 20;
            float f10 = 12;
            v.k0 k0Var = new v.k0(f9, c6 + f10, f9, f10);
            C1795f g3 = AbstractC1799h.g(f10);
            boolean h6 = c0626q.h(obj4) | c0626q.h(obj2) | ((i7 & 7168) == 2048);
            Object P12 = c0626q.P();
            if (h6 || P12 == obj) {
                c1033j = c1033j2;
                Object j02 = new D.J0(obj4, obj2, x5, cVar, x6, 3);
                c0626q.m0(j02);
                P12 = j02;
            } else {
                c1033j = c1033j2;
            }
            AbstractC1118b.a(c1818y, null, k0Var, g3, null, null, false, null, (l4.c) P12, c0626q, 24582, 490);
            R(h5.e.j0(R.string.mcp_title, c0626q), h5.e.j0(R.string.settings_back, c0626q), c6, f6, interfaceC1193a, AbstractC0874g.c(157508895, new C0522b(6, interfaceC1193a2), c0626q), c1810p.e(C1038o.a, c1033j), c0626q, ((i7 << 9) & 57344) | 199680, 0);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new K.d(c0818g, interfaceC1193a, interfaceC1193a2, cVar, i6, 5);
        }
    }

    public static final void p(InterfaceC1041r interfaceC1041r, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        c0626q.d0(-1624425483);
        int i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6 | (c0626q.h(interfaceC1193a) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            InterfaceC1041r A5 = AbstractC1787b.A(16, S.l.f7374V, 2, interfaceC1041r);
            v.p0 a6 = v.o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q, 48);
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
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q, a6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q, c6, c0146e4);
            C1038o c1038o = C1038o.a;
            InterfaceC1041r j3 = v.t0.j(c1038o, 48);
            long d6 = o0.y.d(4294916912L);
            C.d dVar = C.e.a;
            InterfaceC1041r c7 = l0.h.c(AbstractC1464z.f(j3, d6, dVar), dVar);
            boolean z5 = (i7 & 112) == 32;
            Object P5 = c0626q.P();
            if (z5 || P5 == C0616l.a) {
                P5 = new C0348d(25, interfaceC1193a);
                c0626q.m0(P5);
            }
            InterfaceC1041r a7 = AbstractC1992b.a(31, c7, (InterfaceC1193a) P5, false);
            F0.V d7 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q, a7);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d7, c0146e);
            T.r.G(c0626q, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c8, c0146e4);
            Q.A0.a(Y3.C.L(R.drawable.delete, 0, c0626q), h5.e.j0(R.string.button_delete, c0626q), v.t0.j(c1038o, 22), o0.s.f13477d, c0626q, 3464, 0);
            c0626q.p(true);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new I.m(i6, 14, interfaceC1041r, interfaceC1193a);
        }
    }

    public static final void q(McpTool mcpTool, C0626q c0626q, int i6) {
        C0626q c0626q2;
        c0626q.d0(-190723881);
        int i7 = (c0626q.h(mcpTool) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            c0626q2 = c0626q;
            R1.c(v.t0.a, g1.a, null, null, AbstractC0874g.c(1158316361, new D.b1(mcpTool, 14), c0626q), c0626q2, 196614, 28);
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new B4.D(i6, 23, mcpTool);
        }
    }

    public static final void r(EnumC0731u enumC0731u, List list, String str, InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6) {
        InterfaceC1041r interfaceC1041r2;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(enumC0731u, "connectionStatus");
        AbstractC1276k.f(list, "tools");
        c0626q2.d0(-1112991023);
        int i7 = i6 | (c0626q2.d(enumC0731u.ordinal()) ? 4 : 2) | (c0626q2.h(list) ? 32 : 16) | (c0626q2.f(str) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | 3072;
        if (c0626q2.S(i7 & 1, (i7 & 1171) != 1170)) {
            C1818y c1818y = v.t0.a;
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q2, 0);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q2, c1818y);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, a6, C0150g.f1928f);
            T.r.G(c0626q2, l3, C0150g.f1927e);
            T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q2, C0150g.f1930h);
            T.r.G(c0626q2, c6, C0150g.f1926d);
            d(enumC0731u, str, c0626q2, ((i7 >> 3) & 112) | (i7 & 14));
            EnumC0731u enumC0731u2 = EnumC0731u.f9775f;
            boolean z5 = enumC0731u == enumC0731u2 && !list.isEmpty();
            C1210Q a7 = AbstractC1205L.b(null, 3).a(AbstractC1205L.a(null, 15));
            C1211S a8 = AbstractC1205L.c(null, 3).a(AbstractC1205L.d(null, 15));
            C0873f c7 = AbstractC0874g.c(1098436163, new U2.l(list, 1), c0626q2);
            boolean z6 = z5;
            C1814u c1814u = C1814u.a;
            AbstractC1244z.b(c1814u, z6, null, a7, a8, null, c7, c0626q2, 1600518, 18);
            c0626q2 = c0626q;
            AbstractC1244z.b(c1814u, enumC0731u == enumC0731u2 && list.isEmpty(), null, AbstractC1205L.b(null, 3).a(AbstractC1205L.a(null, 15)), AbstractC1205L.c(null, 3).a(AbstractC1205L.d(null, 15)), null, f10444u, c0626q2, 1600518, 18);
            c0626q2.p(true);
            interfaceC1041r2 = C1038o.a;
        } else {
            c0626q2.V();
            interfaceC1041r2 = interfaceC1041r;
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new K.d(enumC0731u, list, str, interfaceC1041r2, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0442 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0511 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x053e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0566 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x059a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0603 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x062a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x065b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x06ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0706 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x073b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0771 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0906 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0b4e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0c2a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0cda  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0d1f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0e08  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0e19  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0e2b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0e8f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0ed2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0f85  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0fa8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x1001  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x103f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x105d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x1077 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x108e  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x109e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x1124  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x1164  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x117c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x118e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x11a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x11bd  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x11cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x125d  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x12a4  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x12c0  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x12c9  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x12d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x135b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x13a3  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x13bf  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x13c8  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x13d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1495  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x1508  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x151a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x1531 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x154d  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x14cc  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x13c3  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x135f  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x12c4  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x1261  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x1191  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x1128  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x1060  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x1005  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0ed6  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0e93  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0bc9  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0bac  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0328  */
    /* JADX WARN: Type inference failed for: r13v91 */
    /* JADX WARN: Type inference failed for: r13v92, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final a3.w r97, java.lang.String r98, l4.InterfaceC1193a r99, T.C0626q r100, int r101) {
        /*
            Method dump skipped, instructions count: 5553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.AbstractC0783w.s(a3.w, java.lang.String, l4.a, T.q, int):void");
    }

    public static final String t(T.X x5) {
        return (String) x5.getValue();
    }

    public static final boolean u(T.X x5) {
        return ((Boolean) x5.getValue()).booleanValue();
    }

    public static final String v(T.X x5) {
        return (String) x5.getValue();
    }

    public static final float w(T.X x5) {
        return ((Number) x5.getValue()).floatValue();
    }

    public static final float x(T.X x5) {
        return ((Number) x5.getValue()).floatValue();
    }

    public static final Integer y(T.X x5) {
        return (Integer) x5.getValue();
    }

    public static final Integer z(T.X x5) {
        return (Integer) x5.getValue();
    }
}
