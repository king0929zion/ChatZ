package I2;

import A4.C0002c;
import A4.InterfaceC0007h;
import B4.AbstractC0050c;
import b4.C0911i;
import com.bot.core.model.ReasoningParams;
import com.bot.core.model.ReasoningRule;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m4.AbstractC1276k;
import org.json.JSONArray;
import org.json.JSONObject;
import u4.AbstractC1776n;
import x4.AbstractC1898K;
import x4.C1940w;
import z4.EnumC2050a;

/* loaded from: classes.dex */
public final class g {
    public static final C0231a Companion = new Object();
    public final A a;

    public g(A a) {
        AbstractC1276k.f(a, "reasoningConfigRepository");
        this.a = a;
    }

    public static void B(LinkedHashMap linkedHashMap, String str, String str2, String str3, Object obj, boolean z5) {
        Object obj2 = linkedHashMap.get(str);
        if (obj2 == null) {
            obj2 = new C0232b();
            linkedHashMap.put(str, obj2);
        }
        C0232b c0232b = (C0232b) obj2;
        StringBuilder sb = c0232b.f2622c;
        if (str2 != null && !AbstractC1776n.Q(str2)) {
            c0232b.a = str2;
        }
        if (str3 != null && !AbstractC1776n.Q(str3)) {
            c0232b.f2621b = str3;
        }
        String jSONObject = (obj == null || obj.equals(JSONObject.NULL)) ? null : obj instanceof JSONObject ? ((JSONObject) obj).toString() : obj instanceof JSONArray ? ((JSONArray) obj).toString() : obj.toString();
        if (jSONObject == null) {
            return;
        }
        if (z5 && (obj instanceof String)) {
            sb.append(jSONObject);
        } else {
            u4.r.s(sb);
            sb.append(jSONObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0388, code lost:
    
        if (r2.equals("text_delta") == false) goto L221;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:154:0x0259. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:198:0x031a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x0113. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038c A[Catch: Exception -> 0x0275, TryCatch #1 {Exception -> 0x0275, blocks: (B:150:0x0244, B:152:0x024f, B:155:0x025e, B:158:0x0268, B:160:0x0270, B:163:0x027d, B:165:0x0285, B:167:0x02a1, B:168:0x02a7, B:171:0x02bf, B:174:0x02cb, B:177:0x02dc, B:180:0x02e4, B:183:0x02ef, B:185:0x02f5, B:189:0x02fc, B:192:0x0306, B:194:0x030c, B:197:0x0316, B:198:0x031a, B:201:0x038c, B:204:0x0397, B:206:0x039d, B:209:0x031f, B:213:0x036a, B:216:0x0375, B:218:0x037b, B:221:0x0326, B:225:0x03a6, B:228:0x03b1, B:230:0x03b7, B:233:0x032d, B:236:0x0336, B:238:0x0345, B:239:0x035f, B:242:0x0382, B:245:0x03be, B:248:0x03c6, B:250:0x03cc, B:253:0x03d7, B:256:0x03df, B:260:0x03e6, B:263:0x03f0, B:265:0x03f6, B:268:0x0403, B:270:0x0409, B:272:0x0413, B:275:0x041a, B:278:0x0424, B:280:0x042e), top: B:149:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x039d A[Catch: Exception -> 0x0275, TryCatch #1 {Exception -> 0x0275, blocks: (B:150:0x0244, B:152:0x024f, B:155:0x025e, B:158:0x0268, B:160:0x0270, B:163:0x027d, B:165:0x0285, B:167:0x02a1, B:168:0x02a7, B:171:0x02bf, B:174:0x02cb, B:177:0x02dc, B:180:0x02e4, B:183:0x02ef, B:185:0x02f5, B:189:0x02fc, B:192:0x0306, B:194:0x030c, B:197:0x0316, B:198:0x031a, B:201:0x038c, B:204:0x0397, B:206:0x039d, B:209:0x031f, B:213:0x036a, B:216:0x0375, B:218:0x037b, B:221:0x0326, B:225:0x03a6, B:228:0x03b1, B:230:0x03b7, B:233:0x032d, B:236:0x0336, B:238:0x0345, B:239:0x035f, B:242:0x0382, B:245:0x03be, B:248:0x03c6, B:250:0x03cc, B:253:0x03d7, B:256:0x03df, B:260:0x03e6, B:263:0x03f0, B:265:0x03f6, B:268:0x0403, B:270:0x0409, B:272:0x0413, B:275:0x041a, B:278:0x0424, B:280:0x042e), top: B:149:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x036a A[Catch: Exception -> 0x0275, TryCatch #1 {Exception -> 0x0275, blocks: (B:150:0x0244, B:152:0x024f, B:155:0x025e, B:158:0x0268, B:160:0x0270, B:163:0x027d, B:165:0x0285, B:167:0x02a1, B:168:0x02a7, B:171:0x02bf, B:174:0x02cb, B:177:0x02dc, B:180:0x02e4, B:183:0x02ef, B:185:0x02f5, B:189:0x02fc, B:192:0x0306, B:194:0x030c, B:197:0x0316, B:198:0x031a, B:201:0x038c, B:204:0x0397, B:206:0x039d, B:209:0x031f, B:213:0x036a, B:216:0x0375, B:218:0x037b, B:221:0x0326, B:225:0x03a6, B:228:0x03b1, B:230:0x03b7, B:233:0x032d, B:236:0x0336, B:238:0x0345, B:239:0x035f, B:242:0x0382, B:245:0x03be, B:248:0x03c6, B:250:0x03cc, B:253:0x03d7, B:256:0x03df, B:260:0x03e6, B:263:0x03f0, B:265:0x03f6, B:268:0x0403, B:270:0x0409, B:272:0x0413, B:275:0x041a, B:278:0x0424, B:280:0x042e), top: B:149:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x037b A[Catch: Exception -> 0x0275, TryCatch #1 {Exception -> 0x0275, blocks: (B:150:0x0244, B:152:0x024f, B:155:0x025e, B:158:0x0268, B:160:0x0270, B:163:0x027d, B:165:0x0285, B:167:0x02a1, B:168:0x02a7, B:171:0x02bf, B:174:0x02cb, B:177:0x02dc, B:180:0x02e4, B:183:0x02ef, B:185:0x02f5, B:189:0x02fc, B:192:0x0306, B:194:0x030c, B:197:0x0316, B:198:0x031a, B:201:0x038c, B:204:0x0397, B:206:0x039d, B:209:0x031f, B:213:0x036a, B:216:0x0375, B:218:0x037b, B:221:0x0326, B:225:0x03a6, B:228:0x03b1, B:230:0x03b7, B:233:0x032d, B:236:0x0336, B:238:0x0345, B:239:0x035f, B:242:0x0382, B:245:0x03be, B:248:0x03c6, B:250:0x03cc, B:253:0x03d7, B:256:0x03df, B:260:0x03e6, B:263:0x03f0, B:265:0x03f6, B:268:0x0403, B:270:0x0409, B:272:0x0413, B:275:0x041a, B:278:0x0424, B:280:0x042e), top: B:149:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0190 A[Catch: Exception -> 0x00d2, TryCatch #2 {Exception -> 0x00d2, blocks: (B:37:0x00ad, B:39:0x00b8, B:41:0x00be, B:43:0x00c4, B:50:0x00d5, B:53:0x00dd, B:55:0x00e5, B:57:0x00eb, B:59:0x00f3, B:61:0x00fa, B:65:0x0104, B:66:0x0101, B:69:0x0107, B:71:0x010d, B:74:0x0117, B:77:0x0120, B:80:0x0136, B:82:0x0141, B:85:0x014a, B:86:0x0156, B:89:0x015f, B:91:0x016c, B:94:0x0174, B:97:0x0186, B:99:0x0190, B:102:0x017d, B:105:0x0199, B:108:0x01a2, B:110:0x01af, B:111:0x01b5, B:114:0x01bf), top: B:36:0x00ad }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final I2.m a(I2.g r17, java.lang.String r18, I2.w r19, java.util.LinkedHashMap r20) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.g.a(I2.g, java.lang.String, I2.w, java.util.LinkedHashMap):I2.m");
    }

    public static void b(JSONArray jSONArray, LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2;
        int length = jSONArray.length();
        int i6 = 0;
        while (i6 < length) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i6);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("index", i6);
                String optString = optJSONObject.optString(Attribute.ID_ATTR);
                AbstractC1276k.c(optString);
                String str = !AbstractC1776n.Q(optString) ? optString : null;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("function");
                if (optJSONObject2 != null) {
                    String optString2 = optJSONObject2.optString(Attribute.NAME_ATTR);
                    AbstractC1276k.c(optString2);
                    String str2 = !AbstractC1776n.Q(optString2) ? optString2 : null;
                    String optString3 = optJSONObject2.optString("arguments");
                    String str3 = "openai:" + optInt;
                    AbstractC1276k.c(optString3);
                    linkedHashMap2 = linkedHashMap;
                    B(linkedHashMap2, str3, str, str2, optString3.length() > 0 ? optString3 : null, true);
                    i6++;
                    linkedHashMap = linkedHashMap2;
                }
            }
            linkedHashMap2 = linkedHashMap;
            i6++;
            linkedHashMap = linkedHashMap2;
        }
    }

