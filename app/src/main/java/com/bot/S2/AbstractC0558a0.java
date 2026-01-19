package S2;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import u4.AbstractC1776n;
import u4.C1771i;
import u4.C1772j;
import u4.C1774l;

/* renamed from: S2.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0558a0 {
    public static final C1774l a = new C1774l("(?is)\\.([a-zA-Z0-9_-]+)\\s*\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final C1774l f7733b = new C1774l("(?i)style\\s*=\\s*(\"([^\"]*)\"|'([^']*)'|([^\\s>]+))");

    /* renamed from: c, reason: collision with root package name */
    public static final Set f7734c = Y3.k.C0(new String[]{FlexmarkHtmlConverter.SPAN_NODE, FlexmarkHtmlConverter.DIV_NODE, FlexmarkHtmlConverter.BR_NODE, FlexmarkHtmlConverter.STRONG_NODE, FlexmarkHtmlConverter.B_NODE, Attribute.STYLE_ATTR, FlexmarkHtmlConverter.A_NODE, FlexmarkHtmlConverter.IMG_NODE, FlexmarkHtmlConverter.EM_NODE, FlexmarkHtmlConverter.I_NODE, FlexmarkHtmlConverter.U_NODE, "s", FlexmarkHtmlConverter.DEL_NODE, FlexmarkHtmlConverter.SUP_NODE, FlexmarkHtmlConverter.SUB_NODE, FlexmarkHtmlConverter.P_NODE, FlexmarkHtmlConverter.H1_NODE, FlexmarkHtmlConverter.H2_NODE, FlexmarkHtmlConverter.H3_NODE, FlexmarkHtmlConverter.H4_NODE, FlexmarkHtmlConverter.H5_NODE, FlexmarkHtmlConverter.H6_NODE, FlexmarkHtmlConverter.UL_NODE, FlexmarkHtmlConverter.OL_NODE, FlexmarkHtmlConverter.LI_NODE, FlexmarkHtmlConverter.PRE_NODE, FlexmarkHtmlConverter.CODE_NODE, FlexmarkHtmlConverter.BLOCKQUOTE_NODE, FlexmarkHtmlConverter.HR_NODE, "section", "article", "header", "footer", "main", "nav", FlexmarkHtmlConverter.TABLE_NODE, FlexmarkHtmlConverter.THEAD_NODE, FlexmarkHtmlConverter.TBODY_NODE, "tfoot", FlexmarkHtmlConverter.TR_NODE, FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.TD_NODE, "button"});

    /* renamed from: d, reason: collision with root package name */
    public static final Object f7735d = Y3.B.Z(new X3.i("black", new o0.s(o0.y.d(4278190080L))), new X3.i("white", new o0.s(o0.y.d(4294967295L))), new X3.i("red", new o0.s(o0.y.d(4294901760L))), new X3.i("green", new o0.s(o0.y.d(4278222848L))), new X3.i("blue", new o0.s(o0.y.d(4278190335L))), new X3.i("yellow", new o0.s(o0.y.d(4294967040L))), new X3.i("cyan", new o0.s(o0.y.d(4278255615L))), new X3.i("magenta", new o0.s(o0.y.d(4294902015L))), new X3.i("gray", new o0.s(o0.y.d(4286611584L))), new X3.i("grey", new o0.s(o0.y.d(4286611584L))), new X3.i("orange", new o0.s(o0.y.d(4294944000L))), new X3.i("purple", new o0.s(o0.y.d(4286578816L))), new X3.i("pink", new o0.s(o0.y.d(4294951115L))), new X3.i("brown", new o0.s(o0.y.d(4289014314L))), new X3.i("skyblue", new o0.s(o0.y.d(4287090411L))), new X3.i("lightblue", new o0.s(o0.y.d(4289583334L))));

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7736e = Y3.B.Z(new X3.i("&hearts;", "♥"), new X3.i("&heartsuit;", "♥"), new X3.i("&copy;", "©"), new X3.i("&trade;", "™"));

    public static String a(Element element) {
        StringBuilder sb = new StringBuilder();
        List<Node> childNodes = element.childNodes();
        AbstractC1276k.e(childNodes, "childNodes(...)");
        for (Node node : childNodes) {
            AbstractC1276k.c(node);
            sb.append(b(node));
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026b, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.DIV_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0275, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.DEL_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03e8, code lost:
    
        r15 = c(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03f0, code lost:
    
        if (r15.length() != 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03fa, code lost:
    
        return j1.AbstractC1135a.s("~~", r15, "~~");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.H6_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03b2, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.EM_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0420, code lost:
    
        r15 = c(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0428, code lost:
    
        if (r15.length() != 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0432, code lost:
    
        return j1.AbstractC1135a.s("*", r15, "*");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        r0 = u4.u.E(u4.AbstractC1776n.X(r0, "h"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03e4, code lost:
    
        if (r0.equals("s") == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x041c, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.I_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0439, code lost:
    
        if (r0.equals("article") == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        r13 = i4.AbstractC1117a.f(r0.intValue(), 1, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0442, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.STRONG_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0482, code lost:
    
        r15 = c(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x048a, code lost:
    
        if (r15.length() != 0) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0493, code lost:
    
        return j1.AbstractC1135a.s("**", r15, "**");
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x044b, code lost:
    
        if (r0.equals("header") == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0454, code lost:
    
        if (r0.equals("footer") == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r15 = c(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x047f, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.B_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        if (r15.length() != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
    
        return B3.e.o("\n\n", u4.u.A("#", r13), com.vladsch.flexmark.util.sequence.SequenceUtils.SPACE, r15, "\n\n");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.H5_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.H4_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.H3_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.H2_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r0.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.H1_NODE) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (r0.equals("section") == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x045b, code lost:
    
        return a(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0153, code lost:
    
        if (r0.equals("main") == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0200, code lost:
    
        if (r0.equals("nav") == false) goto L254;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0052. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0055. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(org.jsoup.nodes.Node r15) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.AbstractC0558a0.b(org.jsoup.nodes.Node):java.lang.String");
    }

    public static String c(Element element) {
        StringBuilder sb = new StringBuilder();
        List<Node> childNodes = element.childNodes();
        AbstractC1276k.e(childNodes, "childNodes(...)");
        for (Node node : childNodes) {
            AbstractC1276k.c(node);
            sb.append(b(node));
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        String e6 = e(sb2);
        Pattern compile = Pattern.compile("\\s+");
        AbstractC1276k.e(compile, "compile(...)");
        String replaceAll = compile.matcher(e6).replaceAll(SequenceUtils.SPACE);
        AbstractC1276k.e(replaceAll, "replaceAll(...)");
        return AbstractC1776n.l0(replaceAll).toString();
    }

    public static String d(String str) {
        C1772j a6 = C1774l.a(f7733b, str);
        if (a6 == null) {
            return null;
        }
        Y.m mVar = a6.f15190c;
        C1771i b5 = mVar.b(2);
        if (b5 != null) {
            return b5.a;
        }
        C1771i b6 = mVar.b(3);
        if (b6 != null) {
            return b6.a;
        }
        C1771i b7 = mVar.b(4);
        if (b7 != null) {
            return b7.a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    public static String e(String str) {
        String unescapeEntities = Parser.unescapeEntities(str, false);
        AbstractC1276k.e(unescapeEntities, "unescapeEntities(...)");
        String replace = u4.u.B(unescapeEntities, "&nbsp;", SequenceUtils.SPACE, false).replace(SequenceUtils.NBSP, SequenceUtils.SPC);
        AbstractC1276k.e(replace, "replace(...)");
        for (Map.Entry entry : f7736e.entrySet()) {
            replace = u4.u.B(replace, (String) entry.getKey(), (String) entry.getValue(), true);
        }
        return replace;
    }

    public static C0584p f(String str) {
        String obj = AbstractC1776n.l0(str).toString();
        if (obj == null) {
            obj = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (!AbstractC1776n.Q(obj)) {
            String d6 = d(obj);
            if (d6 != null) {
                obj = d6;
            }
            Iterator it = AbstractC1776n.b0(obj, new char[]{';'}, 6).iterator();
            o0.s sVar = null;
            o0.s sVar2 = null;
            o0.s sVar3 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            Float f9 = null;
            Float f10 = null;
            while (it.hasNext()) {
                List b02 = AbstractC1776n.b0((String) it.next(), new char[]{':'}, 2);
                if (b02.size() == 2) {
                    String lowerCase = AbstractC1776n.l0((String) b02.get(0)).toString().toLowerCase(Locale.ROOT);
                    AbstractC1276k.e(lowerCase, "toLowerCase(...)");
                    String obj2 = AbstractC1776n.l0((String) b02.get(1)).toString();
                    if (obj2.length() != 0) {
                        switch (lowerCase.hashCode()) {
                            case -1332194002:
                                if (!lowerCase.equals("background")) {
                                    break;
                                } else {
                                    break;
                                }
                            case -806339567:
                                if (lowerCase.equals("padding")) {
                                    X3.i k3 = k(obj2);
                                    if (k3 == null) {
                                        break;
                                    } else {
                                        f9 = (Float) k3.f9393c;
                                        f8 = (Float) k3.f9394e;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            case 94842723:
                                if (lowerCase.equals("color")) {
                                    o0.s h3 = h(obj2);
                                    if (h3 == null) {
                                        break;
                                    } else {
                                        sVar = new o0.s(h3.a);
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            case 605322756:
                                if (!lowerCase.equals("background-color")) {
                                    break;
                                } else {
                                    break;
                                }
                            case 702417160:
                                if (lowerCase.equals("border-left")) {
                                    Z g3 = g(obj2);
                                    if (g3 != null) {
                                        o0.s sVar4 = g3.f7728b;
                                        if (sVar4 != null) {
                                            sVar3 = sVar4;
                                        }
                                        Float f11 = g3.a;
                                        if (f11 != null) {
                                            f6 = f11;
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            case 881039699:
                                if (lowerCase.equals("border-radius")) {
                                    Float j3 = j(obj2);
                                    if (j3 == null) {
                                        break;
                                    } else {
                                        f7 = Float.valueOf(j3.floatValue());
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            case 2086035242:
                                if (lowerCase.equals("margin-bottom")) {
                                    Float j4 = j(obj2);
                                    if (j4 == null) {
                                        break;
                                    } else {
                                        f10 = Float.valueOf(j4.floatValue());
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                        }
                        o0.s h6 = h(obj2);
                        if (h6 != null) {
                            sVar2 = new o0.s(h6.a);
                        }
                    }
                }
            }
            if (sVar != null || sVar2 != null || sVar3 != null || f6 != null || f7 != null || f8 != null || f9 != null || f10 != null) {
                return new C0584p(sVar, sVar2, sVar3, f6, f7, f8, f9, f10);
            }
        }
        return null;
    }

    public static Z g(String str) {
        List list;
        o0.s h3;
        Float j3;
        Pattern compile = Pattern.compile("\\s+");
        AbstractC1276k.e(compile, "compile(...)");
        AbstractC1276k.f(str, FlexmarkHtmlConverter.INPUT_NODE);
        int i6 = 0;
        AbstractC1776n.Z(0);
        Matcher matcher = compile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int i7 = 0;
            do {
                arrayList.add(str.subSequence(i7, matcher.start()).toString());
                i7 = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(i7, str.length()).toString());
            list = arrayList;
        } else {
            list = Y4.l.H(str.toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC1776n.Q((String) obj)) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        Float f6 = null;
        o0.s sVar = null;
        while (i6 < size) {
            Object obj2 = arrayList2.get(i6);
            i6++;
            String str2 = (String) obj2;
            if (f6 == null && (j3 = j(str2)) != null) {
                f6 = Float.valueOf(j3.floatValue());
            } else if (sVar == null && (h3 = h(str2)) != null) {
                sVar = new o0.s(h3.a);
            }
        }
        if (f6 == null && sVar == null) {
            return null;
        }
        return new Z(f6, sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r0 != 8) goto L66;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o0.s h(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.AbstractC0558a0.h(java.lang.String):o0.s");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0197, code lost:
    
        if (r1.equals("center") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019a, code lost:
    
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0124, code lost:
    
        if (r14.equals("middle") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0127, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0130, code lost:
    
        if (r14.equals("center") == false) goto L48;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00fe. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fa  */
    /* JADX WARN: Type inference failed for: r1v6, types: [Y3.v] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static S2.U i(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.AbstractC0558a0.i(java.lang.String):S2.U");
    }

    public static Float j(String str) {
        String lowerCase = AbstractC1776n.l0(str).toString().toLowerCase(Locale.ROOT);
        AbstractC1276k.e(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() == 0) {
            return null;
        }
        if (u4.u.w(lowerCase, "px", false)) {
            lowerCase = AbstractC1776n.Y(lowerCase, "px");
        } else if (u4.u.w(lowerCase, "dp", false)) {
            lowerCase = AbstractC1776n.Y(lowerCase, "dp");
        } else if (u4.u.w(lowerCase, "sp", false)) {
            lowerCase = AbstractC1776n.Y(lowerCase, "sp");
        }
        return u4.t.v(lowerCase);
    }

    public static X3.i k(String str) {
        List list;
        Pattern compile = Pattern.compile("\\s+");
        AbstractC1276k.e(compile, "compile(...)");
        AbstractC1276k.f(str, FlexmarkHtmlConverter.INPUT_NODE);
        AbstractC1776n.Z(0);
        Matcher matcher = compile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int i6 = 0;
            do {
                arrayList.add(str.subSequence(i6, matcher.start()).toString());
                i6 = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(i6, str.length()).toString());
            list = arrayList;
        } else {
            list = Y4.l.H(str.toString());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Float j3 = j((String) it.next());
            if (j3 != null) {
                arrayList2.add(j3);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        int size = arrayList2.size();
        if (size == 1) {
            return new X3.i(arrayList2.get(0), arrayList2.get(0));
        }
        if (size == 2) {
            return new X3.i(arrayList2.get(0), arrayList2.get(1));
        }
        if (size == 3) {
            return new X3.i(Float.valueOf((((Number) arrayList2.get(2)).floatValue() + ((Number) arrayList2.get(0)).floatValue()) / 2.0f), arrayList2.get(1));
        }
        return new X3.i(Float.valueOf((((Number) arrayList2.get(2)).floatValue() + ((Number) arrayList2.get(0)).floatValue()) / 2.0f), Float.valueOf((((Number) arrayList2.get(3)).floatValue() + ((Number) arrayList2.get(1)).floatValue()) / 2.0f));
    }

    public static Integer l(String str) {
        String obj = AbstractC1776n.l0(str).toString();
        if (u4.u.w(obj, "%", false)) {
            Float v5 = u4.t.v(AbstractC1776n.Y(obj, "%"));
            if (v5 != null) {
                return Integer.valueOf(AbstractC1410a.K((AbstractC1117a.e(v5.floatValue(), S.l.f7374V, 100.0f) / 100.0f) * 255.0f));
            }
            return null;
        }
        Float v6 = u4.t.v(obj);
        if (v6 != null) {
            return Integer.valueOf(AbstractC1117a.f(AbstractC1410a.K(v6.floatValue()), 0, 255));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x01ab, code lost:
    
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x006d, code lost:
    
        if (r0.length() > 0) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:202:0x02e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:88:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x061f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.AbstractC0558a0.m(java.lang.String):java.lang.String");
    }
}
