package Q;

import F0.C0125m;
import H0.AbstractC0157l;
import H0.InterfaceC0154i;
import H0.InterfaceC0170z;
import h0.AbstractC1040q;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class N0 extends AbstractC1040q implements InterfaceC0154i, InterfaceC0170z {

    /* renamed from: r, reason: collision with root package name */
    public LinkedHashMap f5437r;

    @Override // H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        float f6 = ((e1.f) AbstractC0157l.h(this, D0.f5207c)).f11571c;
        float f7 = 0;
        if (f6 < f7) {
            f6 = f7;
        }
        F0.k0 w5 = u5.w(j3);
        boolean z5 = this.f11819q && !Float.isNaN(f6) && e1.f.b(f6, f7) > 0;
        int l02 = !Float.isNaN(f6) ? x5.l0(f6) : 0;
        int max = z5 ? Math.max(w5.f1485c, l02) : w5.f1485c;
        int max2 = z5 ? Math.max(w5.f1486e, l02) : w5.f1486e;
        if (z5) {
            LinkedHashMap linkedHashMap = this.f5437r;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f5437r = linkedHashMap;
            }
            F0.z0 z0Var = D0.f5206b;
            int round = Math.round((l02 - w5.f1485c) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(z0Var, Integer.valueOf(round));
            C0125m c0125m = D0.a;
            int round2 = Math.round((l02 - w5.f1486e) / 2.0f);
            linkedHashMap.put(c0125m, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.f5437r;
        if (map == null) {
            map = Y3.w.f9813c;
        }
        return x5.D(max, max2, map, new M0(max, max2, w5));
    }
}
