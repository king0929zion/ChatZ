package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import b4.C0911i;
import b4.InterfaceC0910h;
import com.tencent.mmkv.R;
import i4.AbstractC1118b;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import z3.C2028F;

/* loaded from: classes.dex */
public abstract class O {
    public static final C2028F a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final N f10850b = new N(0);

    /* renamed from: c, reason: collision with root package name */
    public static final N f10851c = new N(1);

    /* renamed from: d, reason: collision with root package name */
    public static final H1.c f10852d = new Object();

    public O() {
        new AtomicReference(null);
    }

    public static final void b(U u5, M.q qVar, O o5) {
        AbstractC1276k.f(qVar, "registry");
        AbstractC1276k.f(o5, "lifecycle");
        L l3 = (L) u5.c("androidx.lifecycle.savedstate.vm.tag");
        if (l3 == null || l3.f10847f) {
            return;
        }
        l3.p(qVar, o5);
        EnumC0842p g3 = o5.g();
        if (g3 == EnumC0842p.f10876e || g3.compareTo(EnumC0842p.f10878g) >= 0) {
            qVar.v();
        } else {
            o5.a(new C0834h(qVar, o5));
        }
    }

    public static final K c(F1.c cVar) {
        K k3;
        AbstractC1276k.f(cVar, "<this>");
        U1.e eVar = (U1.e) cVar.a(a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        a0 a0Var = (a0) cVar.a(f10850b);
        if (a0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) cVar.a(f10851c);
        String str = (String) cVar.a(Y.f10865b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        U1.d q3 = eVar.f().q();
        Bundle bundle2 = null;
        P p5 = q3 instanceof P ? (P) q3 : null;
        if (p5 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = h(a0Var).f10856b;
        K k5 = (K) linkedHashMap.get(str);
        if (k5 != null) {
            return k5;
        }
        p5.b();
        Bundle bundle3 = p5.f10854c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                p5.f10854c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            k3 = new K();
        } else {
            ClassLoader classLoader = K.class.getClassLoader();
            AbstractC1276k.c(classLoader);
            bundle.setClassLoader(classLoader);
            Z3.f fVar = new Z3.f(bundle.size());
            for (String str2 : bundle.keySet()) {
                AbstractC1276k.c(str2);
                fVar.put(str2, bundle.get(str2));
            }
            k3 = new K(fVar.b());
        }
        linkedHashMap.put(str, k3);
        return k3;
    }

    public static final void d(U1.e eVar) {
        EnumC0842p g3 = eVar.g().g();
        if (g3 != EnumC0842p.f10876e && g3 != EnumC0842p.f10877f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.f().q() == null) {
            P p5 = new P(eVar.f(), (a0) eVar);
            eVar.f().u("androidx.lifecycle.internal.SavedStateHandlesProvider", p5);
            eVar.g().a(new C0831e(p5, 1));
        }
    }

    public static final InterfaceC0846u e(View view) {
        AbstractC1276k.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC0846u interfaceC0846u = tag instanceof InterfaceC0846u ? (InterfaceC0846u) tag : null;
            if (interfaceC0846u != null) {
                return interfaceC0846u;
            }
            Object j3 = io.ktor.utils.io.u.j(view);
            view = j3 instanceof View ? (View) j3 : null;
        }
        return null;
    }

    public static final a0 f(View view) {
        AbstractC1276k.f(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            a0 a0Var = tag instanceof a0 ? (a0) tag : null;
            if (a0Var != null) {
                return a0Var;
            }
            Object j3 = io.ktor.utils.io.u.j(view);
            view = j3 instanceof View ? (View) j3 : null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.W, java.lang.Object] */
    public static final Q h(a0 a0Var) {
        Y j3 = N.j(a0Var, new Object(), 4);
        return (Q) ((B0.H) j3.a).g(AbstractC1289x.a(Q.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final H1.a i(U u5) {
        H1.a aVar;
        AbstractC1276k.f(u5, "<this>");
        synchronized (f10852d) {
            aVar = (H1.a) u5.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                InterfaceC0910h interfaceC0910h = C0911i.f11057c;
                try {
                    E4.e eVar = AbstractC1898K.a;
                    interfaceC0910h = C4.o.a.f16023i;
                } catch (X3.h | IllegalStateException unused) {
                }
                H1.a aVar2 = new H1.a(interfaceC0910h.Y(AbstractC1888A.e()));
                u5.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final void k(View view, InterfaceC0846u interfaceC0846u) {
        AbstractC1276k.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0846u);
    }

    public abstract void a(InterfaceC0845t interfaceC0845t);

    public abstract EnumC0842p g();

    public abstract void j(InterfaceC0845t interfaceC0845t);
}
