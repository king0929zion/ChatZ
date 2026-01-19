package V;

import java.util.List;

/* loaded from: classes.dex */
public abstract class f {
    public static final void a(List list, int i6) {
        int size = list.size();
        if (i6 < 0 || i6 >= size) {
            c(i6, size);
        }
    }

    public static final void b(List list, int i6, int i7) {
        if (i6 > i7) {
            f(i6, i7);
        }
        if (i6 < 0) {
            d(i6);
        }
        if (i7 > list.size()) {
            e(i7, list.size());
        }
    }

    private static final void c(int i6, int i7) {
        throw new IndexOutOfBoundsException(B3.e.i(i6, "Index ", i7, " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i6) {
        throw new IndexOutOfBoundsException(B3.e.l("fromIndex (", i6, ") is less than 0."));
    }

    private static final void e(int i6, int i7) {
        throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is more than than the list size (" + i7 + ')');
    }

    private static final void f(int i6, int i7) {
        throw new IllegalArgumentException(B3.e.i(i6, "Indices are out of order. fromIndex (", i7, ") is greater than toIndex (", ")."));
    }
}
