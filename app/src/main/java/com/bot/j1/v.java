package J1;

import O.AbstractC0317k0;
import T.d1;
import java.util.ArrayList;
import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.C1340o;
import n0.C1353b;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2886c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1 f2887e;

    public /* synthetic */ v(d1 d1Var, int i6) {
        this.f2886c = i6;
        this.f2887e = d1Var;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        int i6 = this.f2886c;
        d1 d1Var = this.f2887e;
        switch (i6) {
            case 0:
                List list = (List) d1Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (AbstractC1276k.b(((I1.j) obj).f2544e.f2591c, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return new C1353b(((C1353b) d1Var.getValue()).a);
            case 2:
                C1340o c1340o = AbstractC0317k0.a;
                return new C1353b(((C1353b) d1Var.getValue()).a);
            case 3:
                return Boolean.valueOf(((Number) d1Var.getValue()).floatValue() > S.l.f7374V);
            default:
                return Boolean.valueOf(((Number) d1Var.getValue()).floatValue() > S.l.f7374V);
        }
    }
}
