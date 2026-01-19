package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import com.bot.MainActivity;
import i4.AbstractC1117a;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;
import m4.C1270e;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class S implements W {
    public final Application a;

    /* renamed from: b, reason: collision with root package name */
    public final V f10857b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f10858c;

    /* renamed from: d, reason: collision with root package name */
    public final O f10859d;

    /* renamed from: e, reason: collision with root package name */
    public final M.q f10860e;

    public S() {
        this.f10857b = new V(null);
    }

    @Override // androidx.lifecycle.W
    public final U a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.W
    public final U b(Class cls, F1.f fVar) {
        LinkedHashMap linkedHashMap = fVar.a;
        String str = (String) linkedHashMap.get(Y.f10865b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(O.a) == null || linkedHashMap.get(O.f10850b) == null) {
            if (this.f10859d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(V.f10863d);
        boolean isAssignableFrom = AbstractC0827a.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? T.a(cls, T.f10861b) : T.a(cls, T.a);
        return a == null ? this.f10857b.b(cls, fVar) : (!isAssignableFrom || application == null) ? T.b(cls, a, O.c(fVar)) : T.b(cls, a, application, O.c(fVar));
    }

    @Override // androidx.lifecycle.W
    public final U c(C1270e c1270e, F1.f fVar) {
        return b(AbstractC1117a.o(c1270e), fVar);
    }

    /* JADX WARN: Type inference failed for: r11v13, types: [androidx.lifecycle.X, java.lang.Object] */
    public final U d(String str, Class cls) {
        K k3;
        O o5 = this.f10859d;
        if (o5 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0827a.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor a = (!isAssignableFrom || application == null) ? T.a(cls, T.f10861b) : T.a(cls, T.a);
        if (a == null) {
            if (application != null) {
                return this.f10857b.a(cls);
            }
            if (X.a == null) {
                X.a = new Object();
            }
            AbstractC1276k.c(X.a);
            return AbstractC1410a.m(cls);
        }
        M.q qVar = this.f10860e;
        AbstractC1276k.c(qVar);
        Bundle j3 = qVar.j(str);
        if (j3 == null) {
            j3 = this.f10858c;
        }
        if (j3 == null) {
            k3 = new K();
        } else {
            ClassLoader classLoader = K.class.getClassLoader();
            AbstractC1276k.c(classLoader);
            j3.setClassLoader(classLoader);
            Z3.f fVar = new Z3.f(j3.size());
            for (String str2 : j3.keySet()) {
                AbstractC1276k.c(str2);
                fVar.put(str2, j3.get(str2));
            }
            k3 = new K(fVar.b());
        }
        L l3 = new L(str, k3);
        l3.p(qVar, o5);
        EnumC0842p g3 = o5.g();
        if (g3 == EnumC0842p.f10876e || g3.compareTo(EnumC0842p.f10878g) >= 0) {
            qVar.v();
        } else {
            o5.a(new C0834h(qVar, o5));
        }
        U b5 = (!isAssignableFrom || application == null) ? T.b(cls, a, k3) : T.b(cls, a, application, k3);
        b5.a("androidx.lifecycle.savedstate.vm.tag", l3);
        return b5;
    }

    public S(Application application, MainActivity mainActivity, Bundle bundle) {
        V v5;
        this.f10860e = (M.q) mainActivity.f10935g.f3180f;
        this.f10859d = mainActivity.f10932c;
        this.f10858c = bundle;
        this.a = application;
        if (application != null) {
            if (V.f10862c == null) {
                V.f10862c = new V(application);
            }
            v5 = V.f10862c;
            AbstractC1276k.c(v5);
        } else {
            v5 = new V(null);
        }
        this.f10857b = v5;
    }
}
