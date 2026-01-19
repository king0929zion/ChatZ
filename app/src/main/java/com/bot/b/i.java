package B;

import P0.t;
import P0.v;
import P0.w;
import P0.x;
import android.view.autofill.AutofillValue;
import i0.C1067f;
import i0.C1073l;
import p.C1420J;
import t.C1682j;

/* loaded from: classes.dex */
public final class i extends C1420J {

    /* renamed from: Q, reason: collision with root package name */
    public boolean f359Q;

    /* renamed from: R, reason: collision with root package name */
    public l4.c f360R;

    /* renamed from: S, reason: collision with root package name */
    public final A.b f361S;

    public i(boolean z5, C1682j c1682j, boolean z6, P0.i iVar, l4.c cVar) {
        super(c1682j, null, false, z6, null, iVar, new h(cVar, z5, 0));
        this.f359Q = z5;
        this.f360R = cVar;
        this.f361S = new A.b(this, 1);
    }

    @Override // p.r
    public final void P0(x xVar) {
        v.g(xVar, this.f359Q ? R0.a.f6850c : R0.a.f6851e);
        w wVar = t.f4539r;
        s4.e[] eVarArr = v.a;
        s4.e eVar = eVarArr[9];
        xVar.a(wVar, C1073l.f11950b);
        C1067f c1067f = new C1067f(AutofillValue.forToggle(this.f359Q));
        w wVar2 = t.f4540s;
        s4.e eVar2 = eVarArr[10];
        xVar.a(wVar2, c1067f);
        v.b(xVar, new g(xVar, 0));
    }
}