    public static void c(E3.d dVar, w wVar) {
        String str = wVar.f2690d;
        String str2 = wVar.f2688b;
        int hashCode = str.hashCode();
        if (hashCode == -2131439764) {
            if (str.equals("anthropic")) {
                if (str2 != null && !AbstractC1776n.Q(str2)) {
                    s4.j.A(dVar, "x-api-key", AbstractC1776n.l0(str2).toString());
                }
                s4.j.A(dVar, "anthropic-version", "2023-06-01");
                return;
            }
            return;
        }
        if (hashCode != -1240244679) {
            if (hashCode == -1010579470 && str.equals("openai") && str2 != null && !AbstractC1776n.Q(str2)) {
                List list = I3.r.a;
                s4.j.A(dVar, "Authorization", "Bearer " + AbstractC1776n.l0(str2).toString());
                return;
            }
            return;
        }
        if (str.equals("google")) {
            if (!wVar.f2692f.equals("vertex_ai")) {
                if (str2 == null || AbstractC1776n.Q(str2)) {
                    return;
                }
                s4.j.A(dVar, "x-goog-api-key", AbstractC1776n.l0(str2).toString());
                return;
            }
            if (str2 == null || AbstractC1776n.Q(str2)) {
                return;
            }
            List list2 = I3.r.a;
            s4.j.A(dVar, "Authorization", "Bearer " + AbstractC1776n.l0(str2).toString());
        }
    }

