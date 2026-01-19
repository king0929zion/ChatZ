package Y4;

import A4.e0;
import I3.B;
import I3.C0241e;
import I3.C0245i;
import I3.D;
import I3.z;
import M4.X;
import P0.p;
import P0.t;
import Q4.C;
import S0.F;
import S0.O;
import S0.P;
import T.C0616l;
import T.C0626q;
import T.X0;
import Y3.r;
import Y3.v;
import Z2.C0789z;
import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.ExtractedText;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.InterfaceC0846u;
import b4.C0906d;
import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0907e;
import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;
import c4.C0928b;
import c4.C0929c;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import e1.InterfaceC0961c;
import g1.AbstractC1016a;
import j1.AbstractC1135a;
import java.io.EOFException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import n0.C1353b;
import u1.C1754d;
import u4.AbstractC1776n;
import u4.u;
import x4.AbstractC1939v;
import x4.C1940w;
import x4.InterfaceC1934q;
import x4.g0;

/* loaded from: classes.dex */
public abstract class d implements U0.c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9825c = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f9826e = 0;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        throw new java.lang.IllegalStateException("Buffer's limit change is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cf, code lost:
    
        if (r6 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        V3.c.a(r15, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A(java.nio.charset.CharsetDecoder r14, U3.h r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.d.A(java.nio.charset.CharsetDecoder, U3.h):java.lang.String");
    }

    public static final U3.d B(CharsetEncoder charsetEncoder, CharSequence charSequence, int i6, int i7) {
        AbstractC1276k.f(charSequence, FlexmarkHtmlConverter.INPUT_NODE);
        U3.c cVar = new U3.c();
        try {
            C(charsetEncoder, cVar, charSequence, i6, i7);
            return cVar.f();
        } catch (Throwable th) {
            cVar.close();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(java.nio.charset.CharsetEncoder r5, U3.c r6, java.lang.CharSequence r7, int r8, int r9) {
        /*
            java.lang.String r0 = "input"
            m4.AbstractC1276k.f(r7, r0)
            if (r8 < r9) goto L8
            return
        L8:
            r0 = 1
            r1 = 0
            V3.b r2 = V3.c.f(r6, r0, r1)
        Le:
            int r3 = T3.a.b(r5, r7, r8, r9, r2)     // Catch: java.lang.Throwable -> L27
            if (r3 < 0) goto L4b
            int r8 = r8 + r3
            r4 = 0
            if (r8 < r9) goto L1a
            r3 = r4
            goto L20
        L1a:
            if (r3 != 0) goto L1f
            r3 = 8
            goto L20
        L1f:
            r3 = r0
        L20:
            if (r3 <= 0) goto L29
            V3.b r2 = V3.c.f(r6, r3, r2)     // Catch: java.lang.Throwable -> L27
            goto Le
        L27:
            r5 = move-exception
            goto L53
        L29:
            r6.c()
            V3.b r7 = V3.c.f(r6, r0, r1)
            r8 = r0
        L31:
            boolean r9 = T3.a.a(r5, r7)     // Catch: java.lang.Throwable -> L41
            if (r9 == 0) goto L39
            r8 = r4
            goto L3a
        L39:
            int r8 = r8 + r0
        L3a:
            if (r8 <= 0) goto L43
            V3.b r7 = V3.c.f(r6, r0, r7)     // Catch: java.lang.Throwable -> L41
            goto L31
        L41:
            r5 = move-exception
            goto L47
        L43:
            r6.c()
            return
        L47:
            r6.c()
            throw r5
        L4b:
            java.lang.String r5 = "Check failed."
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L27
            throw r7     // Catch: java.lang.Throwable -> L27
        L53:
            r6.c()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.d.C(java.nio.charset.CharsetEncoder, U3.c, java.lang.CharSequence, int, int):void");
    }

    public static C D(String str) {
        AbstractC1276k.f(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return C.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return C.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return C.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return C.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return C.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static N.b E(N.b bVar, e1.m mVar, P p5, InterfaceC0961c interfaceC0961c, W0.d dVar) {
        if (bVar != null && mVar == bVar.a && F.h(p5, mVar).equals(bVar.f3512b) && interfaceC0961c.a() == bVar.f3513c.f11566c && dVar == bVar.f3514d) {
            return bVar;
        }
        N.b bVar2 = N.b.f3511h;
        if (bVar2 != null && mVar == bVar2.a && F.h(p5, mVar).equals(bVar2.f3512b) && interfaceC0961c.a() == bVar2.f3513c.f11566c && dVar == bVar2.f3514d) {
            return bVar2;
        }
        N.b bVar3 = new N.b(mVar, F.h(p5, mVar), new e1.d(interfaceC0961c.a(), interfaceC0961c.b0()), dVar);
        N.b.f3511h = bVar3;
        return bVar3;
    }

    public static InterfaceC0908f F(InterfaceC0908f interfaceC0908f, InterfaceC0909g interfaceC0909g) {
        AbstractC1276k.f(interfaceC0909g, "key");
        if (AbstractC1276k.b(interfaceC0908f.getKey(), interfaceC0909g)) {
            return interfaceC0908f;
        }
        return null;
    }

    public static final String G(B b5) {
        AbstractC1276k.f(b5, "<this>");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = b5.f2708e;
        String str2 = b5.f2709f;
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append("@");
        }
        String sb3 = sb2.toString();
        AbstractC1276k.e(sb3, "StringBuilder().apply(builderAction).toString()");
        sb.append(sb3);
        sb.append(b5.f2705b);
        int i6 = b5.f2706c;
        if (i6 != 0 && i6 != b5.a.f2717b) {
            sb.append(":");
            sb.append(String.valueOf(b5.f2706c));
        }
        String sb4 = sb.toString();
        AbstractC1276k.e(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    public static final int H(X1.c cVar, String str) {
        AbstractC1276k.f(cVar, "stmt");
        int s5 = s(cVar, str);
        if (s5 >= 0) {
            return s5;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i6 = 0; i6 < columnCount; i6++) {
            arrayList.add(cVar.getColumnName(i6));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + Y3.m.v0(arrayList, null, null, null, null, 63) + ']');
    }

    public static final String I(B b5) {
        List list = b5.f2711h;
        return list.isEmpty() ? FlexmarkHtmlConverter.DEFAULT_NODE : list.size() == 1 ? ((CharSequence) Y3.m.o0(list)).length() == 0 ? "/" : (String) Y3.m.o0(list) : Y3.m.v0(list, "/", null, null, null, 62);
    }

    public static final KSerializer J(KSerializer kSerializer) {
        AbstractC1276k.f(kSerializer, "<this>");
        return kSerializer.getDescriptor().c() ? kSerializer : new X(kSerializer);
    }

    public static InterfaceC0905c K(InterfaceC0905c interfaceC0905c) {
        AbstractC1276k.f(interfaceC0905c, "<this>");
        d4.c cVar = interfaceC0905c instanceof d4.c ? (d4.c) interfaceC0905c : null;
        if (cVar == null || (interfaceC0905c = cVar.f11436f) != null) {
            return interfaceC0905c;
        }
        InterfaceC0907e interfaceC0907e = (InterfaceC0907e) cVar.o().r(C0906d.f11056c);
        InterfaceC0905c fVar = interfaceC0907e != null ? new C4.f((AbstractC1939v) interfaceC0907e, cVar) : cVar;
        cVar.f11436f = fVar;
        return fVar;
    }

    public static InterfaceC0910h L(InterfaceC0908f interfaceC0908f, InterfaceC0909g interfaceC0909g) {
        AbstractC1276k.f(interfaceC0909g, "key");
        return AbstractC1276k.b(interfaceC0908f.getKey(), interfaceC0909g) ? C0911i.f11057c : interfaceC0908f;
    }

    public static C0241e N(String str) {
        if (AbstractC1776n.Q(str)) {
            return C0241e.f2741f;
        }
        C0245i c0245i = (C0245i) Y3.m.w0(Y3.C.M(str));
        String str2 = c0245i.a;
        List list = c0245i.f2746b;
        int N5 = AbstractC1776n.N(str2, '/', 0, 6);
        if (N5 == -1) {
            if (AbstractC1276k.b(AbstractC1776n.l0(str2).toString(), "*")) {
                return C0241e.f2741f;
            }
            throw new Exception("Bad Content-Type format: ".concat(str));
        }
        String substring = str2.substring(0, N5);
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String obj = AbstractC1776n.l0(substring).toString();
        if (obj.length() == 0) {
            throw new Exception("Bad Content-Type format: ".concat(str));
        }
        String substring2 = str2.substring(N5 + 1);
        AbstractC1276k.e(substring2, "this as java.lang.String).substring(startIndex)");
        String obj2 = AbstractC1776n.l0(substring2).toString();
        if (AbstractC1776n.H(obj, SequenceUtils.SPC) || AbstractC1776n.H(obj2, SequenceUtils.SPC)) {
            throw new Exception("Bad Content-Type format: ".concat(str));
        }
        if (obj2.length() == 0 || AbstractC1776n.H(obj2, '/')) {
            throw new Exception("Bad Content-Type format: ".concat(str));
        }
        return new C0241e(obj, obj2, list);
    }

    public static long O(int i6, String str) {
        int z5 = z(str, 0, i6, false);
        Matcher matcher = Q4.k.f6544m.matcher(str);
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (z5 < i6) {
            int z6 = z(str, z5 + 1, i6, true);
            matcher.region(z5, z6);
            if (i8 == -1 && matcher.usePattern(Q4.k.f6544m).matches()) {
                String group = matcher.group(1);
                AbstractC1276k.e(group, "matcher.group(1)");
                i8 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                AbstractC1276k.e(group2, "matcher.group(2)");
                i11 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                AbstractC1276k.e(group3, "matcher.group(3)");
                i12 = Integer.parseInt(group3);
            } else if (i9 == -1 && matcher.usePattern(Q4.k.f6543l).matches()) {
                String group4 = matcher.group(1);
                AbstractC1276k.e(group4, "matcher.group(1)");
                i9 = Integer.parseInt(group4);
            } else {
                if (i10 == -1) {
                    Pattern pattern = Q4.k.f6542k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        AbstractC1276k.e(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        AbstractC1276k.e(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        AbstractC1276k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        AbstractC1276k.e(pattern2, "MONTH_PATTERN.pattern()");
                        i10 = AbstractC1776n.O(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i7 == -1 && matcher.usePattern(Q4.k.f6541j).matches()) {
                    String group6 = matcher.group(1);
                    AbstractC1276k.e(group6, "matcher.group(1)");
                    i7 = Integer.parseInt(group6);
                }
            }
            z5 = z(str, z6 + 1, i6, false);
        }
        if (70 <= i7 && i7 < 100) {
            i7 += 1900;
        }
        if (i7 >= 0 && i7 < 70) {
            i7 += 2000;
        }
        if (i7 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i9 || i9 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || i8 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0 || i11 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(R4.b.f7081d);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i7);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, i9);
        gregorianCalendar.set(11, i8);
        gregorianCalendar.set(12, i11);
        gregorianCalendar.set(13, i12);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static InterfaceC0910h P(InterfaceC0908f interfaceC0908f, InterfaceC0910h interfaceC0910h) {
        AbstractC1276k.f(interfaceC0910h, "context");
        return interfaceC0910h == C0911i.f11057c ? interfaceC0908f : (InterfaceC0910h) interfaceC0910h.q(interfaceC0908f, new C0789z(14));
    }

    public static byte[] R(U3.d dVar) {
        long p5 = dVar.p();
        if (p5 > 2147483647L) {
            throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
        }
        int i6 = (int) p5;
        AbstractC1276k.f(dVar, "<this>");
        if (i6 == 0) {
            return V3.c.a;
        }
        byte[] bArr = new byte[i6];
        boolean z5 = true;
        V3.b d6 = V3.c.d(dVar, 1);
        if (d6 != null) {
            int i7 = 0;
            while (true) {
                try {
                    int min = Math.min(i6, d6.f8663c - d6.f8662b);
                    h5.e.f0(d6, bArr, i7, min);
                    i6 -= min;
                    i7 += min;
                    if (i6 <= 0) {
                        V3.c.a(dVar, d6);
                        break;
                    }
                    try {
                        d6 = V3.c.e(dVar, d6);
                        if (d6 == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z5 = false;
                        if (z5) {
                            V3.c.a(dVar, d6);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        if (i6 <= 0) {
            return bArr;
        }
        throw new EOFException(B3.e.l("Premature end of stream: expected ", i6, " bytes"));
    }

    public static String S(U3.h hVar, Charset charset) {
        AbstractC1276k.f(hVar, "<this>");
        AbstractC1276k.f(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        AbstractC1276k.e(newDecoder, "charset.newDecoder()");
        return A(newDecoder, hVar);
    }

    public static final void T(p pVar, C1754d c1754d) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1754d.a;
        Object g3 = pVar.k().f4492c.g(t.f4527f);
        if (g3 == null) {
            g3 = null;
        }
        P0.c cVar = (P0.c) g3;
        if (cVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(cVar.a, cVar.f4432b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object g6 = pVar.k().f4492c.g(t.f4526e);
        if ((g6 != null ? g6 : null) != null) {
            List j3 = p.j(4, pVar);
            int size = j3.size();
            for (int i6 = 0; i6 < size; i6++) {
                p pVar2 = (p) j3.get(i6);
                if (pVar2.k().f4492c.c(t.f4515I)) {
                    arrayList.add(pVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean n3 = n(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(n3 ? 1 : arrayList.size(), n3 ? arrayList.size() : 1, false, 0));
    }

    public static final void U(p pVar, C1754d c1754d) {
        Object g3 = pVar.k().f4492c.g(t.f4528g);
        if (g3 == null) {
            g3 = null;
        }
        if (g3 != null) {
            throw new ClassCastException();
        }
        p l3 = pVar.l();
        if (l3 == null) {
            return;
        }
        Object g6 = l3.k().f4492c.g(t.f4526e);
        if (g6 == null) {
            g6 = null;
        }
        if (g6 != null) {
            Object g7 = l3.k().f4492c.g(t.f4527f);
            P0.c cVar = (P0.c) (g7 != null ? g7 : null);
            if (cVar == null || (cVar.a >= 0 && cVar.f4432b >= 0)) {
                if (pVar.k().f4492c.c(t.f4515I)) {
                    ArrayList arrayList = new ArrayList();
                    List j3 = p.j(4, l3);
                    int size = j3.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size; i7++) {
                        p pVar2 = (p) j3.get(i7);
                        if (pVar2.k().f4492c.c(t.f4515I)) {
                            arrayList.add(pVar2);
                            if (pVar2.f4498c.w() < pVar.f4498c.w()) {
                                i6++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean n3 = n(arrayList);
                    int i8 = n3 ? 0 : i6;
                    int i9 = n3 ? i6 : 0;
                    Object g8 = pVar.k().f4492c.g(t.f4515I);
                    if (g8 == null) {
                        g8 = Boolean.FALSE;
                    }
                    c1754d.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i8, 1, i9, 1, false, ((Boolean) g8).booleanValue()));
                }
            }
        }
    }

    public static final void V(B b5, String str) {
        AbstractC1276k.f(b5, "<this>");
        AbstractC1276k.f(str, "value");
        List K0 = AbstractC1776n.Q(str) ? v.f9812c : str.equals("/") ? D.a : Y3.m.K0(AbstractC1776n.b0(str, new char[]{'/'}, 6));
        AbstractC1276k.f(K0, "<set-?>");
        b5.f2711h = K0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable W(io.ktor.utils.io.y r4, d4.c r5) {
        /*
            boolean r0 = r5 instanceof N3.f
            if (r0 == 0) goto L13
            r0 = r5
            N3.f r0 = (N3.f) r0
            int r1 = r0.f3857h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3857h = r1
            goto L18
        L13:
            N3.f r0 = new N3.f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f3856g
            int r1 = r0.f3857h
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r5)
            goto L3b
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            X3.a.e(r5)
            r0.f3857h = r2
            java.lang.Object r5 = i4.AbstractC1117a.t(r4, r0)
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r5 != r4) goto L3b
            return r4
        L3b:
            U3.d r5 = (U3.d) r5
            byte[] r4 = R(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.d.W(io.ktor.utils.io.y, d4.c):java.io.Serializable");
    }

    public static final ExtractedText X(X0.v vVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = vVar.a.f7630e;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j3 = vVar.f9125b;
        extractedText.selectionStart = O.f(j3);
        extractedText.selectionEnd = O.e(j3);
        extractedText.flags = !AbstractC1776n.H(vVar.a.f7630e, '\n') ? 1 : 0;
        return extractedText;
    }

    public static Object Y(l4.e eVar, Object obj, InterfaceC0905c interfaceC0905c) {
        AbstractC1276k.f(eVar, "<this>");
        InterfaceC0910h o5 = interfaceC0905c.o();
        Object gVar = o5 == C0911i.f11057c ? new d4.g(interfaceC0905c) : new d4.c(interfaceC0905c, o5);
        AbstractC1291z.b(2, eVar);
        return eVar.m(obj, gVar);
    }

    public static final int Z(V3.b bVar, V3.b bVar2, int i6) {
        int min = Math.min(bVar2.f8663c - bVar2.f8662b, i6);
        int i7 = bVar.f8665e;
        int i8 = bVar.f8663c;
        int i9 = i7 - i8;
        if (i9 <= min) {
            int i10 = bVar.f8666f;
            if ((i10 - i7) + i9 < min) {
                throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
            }
            if ((i8 + min) - i7 > 0) {
                bVar.f8665e = i10;
            }
        }
        S3.b.a(bVar2.a, bVar.a, bVar2.f8662b, min, i8);
        bVar2.c(min);
        bVar.a(min);
        return min;
    }

    public static e1.d c() {
        return new e1.d(1.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [N4.m, N4.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, N4.f] */
    public static N4.m e(l4.c cVar) {
        N4.b bVar = N4.c.f3882d;
        AbstractC1276k.f(bVar, "from");
        Object obj = new Object();
        N4.h hVar = bVar.a;
        obj.a = hVar.a;
        obj.f3888b = hVar.f3901e;
        obj.f3889c = hVar.f3898b;
        obj.f3890d = hVar.f3899c;
        String str = hVar.f3902f;
        obj.f3891e = str;
        obj.f3892f = hVar.f3903g;
        obj.f3893g = hVar.f3906j;
        obj.f3894h = hVar.f3905i;
        obj.f3895i = hVar.f3904h;
        obj.f3896j = hVar.f3900d;
        obj.f3897k = bVar.f3883b;
        cVar.f(obj);
        if (!AbstractC1276k.b(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        N4.h hVar2 = new N4.h(obj.a, obj.f3889c, obj.f3890d, obj.f3896j, obj.f3888b, obj.f3891e, obj.f3892f, obj.f3895i, obj.f3894h, obj.f3893g);
        F2.h hVar3 = obj.f3897k;
        AbstractC1276k.f(hVar3, "module");
        return new N4.c(hVar2, hVar3);
    }

    public static final long g(float f6, float f7) {
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static final void h(B b5, StringBuilder sb) {
        List list;
        sb.append(b5.a.a);
        String str = b5.a.a;
        if (str.equals("file")) {
            CharSequence charSequence = b5.f2705b;
            String I5 = I(b5);
            sb.append("://");
            sb.append(charSequence);
            if (!AbstractC1776n.d0(I5, '/')) {
                sb.append('/');
            }
            sb.append((CharSequence) I5);
            return;
        }
        if (str.equals("mailto")) {
            StringBuilder sb2 = new StringBuilder();
            String str2 = b5.f2708e;
            String str3 = b5.f2709f;
            if (str2 != null) {
                sb2.append(str2);
                if (str3 != null) {
                    sb2.append(':');
                    sb2.append(str3);
                }
                sb2.append("@");
            }
            CharSequence sb3 = sb2.toString();
            AbstractC1276k.e(sb3, "StringBuilder().apply(builderAction).toString()");
            CharSequence charSequence2 = b5.f2705b;
            sb.append(":");
            sb.append(sb3);
            sb.append(charSequence2);
            return;
        }
        sb.append("://");
        sb.append(G(b5));
        String I6 = I(b5);
        z zVar = b5.f2712i;
        boolean z5 = b5.f2707d;
        AbstractC1276k.f(I6, "encodedPath");
        AbstractC1276k.f(zVar, "encodedQueryParameters");
        if (!AbstractC1776n.Q(I6) && !u.D(I6, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) I6);
        if (!zVar.isEmpty() || z5) {
            sb.append("?");
        }
        Set<Map.Entry> a = zVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a) {
            String str4 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = l.H(new X3.i(str4, null));
            } else {
                ArrayList arrayList2 = new ArrayList(Y3.n.Z(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new X3.i(str4, (String) it.next()));
                }
                list = arrayList2;
            }
            r.c0(list, arrayList);
        }
        Y3.m.u0(arrayList, sb, "&", I3.F.f2718e, 60);
        if (b5.f2710g.length() > 0) {
            sb.append('#');
            sb.append(b5.f2710g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(F3.c r5, d4.c r6) {
        /*
            boolean r0 = r6 instanceof F3.e
            if (r0 == 0) goto L13
            r0 = r6
            F3.e r0 = (F3.e) r0
            int r1 = r0.f1589h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1589h = r1
            goto L18
        L13:
            F3.e r0 = new F3.e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1588g
            int r1 = r0.f1589h
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r6)
            goto L52
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            X3.a.e(r6)
            u3.c r5 = r5.b()
            java.lang.Class<io.ktor.utils.io.y> r6 = io.ktor.utils.io.y.class
            m4.A r1 = m4.AbstractC1289x.b(r6)
            java.lang.reflect.Type r3 = s4.j.w(r1)
            m4.e r6 = m4.AbstractC1289x.a(r6)
            R3.a r4 = new R3.a
            r4.<init>(r6, r3, r1)
            r0.f1589h = r2
            java.lang.Object r6 = r5.a(r4, r0)
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r6 != r5) goto L52
            return r5
        L52:
            if (r6 == 0) goto L57
            io.ktor.utils.io.y r6 = (io.ktor.utils.io.y) r6
            return r6
        L57:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.d.i(F3.c, d4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(F3.c r5, java.nio.charset.Charset r6, d4.c r7) {
        /*
            boolean r0 = r7 instanceof F3.f
            if (r0 == 0) goto L13
            r0 = r7
            F3.f r0 = (F3.f) r0
            int r1 = r0.f1592i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1592i = r1
            goto L18
        L13:
            F3.f r0 = new F3.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1591h
            int r1 = r0.f1592i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.nio.charset.CharsetDecoder r5 = r0.f1590g
            X3.a.e(r7)
            goto L70
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            X3.a.e(r7)
            java.lang.String r7 = "<this>"
            m4.AbstractC1276k.f(r5, r7)
            I3.e r7 = h5.e.L(r5)
            if (r7 == 0) goto L42
            java.nio.charset.Charset r7 = Y4.l.q(r7)
            goto L43
        L42:
            r7 = 0
        L43:
            if (r7 != 0) goto L46
            goto L47
        L46:
            r6 = r7
        L47:
            java.nio.charset.CharsetDecoder r6 = r6.newDecoder()
            u3.c r5 = r5.b()
            java.lang.Class<U3.d> r7 = U3.d.class
            m4.A r1 = m4.AbstractC1289x.b(r7)
            java.lang.reflect.Type r3 = s4.j.w(r1)
            m4.e r7 = m4.AbstractC1289x.a(r7)
            R3.a r4 = new R3.a
            r4.<init>(r7, r3, r1)
            r0.f1590g = r6
            r0.f1592i = r2
            java.lang.Object r7 = r5.a(r4, r0)
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r7 != r5) goto L6f
            return r5
        L6f:
            r5 = r6
        L70:
            if (r7 == 0) goto L7e
            U3.d r7 = (U3.d) r7
            java.lang.String r6 = "decoder"
            m4.AbstractC1276k.e(r5, r6)
            java.lang.String r5 = A(r5, r7)
            return r5
        L7e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.core.ByteReadPacket"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.d.j(F3.c, java.nio.charset.Charset, d4.c):java.lang.Object");
    }

    public static final K4.g k(String str, SerialDescriptor[] serialDescriptorArr, l4.c cVar) {
        if (AbstractC1776n.Q(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        K4.a aVar = new K4.a(str);
        cVar.f(aVar);
        return new K4.g(str, K4.k.f2976e, aVar.f2941b.size(), Y3.k.B0(serialDescriptorArr), aVar);
    }

    public static final K4.g l(String str, l lVar, SerialDescriptor[] serialDescriptorArr, l4.c cVar) {
        AbstractC1276k.f(str, "serialName");
        if (AbstractC1776n.Q(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (lVar.equals(K4.k.f2976e)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        K4.a aVar = new K4.a(str);
        cVar.f(aVar);
        return new K4.g(str, lVar, aVar.f2941b.size(), Y3.k.B0(serialDescriptorArr), aVar);
    }

    public static K4.g m(String str, l lVar, SerialDescriptor[] serialDescriptorArr) {
        AbstractC1276k.f(str, "serialName");
        if (AbstractC1776n.Q(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (lVar.equals(K4.k.f2976e)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        K4.a aVar = new K4.a(str);
        return new K4.g(str, lVar, aVar.f2941b.size(), Y3.k.B0(serialDescriptorArr), aVar);
    }

    public static final boolean n(ArrayList arrayList) {
        List list;
        long j3;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = v.f9812c;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int C5 = l.C(arrayList);
                int i6 = 0;
                while (i6 < C5) {
                    i6++;
                    Object obj2 = arrayList.get(i6);
                    p pVar = (p) obj2;
                    p pVar2 = (p) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (pVar2.g().c() >> 32)) - Float.intBitsToFloat((int) (pVar.g().c() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (pVar2.g().c() & 4294967295L)) - Float.intBitsToFloat((int) (pVar.g().c() & 4294967295L)));
                    arrayList2.add(new C1353b((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j3 = ((C1353b) Y3.m.o0(list)).a;
            } else {
                if (list.isEmpty()) {
                    AbstractC1016a.c("Empty collection can't be reduced.");
                }
                Object o02 = Y3.m.o0(list);
                int C6 = l.C(list);
                if (1 <= C6) {
                    int i7 = 1;
                    while (true) {
                        o02 = new C1353b(C1353b.f(((C1353b) o02).a, ((C1353b) list.get(i7)).a));
                        if (i7 == C6) {
                            break;
                        }
                        i7++;
                    }
                }
                j3 = ((C1353b) o02).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j3)) >= Float.intBitsToFloat((int) (j3 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void o(int i6, int i7) {
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
        }
    }

    public static final void p(int i6, int i7) {
        if (i6 < 0 || i6 > i7) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
        }
    }

    public static final void q(int i6, int i7, int i8) {
        if (i6 < 0 || i7 > i8) {
            StringBuilder j3 = AbstractC1135a.j(i6, "fromIndex: ", i7, ", toIndex: ", ", size: ");
            j3.append(i8);
            throw new IndexOutOfBoundsException(j3.toString());
        }
        if (i6 > i7) {
            throw new IllegalArgumentException(B3.e.k("fromIndex: ", i6, i7, " > toIndex: "));
        }
    }

    public static final T.X r(e0 e0Var, C0626q c0626q) {
        InterfaceC0846u interfaceC0846u = (InterfaceC0846u) c0626q.j(D1.e.a);
        Object value = e0Var.getValue();
        androidx.lifecycle.O g3 = interfaceC0846u.g();
        EnumC0842p enumC0842p = EnumC0842p.f10878g;
        C0911i c0911i = C0911i.f11057c;
        Object[] objArr = {e0Var, g3, enumC0842p, c0911i};
        boolean h3 = c0626q.h(g3) | c0626q.d(enumC0842p.ordinal()) | c0626q.h(c0911i) | c0626q.h(e0Var);
        Object P5 = c0626q.P();
        Object obj = C0616l.a;
        if (h3 || P5 == obj) {
            Object dVar = new D1.d(g3, enumC0842p, c0911i, e0Var, null);
            c0626q.m0(dVar);
            P5 = dVar;
        }
        l4.e eVar = (l4.e) P5;
        Object P6 = c0626q.P();
        if (P6 == obj) {
            P6 = T.r.A(value);
            c0626q.m0(P6);
        }
        T.X x5 = (T.X) P6;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h6 = c0626q.h(eVar);
        Object P7 = c0626q.P();
        if (h6 || P7 == obj) {
            P7 = new X0(eVar, x5, null);
            c0626q.m0(P7);
        }
        T.r.i(copyOf, (l4.e) P7, c0626q);
        return x5;
    }

    public static final int s(X1.c cVar, String str) {
        AbstractC1276k.f(cVar, "<this>");
        int t5 = t(cVar, str);
        if (t5 >= 0) {
            return t5;
        }
        int t6 = t(cVar, "`" + str + '`');
        if (t6 >= 0) {
            return t6;
        }
        return -1;
    }

    public static final int t(X1.c cVar, String str) {
        AbstractC1276k.f(cVar, "<this>");
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        int columnCount = cVar.getColumnCount();
        for (int i6 = 0; i6 < columnCount; i6++) {
            if (str.equals(cVar.getColumnName(i6))) {
                return i6;
            }
        }
        return -1;
    }

    public static final void u(F3.c cVar) {
        InterfaceC0908f r5 = cVar.c().r(C1940w.f15731e);
        AbstractC1276k.c(r5);
        ((g0) ((InterfaceC1934q) r5)).n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] v(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            jArr[i6] = iArr[i6];
        }
        return jArr;
    }

    public static final void w(int i6, int i7) {
        if (i6 > i7) {
            throw new IndexOutOfBoundsException(B3.e.i(i6, "toIndex (", i7, ") is greater than size (", ")."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC0905c x(InterfaceC0905c interfaceC0905c, InterfaceC0905c interfaceC0905c2, l4.e eVar) {
        AbstractC1276k.f(eVar, "<this>");
        if (eVar instanceof d4.a) {
            return ((d4.a) eVar).p(interfaceC0905c2, interfaceC0905c);
        }
        InterfaceC0910h o5 = interfaceC0905c2.o();
        return o5 == C0911i.f11057c ? new C0928b(interfaceC0905c2, interfaceC0905c, eVar) : new C0929c(interfaceC0905c2, o5, eVar, interfaceC0905c);
    }

    public static final W0.f y(Context context) {
        F2.h hVar = new F2.h(17);
        context.getApplicationContext();
        return new W0.f(hVar, new W0.a(Build.VERSION.SDK_INT >= 31 ? W0.l.a.a(context) : 0));
    }

    public static int z(String str, int i6, int i7, boolean z5) {
        while (i6 < i7) {
            char charAt = str.charAt(i6);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z5)) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public abstract int M(int i6);

    public abstract int Q(int i6);

    @Override // U0.c
    public int a(int i6) {
        int M5 = M(i6);
        if (M5 == -1 || M(M5) == -1) {
            return -1;
        }
        return M5;
    }

    @Override // U0.c
    public int b(int i6) {
        int Q5 = Q(i6);
        if (Q5 == -1 || Q(Q5) == -1) {
            return -1;
        }
        return Q5;
    }

    @Override // U0.c
    public int d(int i6) {
        return Q(i6);
    }

    @Override // U0.c
    public int f(int i6) {
        return M(i6);
    }
}
