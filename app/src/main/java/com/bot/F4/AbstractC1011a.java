package f4;

import java.lang.reflect.Method;
import m4.AbstractC1276k;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1011a {
    public static final Method a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f11762b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        AbstractC1276k.c(methods);
        int length = methods.length;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            method = null;
            if (i7 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i7];
            if (AbstractC1276k.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC1276k.e(parameterTypes, "getParameterTypes(...)");
                if (AbstractC1276k.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i7++;
        }
        a = method2;
        int length2 = methods.length;
        while (true) {
            if (i6 >= length2) {
                break;
            }
            Method method3 = methods[i6];
            if (AbstractC1276k.b(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i6++;
        }
        f11762b = method;
    }
}
