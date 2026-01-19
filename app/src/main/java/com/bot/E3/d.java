package E3;

import I3.B;
import I3.n;
import I3.t;
import I3.u;
import N3.j;
import Y3.C;
import Y3.m;
import Y4.l;
import java.util.List;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.t0;

/* loaded from: classes.dex */
public final class d implements t {
    public final B a = new B();

    /* renamed from: b, reason: collision with root package name */
    public u f1305b = u.f2754b;

    /* renamed from: c, reason: collision with root package name */
    public final n f1306c = new n(0);

    /* renamed from: d, reason: collision with root package name */
    public Object f1307d = G3.c.a;

    /* renamed from: e, reason: collision with root package name */
    public t0 f1308e = AbstractC1888A.e();

    /* renamed from: f, reason: collision with root package name */
    public final j f1309f = new j();

    @Override // I3.t
    public final n a() {
        return this.f1306c;
    }

    public final void b(R3.a aVar) {
        j jVar = this.f1309f;
        if (aVar != null) {
            jVar.f(h.a, aVar);
            return;
        }
        N3.a aVar2 = h.a;
        jVar.getClass();
        AbstractC1276k.f(aVar2, "key");
        jVar.d().remove(aVar2);
    }

    public final void c(u uVar) {
        AbstractC1276k.f(uVar, "<set-?>");
        this.f1305b = uVar;
    }

    public final void d(d dVar) {
        AbstractC1276k.f(dVar, "builder");
        this.f1308e = dVar.f1308e;
        this.f1305b = dVar.f1305b;
        this.f1307d = dVar.f1307d;
        j jVar = dVar.f1309f;
        b((R3.a) jVar.e(h.a));
        B b5 = dVar.a;
        B b6 = this.a;
        l.S(b6, b5);
        List list = b6.f2711h;
        AbstractC1276k.f(list, "<set-?>");
        b6.f2711h = list;
        C.g(this.f1306c, dVar.f1306c);
        j jVar2 = this.f1309f;
        AbstractC1276k.f(jVar2, "<this>");
        AbstractC1276k.f(jVar, "other");
        for (N3.a aVar : m.J0(jVar.d().keySet())) {
            AbstractC1276k.d(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            jVar2.f(aVar, jVar.c(aVar));
        }
    }
}
