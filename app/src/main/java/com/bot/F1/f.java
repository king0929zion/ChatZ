package F1;

import java.util.LinkedHashMap;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f extends c {
    public f(c cVar) {
        AbstractC1276k.f(cVar, "initialExtras");
        LinkedHashMap linkedHashMap = cVar.a;
        AbstractC1276k.f(linkedHashMap, "initialExtras");
        this.a.putAll(linkedHashMap);
    }

    @Override // F1.c
    public final Object a(b bVar) {
        return this.a.get(bVar);
    }

    public /* synthetic */ f() {
        this(a.f1544b);
    }
}
