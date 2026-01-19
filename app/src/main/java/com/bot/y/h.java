package Y;

import java.util.Iterator;
import java.util.Map;
import n4.InterfaceC1372a;
import u0.G;
import u0.I;

/* loaded from: classes.dex */
public final class h implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9561c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f9562e;

    public h(e eVar) {
        o[] oVarArr = new o[8];
        for (int i6 = 0; i6 < 8; i6++) {
            oVarArr[i6] = new q(this);
        }
        this.f9562e = new f(eVar, oVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9561c) {
            case 0:
                return ((f) this.f9562e).f9548f;
            default:
                return this.f9562e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9561c) {
            case 0:
                return (Map.Entry) ((f) this.f9562e).next();
            default:
                return (I) this.f9562e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9561c) {
            case 0:
                ((f) this.f9562e).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(G g3) {
        this.f9562e = g3.f14983m.iterator();
    }
}
