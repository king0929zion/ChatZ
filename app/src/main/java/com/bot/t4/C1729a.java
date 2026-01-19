package t4;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1729a implements h {
    public final AtomicReference a;

    public C1729a(h hVar) {
        this.a = new AtomicReference(hVar);
    }

    @Override // t4.h
    public final Iterator iterator() {
        h hVar = (h) this.a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
