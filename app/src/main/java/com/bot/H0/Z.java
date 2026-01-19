package H0;

import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import com.vladsch.flexmark.util.format.TableCell;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class Z extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0139a0 f1852f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(C0139a0 c0139a0, int i6) {
        super(0);
        this.f1851e = i6;
        this.f1852f = c0139a0;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        F0.j0 placementScope;
        switch (this.f1851e) {
            case 0:
                C0139a0 c0139a0 = this.f1852f;
                N n3 = c0139a0.f1869i;
                n3.f1774i = 0;
                V.e z5 = n3.a.z();
                Object[] objArr = z5.f8759c;
                int i6 = z5.f8761f;
                for (int i7 = 0; i7 < i6; i7++) {
                    C0139a0 c0139a02 = ((J) objArr[i7]).f1722K.f1781p;
                    c0139a02.f1871k = c0139a02.f1872l;
                    c0139a02.f1872l = TableCell.NOT_TRACKED;
                    c0139a02.f1884x = false;
                    if (c0139a02.f1875o == H.f1706e) {
                        c0139a02.f1875o = H.f1707f;
                    }
                }
                J j3 = n3.a;
                J j4 = n3.a;
                V.e z6 = j3.z();
                Object[] objArr2 = z6.f8759c;
                int i8 = z6.f8761f;
                for (int i9 = 0; i9 < i8; i9++) {
                    ((J) objArr2[i9]).f1722K.f1781p.f1854B.f1758d = false;
                }
                if (c0139a0.g().f1801n) {
                    V.b bVar = (V.b) j4.n();
                    int i10 = ((V.e) bVar.f8751e).f8761f;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((J) bVar.get(i11)).f1721J.f1917d.f1801n = true;
                    }
                }
                c0139a0.g().E0().c();
                if (c0139a0.g().f1801n) {
                    V.b bVar2 = (V.b) j4.n();
                    int i12 = ((V.e) bVar2.f8751e).f8761f;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((J) bVar2.get(i13)).f1721J.f1917d.f1801n = false;
                    }
                }
                V.e z7 = j4.z();
                Object[] objArr3 = z7.f8759c;
                int i14 = z7.f8761f;
                for (int i15 = 0; i15 < i14; i15++) {
                    J j5 = (J) objArr3[i15];
                    N n5 = j5.f1722K;
                    if (n5.f1781p.f1871k != j5.w()) {
                        j4.O();
                        j4.C();
                        if (j5.w() == Integer.MAX_VALUE) {
                            if (n5.f1768c || AbstractC0157l.q(j5)) {
                                W w5 = n5.f1782q;
                                AbstractC1276k.c(w5);
                                w5.x0(false);
                            }
                            n5.f1781p.y0();
                        }
                    }
                }
                V.e z8 = j4.z();
                Object[] objArr4 = z8.f8759c;
                int i16 = z8.f8761f;
                for (int i17 = 0; i17 < i16; i17++) {
                    K k3 = ((J) objArr4[i17]).f1722K.f1781p.f1854B;
                    k3.f1759e = k3.f1758d;
                }
                return X3.y.a;
            case 1:
                C0139a0 c0139a03 = this.f1852f;
                c0139a03.f1869i.a().w(c0139a03.f1858F);
                return X3.y.a;
            default:
                C0139a0 c0139a04 = this.f1852f;
                N n6 = c0139a04.f1869i;
                i0 i0Var = n6.a().f1956t;
                if (i0Var == null || (placementScope = i0Var.f1802o) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(n6.a)).getPlacementScope();
                }
                l4.c cVar = c0139a04.f1863K;
                r0.b bVar3 = c0139a04.f1864L;
                if (bVar3 != null) {
                    i0 a = n6.a();
                    long j6 = c0139a04.f1865M;
                    float f6 = c0139a04.f1866N;
                    placementScope.getClass();
                    F0.j0.b(placementScope, a);
                    a.p0(e1.j.e(j6, a.f1489h), f6, bVar3);
                } else if (cVar == null) {
                    i0 a6 = n6.a();
                    long j7 = c0139a04.f1865M;
                    float f7 = c0139a04.f1866N;
                    placementScope.getClass();
                    F0.j0.b(placementScope, a6);
                    a6.m0(e1.j.e(j7, a6.f1489h), f7, null);
                } else {
                    i0 a7 = n6.a();
                    long j8 = c0139a04.f1865M;
                    float f8 = c0139a04.f1866N;
                    placementScope.getClass();
                    F0.j0.b(placementScope, a7);
                    a7.m0(e1.j.e(j8, a7.f1489h), f8, cVar);
                }
                return X3.y.a;
        }
    }
}
