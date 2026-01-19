package m4;

import j1.AbstractC1135a;
import java.util.Arrays;

/* renamed from: m4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1276k {
    public static boolean a(float f6, Float f7) {
        return f7 != null && f6 == f7.floatValue();
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        j(nullPointerException, AbstractC1276k.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        j(nullPointerException, AbstractC1276k.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        j(nullPointerException, AbstractC1276k.class.getName());
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC1276k.class.getName();
            int i6 = 0;
            while (!stackTrace[i6].getClassName().equals(name)) {
                i6++;
            }
            while (stackTrace[i6].getClassName().equals(name)) {
                i6++;
            }
            StackTraceElement stackTraceElement = stackTrace[i6];
            StringBuilder u5 = B3.e.u("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            u5.append(str);
            NullPointerException nullPointerException = new NullPointerException(u5.toString());
            j(nullPointerException, AbstractC1276k.class.getName());
            throw nullPointerException;
        }
    }

    public static int g(int i6, int i7) {
        if (i6 < i7) {
            return -1;
        }
        return i6 == i7 ? 0 : 1;
    }

    public static int h(long j3, long j4) {
        if (j3 < j4) {
            return -1;
        }
        return j3 == j4 ? 0 : 1;
    }

    public static final K4.h i(Object[] objArr) {
        f(objArr, "array");
        return new K4.h(objArr);
    }

    public static void j(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i6 = -1;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(stackTrace[i7].getClassName())) {
                i6 = i7;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i6 + 1, length));
    }

    public static void k(String str) {
        RuntimeException runtimeException = new RuntimeException(AbstractC1135a.s("lateinit property ", str, " has not been initialized"));
        j(runtimeException, AbstractC1276k.class.getName());
        throw runtimeException;
    }
}
