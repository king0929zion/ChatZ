package androidx.lifecycle;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class U {
    public final H1.d a = new H1.d();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        H1.d dVar = this.a;
        if (dVar != null) {
            if (dVar.f2023d) {
                H1.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.a) {
                autoCloseable2 = (AutoCloseable) dVar.f2021b.put(str, autoCloseable);
            }
            H1.d.a(autoCloseable2);
        }
    }

    public final void b() {
        H1.d dVar = this.a;
        if (dVar != null && !dVar.f2023d) {
            dVar.f2023d = true;
            synchronized (dVar.a) {
                try {
                    Iterator it = dVar.f2021b.values().iterator();
                    while (it.hasNext()) {
                        H1.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f2022c.iterator();
                    while (it2.hasNext()) {
                        H1.d.a((AutoCloseable) it2.next());
                    }
                    dVar.f2022c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        H1.d dVar = this.a;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.a) {
            autoCloseable = (AutoCloseable) dVar.f2021b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
