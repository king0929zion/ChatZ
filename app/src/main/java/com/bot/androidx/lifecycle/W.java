package androidx.lifecycle;

import i4.AbstractC1117a;
import m4.C1270e;

/* loaded from: classes.dex */
public interface W {
    default U a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default U b(Class cls, F1.f fVar) {
        return a(cls);
    }

    default U c(C1270e c1270e, F1.f fVar) {
        return b(AbstractC1117a.o(c1270e), fVar);
    }
}
