package t4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements h {
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14945b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.c f14946c;

    public f(h hVar, boolean z5, l4.c cVar) {
        this.a = hVar;
        this.f14945b = z5;
        this.f14946c = cVar;
    }

    @Override // t4.h
    public final Iterator iterator() {
        return new e(this);
    }
}
