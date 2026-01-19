package v;

import D.C0079l0;
import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import h0.C1032i;
import java.io.Serializable;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class p0 implements F0.V, m0 {
    public final InterfaceC1793e a;

    /* renamed from: b, reason: collision with root package name */
    public final C1032i f15335b;

    public p0(InterfaceC1793e interfaceC1793e, C1032i c1032i) {
        this.a = interfaceC1793e;
        this.f15335b = c1032i;
    }

    @Override // F0.V
    public final int a(F0.r rVar, List list, int i6) {
        int l02 = rVar.l0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * l02, i6);
        int size = list.size();
        int i7 = 0;
        float f6 = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            F0.U u5 = (F0.U) list.get(i8);
            float q3 = AbstractC1787b.q(AbstractC1787b.p(u5));
            if (q3 == S.l.f7374V) {
                int min2 = Math.min(u5.q(TableCell.NOT_TRACKED), i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i6 - min);
                min += min2;
                i7 = Math.max(i7, u5.d(min2));
            } else if (q3 > S.l.f7374V) {
                f6 += q3;
            }
        }
        int round = f6 == S.l.f7374V ? 0 : i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i6 - min, 0) / f6);
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            F0.U u6 = (F0.U) list.get(i9);
            float q5 = AbstractC1787b.q(AbstractC1787b.p(u6));
            if (q5 > S.l.f7374V) {
                i7 = Math.max(i7, u6.d(round != Integer.MAX_VALUE ? Math.round(round * q5) : Integer.MAX_VALUE));
            }
        }
        return i7;
    }

    @Override // v.m0
    public final int b(F0.k0 k0Var) {
        return k0Var.f1485c;
    }

    @Override // v.m0
    public final long c(int i6, int i7, int i8, boolean z5) {
        return !z5 ? AbstractC0960b.a(i6, i7, 0, i8) : s4.j.s(i6, i7, 0, i8);
    }

    @Override // F0.V
    public final int d(F0.r rVar, List list, int i6) {
        int l02 = rVar.l0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * l02, i6);
        int size = list.size();
        int i7 = 0;
        float f6 = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            F0.U u5 = (F0.U) list.get(i8);
            float q3 = AbstractC1787b.q(AbstractC1787b.p(u5));
            if (q3 == S.l.f7374V) {
                int min2 = Math.min(u5.q(TableCell.NOT_TRACKED), i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i6 - min);
                min += min2;
                i7 = Math.max(i7, u5.a0(min2));
            } else if (q3 > S.l.f7374V) {
                f6 += q3;
            }
        }
        int round = f6 == S.l.f7374V ? 0 : i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i6 - min, 0) / f6);
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            F0.U u6 = (F0.U) list.get(i9);
            float q5 = AbstractC1787b.q(AbstractC1787b.p(u6));
            if (q5 > S.l.f7374V) {
                i7 = Math.max(i7, u6.a0(round != Integer.MAX_VALUE ? Math.round(round * q5) : Integer.MAX_VALUE));
            }
        }
        return i7;
    }

    @Override // F0.V
    public final F0.W e(F0.X x5, List list, long j3) {
        return AbstractC1787b.t(this, C0959a.j(j3), C0959a.i(j3), C0959a.h(j3), C0959a.g(j3), x5.l0(this.a.a()), x5, list, new F0.k0[list.size()], 0, list.size(), null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return AbstractC1276k.b(this.a, p0Var.a) && AbstractC1276k.b(this.f15335b, p0Var.f15335b);
    }

    @Override // v.m0
    public final int f(F0.k0 k0Var) {
        return k0Var.f1486e;
    }

    @Override // v.m0
    public final void g(int i6, int[] iArr, int[] iArr2, F0.X x5) {
        this.a.c(x5, i6, iArr, x5.getLayoutDirection(), iArr2);
    }

    @Override // F0.V
    public final int h(F0.r rVar, List list, int i6) {
        int l02 = rVar.l0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        float f6 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            F0.U u5 = (F0.U) list.get(i9);
            float q3 = AbstractC1787b.q(AbstractC1787b.p(u5));
            int o5 = u5.o(i6);
            if (q3 == S.l.f7374V) {
                i8 += o5;
            } else if (q3 > S.l.f7374V) {
                f6 += q3;
                i7 = Math.max(i7, Math.round(o5 / q3));
            }
        }
        return ((list.size() - 1) * l02) + Math.round(i7 * f6) + i8;
    }

    public final int hashCode() {
        return this.f15335b.hashCode() + (this.a.hashCode() * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.m0
    public final F0.W i(F0.k0[] k0VarArr, F0.X x5, int[] iArr, int i6, int i7, int[] iArr2, int i8, int i9, int i10) {
        return x5.D(i6, i7, Y3.w.f9813c, new C0079l0((Serializable) k0VarArr, (Object) this, i7, (Serializable) iArr, 3));
    }

    @Override // F0.V
    public final int j(F0.r rVar, List list, int i6) {
        int l02 = rVar.l0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        float f6 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            F0.U u5 = (F0.U) list.get(i9);
            float q3 = AbstractC1787b.q(AbstractC1787b.p(u5));
            int q5 = u5.q(i6);
            if (q3 == S.l.f7374V) {
                i8 += q5;
            } else if (q3 > S.l.f7374V) {
                f6 += q3;
                i7 = Math.max(i7, Math.round(q5 / q3));
            }
        }
        return ((list.size() - 1) * l02) + Math.round(i7 * f6) + i8;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.f15335b + ')';
    }
}
