package N3;

import F0.B;
import T.C0594a;
import T.C0616l;
import T.M;
import com.vladsch.flexmark.util.html.Attribute;
import g0.C1014b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import n.y0;

/* loaded from: classes.dex */
public abstract class s implements r {
    public final Object a;

    public s(int i6) {
        switch (i6) {
            case 1:
                this.a = new ArrayList();
                return;
            case 2:
                this.a = T.r.A(Boolean.FALSE);
                return;
            default:
                this.a = new h();
                return;
        }
    }

    @Override // N3.r
    public Set a() {
        Set entrySet = ((Map) this.a).entrySet();
        AbstractC1276k.f(entrySet, "<this>");
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        AbstractC1276k.e(unmodifiableSet, "unmodifiableSet(this)");
        return unmodifiableSet;
    }

    @Override // N3.r
    public boolean b() {
        return true;
    }

    @Override // N3.r
    public void c(String str, List list) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        AbstractC1276k.f(list, "values");
        List i6 = i(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            s(str2);
            i6.add(str2);
        }
    }

    @Override // N3.r
    public void clear() {
        ((Map) this.a).clear();
    }

    @Override // N3.r
    public boolean contains(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        return ((Map) this.a).containsKey(str);
    }

    @Override // N3.r
    public List d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        return (List) ((Map) this.a).get(str);
    }

    public void e(String str, String str2) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        AbstractC1276k.f(str2, "value");
        s(str2);
        i(str).add(str2);
    }

    public void f(q qVar) {
        AbstractC1276k.f(qVar, "stringValues");
        qVar.c(new B(this, 4));
    }

    public boolean g(int i6, M m3, Object obj) {
        ArrayList arrayList = m3.a;
        if (arrayList == null) {
            h(i6, m3, null);
            return true;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = arrayList.get(i7);
            if (obj2 instanceof C0594a) {
                if (AbstractC1276k.b(obj2, obj)) {
                    h(0, m3, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof M)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (g(i6, (M) obj2, obj)) {
                    h(0, m3, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public void h(int i6, M m3, Object obj) {
        ((ArrayList) this.a).add(new C1014b(i6, null, null));
    }

    public List i(String str) {
        Map map = (Map) this.a;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        r(str);
        map.put(str, arrayList);
        return arrayList;
    }

    @Override // N3.r
    public boolean isEmpty() {
        return ((Map) this.a).isEmpty();
    }

    public String j(String str) {
        List d6 = d(str);
        if (d6 != null) {
            return (String) Y3.m.q0(d6);
        }
        return null;
    }

    public abstract Object k();

    public abstract Object l();

    public void m(int i6, Object obj, M m3, Object obj2) {
        if (AbstractC1276k.b(obj, C0616l.a)) {
            h(i6, m3, null);
        }
    }

    public void n(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        ((Map) this.a).remove(str);
    }

    @Override // N3.r
    public Set names() {
        return ((Map) this.a).keySet();
    }

    public abstract void o(Object obj);

    public abstract void p(y0 y0Var);

    public abstract void q();

    public void r(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
    }

    public void s(String str) {
        AbstractC1276k.f(str, "value");
    }
}
