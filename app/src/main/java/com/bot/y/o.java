package Y;

import java.util.Iterator;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public abstract class o implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9573c = n.f9569e.f9572d;

    /* renamed from: e, reason: collision with root package name */
    public int f9574e;

    /* renamed from: f, reason: collision with root package name */
    public int f9575f;

    public final void a(Object[] objArr, int i6, int i7) {
        this.f9573c = objArr;
        this.f9574e = i6;
        this.f9575f = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9575f < this.f9574e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
