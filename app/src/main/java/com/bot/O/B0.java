package O;

import D.C0074j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class B0 implements F0.V {
    public static final B0 a = new Object();

    @Override // F0.V
    public final F0.W e(F0.X x5, List list, long j3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            F0.k0 w5 = ((F0.U) list.get(i8)).w(j3);
            i6 = Math.max(i6, w5.f1485c);
            i7 = Math.max(i7, w5.f1486e);
            arrayList.add(w5);
        }
        return x5.D(i6, i7, Y3.w.f9813c, new C0074j(1, arrayList));
    }
}
