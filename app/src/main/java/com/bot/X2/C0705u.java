package X2;

import b4.InterfaceC0905c;
import com.bot.core.model.MessageAttachment;
import com.bot.core.model.MessageInfo;
import com.bot.core.model.ToolCallInfo;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.JsonNull;
import m4.AbstractC1276k;

/* renamed from: X2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705u extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ List f9369h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Map f9370i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f9371j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9372k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0705u(L l3, String str, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f9371j = l3;
        this.f9372k = str;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0705u c0705u = new C0705u(this.f9371j, this.f9372k, (InterfaceC0905c) obj3);
        c0705u.f9369h = (List) obj;
        c0705u.f9370i = (Map) obj2;
        return c0705u.r(X3.y.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v9, types: [Y3.v] */
    @Override // d4.a
    public final Object r(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        Map map;
        List list = this.f9369h;
        Map map2 = this.f9370i;
        X3.a.e(obj);
        AbstractC1276k.f(list, "<this>");
        int i6 = 10;
        ArrayList arrayList3 = new ArrayList(Y3.n.Z(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MessageInfo messageInfo = (MessageInfo) it2.next();
            AbstractC1276k.f(messageInfo, "<this>");
            List list2 = messageInfo.f11233g;
            String lowerCase = messageInfo.f11228b.toLowerCase(Locale.ROOT);
            AbstractC1276k.e(lowerCase, "toLowerCase(...)");
            int hashCode = lowerCase.hashCode();
            L2.d dVar = L2.d.f3069c;
            if (hashCode != -887328209) {
                if (hashCode == 3599307) {
                    lowerCase.equals("user");
                } else if (hashCode == 1429828318 && lowerCase.equals("assistant")) {
                    dVar = L2.d.f3070e;
                }
            } else if (lowerCase.equals("system")) {
                dVar = L2.d.f3071f;
            }
            L2.d dVar2 = dVar;
            List list3 = messageInfo.f11230d;
            List list4 = Y3.v.f9812c;
            List list5 = list3 == null ? list4 : list3;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (AbstractC1276k.b(((MessageAttachment) obj2).a, "file")) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayList4 = arrayList == null ? list4 : arrayList;
            String str = messageInfo.a;
            String str2 = messageInfo.f11229c;
            if (list2 != null) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : list2) {
                    if (AbstractC1276k.b(((MessageAttachment) obj3).a, "image")) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList(Y3.n.Z(arrayList5, i6));
                int size = arrayList5.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj4 = arrayList5.get(i7);
                    i7++;
                    arrayList6.add(((MessageAttachment) obj4).f11223b);
                }
                arrayList2 = arrayList6;
            } else {
                arrayList2 = list4;
            }
            Long l3 = messageInfo.f11231e;
            List<ToolCallInfo> list6 = messageInfo.f11232f;
            if (list6 != null) {
                list4 = new ArrayList(Y3.n.Z(list6, i6));
                for (ToolCallInfo toolCallInfo : list6) {
                    kotlinx.serialization.json.b bVar = toolCallInfo.f11258c;
                    String a = bVar != null ? bVar instanceof JsonNull ? "null" : bVar instanceof kotlinx.serialization.json.d ? ((kotlinx.serialization.json.d) bVar).a() : bVar.toString() : null;
                    String str3 = toolCallInfo.a;
                    Map map3 = toolCallInfo.f11257b;
                    if (map3 != null) {
                        it = it2;
                        map = new LinkedHashMap(Y3.C.H(map3.size()));
                        for (Iterator it3 = map3.entrySet().iterator(); it3.hasNext(); it3 = it3) {
                            Map.Entry entry = (Map.Entry) it3.next();
                            map.put(entry.getKey(), h5.e.m0((kotlinx.serialization.json.b) entry.getValue()));
                        }
                    } else {
                        it = it2;
                        map = Y3.w.f9813c;
                    }
                    Map map4 = map;
                    boolean z5 = toolCallInfo.f11259d;
                    list4.add(new L2.h(null, str3, map4, z5 ? L2.i.f3094f : L2.i.f3095g, z5 ? a : null, !z5 ? a : null, 193));
                    it2 = it;
                }
            }
            arrayList3.add(new L2.c(str, dVar2, str2, arrayList2, arrayList4, list5, list4, L2.e.f3076g, L2.f.f3081c, null, l3, null));
            it2 = it2;
            i6 = 10;
        }
        M2.A a6 = (M2.A) map2.get(this.f9372k);
        if (a6 != null) {
            List list7 = a6.f3271d;
            List list8 = a6.f3270c;
            String str4 = a6.f3269b;
            int size2 = arrayList3.size();
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= size2) {
                    i8 = -1;
                    break;
                }
                Object obj5 = arrayList3.get(i9);
                i9++;
                if (AbstractC1276k.b(((L2.c) obj5).a, a6.a)) {
                    break;
                }
                i8++;
            }
            if (i8 != -1) {
                L2.c cVar = (L2.c) arrayList3.get(i8);
                if (str4.length() <= 0) {
                    str4 = cVar.f3059c;
                }
                String str5 = str4;
                if (list8.isEmpty()) {
                    list8 = cVar.f3062f;
                }
                List list9 = list8;
                if (list7.isEmpty()) {
                    list7 = cVar.f3063g;
                }
                List list10 = list7;
                L2.e eVar = a6.f3272e;
                L2.f fVar = a6.f3273f;
                Long l5 = a6.f3274g;
                if (l5 == null) {
                    l5 = cVar.f3066j;
                }
                Long l6 = l5;
                Long l7 = a6.f3275h;
                if (l7 == null) {
                    l7 = cVar.f3067k;
                }
                String str6 = a6.f3276i;
                String str7 = cVar.a;
                L2.d dVar3 = cVar.f3058b;
                List list11 = cVar.f3060d;
                List list12 = cVar.f3061e;
                AbstractC1276k.f(str7, Attribute.ID_ATTR);
                AbstractC1276k.f(str5, "content");
                AbstractC1276k.f(list11, "images");
                AbstractC1276k.f(list12, "files");
                AbstractC1276k.f(list9, "reasoningContent");
                AbstractC1276k.f(list10, "toolCalls");
                AbstractC1276k.f(eVar, "status");
                AbstractC1276k.f(fVar, "reasoningPhase");
                L2.c cVar2 = new L2.c(str7, dVar3, str5, list11, list12, list9, list10, eVar, fVar, l6, l7, str6);
                ArrayList K0 = Y3.m.K0(arrayList3);
                K0.set(i8, cVar2);
                return K0;
            }
        }
        return arrayList3;
    }
}
