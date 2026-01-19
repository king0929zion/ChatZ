package Y4;

import B4.D;
import D.C0056a;
import D.C0072i;
import D.e1;
import F0.AbstractC0137z;
import H0.C0162q;
import H0.i0;
import I0.E0;
import I3.B;
import I3.C0241e;
import I3.E;
import I3.H;
import I3.I;
import J1.o;
import N3.q;
import P0.p;
import P0.s;
import P0.t;
import Q.C0435l0;
import S0.AbstractC0546h;
import S0.AbstractC0552n;
import S0.C0543e;
import S0.C0545g;
import T.AbstractC0623o0;
import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.F;
import T.X;
import T.r;
import X2.C0692g;
import X2.L;
import X3.y;
import Y3.C;
import Y3.v;
import a3.w;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.os.Trace;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C0848w;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.InterfaceC0837k;
import androidx.lifecycle.W;
import androidx.lifecycle.a0;
import b.C0867k;
import b0.AbstractC0874g;
import b0.C0873f;
import c.C0913a;
import c.C0915c;
import c.C0916d;
import com.bot.MainActivity;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import f0.C0996s;
import h0.InterfaceC1041r;
import i1.AbstractC1087g;
import i1.C1102v;
import i4.AbstractC1120d;
import java.io.EOFException;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k.M;
import k.N;
import k.V;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import u4.AbstractC1776n;
import u4.u;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9839b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9840c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9841d = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i6) {
        this.a = i6;
    }

    public static void A(q qVar, l4.e eVar) {
        for (Map.Entry entry : qVar.a()) {
            eVar.m((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Q4.l B(javax.net.ssl.SSLSession r6) {
        /*
            Y3.v r0 = Y3.v.f9812c
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L7b
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L18
        L12:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
        L18:
            if (r2 != 0) goto L6f
            Q4.b r2 = Q4.h.f6514b
            Q4.h r1 = r2.c(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L67
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L5f
            Q4.C r2 = Y4.d.D(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            if (r3 == 0) goto L42
            int r4 = r3.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            java.util.List r3 = R4.b.l(r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            goto L43
        L42:
            r3 = r0
        L43:
            Q4.l r4 = new Q4.l
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L54
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.util.List r0 = R4.b.l(r6)
        L54:
            A0.b r6 = new A0.b
            r5 = 9
            r6.<init>(r3, r5)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L5f:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L67:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            r6.<init>(r0)
            throw r6
        L6f:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L7b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.l.B(javax.net.ssl.SSLSession):Q4.l");
    }

    public static int C(List list) {
        AbstractC1276k.f(list, "<this>");
        return list.size() - 1;
    }

    public static final boolean E(C0545g c0545g) {
        int length = c0545g.f7630e.length();
        List list = c0545g.f7629c;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0543e c0543e = (C0543e) list.get(i6);
                if ((c0543e.a instanceof AbstractC0552n) && AbstractC0546h.b(0, length, c0543e.f7626b, c0543e.f7627c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final IndexOutOfBoundsException F(int i6, int i7) {
        return new IndexOutOfBoundsException(B3.e.i(i6, "0 (offset) + ", i7, " (length) > ", " (array.length)"));
    }

    public static boolean G(int i6) {
        int type = Character.getType(i6);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static List H(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC1276k.e(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List I(Object... objArr) {
        AbstractC1276k.f(objArr, "elements");
        return objArr.length > 0 ? Y3.k.a0(objArr) : v.f9812c;
    }

    public static final void J(int i6) {
        throw new IllegalArgumentException("Malformed code-point " + Integer.toHexString(i6) + " found");
    }

    public static ArrayList K(Object... objArr) {
        AbstractC1276k.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new Y3.i(objArr, true));
    }

    public static final List L(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : H(list.get(0)) : v.f9812c;
    }

    public static final List N(X1.c cVar) {
        int s5 = d.s(cVar, Attribute.ID_ATTR);
        int s6 = d.s(cVar, "seq");
        int s7 = d.s(cVar, "from");
        int s8 = d.s(cVar, "to");
        Z3.b w5 = w();
        while (cVar.Z()) {
            w5.add(new T1.e(cVar.M(s7), (int) cVar.getLong(s5), (int) cVar.getLong(s6), cVar.M(s8)));
        }
        return Y3.m.F0(p(w5));
    }

    public static final T1.h O(X1.a aVar, String str, boolean z5) {
        X1.c c02 = aVar.c0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int s5 = d.s(c02, "seqno");
            int s6 = d.s(c02, "cid");
            int s7 = d.s(c02, Attribute.NAME_ATTR);
            int s8 = d.s(c02, "desc");
            if (s5 != -1 && s6 != -1 && s7 != -1 && s8 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (c02.Z()) {
                    if (((int) c02.getLong(s6)) >= 0) {
                        int i6 = (int) c02.getLong(s5);
                        String M5 = c02.M(s7);
                        String str2 = c02.getLong(s8) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i6), M5);
                        linkedHashMap2.put(Integer.valueOf(i6), str2);
                    }
                }
                List G02 = Y3.m.G0(linkedHashMap.entrySet(), new B3.q(3));
                ArrayList arrayList = new ArrayList(Y3.n.Z(G02, 10));
                Iterator it = G02.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List J0 = Y3.m.J0(arrayList);
                List G03 = Y3.m.G0(linkedHashMap2.entrySet(), new B3.q(4));
                ArrayList arrayList2 = new ArrayList(Y3.n.Z(G03, 10));
                Iterator it2 = G03.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                T1.h hVar = new T1.h(str, z5, J0, Y3.m.J0(arrayList2));
                AbstractC1120d.h(c02, null);
                return hVar;
            }
            AbstractC1120d.h(c02, null);
            return null;
        } finally {
        }
    }

    public static final c.l P(l lVar, l4.c cVar, C0626q c0626q, int i6) {
        l lVar2;
        r.E(lVar, c0626q);
        X E5 = r.E(cVar, c0626q);
        String str = (String) e0.l.d(new Object[0], null, C0916d.f11068f, c0626q, 3072, 6);
        e.i iVar = (e.i) c0626q.j(c.j.a);
        if (iVar == null) {
            c0626q.b0(1006590171);
            Object obj = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof e.i) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            iVar = (e.i) obj;
        } else {
            c0626q.b0(1006589303);
        }
        c0626q.p(false);
        if (iVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        C0867k c0867k = ((b.m) iVar).f10940l;
        Object P5 = c0626q.P();
        Object obj2 = C0616l.a;
        if (P5 == obj2) {
            P5 = new Object();
            c0626q.m0(P5);
        }
        C0913a c0913a = (C0913a) P5;
        Object P6 = c0626q.P();
        if (P6 == obj2) {
            P6 = new c.l(c0913a);
            c0626q.m0(P6);
        }
        c.l lVar3 = (c.l) P6;
        boolean h3 = c0626q.h(c0913a) | c0626q.h(c0867k) | c0626q.f(str) | c0626q.h(lVar) | c0626q.f(E5);
        Object P7 = c0626q.P();
        if (h3 || P7 == obj2) {
            lVar2 = lVar;
            P7 = new C0915c(c0913a, c0867k, str, lVar2, E5);
            c0626q.m0(P7);
        } else {
            lVar2 = lVar;
        }
        l4.c cVar2 = (l4.c) P7;
        boolean f6 = c0626q.f(c0867k) | c0626q.f(str) | c0626q.f(lVar2);
        Object P8 = c0626q.P();
        if (f6 || P8 == obj2) {
            P8 = new F(cVar2);
            c0626q.m0(P8);
        }
        return lVar3;
    }

    public static final boolean Q(M m3, Object obj, Object obj2) {
        Object g3 = m3.g(obj);
        if (g3 == null) {
            return false;
        }
        if (!(g3 instanceof N)) {
            if (!g3.equals(obj2)) {
                return false;
            }
            m3.k(obj);
            return true;
        }
        N n3 = (N) g3;
        boolean l3 = n3.l(obj2);
        if (l3 && n3.g()) {
            m3.k(obj);
        }
        return l3;
    }

    public static final void R(M m3, Object obj) {
        boolean z5;
        long[] jArr = m3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j3) < 128) {
                        int i9 = (i6 << 3) + i8;
                        Object obj2 = m3.f12485b[i9];
                        Object obj3 = m3.f12486c[i9];
                        if (obj3 instanceof N) {
                            AbstractC1276k.d(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            N n3 = (N) obj3;
                            n3.l(obj);
                            z5 = n3.g();
                        } else {
                            z5 = obj3 == obj;
                        }
                        if (z5) {
                            m3.l(i9);
                        }
                    }
                    j3 >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    public static final void S(B b5, B b6) {
        AbstractC1276k.f(b5, "<this>");
        AbstractC1276k.f(b6, "url");
        E e6 = b6.a;
        AbstractC1276k.f(e6, "<set-?>");
        b5.a = e6;
        String str = b6.f2705b;
        AbstractC1276k.f(str, "<set-?>");
        b5.f2705b = str;
        b5.f2706c = b6.f2706c;
        List list = b6.f2711h;
        AbstractC1276k.f(list, "<set-?>");
        b5.f2711h = list;
        b5.f2708e = b6.f2708e;
        b5.f2709f = b6.f2709f;
        I3.n nVar = new I3.n(1);
        C.g(nVar, b6.f2712i);
        b5.f2712i = nVar;
        b5.f2713j = new I(nVar);
        String str2 = b6.f2710g;
        AbstractC1276k.f(str2, "<set-?>");
        b5.f2710g = str2;
        b5.f2707d = b6.f2707d;
    }

    public static void T() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void U() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [d5.i, java.lang.Object] */
    public static final String V(String str) {
        AbstractC1276k.f(str, "<this>");
        int i6 = 0;
        int i7 = -1;
        if (!AbstractC1776n.G(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC1276k.e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                AbstractC1276k.e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                AbstractC1276k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i8 = 0; i8 < length; i8++) {
                    char charAt = lowerCase.charAt(i8);
                    if (AbstractC1276k.g(charAt, 31) <= 0 || AbstractC1276k.g(charAt, 127) >= 0 || AbstractC1776n.N(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress x5 = (u.D(str, "[", false) && u.w(str, "]", false)) ? x(1, str.length() - 1, str) : x(0, str.length(), str);
        if (x5 == null) {
            return null;
        }
        byte[] address = x5.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return x5.getHostAddress();
            }
            throw new AssertionError(B3.e.g('\'', "Invalid IPv6 address: '", str));
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < address.length) {
            int i11 = i9;
            while (i11 < 16 && address[i11] == 0 && address[i11 + 1] == 0) {
                i11 += 2;
            }
            int i12 = i11 - i9;
            if (i12 > i10 && i12 >= 4) {
                i7 = i9;
                i10 = i12;
            }
            i9 = i11 + 2;
        }
        Object obj = new Object();
        while (i6 < address.length) {
            if (i6 == i7) {
                obj.S(58);
                i6 += i10;
                if (i6 == 16) {
                    obj.S(58);
                }
            } else {
                if (i6 > 0) {
                    obj.S(58);
                }
                byte b5 = address[i6];
                byte[] bArr = R4.b.a;
                obj.Y(((b5 & 255) << 8) | (address[i6 + 1] & 255));
                i6 += 2;
            }
        }
        return obj.y();
    }

    public static final void W(String str, long j3) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j3);
        }
    }

    public static final void X(byte b5) {
        StringBuilder sb = new StringBuilder("Unsupported byte code, first byte is 0x");
        AbstractC1120d.g(16);
        String num = Integer.toString(b5 & 255, 16);
        AbstractC1276k.e(num, "toString(this, checkRadix(radix))");
        sb.append(AbstractC1776n.V(2, num));
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final void Y(p pVar, int i6, O0.j jVar) {
        p pVar2;
        V.e eVar = new V.e(new p[16]);
        List i7 = pVar.i(false, false);
        while (true) {
            eVar.d(i7, eVar.f8761f);
            while (true) {
                int i8 = eVar.f8761f;
                if (i8 == 0) {
                    return;
                }
                pVar2 = (p) eVar.k(i8 - 1);
                boolean e6 = s.e(pVar2);
                P0.m mVar = pVar2.f4499d;
                M m3 = mVar.f4492c;
                if (!e6 && !m3.c(t.f4530i)) {
                    i0 d6 = pVar2.d();
                    if (d6 == null) {
                        throw B3.e.f("Expected semantics node to have a coordinator.");
                    }
                    e1.k h02 = h5.e.h0(AbstractC0137z.f(d6, true));
                    if (h02.a < h02.f11574c && h02.f11573b < h02.f11575d) {
                        Object g3 = mVar.f4492c.g(P0.l.f4470e);
                        if (g3 == null) {
                            g3 = null;
                        }
                        l4.e eVar2 = (l4.e) g3;
                        Object g6 = m3.g(t.f4543v);
                        P0.j jVar2 = (P0.j) (g6 != null ? g6 : null);
                        if (eVar2 != null && jVar2 != null && ((Number) jVar2.f4441b.b()).floatValue() > S.l.f7374V) {
                            int i9 = 1 + i6;
                            jVar.f(new O0.k(pVar2, i9, h02, d6));
                            Y(pVar2, i9, jVar);
                        }
                    }
                }
            }
            i7 = pVar2.i(false, false);
        }
    }

    public static final void a(String str, boolean z5, L l3, C0692g c0692g, C0626q c0626q, int i6) {
        int i7;
        C0692g c0692g2;
        L l5;
        boolean z6;
        String str2;
        AbstractC1276k.f(str, "currentChatId");
        AbstractC1276k.f(l3, "chatViewModel");
        AbstractC1276k.f(c0692g, "chatHistoryViewModel");
        c0626q.d0(42437954);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(str) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.g(z5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(l3) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= (i6 & 4096) == 0 ? c0626q.f(c0692g) : c0626q.h(c0692g) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        boolean z7 = false;
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            boolean h3 = ((i7 & 14) == 4) | ((i7 & 112) == 32) | c0626q.h(l3);
            if ((i7 & 7168) == 2048 || ((i7 & 4096) != 0 && c0626q.h(c0692g))) {
                z7 = true;
            }
            boolean z8 = h3 | z7;
            Object P5 = c0626q.P();
            if (z8 || P5 == C0616l.a) {
                c0692g2 = c0692g;
                W2.a aVar = new W2.a(str, z5, l3, c0692g2, null);
                str2 = str;
                z6 = z5;
                l5 = l3;
                c0626q.m0(aVar);
                P5 = aVar;
            } else {
                c0692g2 = c0692g;
                l5 = l3;
                z6 = z5;
                str2 = str;
            }
            r.f(c0626q, str2, (l4.e) P5);
        } else {
            c0692g2 = c0692g;
            l5 = l3;
            z6 = z5;
            str2 = str;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0435l0(str2, z6, l5, c0692g2, i6);
        }
    }

    public static final void b(L l3, C0692g c0692g, C0626q c0626q, int i6) {
        AbstractC1276k.f(l3, "chatViewModel");
        AbstractC1276k.f(c0692g, "chatHistoryViewModel");
        c0626q.d0(1739365565);
        int i7 = (c0626q.h(l3) ? 4 : 2) | i6;
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c0692g) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            boolean h3 = c0626q.h(l3) | ((i7 & 112) == 32 || c0626q.h(c0692g));
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new W2.c(l3, c0692g, null);
                c0626q.m0(P5);
            }
            r.f(c0626q, l3, (l4.e) P5);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(i6, 7, l3, c0692g);
        }
    }

    public static final void c(long j3, C0692g c0692g, C0626q c0626q, int i6) {
        int i7;
        AbstractC1276k.f(c0692g, "chatHistoryViewModel");
        c0626q.d0(-1804427249);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.e(j3) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= (i6 & 64) == 0 ? c0626q.f(c0692g) : c0626q.h(c0692g) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Long valueOf = Long.valueOf(j3);
            boolean z5 = ((i7 & 112) == 32 || ((i7 & 64) != 0 && c0626q.h(c0692g))) | ((i7 & 14) == 4);
            Object P5 = c0626q.P();
            if (z5 || P5 == C0616l.a) {
                P5 = new W2.d(c0692g, j3, null);
                c0626q.m0(P5);
            }
            r.f(c0626q, valueOf, (l4.e) P5);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new U2.c(j3, c0692g, i6);
        }
    }

    public static final void d(Activity activity, C0626q c0626q, int i6) {
        c0626q.d0(-469820284);
        int i7 = (c0626q.h(activity) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            boolean h3 = c0626q.h(activity);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new W0.e(activity, 1);
                c0626q.m0(P5);
            }
            r.d(activity, (l4.c) P5, c0626q);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D(i6, 21, activity);
        }
    }

    public static final void e(C0692g c0692g, w wVar, C0626q c0626q, int i6) {
        int i7;
        AbstractC1276k.f(c0692g, "chatHistoryViewModel");
        AbstractC1276k.f(wVar, "modelConfigViewModel");
        c0626q.d0(1959937675);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(c0692g) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        int i8 = i7 | (c0626q.h(wVar) ? 32 : 16);
        if (c0626q.S(i8 & 1, (i8 & 19) != 18)) {
            boolean z5 = ((i8 & 14) == 4 || c0626q.h(c0692g)) | ((i8 & 112) == 32 || c0626q.h(wVar));
            Object P5 = c0626q.P();
            if (z5 || P5 == C0616l.a) {
                P5 = new W2.e(c0692g, wVar, null);
                c0626q.m0(P5);
            }
            r.f(c0626q, y.a, (l4.e) P5);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(i6, 6, c0692g, wVar);
        }
    }

    public static final void f(boolean z5, InterfaceC1193a interfaceC1193a, L l3, l4.c cVar, C0626q c0626q, int i6) {
        int i7;
        l4.c cVar2;
        L l5;
        InterfaceC1193a interfaceC1193a2;
        boolean z6;
        AbstractC1276k.f(interfaceC1193a, "onVersionChecked");
        AbstractC1276k.f(l3, "chatViewModel");
        AbstractC1276k.f(cVar, "onRemoteVersion");
        c0626q.d0(-31383583);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.g(z5) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(l3) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.h(cVar) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            Boolean valueOf = Boolean.valueOf(z5);
            boolean h3 = ((i7 & 14) == 4) | c0626q.h(l3) | ((i7 & 7168) == 2048) | ((i7 & 112) == 32);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                cVar2 = cVar;
                W2.f fVar = new W2.f(z5, l3, cVar2, interfaceC1193a, null);
                z6 = z5;
                l5 = l3;
                interfaceC1193a2 = interfaceC1193a;
                c0626q.m0(fVar);
                P5 = fVar;
            } else {
                cVar2 = cVar;
                l5 = l3;
                interfaceC1193a2 = interfaceC1193a;
                z6 = z5;
            }
            r.f(c0626q, valueOf, (l4.e) P5);
        } else {
            cVar2 = cVar;
            l5 = l3;
            interfaceC1193a2 = interfaceC1193a;
            z6 = z5;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0435l0(z6, interfaceC1193a2, l5, cVar2, i6);
        }
    }

    public static final void g(J1.r rVar, C0626q c0626q, int i6) {
        J1.r rVar2;
        C0626q c0626q2;
        J1.r rVar3 = rVar;
        C0626q c0626q3 = c0626q;
        c0626q3.d0(294589392);
        if ((((c0626q3.h(rVar3) ? 4 : 2) | i6) & 3) == 2 && c0626q3.E()) {
            c0626q3.V();
            rVar2 = rVar3;
            c0626q2 = c0626q3;
        } else {
            e0.d f6 = e0.l.f(c0626q3);
            X n3 = r.n(rVar3.b().f2556e, c0626q3);
            List list = (List) n3.getValue();
            boolean booleanValue = ((Boolean) c0626q3.j(E0.a)).booleanValue();
            boolean f7 = c0626q3.f(list);
            Object P5 = c0626q3.P();
            Object obj = C0616l.a;
            Object obj2 = P5;
            if (f7 || P5 == obj) {
                C0996s c0996s = new C0996s();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    I1.j jVar = (I1.j) obj3;
                    if (booleanValue || jVar.f2550k.f2998j.f10884g.compareTo(EnumC0842p.f10878g) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                c0996s.addAll(arrayList);
                c0626q3.m0(c0996s);
                obj2 = c0996s;
            }
            C0996s c0996s2 = (C0996s) obj2;
            i(c0996s2, (List) n3.getValue(), c0626q3, 0);
            X n5 = r.n(rVar3.b().f2557f, c0626q3);
            Object P6 = c0626q3.P();
            if (P6 == obj) {
                P6 = new C0996s();
                c0626q3.m0(P6);
            }
            C0996s c0996s3 = (C0996s) P6;
            c0626q3.b0(-367418626);
            ListIterator listIterator = c0996s2.listIterator();
            C0626q c0626q4 = c0626q3;
            while (true) {
                C0162q c0162q = (C0162q) listIterator;
                if (!c0162q.hasNext()) {
                    break;
                }
                I1.j jVar2 = (I1.j) c0162q.next();
                I1.v vVar = jVar2.f2544e;
                AbstractC1276k.d(vVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                J1.q qVar = (J1.q) vVar;
                boolean h3 = c0626q4.h(rVar3) | c0626q4.h(jVar2);
                Object P7 = c0626q4.P();
                if (h3 || P7 == obj) {
                    P7 = new D.r(7, rVar3, jVar2);
                    c0626q4.m0(P7);
                }
                C1102v c1102v = qVar.f2857i;
                J1.r rVar4 = rVar3;
                e0.d dVar = f6;
                C0873f c6 = AbstractC0874g.c(1129586364, new o(jVar2, rVar3, f6, c0996s3, qVar), c0626q4);
                C0626q c0626q5 = c0626q4;
                AbstractC1087g.c((InterfaceC1193a) P7, c1102v, c6, c0626q5, 384, 0);
                c0996s3 = c0996s3;
                rVar3 = rVar4;
                c0626q4 = c0626q5;
                f6 = dVar;
            }
            rVar2 = rVar3;
            c0626q2 = c0626q4;
            C0996s c0996s4 = c0996s3;
            c0626q2.p(false);
            Set set = (Set) n5.getValue();
            boolean f8 = c0626q2.f(n5) | c0626q2.h(rVar2);
            Object P8 = c0626q2.P();
            if (f8 || P8 == obj) {
                P8 = new J1.p(n5, rVar2, c0996s4, null);
                c0626q2.m0(P8);
            }
            r.h(set, c0996s4, (l4.e) P8, c0626q2);
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new D(i6, 8, rVar2);
        }
    }

    public static final long h(float f6, float f7) {
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static final void i(List list, Collection collection, C0626q c0626q, int i6) {
        c0626q.d0(1537894851);
        if ((((c0626q.h(list) ? 4 : 2) | i6 | (c0626q.h(collection) ? 32 : 16)) & 19) == 18 && c0626q.E()) {
            c0626q.V();
        } else {
            boolean booleanValue = ((Boolean) c0626q.j(E0.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                I1.j jVar = (I1.j) it.next();
                C0848w c0848w = jVar.f2550k.f2998j;
                boolean g3 = c0626q.g(booleanValue) | c0626q.h(list) | c0626q.h(jVar);
                Object P5 = c0626q.P();
                if (g3 || P5 == C0616l.a) {
                    P5 = new J1.k(jVar, list, booleanValue);
                    c0626q.m0(P5);
                }
                r.d(c0848w, (l4.c) P5, c0626q);
            }
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new I.m(i6, 3, list, collection);
        }
    }

    public static final void j(InterfaceC1041r interfaceC1041r, AbstractC0623o0 abstractC0623o0, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-714464401);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(abstractC0623o0) ? 32 : 16;
        }
        int i8 = i6 & 384;
        C0873f c0873f2 = I.k.a;
        if (i8 == 0) {
            i7 |= c0626q.h(c0873f2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.h(c0873f) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                Object c0607g0 = new C0607g0(null, C0602e.f8080g);
                c0626q.m0(c0607g0);
                P5 = c0607g0;
            }
            K.c n3 = n(c0873f2, c0626q, (i7 >> 6) & 14);
            r.a(abstractC0623o0.a(n3), AbstractC0874g.c(274270255, new K.d(interfaceC1041r, (X) P5, c0873f, n3, 0), c0626q), c0626q, 56);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new e1(interfaceC1041r, abstractC0623o0, c0873f, i6, 2);
        }
    }

    public static final H k(B b5) {
        AbstractC1276k.f(b5, "builder");
        B b6 = new B();
        S(b6, b5);
        return b6.b();
    }

    public static final void l(M m3, Object obj, Object obj2) {
        int f6 = m3.f(obj);
        boolean z5 = f6 < 0;
        Object obj3 = z5 ? null : m3.f12486c[f6];
        if (obj3 != null) {
            if (obj3 instanceof N) {
                ((N) obj3).a(obj2);
            } else if (obj3 != obj2) {
                N n3 = new N();
                n3.a(obj3);
                n3.a(obj2);
                obj2 = n3;
            }
            obj2 = obj3;
        }
        if (!z5) {
            m3.f12486c[f6] = obj2;
            return;
        }
        int i6 = ~f6;
        m3.f12485b[i6] = obj;
        m3.f12486c[i6] = obj2;
    }

    public static ArrayList m(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new Y3.i(objArr, true));
    }

    public static final K.c n(C0873f c0873f, C0626q c0626q, int i6) {
        boolean z5 = (((i6 & 14) ^ 6) > 4 && c0626q.f(c0873f)) || (i6 & 6) == 4;
        Object P5 = c0626q.P();
        Object obj = C0616l.a;
        if (z5 || P5 == obj) {
            P5 = new K.c(c0873f);
            c0626q.m0(P5);
        }
        K.c cVar = (K.c) P5;
        boolean f6 = c0626q.f(cVar);
        Object P6 = c0626q.P();
        if (f6 || P6 == obj) {
            P6 = new C0056a(cVar, 9);
            c0626q.m0(P6);
        }
        r.d(cVar, (l4.c) P6, c0626q);
        return cVar;
    }

    public static int o(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        AbstractC1276k.f(arrayList, "<this>");
        int size2 = arrayList.size();
        int i6 = 0;
        if (size < 0) {
            throw new IllegalArgumentException(B3.e.i(0, "fromIndex (", size, ") is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(B3.e.i(size, "toIndex (", size2, ") is greater than size (", ")."));
        }
        int i7 = size - 1;
        while (i6 <= i7) {
            int i8 = (i6 + i7) >>> 1;
            int J4 = h5.e.J((Comparable) arrayList.get(i8), comparable);
            if (J4 < 0) {
                i6 = i8 + 1;
            } else {
                if (J4 <= 0) {
                    return i8;
                }
                i7 = i8 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static Z3.b p(Z3.b bVar) {
        bVar.f();
        bVar.f10516f = true;
        return bVar.f10515e > 0 ? bVar : Z3.b.f10513g;
    }

    public static final Charset q(C0241e c0241e) {
        AbstractC1276k.f(c0241e, "<this>");
        String d6 = c0241e.d("charset");
        if (d6 != null) {
            try {
                return Charset.forName(d6);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static final void s(int i6, int i7) {
        throw new EOFException(B3.e.i(i6, "Unable to discard ", i7, " bytes: only ", " available for writing"));
    }

    public static M t() {
        long[] jArr = V.a;
        return new M();
    }

    public static final o3.e u(a0 a0Var, C0626q c0626q) {
        o3.e eVar;
        c0626q.c0(1770922558);
        if (a0Var instanceof InterfaceC0837k) {
            Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
            W c6 = ((InterfaceC0837k) a0Var).c();
            AbstractC1276k.f(context, "context");
            AbstractC1276k.f(c6, "delegateFactory");
            while (context instanceof ContextWrapper) {
                if (context instanceof b.m) {
                    eVar = o3.e.d((b.m) context, c6);
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    AbstractC1276k.e(context, "ctx.baseContext");
                }
            }
            throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
        }
        eVar = null;
        c0626q.p(false);
        return eVar;
    }

    public static Z3.b w() {
        return new Z3.b(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress x(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.l.x(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final long y(int i6, int i7) {
        return (i7 & 4294967295L) | (i6 << 32);
    }

    public static final void z(int i6, int i7) {
        throw new EOFException(B3.e.i(i6, "Unable to discard ", i7, " bytes: only ", " available for reading"));
    }

    public A3.c D(MainActivity mainActivity, Object obj) {
        return null;
    }

    public abstract Object M(Intent intent, int i6);

    public int hashCode() {
        switch (this.a) {
            case 8:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract List r(String str, List list);

    public String toString() {
        switch (this.a) {
            case 8:
                String c6 = AbstractC1289x.a(getClass()).c();
                AbstractC1276k.c(c6);
                return c6;
            default:
                return super.toString();
        }
    }

    public abstract Intent v(MainActivity mainActivity, Object obj);
}
