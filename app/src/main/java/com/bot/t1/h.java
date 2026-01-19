package T1;

import X3.y;
import Y3.m;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1276k;
import u4.o;
import u4.u;

/* loaded from: classes.dex */
public final class h {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8363b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8364c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8365d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public h(String str, boolean z5, List list, List list2) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        this.a = str;
        this.f8363b = z5;
        this.f8364c = list;
        this.f8365d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                list2.add("ASC");
            }
        }
        this.f8365d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            boolean z5 = hVar.f8363b;
            String str = hVar.a;
            if (this.f8363b == z5 && this.f8364c.equals(hVar.f8364c) && AbstractC1276k.b(this.f8365d, hVar.f8365d)) {
                String str2 = this.a;
                return u.D(str2, "index_", false) ? u.D(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.f8365d.hashCode() + AbstractC1135a.e(this.f8364c, (((u.D(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f8363b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.f8363b);
        sb.append("',\n            |   columns = {");
        o.p(m.v0(this.f8364c, ",", null, null, null, 62));
        o.p("},");
        y yVar = y.a;
        sb.append(yVar);
        sb.append("\n            |   orders = {");
        o.p(m.v0(this.f8365d, ",", null, null, null, 62));
        o.p(" }");
        sb.append(yVar);
        sb.append("\n            |}\n        ");
        return o.p(o.r(sb.toString()));
    }
}
