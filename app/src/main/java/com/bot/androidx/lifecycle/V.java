package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class V extends X {

    /* renamed from: c, reason: collision with root package name */
    public static V f10862c;

    /* renamed from: d, reason: collision with root package name */
    public static final N f10863d = new N(2);

    /* renamed from: b, reason: collision with root package name */
    public final Application f10864b;

    public V(Application application) {
        this.f10864b = application;
    }

    @Override // androidx.lifecycle.X, androidx.lifecycle.W
    public final U a(Class cls) {
        Application application = this.f10864b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.X, androidx.lifecycle.W
    public final U b(Class cls, F1.f fVar) {
        if (this.f10864b != null) {
            return a(cls);
        }
        Application application = (Application) fVar.a.get(f10863d);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0827a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return AbstractC1410a.m(cls);
    }

    public final U d(Class cls, Application application) {
        if (!AbstractC0827a.class.isAssignableFrom(cls)) {
            return AbstractC1410a.m(cls);
        }
        try {
            U u5 = (U) cls.getConstructor(Application.class).newInstance(application);
            AbstractC1276k.c(u5);
            return u5;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }
}
