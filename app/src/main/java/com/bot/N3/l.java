package N3;

import java.util.Iterator;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class l implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3866c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f3867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3868f;

    public l(m mVar) {
        this.f3868f = mVar;
        this.f3867e = mVar.f3869c.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3866c) {
            case 0:
                return this.f3867e.hasNext();
            default:
                return this.f3867e.hasNext();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [m4.l, l4.c] */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3866c) {
            case 0:
                return ((m) this.f3868f).f3870e.f(this.f3867e.next());
            default:
                return ((t4.o) this.f3868f).f14956c.f(this.f3867e.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3866c) {
            case 0:
                this.f3867e.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(t4.o oVar) {
        this.f3868f = oVar;
        this.f3867e = oVar.f14955b.iterator();
    }
}
