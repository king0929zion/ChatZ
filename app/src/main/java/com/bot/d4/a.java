package d4;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.vladsch.flexmark.util.html.Attribute;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC0905c, d, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0905c f11433c;

    public a(InterfaceC0905c interfaceC0905c) {
        this.f11433c = interfaceC0905c;
    }

    public d g() {
        InterfaceC0905c interfaceC0905c = this.f11433c;
        if (interfaceC0905c instanceof d) {
            return (d) interfaceC0905c;
        }
        return null;
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        InterfaceC0905c interfaceC0905c = this;
        while (true) {
            a aVar = (a) interfaceC0905c;
            InterfaceC0905c interfaceC0905c2 = aVar.f11433c;
            AbstractC1276k.c(interfaceC0905c2);
            try {
                obj = aVar.r(obj);
                if (obj == EnumC0927a.f11114c) {
                    return;
                }
            } catch (Throwable th) {
                obj = X3.a.b(th);
            }
            aVar.s();
            if (!(interfaceC0905c2 instanceof a)) {
                interfaceC0905c2.k(obj);
                return;
            }
            interfaceC0905c = interfaceC0905c2;
        }
    }

    public InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement q() {
        int i6;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v5 = eVar.v();
        if (v5 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v5 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i6 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i6 = -1;
        }
        int i7 = i6 >= 0 ? eVar.l()[i6] : -1;
        Z4.i iVar = f.f11437b;
        Z4.i iVar2 = f.a;
        if (iVar == null) {
            try {
                Z4.i iVar3 = new Z4.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(Attribute.NAME_ATTR, null));
                f.f11437b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                f.f11437b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2 && (method = iVar.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = iVar.f10551b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = iVar.f10552c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i7);
    }

    public abstract Object r(Object obj);

    public void s() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object q3 = q();
        if (q3 == null) {
            q3 = getClass().getName();
        }
        sb.append(q3);
        return sb.toString();
    }
}
