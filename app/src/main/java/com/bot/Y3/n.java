package Y3;

import java.util.Collection;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class n extends Y4.l {
    public static int Z(Iterable iterable, int i6) {
        AbstractC1276k.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i6;
    }
}
