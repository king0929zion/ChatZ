package J;

import D.C0056a;
import D.P0;
import F0.AbstractC0137z;
import F0.InterfaceC0134w;
import H0.AbstractC0157l;
import H0.InterfaceC0155j;
import M.q;
import O.F0;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import k.I;
import n0.C1354c;

/* loaded from: classes.dex */
public abstract class i {
    public static final InterfaceC1041r a(InterfaceC1041r interfaceC1041r, l4.e eVar) {
        return interfaceC1041r.c(new b(eVar));
    }

    public static final G.c b(InterfaceC0155j interfaceC0155j) {
        G.f fVar;
        F.a aVar = new F.a();
        AbstractC0157l.y(interfaceC0155j, d.a, new C0056a(8, new C0056a(aVar, 7), new P0(1, aVar, F.a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 2)));
        I i6 = new I();
        I i7 = aVar.a;
        Object[] objArr = i7.a;
        int i8 = i7.f12466b;
        int i9 = 0;
        boolean z5 = true;
        G.b bVar = null;
        while (true) {
            fVar = G.f.f1644b;
            if (i9 >= i8) {
                break;
            }
            G.b bVar2 = (G.b) objArr[i9];
            if (!z5 || bVar2 != fVar) {
                if (bVar2 != fVar || bVar != fVar) {
                    if (bVar2 != fVar) {
                        I i10 = aVar.f1377b;
                        Object[] objArr2 = i10.a;
                        int i11 = i10.f12466b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            if (((Boolean) ((l4.c) objArr2[i12]).f(bVar2)).booleanValue()) {
                            }
                        }
                    }
                    i6.a(bVar2);
                    z5 = false;
                    bVar = bVar2;
                }
                z5 = false;
                break;
            }
            i9++;
        }
        if (((G.b) (i6.h() ? null : i6.a[i6.f12466b - 1])) == fVar) {
            i6.k(i6.f12466b - 1);
        }
        V.b bVar3 = i6.f12467c;
        if (bVar3 == null) {
            bVar3 = new V.b(i6, 1);
            i6.f12467c = bVar3;
        }
        return new G.c(bVar3);
    }

    public static final InterfaceC1041r c(l4.e eVar) {
        return new e(eVar);
    }

    public static final InterfaceC1041r d(InterfaceC1041r interfaceC1041r, q qVar, l4.c cVar, F0 f02, l4.c cVar2) {
        return interfaceC1041r.c(new j(qVar, cVar, f02, cVar2));
    }

    public static final C1354c e(C1354c c1354c, InterfaceC0134w interfaceC0134w, InterfaceC0134w interfaceC0134w2) {
        if (!interfaceC0134w.j() || !interfaceC0134w2.j()) {
            return C1354c.f13294e;
        }
        return AbstractC1117a.a(interfaceC0134w2.R(AbstractC0137z.h(interfaceC0134w), c1354c.e()), c1354c.d());
    }
}