    public static void d(E3.d dVar, Map map) {
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String obj = AbstractC1776n.l0(str).toString();
            if (!AbstractC1776n.Q(obj)) {
                dVar.f1306c.n(obj);
                s4.j.A(dVar, obj, str2);
            }
        }
    }

    public static void e(JSONObject jSONObject, ReasoningParams reasoningParams, Integer num, boolean z5) {
        kotlinx.serialization.json.c cVar;
        String str;
        if (!z5) {
            if (reasoningParams == null || (cVar = reasoningParams.f11243b) == null) {
                return;
            }
            r(jSONObject, cVar);
            return;
        }
        String str2 = null;
        if ((reasoningParams != null ? reasoningParams.a : null) != null) {
            r(jSONObject, reasoningParams.a);
        } else {
            jSONObject.put("include_reasoning", true);
        }
        if (reasoningParams != null && (str = reasoningParams.f11244c) != null) {
            str2 = AbstractC1776n.l0(str).toString();
        }
        if (str2 == null) {
            str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (num == null || str2.length() <= 0) {
            if (num == null || str2.length() != 0) {
                return;
            }
            jSONObject.put("reasoning_budget", num.intValue());
            return;
        }
        List c02 = AbstractC1776n.c0(str2, new String[]{"."});
        ArrayList arrayList = new ArrayList();
        for (Object obj : c02) {
            if (!AbstractC1776n.Q((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int C5 = Y4.l.C(arrayList);
        for (int i6 = 0; i6 < C5; i6++) {
            String str3 = (String) arrayList.get(i6);
            JSONObject optJSONObject = jSONObject.optJSONObject(str3);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                jSONObject.put(str3, optJSONObject);
            }
            jSONObject = optJSONObject;
        }
        jSONObject.put((String) Y3.m.w0(arrayList), num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01cd, code lost:
    
        if (r6 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0130, code lost:
    
        if (r4 > 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012b, code lost:
    
        if (r4 > 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012e, code lost:
    
        r4 = 1024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject f(org.json.JSONArray r18, java.lang.String r19, java.lang.String r20, float r21, float r22, java.lang.Integer r23, java.util.List r24, I2.C0233c r25) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.g.f(org.json.JSONArray, java.lang.String, java.lang.String, float, float, java.lang.Integer, java.util.List, I2.c):org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c2, code lost:
    
        if (r7 != null) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject g(org.json.JSONArray r16, java.lang.String r17, java.lang.String r18, float r19, float r20, java.lang.Integer r21, java.util.List r22, I2.C0233c r23) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.g.g(org.json.JSONArray, java.lang.String, java.lang.String, float, float, java.lang.Integer, java.util.List, I2.c):org.json.JSONObject");
    }

    /* JADX WARN: Multi-variable type inference failed */
                        public static List k(LinkedHashMap linkedHashMap) {
        Object obj;
        if (linkedHashMap.isEmpty()) {
            return Y3.v.f9812c;
        }
        Collection<C0232b> values = linkedHashMap.values();
        AbstractC1276k.e(values, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        for (C0232b c0232b : values) {
            String str = c0232b.f2621b;
            E e6 = null;
            String obj2 = str != null ? AbstractC1776n.l0(str).toString() : null;
            if (obj2 == null) {
                obj2 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            if (!AbstractC1776n.Q(obj2)) {
                String sb = c0232b.f2622c.toString();
                AbstractC1276k.e(sb, "toString(...)");
                String obj3 = AbstractC1776n.l0(sb).toString();
                boolean Q5 = AbstractC1776n.Q(obj3);
                Object r7 = Y3.w.f9813c;
                if (!Q5) {
                    try {
                        obj = u(new JSONObject(obj3));
                    } catch (Throwable th) {
                        obj = X3.a.b(th);
                    }
                    if (!(obj instanceof X3.k)) {
                        r7 = obj;
                    }
                    r7 = (Map) r7;
                }
                String str2 = c0232b.a;
                if (str2 == null) {
                    str2 = UUID.randomUUID().toString();
                    AbstractC1276k.e(str2, "toString(...)");
                }
                e6 = new E(r7, str2, obj2);
            }
            if (e6 != null) {
                arrayList.add(e6);
            }
        }
        linkedHashMap.clear();
        return arrayList;
    }

    public static String l(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("content");
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i6);
            if (optJSONObject != null && AbstractC1276k.b(optJSONObject.optString("type"), "text")) {
                String optString = optJSONObject.optString("text");
                AbstractC1276k.c(optString);
                if (!AbstractC1776n.Q(optString)) {
                    return optString;
                }
            }
        }
        return null;
    }

    public static String m(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("candidates");
        if (optJSONArray2 == null) {
            return null;
        }
        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(0);
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("content")) == null || (optJSONArray = optJSONObject.optJSONArray("parts")) == null) {
            return null;
        }
        int length = optJSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i6);
            if (optJSONObject3 != null) {
                String optString = optJSONObject3.optString("text");
                AbstractC1276k.c(optString);
                if (!AbstractC1776n.Q(optString)) {
                    return optString;
                }
            }
        }
        return null;
    }

    public static String n(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("output");
        if (optJSONArray2 == null) {
            return null;
        }
        int length = optJSONArray2.length();
        for (int i6 = 0; i6 < length; i6++) {
            JSONObject optJSONObject = optJSONArray2.optJSONObject(i6);
            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("content")) != null) {
                int length2 = optJSONArray.length();
                for (int i7 = 0; i7 < length2; i7++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i7);
                    if (optJSONObject2 != null) {
                        String optString = optJSONObject2.optString("type");
                        if (AbstractC1276k.b(optString, "output_text") || AbstractC1276k.b(optString, "text")) {
                            String optString2 = optJSONObject2.optString("text");
                            AbstractC1276k.c(optString2);
                            if (!AbstractC1776n.Q(optString2)) {
                                return optString2;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void p(JSONObject jSONObject, String str, int i6, LinkedHashMap linkedHashMap) {
        String concat;
        if (jSONObject == null) {
            return;
        }
        Object opt = jSONObject.opt("arguments");
        if (opt == null && (opt = jSONObject.opt(FlexmarkHtmlConverter.INPUT_NODE)) == null && (opt = jSONObject.opt("args")) == null) {
            opt = jSONObject.opt("partial_json");
        }
        Object obj = opt;
        String optString = jSONObject.optString(Attribute.NAME_ATTR);
        if (AbstractC1776n.Q(optString)) {
            optString = jSONObject.optString("tool_name");
        }
        if (AbstractC1776n.Q(optString)) {
            optString = jSONObject.optString("function_name");
        }
        if (obj == null) {
            AbstractC1276k.c(optString);
            if (AbstractC1776n.Q(optString)) {
                return;
            }
        }
        if (str != null && !AbstractC1776n.Q(str)) {
            concat = "openai-resp:".concat(str);
        } else if (i6 >= 0) {
            concat = B3.e.h(i6, "openai-resp:");
        } else {
            AbstractC1276k.c(optString);
            if (AbstractC1776n.Q(optString)) {
                return;
            } else {
                concat = "openai-resp:".concat(optString);
            }
        }
        String str2 = concat;
        AbstractC1276k.c(optString);
        if (AbstractC1776n.Q(optString)) {
            optString = null;
        }
        B(linkedHashMap, str2, str, optString, obj, true);
    }

    public static void q(JSONObject jSONObject, int i6, LinkedHashMap linkedHashMap) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString(Attribute.NAME_ATTR);
        if (AbstractC1776n.Q(optString2)) {
            optString2 = jSONObject.optString("tool_name");
        }
        if (AbstractC1776n.Q(optString2)) {
            optString2 = jSONObject.optString("function_name");
        }
        String str = optString2;
        Object opt = jSONObject.opt("arguments");
        if (opt == null && (opt = jSONObject.opt(FlexmarkHtmlConverter.INPUT_NODE)) == null) {
            opt = jSONObject.opt("args");
        }
        Object obj = opt;
        AbstractC1276k.c(str);
        if (AbstractC1776n.Q(str) || obj == null) {
            return;
        }
        AbstractC1276k.c(optString);
        if (AbstractC1776n.G(optString, "tool", false) || AbstractC1776n.G(optString, "function", false)) {
            String optString3 = jSONObject.optString(Attribute.ID_ATTR);
            if (AbstractC1776n.Q(optString3)) {
                optString3 = jSONObject.optString("call_id");
            }
            AbstractC1276k.c(optString3);
            String concat = !AbstractC1776n.Q(optString3) ? "openai-resp:".concat(optString3) : i6 >= 0 ? B3.e.h(i6, "openai-resp:") : "openai-resp:".concat(str);
            if (AbstractC1776n.Q(optString3)) {
                optString3 = null;
            }
            B(linkedHashMap, concat, optString3, str, obj, false);
        }
    }

    public static void r(JSONObject jSONObject, kotlinx.serialization.json.c cVar) {
        JSONObject jSONObject2 = new JSONObject(cVar.toString());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.get(next));
        }
    }

    public static w s(w wVar) {
        String obj;
        String str = wVar.f2690d;
        if (AbstractC1776n.Q(str)) {
            str = "openai";
        }
        String str2 = str;
        String str3 = wVar.f2691e;
        if (AbstractC1776n.Q(str3)) {
            str3 = "chat_completions";
        }
        String str4 = str3;
        String str5 = wVar.f2692f;
        if (AbstractC1776n.Q(str5)) {
            str5 = "ai_studio";
        }
        String str6 = str5;
        String str7 = wVar.a;
        String n02 = (str7 == null || (obj = AbstractC1776n.l0(str7).toString()) == null) ? null : AbstractC1776n.n0(obj, '/');
        if (str2.equals("google")) {
            if (str6.equals("vertex_ai")) {
                String str8 = wVar.f2693g;
                String obj2 = str8 != null ? AbstractC1776n.l0(str8).toString() : null;
                String str9 = FlexmarkHtmlConverter.DEFAULT_NODE;
                if (obj2 == null) {
                    obj2 = FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                String str10 = wVar.f2694h;
                String obj3 = str10 != null ? AbstractC1776n.l0(str10).toString() : null;
                if (obj3 != null) {
                    str9 = obj3;
                }
                if (obj2.length() > 0 && str9.length() > 0) {
                    n02 = B3.e.s(B3.e.u("https://", str9, "-aiplatform.googleapis.com/v1/projects/", obj2, "/locations/"), str9, "/publishers/google");
                }
            } else if (n02 == null || AbstractC1776n.Q(n02)) {
                n02 = "https://generativelanguage.googleapis.com/v1beta";
            }
        }
        String str11 = n02;
        String str12 = wVar.f2688b;
        String str13 = wVar.f2689c;
        String str14 = wVar.f2693g;
        String str15 = wVar.f2694h;
        boolean z5 = wVar.f2695i;
        Integer num = wVar.f2696j;
        boolean z6 = wVar.f2697k;
        Map map = wVar.f2698l;
        kotlinx.serialization.json.c cVar = wVar.f2699m;
        AbstractC1276k.f(map, "customHeaders");
        return new w(str11, str12, str13, str2, str4, str6, str14, str15, z5, num, z6, map, cVar);
    }

    public static String t(JSONObject jSONObject, String str) {
        Object opt;
        if (jSONObject == null || (opt = jSONObject.opt(str)) == null || opt.equals(JSONObject.NULL)) {
            return null;
        }
        return opt.toString();
    }

    public static LinkedHashMap u(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        AbstractC1276k.e(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, v(jSONObject.opt(next)));
        }
        return linkedHashMap;
    }

    public static Object v(Object obj) {
        if (obj == null || obj.equals(JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return u((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            arrayList.add(v(jSONArray.opt(i6)));
        }
        return arrayList;
    }

    public static m w(JSONObject jSONObject, LinkedHashMap linkedHashMap) {
        if (jSONObject.has("error")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("error");
            String optString = optJSONObject != null ? optJSONObject.optString("message") : null;
            if (optString == null) {
                optString = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            if (AbstractC1776n.Q(optString)) {
                optString = "处理出错";
            }
            return new i(optString);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("candidates");
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        boolean z5 = false;
        j jVar = null;
        for (int i6 = 0; i6 < length; i6++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i6);
            if (optJSONObject2 != null) {
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("content");
                JSONArray optJSONArray2 = optJSONObject3 != null ? optJSONObject3.optJSONArray("parts") : null;
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i7 = 0; i7 < length2; i7++) {
                        JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i7);
                        if (optJSONObject4 != null) {
                            String optString2 = optJSONObject4.optString("text");
                            AbstractC1276k.c(optString2);
                            if (!AbstractC1776n.Q(optString2)) {
                                jVar = new j(optString2);
                            }
                            JSONObject optJSONObject5 = optJSONObject4.optJSONObject("functionCall");
                            if (optJSONObject5 == null) {
                                optJSONObject5 = optJSONObject4.optJSONObject("function_call");
                            }
                            if (optJSONObject5 != null) {
                                String optString3 = optJSONObject5.optString(Attribute.NAME_ATTR);
                                Object opt = optJSONObject5.opt("args");
                                if (opt == null) {
                                    opt = optJSONObject5.opt("arguments");
                                }
                                Object obj = opt;
                                AbstractC1276k.c(optString3);
                                if (!AbstractC1776n.Q(optString3) && obj != null) {
                                    B(linkedHashMap, B3.e.k("google:", i6, i7, ":"), null, optString3, obj, false);
                                }
                            }
                        }
                    }
                }
                String optString4 = optJSONObject2.optString("finishReason");
                AbstractC1276k.c(optString4);
                if (!AbstractC1776n.Q(optString4) && !optString4.equals("null")) {
                    z5 = true;
                }
            }
        }
        if (!z5) {
            return jVar;
        }
        List k3 = k(linkedHashMap);
        return !k3.isEmpty() ? new l(k3) : h.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        if (r15 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        if (r15 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0153, code lost:
    
        if (r7 == null) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
                                                                                                                                                            /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static I2.m x(java.lang.String r19, java.util.LinkedHashMap r20) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.g.x(java.lang.String, java.util.LinkedHashMap):I2.m");
    }

    public final InterfaceC0007h A(List list, String str, String str2, float f6, float f7, Integer num, List list2, w wVar) {
        AbstractC1276k.f(str, "model");
        AbstractC1276k.f(str2, "prompt");
        AbstractC1276k.f(list2, "tools");
        AbstractC1276k.f(wVar, "requestConfig");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        return j(jSONArray, str, str2, f6, f7, num, list2, wVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r1 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject h(org.json.JSONArray r4, java.lang.String r5, float r6, float r7, java.lang.Integer r8, java.util.List r9, I2.C0233c r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.g.h(org.json.JSONArray, java.lang.String, float, float, java.lang.Integer, java.util.List, I2.c):org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0194, code lost:
    
        if (r8 != null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject i(org.json.JSONArray r20, java.lang.String r21, float r22, float r23, java.lang.Integer r24, java.util.List r25, I2.C0233c r26) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.g.i(org.json.JSONArray, java.lang.String, float, float, java.lang.Integer, java.util.List, I2.c):org.json.JSONObject");
    }

    public final InterfaceC0007h j(JSONArray jSONArray, String str, String str2, float f6, float f7, Integer num, List list, w wVar) {
        C0235e c0235e = new C0235e(this, wVar, str2, jSONArray, str, f6, f7, num, list, null);
        EnumC2050a enumC2050a = EnumC2050a.f16327c;
        C0911i c0911i = C0911i.f11057c;
        C0002c c0002c = new C0002c(c0235e, c0911i, -2, enumC2050a);
        E4.e eVar = AbstractC1898K.a;
        E4.d dVar = E4.d.f1360f;
        if (dVar.r(C1940w.f15731e) == null) {
            return dVar.equals(c0911i) ? c0002c : AbstractC0050c.b(c0002c, dVar, 0, null, 6);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dVar).toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|8|(1:(1:(5:12|13|14|15|(2:17|18)(4:20|(2:22|(2:24|(2:32|(1:34)(8:35|(1:37)(1:56)|(1:39)(1:55)|40|41|(3:43|(1:45)(1:49)|(1:47)(1:48))|50|(1:54))))(2:57|(1:59)(1:60)))(2:61|(1:63)(1:64))|27|28))(2:65|66))(3:67|68|69))(4:83|(1:208)(1:87)|(11:91|92|93|(3:95|96|97)(1:203)|98|99|100|101|(2:103|(9:105|(3:168|169|(1:171)(7:172|(3:174|175|176)(1:178)|109|(1:114)|115|116|(2:118|(14:120|(12:149|(1:151)(1:152)|124|125|(1:127)(1:145)|128|129|130|131|132|(1:134)|73)|122|123|124|125|(0)(0)|128|129|130|131|132|(0)|73)(2:153|(12:155|123|124|125|(0)(0)|128|129|130|131|132|(0)|73)(12:156|(1:162)|124|125|(0)(0)|128|129|130|131|132|(0)|73)))(14:163|164|(12:166|167|124|125|(0)(0)|128|129|130|131|132|(0)|73)|123|124|125|(0)(0)|128|129|130|131|132|(0)|73)))|107|108|109|(2:111|114)|115|116|(0)(0))(2:184|(7:186|108|109|(0)|115|116|(0)(0))(6:187|109|(0)|115|116|(0)(0))))(10:188|189|190|(6:192|109|(0)|115|116|(0)(0))|108|109|(0)|115|116|(0)(0))|15|(0)(0))|78)|70|71|(3:74|15|(0)(0))|73))|211|6|7|8|(0)(0)|70|71|(0)|73|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x004c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x045b, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x045d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0459, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027b A[Catch: all -> 0x0192, Exception -> 0x0197, TRY_ENTER, TryCatch #15 {Exception -> 0x0197, all -> 0x0192, blocks: (B:108:0x0244, B:111:0x027b, B:114:0x0284, B:123:0x0322, B:127:0x0347, B:146:0x02a2, B:149:0x02a9, B:151:0x02b3, B:152:0x02bd, B:153:0x02c4, B:156:0x02cf, B:159:0x02f4, B:162:0x02fb, B:176:0x0189, B:178:0x019b, B:184:0x01db, B:187:0x0203), top: B:101:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0347 A[Catch: all -> 0x0192, Exception -> 0x0197, TRY_ENTER, TRY_LEAVE, TryCatch #15 {Exception -> 0x0197, all -> 0x0192, blocks: (B:108:0x0244, B:111:0x027b, B:114:0x0284, B:123:0x0322, B:127:0x0347, B:146:0x02a2, B:149:0x02a9, B:151:0x02b3, B:152:0x02bd, B:153:0x02c4, B:156:0x02cf, B:159:0x02f4, B:162:0x02fb, B:176:0x0189, B:178:0x019b, B:184:0x01db, B:187:0x0203), top: B:101:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0360 A[Catch: all -> 0x0464, Exception -> 0x0468, TRY_ENTER, TryCatch #17 {Exception -> 0x0468, all -> 0x0464, blocks: (B:109:0x0277, B:115:0x0287, B:124:0x032d, B:128:0x0376, B:145:0x0360, B:164:0x031c, B:167:0x0329, B:190:0x023e, B:192:0x025b), top: B:189:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03ce A[Catch: all -> 0x004c, Exception -> 0x047b, TRY_ENTER, TryCatch #12 {Exception -> 0x047b, all -> 0x004c, blocks: (B:13:0x0042, B:15:0x03bb, B:20:0x03ce, B:29:0x03e5, B:32:0x03ed, B:34:0x03f5, B:35:0x03fb, B:37:0x0403, B:39:0x040c, B:41:0x0418, B:43:0x041e, B:50:0x042d, B:52:0x0435, B:57:0x043e, B:60:0x0445, B:61:0x044a, B:64:0x0451, B:68:0x005d), top: B:8:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006b  */
                                                                    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r35, java.lang.String r36, I2.w r37, java.lang.String r38, int r39, d4.c r40) {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.g.o(java.lang.String, java.lang.String, I2.w, java.lang.String, int, d4.c):java.lang.Object");
    }

    public final C0233c y(w wVar, String str, boolean z5) {
        ReasoningRule d6 = this.a.d(str, wVar.a, wVar.f2690d, wVar.f2689c);
        boolean z6 = false;
        boolean z7 = d6.f11250f == D2.b.f1268f;
        if (z5 && !z7 && (wVar.f2695i || AbstractC1276k.b(d6.f11254j, Boolean.TRUE))) {
            z6 = true;
        }
        Integer num = wVar.f2696j;
        Integer num2 = d6.f11253i;
        Integer num3 = null;
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (num2 != null) {
                    if (num2.intValue() <= 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        num3 = Integer.valueOf(Math.min(intValue, num2.intValue()));
                    }
                }
                num3 = num;
            }
        }
        return new C0233c(d6, z6, num3, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC0007h z(String str, List list, String str2, String str3, float f6, float f7, Integer num, List list2, List list3, w wVar) {
        String str4;
        String obj;
        AbstractC1276k.f(str, "question");
        AbstractC1276k.f(list, "images");
        AbstractC1276k.f(str2, "model");
        AbstractC1276k.f(str3, "prompt");
        AbstractC1276k.f(list3, "tools");
        AbstractC1276k.f(wVar, "requestConfig");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list2.iterator();
        while (true) {
            String str5 = "user";
            if (!it.hasNext()) {
                break;
            }
            Map map = (Map) it.next();
            Object obj2 = map.get("role");
            if (obj2 != null && (obj = obj2.toString()) != null) {
                str5 = obj;
            }
            Object obj3 = map.get("content");
            Y3.v vVar = null;
            String obj4 = obj3 != null ? obj3.toString() : null;
            if (obj4 == null) {
                obj4 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            Object obj5 = map.get("images");
            List list4 = obj5 instanceof List ? (List) obj5 : null;
            if (list4 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list4) {
                    if (obj6 == null || (str4 = obj6.toString()) == null || AbstractC1776n.Q(str4)) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        arrayList.add(str4);
                    }
                }
                vVar = arrayList;
            }
            if (vVar == null) {
                vVar = Y3.v.f9812c;
            }
            jSONArray.put(s4.j.i(str5, obj4, vVar));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj7 : list) {
            if (obj7 != null) {
                arrayList2.add(obj7);
            }
        }
        jSONArray.put(s4.j.i("user", str, arrayList2));
        return j(jSONArray, str2, str3, f6, f7, num, list3, wVar);
    }
}
