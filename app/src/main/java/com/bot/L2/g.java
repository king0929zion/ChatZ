package L2;

import M4.C0255c;
import M4.n0;
import N4.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g {
    public static final m a = E2.b.a;

    public static String a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        m mVar = a;
        mVar.getClass();
        return mVar.b(new C0255c(n0.a, 0), arrayList);
    }
}
