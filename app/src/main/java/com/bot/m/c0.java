package m;

import I0.AbstractC0204q0;
import T.C0616l;
import T.C0626q;
import android.view.ViewConfiguration;
import e1.InterfaceC0961c;
import f0.C0987j;
import n.C1347v;

/* loaded from: classes.dex */
public abstract class c0 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final C1347v a(C0626q c0626q) {
        InterfaceC0961c interfaceC0961c = (InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h);
        boolean c6 = c0626q.c(interfaceC0961c.a());
        Object P5 = c0626q.P();
        if (c6 || P5 == C0616l.a) {
            P5 = new C1347v(new C0987j(interfaceC0961c));
            c0626q.m0(P5);
        }
        return (C1347v) P5;
    }
}
