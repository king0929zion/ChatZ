package T1;

import B3.q;
import Y3.m;
import Y3.v;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import u4.o;

/* loaded from: classes.dex */
public final class i {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8366b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f8367c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f8368d;

    public i(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        AbstractC1276k.f(abstractSet, "foreignKeys");
        this.a = str;
        this.f8366b = map;
        this.f8367c = abstractSet;
        this.f8368d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.a.equals(iVar.a) || !this.f8366b.equals(iVar.f8366b) || !AbstractC1276k.b(this.f8367c, iVar.f8367c)) {
            return false;
        }
        Set set2 = this.f8368d;
        if (set2 == null || (set = iVar.f8368d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f8367c.hashCode() + ((this.f8366b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(h5.e.V(m.G0(this.f8366b.values(), new q(5))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(h5.e.V(this.f8367c));
        sb.append("\n            |    indices = {");
        Set set = this.f8368d;
        sb.append(h5.e.V(set != null ? m.G0(set, new q(6)) : v.f9812c));
        sb.append("\n            |}\n        ");
        return o.r(sb.toString());
    }
}
