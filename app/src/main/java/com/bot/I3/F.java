package I3;

import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class F extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public static final F f2718e = new AbstractC1277l(1);

    @Override // l4.c
    public final Object f(Object obj) {
        X3.i iVar = (X3.i) obj;
        AbstractC1276k.f(iVar, "it");
        String str = (String) iVar.f9393c;
        Object obj2 = iVar.f9394e;
        if (obj2 == null) {
            return str;
        }
        return str + '=' + String.valueOf(obj2);
    }
}
