package J1;

import D.C0091s;
import T.C0616l;
import T.C0626q;
import b0.AbstractC0874g;
import e0.InterfaceC0958c;
import f0.C0996s;

/* loaded from: classes.dex */
public final class o implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1.j f2849c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f2850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0958c f2851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0996s f2852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f2853h;

    public o(I1.j jVar, r rVar, e0.d dVar, C0996s c0996s, q qVar) {
        this.f2849c = jVar;
        this.f2850e = rVar;
        this.f2851f = dVar;
        this.f2852g = c0996s;
        this.f2853h = qVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0626q.E()) {
            c0626q.V();
        } else {
            I1.j jVar = this.f2849c;
            boolean h3 = c0626q.h(jVar);
            r rVar = this.f2850e;
            boolean h6 = h3 | c0626q.h(rVar);
            Object P5 = c0626q.P();
            if (h6 || P5 == C0616l.a) {
                P5 = new C0091s(this.f2852g, jVar, rVar, 6);
                c0626q.m0(P5);
            }
            T.r.d(jVar, (l4.c) P5, c0626q);
            Y3.C.b(jVar, this.f2851f, AbstractC0874g.c(-497631156, new m(0, this.f2853h, jVar), c0626q), c0626q, 384);
        }
        return X3.y.a;
    }
}
