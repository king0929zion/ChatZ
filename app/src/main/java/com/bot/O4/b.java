package O4;

import com.vladsch.flexmark.parser.PegdownExtensions;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class b {
    public static final int a;

    static {
        Object b5;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC1276k.e(property, "getProperty(...)");
            b5 = u4.u.E(property);
        } catch (Throwable th) {
            b5 = X3.a.b(th);
        }
        if (b5 instanceof X3.k) {
            b5 = null;
        }
        Integer num = (Integer) b5;
        a = num != null ? num.intValue() : PegdownExtensions.TASKLISTITEMS;
    }
}
