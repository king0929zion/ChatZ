package X3;

import c4.EnumC0927a;
import f4.AbstractC1011a;
import g4.AbstractC1021a;
import i4.AbstractC1120d;
import java.lang.reflect.Method;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class a {
    public static final EnumC0927a a = EnumC0927a.f11114c;

    public static void a(Throwable th, Throwable th2) {
        AbstractC1276k.f(th, "<this>");
        AbstractC1276k.f(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC1021a.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC1011a.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final k b(Throwable th) {
        AbstractC1276k.f(th, "exception");
        return new k(th);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X3.m, java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, X3.f, X3.z] */
    public static f c(g gVar, InterfaceC1193a interfaceC1193a) {
        v vVar = v.a;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return new n(interfaceC1193a);
        }
        if (ordinal == 1) {
            Object obj = new Object();
            obj.f9398c = interfaceC1193a;
            obj.f9399e = vVar;
            return obj;
        }
        if (ordinal != 2) {
            throw new RuntimeException();
        }
        Object obj2 = new Object();
        obj2.f9414c = interfaceC1193a;
        obj2.f9415e = vVar;
        return obj2;
    }

    public static n d(InterfaceC1193a interfaceC1193a) {
        AbstractC1276k.f(interfaceC1193a, "initializer");
        return new n(interfaceC1193a);
    }

    public static final void e(Object obj) {
        if (obj instanceof k) {
            throw ((k) obj).f9395c;
        }
    }

    public static final double f(long j3) {
        return ((j3 >>> 11) * 2048) + (j3 & 2047);
    }

    public static final String g(long j3, int i6) {
        if (j3 >= 0) {
            AbstractC1120d.g(i6);
            String l3 = Long.toString(j3, i6);
            AbstractC1276k.e(l3, "toString(...)");
            return l3;
        }
        long j4 = i6;
        long j5 = ((j3 >>> 1) / j4) << 1;
        long j6 = j3 - (j5 * j4);
        if (j6 >= j4) {
            j6 -= j4;
            j5++;
        }
        AbstractC1120d.g(i6);
        String l5 = Long.toString(j5, i6);
        AbstractC1276k.e(l5, "toString(...)");
        AbstractC1120d.g(i6);
        String l6 = Long.toString(j6, i6);
        AbstractC1276k.e(l6, "toString(...)");
        return l5.concat(l6);
    }
}
