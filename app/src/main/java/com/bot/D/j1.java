package D;

import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1046c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f1047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f1048f;

    public /* synthetic */ j1(List list, List list2, int i6) {
        this.f1046c = i6;
        this.f1047e = list;
        this.f1048f = list2;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f1046c) {
            case 0:
                F0.j0 j0Var = (F0.j0) obj;
                List list = this.f1047e;
                if (list != null) {
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        X3.i iVar = (X3.i) list.get(i6);
                        F0.j0.k(j0Var, (F0.k0) iVar.f9393c, ((e1.j) iVar.f9394e).a);
                    }
                }
                List list2 = this.f1048f;
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        X3.i iVar2 = (X3.i) list2.get(i7);
                        F0.k0 k0Var = (F0.k0) iVar2.f9393c;
                        InterfaceC1193a interfaceC1193a = (InterfaceC1193a) iVar2.f9394e;
                        F0.j0.k(j0Var, k0Var, interfaceC1193a != null ? ((e1.j) interfaceC1193a.b()).a : 0L);
                    }
                }
                return X3.y.a;
            default:
                M2.A a = (M2.A) obj;
                AbstractC1276k.f(a, "it");
                return M2.A.a(a, null, null, Y3.m.J0(this.f1048f), Y3.m.J0(this.f1047e), null, null, null, null, null, 499);
        }
    }
}
