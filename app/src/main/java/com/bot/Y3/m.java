package Y3;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i1.AbstractC1087g;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class m extends r {
    public static ArrayList A0(Collection collection, Object obj) {
        AbstractC1276k.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList B0(r4.c cVar, r4.c cVar2) {
        if (cVar instanceof Collection) {
            return z0((Collection) cVar, cVar2);
        }
        ArrayList arrayList = new ArrayList();
        r.c0(cVar, arrayList);
        r.c0(cVar2, arrayList);
        return arrayList;
    }

    public static List C0(Iterable iterable) {
        AbstractC1276k.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return J0(iterable);
        }
        List L02 = L0(iterable);
        Collections.reverse(L02);
        return L02;
    }

    public static Object D0(List list) {
        AbstractC1276k.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object E0(List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List F0(AbstractList abstractList) {
        AbstractC1276k.f(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return J0(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        AbstractC1276k.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return k.a0(array);
    }

    public static List G0(Iterable iterable, Comparator comparator) {
        AbstractC1276k.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List L02 = L0(iterable);
            q.b0(L02, comparator);
            return L02;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return J0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        k.z0(array, comparator);
        return k.a0(array);
    }

    public static List H0(Iterable iterable, int i6) {
        AbstractC1276k.f(iterable, "<this>");
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.l("Requested element count ", i6, " is less than zero.").toString());
        }
        if (i6 == 0) {
            return v.f9812c;
        }
        if (iterable instanceof Collection) {
            if (i6 >= ((Collection) iterable).size()) {
                return J0(iterable);
            }
            if (i6 == 1) {
                return Y4.l.H(n0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i6);
        Iterator it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i7++;
            if (i7 == i6) {
                break;
            }
        }
        return Y4.l.L(arrayList);
    }

    public static final void I0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC1276k.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List J0(Iterable iterable) {
        AbstractC1276k.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return Y4.l.L(L0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return v.f9812c;
        }
        if (size != 1) {
            return K0(collection);
        }
        return Y4.l.H(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList K0(Collection collection) {
        AbstractC1276k.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List L0(Iterable iterable) {
        AbstractC1276k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return K0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        I0(iterable, arrayList);
        return arrayList;
    }

    public static Set M0(Iterable iterable) {
        AbstractC1276k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        I0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set N0(Iterable iterable) {
        AbstractC1276k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return h5.e.i0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(C.H(collection.size()));
                I0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            I0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : h5.e.i0(linkedHashSet2.iterator().next());
            }
        }
        return x.f9814c;
    }

    public static t h0(Iterable iterable) {
        AbstractC1276k.f(iterable, "<this>");
        return new t(iterable, 0);
    }

    public static double i0(ArrayList arrayList) {
        int size = arrayList.size();
        double d6 = 0.0d;
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d6 += ((Number) obj).floatValue();
            i6++;
            if (i6 < 0) {
                Y4.l.T();
                throw null;
            }
        }
        if (i6 == 0) {
            return Double.NaN;
        }
        return d6 / i6;
    }

    public static boolean j0(Iterable iterable, Object obj) {
        AbstractC1276k.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : s0(iterable, obj) >= 0;
    }

    public static List k0(List list) {
        AbstractC1276k.f(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            return v.f9812c;
        }
        if (size == 1) {
            return Y4.l.H(w0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i6 = 1; i6 < size2; i6++) {
                arrayList.add(list.get(i6));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List l0(List list) {
        AbstractC1276k.f(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return H0(list, size);
    }

    public static Object m0(int i6, Collection collection) {
        AbstractC1276k.f(collection, "<this>");
        boolean z5 = collection instanceof List;
        if (z5) {
            return ((List) collection).get(i6);
        }
        s sVar = new s(i6);
        if (z5) {
            List list = (List) collection;
            if (i6 >= 0 && i6 < list.size()) {
                return list.get(i6);
            }
            sVar.f(Integer.valueOf(i6));
            throw null;
        }
        if (i6 < 0) {
            sVar.f(Integer.valueOf(i6));
            throw null;
        }
        int i7 = 0;
        for (Object obj : collection) {
            int i8 = i7 + 1;
            if (i6 == i7) {
                return obj;
            }
            i7 = i8;
        }
        sVar.f(Integer.valueOf(i6));
        throw null;
    }

    public static Object n0(Iterable iterable) {
        AbstractC1276k.f(iterable, "<this>");
        if (iterable instanceof List) {
            return o0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object o0(List list) {
        AbstractC1276k.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object p0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object q0(List list) {
        AbstractC1276k.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object r0(List list, int i6) {
        AbstractC1276k.f(list, "<this>");
        if (i6 < 0 || i6 >= list.size()) {
            return null;
        }
        return list.get(i6);
    }

    public static int s0(Iterable iterable, Object obj) {
        AbstractC1276k.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i6 = 0;
        for (Object obj2 : iterable) {
            if (i6 < 0) {
                Y4.l.U();
                throw null;
            }
            if (AbstractC1276k.b(obj, obj2)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static final void t0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, l4.c cVar) {
        AbstractC1276k.f(iterable, "<this>");
        sb.append(charSequence2);
        int i6 = 0;
        for (Object obj : iterable) {
            i6++;
            if (i6 > 1) {
                sb.append(charSequence);
            }
            AbstractC1087g.g(sb, obj, cVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void u0(List list, StringBuilder sb, String str, l4.c cVar, int i6) {
        if ((i6 & 64) != 0) {
            cVar = null;
        }
        t0(list, sb, str, FlexmarkHtmlConverter.DEFAULT_NODE, FlexmarkHtmlConverter.DEFAULT_NODE, "...", cVar);
    }

    public static String v0(Iterable iterable, String str, String str2, String str3, l4.c cVar, int i6) {
        if ((i6 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i6 & 2) != 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : str2;
        String str6 = (i6 & 4) != 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : str3;
        if ((i6 & 32) != 0) {
            cVar = null;
        }
        AbstractC1276k.f(iterable, "<this>");
        AbstractC1276k.f(str5, "prefix");
        StringBuilder sb = new StringBuilder();
        t0(iterable, sb, str4, str5, str6, "...", cVar);
        return sb.toString();
    }

    public static Object w0(List list) {
        AbstractC1276k.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(Y4.l.C(list));
    }

    public static Object x0(List list) {
        AbstractC1276k.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable y0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList z0(Collection collection, Iterable iterable) {
        AbstractC1276k.f(collection, "<this>");
        AbstractC1276k.f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            r.c0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }
}
