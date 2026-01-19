package J1;

import A4.Q;
import A4.g0;
import I1.G;
import I1.H;
import T.C0607g0;
import Y3.F;
import androidx.lifecycle.EnumC0842p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m4.AbstractC1276k;

@G("composable")
/* loaded from: classes.dex */
public final class i extends H {

    /* renamed from: c, reason: collision with root package name */
    public final C0607g0 f2833c = T.r.A(Boolean.FALSE);

    @Override // I1.H
    public final I1.v a() {
        return new h(this, AbstractC0248c.a);
    }

    @Override // I1.H
    public final void d(List list, I1.D d6) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I1.j jVar = (I1.j) it.next();
            I1.m b5 = b();
            Q q3 = b5.f2556e;
            AbstractC1276k.f(jVar, "backStackEntry");
            g0 g0Var = b5.f2554c;
            Iterable iterable = (Iterable) g0Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((I1.j) it2.next()) == jVar) {
                        Iterable iterable2 = (Iterable) q3.f201c.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((I1.j) it3.next()) == jVar) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            I1.j jVar2 = (I1.j) Y3.m.x0((List) q3.f201c.getValue());
            if (jVar2 != null) {
                g0Var.l(null, F.q0((Set) g0Var.getValue(), jVar2));
            }
            g0Var.l(null, F.q0((Set) g0Var.getValue(), jVar));
            b5.f(jVar);
        }
        this.f2833c.setValue(Boolean.FALSE);
    }

    @Override // I1.H
    public final void e(I1.j jVar, boolean z5) {
        b().e(jVar, z5);
        this.f2833c.setValue(Boolean.TRUE);
    }

    public final void g(I1.j jVar) {
        I1.m b5 = b();
        AbstractC1276k.f(jVar, "entry");
        g0 g0Var = b5.f2554c;
        g0Var.l(null, F.q0((Set) g0Var.getValue(), jVar));
        L1.i iVar = b5.f2559h.f2518b;
        iVar.getClass();
        if (!iVar.f3019f.contains(jVar)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        jVar.b(EnumC0842p.f10878g);
    }
}
