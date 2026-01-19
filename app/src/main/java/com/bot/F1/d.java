package F1;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import com.bot.MainActivity;
import f0.C0987j;
import i4.AbstractC1120d;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import m4.C1270e;
import x2.C1869e;
import x2.C1870f;
import x2.C1871g;
import x2.C1872h;

/* loaded from: classes.dex */
public final class d implements W {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1545b;

    public /* synthetic */ d(Object obj, int i6) {
        this.a = i6;
        this.f1545b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [x2.h, java.lang.Object] */
    @Override // androidx.lifecycle.W
    public final U b(Class cls, f fVar) {
        U u5;
        g gVar;
        l4.c cVar;
        U u6;
        Application application;
        int i6 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                C1270e a = AbstractC1289x.a(cls);
                g[] gVarArr = (g[]) this.f1545b;
                g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length);
                AbstractC1276k.f(gVarArr2, "initializers");
                int length = gVarArr2.length;
                while (true) {
                    u5 = null;
                    if (i6 < length) {
                        gVar = gVarArr2[i6];
                        if (!gVar.a.equals(a)) {
                            i6++;
                        }
                    } else {
                        gVar = null;
                    }
                }
                if (gVar != null && (cVar = gVar.f1546b) != null) {
                    u5 = (U) cVar.f(fVar);
                }
                if (u5 != null) {
                    return u5;
                }
                throw new IllegalArgumentException(("No initializer set for given class " + a.b()).toString());
            case 1:
                final o3.g gVar2 = new o3.g();
                C0987j c0987j = (C0987j) this.f1545b;
                O.c(fVar);
                C1871g c1871g = (C1871g) c0987j.f11690e;
                Object obj = new Object();
                int i7 = 1;
                obj.a = new C1870f(c1871g, objArr == true ? 1 : 0, i7);
                obj.f15591b = new C1870f(c1871g, i7, i7);
                obj.f15592c = new C1870f(c1871g, 2, i7);
                obj.f15593d = new C1870f(c1871g, 3, i7);
                obj.f15594e = new C1870f(c1871g, 4, i7);
                obj.f15595f = new C1870f(c1871g, 5, i7);
                obj.f15596g = new C1870f(c1871g, 6, i7);
                C1872h c1872h = (C1872h) ((o3.d) AbstractC1120d.o(obj, o3.d.class));
                c1872h.getClass();
                e eVar = new e(5);
                C1870f c1870f = c1872h.a;
                LinkedHashMap linkedHashMap = eVar.a;
                linkedHashMap.put("X2.g", c1870f);
                linkedHashMap.put("X2.L", c1872h.f15591b);
                linkedHashMap.put("a3.g", c1872h.f15592c);
                linkedHashMap.put("a3.w", c1872h.f15593d);
                linkedHashMap.put("a3.F", c1872h.f15594e);
                linkedHashMap.put("a3.I", c1872h.f15595f);
                linkedHashMap.put("X2.Y", c1872h.f15596g);
                LinkedHashMap linkedHashMap2 = eVar.a;
                s3.c cVar2 = (s3.c) (linkedHashMap2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap2)).get(cls.getName());
                l4.c cVar3 = (l4.c) fVar.a.get(o3.e.f13512d);
                ((C1872h) ((o3.d) AbstractC1120d.o(obj, o3.d.class))).getClass();
                Object obj2 = Collections.EMPTY_MAP.get(cls);
                if (obj2 == null) {
                    if (cVar3 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (cVar2 == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    u6 = (U) cVar2.get();
                } else {
                    if (cVar2 != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (cVar3 == null) {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    u6 = (U) cVar3.f(obj2);
                }
                Closeable closeable = new Closeable() { // from class: o3.b
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        g.this.a();
                    }
                };
                u6.getClass();
                H1.d dVar = u6.a;
                if (dVar != null) {
                    if (dVar.f2023d) {
                        H1.d.a(closeable);
                    } else {
                        synchronized (dVar.a) {
                            dVar.f2022c.add(closeable);
                        }
                    }
                }
                return u6;
            default:
                C0987j c0987j2 = new C0987j(12, (boolean) (objArr2 == true ? 1 : 0));
                c0987j2.f11690e = fVar;
                Context applicationContext = ((MainActivity) this.f1545b).getApplicationContext();
                if (!(applicationContext instanceof Application)) {
                    Context context = applicationContext;
                    while (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                        if (context instanceof Application) {
                            application = (Application) context;
                        }
                    }
                    throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
                }
                application = (Application) applicationContext;
                return new p3.d(new C1869e(((C1871g) ((p3.c) AbstractC1120d.o(application, p3.c.class))).f15574b), c0987j2);
        }
    }

    public d(g[] gVarArr) {
        this.a = 0;
        AbstractC1276k.f(gVarArr, "initializers");
        this.f1545b = gVarArr;
    }
}
