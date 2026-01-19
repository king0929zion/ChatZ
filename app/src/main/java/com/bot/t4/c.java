package T4;

import F2.h;
import Y3.C;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c {
    public final d a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8522b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8523c;

    /* renamed from: d, reason: collision with root package name */
    public a f8524d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8525e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8526f;

    public c(d dVar, String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        this.a = dVar;
        this.f8522b = str;
        this.f8525e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = R4.b.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f8524d;
        if (aVar != null && aVar.f8517b) {
            this.f8526f = true;
        }
        ArrayList arrayList = this.f8525e;
        boolean z5 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f8517b) {
                a aVar2 = (a) arrayList.get(size);
                h hVar = d.f8527h;
                if (d.f8529j.isLoggable(Level.FINE)) {
                    C.f(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z5 = true;
            }
        }
        return z5;
    }

    public final void c(a aVar, long j3) {
        AbstractC1276k.f(aVar, "task");
        synchronized (this.a) {
            if (!this.f8523c) {
                if (d(aVar, j3, false)) {
                    this.a.d(this);
                }
            } else if (aVar.f8517b) {
                h hVar = d.f8527h;
                if (d.f8529j.isLoggable(Level.FINE)) {
                    C.f(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                h hVar2 = d.f8527h;
                if (d.f8529j.isLoggable(Level.FINE)) {
                    C.f(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j3, boolean z5) {
        AbstractC1276k.f(aVar, "task");
        c cVar = aVar.f8518c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f8518c = this;
        }
        long nanoTime = System.nanoTime();
        long j4 = nanoTime + j3;
        ArrayList arrayList = this.f8525e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f8519d <= j4) {
                h hVar = d.f8527h;
                if (d.f8529j.isLoggable(Level.FINE)) {
                    C.f(aVar, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        aVar.f8519d = j4;
        h hVar2 = d.f8527h;
        if (d.f8529j.isLoggable(Level.FINE)) {
            C.f(aVar, this, z5 ? "run again after ".concat(C.o(j4 - nanoTime)) : "scheduled after ".concat(C.o(j4 - nanoTime)));
        }
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i6 = -1;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            if (((a) obj).f8519d - nanoTime > j3) {
                break;
            }
            i6++;
        }
        if (i6 == -1) {
            i6 = arrayList.size();
        }
        arrayList.add(i6, aVar);
        return i6 == 0;
    }

    public final void e() {
        byte[] bArr = R4.b.a;
        synchronized (this.a) {
            this.f8523c = true;
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f8522b;
    }
}
