package i1;

import F0.U;
import F0.V;
import F0.W;
import F0.X;
import F0.k0;
import F0.n0;
import F0.o0;
import e1.C0959a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086f implements V {

    /* renamed from: b, reason: collision with root package name */
    public static final C1086f f11985b = new C1086f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1086f f11986c = new C1086f(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C1086f(int i6) {
        this.a = i6;
    }

    @Override // F0.V
    public final W e(X x5, List list, long j3) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    k0 w5 = ((U) list.get(i8)).w(j3);
                    i6 = Math.max(i6, w5.f1485c);
                    i7 = Math.max(i7, w5.f1486e);
                    arrayList.add(w5);
                }
                if (list.isEmpty()) {
                    i6 = C0959a.j(j3);
                    i7 = C0959a.i(j3);
                }
                return x5.D(i6, i7, Y3.w.f9813c, new o0(1, arrayList));
            default:
                int size2 = list.size();
                Y3.w wVar = Y3.w.f9813c;
                if (size2 == 0) {
                    return x5.D(0, 0, wVar, C1084d.f11977j);
                }
                if (size2 == 1) {
                    k0 w6 = ((U) list.get(0)).w(j3);
                    return x5.D(w6.f1485c, w6.f1486e, wVar, new n0(w6, 2));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size3; i11++) {
                    k0 w7 = ((U) list.get(i11)).w(j3);
                    i9 = Math.max(i9, w7.f1485c);
                    i10 = Math.max(i10, w7.f1486e);
                    arrayList2.add(w7);
                }
                return x5.D(i9, i10, wVar, new o0(2, arrayList2));
        }
    }
}
