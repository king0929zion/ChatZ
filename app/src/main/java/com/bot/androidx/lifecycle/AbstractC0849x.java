package androidx.lifecycle;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import m4.AbstractC1276k;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0849x {
    public static final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f10891b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0845t interfaceC0845t) {
        try {
            AbstractC1276k.c(constructor.newInstance(interfaceC0845t));
            throw new ClassCastException();
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z5;
        HashMap hashMap = a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i6 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r42 != null ? r42.getName() : FlexmarkHtmlConverter.DEFAULT_NODE;
                AbstractC1276k.c(name);
                if (name.length() != 0) {
                    AbstractC1276k.c(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC1276k.e(canonicalName, "substring(...)");
                }
                AbstractC1276k.c(canonicalName);
                String concat = u4.u.B(canonicalName, ".", "_", false).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
            HashMap hashMap2 = f10891b;
            if (constructor != null) {
                hashMap2.put(cls, Y4.l.H(constructor));
            } else {
                C0830d c0830d = C0830d.f10868c;
                HashMap hashMap3 = c0830d.f10869b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z5 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z5 = false;
                                break;
                            }
                            if (((InterfaceC0850y) declaredMethods[i7].getAnnotation(InterfaceC0850y.class)) != null) {
                                c0830d.a(cls, declaredMethods);
                                z5 = true;
                                break;
                            }
                            i7++;
                        }
                    } catch (NoClassDefFoundError e7) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
                    }
                }
                if (!z5) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0845t.class.isAssignableFrom(superclass)) {
                        AbstractC1276k.c(superclass);
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            AbstractC1276k.c(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    K4.h i8 = AbstractC1276k.i(cls.getInterfaces());
                    while (true) {
                        if (i8.hasNext()) {
                            Class cls2 = (Class) i8.next();
                            if (cls2 != null && InterfaceC0845t.class.isAssignableFrom(cls2)) {
                                AbstractC1276k.c(cls2);
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                AbstractC1276k.c(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i6 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i6));
        return i6;
    }
}
