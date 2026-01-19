package b3;

import O.P;
import Q.D2;
import Q.L2;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.Locale;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import u4.C1772j;
import u4.C1774l;
import u4.u;

/* renamed from: b3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0902r {
    public static final C1774l a = new C1774l("\\b(4\\d{2}|5\\d{2})\\b");

    public static final void a(L2 l22, String str, InterfaceC1193a interfaceC1193a, D2 d22, C0626q c0626q, int i6) {
        int i7;
        D2 d23;
        String str2;
        Integer E5;
        int i8;
        int i9;
        int i10;
        int i11;
        AbstractC1276k.f(l22, "snackbarHostState");
        AbstractC1276k.f(interfaceC1193a, "onMessageShown");
        c0626q.d0(-1672880644);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(l22) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(str) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        int i12 = i7 | 3072;
        if (c0626q.S(i12 & 1, (i12 & 1171) != 1170)) {
            c0626q.b0(1614801393);
            if (str == null || AbstractC1776n.Q(str)) {
                c0626q.p(false);
                str2 = null;
            } else {
                str2 = AbstractC1776n.l0(str).toString();
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                AbstractC1276k.e(lowerCase, "toLowerCase(...)");
                C1772j a6 = C1774l.a(a, str2);
                if (a6 == null) {
                    E5 = null;
                } else {
                    String group = a6.a.group();
                    AbstractC1276k.e(group, "group(...)");
                    E5 = u.E(group);
                }
                if (E5 != null && E5.intValue() == 400) {
                    i10 = 1340954459;
                    i11 = R.string.error_bad_request;
                } else if (E5 != null && E5.intValue() == 401) {
                    i10 = 1340956700;
                    i11 = R.string.error_unauthorized;
                } else if (E5 != null && E5.intValue() == 403) {
                    i10 = 1340958969;
                    i11 = R.string.error_forbidden;
                } else if (E5 != null && E5.intValue() == 404) {
                    i10 = 1340961145;
                    i11 = R.string.error_not_found;
                } else if (E5 != null && E5.intValue() == 409) {
                    i10 = 1340963320;
                    i11 = R.string.error_conflict;
                } else if (E5 != null && E5.intValue() == 429) {
                    i10 = 1340965473;
                    i11 = R.string.error_too_many_requests;
                } else if (E5 != null && E5.intValue() == 503) {
                    i10 = 1340967907;
                    i11 = R.string.error_service_unavailable;
                } else {
                    if (E5 != null) {
                        r4.e eVar = new r4.e(500, 599, 1);
                        int intValue = E5.intValue();
                        if (500 <= intValue && intValue <= eVar.f14680e) {
                            i8 = 1340971199;
                            i9 = R.string.error_internal_server;
                            str2 = B3.e.j(c0626q, i8, i9, c0626q, false);
                            c0626q.p(false);
                        }
                    }
                    if (AbstractC1776n.G(lowerCase, "timeout", false) || AbstractC1776n.G(lowerCase, "timed out", false)) {
                        i8 = 1340975703;
                        i9 = R.string.error_timeout;
                    } else if (AbstractC1776n.G(lowerCase, "unknownhost", false) || AbstractC1776n.G(lowerCase, "no address associated", false)) {
                        i8 = 1340980478;
                        i9 = R.string.error_network_failed;
                    } else if (AbstractC1776n.G(lowerCase, "connectexception", false) || AbstractC1776n.G(lowerCase, "failed to connect", false) || AbstractC1776n.G(lowerCase, "connection refused", false)) {
                        i8 = 1340987770;
                        i9 = R.string.error_connection;
                    } else {
                        c0626q.b0(1340989592);
                        c0626q.p(false);
                        c0626q.p(false);
                    }
                    str2 = B3.e.j(c0626q, i8, i9, c0626q, false);
                    c0626q.p(false);
                }
                str2 = B3.e.j(c0626q, i10, i11, c0626q, false);
                c0626q.p(false);
            }
            boolean f6 = ((i12 & 14) == 4) | c0626q.f(str2) | ((i12 & 7168) == 2048) | ((i12 & 896) == 256);
            Object P5 = c0626q.P();
            if (f6 || P5 == C0616l.a) {
                P5 = new C0901q(str2, l22, interfaceC1193a, null);
                c0626q.m0(P5);
            }
            T.r.f(c0626q, str2, (l4.e) P5);
            d23 = D2.f5208c;
        } else {
            c0626q.V();
            d23 = d22;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new P(l22, str, interfaceC1193a, d23, i6, 6);
        }
    }
}
