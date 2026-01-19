package m;

import F0.k0;
import F0.n0;
import e1.C0959a;
import m4.AbstractC1277l;
import n.y0;

/* renamed from: m.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1243y extends AbstractC1277l implements l4.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f12866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0 f12867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243y(l4.c cVar, y0 y0Var) {
        super(3);
        this.f12866e = cVar;
        this.f12867f = y0Var;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j3;
        F0.X x5 = (F0.X) obj;
        k0 w5 = ((F0.U) obj2).w(((C0959a) obj3).a);
        if (x5.d0()) {
            if (!((Boolean) this.f12866e.f(this.f12867f.f13280d.getValue())).booleanValue()) {
                j3 = 0;
                return x5.D((int) (j3 >> 32), (int) (4294967295L & j3), Y3.w.f9813c, new n0(w5, 4));
            }
        }
        j3 = (w5.f1485c << 32) | (w5.f1486e & 4294967295L);
        return x5.D((int) (j3 >> 32), (int) (4294967295L & j3), Y3.w.f9813c, new n0(w5, 4));
    }
}
