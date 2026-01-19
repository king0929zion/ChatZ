package B;

import P0.t;
import P0.v;
import P0.w;
import P0.x;
import android.view.autofill.AutofillValue;
import i0.C1067f;
import i0.C1073l;
import p.C1420J;

/* loaded from: classes.dex */
public final class k extends C1420J {

    /* renamed from: Q, reason: collision with root package name */
    public R0.a f367Q;

    @Override // p.r
    public final void P0(x xVar) {
        v.g(xVar, this.f367Q);
        w wVar = t.f4539r;
        s4.e[] eVarArr = v.a;
        s4.e eVar = eVarArr[9];
        xVar.a(wVar, C1073l.f11950b);
        C1067f c1067f = new C1067f(AutofillValue.forToggle(this.f367Q != R0.a.f6852f));
        w wVar2 = t.f4540s;
        s4.e eVar2 = eVarArr[10];
        xVar.a(wVar2, c1067f);
        v.b(xVar, new g(xVar, 1));
    }
}
