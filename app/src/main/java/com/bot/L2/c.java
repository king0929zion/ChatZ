package L2;

import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3058b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3059c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3060d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3061e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3062f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3063g;

    /* renamed from: h, reason: collision with root package name */
    public final e f3064h;

    /* renamed from: i, reason: collision with root package name */
    public final f f3065i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f3066j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f3067k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3068l;

    public c(String str, d dVar, String str2, List list, List list2, List list3, List list4, e eVar, f fVar, Long l3, Long l5, String str3) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, "content");
        AbstractC1276k.f(list, "images");
        AbstractC1276k.f(list2, "files");
        AbstractC1276k.f(list3, "reasoningContent");
        AbstractC1276k.f(list4, "toolCalls");
        AbstractC1276k.f(eVar, "status");
        AbstractC1276k.f(fVar, "reasoningPhase");
        this.a = str;
        this.f3058b = dVar;
        this.f3059c = str2;
        this.f3060d = list;
        this.f3061e = list2;
        this.f3062f = list3;
        this.f3063g = list4;
        this.f3064h = eVar;
        this.f3065i = fVar;
        this.f3066j = l3;
        this.f3067k = l5;
        this.f3068l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC1276k.b(this.a, cVar.a) && this.f3058b == cVar.f3058b && AbstractC1276k.b(this.f3059c, cVar.f3059c) && AbstractC1276k.b(this.f3060d, cVar.f3060d) && AbstractC1276k.b(this.f3061e, cVar.f3061e) && AbstractC1276k.b(this.f3062f, cVar.f3062f) && AbstractC1276k.b(this.f3063g, cVar.f3063g) && this.f3064h == cVar.f3064h && this.f3065i == cVar.f3065i && AbstractC1276k.b(this.f3066j, cVar.f3066j) && AbstractC1276k.b(this.f3067k, cVar.f3067k) && AbstractC1276k.b(this.f3068l, cVar.f3068l);
    }

    public final int hashCode() {
        int hashCode = (this.f3065i.hashCode() + ((this.f3064h.hashCode() + AbstractC1135a.e(this.f3063g, AbstractC1135a.e(this.f3062f, AbstractC1135a.e(this.f3061e, AbstractC1135a.e(this.f3060d, B3.e.e((this.f3058b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.f3059c), 31), 31), 31), 31)) * 31)) * 31;
        Long l3 = this.f3066j;
        int hashCode2 = (hashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l5 = this.f3067k;
        int hashCode3 = (hashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.f3068l;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Message(id=" + this.a + ", role=" + this.f3058b + ", content=" + this.f3059c + ", images=" + this.f3060d + ", files=" + this.f3061e + ", reasoningContent=" + this.f3062f + ", toolCalls=" + this.f3063g + ", status=" + this.f3064h + ", reasoningPhase=" + this.f3065i + ", reasoningStartAtMs=" + this.f3066j + ", reasoningDurationMs=" + this.f3067k + ", errorMessage=" + this.f3068l + ")";
    }
}
