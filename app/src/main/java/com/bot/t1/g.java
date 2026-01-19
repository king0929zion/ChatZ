package T1;

import X3.y;
import Y3.m;
import java.util.ArrayList;
import m4.AbstractC1276k;
import u4.o;

/* loaded from: classes.dex */
public final class g {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8359b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8360c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8361d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8362e;

    public g(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC1276k.f(str, "referenceTable");
        AbstractC1276k.f(str2, "onDelete");
        AbstractC1276k.f(str3, "onUpdate");
        this.a = str;
        this.f8359b = str2;
        this.f8360c = str3;
        this.f8361d = arrayList;
        this.f8362e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC1276k.b(this.a, gVar.a) && AbstractC1276k.b(this.f8359b, gVar.f8359b) && AbstractC1276k.b(this.f8360c, gVar.f8360c) && this.f8361d.equals(gVar.f8361d)) {
            return this.f8362e.equals(gVar.f8362e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8362e.hashCode() + ((this.f8361d.hashCode() + B3.e.e(B3.e.e(this.a.hashCode() * 31, 31, this.f8359b), 31, this.f8360c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.f8359b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.f8360c);
        sb.append("',\n            |   columnNames = {");
        o.p(m.v0(m.F0(this.f8361d), ",", null, null, null, 62));
        o.p("},");
        y yVar = y.a;
        sb.append(yVar);
        sb.append("\n            |   referenceColumnNames = {");
        o.p(m.v0(m.F0(this.f8362e), ",", null, null, null, 62));
        o.p(" }");
        sb.append(yVar);
        sb.append("\n            |}\n        ");
        return o.p(o.r(sb.toString()));
    }
}
