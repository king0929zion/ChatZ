package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0830d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0830d f10868c = new C0830d();
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10869b = new HashMap();

    public static void b(HashMap hashMap, C0829c c0829c, EnumC0841o enumC0841o, Class cls) {
        EnumC0841o enumC0841o2 = (EnumC0841o) hashMap.get(c0829c);
        if (enumC0841o2 == null || enumC0841o == enumC0841o2) {
            if (enumC0841o2 == null) {
                hashMap.put(c0829c, enumC0841o);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0829c.f10867b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0841o2 + ", new value " + enumC0841o);
    }

    public final C0828b a(Class cls, Method[] methodArr) {
        int i6;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            C0828b c0828b = (C0828b) hashMap2.get(superclass);
            if (c0828b == null) {
                c0828b = a(superclass, null);
            }
            hashMap.putAll(c0828b.f10866b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0828b c0828b2 = (C0828b) hashMap2.get(cls2);
            if (c0828b2 == null) {
                c0828b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0828b2.f10866b.entrySet()) {
                b(hashMap, (C0829c) entry.getKey(), (EnumC0841o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            InterfaceC0850y interfaceC0850y = (InterfaceC0850y) method.getAnnotation(InterfaceC0850y.class);
            if (interfaceC0850y != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i6 = 0;
                } else {
                    if (!InterfaceC0846u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i6 = 1;
                }
                EnumC0841o value = interfaceC0850y.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0841o.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0841o.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i6 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0829c(i6, method), value, cls);
                z5 = true;
            }
        }
        C0828b c0828b3 = new C0828b(hashMap);
        hashMap2.put(cls, c0828b3);
        this.f10869b.put(cls, Boolean.valueOf(z5));
        return c0828b3;
    }
}
