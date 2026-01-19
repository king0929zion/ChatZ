package U4;

import Q4.C0493a;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class l {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final T4.c f8744b;

    /* renamed from: c, reason: collision with root package name */
    public final T4.b f8745c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f8746d;

    public l(T4.d dVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        AbstractC1276k.f(dVar, "taskRunner");
        AbstractC1276k.f(timeUnit, "timeUnit");
        this.a = timeUnit.toNanos(5L);
        this.f8744b = dVar.e();
        this.f8745c = new T4.b(this, B3.e.s(new StringBuilder(), R4.b.f7083f, " ConnectionPool"));
        this.f8746d = new ConcurrentLinkedQueue();
    }

    public final boolean a(C0493a c0493a, i iVar, ArrayList arrayList, boolean z5) {
        Iterator it = this.f8746d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            k kVar = (k) it.next();
            AbstractC1276k.e(kVar, "connection");
            synchronized (kVar) {
                if (z5) {
                    try {
                        if (!(kVar.f8733g != null)) {
                            continue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (kVar.h(c0493a, arrayList)) {
                    iVar.b(kVar);
                    return true;
                }
            }
        }
    }

    public final int b(k kVar, long j3) {
        byte[] bArr = R4.b.a;
        ArrayList arrayList = kVar.f8742p;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i6);
            if (reference.get() != null) {
                i6++;
            } else {
                String str = "A connection to " + kVar.f8728b.a.f6493h + " was leaked. Did you forget to close a response body?";
                Y4.n nVar = Y4.n.a;
                Y4.n.a.j(((g) reference).a, str);
                arrayList.remove(i6);
                kVar.f8736j = true;
                if (arrayList.isEmpty()) {
                    kVar.f8743q = j3 - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
