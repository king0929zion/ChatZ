package org.jsoup.select;

import java.util.IdentityHashMap;
import java.util.function.Supplier;
import org.jsoup.select.StructuralEvaluator;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i6) {
        this.a = i6;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return StructuralEvaluator.Has.b();
            case 1:
                return new Elements();
            default:
                return new IdentityHashMap();
        }
    }
}
