package L3;

import Y3.m;
import java.util.List;
import java.util.ServiceLoader;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class a {
    public static final List a;

    static {
        ServiceLoader load = ServiceLoader.load(M3.d.class, M3.d.class.getClassLoader());
        AbstractC1276k.e(load, "load(it, it.classLoader)");
        a = m.J0(load);
    }
}
