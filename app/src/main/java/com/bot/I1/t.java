package I1;

import android.net.Uri;
import android.os.Bundle;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i4.AbstractC1118b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import u4.AbstractC1776n;
import u4.C1771i;
import u4.C1772j;
import u4.C1774l;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: m, reason: collision with root package name */
    public static final C1774l f2568m = new C1774l("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final C1774l f2569n = new C1774l("\\{(.+?)\\}");

    /* renamed from: o, reason: collision with root package name */
    public static final C1774l f2570o = new C1774l("http[s]?://");

    /* renamed from: p, reason: collision with root package name */
    public static final C1774l f2571p = new C1774l(".*");

    /* renamed from: q, reason: collision with root package name */
    public static final C1774l f2572q = new C1774l("([^/]*?|)");

    /* renamed from: r, reason: collision with root package name */
    public static final C1774l f2573r = new C1774l("^[^?#]+\\?([^#]*).*");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2574b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2575c;

    /* renamed from: d, reason: collision with root package name */
    public final X3.n f2576d;

    /* renamed from: e, reason: collision with root package name */
    public final X3.n f2577e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2578f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2579g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2580h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2581i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2582j;

    /* renamed from: k, reason: collision with root package name */
    public final X3.n f2583k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2584l;

    public t(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.f2574b = arrayList;
        final int i6 = 0;
        this.f2576d = X3.a.d(new InterfaceC1193a(this) { // from class: I1.q

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f2564e; {
                this.f2564e = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                List list;
                switch (i6) {
                    case 0:
                        String str2 = this.f2564e.f2575c;
                        if (str2 != null) {
                            return new C1774l(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f2564e.a;
                        return Boolean.valueOf(str3 != null && t.f2573r.c(str3));
                    case 2:
                        t tVar = this.f2564e;
                        String str4 = tVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f2577e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            AbstractC1276k.e(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i7 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(B3.e.o("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Y3.m.q0(queryParameters);
                                if (str6 == null) {
                                    tVar.f2579g = true;
                                    str6 = str5;
                                }
                                C1772j a = C1774l.a(t.f2569n, str6);
                                s sVar = new s();
                                int i8 = 0;
                                while (a != null) {
                                    C1771i b5 = a.f15190c.b(i7);
                                    AbstractC1276k.c(b5);
                                    int i9 = i7;
                                    sVar.f2567b.add(b5.a);
                                    if (a.b().f14679c > i8) {
                                        String substring = str6.substring(i8, a.b().f14679c);
                                        AbstractC1276k.e(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        AbstractC1276k.e(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i8 = a.b().f14680e + 1;
                                    a = a.c();
                                    i7 = i9;
                                }
                                if (i8 < str6.length()) {
                                    String substring2 = str6.substring(i8);
                                    AbstractC1276k.e(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    AbstractC1276k.e(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                AbstractC1276k.e(sb2, "toString(...)");
                                sVar.a = t.h(sb2);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f2564e.a;
                        Uri parse2 = Uri.parse(str7);
                        AbstractC1276k.e(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        AbstractC1276k.e(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        AbstractC1276k.c(fragment);
                        t.a(fragment, arrayList2, sb3);
                        return new X3.i(arrayList2, sb3.toString());
                    case 4:
                        X3.i iVar = (X3.i) this.f2564e.f2580h.getValue();
                        return (iVar == null || (list = (List) iVar.f9393c) == null) ? new ArrayList() : list;
                    case AbstractC1787b.f15290g /* 5 */:
                        X3.i iVar2 = (X3.i) this.f2564e.f2580h.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f9394e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f2564e.f2582j.getValue();
                        if (str8 != null) {
                            return new C1774l(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 1;
        this.f2577e = X3.a.d(new InterfaceC1193a(this) { // from class: I1.q

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f2564e; {
                this.f2564e = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                List list;
                switch (i7) {
                    case 0:
                        String str2 = this.f2564e.f2575c;
                        if (str2 != null) {
                            return new C1774l(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f2564e.a;
                        return Boolean.valueOf(str3 != null && t.f2573r.c(str3));
                    case 2:
                        t tVar = this.f2564e;
                        String str4 = tVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f2577e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            AbstractC1276k.e(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(B3.e.o("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Y3.m.q0(queryParameters);
                                if (str6 == null) {
                                    tVar.f2579g = true;
                                    str6 = str5;
                                }
                                C1772j a = C1774l.a(t.f2569n, str6);
                                s sVar = new s();
                                int i8 = 0;
                                while (a != null) {
                                    C1771i b5 = a.f15190c.b(i72);
                                    AbstractC1276k.c(b5);
                                    int i9 = i72;
                                    sVar.f2567b.add(b5.a);
                                    if (a.b().f14679c > i8) {
                                        String substring = str6.substring(i8, a.b().f14679c);
                                        AbstractC1276k.e(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        AbstractC1276k.e(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i8 = a.b().f14680e + 1;
                                    a = a.c();
                                    i72 = i9;
                                }
                                if (i8 < str6.length()) {
                                    String substring2 = str6.substring(i8);
                                    AbstractC1276k.e(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    AbstractC1276k.e(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                AbstractC1276k.e(sb2, "toString(...)");
                                sVar.a = t.h(sb2);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f2564e.a;
                        Uri parse2 = Uri.parse(str7);
                        AbstractC1276k.e(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        AbstractC1276k.e(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        AbstractC1276k.c(fragment);
                        t.a(fragment, arrayList2, sb3);
                        return new X3.i(arrayList2, sb3.toString());
                    case 4:
                        X3.i iVar = (X3.i) this.f2564e.f2580h.getValue();
                        return (iVar == null || (list = (List) iVar.f9393c) == null) ? new ArrayList() : list;
                    case AbstractC1787b.f15290g /* 5 */:
                        X3.i iVar2 = (X3.i) this.f2564e.f2580h.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f9394e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f2564e.f2582j.getValue();
                        if (str8 != null) {
                            return new C1774l(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 2;
        InterfaceC1193a interfaceC1193a = new InterfaceC1193a(this) { // from class: I1.q

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f2564e; {
                this.f2564e = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                List list;
                switch (i8) {
                    case 0:
                        String str2 = this.f2564e.f2575c;
                        if (str2 != null) {
                            return new C1774l(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f2564e.a;
                        return Boolean.valueOf(str3 != null && t.f2573r.c(str3));
                    case 2:
                        t tVar = this.f2564e;
                        String str4 = tVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f2577e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            AbstractC1276k.e(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(B3.e.o("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Y3.m.q0(queryParameters);
                                if (str6 == null) {
                                    tVar.f2579g = true;
                                    str6 = str5;
                                }
                                C1772j a = C1774l.a(t.f2569n, str6);
                                s sVar = new s();
                                int i82 = 0;
                                while (a != null) {
                                    C1771i b5 = a.f15190c.b(i72);
                                    AbstractC1276k.c(b5);
                                    int i9 = i72;
                                    sVar.f2567b.add(b5.a);
                                    if (a.b().f14679c > i82) {
                                        String substring = str6.substring(i82, a.b().f14679c);
                                        AbstractC1276k.e(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        AbstractC1276k.e(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = a.b().f14680e + 1;
                                    a = a.c();
                                    i72 = i9;
                                }
                                if (i82 < str6.length()) {
                                    String substring2 = str6.substring(i82);
                                    AbstractC1276k.e(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    AbstractC1276k.e(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                AbstractC1276k.e(sb2, "toString(...)");
                                sVar.a = t.h(sb2);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f2564e.a;
                        Uri parse2 = Uri.parse(str7);
                        AbstractC1276k.e(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        AbstractC1276k.e(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        AbstractC1276k.c(fragment);
                        t.a(fragment, arrayList2, sb3);
                        return new X3.i(arrayList2, sb3.toString());
                    case 4:
                        X3.i iVar = (X3.i) this.f2564e.f2580h.getValue();
                        return (iVar == null || (list = (List) iVar.f9393c) == null) ? new ArrayList() : list;
                    case AbstractC1787b.f15290g /* 5 */:
                        X3.i iVar2 = (X3.i) this.f2564e.f2580h.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f9394e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f2564e.f2582j.getValue();
                        if (str8 != null) {
                            return new C1774l(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        X3.g gVar = X3.g.f9391e;
        this.f2578f = X3.a.c(gVar, interfaceC1193a);
        final int i9 = 3;
        this.f2580h = X3.a.c(gVar, new InterfaceC1193a(this) { // from class: I1.q

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f2564e; {
                this.f2564e = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                List list;
                switch (i9) {
                    case 0:
                        String str2 = this.f2564e.f2575c;
                        if (str2 != null) {
                            return new C1774l(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f2564e.a;
                        return Boolean.valueOf(str3 != null && t.f2573r.c(str3));
                    case 2:
                        t tVar = this.f2564e;
                        String str4 = tVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f2577e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            AbstractC1276k.e(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(B3.e.o("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Y3.m.q0(queryParameters);
                                if (str6 == null) {
                                    tVar.f2579g = true;
                                    str6 = str5;
                                }
                                C1772j a = C1774l.a(t.f2569n, str6);
                                s sVar = new s();
                                int i82 = 0;
                                while (a != null) {
                                    C1771i b5 = a.f15190c.b(i72);
                                    AbstractC1276k.c(b5);
                                    int i92 = i72;
                                    sVar.f2567b.add(b5.a);
                                    if (a.b().f14679c > i82) {
                                        String substring = str6.substring(i82, a.b().f14679c);
                                        AbstractC1276k.e(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        AbstractC1276k.e(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = a.b().f14680e + 1;
                                    a = a.c();
                                    i72 = i92;
                                }
                                if (i82 < str6.length()) {
                                    String substring2 = str6.substring(i82);
                                    AbstractC1276k.e(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    AbstractC1276k.e(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                AbstractC1276k.e(sb2, "toString(...)");
                                sVar.a = t.h(sb2);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f2564e.a;
                        Uri parse2 = Uri.parse(str7);
                        AbstractC1276k.e(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        AbstractC1276k.e(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        AbstractC1276k.c(fragment);
                        t.a(fragment, arrayList2, sb3);
                        return new X3.i(arrayList2, sb3.toString());
                    case 4:
                        X3.i iVar = (X3.i) this.f2564e.f2580h.getValue();
                        return (iVar == null || (list = (List) iVar.f9393c) == null) ? new ArrayList() : list;
                    case AbstractC1787b.f15290g /* 5 */:
                        X3.i iVar2 = (X3.i) this.f2564e.f2580h.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f9394e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f2564e.f2582j.getValue();
                        if (str8 != null) {
                            return new C1774l(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i10 = 4;
        this.f2581i = X3.a.c(gVar, new InterfaceC1193a(this) { // from class: I1.q

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f2564e; {
                this.f2564e = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                List list;
                switch (i10) {
                    case 0:
                        String str2 = this.f2564e.f2575c;
                        if (str2 != null) {
                            return new C1774l(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f2564e.a;
                        return Boolean.valueOf(str3 != null && t.f2573r.c(str3));
                    case 2:
                        t tVar = this.f2564e;
                        String str4 = tVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f2577e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            AbstractC1276k.e(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(B3.e.o("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Y3.m.q0(queryParameters);
                                if (str6 == null) {
                                    tVar.f2579g = true;
                                    str6 = str5;
                                }
                                C1772j a = C1774l.a(t.f2569n, str6);
                                s sVar = new s();
                                int i82 = 0;
                                while (a != null) {
                                    C1771i b5 = a.f15190c.b(i72);
                                    AbstractC1276k.c(b5);
                                    int i92 = i72;
                                    sVar.f2567b.add(b5.a);
                                    if (a.b().f14679c > i82) {
                                        String substring = str6.substring(i82, a.b().f14679c);
                                        AbstractC1276k.e(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        AbstractC1276k.e(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = a.b().f14680e + 1;
                                    a = a.c();
                                    i72 = i92;
                                }
                                if (i82 < str6.length()) {
                                    String substring2 = str6.substring(i82);
                                    AbstractC1276k.e(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    AbstractC1276k.e(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                AbstractC1276k.e(sb2, "toString(...)");
                                sVar.a = t.h(sb2);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f2564e.a;
                        Uri parse2 = Uri.parse(str7);
                        AbstractC1276k.e(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        AbstractC1276k.e(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        AbstractC1276k.c(fragment);
                        t.a(fragment, arrayList2, sb3);
                        return new X3.i(arrayList2, sb3.toString());
                    case 4:
                        X3.i iVar = (X3.i) this.f2564e.f2580h.getValue();
                        return (iVar == null || (list = (List) iVar.f9393c) == null) ? new ArrayList() : list;
                    case AbstractC1787b.f15290g /* 5 */:
                        X3.i iVar2 = (X3.i) this.f2564e.f2580h.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f9394e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f2564e.f2582j.getValue();
                        if (str8 != null) {
                            return new C1774l(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i11 = 5;
        this.f2582j = X3.a.c(gVar, new InterfaceC1193a(this) { // from class: I1.q

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f2564e; {
                this.f2564e = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                List list;
                switch (i11) {
                    case 0:
                        String str2 = this.f2564e.f2575c;
                        if (str2 != null) {
                            return new C1774l(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f2564e.a;
                        return Boolean.valueOf(str3 != null && t.f2573r.c(str3));
                    case 2:
                        t tVar = this.f2564e;
                        String str4 = tVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f2577e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            AbstractC1276k.e(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(B3.e.o("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Y3.m.q0(queryParameters);
                                if (str6 == null) {
                                    tVar.f2579g = true;
                                    str6 = str5;
                                }
                                C1772j a = C1774l.a(t.f2569n, str6);
                                s sVar = new s();
                                int i82 = 0;
                                while (a != null) {
                                    C1771i b5 = a.f15190c.b(i72);
                                    AbstractC1276k.c(b5);
                                    int i92 = i72;
                                    sVar.f2567b.add(b5.a);
                                    if (a.b().f14679c > i82) {
                                        String substring = str6.substring(i82, a.b().f14679c);
                                        AbstractC1276k.e(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        AbstractC1276k.e(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = a.b().f14680e + 1;
                                    a = a.c();
                                    i72 = i92;
                                }
                                if (i82 < str6.length()) {
                                    String substring2 = str6.substring(i82);
                                    AbstractC1276k.e(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    AbstractC1276k.e(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                AbstractC1276k.e(sb2, "toString(...)");
                                sVar.a = t.h(sb2);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f2564e.a;
                        Uri parse2 = Uri.parse(str7);
                        AbstractC1276k.e(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        AbstractC1276k.e(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        AbstractC1276k.c(fragment);
                        t.a(fragment, arrayList2, sb3);
                        return new X3.i(arrayList2, sb3.toString());
                    case 4:
                        X3.i iVar = (X3.i) this.f2564e.f2580h.getValue();
                        return (iVar == null || (list = (List) iVar.f9393c) == null) ? new ArrayList() : list;
                    case AbstractC1787b.f15290g /* 5 */:
                        X3.i iVar2 = (X3.i) this.f2564e.f2580h.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f9394e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f2564e.f2582j.getValue();
                        if (str8 != null) {
                            return new C1774l(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i12 = 6;
        this.f2583k = X3.a.d(new InterfaceC1193a(this) { // from class: I1.q

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f2564e; {
                this.f2564e = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                List list;
                switch (i12) {
                    case 0:
                        String str2 = this.f2564e.f2575c;
                        if (str2 != null) {
                            return new C1774l(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f2564e.a;
                        return Boolean.valueOf(str3 != null && t.f2573r.c(str3));
                    case 2:
                        t tVar = this.f2564e;
                        String str4 = tVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f2577e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            AbstractC1276k.e(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(B3.e.o("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Y3.m.q0(queryParameters);
                                if (str6 == null) {
                                    tVar.f2579g = true;
                                    str6 = str5;
                                }
                                C1772j a = C1774l.a(t.f2569n, str6);
                                s sVar = new s();
                                int i82 = 0;
                                while (a != null) {
                                    C1771i b5 = a.f15190c.b(i72);
                                    AbstractC1276k.c(b5);
                                    int i92 = i72;
                                    sVar.f2567b.add(b5.a);
                                    if (a.b().f14679c > i82) {
                                        String substring = str6.substring(i82, a.b().f14679c);
                                        AbstractC1276k.e(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        AbstractC1276k.e(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = a.b().f14680e + 1;
                                    a = a.c();
                                    i72 = i92;
                                }
                                if (i82 < str6.length()) {
                                    String substring2 = str6.substring(i82);
                                    AbstractC1276k.e(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    AbstractC1276k.e(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                AbstractC1276k.e(sb2, "toString(...)");
                                sVar.a = t.h(sb2);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f2564e.a;
                        Uri parse2 = Uri.parse(str7);
                        AbstractC1276k.e(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        AbstractC1276k.e(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        AbstractC1276k.c(fragment);
                        t.a(fragment, arrayList2, sb3);
                        return new X3.i(arrayList2, sb3.toString());
                    case 4:
                        X3.i iVar = (X3.i) this.f2564e.f2580h.getValue();
                        return (iVar == null || (list = (List) iVar.f9393c) == null) ? new ArrayList() : list;
                    case AbstractC1787b.f15290g /* 5 */:
                        X3.i iVar2 = (X3.i) this.f2564e.f2580h.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f9394e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f2564e.f2582j.getValue();
                        if (str8 != null) {
                            return new C1774l(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i13 = 7;
        X3.a.d(new InterfaceC1193a(this) { // from class: I1.q

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t f2564e; {
                this.f2564e = this;
            }

            /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, X3.f] */
            /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, X3.f] */
            @Override // l4.InterfaceC1193a
            public final Object b() {
                List list;
                switch (i13) {
                    case 0:
                        String str2 = this.f2564e.f2575c;
                        if (str2 != null) {
                            return new C1774l(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = this.f2564e.a;
                        return Boolean.valueOf(str3 != null && t.f2573r.c(str3));
                    case 2:
                        t tVar = this.f2564e;
                        String str4 = tVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) tVar.f2577e.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            AbstractC1276k.e(parse, "parse(...)");
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                int i72 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(B3.e.o("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) Y3.m.q0(queryParameters);
                                if (str6 == null) {
                                    tVar.f2579g = true;
                                    str6 = str5;
                                }
                                C1772j a = C1774l.a(t.f2569n, str6);
                                s sVar = new s();
                                int i82 = 0;
                                while (a != null) {
                                    C1771i b5 = a.f15190c.b(i72);
                                    AbstractC1276k.c(b5);
                                    int i92 = i72;
                                    sVar.f2567b.add(b5.a);
                                    if (a.b().f14679c > i82) {
                                        String substring = str6.substring(i82, a.b().f14679c);
                                        AbstractC1276k.e(substring, "substring(...)");
                                        String quote = Pattern.quote(substring);
                                        AbstractC1276k.e(quote, "quote(...)");
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i82 = a.b().f14680e + 1;
                                    a = a.c();
                                    i72 = i92;
                                }
                                if (i82 < str6.length()) {
                                    String substring2 = str6.substring(i82);
                                    AbstractC1276k.e(substring2, "substring(...)");
                                    String quote2 = Pattern.quote(substring2);
                                    AbstractC1276k.e(quote2, "quote(...)");
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                String sb2 = sb.toString();
                                AbstractC1276k.e(sb2, "toString(...)");
                                sVar.a = t.h(sb2);
                                linkedHashMap.put(str5, sVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f2564e.a;
                        Uri parse2 = Uri.parse(str7);
                        AbstractC1276k.e(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        AbstractC1276k.e(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb3 = new StringBuilder();
                        AbstractC1276k.c(fragment);
                        t.a(fragment, arrayList2, sb3);
                        return new X3.i(arrayList2, sb3.toString());
                    case 4:
                        X3.i iVar = (X3.i) this.f2564e.f2580h.getValue();
                        return (iVar == null || (list = (List) iVar.f9393c) == null) ? new ArrayList() : list;
                    case AbstractC1787b.f15290g /* 5 */:
                        X3.i iVar2 = (X3.i) this.f2564e.f2580h.getValue();
                        if (iVar2 != null) {
                            return (String) iVar2.f9394e;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f2564e.f2582j.getValue();
                        if (str8 != null) {
                            return new C1774l(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!f2568m.f15193c.matcher(str).find()) {
            String pattern = f2570o.f15193c.pattern();
            AbstractC1276k.e(pattern, "pattern(...)");
            sb.append(pattern);
        }
        Pattern compile = Pattern.compile("(\\?|#|$)");
        AbstractC1276k.e(compile, "compile(...)");
        Matcher matcher = compile.matcher(str);
        AbstractC1276k.e(matcher, "matcher(...)");
        boolean z5 = false;
        C1772j b5 = io.ktor.utils.io.u.b(matcher, 0, str);
        if (b5 != null) {
            String substring = str.substring(0, b5.b().f14679c);
            AbstractC1276k.e(substring, "substring(...)");
            a(substring, arrayList, sb);
            if (!f2571p.f15193c.matcher(sb).find() && !f2572q.f15193c.matcher(sb).find()) {
                z5 = true;
            }
            this.f2584l = z5;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        this.f2575c = h(sb2);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i6 = 0;
        for (C1772j a = C1774l.a(f2569n, str); a != null; a = a.c()) {
            C1771i b5 = a.f15190c.b(1);
            AbstractC1276k.c(b5);
            arrayList.add(b5.a);
            if (a.b().f14679c > i6) {
                String substring = str.substring(i6, a.b().f14679c);
                AbstractC1276k.e(substring, "substring(...)");
                String quote = Pattern.quote(substring);
                AbstractC1276k.e(quote, "quote(...)");
                sb.append(quote);
            }
            String pattern = f2572q.f15193c.pattern();
            AbstractC1276k.e(pattern, "pattern(...)");
            sb.append(pattern);
            i6 = a.b().f14680e + 1;
        }
        if (i6 < str.length()) {
            String substring2 = str.substring(i6);
            AbstractC1276k.e(substring2, "substring(...)");
            String quote2 = Pattern.quote(substring2);
            AbstractC1276k.e(quote2, "quote(...)");
            sb.append(quote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, C0229h c0229h) {
        if (c0229h == null) {
            AbstractC1410a.G(str, str2, bundle);
            return;
        }
        F f6 = c0229h.a;
        AbstractC1276k.f(str, "key");
        f6.e(bundle, str, f6.d(str2));
    }

    public static String h(String str) {
        return (AbstractC1776n.G(str, "\\Q", false) && AbstractC1776n.G(str, "\\E", false)) ? u4.u.B(str, ".*", "\\E.*\\Q", false) : AbstractC1776n.G(str, "\\.\\*", false) ? u4.u.B(str, "\\.\\*", ".*", false) : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(this.a);
        AbstractC1276k.e(parse, "parse(...)");
        List<String> pathSegments2 = parse.getPathSegments();
        AbstractC1276k.f(pathSegments, "<this>");
        AbstractC1276k.f(pathSegments2, "other");
        Set M02 = Y3.m.M0(pathSegments);
        M02.retainAll(pathSegments2);
        return M02.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X3.f] */
    public final ArrayList c() {
        Collection values = ((Map) this.f2578f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Y3.r.c0(((s) it.next()).f2567b, arrayList);
        }
        return Y3.m.z0(Y3.m.z0(this.f2574b, arrayList), (List) this.f2581i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X3.f] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        C1772j b5;
        C1772j b6;
        String str;
        AbstractC1276k.f(uri, "deepLink");
        AbstractC1276k.f(linkedHashMap, "arguments");
        C1774l c1774l = (C1774l) this.f2576d.getValue();
        if (c1774l != null && (b5 = c1774l.b(uri.toString())) != null) {
            int i6 = 0;
            Bundle d6 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
            if (e(b5, d6, linkedHashMap) && (!((Boolean) this.f2577e.getValue()).booleanValue() || f(uri, d6, linkedHashMap))) {
                String fragment = uri.getFragment();
                C1774l c1774l2 = (C1774l) this.f2583k.getValue();
                if (c1774l2 != null && (b6 = c1774l2.b(String.valueOf(fragment))) != null) {
                    List list = (List) this.f2581i.getValue();
                    ArrayList arrayList = new ArrayList(Y3.n.Z(list, 10));
                    for (Object obj : list) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            Y4.l.U();
                            throw null;
                        }
                        String str2 = (String) obj;
                        C1771i b7 = b6.f15190c.b(i7);
                        if (b7 != null) {
                            str = Uri.decode(b7.a);
                            AbstractC1276k.e(str, "decode(...)");
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = FlexmarkHtmlConverter.DEFAULT_NODE;
                        }
                        try {
                            g(d6, str2, str, (C0229h) linkedHashMap.get(str2));
                            arrayList.add(X3.y.a);
                            i6 = i7;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (AbstractC0230i.e(linkedHashMap, new r(d6, 0)).isEmpty()) {
                    return d6;
                }
            }
        }
        return null;
    }

    public final boolean e(C1772j c1772j, Bundle bundle, Map map) {
        ArrayList arrayList = this.f2574b;
        ArrayList arrayList2 = new ArrayList(Y3.n.Z(arrayList, 10));
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            int i8 = i6 + 1;
            String str = null;
            if (i6 < 0) {
                Y4.l.U();
                throw null;
            }
            String str2 = (String) obj;
            C1771i b5 = c1772j.f15190c.b(i8);
            if (b5 != null) {
                str = Uri.decode(b5.a);
                AbstractC1276k.e(str, "decode(...)");
            }
            if (str == null) {
                str = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            try {
                g(bundle, str2, str, (C0229h) map.get(str2));
                arrayList2.add(X3.y.a);
                i6 = i8;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        return this.a.equals(((t) obj).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00de A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X3.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.net.Uri r20, android.os.Bundle r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.t.f(android.net.Uri, android.os.Bundle, java.util.Map):boolean");
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
