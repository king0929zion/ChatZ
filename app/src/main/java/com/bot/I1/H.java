package I1;

import D.C0056a;
import java.util.List;
import java.util.ListIterator;
import m4.AbstractC1276k;
import p.O0;

/* loaded from: classes.dex */
public abstract class H {
    public m a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2536b;

    public abstract v a();

    public final m b() {
        m mVar = this.a;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public v c(v vVar) {
        return vVar;
    }

    public void d(List list, D d6) {
        t4.e eVar = new t4.e(new t4.f(new t4.o(Y3.m.h0(list), new C0056a(4, this, d6), 1), false, new O0(10)));
        while (eVar.hasNext()) {
            b().f((j) eVar.next());
        }
    }

    public void e(j jVar, boolean z5) {
        List list = (List) b().f2556e.f201c.getValue();
        if (!list.contains(jVar)) {
            throw new IllegalStateException(("popBackStack was called with " + jVar + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        j jVar2 = null;
        while (f()) {
            jVar2 = (j) listIterator.previous();
            if (AbstractC1276k.b(jVar2, jVar)) {
                break;
            }
        }
        if (jVar2 != null) {
            b().d(jVar2, z5);
        }
    }

    public boolean f() {
        return true;
    }
}
