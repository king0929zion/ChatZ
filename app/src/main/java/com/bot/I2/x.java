package I2;

import D.C0080m;
import I1.AbstractC0230i;
import J1.C0246a;
import M4.AbstractC0252a0;
import N1.C0279a;
import O.AbstractC0317k0;
import O.z0;
import P2.InterfaceC0346c;
import androidx.lifecycle.O;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import m.AbstractC1205L;
import m.AbstractC1227i;
import m.C1237s;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1340o;
import n0.C1353b;
import o4.AbstractC1410a;
import org.jsoup.nodes.Element;
import s4.InterfaceC1672b;
import u4.AbstractC1776n;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2700c;

    public /* synthetic */ x(int i6) {
        this.f2700c = i6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f2700c;
        X3.y yVar = X3.y.a;
        switch (i6) {
            case 0:
                N4.f fVar = (N4.f) obj;
                AbstractC1276k.f(fVar, "$this$Json");
                fVar.f3889c = true;
                fVar.f3890d = true;
                fVar.a = true;
                return yVar;
            case 1:
                String str = (String) obj;
                AbstractC1276k.f(str, "it");
                return Boolean.valueOf(u4.u.D(str, "ppt/slides/slide", false) && u4.u.w(str, ".xml", false));
            case 2:
                String str2 = (String) obj;
                AbstractC1276k.f(str2, "it");
                return Boolean.valueOf(str2.equals("word/document.xml"));
            case 3:
                String str3 = (String) obj;
                AbstractC1276k.f(str3, Attribute.NAME_ATTR);
                if (!str3.equals("xl/sharedStrings.xml")) {
                    String[] strArr = D.a;
                    if (!u4.u.D(str3, "xl/worksheets/sheet", false) || !u4.u.w(str3, ".xml", false)) {
                        r6 = false;
                    }
                }
                return Boolean.valueOf(r6);
            case 4:
                InterfaceC1672b interfaceC1672b = (InterfaceC1672b) obj;
                AbstractC1276k.f(interfaceC1672b, "it");
                KSerializer O5 = AbstractC1410a.O(interfaceC1672b);
                if (O5 != null) {
                    return O5;
                }
                if (AbstractC0252a0.g(interfaceC1672b)) {
                    return new I4.c(interfaceC1672b);
                }
                return null;
            case AbstractC1787b.f15290g /* 5 */:
                InterfaceC1672b interfaceC1672b2 = (InterfaceC1672b) obj;
                AbstractC1276k.f(interfaceC1672b2, "it");
                KSerializer O6 = AbstractC1410a.O(interfaceC1672b2);
                if (O6 == null) {
                    O6 = AbstractC0252a0.g(interfaceC1672b2) ? new I4.c(interfaceC1672b2) : null;
                }
                if (O6 != null) {
                    return Y4.d.J(O6);
                }
                return null;
            case 6:
                return new C0246a(O.c((F1.c) obj));
            case 7:
                return ((I1.j) obj).f2548i;
            case 8:
                I1.v vVar = ((I1.j) ((C1237s) obj).c()).f2544e;
                AbstractC1276k.d(vVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i7 = I1.v.f2590h;
                for (I1.v vVar2 : AbstractC0230i.b((J1.h) vVar)) {
                    if (vVar2 instanceof J1.h) {
                        ((J1.h) vVar2).getClass();
                    } else if (vVar2 instanceof J1.f) {
                        ((J1.f) vVar2).getClass();
                    }
                }
                return null;
            case AbstractC1787b.f15287d /* 9 */:
                F1.c cVar = (F1.c) obj;
                AbstractC1276k.f(cVar, "$this$initializer");
                return new L1.b(O.c(cVar));
            case AbstractC1787b.f15289f /* 10 */:
                I1.v vVar3 = (I1.v) obj;
                AbstractC1276k.f(vVar3, "destination");
                I1.x xVar = vVar3.f2593f;
                if (xVar == null || xVar.f2600i.f3045b != vVar3.f2592e.a) {
                    return null;
                }
                return xVar;
            case 11:
                I1.v vVar4 = (I1.v) obj;
                AbstractC1276k.f(vVar4, "destination");
                I1.x xVar2 = vVar4.f2593f;
                if (xVar2 == null || xVar2.f2600i.f3045b != vVar4.f2592e.a) {
                    return null;
                }
                return xVar2;
            case 12:
                I1.v vVar5 = (I1.v) obj;
                AbstractC1276k.f(vVar5, "it");
                return Integer.valueOf(vVar5.f2592e.a);
            case 13:
                return yVar;
            case 14:
                return yVar;
            case 15:
                M2.e eVar = (M2.e) obj;
                AbstractC1276k.f(eVar, "it");
                return eVar.f3282b;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                M2.e eVar2 = (M2.e) obj;
                AbstractC1276k.f(eVar2, "it");
                return eVar2.f3282b;
            case 17:
                AbstractC1276k.f((C0279a) obj, "config");
                throw new X3.h();
            case 18:
                X1.c cVar2 = (X1.c) obj;
                AbstractC1276k.f(cVar2, "it");
                return Boolean.valueOf(cVar2.Z());
            case 19:
                X1.c cVar3 = (X1.c) obj;
                AbstractC1276k.f(cVar3, "statement");
                Z3.h hVar = new Z3.h();
                while (cVar3.Z()) {
                    hVar.add(Integer.valueOf((int) cVar3.getLong(0)));
                }
                return h5.e.H(hVar);
            case 20:
                Element element = (Element) obj;
                AbstractC1276k.f(element, "element");
                String text = element.select(FlexmarkHtmlConverter.H2_NODE).text();
                AbstractC1276k.e(text, "text(...)");
                String obj2 = AbstractC1776n.l0(text).toString();
                String attr = element.select("h2 > a").attr("href");
                AbstractC1276k.e(attr, "attr(...)");
                String obj3 = AbstractC1776n.l0(attr).toString();
                String text2 = element.select(".b_caption p").text();
                AbstractC1276k.e(text2, "text(...)");
                String obj4 = AbstractC1776n.l0(text2).toString();
                if (AbstractC1776n.Q(obj2) && AbstractC1776n.Q(obj3) && AbstractC1776n.Q(obj4)) {
                    return null;
                }
                return new N2.j(obj2, obj3, obj4);
            case 21:
                K4.a aVar = (K4.a) obj;
                AbstractC1276k.f(aVar, "$this$buildSerialDescriptor");
                K4.a.a(aVar, "JsonPrimitive", new N4.l(new C0080m(25)));
                K4.a.a(aVar, "JsonNull", new N4.l(new C0080m(26)));
                K4.a.a(aVar, "JsonLiteral", new N4.l(new C0080m(27)));
                K4.a.a(aVar, "JsonObject", new N4.l(new C0080m(28)));
                K4.a.a(aVar, "JsonArray", new N4.l(new C0080m(29)));
                return yVar;
            case 22:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1276k.f(entry, "<destruct>");
                String str4 = (String) entry.getKey();
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) entry.getValue();
                StringBuilder sb = new StringBuilder();
                O4.y.a(str4, sb);
                sb.append(':');
                sb.append(bVar);
                String sb2 = sb.toString();
                AbstractC1276k.e(sb2, "toString(...)");
                return sb2;
            case 23:
                C1353b c1353b = (C1353b) obj;
                long j3 = c1353b.a;
                return (9223372034707292159L & j3) != 9205357640488583168L ? new C1340o(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & c1353b.a))) : AbstractC0317k0.a;
            case 24:
                C1340o c1340o = (C1340o) obj;
                return new C1353b((Float.floatToRawIntBits(c1340o.a) << 32) | (Float.floatToRawIntBits(c1340o.f13202b) & 4294967295L));
            case 25:
                return new z0(((Long) obj).longValue());
            case 26:
                InterfaceC0346c interfaceC0346c = (InterfaceC0346c) obj;
                AbstractC1276k.f(interfaceC0346c, "it");
                return interfaceC0346c.getKey();
            case 27:
                AbstractC1276k.f((C1237s) obj, "$this$AnimatedContent");
                return AbstractC1227i.c(AbstractC1205L.b(AbstractC1318d.s(400, 6, null), 2), AbstractC1205L.c(AbstractC1318d.s(300, 6, null), 2));
            case 28:
                L2.c cVar4 = (L2.c) obj;
                AbstractC1276k.f(cVar4, "it");
                return cVar4.a;
            default:
                L2.c cVar5 = (L2.c) obj;
                AbstractC1276k.f(cVar5, "it");
                return cVar5.f3058b;
        }
    }

    public /* synthetic */ x(N1.v vVar) {
        this.f2700c = 17;
    }
}
