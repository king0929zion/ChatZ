package J1;

import I1.G;
import I1.H;
import b0.C0873f;
import java.util.Iterator;
import java.util.List;

@G("dialog")
/* loaded from: classes.dex */
public final class r extends H {
    @Override // I1.H
    public final I1.v a() {
        C0873f c0873f = e.a;
        return new q(this);
    }

    @Override // I1.H
    public final void d(List list, I1.D d6) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((I1.j) it.next());
        }
    }

    @Override // I1.H
    public final void e(I1.j jVar, boolean z5) {
        b().e(jVar, z5);
        int s02 = Y3.m.s0((Iterable) b().f2557f.f201c.getValue(), jVar);
        int i6 = 0;
        for (Object obj : (Iterable) b().f2557f.f201c.getValue()) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                Y4.l.U();
                throw null;
            }
            I1.j jVar2 = (I1.j) obj;
            if (i6 > s02) {
                b().c(jVar2);
            }
            i6 = i7;
        }
    }
}
