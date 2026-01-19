package D;

import f0.C0996s;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f726c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.c f728f;

    public /* synthetic */ A(i1 i1Var, l4.c cVar, int i6) {
        this.f726c = i6;
        this.f727e = i1Var;
        this.f728f = cVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f726c) {
            case 0:
                S0.L l3 = (S0.L) obj;
                i1 i1Var = this.f727e;
                if (i1Var != null) {
                    i1Var.a.setValue(l3);
                }
                l4.c cVar = this.f728f;
                if (cVar != null) {
                    cVar.f(l3);
                }
                return X3.y.a;
            default:
                i1 i1Var2 = this.f727e;
                C0996s c0996s = i1Var2.f1039c;
                l4.c cVar2 = this.f728f;
                c0996s.add(cVar2);
                return new V0(1, i1Var2, cVar2);
        }
    }
}
