package Y3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class q implements p {
    public static void a0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void b0(List list, Comparator comparator) {
        AbstractC1276k.f(list, "<this>");
        AbstractC1276k.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
