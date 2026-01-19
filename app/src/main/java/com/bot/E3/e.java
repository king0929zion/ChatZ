package E3;

import I3.H;
import I3.o;
import I3.u;
import N3.j;
import Y3.x;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import x4.InterfaceC1922e0;
import z3.M;
import z3.N;

/* loaded from: classes.dex */
public final class e {
    public final H a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1310b;

    /* renamed from: c, reason: collision with root package name */
    public final o f1311c;

    /* renamed from: d, reason: collision with root package name */
    public final J3.d f1312d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1922e0 f1313e;

    /* renamed from: f, reason: collision with root package name */
    public final j f1314f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f1315g;

    public e(H h3, u uVar, o oVar, J3.d dVar, InterfaceC1922e0 interfaceC1922e0, j jVar) {
        Set keySet;
        AbstractC1276k.f(uVar, "method");
        AbstractC1276k.f(interfaceC1922e0, "executionContext");
        AbstractC1276k.f(jVar, "attributes");
        this.a = h3;
        this.f1310b = uVar;
        this.f1311c = oVar;
        this.f1312d = dVar;
        this.f1313e = interfaceC1922e0;
        this.f1314f = jVar;
        Map map = (Map) jVar.e(w3.f.a);
        this.f1315g = (map == null || (keySet = map.keySet()) == null) ? x.f9814c : keySet;
    }

    public final Object a() {
        M m3 = N.f16254d;
        Map map = (Map) this.f1314f.e(w3.f.a);
        if (map != null) {
            return map.get(m3);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.a + ", method=" + this.f1310b + ')';
    }
}
