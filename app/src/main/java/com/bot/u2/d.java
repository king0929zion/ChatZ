package U2;

import H0.L;
import X3.y;
import m4.AbstractC1276k;
import o0.C1381C;
import q0.InterfaceC1498d;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8619c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1381C f8620e;

    public /* synthetic */ d(C1381C c1381c, int i6) {
        this.f8619c = i6;
        this.f8620e = c1381c;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f8619c) {
            case 0:
                L l3 = (L) obj;
                AbstractC1276k.f(l3, "$this$onDrawWithContent");
                l3.b();
                InterfaceC1498d.v(l3, this.f8620e, 0L, 0L, S.l.f7374V, null, 62);
                return y.a;
            default:
                l0.d dVar = (l0.d) obj;
                AbstractC1276k.f(dVar, "$this$drawWithCache");
                return dVar.b(new d(this.f8620e, 0));
        }
    }
}
