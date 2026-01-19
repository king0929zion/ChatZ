package x3;

import F0.B;
import I3.m;
import Q4.n;
import Y4.l;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import m4.AbstractC1276k;

/* renamed from: x3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1885i implements m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f15635c;

    public C1885i(n nVar) {
        this.f15635c = nVar;
    }

    @Override // N3.q
    public final Set a() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        AbstractC1276k.e(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        n nVar = this.f15635c;
        int size = nVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            String b5 = nVar.b(i6);
            Locale locale = Locale.US;
            AbstractC1276k.e(locale, "US");
            String lowerCase = b5.toLowerCase(locale);
            AbstractC1276k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(nVar.d(i6));
        }
        return treeMap.entrySet();
    }

    @Override // N3.q
    public final boolean b() {
        return true;
    }

    @Override // N3.q
    public final void c(l4.e eVar) {
        l.A(this, (B) eVar);
    }

    @Override // N3.q
    public final String d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        List e6 = this.f15635c.e(str);
        if (e6.isEmpty()) {
            e6 = null;
        }
        if (e6 != null) {
            return (String) Y3.m.q0(e6);
        }
        return null;
    }
}
