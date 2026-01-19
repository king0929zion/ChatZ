package Y3;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import n4.InterfaceC1372a;
import n4.InterfaceC1373b;

/* loaded from: classes.dex */
public abstract class r extends q {
    public static void c0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC1276k.f(abstractCollection, "<this>");
        AbstractC1276k.f(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static void d0(List list, l4.c cVar) {
        int C5;
        AbstractC1276k.f(list, "<this>");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC1372a) && !(list instanceof InterfaceC1373b)) {
                AbstractC1291z.f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) cVar.f(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int C6 = Y4.l.C(list);
        int i6 = 0;
        if (C6 >= 0) {
            int i7 = 0;
            while (true) {
                Object obj = list.get(i6);
                if (!((Boolean) cVar.f(obj)).booleanValue()) {
                    if (i7 != i6) {
                        list.set(i7, obj);
                    }
                    i7++;
                }
                if (i6 == C6) {
                    break;
                } else {
                    i6++;
                }
            }
            i6 = i7;
        }
        if (i6 >= list.size() || i6 > (C5 = Y4.l.C(list))) {
            return;
        }
        while (true) {
            list.remove(C5);
            if (C5 == i6) {
                return;
            } else {
                C5--;
            }
        }
    }

    public static Object e0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object f0(List list) {
        AbstractC1276k.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(Y4.l.C(list));
    }

    public static Object g0(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(Y4.l.C(abstractList));
    }
}
