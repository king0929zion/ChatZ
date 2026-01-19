package m4;

import Y3.B;
import b0.InterfaceC0870c;
import i4.AbstractC1117a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l4.InterfaceC1193a;
import s4.InterfaceC1672b;
import u4.AbstractC1776n;

/* renamed from: m4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1270e implements InterfaceC1672b, InterfaceC1269d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f12963b;
    public final Class a;

    static {
        List I5 = Y4.l.I(InterfaceC1193a.class, l4.c.class, l4.e.class, l4.f.class, l4.g.class, l4.h.class, l4.i.class, InterfaceC0870c.class, l4.j.class, InterfaceC0870c.class, InterfaceC0870c.class, InterfaceC0870c.class, l4.b.class, InterfaceC0870c.class, InterfaceC0870c.class, InterfaceC0870c.class, InterfaceC0870c.class, InterfaceC0870c.class, InterfaceC0870c.class, InterfaceC0870c.class, InterfaceC0870c.class, InterfaceC0870c.class, l4.d.class);
        ArrayList arrayList = new ArrayList(Y3.n.Z(I5, 10));
        int i6 = 0;
        for (Object obj : I5) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                Y4.l.U();
                throw null;
            }
            arrayList.add(new X3.i((Class) obj, Integer.valueOf(i6)));
            i6 = i7;
        }
        f12963b = B.c0(arrayList);
    }

    public C1270e(Class cls) {
        AbstractC1276k.f(cls, "jClass");
        this.a = cls;
    }

    @Override // m4.InterfaceC1269d
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String c6;
        Class cls = this.a;
        AbstractC1276k.f(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String c7 = AbstractC1291z.c(cls.getName());
            return c7 == null ? cls.getCanonicalName() : c7;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (c6 = AbstractC1291z.c(componentType.getName())) != null) {
            str = c6.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String c() {
        String e6;
        Class cls = this.a;
        AbstractC1276k.f(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String e7 = AbstractC1291z.e(cls.getName());
                return e7 == null ? cls.getSimpleName() : e7;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (e6 = AbstractC1291z.e(componentType.getName())) != null) {
                str = e6.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC1776n.f0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC1776n.e0('$', simpleName, simpleName);
        }
        return AbstractC1776n.f0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean d(Object obj) {
        Class cls = this.a;
        AbstractC1276k.f(cls, "jClass");
        Map map = f12963b;
        AbstractC1276k.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return AbstractC1291z.d(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = AbstractC1117a.p(AbstractC1289x.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1270e) && AbstractC1117a.p(this).equals(AbstractC1117a.p((InterfaceC1672b) obj));
    }

    public final int hashCode() {
        return AbstractC1117a.p(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
