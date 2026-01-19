package U4;

import B0.H;
import Q4.p;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final Q4.e f8708c;

    /* renamed from: e, reason: collision with root package name */
    public volatile AtomicInteger f8709e = new AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f8710f;

    public f(i iVar, Q4.e eVar) {
        this.f8710f = iVar;
        this.f8708c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H h3;
        String concat = "OkHttp ".concat(((p) this.f8710f.f8713e.f6637c).f());
        i iVar = this.f8710f;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            iVar.f8716h.h();
            boolean z5 = false;
            try {
                try {
                } catch (Throwable th) {
                    iVar.f8712c.f6605c.f(this);
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f8708c.g(iVar, iVar.g());
                h3 = iVar.f8712c.f6605c;
            } catch (IOException e7) {
                e = e7;
                z5 = true;
                if (z5) {
                    Y4.n nVar = Y4.n.a;
                    Y4.n nVar2 = Y4.n.a;
                    String str = "Callback failure for " + i.a(iVar);
                    nVar2.getClass();
                    Y4.n.i(str, 4, e);
                } else {
                    this.f8708c.a(iVar, e);
                }
                h3 = iVar.f8712c.f6605c;
                h3.f(this);
            } catch (Throwable th3) {
                th = th3;
                z5 = true;
                iVar.d();
                if (!z5) {
                    IOException iOException = new IOException("canceled due to " + th);
                    X3.a.a(iOException, th);
                    this.f8708c.a(iVar, iOException);
                }
                throw th;
            }
            h3.f(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
