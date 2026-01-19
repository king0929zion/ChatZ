package I2;

import j1.AbstractC1135a;
import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class w {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2688b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2689c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2690d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2691e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2692f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2693g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2694h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2695i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f2696j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2697k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f2698l;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.serialization.json.c f2699m;

    public w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z5, Integer num, boolean z6, Map map, kotlinx.serialization.json.c cVar) {
        AbstractC1276k.f(map, "customHeaders");
        this.a = str;
        this.f2688b = str2;
        this.f2689c = str3;
        this.f2690d = str4;
        this.f2691e = str5;
        this.f2692f = str6;
        this.f2693g = str7;
        this.f2694h = str8;
        this.f2695i = z5;
        this.f2696j = num;
        this.f2697k = z6;
        this.f2698l = map;
        this.f2699m = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AbstractC1276k.b(this.a, wVar.a) && AbstractC1276k.b(this.f2688b, wVar.f2688b) && AbstractC1276k.b(this.f2689c, wVar.f2689c) && AbstractC1276k.b(this.f2690d, wVar.f2690d) && AbstractC1276k.b(this.f2691e, wVar.f2691e) && AbstractC1276k.b(this.f2692f, wVar.f2692f) && AbstractC1276k.b(this.f2693g, wVar.f2693g) && AbstractC1276k.b(this.f2694h, wVar.f2694h) && this.f2695i == wVar.f2695i && AbstractC1276k.b(this.f2696j, wVar.f2696j) && this.f2697k == wVar.f2697k && AbstractC1276k.b(this.f2698l, wVar.f2698l) && AbstractC1276k.b(this.f2699m, wVar.f2699m);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2688b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2689c;
        int e6 = B3.e.e(B3.e.e(B3.e.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f2690d), 31, this.f2691e), 31, this.f2692f);
        String str4 = this.f2693g;
        int hashCode3 = (e6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2694h;
        int d6 = AbstractC1135a.d((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f2695i);
        Integer num = this.f2696j;
        int hashCode4 = (this.f2698l.hashCode() + AbstractC1135a.d((d6 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f2697k)) * 31;
        kotlinx.serialization.json.c cVar = this.f2699m;
        return hashCode4 + (cVar != null ? cVar.f12633c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u5 = B3.e.u("LlmRequestConfig(baseUrl=", this.a, ", apiKey=", this.f2688b, ", providerType=");
        B3.e.z(u5, this.f2689c, ", apiSchema=", this.f2690d, ", openAiApiMode=");
        B3.e.z(u5, this.f2691e, ", googleApiMode=", this.f2692f, ", googleProjectId=");
        B3.e.z(u5, this.f2693g, ", googleLocation=", this.f2694h, ", reasoningEnabled=");
        u5.append(this.f2695i);
        u5.append(", reasoningBudgetTokens=");
        u5.append(this.f2696j);
        u5.append(", appendReasoningOnToolCall=");
        u5.append(this.f2697k);
        u5.append(", customHeaders=");
        u5.append(this.f2698l);
        u5.append(", customBody=");
        u5.append(this.f2699m);
        u5.append(")");
        return u5.toString();
    }
}
