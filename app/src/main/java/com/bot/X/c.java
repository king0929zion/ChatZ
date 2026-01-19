package X;

import Y3.AbstractC0737d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public abstract class c implements AbstractC0737d, List, Collection, InterfaceC1372a,    {
    public abstract c b(int i6, Object obj);

    public abstract c c(Object obj);

    @Override // Y3.AbstractC0734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // Y3.AbstractC0734a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public c d(Collection collection) {
        g e6 = e();
        e6.addAll(collection);
        return e6.c();
    }

    public abstract g e();

    public abstract c f(b bVar);

    public abstract c g(int i6);

    public abstract c h(int i6, Object obj);

    @Override // Y3.AbstractC0737d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public final List subList(int i6, int i7) {
        return new W.a(this, i6, i7);
    }
}
