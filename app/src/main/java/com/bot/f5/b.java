package f5;

import B0.C0033i;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h5.c;
import h5.d;
import h5.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* loaded from: classes.dex */
public abstract class b {
    public static volatile int a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0033i f11763b = new C0033i();

    /* renamed from: c, reason: collision with root package name */
    public static final h5.b f11764c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11765d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f11766e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f11767f;

    /* JADX WARN: Type inference failed for: r0v1, types: [h5.b, java.lang.Object] */
    static {
        String str;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        f11765d = str == null ? false : str.equalsIgnoreCase("true");
        f11766e = new String[]{"1.6", "1.7"};
        f11767f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() {
        LinkedHashSet linkedHashSet;
        try {
            try {
                try {
                    if (f()) {
                        linkedHashSet = null;
                    } else {
                        linkedHashSet = b();
                        i(linkedHashSet);
                    }
                    StaticLoggerBinder.getSingleton();
                    a = 3;
                    h(linkedHashSet);
                    g();
                } catch (NoClassDefFoundError e6) {
                    String message = e6.getMessage();
                    if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                        a = 2;
                        System.err.println("Failed to instantiate SLF4J LoggerFactory");
                        System.err.println("Reported exception:");
                        e6.printStackTrace();
                        throw e6;
                    }
                    a = 4;
                    e.g0("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    e.g0("Defaulting to no-operation (NOP) logger implementation");
                    e.g0("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                    g();
                }
            } catch (Exception e7) {
                a = 2;
                System.err.println("Failed to instantiate SLF4J LoggerFactory");
                System.err.println("Reported exception:");
                e7.printStackTrace();
                throw new IllegalStateException("Unexpected initialization failure", e7);
            } catch (NoSuchMethodError e8) {
                String message2 = e8.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    a = 2;
                    e.g0("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    e.g0("Your binding is version 1.5.5 or earlier.");
                    e.g0("Upgrade your binding to version 1.6.x.");
                }
                throw e8;
            }
        } catch (Throwable th) {
            g();
            throw th;
        }
    }

    public static LinkedHashSet b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = b.class.getClassLoader();
            String str = f11767f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e6) {
            System.err.println("Error getting resources from path");
            System.err.println("Reported exception:");
            e6.printStackTrace();
            return linkedHashSet;
        }
    }

    public static ILoggerFactory c() {
        if (a == 0) {
            synchronized (b.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        a();
                        if (a == 3) {
                            j();
                        }
                    }
                } finally {
                }
            }
        }
        int i6 = a;
        if (i6 == 1) {
            return f11763b;
        }
        if (i6 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i6 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i6 == 4) {
            return f11764c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.SecurityManager] */
    public static a d(Class cls) {
        int i6;
        d dVar;
        a e6 = e(cls.getName());
        if (f11765d) {
            d dVar2 = e.a;
            Class cls2 = null;
            d dVar3 = dVar2;
            if (dVar2 == null) {
                if (e.f11928b) {
                    dVar3 = null;
                } else {
                    try {
                        dVar = new SecurityManager();
                    } catch (SecurityException unused) {
                        dVar = null;
                    }
                    e.a = dVar;
                    e.f11928b = true;
                    dVar3 = dVar;
                }
            }
            if (dVar3 != null) {
                Class[] classContext = dVar3.getClassContext();
                String name = e.class.getName();
                int i7 = 0;
                while (i7 < classContext.length && !name.equals(classContext[i7].getName())) {
                    i7++;
                }
                if (i7 >= classContext.length || (i6 = i7 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i6];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                e.g0("Detected logger name mismatch. Given name: \"" + e6.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                e.g0("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return e6;
    }

    public static a e(String str) {
        return c().a(str);
    }

    public static boolean f() {
        String str;
        try {
            str = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains("android");
    }

    public static void g() {
        C0033i c0033i = f11763b;
        synchronized (c0033i) {
            try {
                c0033i.f452c = true;
                ArrayList arrayList = new ArrayList(((HashMap) c0033i.f453e).values());
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    c cVar = (c) obj;
                    cVar.f11922e = e(cVar.f11921c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) f11763b.f454f;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(PegdownExtensions.FENCED_CODE_BLOCKS);
        int i7 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, PegdownExtensions.FENCED_CODE_BLOCKS) != 0) {
            int size3 = arrayList2.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj2 = arrayList2.get(i8);
                i8++;
                g5.b bVar = (g5.b) obj2;
                if (bVar != null) {
                    c cVar2 = bVar.a;
                    String str = cVar2.f11921c;
                    if (cVar2.f11922e == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(cVar2.f11922e instanceof h5.a)) {
                        if (!cVar2.e()) {
                            e.g0(str);
                        } else if (cVar2.e()) {
                            try {
                                cVar2.f11924g.invoke(cVar2.f11922e, bVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i9 = i7 + 1;
                if (i7 == 0) {
                    if (bVar.a.e()) {
                        e.g0("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        e.g0("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        e.g0("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(bVar.a.f11922e instanceof h5.a)) {
                        e.g0("The following set of substitute loggers may have been accessed");
                        e.g0("during the initialization phase. Logging calls during this");
                        e.g0("phase were not honored. However, subsequent logging calls to these");
                        e.g0("loggers will work as normally expected.");
                        e.g0("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i7 = i9;
            }
            arrayList2.clear();
        }
        C0033i c0033i2 = f11763b;
        ((HashMap) c0033i2.f453e).clear();
        ((LinkedBlockingQueue) c0033i2.f454f).clear();
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        e.g0("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static void i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            e.g0("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                e.g0("Found binding in [" + ((URL) it.next()) + "]");
            }
            e.g0("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z5 = false;
            for (String str2 : f11766e) {
                if (str.startsWith(str2)) {
                    z5 = true;
                }
            }
            if (z5) {
                return;
            }
            e.g0("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f11766e).toString());
            e.g0("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            System.err.println("Unexpected problem occured during version sanity check");
            System.err.println("Reported exception:");
            th.printStackTrace();
        }
    }
}
