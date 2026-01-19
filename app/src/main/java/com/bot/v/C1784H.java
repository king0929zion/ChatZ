package v;

import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import j1.AbstractC1135a;
import java.util.List;
import k.C1165l;
import m4.AbstractC1276k;

/* renamed from: v.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1784H implements m0 {
    public final InterfaceC1793e a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1797g f15242b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15243c;

    /* renamed from: d, reason: collision with root package name */
    public final C1816w f15244d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15245e;

    /* renamed from: f, reason: collision with root package name */
    public final C1782F f15246f;

    public C1784H(InterfaceC1793e interfaceC1793e, InterfaceC1797g interfaceC1797g, float f6, C1816w c1816w, float f7, C1782F c1782f) {
        this.a = interfaceC1793e;
        this.f15242b = interfaceC1797g;
        this.f15243c = f6;
        this.f15244d = c1816w;
        this.f15245e = f7;
        this.f15246f = c1782f;
    }

    public static int a(List list, int i6, int i7, int i8, C1782F c1782f) {
        boolean z5;
        boolean z6;
        long a = C1165l.a(0, 0);
        if (!list.isEmpty()) {
            int i9 = TableCell.NOT_TRACKED;
            C1779C c1779c = new C1779C(c1782f, AbstractC0960b.a(0, i6, 0, TableCell.NOT_TRACKED), i7, i8);
            F0.U u5 = (F0.U) Y3.m.r0(list, 0);
            int a02 = u5 != null ? u5.a0(i6) : 0;
            int o5 = u5 != null ? u5.o(a02) : 0;
            boolean z7 = true;
            if (list.size() > 1) {
                z5 = true;
            } else {
                z5 = true;
                z7 = false;
            }
            int i10 = 0;
            if (c1779c.b(z7, 0, C1165l.a(i6, TableCell.NOT_TRACKED), u5 == null ? null : new C1165l(C1165l.a(o5, a02)), 0, 0, 0, false, false).f15198b) {
                c1782f.getClass();
                a = a;
            } else {
                int size = list.size();
                int i11 = i6;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    int i17 = i11 - o5;
                    int i18 = i14 + 1;
                    int max = Math.max(i13, a02);
                    F0.U u6 = (F0.U) Y3.m.r0(list, i18);
                    a02 = u6 != null ? u6.a0(i6) : 0;
                    int o6 = u6 != null ? u6.o(a02) + i7 : 0;
                    if (i14 + 2 < list.size()) {
                        i14 = i18;
                        z6 = z5;
                    } else {
                        i14 = i18;
                        z6 = false;
                    }
                    int i19 = i14 - i16;
                    int i20 = i12;
                    int i21 = o6;
                    C1778B b5 = c1779c.b(z6, i19, C1165l.a(i17, i9), u6 == null ? null : new C1165l(C1165l.a(o6, a02)), i20, i10, max, false, false);
                    if (b5.a) {
                        int i22 = max + i8 + i10;
                        c1779c.a(b5, u6 != null, i20, i22, i17, i19);
                        int i23 = i21 - i7;
                        i12 = i20 + 1;
                        if (b5.f15198b) {
                            i15 = i14;
                            i10 = i22;
                            break;
                        }
                        i11 = i6;
                        i16 = i14;
                        o5 = i23;
                        i10 = i22;
                        i13 = 0;
                    } else {
                        o5 = i21;
                        i11 = i17;
                        i12 = i20;
                        i13 = max;
                    }
                    i15 = i14;
                    i9 = TableCell.NOT_TRACKED;
                    z5 = true;
                }
                a = C1165l.a(i10 - i8, i15);
            }
        }
        return (int) (a >> 32);
    }

    @Override // v.m0
    public final int b(F0.k0 k0Var) {
        return k0Var.j0();
    }

    @Override // v.m0
    public final long c(int i6, int i7, int i8, boolean z5) {
        p0 p0Var = o0.a;
        return !z5 ? AbstractC0960b.a(i6, i7, 0, i8) : s4.j.s(i6, i7, 0, i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1784H)) {
            return false;
        }
        C1784H c1784h = (C1784H) obj;
        c1784h.getClass();
        return this.a.equals(c1784h.a) && this.f15242b.equals(c1784h.f15242b) && e1.f.c(this.f15243c, c1784h.f15243c) && this.f15244d.equals(c1784h.f15244d) && e1.f.c(this.f15245e, c1784h.f15245e) && AbstractC1276k.b(this.f15246f, c1784h.f15246f);
    }

    @Override // v.m0
    public final int f(F0.k0 k0Var) {
        return k0Var.i0();
    }

    @Override // v.m0
    public final void g(int i6, int[] iArr, int[] iArr2, F0.X x5) {
        this.a.c(x5, i6, iArr, x5.getLayoutDirection(), iArr2);
    }

    public final int hashCode() {
        return this.f15246f.hashCode() + AbstractC1135a.b(TableCell.NOT_TRACKED, AbstractC1135a.b(TableCell.NOT_TRACKED, AbstractC1135a.a(this.f15245e, (this.f15244d.hashCode() + AbstractC1135a.a(this.f15243c, (this.f15242b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // v.m0
    public final F0.W i(final F0.k0[] k0VarArr, F0.X x5, final int[] iArr, int i6, final int i7, final int[] iArr2, final int i8, final int i9, final int i10) {
        final e1.m mVar = e1.m.f11576c;
        return x5.D(i6, i7, Y3.w.f9813c, new l4.c() { // from class: v.G
            @Override // l4.c
            public final Object f(Object obj) {
                AbstractC1787b abstractC1787b;
                F0.j0 j0Var = (F0.j0) obj;
                int[] iArr3 = iArr2;
                int i11 = iArr3 != null ? iArr3[i8] : 0;
                int i12 = i9;
                for (int i13 = i12; i13 < i10; i13++) {
                    F0.k0 k0Var = k0VarArr[i13];
                    AbstractC1276k.c(k0Var);
                    Object H3 = k0Var.H();
                    n0 n0Var = H3 instanceof n0 ? (n0) H3 : null;
                    if (n0Var == null || (abstractC1787b = n0Var.f15332c) == null) {
                        abstractC1787b = this.f15244d;
                    }
                    j0Var.h(k0Var, iArr[i13 - i12], abstractC1787b.i(i7, mVar, k0Var) + i11, S.l.f7374V);
                }
                return X3.y.a;
            }
        });
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.f15242b + ", mainAxisSpacing=" + ((Object) e1.f.d(this.f15243c)) + ", crossAxisAlignment=" + this.f15244d + ", crossAxisArrangementSpacing=" + ((Object) e1.f.d(this.f15245e)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f15246f + ')';
    }
}
