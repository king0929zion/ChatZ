package e2;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.C1159f;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0962a {
    public final C1159f a;

    /* renamed from: b, reason: collision with root package name */
    public final C1159f f11581b;

    /* renamed from: c, reason: collision with root package name */
    public final C1159f f11582c;

    public AbstractC0962a(C1159f c1159f, C1159f c1159f2, C1159f c1159f3) {
        this.a = c1159f;
        this.f11581b = c1159f2;
        this.f11582c = c1159f3;
    }

    public abstract C0963b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C1159f c1159f = this.f11582c;
        Class cls2 = (Class) c1159f.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1159f.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C1159f c1159f = this.a;
        Method method = (Method) c1159f.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0962a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0962a.class);
        c1159f.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C1159f c1159f = this.f11581b;
        Method method = (Method) c1159f.get(name);
        if (method != null) {
            return method;
        }
        Class b5 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b5.getDeclaredMethod("write", cls, AbstractC0962a.class);
        c1159f.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i6);

    public final Parcelable f(Parcelable parcelable, int i6) {
        if (!e(i6)) {
            return parcelable;
        }
        return ((C0963b) this).f11584e.readParcelable(C0963b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((C0963b) this).f11584e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (e9.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e9.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
        }
    }

    public abstract void h(int i6);

    public final void i(c cVar) {
        if (cVar == null) {
            ((C0963b) this).f11584e.writeString(null);
            return;
        }
        try {
            ((C0963b) this).f11584e.writeString(b(cVar.getClass()).getName());
            C0963b a = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a);
                Parcel parcel = a.f11584e;
                int i6 = a.f11588i;
                if (i6 >= 0) {
                    int i7 = a.f11583d.get(i6);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i7);
                    parcel.writeInt(dataPosition - i7);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
            } catch (InvocationTargetException e9) {
                if (!(e9.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
                }
                throw ((RuntimeException) e9.getCause());
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e10);
        }
    }
}
