package S2;

import S0.C0542d;
import S0.C0545g;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.AbstractC1276k;
import m4.C1283r;
import m4.C1284s;
import m4.C1286u;
import u4.AbstractC1776n;
import u4.C1770h;
import u4.C1772j;

/* renamed from: S2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0570g0 {
    public static final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);

    public static C0545g a(String str, long j3, long j4, long j5) {
        AbstractC1276k.f(str, "text");
        C0542d c0542d = new C0542d();
        C0577k.b(c0542d, AbstractC0565e.z(str), 0L, j3, j4, j5, new Y(3), 10);
        return c0542d.i();
    }

    public static List b(List list, long j3, long j4, long j5, long j6) {
        AbstractC1276k.f(list, "elements");
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 < list.size()) {
            X x5 = (X) list.get(i6);
            if (!(x5 instanceof V) && !(x5 instanceof I) && !(x5 instanceof N) && !(x5 instanceof L) && !(x5 instanceof A) && !(x5 instanceof M) && !(x5 instanceof Q) && !(x5 instanceof S) && !(x5 instanceof T) && !(x5 instanceof D) && !(x5 instanceof G)) {
                arrayList.add(x5);
            } else if (c(x5)) {
                arrayList.add(x5);
            } else {
                ArrayList arrayList2 = new ArrayList();
                while (i6 < list.size()) {
                    X x6 = (X) list.get(i6);
                    if (c(x6) || (!(x6 instanceof V) && !(x6 instanceof I) && !(x6 instanceof N) && !(x6 instanceof L) && !(x6 instanceof A) && !(x6 instanceof M) && !(x6 instanceof Q) && !(x6 instanceof S) && !(x6 instanceof T) && !(x6 instanceof D) && !(x6 instanceof G))) {
                        break;
                    }
                    arrayList2.add(x6);
                    i6++;
                }
                if (arrayList2.size() == 1 && (arrayList2.get(0) instanceof V)) {
                    arrayList.add(arrayList2.get(0));
                } else {
                    if (!arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            X x7 = (X) obj;
                            if ((x7 instanceof L) || (x7 instanceof G)) {
                                arrayList.add(new K(arrayList2));
                                break;
                            }
                        }
                    }
                    C0542d c0542d = new C0542d();
                    C0577k.b(c0542d, arrayList2, j3, j4, j5, j6, new Y(2), 8);
                    arrayList.add(new J(c0542d.i()));
                }
            }
            i6++;
        }
        return arrayList;
    }

    public static final boolean c(X x5) {
        if (x5 instanceof V) {
            String str = ((V) x5).a;
            for (int i6 = 0; i6 < str.length(); i6++) {
                char charAt = str.charAt(i6);
                if (charAt == '\n' || charAt == '\r') {
                }
            }
            return true;
        }
        return false;
    }

    public static String d(String str) {
        String lowerCase = AbstractC1776n.l0(str).toString().toLowerCase(Locale.ROOT);
        AbstractC1276k.e(lowerCase, "toLowerCase(...)");
        Pattern compile = Pattern.compile("\\s+");
        AbstractC1276k.e(compile, "compile(...)");
        String replaceAll = compile.matcher(lowerCase).replaceAll(SequenceUtils.SPACE);
        AbstractC1276k.e(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [m4.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, m4.s] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, m4.u] */
    public static List e(String str) {
        String str2;
        int i6;
        List H3;
        C1283r c1283r;
        List list;
        Iterator it;
        int i7;
        C1284s c1284s;
        C1286u c1286u;
        int i8;
        C1284s c1284s2;
        int i9;
        int i10;
        char c6;
        int i11;
        int i12;
        int N5;
        int i13;
        int i14;
        int i15;
        String str3;
        List list2;
        X3.i iVar;
        String str4 = str;
        AbstractC1276k.f(str4, "markdown");
        if (str4.length() == 0) {
            return Y3.v.f9812c;
        }
        if (AbstractC1776n.Q(str4)) {
            return Y4.l.H(new V(str4));
        }
        try {
            str4 = AbstractC0558a0.m(str4);
        } catch (Exception unused) {
            i5.a.a.getClass();
            androidx.lifecycle.N.p(new Object[0]);
        } catch (OutOfMemoryError unused2) {
            i5.a.a.getClass();
            androidx.lifecycle.N.p(new Object[0]);
        }
        String str5 = SequenceUtils.EOL;
        char c7 = '\n';
        String replace = u4.u.B(str4, "\r\n", SequenceUtils.EOL, false).replace('\r', '\n');
        AbstractC1276k.e(replace, "replace(...)");
        C1770h c1770h = new C1770h(replace);
        while (c1770h.hasNext()) {
            if (((String) c1770h.next()).length() > 8000) {
                return Y4.l.H(new V(replace));
            }
        }
        if (AbstractC1776n.H(replace, '[')) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<String> c02 = AbstractC1776n.c0(replace, new String[]{SequenceUtils.EOL});
            StringBuilder sb = new StringBuilder(replace.length());
            Object obj = new Object();
            Object obj2 = new Object();
            obj2.f12969c = SequenceUtils.SPC;
            Object obj3 = new Object();
            int i16 = 0;
            for (String str6 : c02) {
                int i17 = i16 + 1;
                if (f(obj, obj2, obj3, str6)) {
                    sb.append(str6);
                    if (i16 < Y4.l.C(c02)) {
                        sb.append(c7);
                    }
                    str3 = str5;
                    list2 = c02;
                } else {
                    if (obj.f12968c) {
                        str3 = str5;
                        list2 = c02;
                    } else {
                        Pattern compile = Pattern.compile("^\\s*\\[([^\\]]+)]\\s*:\\s*(<[^>]+>|\\S+)(?:\\s+(\"[^\"]+\"|'[^']+'|\\([^)]*\\)))?\\s*$");
                        AbstractC1276k.e(compile, "compile(...)");
                        Matcher matcher = compile.matcher(str6);
                        AbstractC1276k.e(matcher, "matcher(...)");
                        C1772j b5 = io.ktor.utils.io.u.b(matcher, 0, str6);
                        if (b5 == null) {
                            str3 = str5;
                            list2 = c02;
                            iVar = null;
                        } else {
                            String d6 = d((String) ((Y3.E) b5.a()).get(1));
                            str3 = str5;
                            String obj4 = AbstractC1776n.l0((String) ((Y3.E) b5.a()).get(2)).toString();
                            list2 = c02;
                            if (u4.u.D(obj4, "<", false) && u4.u.w(obj4, ">", false)) {
                                obj4 = obj4.substring(1, obj4.length() - 1);
                                AbstractC1276k.e(obj4, "substring(...)");
                            }
                            String str7 = (String) Y3.m.r0(b5.a(), 3);
                            String obj5 = str7 != null ? AbstractC1776n.l0(str7).toString() : null;
                            if (obj5 == null) {
                                obj5 = FlexmarkHtmlConverter.DEFAULT_NODE;
                            }
                            String obj6 = AbstractC1776n.l0(AbstractC1776n.Y(AbstractC1776n.X(AbstractC1776n.Y(AbstractC1776n.X(AbstractC1776n.Y(AbstractC1776n.X(obj5, "\""), "\""), "'"), "'"), "("), ")")).toString();
                            if (obj6.length() <= 0) {
                                obj6 = null;
                            }
                            iVar = new X3.i(d6, new C0568f0(obj4, obj6));
                        }
                        if (iVar != null) {
                            linkedHashMap.put(iVar.f9393c, iVar.f9394e);
                        }
                    }
                    sb.append(str6);
                    if (i16 < Y4.l.C(list2)) {
                        sb.append('\n');
                    }
                }
                i16 = i17;
                str5 = str3;
                c02 = list2;
                c7 = '\n';
            }
            String str8 = str5;
            if (linkedHashMap.isEmpty()) {
                replace = sb.toString();
                AbstractC1276k.e(replace, "toString(...)");
            } else {
                String sb2 = sb.toString();
                AbstractC1276k.e(sb2, "toString(...)");
                List c03 = AbstractC1776n.c0(sb2, new String[]{str8});
                StringBuilder sb3 = new StringBuilder(sb.length());
                obj.f12968c = false;
                obj2.f12969c = SequenceUtils.SPC;
                obj3.f12971c = 0;
                Iterator it2 = c03.iterator();
                int i18 = 0;
                C1283r c1283r2 = obj;
                C1284s c1284s3 = obj2;
                C1286u c1286u2 = obj3;
                while (it2.hasNext()) {
                    int i19 = i18 + 1;
                    String str9 = (String) it2.next();
                    if (f(c1283r2, c1284s3, c1286u2, str9)) {
                        sb3.append(str9);
                        if (i18 < Y4.l.C(c03)) {
                            sb3.append('\n');
                        }
                        c1283r = c1283r2;
                        list = c03;
                        it = it2;
                        c1284s = c1284s3;
                        c1286u = c1286u2;
                        i8 = i19;
                    } else {
                        if (c1283r2.f12968c) {
                            c1283r = c1283r2;
                            list = c03;
                            it = it2;
                            i7 = i18;
                            c1284s = c1284s3;
                            c1286u = c1286u2;
                            i8 = i19;
                            sb3.append(str9);
                        } else {
                            if (linkedHashMap.isEmpty() || !AbstractC1776n.H(str9, '[')) {
                                c1283r = c1283r2;
                                list = c03;
                                it = it2;
                                i7 = i18;
                                c1284s = c1284s3;
                                c1286u = c1286u2;
                                i8 = i19;
                            } else {
                                StringBuilder sb4 = new StringBuilder(str9.length());
                                c1283r = c1283r2;
                                list = c03;
                                int i20 = 0;
                                int i21 = 0;
                                boolean z5 = false;
                                while (i21 < str9.length()) {
                                    char charAt = str9.charAt(i21);
                                    Iterator it3 = it2;
                                    if (charAt == '`') {
                                        int i22 = i21;
                                        C1284s c1284s4 = c1284s3;
                                        while (true) {
                                            if (i22 >= str9.length()) {
                                                c1284s2 = c1284s4;
                                                break;
                                            }
                                            c1284s2 = c1284s4;
                                            if (str9.charAt(i22) != '`') {
                                                break;
                                            }
                                            i22++;
                                            c1284s4 = c1284s2;
                                        }
                                        int i23 = i22 - i21;
                                        String substring = str9.substring(i21, i22);
                                        AbstractC1276k.e(substring, "substring(...)");
                                        sb4.append(substring);
                                        if (!z5) {
                                            i20 = i23;
                                            z5 = true;
                                        } else if (i23 == i20) {
                                            i20 = 0;
                                            z5 = false;
                                        }
                                        i21 = i22;
                                    } else {
                                        c1284s2 = c1284s3;
                                        if (z5) {
                                            sb4.append(charAt);
                                            i21++;
                                        } else {
                                            int i24 = i20;
                                            C1286u c1286u3 = c1286u2;
                                            if (charAt != '!' || (i14 = i21 + 1) >= str9.length()) {
                                                i9 = i18;
                                                i10 = i19;
                                                c6 = '[';
                                            } else {
                                                char charAt2 = str9.charAt(i14);
                                                c6 = '[';
                                                if (charAt2 == '[') {
                                                    int i25 = i21 + 2;
                                                    i9 = i18;
                                                    i10 = i19;
                                                    int N6 = AbstractC1776n.N(str9, ']', i25, 4);
                                                    if (N6 == -1) {
                                                        sb4.append(charAt);
                                                        it2 = it3;
                                                        c1284s3 = c1284s2;
                                                        i20 = i24;
                                                        c1286u2 = c1286u3;
                                                        i21 = i14;
                                                        i19 = i10;
                                                        i18 = i9;
                                                    } else {
                                                        String substring2 = str9.substring(i25, N6);
                                                        AbstractC1276k.e(substring2, "substring(...)");
                                                        i11 = N6 + 1;
                                                        if (i11 >= str9.length() || str9.charAt(i11) != '[' || (N5 = AbstractC1776n.N(str9, ']', (i15 = N6 + 2), 4)) == -1) {
                                                            String substring3 = str9.substring(i21, i11);
                                                            AbstractC1276k.e(substring3, "substring(...)");
                                                            sb4.append(substring3);
                                                            i21 = i11;
                                                            it2 = it3;
                                                            c1284s3 = c1284s2;
                                                            i20 = i24;
                                                            c1286u2 = c1286u3;
                                                            i19 = i10;
                                                            i18 = i9;
                                                        } else {
                                                            String substring4 = str9.substring(i15, N5);
                                                            AbstractC1276k.e(substring4, "substring(...)");
                                                            if (AbstractC1776n.Q(substring4)) {
                                                                substring4 = substring2;
                                                            }
                                                            C0568f0 c0568f0 = (C0568f0) linkedHashMap.get(d(substring4));
                                                            if (c0568f0 != null) {
                                                                String str10 = c0568f0.f7752b;
                                                                String s5 = str10 != null ? AbstractC1135a.s(" \"", str10, "\"") : null;
                                                                if (s5 == null) {
                                                                    s5 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                                                }
                                                                sb4.append("![");
                                                                sb4.append(substring2);
                                                                sb4.append("](");
                                                                sb4.append(c0568f0.a);
                                                                sb4.append(s5);
                                                                sb4.append(")");
                                                                i21 = N5 + 1;
                                                                it2 = it3;
                                                                c1284s3 = c1284s2;
                                                                i20 = i24;
                                                                c1286u2 = c1286u3;
                                                                i19 = i10;
                                                                i18 = i9;
                                                            } else {
                                                                i13 = N5 + 1;
                                                                String substring5 = str9.substring(i21, i13);
                                                                AbstractC1276k.e(substring5, "substring(...)");
                                                                sb4.append(substring5);
                                                                i21 = i13;
                                                                it2 = it3;
                                                                c1284s3 = c1284s2;
                                                                i20 = i24;
                                                                c1286u2 = c1286u3;
                                                                i19 = i10;
                                                                i18 = i9;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i9 = i18;
                                                    i10 = i19;
                                                }
                                            }
                                            if (charAt == c6) {
                                                i11 = i21 + 1;
                                                int N7 = AbstractC1776n.N(str9, ']', i11, 4);
                                                if (N7 == -1) {
                                                    sb4.append(charAt);
                                                } else {
                                                    String substring6 = str9.substring(i11, N7);
                                                    AbstractC1276k.e(substring6, "substring(...)");
                                                    i11 = N7 + 1;
                                                    if (i11 >= str9.length() || str9.charAt(i11) != '[' || (N5 = AbstractC1776n.N(str9, ']', (i12 = N7 + 2), 4)) == -1) {
                                                        String substring7 = str9.substring(i21, i11);
                                                        AbstractC1276k.e(substring7, "substring(...)");
                                                        sb4.append(substring7);
                                                    } else {
                                                        String substring8 = str9.substring(i12, N5);
                                                        AbstractC1276k.e(substring8, "substring(...)");
                                                        if (AbstractC1776n.Q(substring8)) {
                                                            substring8 = substring6;
                                                        }
                                                        C0568f0 c0568f02 = (C0568f0) linkedHashMap.get(d(substring8));
                                                        if (c0568f02 != null) {
                                                            String str11 = c0568f02.f7752b;
                                                            String s6 = str11 != null ? AbstractC1135a.s(" \"", str11, "\"") : null;
                                                            if (s6 == null) {
                                                                s6 = FlexmarkHtmlConverter.DEFAULT_NODE;
                                                            }
                                                            sb4.append("[");
                                                            sb4.append(substring6);
                                                            sb4.append("](");
                                                            sb4.append(c0568f02.a);
                                                            sb4.append(s6);
                                                            sb4.append(")");
                                                            i21 = N5 + 1;
                                                            it2 = it3;
                                                            c1284s3 = c1284s2;
                                                            i20 = i24;
                                                            c1286u2 = c1286u3;
                                                            i19 = i10;
                                                            i18 = i9;
                                                        } else {
                                                            i13 = N5 + 1;
                                                            String substring9 = str9.substring(i21, i13);
                                                            AbstractC1276k.e(substring9, "substring(...)");
                                                            sb4.append(substring9);
                                                            i21 = i13;
                                                            it2 = it3;
                                                            c1284s3 = c1284s2;
                                                            i20 = i24;
                                                            c1286u2 = c1286u3;
                                                            i19 = i10;
                                                            i18 = i9;
                                                        }
                                                    }
                                                }
                                                i21 = i11;
                                                it2 = it3;
                                                c1284s3 = c1284s2;
                                                i20 = i24;
                                                c1286u2 = c1286u3;
                                                i19 = i10;
                                                i18 = i9;
                                            } else {
                                                sb4.append(charAt);
                                                i21++;
                                                it2 = it3;
                                                c1284s3 = c1284s2;
                                                i20 = i24;
                                                c1286u2 = c1286u3;
                                                i19 = i10;
                                                i18 = i9;
                                            }
                                        }
                                    }
                                    it2 = it3;
                                    c1284s3 = c1284s2;
                                }
                                it = it2;
                                i7 = i18;
                                c1284s = c1284s3;
                                c1286u = c1286u2;
                                i8 = i19;
                                str9 = sb4.toString();
                                AbstractC1276k.e(str9, "toString(...)");
                            }
                            sb3.append(str9);
                        }
                        if (i7 < Y4.l.C(list)) {
                            sb3.append('\n');
                        }
                    }
                    c1283r2 = c1283r;
                    c03 = list;
                    it2 = it;
                    c1284s3 = c1284s;
                    c1286u2 = c1286u;
                    i18 = i8;
                }
                replace = sb3.toString();
                AbstractC1276k.e(replace, "toString(...)");
            }
        }
        if (replace.length() <= 100) {
            str2 = replace;
        } else {
            int length = replace.length();
            int i26 = length / 2;
            int i27 = length / 4;
            int i28 = (length * 3) / 4;
            String j02 = AbstractC1776n.j0(50, replace);
            String k02 = AbstractC1776n.k0(50, replace);
            String substring10 = replace.substring(i26, Math.min(i26 + 50, length));
            AbstractC1276k.e(substring10, "substring(...)");
            String substring11 = replace.substring(i27, Math.min(i27 + 30, length));
            AbstractC1276k.e(substring11, "substring(...)");
            String substring12 = replace.substring(i28, Math.min(i28 + 30, length));
            AbstractC1276k.e(substring12, "substring(...)");
            str2 = length + "_" + j02.hashCode() + "_" + substring10.hashCode() + "_" + k02.hashCode() + "_" + substring11.hashCode() + "_" + substring12.hashCode();
        }
        LinkedHashMap linkedHashMap2 = a;
        C0566e0 c0566e0 = (C0566e0) linkedHashMap2.get(str2);
        if (c0566e0 != null) {
            if (System.currentTimeMillis() - c0566e0.f7749b <= 300000) {
                return c0566e0.a;
            }
        }
        try {
            H3 = AbstractC0565e.A(replace);
            i6 = 0;
        } catch (Exception unused3) {
            i6 = 0;
            i5.a.a.getClass();
            androidx.lifecycle.N.p(new Object[0]);
            H3 = Y4.l.H(new V(replace));
        } catch (OutOfMemoryError unused4) {
            i6 = 0;
            i5.a.a.getClass();
            androidx.lifecycle.N.p(new Object[0]);
            try {
                H3 = AbstractC0565e.B(replace);
            } catch (Exception unused5) {
                i5.a.a.getClass();
                androidx.lifecycle.N.p(new Object[0]);
                H3 = Y4.l.H(new V(replace));
            }
        } catch (StackOverflowError unused6) {
            i6 = 0;
            i5.a.a.getClass();
            androidx.lifecycle.N.p(new Object[0]);
            H3 = Y4.l.H(new V(replace));
        }
        if (replace.length() <= 10000) {
            Set entrySet = linkedHashMap2.entrySet();
            AbstractC1276k.e(entrySet, "<get-entries>(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj7 : entrySet) {
                C0566e0 c0566e02 = (C0566e0) ((Map.Entry) obj7).getValue();
                c0566e02.getClass();
                if (System.currentTimeMillis() - c0566e02.f7749b > 300000) {
                    arrayList.add(obj7);
                }
            }
            ArrayList arrayList2 = new ArrayList(Y3.n.Z(arrayList, 10));
            int size = arrayList.size();
            int i29 = i6;
            while (i29 < size) {
                Object obj8 = arrayList.get(i29);
                i29++;
                arrayList2.add((String) ((Map.Entry) obj8).getKey());
            }
            int size2 = arrayList2.size();
            while (i6 < size2) {
                Object obj9 = arrayList2.get(i6);
                i6++;
                linkedHashMap2.remove((String) obj9);
            }
            if (linkedHashMap2.size() >= 50) {
                Set keySet = linkedHashMap2.keySet();
                AbstractC1276k.e(keySet, "<get-keys>(...)");
                String str12 = (String) Y3.m.p0(keySet);
                if (str12 != null) {
                }
            }
            linkedHashMap2.put(str2, new C0566e0(H3));
        }
        return H3;
    }

    public static final boolean f(C1283r c1283r, C1284s c1284s, C1286u c1286u, String str) {
        String obj = AbstractC1776n.o0(str).toString();
        X3.i iVar = null;
        if (obj.length() >= 3) {
            if (obj.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            char charAt = obj.charAt(0);
            if (charAt == '`' || charAt == '~') {
                int i6 = 0;
                while (i6 < obj.length() && obj.charAt(i6) == charAt) {
                    i6++;
                }
                if (i6 >= 3) {
                    iVar = new X3.i(Character.valueOf(charAt), Integer.valueOf(i6));
                }
            }
        }
        if (iVar == null) {
            return false;
        }
        char charValue = ((Character) iVar.f9393c).charValue();
        int intValue = ((Number) iVar.f9394e).intValue();
        if (!c1283r.f12968c) {
            c1283r.f12968c = true;
            c1284s.f12969c = charValue;
            c1286u.f12971c = intValue;
            return true;
        }
        if (charValue == c1284s.f12969c && intValue >= c1286u.f12971c) {
            c1283r.f12968c = false;
            c1284s.f12969c = SequenceUtils.SPC;
            c1286u.f12971c = 0;
        }
        return true;
    }
}
