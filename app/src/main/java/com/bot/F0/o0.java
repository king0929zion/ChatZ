package F0;

import java.util.ArrayList;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class o0 extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1501f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i6, ArrayList arrayList) {
        super(1);
        this.f1500e = i6;
        this.f1501f = arrayList;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f1500e) {
            case 0:
                j0 j0Var = (j0) obj;
                ArrayList arrayList = this.f1501f;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    j0.m(j0Var, (k0) arrayList.get(i6), 0, 0);
                }
                return X3.y.a;
            case 1:
                j0 j0Var2 = (j0) obj;
                ArrayList arrayList2 = this.f1501f;
                int size2 = arrayList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    j0.l(j0Var2, (k0) arrayList2.get(i7), 0, 0);
                }
                return X3.y.a;
            case 2:
                j0 j0Var3 = (j0) obj;
                ArrayList arrayList3 = this.f1501f;
                int C5 = Y4.l.C(arrayList3);
                if (C5 >= 0) {
                    int i8 = 0;
                    while (true) {
                        j0.l(j0Var3, (k0) arrayList3.get(i8), 0, 0);
                        if (i8 != C5) {
                            i8++;
                        }
                    }
                }
                return X3.y.a;
            default:
                j0 j0Var4 = (j0) obj;
                ArrayList arrayList4 = this.f1501f;
                int size3 = arrayList4.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    j0Var4.h((k0) arrayList4.get(i9), 0, 0, S.l.f7374V);
                }
                return X3.y.a;
        }
    }
}
