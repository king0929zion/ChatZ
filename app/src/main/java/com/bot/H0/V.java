package H0;

import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import com.vladsch.flexmark.util.format.TableCell;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class V extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f1816f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(W w5, int i6) {
        super(0);
        this.f1815e = i6;
        this.f1816f = w5;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        T U02;
        switch (this.f1815e) {
            case 0:
                W w5 = this.f1816f;
                N n3 = w5.f1823i;
                n3.f1773h = 0;
                V.e z5 = n3.a.z();
                Object[] objArr = z5.f8759c;
                int i6 = z5.f8761f;
                for (int i7 = 0; i7 < i6; i7++) {
                    W w6 = ((J) objArr[i7]).f1722K.f1782q;
                    AbstractC1276k.c(w6);
                    w6.f1825k = w6.f1826l;
                    w6.f1826l = TableCell.NOT_TRACKED;
                    if (w6.f1827m == H.f1706e) {
                        w6.f1827m = H.f1707f;
                    }
                }
                J j3 = n3.a;
                J j4 = n3.a;
                V.e z6 = j3.z();
                Object[] objArr2 = z6.f8759c;
                int i8 = z6.f8761f;
                for (int i9 = 0; i9 < i8; i9++) {
                    W w7 = ((J) objArr2[i9]).f1722K.f1782q;
                    AbstractC1276k.c(w7);
                    w7.f1836v.f1758d = false;
                }
                C0164t c0164t = w5.g().f2000W;
                if (c0164t != null) {
                    boolean z7 = c0164t.f1801n;
                    V.b bVar = (V.b) j4.n();
                    int i10 = ((V.e) bVar.f8751e).f8761f;
                    for (int i11 = 0; i11 < i10; i11++) {
                        T U03 = ((J) bVar.get(i11)).f1721J.f1917d.U0();
                        if (U03 != null) {
                            U03.f1801n = z7;
                        }
                    }
                }
                C0164t c0164t2 = w5.g().f2000W;
                AbstractC1276k.c(c0164t2);
                c0164t2.E0().c();
                if (w5.g().f2000W != null) {
                    V.b bVar2 = (V.b) j4.n();
                    int i12 = ((V.e) bVar2.f8751e).f8761f;
                    for (int i13 = 0; i13 < i12; i13++) {
                        T U04 = ((J) bVar2.get(i13)).f1721J.f1917d.U0();
                        if (U04 != null) {
                            U04.f1801n = false;
                        }
                    }
                }
                V.e z8 = j4.z();
                Object[] objArr3 = z8.f8759c;
                int i14 = z8.f8761f;
                for (int i15 = 0; i15 < i14; i15++) {
                    W w8 = ((J) objArr3[i15]).f1722K.f1782q;
                    AbstractC1276k.c(w8);
                    int i16 = w8.f1825k;
                    int i17 = w8.f1826l;
                    if (i16 != i17 && i17 == Integer.MAX_VALUE) {
                        w8.x0(true);
                    }
                }
                V.e z9 = j4.z();
                Object[] objArr4 = z9.f8759c;
                int i18 = z9.f8761f;
                for (int i19 = 0; i19 < i18; i19++) {
                    W w9 = ((J) objArr4[i19]).f1722K.f1782q;
                    AbstractC1276k.c(w9);
                    K k3 = w9.f1836v;
                    k3.f1759e = k3.f1758d;
                }
                return X3.y.a;
            case 1:
                W w10 = this.f1816f;
                N n5 = w10.f1823i;
                F0.j0 j0Var = null;
                if (AbstractC0157l.q(n5.a) || n5.f1768c) {
                    i0 i0Var = n5.a().f1956t;
                    if (i0Var != null) {
                        j0Var = i0Var.f1802o;
                    }
                } else {
                    i0 i0Var2 = n5.a().f1956t;
                    if (i0Var2 != null && (U02 = i0Var2.U0()) != null) {
                        j0Var = U02.f1802o;
                    }
                }
                if (j0Var == null) {
                    j0Var = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(n5.a)).getPlacementScope();
                }
                T U05 = n5.a().U0();
                AbstractC1276k.c(U05);
                F0.j0.k(j0Var, U05, w10.f1832r);
                return X3.y.a;
            default:
                W w11 = this.f1816f;
                T U06 = w11.f1823i.a().U0();
                AbstractC1276k.c(U06);
                U06.w(w11.f1819C);
                return X3.y.a;
        }
    }
}
