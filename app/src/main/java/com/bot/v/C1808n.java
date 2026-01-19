package v;

import P2.C0379t;
import e1.AbstractC0960b;
import e1.C0959a;
import f0.C0990m;
import h0.InterfaceC1028e;
import java.util.List;
import m4.AbstractC1276k;

/* renamed from: v.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1808n implements F0.V {
    public final InterfaceC1028e a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15330b;

    public C1808n(InterfaceC1028e interfaceC1028e, boolean z5) {
        this.a = interfaceC1028e;
        this.f15330b = z5;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, m4.u] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, m4.u] */
    @Override // F0.V
    public final F0.W e(final F0.X x5, List list, long j3) {
        int j4;
        int i6;
        F0.k0 w5;
        boolean isEmpty = list.isEmpty();
        Y3.w wVar = Y3.w.f9813c;
        if (isEmpty) {
            return x5.D(C0959a.j(j3), C0959a.i(j3), wVar, new C0990m(26));
        }
        long j5 = this.f15330b ? j3 : j3 & (-8589934589L);
        if (list.size() == 1) {
            final F0.U u5 = (F0.U) list.get(0);
            Object H3 = u5.H();
            C1803j c1803j = H3 instanceof C1803j ? (C1803j) H3 : null;
            if (c1803j != null ? c1803j.f15315s : false) {
                j4 = C0959a.j(j3);
                i6 = C0959a.i(j3);
                int j6 = C0959a.j(j3);
                int i7 = C0959a.i(j3);
                if (!((i7 >= 0) & (j6 >= 0))) {
                    e1.i.a("width and height must be >= 0");
                }
                w5 = u5.w(AbstractC0960b.h(j6, j6, i7, i7));
            } else {
                w5 = u5.w(j5);
                j4 = Math.max(C0959a.j(j3), w5.f1485c);
                i6 = Math.max(C0959a.i(j3), w5.f1486e);
            }
            final int i8 = i6;
            final int i9 = j4;
            final F0.k0 k0Var = w5;
            return x5.D(i9, i8, wVar, new l4.c() { // from class: v.m
                @Override // l4.c
                public final Object f(Object obj) {
                    AbstractC1806l.b((F0.j0) obj, F0.k0.this, u5, x5.getLayoutDirection(), i9, i8, this.a);
                    return X3.y.a;
                }
            });
        }
        F0.k0[] k0VarArr = new F0.k0[list.size()];
        ?? obj = new Object();
        obj.f12971c = C0959a.j(j3);
        ?? obj2 = new Object();
        obj2.f12971c = C0959a.i(j3);
        int size = list.size();
        boolean z5 = false;
        for (int i10 = 0; i10 < size; i10++) {
            F0.U u6 = (F0.U) list.get(i10);
            Object H5 = u6.H();
            C1803j c1803j2 = H5 instanceof C1803j ? (C1803j) H5 : null;
            if (c1803j2 != null ? c1803j2.f15315s : false) {
                z5 = true;
            } else {
                F0.k0 w6 = u6.w(j5);
                k0VarArr[i10] = w6;
                obj.f12971c = Math.max(obj.f12971c, w6.f1485c);
                obj2.f12971c = Math.max(obj2.f12971c, w6.f1486e);
            }
        }
        if (z5) {
            int i11 = obj.f12971c;
            int i12 = i11 != Integer.MAX_VALUE ? i11 : 0;
            int i13 = obj2.f12971c;
            long a = AbstractC0960b.a(i12, i11, i13 != Integer.MAX_VALUE ? i13 : 0, i13);
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                F0.U u7 = (F0.U) list.get(i14);
                Object H6 = u7.H();
                C1803j c1803j3 = H6 instanceof C1803j ? (C1803j) H6 : null;
                if (c1803j3 != null ? c1803j3.f15315s : false) {
                    k0VarArr[i14] = u7.w(a);
                }
            }
        }
        return x5.D(obj.f12971c, obj2.f12971c, wVar, new C0379t(k0VarArr, list, x5, obj, obj2, this, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1808n)) {
            return false;
        }
        C1808n c1808n = (C1808n) obj;
        return AbstractC1276k.b(this.a, c1808n.a) && this.f15330b == c1808n.f15330b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15330b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.f15330b + ')';
    }
}
