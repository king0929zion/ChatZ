package F0;

import e1.AbstractC0960b;
import e1.C0959a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p0 extends H0.G {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f1507b = new H0.G("Undefined intrinsics block and it is required");

    @Override // F0.V
    public final W e(X x5, List list, long j3) {
        int size = list.size();
        Y3.w wVar = Y3.w.f9813c;
        if (size == 0) {
            return x5.D(C0959a.j(j3), C0959a.i(j3), wVar, l0.f1492g);
        }
        if (size == 1) {
            k0 w5 = ((U) list.get(0)).w(j3);
            return x5.D(AbstractC0960b.g(j3, w5.f1485c), AbstractC0960b.f(j3, w5.f1486e), wVar, new n0(w5, 0));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size2; i8++) {
            k0 w6 = ((U) list.get(i8)).w(j3);
            i6 = Math.max(w6.f1485c, i6);
            i7 = Math.max(w6.f1486e, i7);
            arrayList.add(w6);
        }
        return x5.D(AbstractC0960b.g(j3, i6), AbstractC0960b.f(j3, i7), wVar, new o0(0, arrayList));
    }
}
