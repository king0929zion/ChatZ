package I1;

import A4.Q;
import A4.W;
import A4.g0;
import android.os.Bundle;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.Z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class m {
    public final F2.h a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f2553b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f2554c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2555d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f2556e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f2557f;

    /* renamed from: g, reason: collision with root package name */
    public final H f2558g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B f2559h;

    public m(B b5, H h3) {
        AbstractC1276k.f(h3, "navigator");
        this.f2559h = b5;
        this.a = new F2.h(5);
        g0 b6 = W.b(Y3.v.f9812c);
        this.f2553b = b6;
        g0 b7 = W.b(Y3.x.f9814c);
        this.f2554c = b7;
        this.f2556e = new Q(b6);
        this.f2557f = new Q(b7);
        this.f2558g = h3;
    }

    public final void a(j jVar) {
        AbstractC1276k.f(jVar, "backStackEntry");
        synchronized (this.a) {
            g0 g0Var = this.f2553b;
            ArrayList A02 = Y3.m.A0((Collection) g0Var.getValue(), jVar);
            g0Var.getClass();
            g0Var.l(null, A02);
        }
    }

    public final j b(v vVar, Bundle bundle) {
        L1.i iVar = this.f2559h.f2518b;
        iVar.getClass();
        return F2.h.f(iVar.a.f2519c, vVar, bundle, iVar.h(), iVar.f3028o);
    }

    public final void c(j jVar) {
        o oVar;
        AbstractC1276k.f(jVar, "entry");
        L1.i iVar = this.f2559h.f2518b;
        g0 g0Var = iVar.f3021h;
        String str = jVar.f2548i;
        LinkedHashMap linkedHashMap = iVar.f3036w;
        boolean b5 = AbstractC1276k.b(linkedHashMap.get(jVar), Boolean.TRUE);
        g0 g0Var2 = this.f2554c;
        g0Var2.l(null, Y3.F.n0((Set) g0Var2.getValue(), jVar));
        linkedHashMap.remove(jVar);
        Y3.j jVar2 = iVar.f3019f;
        if (jVar2.contains(jVar)) {
            if (this.f2555d) {
                return;
            }
            iVar.r();
            g0 g0Var3 = iVar.f3020g;
            ArrayList K0 = Y3.m.K0(jVar2);
            g0Var3.getClass();
            g0Var3.l(null, K0);
            ArrayList o5 = iVar.o();
            g0Var.getClass();
            g0Var.l(null, o5);
            return;
        }
        iVar.q(jVar);
        if (jVar.f2550k.f2998j.f10884g.compareTo(EnumC0842p.f10877f) >= 0) {
            jVar.b(EnumC0842p.f10875c);
        }
        if (!jVar2.isEmpty()) {
            Iterator it = jVar2.iterator();
            while (it.hasNext()) {
                if (AbstractC1276k.b(((j) it.next()).f2548i, str)) {
                    break;
                }
            }
        }
        if (!b5 && (oVar = iVar.f3028o) != null) {
            AbstractC1276k.f(str, "backStackEntryId");
            Z z5 = (Z) oVar.f2562b.remove(str);
            if (z5 != null) {
                z5.a();
            }
        }
        iVar.r();
        ArrayList o6 = iVar.o();
        g0Var.getClass();
        g0Var.l(null, o6);
    }

    public final void d(j jVar, boolean z5) {
        L1.i iVar = this.f2559h.f2518b;
        D.r rVar = new D.r(this, jVar, z5);
        iVar.getClass();
        H b5 = iVar.f3032s.b(jVar.f2544e.f2591c);
        iVar.f3036w.put(jVar, Boolean.valueOf(z5));
        if (!b5.equals(this.f2558g)) {
            Object obj = iVar.f3033t.get(b5);
            AbstractC1276k.c(obj);
            ((m) obj).d(jVar, z5);
            return;
        }
        L1.g gVar = iVar.f3035v;
        if (gVar != null) {
            gVar.f(jVar);
            rVar.b();
            return;
        }
        Y3.j jVar2 = iVar.f3019f;
        int indexOf = jVar2.indexOf(jVar);
        if (indexOf < 0) {
            AbstractC1276k.f("Ignoring pop of " + jVar + " as it was not found on the current back stack", "message");
            return;
        }
        int i6 = indexOf + 1;
        if (i6 != jVar2.f9805f) {
            iVar.l(((j) jVar2.get(i6)).f2544e.f2592e.a, true, false);
        }
        L1.i.n(iVar, jVar);
        rVar.b();
        iVar.f3015b.b();
        iVar.b();
    }

    public final void e(j jVar, boolean z5) {
        Object obj;
        g0 g0Var = this.f2554c;
        Iterable iterable = (Iterable) g0Var.getValue();
        boolean z6 = iterable instanceof Collection;
        Q q3 = this.f2556e;
        if (!z6 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((j) it.next()) == jVar) {
                    Iterable iterable2 = (Iterable) q3.f201c.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((j) it2.next()) == jVar) {
                        }
                    }
                    return;
                }
            }
        }
        g0Var.l(null, Y3.F.q0((Set) g0Var.getValue(), jVar));
        g0 g0Var2 = q3.f201c;
        g0 g0Var3 = q3.f201c;
        List list = (List) g0Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            j jVar2 = (j) obj;
            if (!AbstractC1276k.b(jVar2, jVar) && ((List) g0Var3.getValue()).lastIndexOf(jVar2) < ((List) g0Var3.getValue()).lastIndexOf(jVar)) {
                break;
            }
        }
        j jVar3 = (j) obj;
        if (jVar3 != null) {
            g0Var.l(null, Y3.F.q0((Set) g0Var.getValue(), jVar3));
        }
        d(jVar, z5);
    }

    public final void f(j jVar) {
        AbstractC1276k.f(jVar, "backStackEntry");
        L1.i iVar = this.f2559h.f2518b;
        iVar.getClass();
        H b5 = iVar.f3032s.b(jVar.f2544e.f2591c);
        if (!b5.equals(this.f2558g)) {
            Object obj = iVar.f3033t.get(b5);
            if (obj == null) {
                throw new IllegalStateException(B3.e.s(new StringBuilder("NavigatorBackStack for "), jVar.f2544e.f2591c, " should already be created").toString());
            }
            ((m) obj).f(jVar);
            return;
        }
        l4.c cVar = iVar.f3034u;
        if (cVar != null) {
            cVar.f(jVar);
            a(jVar);
        } else {
            AbstractC1276k.f("Ignoring add of destination " + jVar.f2544e + " outside of the call to navigate(). ", "message");
        }
    }
}
