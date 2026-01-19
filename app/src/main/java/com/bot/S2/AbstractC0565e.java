package S2;

import D.C0064e;
import D.b1;
import F0.C0110b0;
import F0.C0120h;
import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.AbstractC0461s;
import Q.M1;
import Q.R1;
import Q.X2;
import Q.f3;
import Q.t3;
import Q.u3;
import S0.C0542d;
import S0.C0545g;
import S0.C0551m;
import T.AbstractC0623o0;
import T.C0601d0;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import T.d1;
import T.e1;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import b0.C0873f;
import b3.AbstractC0897m;
import b3.C0889e;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import d1.C0934a;
import f0.C0990m;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1031h;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1041r;
import i2.C1115i;
import j1.AbstractC1135a;
import j2.C1146b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1316c;
import o0.C1389K;
import p.AbstractC1464z;
import p.P0;
import s2.C1660h;
import s2.C1661i;
import u4.AbstractC1776n;
import u4.C1774l;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1789c;
import v.C1791d;
import v.C1810p;
import v.C1813t;
import v.C1814u;
import v.C1818y;
import w.AbstractC1829a;
import y2.AbstractC1992b;

/* renamed from: S2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0565e {
    public static final C0873f a = new C0873f(new C0064e(16), false, -2094239619);

    /* renamed from: b, reason: collision with root package name */
    public static final C0873f f7748b = new C0873f(new S0.A(26), false, 2030848540);

    public static List A(String str) {
        if (str.length() == 0) {
            return Y3.v.f9812c;
        }
        if (str.length() > 500000) {
            return B(str);
        }
        try {
            return new T2.B(str).f();
        } catch (Exception unused) {
            i5.a.a.getClass();
            androidx.lifecycle.N.p(new Object[0]);
            return B(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList B(String str) {
        X3.i iVar;
        String str2;
        ArrayList arrayList = new ArrayList();
        List H02 = Y3.m.H0(AbstractC1776n.c0(str, new String[]{SequenceUtils.EOL}), 5000);
        int i6 = 0;
        while (i6 < H02.size()) {
            String str3 = (String) H02.get(i6);
            String obj = AbstractC1776n.l0(str3).toString();
            if (u4.u.D(obj, "```", false) || u4.u.D(obj, "~~~", false)) {
                if (obj.length() == 0) {
                    iVar = new X3.i("```", null);
                } else {
                    char charAt = obj.charAt(0);
                    if (charAt == '`' || charAt == '~') {
                        int i7 = 0;
                        while (i7 < obj.length() && obj.charAt(i7) == charAt) {
                            i7++;
                        }
                        if (i7 < 3) {
                            iVar = new X3.i("```", null);
                        } else {
                            String A5 = u4.u.A(String.valueOf(charAt), i7);
                            String substring = obj.substring(i7);
                            AbstractC1276k.e(substring, "substring(...)");
                            String obj2 = AbstractC1776n.l0(substring).toString();
                            iVar = new X3.i(A5, obj2.length() > 0 ? obj2 : null);
                        }
                    } else {
                        iVar = new X3.i("```", null);
                    }
                }
                String str4 = (String) iVar.f9393c;
                String str5 = (String) iVar.f9394e;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    i6++;
                    if (i6 >= H02.size()) {
                        break;
                    }
                    String obj3 = AbstractC1776n.l0((String) H02.get(i6)).toString();
                    if (obj3.length() != 0) {
                        char charAt2 = str4.charAt(0);
                        int length = obj3.length();
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            if (i8 < length) {
                                char charAt3 = obj3.charAt(i8);
                                if (charAt3 != charAt2) {
                                    if (charAt3 != ' ' && charAt3 != '\t') {
                                        break;
                                    }
                                } else {
                                    i9++;
                                }
                                i8++;
                            } else if (i9 >= str4.length()) {
                                break;
                            }
                        }
                    }
                    arrayList2.add(H02.get(i6));
                }
                arrayList.add(new B(Y3.m.v0(arrayList2, SequenceUtils.EOL, null, null, null, 62), str5));
                if (i6 < H02.size()) {
                }
            } else if (u4.u.D(obj, "#", false)) {
                int length2 = obj.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        str2 = obj;
                        break;
                    }
                    if (obj.charAt(i10) != '#') {
                        str2 = obj.substring(0, i10);
                        AbstractC1276k.e(str2, "substring(...)");
                        break;
                    }
                    i10++;
                }
                int length3 = str2.length();
                if (length3 > 6) {
                    length3 = 6;
                }
                String obj4 = AbstractC1776n.l0(AbstractC1776n.X(obj, u4.u.A("#", length3))).toString();
                if (obj4.length() > 0 || length3 > 0) {
                    arrayList.add(new C(obj4, length3));
                }
            } else {
                if (obj.length() != 0) {
                    int length4 = obj.length();
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i11 < length4) {
                            char charAt4 = obj.charAt(i11);
                            if (charAt4 != '\t' && charAt4 != ' ') {
                                if (charAt4 != '*' && charAt4 != '-' && charAt4 != '_') {
                                    break;
                                }
                                if (r13 != null) {
                                    if (charAt4 != r13.charValue()) {
                                        break;
                                    }
                                    i12++;
                                } else {
                                    r13 = Character.valueOf(charAt4);
                                    i12 = 1;
                                }
                            }
                            i11++;
                        } else if (i12 >= 3) {
                            arrayList.add(E.a);
                        }
                    }
                }
                if (str3.length() > 0) {
                    arrayList.add(new V(str3));
                } else {
                    arrayList.add(new V(SequenceUtils.EOL));
                }
            }
            i6++;
        }
        return arrayList;
    }

    public static final L0 C(String str) {
        if (str.length() < 3) {
            return null;
        }
        if (str.charAt(0) != '[' || str.charAt(2) != ']') {
            return null;
        }
        char charAt = str.charAt(1);
        if (charAt != ' ' && charAt != 'x' && charAt != 'X') {
            return null;
        }
        String substring = str.substring(3);
        AbstractC1276k.e(substring, "substring(...)");
        return new L0(AbstractC1776n.o0(substring).toString(), charAt == 'x' || charAt == 'X');
    }

    public static final int D(String str) {
        C1774l c1774l = AbstractC0558a0.a;
        String e6 = AbstractC0558a0.e(y(str));
        if (AbstractC1776n.Q(e6)) {
            return 0;
        }
        List<X> z5 = z(e6);
        StringBuilder sb = new StringBuilder();
        for (X x5 : z5) {
            if (x5 instanceof V) {
                sb.append(((V) x5).a);
            } else if (x5 instanceof I) {
                sb.append(((I) x5).a);
            } else if (x5 instanceof N) {
                sb.append(((N) x5).a);
            } else if (x5 instanceof L) {
                sb.append(((L) x5).a);
            } else if (x5 instanceof A) {
                sb.append(((A) x5).a);
            } else if (x5 instanceof M) {
                sb.append(((M) x5).a);
            } else if (x5 instanceof Q) {
                sb.append(((Q) x5).a);
            } else if (x5 instanceof S) {
                sb.append(((S) x5).a);
            } else if (x5 instanceof T) {
                sb.append(((T) x5).a);
            } else if (x5 instanceof D) {
                sb.append(((D) x5).a);
            } else if (x5 instanceof G) {
                sb.append(((G) x5).a);
            }
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        Pattern compile = Pattern.compile("\\s+");
        AbstractC1276k.e(compile, "compile(...)");
        String replaceAll = compile.matcher(sb2).replaceAll(SequenceUtils.SPACE);
        AbstractC1276k.e(replaceAll, "replaceAll(...)");
        return AbstractC1776n.l0(replaceAll).toString().length();
    }

    public static final void a(String str, S0.P p5, boolean z5, C0626q c0626q, int i6) {
        AbstractC1276k.f(str, "content");
        c0626q.d0(107745413);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.f(p5) ? 32 : 16) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            float f6 = 4;
            InterfaceC1041r r5 = AbstractC1787b.r(AbstractC1787b.A(S.l.f7374V, f6, 1, v.t0.a));
            v.p0 a6 = v.o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q, 0);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, r5);
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
            C1038o c1038o = C1038o.a;
            InterfaceC1041r c7 = l0.h.c(v.t0.n(c1038o, f6).c(v.t0.f15348b), C.e.a(2));
            e1 e1Var = Q.O.a;
            InterfaceC1041r f7 = AbstractC1464z.f(c7, o0.s.c(0.5f, ((Q.N) c0626q.j(e1Var)).f5378A), o0.y.f13496b);
            if (z5) {
                c0626q.b0(1360017025);
                D0.a(AbstractC0874g.c(-1358518091, new C0562c0(f7, 0), c0626q), c0626q, 438);
                c0626q.p(false);
            } else {
                c0626q.b0(1360209101);
                AbstractC1806l.a(f7, c0626q, 0);
                c0626q.p(false);
            }
            AbstractC1787b.h(c0626q, v.t0.n(c1038o, 12));
            if (1.0f <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            c(str, new v.Z(1.0f, true), false, S0.P.a(p5, ((Q.N) c0626q.j(e1Var)).f5429s, 0L, null, new W0.i(1), null, 0L, null, 0L, null, 16777206), z5, c0626q, (i7 & 14) | 24960 | ((i7 << 9) & 458752), 0);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0586s(str, p5, z5, i6, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:533:0x085f, code lost:
    
        r4 = r14;
        r13 = r3.h(new S0.G(r0.f7694d, 0, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (java.lang.String) null, 0, (d1.C0934a) null, (d1.p) null, (Z0.b) null, 0, (d1.l) null, (o0.C1389K) null, 65534));
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x088c, code lost:
    
        r4 = r4.substring(r11);
        m4.AbstractC1276k.e(r4, r6);
        r3.e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x08a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x08a6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0cd0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0c4c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0b58  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v55, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r54, java.lang.String r55, boolean r56, T.C0626q r57, int r58) {
        /*
            Method dump skipped, instructions count: 3425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.AbstractC0565e.b(java.lang.String, java.lang.String, boolean, T.q, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r29, h0.InterfaceC1041r r30, boolean r31, S0.P r32, boolean r33, T.C0626q r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.AbstractC0565e.c(java.lang.String, h0.r, boolean, S0.P, boolean, T.q, int, int):void");
    }

    public static final boolean d(X x5) {
        return (x5 instanceof B) || (x5 instanceof U) || (x5 instanceof H) || (x5 instanceof O) || (x5 instanceof E);
    }

    public static final boolean e(X x5) {
        if (!(x5 instanceof V)) {
            return (x5 instanceof J) || (x5 instanceof K);
        }
        String str = ((V) x5).a;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (charAt != '\n' && charAt != '\r') {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(X x5) {
        if (!(x5 instanceof V)) {
            return false;
        }
        String str = ((V) x5).a;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (charAt != '\n' && charAt != '\r') {
                return false;
            }
        }
        return true;
    }

    public static final boolean g(X x5) {
        return (x5 instanceof C) || (x5 instanceof P) || (x5 instanceof W) || (x5 instanceof C0593z) || (x5 instanceof F);
    }

    public static final void h(final String str, final int i6, S0.P p5, final boolean z5, final boolean z6, final boolean z7, C0626q c0626q, final int i7) {
        S0.P p6;
        int i8;
        boolean z8;
        boolean z9;
        S0.P a6;
        long j3;
        AbstractC1276k.f(str, "text");
        c0626q.d0(1291512245);
        int i9 = i7 | (c0626q.f(str) ? 4 : 2) | (c0626q.d(i6) ? 32 : 16) | (c0626q.f(p5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i9 & 1, (i9 & 1171) != 1170)) {
            if (i6 != 1) {
                if (i6 == 2) {
                    i8 = i9;
                    z8 = true;
                    z9 = false;
                    a6 = S0.P.a(p5, 0L, s4.j.z(24), W0.k.f8836j, null, null, 0L, null, s4.j.z(32), null, 16646137);
                } else if (i6 == 3) {
                    i8 = i9;
                    z8 = true;
                    z9 = false;
                    a6 = S0.P.a(p5, 0L, s4.j.z(20), W0.k.f8836j, null, null, 0L, null, s4.j.z(26), null, 16646137);
                } else if (i6 == 4) {
                    i8 = i9;
                    z8 = true;
                    z9 = false;
                    a6 = S0.P.a(p5, 0L, s4.j.z(18), W0.k.f8836j, null, null, 0L, null, s4.j.z(24), null, 16646137);
                } else if (i6 != 5) {
                    z8 = true;
                    i8 = i9;
                    z9 = false;
                    a6 = S0.P.a(p5, 0L, s4.j.z(14), W0.k.f8836j, null, null, 0L, null, s4.j.z(20), null, 16646137);
                } else {
                    i8 = i9;
                    z8 = true;
                    z9 = false;
                    a6 = S0.P.a(p5, 0L, s4.j.z(16), W0.k.f8836j, null, null, 0L, null, s4.j.z(22), null, 16646137);
                }
                p6 = p5;
            } else {
                i8 = i9;
                z8 = true;
                z9 = false;
                a6 = S0.P.a(p5, 0L, s4.j.z(28), W0.k.f8836j, null, null, 0L, null, s4.j.z(36), null, 16646137);
                p6 = p5;
            }
            e1 e1Var = Q.O.a;
            long j4 = ((Q.N) c0626q.j(e1Var)).a;
            long c6 = o0.s.c(0.6f, ((Q.N) c0626q.j(e1Var)).f5422l);
            long j5 = p6.a.f7571b;
            e1.o oVar = new e1.o(j5);
            if (e1.o.a(j5, e1.o.f11580c)) {
                oVar = null;
            }
            if (oVar == null) {
                c0626q.b0(-102235139);
                j3 = ((t3) c0626q.j(u3.a)).f6130k.a.f7571b;
                c0626q.p(z9);
            } else {
                c0626q.b0(-102239014);
                c0626q.p(z9);
                j3 = oVar.a;
            }
            long j6 = j3;
            if ((i8 & 14) == 4) {
                z9 = z8;
            }
            boolean e6 = z9 | c0626q.e(j4) | c0626q.e(c6) | c0626q.e(j6);
            Object P5 = c0626q.P();
            if (e6 || P5 == C0616l.a) {
                LinkedHashMap linkedHashMap = AbstractC0570g0.a;
                P5 = AbstractC0570g0.a(y(str), j4, c6, j6);
                c0626q.m0(P5);
            }
            t((C0545g) P5, a6, null, z5, false, 0, 0, false, c0626q, i8 & 7168, 244);
        } else {
            p6 = p5;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            final S0.P p7 = p6;
            t5.f8193d = new l4.e(str, i6, p7, z5, z6, z7, i7) { // from class: S2.y

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f7920c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f7921e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ S0.P f7922f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f7923g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f7924h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ boolean f7925i;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(1);
                    AbstractC0565e.h(this.f7920c, this.f7921e, this.f7922f, this.f7923g, this.f7924h, this.f7925i, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void i(int i6, C0626q c0626q, InterfaceC1041r interfaceC1041r, boolean z5) {
        C0626q c0626q2;
        c0626q.d0(1268128132);
        int i7 = i6 | 6 | (c0626q.g(z5) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            InterfaceC1041r A5 = AbstractC1787b.A(S.l.f7374V, 12, 1, v.t0.a);
            if (z5) {
                c0626q.b0(273080274);
                D0.a(AbstractC0874g.c(-823283560, new C0562c0(A5, 1), c0626q), c0626q, 438);
                c0626q.p(false);
                c0626q2 = c0626q;
            } else {
                c0626q.b0(273442602);
                F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
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
                T.r.G(c0626q, d6, C0150g.f1928f);
                T.r.G(c0626q, l3, C0150g.f1927e);
                T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                T.r.C(c0626q, C0150g.f1930h);
                T.r.G(c0626q, c6, C0150g.f1926d);
                c0626q2 = c0626q;
                R1.f(null, 1, o0.s.c(0.3f, ((Q.N) c0626q.j(Q.O.a)).f5378A), c0626q2, 48, 1);
                c0626q2.p(true);
                c0626q2.p(false);
            }
            interfaceC1041r = C1038o.a;
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new D.O(i6, 4, interfaceC1041r, z5);
        }
    }

    public static final void j(String str, C0584p c0584p, S0.P p5, boolean z5, C0626q c0626q, int i6) {
        C0626q c0626q2;
        long j3;
        float f6;
        long j4;
        boolean z6;
        AbstractC1276k.f(str, "content");
        c0626q.d0(-1567104103);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.f(c0584p) ? 32 : 16) | (c0626q.f(p5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            AbstractC0623o0 abstractC0623o0 = Q.O.a;
            long j5 = ((Q.N) c0626q.j(abstractC0623o0)).a;
            long c6 = o0.s.c(0.6f, ((Q.N) c0626q.j(abstractC0623o0)).f5422l);
            long j6 = p5.a.f7571b;
            e1.o oVar = new e1.o(j6);
            if (e1.o.a(j6, e1.o.f11580c)) {
                oVar = null;
            }
            if (oVar == null) {
                c0626q.b0(1546493185);
                j3 = ((t3) c0626q.j(u3.a)).f6130k.a.f7571b;
                c0626q.p(false);
            } else {
                c0626q.b0(1546489310);
                c0626q.p(false);
                j3 = oVar.a;
            }
            C1774l c1774l = AbstractC0558a0.a;
            String e6 = AbstractC0558a0.e(y(str));
            boolean f7 = c0626q.f(e6) | c0626q.e(j5) | c0626q.e(c6) | c0626q.e(j3);
            Object P5 = c0626q.P();
            if (f7 || P5 == C0616l.a) {
                P5 = AbstractC0570g0.a(e6, j5, c6, j3);
                c0626q.m0(P5);
            }
            C0545g c0545g = (C0545g) P5;
            o0.s sVar = c0584p.a;
            long b5 = sVar != null ? sVar.a : p5.b();
            o0.s sVar2 = c0584p.f7838b;
            long j7 = sVar2 != null ? sVar2.a : o0.s.f13480g;
            Float f8 = c0584p.f7842f;
            float floatValue = f8 != null ? f8.floatValue() : S.l.f7374V;
            Float f9 = c0584p.f7843g;
            float floatValue2 = f9 != null ? f9.floatValue() : S.l.f7374V;
            Float f10 = c0584p.f7841e;
            float floatValue3 = f10 != null ? f10.floatValue() : S.l.f7374V;
            Float f11 = c0584p.f7840d;
            float floatValue4 = f11 != null ? f11.floatValue() : 0;
            o0.s sVar3 = c0584p.f7839c;
            if (sVar3 != null) {
                f6 = floatValue2;
                j4 = sVar3.a;
            } else {
                f6 = floatValue2;
                j4 = o0.s.f13480g;
            }
            Float f12 = c0584p.f7844h;
            float floatValue5 = f12 != null ? f12.floatValue() : S.l.f7374V;
            float f13 = 0;
            C.d a6 = e1.f.b(floatValue3, f13) > 0 ? C.e.a(floatValue3) : null;
            float f14 = e1.f.b(floatValue4, f13) > 0 ? 12 : f13;
            C1818y c1818y = v.t0.a;
            InterfaceC1041r C5 = AbstractC1787b.C(c1818y, S.l.f7374V, S.l.f7374V, S.l.f7374V, floatValue5, 7);
            C1813t a7 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, C5);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a = C0150g.f1924b;
            c0626q.f0();
            long j8 = b5;
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q, a7, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q, c0144d);
            float f15 = f14;
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q, c7, c0146e4);
            InterfaceC1041r r5 = AbstractC1787b.r(c1818y);
            long j9 = j4;
            C1038o c1038o = C1038o.a;
            InterfaceC1041r c8 = r5.c(a6 != null ? l0.h.c(c1038o, a6) : c1038o);
            if (a6 == null) {
                a6 = C.e.a(f13);
            }
            InterfaceC1041r z7 = AbstractC1787b.z(AbstractC1464z.f(c8, j7, a6), floatValue, f6);
            v.p0 a8 = v.o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q, 0);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c9 = AbstractC1024a.c(c0626q, z7);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a8, c0146e);
            T.r.G(c0626q, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c9, c0146e4);
            if (e1.f.b(floatValue4, f13) > 0) {
                c0626q.b0(1765133565);
                z6 = false;
                AbstractC1806l.a(AbstractC1464z.f(v.t0.n(c1038o, floatValue4).c(v.t0.f15348b), j9, o0.y.f13496b), c0626q, 0);
                AbstractC1787b.h(c0626q, v.t0.n(c1038o, f15));
            } else {
                z6 = false;
                c0626q.b0(1759660515);
            }
            c0626q.p(z6);
            c0626q2 = c0626q;
            t(c0545g, S0.P.a(p5, j8, 0L, null, null, null, 0L, null, 0L, null, 16777214), null, z5, true, 0, 0, false, c0626q2, (i7 & 7168) | 24576, 228);
            c0626q2.p(true);
            c0626q2.p(true);
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new Q2.g(str, c0584p, p5, z5, i6, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(S2.G r27, S0.P r28, boolean r29, T.C0626q r30, int r31) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.AbstractC0565e.k(S2.G, S0.P, boolean, T.q, int):void");
    }

    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    public static final void l(String str, String str2, String str3, C0626q c0626q, int i6) {
        C0626q c0626q2;
        boolean z5;
        boolean z6;
        InterfaceC1041r interfaceC1041r;
        C0146e c0146e;
        C0146e c0146e2;
        C0144d c0144d;
        C0146e c0146e3;
        C0148f c0148f;
        C0146e c0146e4;
        C1033j c1033j;
        C1038o c1038o;
        Context context;
        C1031h c1031h;
        C1818y c1818y;
        int i7;
        final ?? r9;
        boolean z7;
        C0626q c0626q3;
        boolean z8;
        boolean z9;
        C0602e c0602e;
        float f6;
        C0626q c0626q4;
        C0626q c0626q5;
        C0626q c0626q6;
        final C0601d0 c0601d0;
        Object obj;
        C0148f c0148f2;
        float f7;
        C1038o c1038o2;
        boolean z10;
        C0626q c0626q7;
        C0626q c0626q8;
        final C0601d0 c0601d02;
        boolean z11;
        Object obj2;
        C0602e c0602e2;
        boolean z12;
        String j3;
        boolean z13;
        C0626q c0626q9;
        C0626q c0626q10 = c0626q;
        C1031h c1031h2 = C1026c.f11799q;
        C1033j c1033j2 = C1026c.f11790h;
        AbstractC1276k.f(str, "altText");
        AbstractC1276k.f(str2, "url");
        c0626q10.d0(2038260531);
        int i8 = i6 | (c0626q10.f(str) ? 4 : 2) | (c0626q10.f(str2) ? 32 : 16) | (c0626q10.f(str3) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q10.S(i8 & 1, (i8 & 147) != 146)) {
            Context context2 = (Context) c0626q10.j(AndroidCompositionLocals_androidKt.f10780b);
            C0889e c0889e = (C0889e) c0626q10.j(AbstractC0897m.a);
            Object P5 = c0626q10.P();
            C0602e c0602e3 = C0616l.a;
            Object obj3 = P5;
            if (P5 == c0602e3) {
                C0601d0 z14 = T.r.z();
                c0626q10.m0(z14);
                obj3 = z14;
            }
            C0601d0 c0601d03 = (C0601d0) obj3;
            int i9 = i8 & 112;
            boolean h3 = c0626q10.h(context2) | (i9 == 32);
            Object P6 = c0626q10.P();
            Object obj4 = P6;
            if (h3 || P6 == c0602e3) {
                C0585q c0585q = new C0585q(context2, str2, 3);
                c0626q10.m0(c0585q);
                obj4 = c0585q;
            }
            InterfaceC1193a interfaceC1193a = (InterfaceC1193a) obj4;
            boolean f8 = c0626q10.f(c0889e) | (i9 == 32);
            Object P7 = c0626q10.P();
            Object obj5 = P7;
            if (f8 || P7 == c0602e3) {
                D.r rVar = new D.r(23, c0889e, str2);
                c0626q10.m0(rVar);
                obj5 = rVar;
            }
            InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) obj5;
            boolean d6 = c0626q10.d(c0601d03.g()) | (i9 == 32);
            Object P8 = c0626q10.P();
            if (d6 || P8 == c0602e3) {
                if (c0601d03.g() == 0) {
                    P8 = str2;
                } else {
                    P8 = str2 + "?retry=" + c0601d03.g();
                }
                c0626q10.m0(P8);
            }
            String str4 = (String) P8;
            boolean f9 = c0626q10.f(str4);
            Object P9 = c0626q10.P();
            Object obj6 = P9;
            if (f9 || P9 == c0602e3) {
                C1660h c1660h = new C1660h(context2);
                c1660h.f14751c = str4;
                c1660h.f14755g = v2.b.a;
                C1661i a6 = c1660h.a();
                c0626q10.m0(a6);
                obj6 = a6;
            }
            c0626q10.c0(236159766);
            C1115i d7 = j2.n.d(j2.v.a, c0626q10);
            C0990m c0990m = j2.l.f12377w;
            C0110b0 c0110b0 = C0120h.f1476b;
            j2.l e6 = j2.n.e((C1661i) obj6, d7, c0990m, null, c0110b0, c0626q10, 0);
            c0626q10.p(false);
            j2.e eVar = (j2.e) e6.f12390t.getValue();
            boolean z15 = eVar instanceof j2.c;
            boolean z16 = eVar instanceof C1146b;
            boolean z17 = eVar instanceof j2.d;
            C1818y c1818y2 = v.t0.a;
            C1813t a7 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q10, 0);
            int hashCode = Long.hashCode(c0626q10.f8164T);
            InterfaceC0617l0 l3 = c0626q10.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q10, c1818y2);
            InterfaceC0152h.a.getClass();
            C0148f c0148f3 = C0150g.f1924b;
            c0626q10.f0();
            if (c0626q10.f8163S) {
                c0626q10.k(c0148f3);
            } else {
                c0626q10.p0();
            }
            C0146e c0146e5 = C0150g.f1928f;
            T.r.G(c0626q10, a7, c0146e5);
            C0146e c0146e6 = C0150g.f1927e;
            T.r.G(c0626q10, l3, c0146e6);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e7 = C0150g.f1929g;
            T.r.x(c0626q10, valueOf, c0146e7);
            C0144d c0144d2 = C0150g.f1930h;
            T.r.C(c0626q10, c0144d2);
            C0146e c0146e8 = C0150g.f1926d;
            T.r.G(c0626q10, c6, c0146e8);
            float f10 = 8;
            InterfaceC1041r c7 = l0.h.c(v.t0.e(c1818y2, 200, 400), C.e.a(f10));
            C1038o c1038o3 = C1038o.a;
            if (z17) {
                z5 = z15;
                z6 = false;
                interfaceC1041r = AbstractC1464z.m(c1038o3, false, interfaceC1193a, interfaceC1193a2, 239);
            } else {
                z5 = z15;
                z6 = false;
                interfaceC1041r = c1038o3;
            }
            InterfaceC1041r c8 = c7.c(interfaceC1041r);
            F0.V d8 = AbstractC1806l.d(C1026c.f11786c, z6);
            int hashCode2 = Long.hashCode(c0626q10.f8164T);
            InterfaceC0617l0 l5 = c0626q10.l();
            InterfaceC1041r c9 = AbstractC1024a.c(c0626q10, c8);
            c0626q10.f0();
            if (c0626q10.f8163S) {
                c0626q10.k(c0148f3);
            } else {
                c0626q10.p0();
            }
            T.r.G(c0626q10, d8, c0146e5);
            T.r.G(c0626q10, l5, c0146e6);
            AbstractC1135a.n(hashCode2, c0626q10, c0146e7, c0626q10, c0144d2);
            T.r.G(c0626q10, c9, c0146e8);
            C1810p c1810p = C1810p.f15333b;
            String str5 = str.length() > 0 ? str : null;
            if (str5 == null) {
                str5 = B3.e.j(c0626q10, 890858499, R.string.markdown_image_content_desc, c0626q10, false);
            } else {
                c0626q10.b0(890856701);
                c0626q10.p(false);
            }
            AbstractC1464z.b(e6, str5, c1810p.h(), null, c0110b0, S.l.f7374V, c0626q, 24576, 104);
            C0626q c0626q11 = c0626q;
            if (z5) {
                c0626q11.b0(1847075613);
                InterfaceC1041r h6 = c1810p.h();
                e1 e1Var = Q.O.a;
                InterfaceC1041r f11 = AbstractC1464z.f(h6, o0.s.c(0.3f, ((Q.N) c0626q11.j(e1Var)).f5428r), C.e.a(f10));
                F0.V d9 = AbstractC1806l.d(c1033j2, false);
                int hashCode3 = Long.hashCode(c0626q11.f8164T);
                InterfaceC0617l0 l6 = c0626q11.l();
                InterfaceC1041r c10 = AbstractC1024a.c(c0626q11, f11);
                c0626q11.f0();
                if (c0626q11.f8163S) {
                    c0626q11.k(c0148f3);
                } else {
                    c0626q11.p0();
                }
                T.r.G(c0626q11, d9, c0146e5);
                T.r.G(c0626q11, l6, c0146e6);
                AbstractC1135a.n(hashCode3, c0626q11, c0146e7, c0626q11, c0144d2);
                T.r.G(c0626q11, c10, c0146e8);
                C1813t a8 = AbstractC1812s.a(AbstractC1799h.f15306d, c1031h2, c0626q11, 54);
                int hashCode4 = Long.hashCode(c0626q11.f8164T);
                InterfaceC0617l0 l7 = c0626q11.l();
                InterfaceC1041r c11 = AbstractC1024a.c(c0626q11, c1038o3);
                c0626q11.f0();
                if (c0626q11.f8163S) {
                    c0626q11.k(c0148f3);
                } else {
                    c0626q11.p0();
                }
                T.r.G(c0626q11, a8, c0146e5);
                T.r.G(c0626q11, l7, c0146e6);
                AbstractC1135a.n(hashCode4, c0626q11, c0146e7, c0626q11, c0144d2);
                T.r.G(c0626q11, c11, c0146e8);
                c0148f = c0148f3;
                context = context2;
                c0146e3 = c0146e5;
                M1.a(v.t0.j(c1038o3, 32), ((Q.N) c0626q11.j(e1Var)).a, 3, 0L, 0, S.l.f7374V, c0626q, 390, 56);
                AbstractC1787b.h(c0626q, v.t0.d(c1038o3, 12));
                if (c0601d03.g() > 0) {
                    c0626q.b0(1983625246);
                    j3 = h5.e.k0(R.string.markdown_image_retrying, new Object[]{Integer.valueOf(c0601d03.g()), 3}, c0626q);
                    z12 = false;
                    c0626q.p(false);
                } else {
                    z12 = false;
                    j3 = B3.e.j(c0626q, 1983878485, R.string.markdown_image_loading, c0626q, false);
                }
                e1 e1Var2 = u3.a;
                boolean z18 = z12;
                c0146e4 = c0146e8;
                f3.b(j3, null, ((Q.N) c0626q.j(e1Var)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q.j(e1Var2)).f6131l, c0626q, 0, 0, 131066);
                C0626q c0626q12 = c0626q;
                if (str.length() > 0) {
                    c0626q12.b0(1984297667);
                    AbstractC1787b.h(c0626q12, v.t0.d(c1038o3, 4));
                    c1038o = c1038o3;
                    c1031h = c1031h2;
                    c0146e2 = c0146e7;
                    c1818y = c1818y2;
                    c0144d = c0144d2;
                    c0146e = c0146e6;
                    c1033j = c1033j2;
                    f3.b(str, null, 0L, 0L, null, 0L, new d1.k(3), 0L, 0, false, 2, 0, S0.P.a(((t3) c0626q12.j(e1Var2)).f6131l, o0.s.c(0.7f, ((Q.N) c0626q12.j(e1Var)).f5429s), 0L, null, null, null, 0L, null, 0L, null, 16777214), c0626q, i8 & 14, 24576, 113662);
                    c0626q9 = c0626q;
                    z13 = false;
                } else {
                    c1038o = c1038o3;
                    c1031h = c1031h2;
                    c0146e2 = c0146e7;
                    c1818y = c1818y2;
                    c0144d = c0144d2;
                    c0146e = c0146e6;
                    z13 = z18;
                    c1033j = c1033j2;
                    c0626q12.b0(1978240732);
                    c0626q9 = c0626q12;
                }
                c0626q9.p(z13);
                z7 = true;
                c0626q9.p(true);
                c0626q9.p(true);
                c0626q9.p(z13);
                i7 = 1842622835;
                c0626q3 = c0626q9;
                r9 = z13;
            } else {
                c0146e = c0146e6;
                c0146e2 = c0146e7;
                c0144d = c0144d2;
                c0146e3 = c0146e5;
                c0148f = c0148f3;
                c0146e4 = c0146e8;
                c1033j = c1033j2;
                c1038o = c1038o3;
                context = context2;
                c1031h = c1031h2;
                c1818y = c1818y2;
                i7 = 1842622835;
                r9 = 0;
                z7 = true;
                c0626q11.b0(1842622835);
                c0626q11.p(false);
                c0626q3 = c0626q11;
            }
            if (z16) {
                c0626q3.b0(1849384648);
                InterfaceC1041r f12 = AbstractC1464z.f(c1810p.h(), o0.s.c(0.3f, R1.r(c0626q3).f5435y), C.e.a(f10));
                Object P10 = c0626q3.P();
                if (P10 == c0602e3) {
                    c0601d0 = c0601d03;
                    InterfaceC1193a interfaceC1193a3 = new InterfaceC1193a() { // from class: S2.b0
                        @Override // l4.InterfaceC1193a
                        public final Object b() {
                            switch (r9) {
                                case 0:
                                    C0601d0 c0601d04 = c0601d0;
                                    if (c0601d04.g() < 3) {
                                        c0601d04.h(c0601d04.g() + 1);
                                    }
                                    return X3.y.a;
                                default:
                                    C0601d0 c0601d05 = c0601d0;
                                    c0601d05.h(c0601d05.g() + 1);
                                    return X3.y.a;
                            }
                        }
                    };
                    c0626q3.m0(interfaceC1193a3);
                    obj = interfaceC1193a3;
                } else {
                    c0601d0 = c0601d03;
                    obj = P10;
                }
                InterfaceC1041r a9 = AbstractC1992b.a(31, f12, (InterfaceC1193a) obj, r9);
                F0.V d10 = AbstractC1806l.d(c1033j, r9);
                int hashCode5 = Long.hashCode(c0626q3.f8164T);
                InterfaceC0617l0 l8 = c0626q3.l();
                InterfaceC1041r c12 = AbstractC1024a.c(c0626q3, a9);
                c0626q3.f0();
                if (c0626q3.f8163S) {
                    c0148f2 = c0148f;
                    c0626q3.k(c0148f2);
                } else {
                    c0148f2 = c0148f;
                    c0626q3.p0();
                }
                C0146e c0146e9 = c0146e3;
                T.r.G(c0626q3, d10, c0146e9);
                C0146e c0146e10 = c0146e;
                T.r.G(c0626q3, l8, c0146e10);
                C0146e c0146e11 = c0146e2;
                C0144d c0144d3 = c0144d;
                AbstractC1135a.n(hashCode5, c0626q3, c0146e11, c0626q3, c0144d3);
                C0146e c0146e12 = c0146e4;
                T.r.G(c0626q3, c12, c0146e12);
                C1791d c1791d = AbstractC1799h.f15306d;
                C1038o c1038o4 = c1038o;
                InterfaceC1041r y5 = AbstractC1787b.y(c1038o4, 16);
                C1813t a10 = AbstractC1812s.a(c1791d, c1031h, c0626q3, 54);
                int hashCode6 = Long.hashCode(c0626q3.f8164T);
                InterfaceC0617l0 l9 = c0626q3.l();
                InterfaceC1041r c13 = AbstractC1024a.c(c0626q3, y5);
                c0626q3.f0();
                if (c0626q3.f8163S) {
                    c0626q3.k(c0148f2);
                } else {
                    c0626q3.p0();
                }
                T.r.G(c0626q3, a10, c0146e9);
                T.r.G(c0626q3, l9, c0146e10);
                AbstractC1135a.n(hashCode6, c0626q3, c0146e11, c0626q3, c0144d3);
                T.r.G(c0626q3, c13, c0146e12);
                Q.A0.a(Y3.C.L(R.drawable.broken_image, r9, c0626q3), h5.e.j0(R.string.markdown_image_error_desc, c0626q3), v.t0.j(c1038o4, 40), R1.r(c0626q3).f5433w, c0626q3, 392, 0);
                float f13 = 12;
                AbstractC1787b.h(c0626q3, v.t0.d(c1038o4, f13));
                C0601d0 c0601d04 = c0601d0;
                f3.b(h5.e.j0(R.string.markdown_image_load_failed, c0626q3), null, R1.r(c0626q3).f5433w, 0L, null, 0L, new d1.k(3), 0L, 0, false, 0, 0, R1.t(c0626q3).f6128i, c0626q, 0, 0, 130042);
                C0626q c0626q13 = c0626q;
                if (str.length() > 0) {
                    c0626q13.b0(830691882);
                    AbstractC1787b.h(c0626q13, v.t0.d(c1038o4, f10));
                    f7 = f10;
                    c1038o2 = c1038o4;
                    f3.b(str, null, R1.r(c0626q13).f5436z, 0L, null, 0L, new d1.k(3), 0L, 0, false, 2, 0, R1.t(c0626q13).f6131l, c0626q, i8 & 14, 24576, 113658);
                    c0626q7 = c0626q;
                    z10 = false;
                } else {
                    f7 = f10;
                    c1038o2 = c1038o4;
                    z10 = false;
                    c0626q13.b0(822351301);
                    c0626q7 = c0626q13;
                }
                c0626q7.p(z10);
                if (c0601d04.g() < 3) {
                    c0626q7.b0(831226539);
                    AbstractC1787b.h(c0626q7, v.t0.d(c1038o2, f13));
                    Object P11 = c0626q7.P();
                    if (P11 == c0602e3) {
                        c0601d02 = c0601d04;
                        z11 = true;
                        final boolean z19 = true ? 1 : 0;
                        InterfaceC1193a interfaceC1193a4 = new InterfaceC1193a() { // from class: S2.b0
                            @Override // l4.InterfaceC1193a
                            public final Object b() {
                                switch (z19) {
                                    case 0:
                                        C0601d0 c0601d042 = c0601d02;
                                        if (c0601d042.g() < 3) {
                                            c0601d042.h(c0601d042.g() + 1);
                                        }
                                        return X3.y.a;
                                    default:
                                        C0601d0 c0601d05 = c0601d02;
                                        c0601d05.h(c0601d05.g() + 1);
                                        return X3.y.a;
                                }
                            }
                        };
                        c0626q7.m0(interfaceC1193a4);
                        obj2 = interfaceC1193a4;
                    } else {
                        c0601d02 = c0601d04;
                        z11 = true;
                        obj2 = P11;
                    }
                    InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) obj2;
                    v.k0 k0Var = AbstractC0461s.a;
                    long j4 = R1.r(c0626q7).f5433w;
                    long j5 = o0.s.f13481h;
                    Q.N n3 = (Q.N) c0626q7.j(Q.O.a);
                    Q.r rVar2 = n3.f5401X;
                    if (rVar2 == null) {
                        long j6 = o0.s.f13480g;
                        c0602e2 = c0602e3;
                        Q.r rVar3 = new Q.r(j6, Q.O.c(n3, S.l.f7383i), j6, o0.s.c(S.l.f7382h, Q.O.c(n3, S.l.f7381g)));
                        n3.f5401X = rVar3;
                        rVar2 = rVar3;
                    } else {
                        c0602e2 = c0602e3;
                    }
                    long j7 = j5 != 16 ? j5 : rVar2.a;
                    if (j4 == 16) {
                        j4 = rVar2.f6064b;
                    }
                    long j8 = j4;
                    long j9 = j5 != 16 ? j5 : rVar2.f6065c;
                    if (j5 == 16) {
                        j5 = rVar2.f6066d;
                    }
                    R1.k(interfaceC1193a5, null, false, null, new Q.r(j7, j8, j9, j5), null, null, AbstractC0874g.c(-178958783, new b1(c0601d02, 9), c0626q7), c0626q7, 805306374);
                    c0626q7.p(z10);
                    z8 = z10;
                    z9 = z11;
                    c0602e = c0602e2;
                    f6 = f7;
                    c0626q8 = c0626q7;
                } else {
                    c0626q7.b0(832008855);
                    float f14 = f7;
                    AbstractC1787b.h(c0626q7, v.t0.d(c1038o2, f14));
                    c0602e = c0602e3;
                    f6 = f14;
                    f3.b(h5.e.j0(R.string.markdown_image_retry_limit, c0626q7), null, o0.s.c(0.7f, R1.r(c0626q7).f5436z), 0L, null, 0L, null, 0L, 0, false, 0, 0, R1.t(c0626q7).f6131l, c0626q, 0, 0, 131066);
                    C0626q c0626q14 = c0626q;
                    z8 = false;
                    c0626q14.p(false);
                    z9 = true;
                    c0626q8 = c0626q14;
                }
                c0626q8.p(z9);
                c0626q8.p(z9);
                c0626q4 = c0626q8;
            } else {
                z8 = r9;
                z9 = z7;
                c0602e = c0602e3;
                f6 = f10;
                c0626q3.b0(i7);
                c0626q4 = c0626q3;
            }
            c0626q4.p(z8);
            c0626q4.p(z9);
            if (!z17 || (str.length() <= 0 && str3 == null)) {
                c0626q4.b0(-809538279);
                c0626q5 = c0626q4;
            } else {
                c0626q4.b0(-799239831);
                String str6 = str3 == null ? str : str3;
                if (str6.length() > 0) {
                    c0626q4.b0(-799160378);
                    S0.P p5 = ((t3) c0626q4.j(u3.a)).f6131l;
                    long j10 = ((Q.N) c0626q4.j(Q.O.a)).f5429s;
                    InterfaceC1041r z20 = AbstractC1787b.z(c1818y, 12, f6);
                    Context context3 = context;
                    boolean h7 = c0626q4.h(context3) | c0626q4.f(str6);
                    Object P12 = c0626q4.P();
                    C0602e c0602e4 = c0602e;
                    Object obj7 = P12;
                    if (h7 || P12 == c0602e4) {
                        C0585q c0585q2 = new C0585q(context3, str6, 4);
                        c0626q4.m0(c0585q2);
                        obj7 = c0585q2;
                    }
                    InterfaceC1193a interfaceC1193a6 = (InterfaceC1193a) obj7;
                    Object P13 = c0626q4.P();
                    Object obj8 = P13;
                    if (P13 == c0602e4) {
                        O.A a11 = new O.A(19);
                        c0626q4.m0(a11);
                        obj8 = a11;
                    }
                    f3.b(str6, AbstractC1464z.m(z20, z8, interfaceC1193a6, (InterfaceC1193a) obj8, 239), j10, 0L, null, 0L, new d1.k(3), 0L, 0, false, 0, 0, p5, c0626q, 0, 0, 130040);
                    c0626q6 = c0626q;
                    z8 = false;
                } else {
                    c0626q4.b0(-809538279);
                    c0626q6 = c0626q4;
                }
                c0626q6.p(z8);
                c0626q5 = c0626q6;
            }
            c0626q5.p(z8);
            c0626q5.p(true);
            c0626q2 = c0626q5;
        } else {
            c0626q10.V();
            c0626q2 = c0626q10;
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new D.L(str, str2, str3, i6, 6);
        }
    }

    public static final void m(String str, S0.P p5, boolean z5, C0626q c0626q, int i6) {
        c0626q.d0(-1837661779);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.f(p5) ? 32 : 16) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
            W0.k kVar = W0.k.f8835i;
            AbstractC0623o0 abstractC0623o0 = Q.O.a;
            S0.P a6 = S0.P.a(p5, ((Q.N) c0626q.j(abstractC0623o0)).f5427q, 0L, kVar, null, W0.p.f8844c, 0L, null, 0L, null, 16777178);
            long c6 = o0.s.c(0.25f, ((Q.N) c0626q.j(abstractC0623o0)).f5407c);
            float f6 = 4;
            InterfaceC1041r z6 = AbstractC1787b.z(AbstractC1464z.f(C1038o.a, c6, C.e.a(f6)), f6, 2);
            int i8 = i7 & 14;
            boolean h3 = c0626q.h(context) | (i8 == 4);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new C0585q(context, str, 1);
                c0626q.m0(P5);
            }
            D0.d(str, a6, AbstractC1992b.a(31, z6, (InterfaceC1193a) P5, false), z5, 0, S.l.f7374V, 0, 0, false, c0626q, i8 | ((i7 << 3) & 7168));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0586s(str, p5, z5, i6, 0);
        }
    }

    public static final void n(final ArrayList arrayList, final S0.P p5, final boolean z5, C0626q c0626q, int i6) {
        long j3;
        c0626q.d0(1235131920);
        int i7 = i6 | (c0626q.h(arrayList) ? 4 : 2) | (c0626q.f(p5) ? 32 : 16) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            e1 e1Var = Q.O.a;
            final long j4 = ((Q.N) c0626q.j(e1Var)).f5427q;
            final long j5 = ((Q.N) c0626q.j(e1Var)).a;
            final long j6 = o0.s.f13480g;
            final long c6 = o0.s.c(0.6f, ((Q.N) c0626q.j(e1Var)).f5422l);
            long j7 = p5.a.f7571b;
            e1.o oVar = !e1.o.a(j7, e1.o.f11580c) ? new e1.o(j7) : null;
            if (oVar == null) {
                c0626q.b0(1550818904);
                j3 = ((t3) c0626q.j(u3.a)).f6130k.a.f7571b;
                c0626q.p(false);
            } else {
                c0626q.b0(1550815804);
                c0626q.p(false);
                j3 = oVar.a;
            }
            final long j8 = j3;
            AbstractC1787b.b(v.t0.a, null, null, null, 0, 0, AbstractC0874g.c(-72983435, new l4.f() { // from class: S2.g
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v0 */
                /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r14v3 */
                /* JADX WARN: Type inference failed for: r6v5 */
                @Override // l4.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    boolean z6;
                    int i8;
                    ArrayList arrayList2;
                    Object i9;
                    boolean z7;
                    Iterable<InterfaceC0582n> iterable;
                    char c7;
                    int i10;
                    C0626q c0626q2 = (C0626q) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    AbstractC1276k.f((v.I) obj, "$this$FlowRow");
                    boolean z8 = true;
                    ?? r14 = 0;
                    if (c0626q2.S(intValue & 1, (intValue & 17) != 16)) {
                        ArrayList arrayList3 = arrayList;
                        int size = arrayList3.size();
                        int i11 = 0;
                        C0626q c0626q3 = c0626q2;
                        while (i11 < size) {
                            int i12 = i11 + 1;
                            X x5 = (X) arrayList3.get(i11);
                            boolean z9 = x5 instanceof L;
                            S0.P p6 = p5;
                            boolean z10 = z5;
                            if (z9) {
                                c0626q3.b0(1188370289);
                                AbstractC0565e.o(((L) x5).a, p6, z10, c0626q3, r14);
                                c0626q3.p(r14);
                                z6 = z8;
                                i8 = size;
                                arrayList2 = arrayList3;
                                z7 = r14;
                            } else {
                                if (x5 instanceof V) {
                                    c0626q3.b0(-1815006913);
                                    String str = ((V) x5).a;
                                    int length = str.length();
                                    C0579l c0579l = C0579l.a;
                                    if (length == 0) {
                                        iterable = Y3.v.f9812c;
                                        z6 = z8;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        StringBuilder sb = new StringBuilder();
                                        int i13 = r14;
                                        while (i13 < str.length()) {
                                            char charAt = str.charAt(i13);
                                            boolean z11 = z8;
                                            if (charAt == '\n' || charAt == '\r') {
                                                if (sb.length() > 0) {
                                                    String sb2 = sb.toString();
                                                    AbstractC1276k.e(sb2, "toString(...)");
                                                    arrayList4.add(new C0581m(sb2));
                                                    sb.setLength(r14);
                                                    c7 = '\r';
                                                } else {
                                                    c7 = '\r';
                                                }
                                                if (charAt == c7 && (i10 = i13 + 1) < str.length() && str.charAt(i10) == '\n') {
                                                    i13 = i10;
                                                }
                                                arrayList4.add(c0579l);
                                            } else {
                                                sb.append(charAt);
                                            }
                                            i13++;
                                            z8 = z11;
                                        }
                                        z6 = z8;
                                        if (sb.length() > 0) {
                                            String sb3 = sb.toString();
                                            AbstractC1276k.e(sb3, "toString(...)");
                                            arrayList4.add(new C0581m(sb3));
                                        }
                                        iterable = arrayList4;
                                    }
                                    for (InterfaceC0582n interfaceC0582n : iterable) {
                                        if (interfaceC0582n instanceof C0581m) {
                                            c0626q3.b0(-1605017198);
                                            S0.P p7 = p6;
                                            AbstractC0565e.u(((C0581m) interfaceC0582n).a, p7, null, z10, c0626q3, 0);
                                            p6 = p7;
                                            c0626q3.p(r14);
                                        } else {
                                            if (!AbstractC1276k.b(interfaceC0582n, c0579l)) {
                                                c0626q3.b0(-1605019242);
                                                c0626q3.p(r14);
                                                throw new RuntimeException();
                                            }
                                            c0626q3.b0(-1605009038);
                                            AbstractC1787b.h(c0626q3, v.t0.a);
                                            c0626q3.p(r14);
                                        }
                                    }
                                    c0626q3.p(r14);
                                } else {
                                    z6 = z8;
                                    if (x5 instanceof G) {
                                        c0626q3.b0(-1814437722);
                                        AbstractC0565e.k((G) x5, p6, z10, c0626q3, r14);
                                        c0626q3.p(r14);
                                    } else {
                                        c0626q3.b0(-1814171959);
                                        boolean f6 = c0626q3.f(x5);
                                        long j9 = j4;
                                        boolean e6 = f6 | c0626q3.e(j9);
                                        long j10 = j5;
                                        boolean e7 = e6 | c0626q3.e(j10);
                                        long j11 = c6;
                                        boolean e8 = e7 | c0626q3.e(j11);
                                        i8 = size;
                                        long j12 = j8;
                                        boolean e9 = e8 | c0626q3.e(j12);
                                        Object P5 = c0626q3.P();
                                        if (e9 || P5 == C0616l.a) {
                                            C0542d c0542d = new C0542d();
                                            arrayList2 = arrayList3;
                                            C0577k.a(c0542d, x5, j9, j10, j6, j11, j12, new S0.z(29));
                                            i9 = c0542d.i();
                                            c0626q3.m0(i9);
                                        } else {
                                            arrayList2 = arrayList3;
                                            i9 = P5;
                                        }
                                        C0626q c0626q4 = c0626q3;
                                        AbstractC0565e.t((C0545g) i9, p6, null, z10, false, 0, 0, false, c0626q4, 0, 244);
                                        c0626q3 = c0626q4;
                                        z7 = false;
                                        c0626q3.p(false);
                                    }
                                }
                                arrayList2 = arrayList3;
                                z7 = r14;
                                i8 = size;
                            }
                            size = i8;
                            r14 = z7;
                            arrayList3 = arrayList2;
                            i11 = i12;
                            z8 = z6;
                            c0626q3 = c0626q3;
                        }
                    } else {
                        c0626q2.V();
                    }
                    return X3.y.a;
                }
            }, c0626q), c0626q, 1572870);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new P2.G(arrayList, p5, z5, i6, 4);
        }
    }

    public static final void o(String str, S0.P p5, boolean z5, C0626q c0626q, int i6) {
        long j3;
        long j4;
        S0.G g3 = p5.a;
        c0626q.d0(-1190188344);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.f(p5) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
            if (o0.s.d(p5.b(), o0.s.f13481h)) {
                c0626q.b0(-1945681017);
                j3 = ((Q.N) c0626q.j(Q.O.a)).f5427q;
                c0626q.p(false);
            } else {
                c0626q.b0(-1945714497);
                c0626q.p(false);
                j3 = p5.b();
            }
            long j5 = g3.f7571b;
            long j6 = e1.o.f11580c;
            if (e1.o.a(j5, j6)) {
                c0626q.b0(-1945541858);
                j4 = ((t3) c0626q.j(u3.a)).f6130k.a.f7571b;
                c0626q.p(false);
            } else {
                c0626q.b0(-1945477316);
                c0626q.p(false);
                j4 = g3.f7571b;
            }
            InterfaceC1041r z6 = AbstractC1787b.z(C1038o.a, 2, 1);
            int i8 = i7 & 14;
            boolean h3 = c0626q.h(context) | (i8 == 4);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new C0585q(context, str, 2);
                c0626q.m0(P5);
            }
            InterfaceC1041r a6 = AbstractC1992b.a(31, z6, (InterfaceC1193a) P5, false);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, a6);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            r(str, false, j3, e1.o.a(j4, j6) ? 16.0f : e1.o.c(j4), null, c0626q, i8 | 48);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0586s(str, p5, z5, i6, 1);
        }
    }

    public static final void p(String str, String str2, S0.P p5, boolean z5, C0626q c0626q, int i6) {
        AbstractC1276k.f(str, "text");
        AbstractC1276k.f(str2, "url");
        c0626q.d0(1842978243);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.f(str2) ? 32 : 16) | (c0626q.f(p5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            c0626q.b0(1575570545);
            C0542d c0542d = new C0542d();
            c0626q.b0(1575571500);
            int g3 = c0542d.g(new C0551m(str2, null, 6));
            try {
                int h3 = c0542d.h(new S0.G(((Q.N) c0626q.j(Q.O.a)).a, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, d1.l.f11394c, (C1389K) null, 61438));
                try {
                    c0542d.e(str);
                    c0542d.f(g3);
                    c0626q.p(false);
                    C0545g i8 = c0542d.i();
                    c0626q.p(false);
                    t(i8, p5, null, z5, false, 0, 0, false, c0626q, ((i7 >> 3) & 112) | (i7 & 7168), 244);
                } finally {
                    c0542d.f(h3);
                }
            } catch (Throwable th) {
                c0542d.f(g3);
                throw th;
            }
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new Q2.g(str, str2, p5, z5, i6, 3);
        }
    }

    public static final void q(String str, boolean z5, C0626q c0626q, int i6) {
        String str2 = str;
        AbstractC1276k.f(str2, "formula");
        c0626q.d0(-1563745320);
        int i7 = (c0626q.f(str2) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            long j3 = ((Q.N) c0626q.j(Q.O.a)).f5427q;
            long j4 = ((t3) c0626q.j(u3.a)).f6130k.a.f7571b;
            InterfaceC1041r z6 = AbstractC1787b.z(v.t0.a, 12, 8);
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
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
            InterfaceC1041r r5 = AbstractC1464z.r(C1038o.a, AbstractC1464z.q(c0626q), false);
            v.p0 a7 = v.o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q, 0);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, r5);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a7, c0146e);
            T.r.G(c0626q, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c7, c0146e4);
            str2 = str;
            r(str2, true, j3, e1.o.a(j4, e1.o.f11580c) ? 16.0f : e1.o.c(j4), null, c0626q, (i7 & 14) | 48);
            c0626q.p(true);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.O(i6, 3, str2, z5);
        }
    }

    public static final void r(final String str, final boolean z5, final long j3, final float f6, InterfaceC1041r interfaceC1041r, C0626q c0626q, final int i6) {
        InterfaceC1041r interfaceC1041r2;
        InterfaceC1041r f7;
        InterfaceC1041r r5;
        c0626q.d0(-2147276539);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.e(j3) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.c(f6) ? 2048 : PegdownExtensions.ANCHORLINKS) | 24576;
        if (c0626q.S(i7 & 1, (i7 & 9363) != 9362)) {
            int i8 = i7 & 14;
            boolean z6 = ((i7 & 7168) == 2048) | ((i7 & 896) == 256) | (i8 == 4);
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (z6 || P5 == obj) {
                int B5 = o0.y.B(j3);
                String format = String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(((B5 >> 24) & 255) / 255.0f)}, 1));
                StringBuilder j4 = AbstractC1135a.j((B5 >> 16) & 255, "rgba(", (B5 >> 8) & 255, ", ", ", ");
                j4.append(B5 & 255);
                j4.append(", ");
                j4.append(format);
                j4.append(")");
                String sb = j4.toString();
                String B6 = u4.u.B(u4.u.B(u4.u.B(u4.u.B(u4.u.B(u4.u.B(u4.u.B(str, "&", "&amp;", false), "\"", "&quot;", false), "<", "&lt;", false), ">", "&gt;", false), "'", "&#39;", false), "\r", "&#13;", false), SequenceUtils.EOL, "&#10;", false);
                String lowerCase = String.valueOf(z5).toLowerCase(Locale.ROOT);
                AbstractC1276k.e(lowerCase, "toLowerCase(...)");
                P5 = u4.o.q("\n<!doctype html>\n<html>\n<head>\n  <meta charset=\"utf-8\" />\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\n  <link rel=\"stylesheet\" href=\"katex/katex.min.css\" />\n  <style>\n    html, body {\n      margin: 0;\n      padding: 0;\n      background: transparent;\n      color: " + sb + ";\n      font-size: " + f6 + "px;\n    }\n    #math {\n      display: inline-block;\n    }\n    .katex {\n      color: " + sb + ";\n    }\n  </style>\n</head>\n<body>\n  <div id=\"math\" data-formula=\"" + B6 + "\"></div>\n  <script src=\"katex/katex.min.js\"></script>\n  <script>\n    (function() {\n      var el = document.getElementById('math');\n      var formula = el.getAttribute('data-formula') || '';\n      try {\n        if (window.katex) {\n          window.katex.render(formula, el, {\n            displayMode: " + lowerCase + ",\n            throwOnError: false,\n            strict: \"ignore\"\n          });\n        } else {\n          el.textContent = formula;\n        }\n      } catch (e) {\n        el.textContent = formula;\n      }\n    })();\n  </script>\n</body>\n</html>\n");
                c0626q.m0(P5);
            }
            String str2 = (String) P5;
            boolean z7 = i8 == 4;
            Object P6 = c0626q.P();
            if (z7 || P6 == obj) {
                P6 = T.r.A(null);
                c0626q.m0(P6);
            }
            T.X x5 = (T.X) P6;
            boolean z8 = i8 == 4;
            Object P7 = c0626q.P();
            if (z8 || P7 == obj) {
                P7 = T.r.A(null);
                c0626q.m0(P7);
            }
            T.X x6 = (T.X) P7;
            Float f8 = (Float) x5.getValue();
            interfaceC1041r2 = C1038o.a;
            if (f8 != null) {
                Float f9 = (Float) x5.getValue();
                AbstractC1276k.c(f9);
                f7 = v.t0.d(interfaceC1041r2, f9.floatValue());
            } else {
                f7 = v.t0.f(z5 ? 28 : 18, S.l.f7374V, 2, interfaceC1041r2);
            }
            if (((Float) x6.getValue()) != null) {
                Float f10 = (Float) x6.getValue();
                AbstractC1276k.c(f10);
                r5 = v.t0.n(interfaceC1041r2, f10.floatValue());
            } else {
                r5 = v.t0.r(interfaceC1041r2);
            }
            InterfaceC1041r c6 = r5.c(f7);
            boolean f11 = c0626q.f(x5) | c0626q.f(x6);
            Object P8 = c0626q.P();
            if (f11 || P8 == obj) {
                P8 = new C0587t(x5, x6, 0);
                c0626q.m0(P8);
            }
            l4.c cVar = (l4.c) P8;
            boolean f12 = c0626q.f(str2);
            Object P9 = c0626q.P();
            if (f12 || P9 == obj) {
                P9 = new M2.b(str2, 7);
                c0626q.m0(P9);
            }
            h1.k.a(cVar, c6, (l4.c) P9, c0626q, 0);
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            final InterfaceC1041r interfaceC1041r3 = interfaceC1041r2;
            t5.f8193d = new l4.e(str, z5, j3, f6, interfaceC1041r3, i6) { // from class: S2.r

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f7863c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f7864e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f7865f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f7866g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f7867h;

                @Override // l4.e
                public final Object m(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int J4 = T.r.J(49);
                    AbstractC0565e.r(this.f7863c, this.f7864e, this.f7865f, this.f7866g, this.f7867h, (C0626q) obj2, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void s(List list, S0.P p5, boolean z5, C0626q c0626q, int i6) {
        long j3;
        String str;
        float f6;
        long j4;
        String str2;
        Iterator it;
        int i7;
        long j5;
        boolean z6;
        C0626q c0626q2 = c0626q;
        c0626q2.d0(-1351557870);
        int i8 = 4;
        int i9 = 2;
        int i10 = i6 | (c0626q2.h(list) ? 4 : 2) | (c0626q2.f(p5) ? 32 : 16) | (c0626q2.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        boolean z7 = false;
        if (c0626q2.S(i10 & 1, (i10 & 147) != 146)) {
            e1 e1Var = Q.O.a;
            long j6 = ((Q.N) c0626q2.j(e1Var)).a;
            long c6 = o0.s.c(0.6f, ((Q.N) c0626q2.j(e1Var)).f5422l);
            long j7 = p5.a.f7571b;
            e1.o oVar = new e1.o(j7);
            if (e1.o.a(j7, e1.o.f11580c)) {
                oVar = null;
            }
            if (oVar == null) {
                c0626q2.b0(-1766974502);
                j3 = ((t3) c0626q2.j(u3.a)).f6130k.a.f7571b;
                c0626q2.p(false);
            } else {
                c0626q2.b0(-1766978377);
                c0626q2.p(false);
                j3 = oVar.a;
            }
            long j8 = j3;
            C1818y c1818y = v.t0.a;
            float f7 = 8;
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.g(f7), C1026c.f11798p, c0626q2, 6);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, c1818y);
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
            T.r.G(c0626q2, c7, C0150g.f1926d);
            c0626q2.b0(2019163920);
            Iterator it2 = list.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    Y4.l.U();
                    throw null;
                }
                C0583o c0583o = (C0583o) next;
                L0 C5 = C(c0583o.a);
                if (C5 == null || (str = C5.f7723b) == null) {
                    str = c0583o.a;
                }
                String str3 = str;
                float f8 = i9;
                InterfaceC1041r B5 = AbstractC1787b.B(v.t0.a, (c0583o.f7834b * 16) + 8, f8, i8, f8);
                v.p0 a7 = v.o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q2, 48);
                int hashCode2 = Long.hashCode(c0626q2.f8164T);
                InterfaceC0617l0 l5 = c0626q2.l();
                InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, B5);
                InterfaceC0152h.a.getClass();
                C0148f c0148f2 = C0150g.f1924b;
                c0626q2.f0();
                long j9 = j6;
                if (c0626q2.f8163S) {
                    c0626q2.k(c0148f2);
                } else {
                    c0626q2.p0();
                }
                T.r.G(c0626q2, a7, C0150g.f1928f);
                T.r.G(c0626q2, l5, C0150g.f1927e);
                T.r.x(c0626q2, Integer.valueOf(hashCode2), C0150g.f1929g);
                T.r.C(c0626q2, C0150g.f1930h);
                T.r.G(c0626q2, c8, C0150g.f1926d);
                C1038o c1038o = C1038o.a;
                if (C5 != null) {
                    c0626q2.b0(1269746844);
                    f6 = f7;
                    j4 = j9;
                    Q.M.a(C5.a, AbstractC1787b.C(c1038o, S.l.f7374V, S.l.f7374V, f6, S.l.f7374V, 11), false, null, c0626q2, 3504);
                    c0626q2.p(false);
                    str2 = str3;
                    it = it2;
                    i7 = i12;
                    j5 = j8;
                    z6 = false;
                } else {
                    f6 = f7;
                    j4 = j9;
                    c0626q2.b0(1270029068);
                    Integer num = c0583o.f7835c;
                    str2 = str3;
                    it = it2;
                    i7 = i12;
                    j5 = j8;
                    z6 = false;
                    D0.d((num != null ? num.intValue() : i12) + ". ", p5, AbstractC1787b.C(c1038o, S.l.f7374V, S.l.f7374V, f6, S.l.f7374V, 11), z5, 0, S.l.f7374V, 0, 0, false, c0626q, (i10 & 112) | 384 | ((i10 << 3) & 7168));
                    c0626q2 = c0626q;
                    c0626q2.p(false);
                }
                long j10 = c6;
                long j11 = j5;
                boolean f9 = c0626q2.f(str2) | c0626q2.e(j4) | c0626q2.e(j10) | c0626q2.e(j11);
                Object P5 = c0626q2.P();
                if (f9 || P5 == C0616l.a) {
                    LinkedHashMap linkedHashMap = AbstractC0570g0.a;
                    c6 = j10;
                    j8 = j11;
                    P5 = AbstractC0570g0.a(y(str2), j4, c6, j8);
                    c0626q2.m0(P5);
                } else {
                    c6 = j10;
                    j8 = j11;
                }
                C0545g c0545g = (C0545g) P5;
                if (1.0f <= 0.0d) {
                    AbstractC1829a.a("invalid weight; must be greater than zero");
                }
                t(c0545g, p5, new v.Z(1.0f, true), z5, false, 0, 0, false, c0626q, (i10 & 112) | ((i10 << 3) & 7168), 240);
                c0626q2 = c0626q;
                c0626q2.p(true);
                j6 = j4;
                z7 = z6;
                it2 = it;
                i11 = i7;
                f7 = f6;
                i8 = 4;
                i9 = 2;
            }
            c0626q2.p(z7);
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new C0564d0(list, p5, z5, i6, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final S0.C0545g r13, final S0.P r14, h0.InterfaceC1041r r15, final boolean r16, boolean r17, int r18, int r19, boolean r20, T.C0626q r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.AbstractC0565e.t(S0.g, S0.P, h0.r, boolean, boolean, int, int, boolean, T.q, int, int):void");
    }

    public static final void u(String str, S0.P p5, InterfaceC1041r interfaceC1041r, boolean z5, C0626q c0626q, int i6) {
        InterfaceC1041r interfaceC1041r2;
        c0626q.d0(-744445190);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.f(p5) ? 32 : 16) | 384 | (c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            C1038o c1038o = C1038o.a;
            D0.d(str, p5, c1038o, z5, 0, S.l.f7374V, 0, 0, false, c0626q, i7 & 8190);
            interfaceC1041r2 = c1038o;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new Q2.g(str, p5, interfaceC1041r2, z5, i6, 1);
        }
    }

    public static final void v(final List list, final List list2, final List list3, final S0.P p5, final boolean z5, C0626q c0626q, final int i6) {
        C0627q0 t5;
        l4.e eVar;
        long j3;
        float floatValue;
        long c6;
        AbstractC1276k.f(list, "headers");
        AbstractC1276k.f(list3, "alignments");
        c0626q.d0(-1720172511);
        int i7 = i6 | (c0626q.h(list) ? 4 : 2) | (c0626q.h(list2) ? 32 : 16) | (c0626q.h(list3) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.f(p5) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.g(z5) ? 16384 : 8192);
        if (!c0626q.S(i7 & 1, (i7 & 9363) != 9362)) {
            c0626q.V();
        } else {
            if (list.isEmpty()) {
                t5 = c0626q.t();
                if (t5 != null) {
                    final int i8 = 0;
                    eVar = new l4.e(list, list2, list3, p5, z5, i6, i8) { // from class: S2.j0

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ int f7802c;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ List f7803e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ List f7804f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ List f7805g;

                        /* renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ S0.P f7806h;

                        /* renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ boolean f7807i;

                        {
                            this.f7802c = i8;
                        }

                        @Override // l4.e
                        public final Object m(Object obj, Object obj2) {
                            switch (this.f7802c) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int J4 = T.r.J(1);
                                    AbstractC0565e.v(this.f7803e, this.f7804f, this.f7805g, this.f7806h, this.f7807i, (C0626q) obj, J4);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int J5 = T.r.J(1);
                                    AbstractC0565e.v(this.f7803e, this.f7804f, this.f7805g, this.f7806h, this.f7807i, (C0626q) obj, J5);
                                    break;
                            }
                            return X3.y.a;
                        }
                    };
                    t5.f8193d = eVar;
                }
                return;
            }
            final float f6 = ((Configuration) c0626q.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            boolean z6 = e1.f.b(f6, (float) 400) < 0;
            AbstractC0623o0 abstractC0623o0 = Q.O.a;
            final long j4 = ((Q.N) c0626q.j(abstractC0623o0)).a;
            final long c7 = o0.s.c(0.6f, ((Q.N) c0626q.j(abstractC0623o0)).f5422l);
            long j5 = p5.a.f7571b;
            e1.o oVar = new e1.o(j5);
            if (e1.o.a(j5, e1.o.f11580c)) {
                oVar = null;
            }
            if (oVar == null) {
                c0626q.b0(476651113);
                j3 = ((t3) c0626q.j(u3.a)).f6130k.a.f7571b;
                c0626q.p(false);
            } else {
                c0626q.b0(476647238);
                c0626q.p(false);
                j3 = oVar.a;
            }
            final long j6 = j3;
            c0626q.b0(-822874773);
            if (z5) {
                Object P5 = c0626q.P();
                Object obj = C0616l.a;
                if (P5 == obj) {
                    P5 = AbstractC1318d.a(S.l.f7374V);
                    c0626q.m0(P5);
                }
                C1316c c1316c = (C1316c) P5;
                boolean h3 = c0626q.h(c1316c);
                Object P6 = c0626q.P();
                if (h3 || P6 == obj) {
                    P6 = new n0(c1316c, null);
                    c0626q.m0(P6);
                }
                T.r.f(c0626q, X3.y.a, (l4.e) P6);
                floatValue = ((Number) c1316c.d()).floatValue();
                c0626q.p(false);
            } else {
                c0626q.p(false);
                floatValue = 1.0f;
            }
            final float f7 = floatValue;
            final long j7 = ((Q.N) c0626q.j(abstractC0623o0)).f5426p;
            long c8 = o0.s.c(o0.s.e(j7) * f7, j7);
            final boolean z7 = z6;
            if (o0.y.t(((Q.N) c0626q.j(abstractC0623o0)).f5426p) > 0.5f) {
                c0626q.b0(1891623369);
                c6 = ((Q.N) c0626q.j(abstractC0623o0)).f5428r;
                c0626q.p(false);
            } else {
                c0626q.b0(1891685524);
                c6 = o0.s.c(0.3f, ((Q.N) c0626q.j(abstractC0623o0)).f5407c);
                c0626q.p(false);
            }
            final long c9 = o0.s.c(o0.s.e(c6) * f7, c6);
            C1818y c1818y = v.t0.a;
            Q.B p6 = R1.p(c8, c0626q);
            final long j8 = c6;
            R1.c(c1818y, null, p6, null, AbstractC0874g.c(1461164271, new l4.f() { // from class: S2.k0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v18 */
                /* JADX WARN: Type inference failed for: r2v19, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r2v58 */
                @Override // l4.f
                public final Object d(Object obj2, Object obj3, Object obj4) {
                    Integer valueOf;
                    float f8;
                    final boolean z8;
                    final List list4;
                    C0146e c0146e;
                    C0146e c0146e2;
                    C0144d c0144d;
                    C0146e c0146e3;
                    C1789c c1789c;
                    C0146e c0146e4;
                    C1810p c1810p;
                    ?? r22;
                    C1038o c1038o;
                    float f9;
                    C0148f c0148f;
                    C0626q c0626q2;
                    boolean z9;
                    C1810p c1810p2;
                    int i9;
                    boolean z10;
                    boolean z11;
                    C0626q c0626q3 = (C0626q) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    AbstractC1276k.f((C1814u) obj2, "$this$Card");
                    if (c0626q3.S(intValue & 1, (intValue & 17) != 16)) {
                        final List list5 = list;
                        boolean f10 = c0626q3.f(list5);
                        List list6 = list2;
                        boolean f11 = f10 | c0626q3.f(list6);
                        final boolean z12 = z7;
                        boolean g3 = f11 | c0626q3.g(z12);
                        Object P7 = c0626q3.P();
                        C0602e c0602e = C0616l.a;
                        Object obj5 = P7;
                        if (g3 || P7 == c0602e) {
                            ArrayList arrayList = new ArrayList(Y3.n.Z(list5, 10));
                            int i10 = 0;
                            for (Object obj6 : list5) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    Y4.l.U();
                                    throw null;
                                }
                                int D4 = AbstractC0565e.D((String) obj6);
                                Iterator it = list6.iterator();
                                if (it.hasNext()) {
                                    String str = (String) Y3.m.r0((List) it.next(), i10);
                                    if (str == null) {
                                        str = FlexmarkHtmlConverter.DEFAULT_NODE;
                                    }
                                    valueOf = Integer.valueOf(AbstractC0565e.D(str));
                                    while (it.hasNext()) {
                                        String str2 = (String) Y3.m.r0((List) it.next(), i10);
                                        if (str2 == null) {
                                            str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                        }
                                        Integer valueOf2 = Integer.valueOf(AbstractC0565e.D(str2));
                                        if (valueOf.compareTo(valueOf2) < 0) {
                                            valueOf = valueOf2;
                                        }
                                    }
                                } else {
                                    valueOf = null;
                                }
                                int max = Math.max(D4, valueOf != null ? valueOf.intValue() : 0);
                                float f12 = z12 ? K0.f7721c : K0.a;
                                float f13 = z12 ? K0.f7722d : K0.f7720b;
                                float f14 = f12 + (max * 7);
                                if (f14 <= f13) {
                                    f13 = f14;
                                }
                                arrayList.add(new e1.f(f13));
                                i10 = i11;
                            }
                            c0626q3.m0(arrayList);
                            obj5 = arrayList;
                        }
                        final List list7 = (List) obj5;
                        float f15 = 0;
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            f15 += ((e1.f) it2.next()).f11571c;
                        }
                        float f16 = f6;
                        boolean z13 = e1.f.b(f15, f16) > 0;
                        P0 q3 = AbstractC1464z.q(c0626q3);
                        Object P8 = c0626q3.P();
                        if (P8 == c0602e) {
                            P8 = T.r.s(new C0580l0(q3, 0));
                            c0626q3.m0(P8);
                        }
                        d1 d1Var = (d1) P8;
                        Object P9 = c0626q3.P();
                        if (P9 == c0602e) {
                            P9 = T.r.s(new C0580l0(q3, 1));
                            c0626q3.m0(P9);
                        }
                        d1 d1Var2 = (d1) P9;
                        F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
                        int hashCode = Long.hashCode(c0626q3.f8164T);
                        InterfaceC0617l0 l3 = c0626q3.l();
                        C1038o c1038o2 = C1038o.a;
                        InterfaceC1041r c10 = AbstractC1024a.c(c0626q3, c1038o2);
                        InterfaceC0152h.a.getClass();
                        C0148f c0148f2 = C0150g.f1924b;
                        c0626q3.f0();
                        if (c0626q3.f8163S) {
                            c0626q3.k(c0148f2);
                        } else {
                            c0626q3.p0();
                        }
                        C0146e c0146e5 = C0150g.f1928f;
                        T.r.G(c0626q3, d6, c0146e5);
                        C0146e c0146e6 = C0150g.f1927e;
                        T.r.G(c0626q3, l3, c0146e6);
                        Integer valueOf3 = Integer.valueOf(hashCode);
                        C0146e c0146e7 = C0150g.f1929g;
                        T.r.x(c0626q3, valueOf3, c0146e7);
                        C0144d c0144d2 = C0150g.f1930h;
                        T.r.C(c0626q3, c0144d2);
                        C0146e c0146e8 = C0150g.f1926d;
                        T.r.G(c0626q3, c10, c0146e8);
                        C1810p c1810p3 = C1810p.f15333b;
                        InterfaceC1041r r5 = AbstractC1464z.r(c1038o2, q3, false);
                        C1789c c1789c2 = AbstractC1799h.f15305c;
                        C1031h c1031h = C1026c.f11798p;
                        float f17 = f15;
                        C1813t a6 = AbstractC1812s.a(c1789c2, c1031h, c0626q3, 0);
                        int hashCode2 = Long.hashCode(c0626q3.f8164T);
                        InterfaceC0617l0 l5 = c0626q3.l();
                        InterfaceC1041r c11 = AbstractC1024a.c(c0626q3, r5);
                        c0626q3.f0();
                        if (c0626q3.f8163S) {
                            c0626q3.k(c0148f2);
                        } else {
                            c0626q3.p0();
                        }
                        T.r.G(c0626q3, a6, c0146e5);
                        T.r.G(c0626q3, l5, c0146e6);
                        AbstractC1135a.n(hashCode2, c0626q3, c0146e7, c0626q3, c0144d2);
                        T.r.G(c0626q3, c11, c0146e8);
                        boolean isEmpty = list5.isEmpty();
                        float f18 = f7;
                        List list8 = list3;
                        final long j9 = j4;
                        final long j10 = c7;
                        final long j11 = j6;
                        boolean z14 = z5;
                        if (isEmpty) {
                            f8 = f16;
                            z8 = z14;
                            list4 = list8;
                            c0146e = c0146e8;
                            c0146e2 = c0146e6;
                            c0144d = c0144d2;
                            c0146e3 = c0146e7;
                            c1789c = c1789c2;
                            c0146e4 = c0146e5;
                            c1810p = c1810p3;
                            r22 = 0;
                            c1038o = c1038o2;
                            f9 = f18;
                            C0626q c0626q4 = c0626q3;
                            c0148f = c0148f2;
                            c0626q4.b0(136044815);
                            c0626q2 = c0626q4;
                        } else {
                            c0626q3.b0(141421021);
                            final int i12 = 0;
                            z8 = z14;
                            list4 = list8;
                            C0626q c0626q5 = c0626q3;
                            c0146e2 = c0146e6;
                            c0146e4 = c0146e5;
                            c0146e3 = c0146e7;
                            c0146e = c0146e8;
                            c1789c = c1789c2;
                            c1810p = c1810p3;
                            c1038o = c1038o2;
                            c0144d = c0144d2;
                            f9 = f18;
                            c0148f = c0148f2;
                            f8 = f16;
                            X2.a(v.t0.n(c1038o2, z13 ? f17 : f16), null, c9, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(-1720108803, new l4.e() { // from class: S2.m0
                                @Override // l4.e
                                public final Object m(Object obj7, Object obj8) {
                                    Object fVar;
                                    S0.P a7;
                                    Object fVar2;
                                    S0.P a8;
                                    int i13 = i12;
                                    X3.y yVar = X3.y.a;
                                    Object obj9 = C0616l.a;
                                    int i14 = 4;
                                    int i15 = 120;
                                    C1038o c1038o3 = C1038o.a;
                                    List list9 = list4;
                                    List list10 = list7;
                                    List list11 = list5;
                                    boolean z15 = z12;
                                    switch (i13) {
                                        case 0:
                                            C0626q c0626q6 = (C0626q) obj7;
                                            int intValue2 = ((Integer) obj8).intValue();
                                            if (c0626q6.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                InterfaceC1041r z16 = AbstractC1787b.z(v.t0.a, z15 ? 8 : 12, z15 ? 12 : 16);
                                                v.p0 a9 = v.o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q6, 0);
                                                int hashCode3 = Long.hashCode(c0626q6.f8164T);
                                                InterfaceC0617l0 l6 = c0626q6.l();
                                                InterfaceC1041r c12 = AbstractC1024a.c(c0626q6, z16);
                                                InterfaceC0152h.a.getClass();
                                                InterfaceC1193a interfaceC1193a = C0150g.f1924b;
                                                c0626q6.f0();
                                                if (c0626q6.f8163S) {
                                                    c0626q6.k(interfaceC1193a);
                                                } else {
                                                    c0626q6.p0();
                                                }
                                                T.r.G(c0626q6, a9, C0150g.f1928f);
                                                T.r.G(c0626q6, l6, C0150g.f1927e);
                                                T.r.x(c0626q6, Integer.valueOf(hashCode3), C0150g.f1929g);
                                                T.r.C(c0626q6, C0150g.f1930h);
                                                T.r.G(c0626q6, c12, C0150g.f1926d);
                                                c0626q6.b0(1414789658);
                                                Iterator it3 = list11.iterator();
                                                int i16 = 0;
                                                while (it3.hasNext()) {
                                                    Object next = it3.next();
                                                    int i17 = i16 + 1;
                                                    if (i16 < 0) {
                                                        Y4.l.U();
                                                        throw null;
                                                    }
                                                    String str3 = (String) next;
                                                    if (i16 < 0 || i16 >= list10.size()) {
                                                        fVar = new e1.f(z15 ? K0.f7721c : 120);
                                                    } else {
                                                        fVar = list10.get(i16);
                                                    }
                                                    InterfaceC1041r A5 = AbstractC1787b.A(z15 ? 4 : 8, S.l.f7374V, 2, v.t0.n(c1038o3, ((e1.f) fVar).f11571c));
                                                    F0.V d7 = AbstractC1806l.d(AbstractC0565e.x((J0) Y3.m.r0(list9, i16)), false);
                                                    int hashCode4 = Long.hashCode(c0626q6.f8164T);
                                                    InterfaceC0617l0 l7 = c0626q6.l();
                                                    InterfaceC1041r c13 = AbstractC1024a.c(c0626q6, A5);
                                                    InterfaceC0152h.a.getClass();
                                                    InterfaceC1193a interfaceC1193a2 = C0150g.f1924b;
                                                    c0626q6.f0();
                                                    if (c0626q6.f8163S) {
                                                        c0626q6.k(interfaceC1193a2);
                                                    } else {
                                                        c0626q6.p0();
                                                    }
                                                    T.r.G(c0626q6, d7, C0150g.f1928f);
                                                    T.r.G(c0626q6, l7, C0150g.f1927e);
                                                    T.r.x(c0626q6, Integer.valueOf(hashCode4), C0150g.f1929g);
                                                    T.r.C(c0626q6, C0150g.f1930h);
                                                    T.r.G(c0626q6, c13, C0150g.f1926d);
                                                    boolean f19 = c0626q6.f(str3);
                                                    long j12 = j9;
                                                    boolean e6 = f19 | c0626q6.e(j12);
                                                    long j13 = j10;
                                                    boolean e7 = e6 | c0626q6.e(j13);
                                                    Iterator it4 = it3;
                                                    long j14 = j11;
                                                    boolean e8 = e7 | c0626q6.e(j14);
                                                    Object P10 = c0626q6.P();
                                                    if (e8 || P10 == obj9) {
                                                        LinkedHashMap linkedHashMap = AbstractC0570g0.a;
                                                        P10 = AbstractC0570g0.a(AbstractC0565e.y(AbstractC1776n.l0(str3).toString()), j12, j13, j14);
                                                        c0626q6.m0(P10);
                                                    }
                                                    C0545g c0545g = (C0545g) P10;
                                                    if (z15) {
                                                        c0626q6.b0(379586237);
                                                        a7 = S0.P.a(((t3) c0626q6.j(u3.a)).f6133n, ((Q.N) c0626q6.j(Q.O.a)).a, 0L, W0.k.f8837k, null, null, 0L, null, 0L, null, 16777210);
                                                        c0626q6.p(false);
                                                    } else {
                                                        c0626q6.b0(379933406);
                                                        a7 = S0.P.a(((t3) c0626q6.j(u3.a)).f6128i, ((Q.N) c0626q6.j(Q.O.a)).a, 0L, W0.k.f8837k, null, null, 0L, null, 0L, null, 16777210);
                                                        c0626q6.p(false);
                                                    }
                                                    AbstractC0565e.t(c0545g, a7, null, z8, false, 0, 0, false, c0626q6, 0, 244);
                                                    c0626q6.p(true);
                                                    it3 = it4;
                                                    i16 = i17;
                                                }
                                                c0626q6.p(false);
                                                c0626q6.p(true);
                                            } else {
                                                c0626q6.V();
                                            }
                                            return yVar;
                                        default:
                                            C0626q c0626q7 = (C0626q) obj7;
                                            int intValue3 = ((Integer) obj8).intValue();
                                            if (!c0626q7.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                c0626q7.V();
                                                return yVar;
                                            }
                                            InterfaceC1041r z17 = AbstractC1787b.z(v.t0.a, z15 ? 8 : 12, z15 ? 10 : 14);
                                            v.p0 a10 = v.o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q7, 0);
                                            int hashCode5 = Long.hashCode(c0626q7.f8164T);
                                            InterfaceC0617l0 l8 = c0626q7.l();
                                            InterfaceC1041r c14 = AbstractC1024a.c(c0626q7, z17);
                                            InterfaceC0152h.a.getClass();
                                            C0148f c0148f3 = C0150g.f1924b;
                                            c0626q7.f0();
                                            if (c0626q7.f8163S) {
                                                c0626q7.k(c0148f3);
                                            } else {
                                                c0626q7.p0();
                                            }
                                            T.r.G(c0626q7, a10, C0150g.f1928f);
                                            T.r.G(c0626q7, l8, C0150g.f1927e);
                                            T.r.x(c0626q7, Integer.valueOf(hashCode5), C0150g.f1929g);
                                            T.r.C(c0626q7, C0150g.f1930h);
                                            T.r.G(c0626q7, c14, C0150g.f1926d);
                                            c0626q7.b0(415450714);
                                            Iterator it5 = list11.iterator();
                                            int i18 = 0;
                                            while (it5.hasNext()) {
                                                Object next2 = it5.next();
                                                int i19 = i18 + 1;
                                                if (i18 < 0) {
                                                    Y4.l.U();
                                                    throw null;
                                                }
                                                String str4 = (String) next2;
                                                if (i18 < 0 || i18 >= list10.size()) {
                                                    fVar2 = new e1.f(z15 ? K0.f7721c : i15);
                                                } else {
                                                    fVar2 = list10.get(i18);
                                                }
                                                InterfaceC1041r A6 = AbstractC1787b.A(z15 ? i14 : 8, S.l.f7374V, 2, v.t0.n(c1038o3, ((e1.f) fVar2).f11571c));
                                                F0.V d8 = AbstractC1806l.d(AbstractC0565e.x((J0) Y3.m.r0(list9, i18)), false);
                                                int hashCode6 = Long.hashCode(c0626q7.f8164T);
                                                InterfaceC0617l0 l9 = c0626q7.l();
                                                InterfaceC1041r c15 = AbstractC1024a.c(c0626q7, A6);
                                                InterfaceC0152h.a.getClass();
                                                C0148f c0148f4 = C0150g.f1924b;
                                                c0626q7.f0();
                                                if (c0626q7.f8163S) {
                                                    c0626q7.k(c0148f4);
                                                } else {
                                                    c0626q7.p0();
                                                }
                                                T.r.G(c0626q7, d8, C0150g.f1928f);
                                                T.r.G(c0626q7, l9, C0150g.f1927e);
                                                T.r.x(c0626q7, Integer.valueOf(hashCode6), C0150g.f1929g);
                                                T.r.C(c0626q7, C0150g.f1930h);
                                                T.r.G(c0626q7, c15, C0150g.f1926d);
                                                boolean f20 = c0626q7.f(str4);
                                                long j15 = j9;
                                                boolean e9 = f20 | c0626q7.e(j15);
                                                long j16 = j10;
                                                boolean e10 = e9 | c0626q7.e(j16);
                                                X3.y yVar2 = yVar;
                                                Iterator it6 = it5;
                                                long j17 = j11;
                                                boolean e11 = e10 | c0626q7.e(j17);
                                                Object P11 = c0626q7.P();
                                                if (e11 || P11 == obj9) {
                                                    LinkedHashMap linkedHashMap2 = AbstractC0570g0.a;
                                                    P11 = AbstractC0570g0.a(AbstractC0565e.y(AbstractC1776n.l0(str4).toString()), j15, j16, j17);
                                                    c0626q7.m0(P11);
                                                }
                                                C0545g c0545g2 = (C0545g) P11;
                                                if (z15) {
                                                    c0626q7.b0(-1040810225);
                                                    a8 = S0.P.a(((t3) c0626q7.j(u3.a)).f6131l, ((Q.N) c0626q7.j(Q.O.a)).f5427q, 0L, null, null, null, 0L, null, 0L, null, 16777214);
                                                    c0626q7.p(false);
                                                } else {
                                                    c0626q7.b0(-1040524498);
                                                    a8 = S0.P.a(((t3) c0626q7.j(u3.a)).f6130k, ((Q.N) c0626q7.j(Q.O.a)).f5427q, 0L, null, null, null, 0L, null, 0L, null, 16777214);
                                                    c0626q7.p(false);
                                                }
                                                AbstractC0565e.t(c0545g2, a8, null, z8, false, 0, 0, false, c0626q7, 0, 244);
                                                c0626q7.p(true);
                                                it5 = it6;
                                                yVar = yVar2;
                                                i18 = i19;
                                                i14 = 4;
                                                i15 = 120;
                                            }
                                            X3.y yVar3 = yVar;
                                            c0626q7.p(false);
                                            c0626q7.p(true);
                                            return yVar3;
                                    }
                                }
                            }, c0626q3), c0626q5, 12582912, 122);
                            R1.f(null, 1, o0.s.c(0.2f * f9, ((Q.N) c0626q5.j(Q.O.a)).f5378A), c0626q5, 48, 1);
                            r22 = 0;
                            c0626q2 = c0626q5;
                        }
                        c0626q2.p(r22);
                        C1813t a7 = AbstractC1812s.a(c1789c, c1031h, c0626q2, r22);
                        int hashCode3 = Long.hashCode(c0626q2.f8164T);
                        InterfaceC0617l0 l6 = c0626q2.l();
                        InterfaceC1041r c12 = AbstractC1024a.c(c0626q2, c1038o);
                        c0626q2.f0();
                        if (c0626q2.f8163S) {
                            c0626q2.k(c0148f);
                        } else {
                            c0626q2.p0();
                        }
                        T.r.G(c0626q2, a7, c0146e4);
                        T.r.G(c0626q2, l6, c0146e2);
                        AbstractC1135a.n(hashCode3, c0626q2, c0146e3, c0626q2, c0144d);
                        T.r.G(c0626q2, c12, c0146e);
                        c0626q2.b0(665950156);
                        Iterator it3 = list6.iterator();
                        int i13 = 0;
                        while (true) {
                            boolean hasNext = it3.hasNext();
                            long j12 = j7;
                            if (hasNext) {
                                Object next = it3.next();
                                int i14 = i13 + 1;
                                if (i13 < 0) {
                                    Y4.l.U();
                                    throw null;
                                }
                                final List list9 = (List) next;
                                if (i13 % 2 != 0) {
                                    j12 = j8;
                                }
                                final int i15 = 1;
                                X2.a(v.t0.n(c1038o, z13 ? f17 : f8), null, o0.s.c(o0.s.e(j12) * f9, j12), 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(-649873239, new l4.e() { // from class: S2.m0
                                    @Override // l4.e
                                    public final Object m(Object obj7, Object obj8) {
                                        Object fVar;
                                        S0.P a72;
                                        Object fVar2;
                                        S0.P a8;
                                        int i132 = i15;
                                        X3.y yVar = X3.y.a;
                                        Object obj9 = C0616l.a;
                                        int i142 = 4;
                                        int i152 = 120;
                                        C1038o c1038o3 = C1038o.a;
                                        List list92 = list4;
                                        List list10 = list7;
                                        List list11 = list9;
                                        boolean z15 = z12;
                                        switch (i132) {
                                            case 0:
                                                C0626q c0626q6 = (C0626q) obj7;
                                                int intValue2 = ((Integer) obj8).intValue();
                                                if (c0626q6.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                    InterfaceC1041r z16 = AbstractC1787b.z(v.t0.a, z15 ? 8 : 12, z15 ? 12 : 16);
                                                    v.p0 a9 = v.o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q6, 0);
                                                    int hashCode32 = Long.hashCode(c0626q6.f8164T);
                                                    InterfaceC0617l0 l62 = c0626q6.l();
                                                    InterfaceC1041r c122 = AbstractC1024a.c(c0626q6, z16);
                                                    InterfaceC0152h.a.getClass();
                                                    InterfaceC1193a interfaceC1193a = C0150g.f1924b;
                                                    c0626q6.f0();
                                                    if (c0626q6.f8163S) {
                                                        c0626q6.k(interfaceC1193a);
                                                    } else {
                                                        c0626q6.p0();
                                                    }
                                                    T.r.G(c0626q6, a9, C0150g.f1928f);
                                                    T.r.G(c0626q6, l62, C0150g.f1927e);
                                                    T.r.x(c0626q6, Integer.valueOf(hashCode32), C0150g.f1929g);
                                                    T.r.C(c0626q6, C0150g.f1930h);
                                                    T.r.G(c0626q6, c122, C0150g.f1926d);
                                                    c0626q6.b0(1414789658);
                                                    Iterator it32 = list11.iterator();
                                                    int i16 = 0;
                                                    while (it32.hasNext()) {
                                                        Object next2 = it32.next();
                                                        int i17 = i16 + 1;
                                                        if (i16 < 0) {
                                                            Y4.l.U();
                                                            throw null;
                                                        }
                                                        String str3 = (String) next2;
                                                        if (i16 < 0 || i16 >= list10.size()) {
                                                            fVar = new e1.f(z15 ? K0.f7721c : 120);
                                                        } else {
                                                            fVar = list10.get(i16);
                                                        }
                                                        InterfaceC1041r A5 = AbstractC1787b.A(z15 ? 4 : 8, S.l.f7374V, 2, v.t0.n(c1038o3, ((e1.f) fVar).f11571c));
                                                        F0.V d7 = AbstractC1806l.d(AbstractC0565e.x((J0) Y3.m.r0(list92, i16)), false);
                                                        int hashCode4 = Long.hashCode(c0626q6.f8164T);
                                                        InterfaceC0617l0 l7 = c0626q6.l();
                                                        InterfaceC1041r c13 = AbstractC1024a.c(c0626q6, A5);
                                                        InterfaceC0152h.a.getClass();
                                                        InterfaceC1193a interfaceC1193a2 = C0150g.f1924b;
                                                        c0626q6.f0();
                                                        if (c0626q6.f8163S) {
                                                            c0626q6.k(interfaceC1193a2);
                                                        } else {
                                                            c0626q6.p0();
                                                        }
                                                        T.r.G(c0626q6, d7, C0150g.f1928f);
                                                        T.r.G(c0626q6, l7, C0150g.f1927e);
                                                        T.r.x(c0626q6, Integer.valueOf(hashCode4), C0150g.f1929g);
                                                        T.r.C(c0626q6, C0150g.f1930h);
                                                        T.r.G(c0626q6, c13, C0150g.f1926d);
                                                        boolean f19 = c0626q6.f(str3);
                                                        long j122 = j9;
                                                        boolean e6 = f19 | c0626q6.e(j122);
                                                        long j13 = j10;
                                                        boolean e7 = e6 | c0626q6.e(j13);
                                                        Iterator it4 = it32;
                                                        long j14 = j11;
                                                        boolean e8 = e7 | c0626q6.e(j14);
                                                        Object P10 = c0626q6.P();
                                                        if (e8 || P10 == obj9) {
                                                            LinkedHashMap linkedHashMap = AbstractC0570g0.a;
                                                            P10 = AbstractC0570g0.a(AbstractC0565e.y(AbstractC1776n.l0(str3).toString()), j122, j13, j14);
                                                            c0626q6.m0(P10);
                                                        }
                                                        C0545g c0545g = (C0545g) P10;
                                                        if (z15) {
                                                            c0626q6.b0(379586237);
                                                            a72 = S0.P.a(((t3) c0626q6.j(u3.a)).f6133n, ((Q.N) c0626q6.j(Q.O.a)).a, 0L, W0.k.f8837k, null, null, 0L, null, 0L, null, 16777210);
                                                            c0626q6.p(false);
                                                        } else {
                                                            c0626q6.b0(379933406);
                                                            a72 = S0.P.a(((t3) c0626q6.j(u3.a)).f6128i, ((Q.N) c0626q6.j(Q.O.a)).a, 0L, W0.k.f8837k, null, null, 0L, null, 0L, null, 16777210);
                                                            c0626q6.p(false);
                                                        }
                                                        AbstractC0565e.t(c0545g, a72, null, z8, false, 0, 0, false, c0626q6, 0, 244);
                                                        c0626q6.p(true);
                                                        it32 = it4;
                                                        i16 = i17;
                                                    }
                                                    c0626q6.p(false);
                                                    c0626q6.p(true);
                                                } else {
                                                    c0626q6.V();
                                                }
                                                return yVar;
                                            default:
                                                C0626q c0626q7 = (C0626q) obj7;
                                                int intValue3 = ((Integer) obj8).intValue();
                                                if (!c0626q7.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    c0626q7.V();
                                                    return yVar;
                                                }
                                                InterfaceC1041r z17 = AbstractC1787b.z(v.t0.a, z15 ? 8 : 12, z15 ? 10 : 14);
                                                v.p0 a10 = v.o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q7, 0);
                                                int hashCode5 = Long.hashCode(c0626q7.f8164T);
                                                InterfaceC0617l0 l8 = c0626q7.l();
                                                InterfaceC1041r c14 = AbstractC1024a.c(c0626q7, z17);
                                                InterfaceC0152h.a.getClass();
                                                C0148f c0148f3 = C0150g.f1924b;
                                                c0626q7.f0();
                                                if (c0626q7.f8163S) {
                                                    c0626q7.k(c0148f3);
                                                } else {
                                                    c0626q7.p0();
                                                }
                                                T.r.G(c0626q7, a10, C0150g.f1928f);
                                                T.r.G(c0626q7, l8, C0150g.f1927e);
                                                T.r.x(c0626q7, Integer.valueOf(hashCode5), C0150g.f1929g);
                                                T.r.C(c0626q7, C0150g.f1930h);
                                                T.r.G(c0626q7, c14, C0150g.f1926d);
                                                c0626q7.b0(415450714);
                                                Iterator it5 = list11.iterator();
                                                int i18 = 0;
                                                while (it5.hasNext()) {
                                                    Object next22 = it5.next();
                                                    int i19 = i18 + 1;
                                                    if (i18 < 0) {
                                                        Y4.l.U();
                                                        throw null;
                                                    }
                                                    String str4 = (String) next22;
                                                    if (i18 < 0 || i18 >= list10.size()) {
                                                        fVar2 = new e1.f(z15 ? K0.f7721c : i152);
                                                    } else {
                                                        fVar2 = list10.get(i18);
                                                    }
                                                    InterfaceC1041r A6 = AbstractC1787b.A(z15 ? i142 : 8, S.l.f7374V, 2, v.t0.n(c1038o3, ((e1.f) fVar2).f11571c));
                                                    F0.V d8 = AbstractC1806l.d(AbstractC0565e.x((J0) Y3.m.r0(list92, i18)), false);
                                                    int hashCode6 = Long.hashCode(c0626q7.f8164T);
                                                    InterfaceC0617l0 l9 = c0626q7.l();
                                                    InterfaceC1041r c15 = AbstractC1024a.c(c0626q7, A6);
                                                    InterfaceC0152h.a.getClass();
                                                    C0148f c0148f4 = C0150g.f1924b;
                                                    c0626q7.f0();
                                                    if (c0626q7.f8163S) {
                                                        c0626q7.k(c0148f4);
                                                    } else {
                                                        c0626q7.p0();
                                                    }
                                                    T.r.G(c0626q7, d8, C0150g.f1928f);
                                                    T.r.G(c0626q7, l9, C0150g.f1927e);
                                                    T.r.x(c0626q7, Integer.valueOf(hashCode6), C0150g.f1929g);
                                                    T.r.C(c0626q7, C0150g.f1930h);
                                                    T.r.G(c0626q7, c15, C0150g.f1926d);
                                                    boolean f20 = c0626q7.f(str4);
                                                    long j15 = j9;
                                                    boolean e9 = f20 | c0626q7.e(j15);
                                                    long j16 = j10;
                                                    boolean e10 = e9 | c0626q7.e(j16);
                                                    X3.y yVar2 = yVar;
                                                    Iterator it6 = it5;
                                                    long j17 = j11;
                                                    boolean e11 = e10 | c0626q7.e(j17);
                                                    Object P11 = c0626q7.P();
                                                    if (e11 || P11 == obj9) {
                                                        LinkedHashMap linkedHashMap2 = AbstractC0570g0.a;
                                                        P11 = AbstractC0570g0.a(AbstractC0565e.y(AbstractC1776n.l0(str4).toString()), j15, j16, j17);
                                                        c0626q7.m0(P11);
                                                    }
                                                    C0545g c0545g2 = (C0545g) P11;
                                                    if (z15) {
                                                        c0626q7.b0(-1040810225);
                                                        a8 = S0.P.a(((t3) c0626q7.j(u3.a)).f6131l, ((Q.N) c0626q7.j(Q.O.a)).f5427q, 0L, null, null, null, 0L, null, 0L, null, 16777214);
                                                        c0626q7.p(false);
                                                    } else {
                                                        c0626q7.b0(-1040524498);
                                                        a8 = S0.P.a(((t3) c0626q7.j(u3.a)).f6130k, ((Q.N) c0626q7.j(Q.O.a)).f5427q, 0L, null, null, null, 0L, null, 0L, null, 16777214);
                                                        c0626q7.p(false);
                                                    }
                                                    AbstractC0565e.t(c0545g2, a8, null, z8, false, 0, 0, false, c0626q7, 0, 244);
                                                    c0626q7.p(true);
                                                    it5 = it6;
                                                    yVar = yVar2;
                                                    i18 = i19;
                                                    i142 = 4;
                                                    i152 = 120;
                                                }
                                                X3.y yVar3 = yVar;
                                                c0626q7.p(false);
                                                c0626q7.p(true);
                                                return yVar3;
                                        }
                                    }
                                }, c0626q2), c0626q2, 12582912, 122);
                                if (i13 != list6.size() - 1) {
                                    c0626q2.b0(-763049837);
                                    R1.f(null, (float) 0.5d, o0.s.c(0.1f * f9, ((Q.N) c0626q2.j(Q.O.a)).f5378A), c0626q2, 48, 1);
                                    z11 = false;
                                } else {
                                    z11 = false;
                                    c0626q2.b0(-774669474);
                                }
                                c0626q2.p(z11);
                                i13 = i14;
                            } else {
                                c0626q2.p(false);
                                c0626q2.p(true);
                                c0626q2.p(true);
                                if (z13) {
                                    c0626q2.b0(1661537921);
                                    if (((Boolean) d1Var.getValue()).booleanValue()) {
                                        c0626q2.b0(1661575555);
                                        c1810p2 = c1810p;
                                        i9 = 16;
                                        z10 = false;
                                        AbstractC1806l.a(AbstractC1464z.e(v.t0.n(c1810p2.e(c1038o, C1026c.f11789g), 16).c(v.t0.f15348b), androidx.lifecycle.N.u(Y4.l.I(new o0.s(o0.s.c(f9 * 0.5f, j12)), new o0.s(o0.s.f13480g)))), c0626q2, 0);
                                    } else {
                                        c1810p2 = c1810p;
                                        i9 = 16;
                                        z10 = false;
                                        c0626q2.b0(1649504217);
                                    }
                                    c0626q2.p(z10);
                                    if (((Boolean) d1Var2.getValue()).booleanValue()) {
                                        c0626q2.b0(1662358181);
                                        z9 = false;
                                        AbstractC1806l.a(AbstractC1464z.e(v.t0.n(c1810p2.e(c1038o, C1026c.f11791i), i9).c(v.t0.f15348b), androidx.lifecycle.N.u(Y4.l.I(new o0.s(o0.s.f13480g), new o0.s(o0.s.c(0.5f * f9, j12))))), c0626q2, 0);
                                    } else {
                                        z9 = false;
                                        c0626q2.b0(1649504217);
                                    }
                                    c0626q2.p(z9);
                                } else {
                                    z9 = false;
                                    c0626q2.b0(1649504217);
                                }
                                c0626q2.p(z9);
                                c0626q2.p(true);
                            }
                        }
                    } else {
                        c0626q3.V();
                    }
                    return X3.y.a;
                }
            }, c0626q), c0626q, 196614, 26);
        }
        t5 = c0626q.t();
        if (t5 != null) {
            final int i9 = 1;
            eVar = new l4.e(list, list2, list3, p5, z5, i6, i9) { // from class: S2.j0

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f7802c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f7803e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ List f7804f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ List f7805g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ S0.P f7806h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ boolean f7807i;

                {
                    this.f7802c = i9;
                }

                @Override // l4.e
                public final Object m(Object obj2, Object obj22) {
                    switch (this.f7802c) {
                        case 0:
                            ((Integer) obj22).getClass();
                            int J4 = T.r.J(1);
                            AbstractC0565e.v(this.f7803e, this.f7804f, this.f7805g, this.f7806h, this.f7807i, (C0626q) obj2, J4);
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            int J5 = T.r.J(1);
                            AbstractC0565e.v(this.f7803e, this.f7804f, this.f7805g, this.f7806h, this.f7807i, (C0626q) obj2, J5);
                            break;
                    }
                    return X3.y.a;
                }
            };
            t5.f8193d = eVar;
        }
    }

    public static final void w(List list, S0.P p5, boolean z5, C0626q c0626q, int i6) {
        long j3;
        String str;
        long j4;
        float f6;
        String str2;
        Iterator it;
        int i7;
        boolean z6;
        long j5;
        C0626q c0626q2 = c0626q;
        c0626q2.d0(442678809);
        int i8 = 4;
        int i9 = 2;
        int i10 = i6 | (c0626q2.h(list) ? 4 : 2) | (c0626q2.f(p5) ? 32 : 16) | (c0626q2.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        boolean z7 = false;
        if (c0626q2.S(i10 & 1, (i10 & 147) != 146)) {
            e1 e1Var = Q.O.a;
            long j6 = ((Q.N) c0626q2.j(e1Var)).a;
            long c6 = o0.s.c(0.6f, ((Q.N) c0626q2.j(e1Var)).f5422l);
            long j7 = p5.a.f7571b;
            e1.o oVar = new e1.o(j7);
            if (e1.o.a(j7, e1.o.f11580c)) {
                oVar = null;
            }
            if (oVar == null) {
                c0626q2.b0(212588385);
                j3 = ((t3) c0626q2.j(u3.a)).f6130k.a.f7571b;
                c0626q2.p(false);
            } else {
                c0626q2.b0(212584510);
                c0626q2.p(false);
                j3 = oVar.a;
            }
            long j8 = j3;
            C1818y c1818y = v.t0.a;
            float f7 = 8;
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.g(f7), C1026c.f11798p, c0626q2, 6);
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, c1818y);
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
            T.r.G(c0626q2, c7, C0150g.f1926d);
            c0626q2.b0(866538728);
            Iterator it2 = list.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    Y4.l.U();
                    throw null;
                }
                C0583o c0583o = (C0583o) next;
                L0 C5 = C(c0583o.a);
                if (C5 == null || (str = C5.f7723b) == null) {
                    str = c0583o.a;
                }
                String str3 = str;
                float f8 = i9;
                InterfaceC1041r B5 = AbstractC1787b.B(v.t0.a, (c0583o.f7834b * 16) + 8, f8, i8, f8);
                v.p0 a7 = v.o0.a(AbstractC1799h.a, C1026c.f11795m, c0626q2, 48);
                int hashCode2 = Long.hashCode(c0626q2.f8164T);
                InterfaceC0617l0 l5 = c0626q2.l();
                InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, B5);
                InterfaceC0152h.a.getClass();
                C0148f c0148f2 = C0150g.f1924b;
                c0626q2.f0();
                if (c0626q2.f8163S) {
                    c0626q2.k(c0148f2);
                } else {
                    c0626q2.p0();
                }
                T.r.G(c0626q2, a7, C0150g.f1928f);
                T.r.G(c0626q2, l5, C0150g.f1927e);
                T.r.x(c0626q2, Integer.valueOf(hashCode2), C0150g.f1929g);
                T.r.C(c0626q2, C0150g.f1930h);
                T.r.G(c0626q2, c8, C0150g.f1926d);
                C1038o c1038o = C1038o.a;
                if (C5 != null) {
                    c0626q2.b0(-320153035);
                    f6 = f7;
                    j4 = j6;
                    Q.M.a(C5.a, AbstractC1787b.C(c1038o, S.l.f7374V, S.l.f7374V, f6, S.l.f7374V, 11), false, null, c0626q2, 3504);
                    c0626q2.p(false);
                    str2 = str3;
                    it = it2;
                    i7 = i12;
                    j5 = j8;
                    z6 = false;
                } else {
                    j4 = j6;
                    f6 = f7;
                    c0626q2.b0(-319870284);
                    str2 = str3;
                    it = it2;
                    i7 = i12;
                    z6 = false;
                    j5 = j8;
                    D0.d("• ", p5, AbstractC1787b.C(c1038o, S.l.f7374V, S.l.f7374V, f6, S.l.f7374V, 11), z5, 0, S.l.f7374V, 0, 0, false, c0626q, (i10 & 112) | 390 | ((i10 << 3) & 7168));
                    c0626q2 = c0626q;
                    c0626q2.p(false);
                }
                long j9 = c6;
                long j10 = j5;
                boolean f9 = c0626q2.f(str2) | c0626q2.e(j4) | c0626q2.e(j9) | c0626q2.e(j10);
                Object P5 = c0626q2.P();
                if (f9 || P5 == C0616l.a) {
                    LinkedHashMap linkedHashMap = AbstractC0570g0.a;
                    c6 = j9;
                    j8 = j10;
                    P5 = AbstractC0570g0.a(y(str2), j4, c6, j8);
                    c0626q2.m0(P5);
                } else {
                    c6 = j9;
                    j8 = j10;
                }
                C0545g c0545g = (C0545g) P5;
                if (1.0f <= 0.0d) {
                    AbstractC1829a.a("invalid weight; must be greater than zero");
                }
                t(c0545g, p5, new v.Z(1.0f, true), z5, false, 0, 0, false, c0626q, (i10 & 112) | ((i10 << 3) & 7168), 240);
                c0626q2 = c0626q;
                c0626q2.p(true);
                j6 = j4;
                z7 = z6;
                it2 = it;
                i11 = i7;
                f7 = f6;
                i8 = 4;
                i9 = 2;
            }
            c0626q2.p(z7);
            c0626q2.p(true);
        } else {
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new C0564d0(list, p5, z5, i6, 1);
        }
    }

    public static final C1033j x(J0 j02) {
        if (j02 == null) {
            j02 = J0.f7716c;
        }
        int ordinal = j02.ordinal();
        if (ordinal == 0) {
            return C1026c.f11786c;
        }
        if (ordinal == 1) {
            return C1026c.f11787e;
        }
        if (ordinal == 2) {
            return C1026c.f11788f;
        }
        throw new RuntimeException();
    }

    public static final String y(String str) {
        AbstractC1276k.f(str, "text");
        Pattern compile = Pattern.compile("(?i)<br\\s*/?>");
        AbstractC1276k.e(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll(SequenceUtils.EOL);
        AbstractC1276k.e(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public static List z(String str) {
        AbstractC1276k.f(str, "text");
        if (str.length() == 0) {
            return Y3.v.f9812c;
        }
        if (str.length() > 4000) {
            return Y4.l.H(new V(str));
        }
        try {
            return new T2.y0(str).e();
        } catch (Exception unused) {
            i5.a.a.getClass();
            androidx.lifecycle.N.p(new Object[0]);
            return Y4.l.H(new V(str));
        } catch (OutOfMemoryError unused2) {
            i5.a.a.getClass();
            androidx.lifecycle.N.p(new Object[0]);
            return Y4.l.H(new V(str));
        }
    }
}
