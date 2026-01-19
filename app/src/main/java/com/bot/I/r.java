package I;

import f0.C0987j;
import i1.InterfaceC1078B;

/* loaded from: classes.dex */
public final class r implements InterfaceC1078B {

    /* renamed from: c, reason: collision with root package name */
    public final C0987j f2110c;

    /* renamed from: e, reason: collision with root package name */
    public e1.l f2111e;

    /* renamed from: f, reason: collision with root package name */
    public e1.m f2112f;

    /* renamed from: g, reason: collision with root package name */
    public e1.l f2113g;

    /* renamed from: h, reason: collision with root package name */
    public e1.j f2114h;

    public r(C0987j c0987j) {
        this.f2110c = c0987j;
    }

    @Override // i1.InterfaceC1078B
    public final long g(e1.k kVar, long j3, e1.m mVar, long j4) {
        e1.j jVar = this.f2114h;
        if (jVar != null) {
            e1.l lVar = this.f2111e;
            if ((lVar == null ? false : e1.l.b(lVar.a, j3)) && this.f2112f == mVar) {
                e1.l lVar2 = this.f2113g;
                if (lVar2 != null ? e1.l.b(lVar2.a, j4) : false) {
                    return jVar.a;
                }
            }
        }
        long g3 = this.f2110c.g(kVar, j3, mVar, j4);
        this.f2111e = new e1.l(j3);
        this.f2112f = mVar;
        this.f2113g = new e1.l(j4);
        this.f2114h = new e1.j(g3);
        return g3;
    }
}
