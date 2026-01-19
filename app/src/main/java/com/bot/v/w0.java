package v;

import H0.AbstractC0157l;
import android.view.View;
import java.util.WeakHashMap;
import m4.AbstractC1276k;
import p.O0;
import t1.AbstractC1708k;
import t1.AbstractC1713p;

/* loaded from: classes.dex */
public final class w0 extends P {

    /* renamed from: u, reason: collision with root package name */
    public O0 f15363u;

    /* renamed from: v, reason: collision with root package name */
    public G0 f15364v;

    @Override // v.M, h0.AbstractC1040q
    public final void E0() {
        View x5 = AbstractC0157l.x(this);
        WeakHashMap weakHashMap = G0.f15220w;
        G0 g3 = C1810p.g(x5);
        g3.a(x5);
        this.f15363u.getClass();
        C1785a c1785a = g3.f15222c;
        if (!AbstractC1276k.b(c1785a, this.f15265t)) {
            this.f15265t = c1785a;
            N0();
        }
        this.f15364v = g3;
        super.E0();
    }

    @Override // v.M, h0.AbstractC1040q
    public final void F0() {
        View x5 = AbstractC0157l.x(this);
        G0 g02 = this.f15364v;
        if (g02 != null) {
            int i6 = g02.f15240u - 1;
            g02.f15240u = i6;
            if (i6 == 0) {
                int i7 = AbstractC1713p.a;
                AbstractC1708k.b(x5, null);
                AbstractC1713p.c(x5, null);
                x5.removeOnAttachStateChangeListener(g02.f15241v);
            }
        }
        super.F0();
    }
}
