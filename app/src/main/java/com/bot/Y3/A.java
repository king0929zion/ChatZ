package Y3;

import java.util.Iterator;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public abstract class A implements Iterator, InterfaceC1372a {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
