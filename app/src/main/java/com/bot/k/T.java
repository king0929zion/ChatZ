package k;

import java.util.List;
import l.AbstractC1180a;

/* loaded from: classes.dex */
public abstract class T {
    public static final Object[] a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public static final I f12508b = new I(0);

    public static final void a(List list, int i6) {
        int size = list.size();
        if (i6 < 0 || i6 >= size) {
            AbstractC1180a.d("Index " + i6 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(List list, int i6, int i7) {
        int size = list.size();
        if (i6 > i7) {
            AbstractC1180a.c("Indices are out of order. fromIndex (" + i6 + ") is greater than toIndex (" + i7 + ").");
            throw null;
        }
        if (i6 < 0) {
            AbstractC1180a.d("fromIndex (" + i6 + ") is less than 0.");
            throw null;
        }
        if (i7 <= size) {
            return;
        }
        AbstractC1180a.d("toIndex (" + i7 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
