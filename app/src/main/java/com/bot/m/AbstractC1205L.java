package m;

import h0.C1026c;
import h0.C1032i;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1327h0;
import n.D0;
import n.E0;
import n.InterfaceC1351z;

/* renamed from: m.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1205L {
    public static final E0 a = new E0(C1221c.f12775j, C1221c.f12776k);

    /* renamed from: b, reason: collision with root package name */
    public static final C1327h0 f12736b = AbstractC1318d.r(S.l.f7374V, 400.0f, null, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final C1327h0 f12737c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1327h0 f12738d;

    static {
        AbstractC1318d.r(S.l.f7374V, 400.0f, null, 5);
        long j3 = 1;
        long j4 = (j3 & 4294967295L) | (j3 << 32);
        f12737c = AbstractC1318d.r(S.l.f7374V, 400.0f, new e1.j(j4), 1);
        f12738d = AbstractC1318d.r(S.l.f7374V, 400.0f, new e1.l(j4), 1);
    }

    public static C1210Q a(D0 d02, int i6) {
        C1032i c1032i = C1026c.f11797o;
        C1032i c1032i2 = C1026c.f11795m;
        int i7 = 1;
        InterfaceC1351z interfaceC1351z = d02;
        if ((i6 & 1) != 0) {
            long j3 = 1;
            interfaceC1351z = AbstractC1318d.r(S.l.f7374V, 400.0f, new e1.l((j3 & 4294967295L) | (j3 << 32)), 1);
        }
        C1032i c1032i3 = (i6 & 2) != 0 ? c1032i : c1032i2;
        return new C1210Q(new d0((C1212T) null, (b0) null, new C1197D(AbstractC1276k.b(c1032i3, c1032i2) ? C1026c.f11787e : AbstractC1276k.b(c1032i3, c1032i) ? C1026c.f11793k : C1026c.f11790h, new C1221c(i7, 8), interfaceC1351z), (C1217Y) null, (LinkedHashMap) null, 123));
    }

    public static C1210Q b(D0 d02, int i6) {
        InterfaceC1351z interfaceC1351z = d02;
        if ((i6 & 1) != 0) {
            interfaceC1351z = AbstractC1318d.r(S.l.f7374V, 400.0f, null, 5);
        }
        return new C1210Q(new d0(new C1212T(interfaceC1351z), (b0) null, (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 126));
    }

    public static C1211S c(D0 d02, int i6) {
        InterfaceC1351z interfaceC1351z = d02;
        if ((i6 & 1) != 0) {
            interfaceC1351z = AbstractC1318d.r(S.l.f7374V, 400.0f, null, 5);
        }
        return new C1211S(new d0(new C1212T(interfaceC1351z), (b0) null, (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 126));
    }

    public static C1211S d(D0 d02, int i6) {
        C1032i c1032i = C1026c.f11797o;
        C1032i c1032i2 = C1026c.f11795m;
        int i7 = 1;
        InterfaceC1351z interfaceC1351z = d02;
        if ((i6 & 1) != 0) {
            long j3 = 1;
            interfaceC1351z = AbstractC1318d.r(S.l.f7374V, 400.0f, new e1.l((j3 & 4294967295L) | (j3 << 32)), 1);
        }
        C1032i c1032i3 = (i6 & 2) != 0 ? c1032i : c1032i2;
        return new C1211S(new d0((C1212T) null, (b0) null, new C1197D(AbstractC1276k.b(c1032i3, c1032i2) ? C1026c.f11787e : AbstractC1276k.b(c1032i3, c1032i) ? C1026c.f11793k : C1026c.f11790h, new C1221c(i7, 9), interfaceC1351z), (C1217Y) null, (LinkedHashMap) null, 123));
    }
}
