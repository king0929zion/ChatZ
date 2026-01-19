package T4;

import B3.e;
import F2.h;
import I0.RunnableC0210u;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final h f8527h = new h(16);

    /* renamed from: i, reason: collision with root package name */
    public static final d f8528i;

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f8529j;
    public final A3.c a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8531c;

    /* renamed from: d, reason: collision with root package name */
    public long f8532d;

    /* renamed from: b, reason: collision with root package name */
    public int f8530b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8533e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8534f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final RunnableC0210u f8535g = new RunnableC0210u(this, 1);

    static {
        String str = R4.b.f7083f + " TaskRunner";
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        f8528i = new d(new A3.c(new R4.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        AbstractC1276k.e(logger, "getLogger(TaskRunner::class.java.name)");
        f8529j = logger;
    }

    public d(A3.c cVar) {
        this.a = cVar;
    }

    public static final void a(d dVar, a aVar) {
        byte[] bArr = R4.b.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.a);
        try {
            long a = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j3) {
        byte[] bArr = R4.b.a;
        c cVar = aVar.f8518c;
        AbstractC1276k.c(cVar);
        if (cVar.f8524d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z5 = cVar.f8526f;
        cVar.f8526f = false;
        cVar.f8524d = null;
        this.f8533e.remove(cVar);
        if (j3 != -1 && !z5 && !cVar.f8523c) {
            cVar.d(aVar, j3, true);
        }
        if (cVar.f8525e.isEmpty()) {
            return;
        }
        this.f8534f.add(cVar);
    }

    public final a c() {
        long j3;
        a aVar;
        boolean z5;
        byte[] bArr = R4.b.a;
        while (true) {
            ArrayList arrayList = this.f8534f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j4 = Long.MAX_VALUE;
            int i6 = 0;
            a aVar2 = null;
            while (true) {
                if (i6 >= size) {
                    j3 = nanoTime;
                    aVar = null;
                    z5 = false;
                    break;
                }
                Object obj = arrayList.get(i6);
                i6++;
                a aVar3 = (a) ((c) obj).f8525e.get(0);
                j3 = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f8519d - j3);
                if (max > 0) {
                    j4 = Math.min(max, j4);
                } else {
                    if (aVar2 != null) {
                        z5 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j3;
            }
            ArrayList arrayList2 = this.f8533e;
            if (aVar2 != null) {
                byte[] bArr2 = R4.b.a;
                aVar2.f8519d = -1L;
                c cVar = aVar2.f8518c;
                AbstractC1276k.c(cVar);
                cVar.f8525e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f8524d = aVar2;
                arrayList2.add(cVar);
                if (z5 || (!this.f8531c && !arrayList.isEmpty())) {
                    RunnableC0210u runnableC0210u = this.f8535g;
                    AbstractC1276k.f(runnableC0210u, "runnable");
                    ((ThreadPoolExecutor) this.a.f119e).execute(runnableC0210u);
                }
                return aVar2;
            }
            if (this.f8531c) {
                if (j4 >= this.f8532d - j3) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f8531c = true;
            this.f8532d = j3 + j4;
            try {
                try {
                    long j5 = j4 / 1000000;
                    long j6 = j4 - (1000000 * j5);
                    if (j5 > 0 || j4 > 0) {
                        wait(j5, (int) j6);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        c cVar2 = (c) arrayList.get(size3);
                        cVar2.b();
                        if (cVar2.f8525e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f8531c = false;
            }
        }
    }

    public final void d(c cVar) {
        AbstractC1276k.f(cVar, "taskQueue");
        byte[] bArr = R4.b.a;
        if (cVar.f8524d == null) {
            boolean isEmpty = cVar.f8525e.isEmpty();
            ArrayList arrayList = this.f8534f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                AbstractC1276k.f(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        if (this.f8531c) {
            notify();
            return;
        }
        RunnableC0210u runnableC0210u = this.f8535g;
        AbstractC1276k.f(runnableC0210u, "runnable");
        ((ThreadPoolExecutor) this.a.f119e).execute(runnableC0210u);
    }

    public final c e() {
        int i6;
        synchronized (this) {
            i6 = this.f8530b;
            this.f8530b = i6 + 1;
        }
        return new c(this, e.h(i6, "Q"));
    }
}
