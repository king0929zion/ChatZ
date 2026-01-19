package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class T {
    public static final List a = Y4.l.I(Application.class, K.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f10861b = Y4.l.H(K.class);

    public static final Constructor a(Class cls, List list) {
        AbstractC1276k.f(list, "signature");
        K4.h i6 = AbstractC1276k.i(cls.getConstructors());
        while (i6.hasNext()) {
            Constructor constructor = (Constructor) i6.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC1276k.e(parameterTypes, "getParameterTypes(...)");
            List B02 = Y3.k.B0(parameterTypes);
            if (list.equals(B02)) {
                return constructor;
            }
            if (list.size() == B02.size() && B02.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final U b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (U) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Failed to access " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e8.getCause());
        }
    }
}
