package D;

import java.util.ArrayList;
import java.util.List;
import u.AbstractC1734b;
import z.C2009g;

/* renamed from: D.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0074j implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1040c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1041e;

    public /* synthetic */ C0074j(int i6, ArrayList arrayList) {
        this.f1040c = i6;
        this.f1041e = arrayList;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f1040c) {
            case 0:
                F0.j0 j0Var = (F0.j0) obj;
                ArrayList arrayList = this.f1041e;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    F0.j0.l(j0Var, (F0.k0) arrayList.get(i6), 0, 0);
                }
                return X3.y.a;
            case 1:
                F0.j0 j0Var2 = (F0.j0) obj;
                ArrayList arrayList2 = this.f1041e;
                int size2 = arrayList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    j0Var2.h((F0.k0) arrayList2.get(i7), 0, 0, S.l.f7374V);
                }
                return X3.y.a;
            default:
                F0.j0 j0Var3 = (F0.j0) obj;
                ArrayList arrayList3 = this.f1041e;
                int size3 = arrayList3.size();
                int i8 = 0;
                while (i8 < size3) {
                    C2009g c2009g = (C2009g) arrayList3.get(i8);
                    List list = c2009g.f16106b;
                    boolean z5 = c2009g.f16111g;
                    if (c2009g.f16115k == Integer.MIN_VALUE) {
                        AbstractC1734b.a("position() should be called first");
                    }
                    int size4 = list.size();
                    int i9 = 0;
                    while (i9 < size4) {
                        F0.k0 k0Var = (F0.k0) list.get(i9);
                        int i10 = i8;
                        long e6 = e1.j.e((r12[r13 + 1] & 4294967295L) | (c2009g.f16113i[i9 * 2] << 32), c2009g.f16107c);
                        if (z5) {
                            F0.j0.q(j0Var3, k0Var, e6);
                        } else {
                            F0.j0.o(j0Var3, k0Var, e6);
                        }
                        i9++;
                        i8 = i10;
                    }
                    i8++;
                }
                return X3.y.a;
        }
    }
}
