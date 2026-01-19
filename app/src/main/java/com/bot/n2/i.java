package N2;

import com.vladsch.flexmark.util.html.Attribute;
import m4.AbstractC1276k;
import org.json.JSONArray;
import org.json.JSONObject;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3828c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONArray f3829e;

    public /* synthetic */ i(JSONArray jSONArray, int i6) {
        this.f3828c = i6;
        this.f3829e = jSONArray;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f3828c;
        int intValue = ((Integer) obj).intValue();
        switch (i6) {
            case 0:
                JSONObject optJSONObject = this.f3829e.optJSONObject(intValue);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString(Attribute.TITLE_ATTR);
                    AbstractC1276k.e(optString, "optString(...)");
                    String obj2 = AbstractC1776n.l0(optString).toString();
                    String optString2 = optJSONObject.optString("url");
                    AbstractC1276k.e(optString2, "optString(...)");
                    String obj3 = AbstractC1776n.l0(optString2).toString();
                    String optString3 = optJSONObject.optString("content");
                    AbstractC1276k.e(optString3, "optString(...)");
                    String obj4 = AbstractC1776n.l0(optString3).toString();
                    if (!AbstractC1776n.Q(obj2) || !AbstractC1776n.Q(obj3) || !AbstractC1776n.Q(obj4)) {
                        return new j(obj2, obj3, obj4);
                    }
                }
                return null;
            case 1:
                JSONObject optJSONObject2 = this.f3829e.optJSONObject(intValue);
                if (optJSONObject2 != null) {
                    String optString4 = optJSONObject2.optString(Attribute.TITLE_ATTR);
                    AbstractC1276k.e(optString4, "optString(...)");
                    String obj5 = AbstractC1776n.l0(optString4).toString();
                    String optString5 = optJSONObject2.optString("link");
                    AbstractC1276k.e(optString5, "optString(...)");
                    String obj6 = AbstractC1776n.l0(optString5).toString();
                    String optString6 = optJSONObject2.optString("snippet");
                    AbstractC1276k.e(optString6, "optString(...)");
                    String obj7 = AbstractC1776n.l0(optString6).toString();
                    if (!AbstractC1776n.Q(obj5) || !AbstractC1776n.Q(obj6) || !AbstractC1776n.Q(obj7)) {
                        return new j(obj5, obj6, obj7);
                    }
                }
                return null;
            default:
                JSONObject optJSONObject3 = this.f3829e.optJSONObject(intValue);
                if (optJSONObject3 != null) {
                    String optString7 = optJSONObject3.optString(Attribute.TITLE_ATTR);
                    AbstractC1276k.e(optString7, "optString(...)");
                    String obj8 = AbstractC1776n.l0(optString7).toString();
                    String optString8 = optJSONObject3.optString("url");
                    AbstractC1276k.e(optString8, "optString(...)");
                    String obj9 = AbstractC1776n.l0(optString8).toString();
                    String optString9 = optJSONObject3.optString("text");
                    AbstractC1276k.e(optString9, "optString(...)");
                    String obj10 = AbstractC1776n.l0(optString9).toString();
                    if (AbstractC1776n.Q(obj10)) {
                        String optString10 = optJSONObject3.optString("snippet");
                        AbstractC1276k.e(optString10, "optString(...)");
                        obj10 = AbstractC1776n.l0(optString10).toString();
                    }
                    if (!AbstractC1776n.Q(obj8) || !AbstractC1776n.Q(obj9) || !AbstractC1776n.Q(obj10)) {
                        return new j(obj8, obj9, obj10);
                    }
                }
                return null;
        }
    }
}
