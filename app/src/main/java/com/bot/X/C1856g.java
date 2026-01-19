package x;

import O.C0316k;
import O.C0319l0;
import b0.C0873f;
import k.C1178z;
import p.O0;
import y.AbstractC1975o;

/* renamed from: x.g */
/* loaded from: classes.dex */
public final class C1856g extends AbstractC1975o {

    /* renamed from: c */
    public final C0316k f15449c = new C0316k();

    /* renamed from: d */
    public C1178z f15450d;

    public C1856g(l4.c cVar) {
        cVar.f(this);
    }

    public static /* synthetic */ void n(C1856g c1856g, String str, l4.f fVar, int i6) {
        if ((i6 & 1) != 0) {
            str = null;
        }
        c1856g.m(str, fVar);
    }

    @Override // y.AbstractC1975o
    public final C0316k i() {
        return this.f15449c;
    }

    public final void m(Object obj, l4.f fVar) {
        this.f15449c.a(1, new C1854e(obj != null ? new W0.e(obj, 15) : null, new O0(12), new C0873f(new C0319l0(fVar, 4), true, -857469575)));
    }

    public final void o(int i6, l4.c cVar, l4.c cVar2, C0873f c0873f) {
        this.f15449c.a(i6, new C1854e(cVar, cVar2, c0873f));
    }
}
