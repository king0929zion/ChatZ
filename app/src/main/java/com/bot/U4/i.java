package U4;

import B0.B;
import B0.H;
import Q4.p;
import Q4.t;
import Q4.v;
import Q4.y;
import Y3.r;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class i implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public final t f8712c;

    /* renamed from: e, reason: collision with root package name */
    public final v f8713e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8714f;

    /* renamed from: g, reason: collision with root package name */
    public final l f8715g;

    /* renamed from: h, reason: collision with root package name */
    public final h f8716h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f8717i;

    /* renamed from: j, reason: collision with root package name */
    public Object f8718j;

    /* renamed from: k, reason: collision with root package name */
    public e f8719k;

    /* renamed from: l, reason: collision with root package name */
    public k f8720l;

    /* renamed from: m, reason: collision with root package name */
    public B f8721m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8722n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8723o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8724p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f8725q;

    /* renamed from: r, reason: collision with root package name */
    public volatile B f8726r;

    /* renamed from: s, reason: collision with root package name */
    public volatile k f8727s;

    public i(t tVar, v vVar, boolean z5) {
        AbstractC1276k.f(vVar, "originalRequest");
        this.f8712c = tVar;
        this.f8713e = vVar;
        this.f8714f = z5;
        this.f8715g = (l) tVar.f6606e.f119e;
        tVar.f6609h.getClass();
        h hVar = new h(this);
        hVar.g(0, TimeUnit.MILLISECONDS);
        this.f8716h = hVar;
        this.f8717i = new AtomicBoolean();
        this.f8724p = true;
    }

    public static final String a(i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(iVar.f8725q ? "canceled " : FlexmarkHtmlConverter.DEFAULT_NODE);
        sb.append(iVar.f8714f ? "web socket" : "call");
        sb.append(" to ");
        sb.append(((p) iVar.f8713e.f6637c).f());
        return sb.toString();
    }

    public final void b(k kVar) {
        byte[] bArr = R4.b.a;
        if (this.f8720l != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f8720l = kVar;
        kVar.f8742p.add(new g(this, this.f8718j));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket j3;
        byte[] bArr = R4.b.a;
        k kVar = this.f8720l;
        if (kVar != null) {
            synchronized (kVar) {
                j3 = j();
            }
            if (this.f8720l == null) {
                if (j3 != null) {
                    R4.b.e(j3);
                }
            } else if (j3 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f8716h.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            AbstractC1276k.c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new i(this.f8712c, this.f8713e, this.f8714f);
    }

    public final void d() {
        Socket socket;
        if (this.f8725q) {
            return;
        }
        this.f8725q = true;
        B b5 = this.f8726r;
        if (b5 != null) {
            ((V4.d) b5.f380d).cancel();
        }
        k kVar = this.f8727s;
        if (kVar == null || (socket = kVar.f8729c) == null) {
            return;
        }
        R4.b.e(socket);
    }

    public final void e(Q4.e eVar) {
        f fVar;
        if (!this.f8717i.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        Y4.n nVar = Y4.n.a;
        this.f8718j = Y4.n.a.g();
        H h3 = this.f8712c.f6605c;
        f fVar2 = new f(this, eVar);
        h3.getClass();
        synchronized (h3) {
            ((ArrayDeque) h3.f392e).add(fVar2);
            if (!this.f8714f) {
                String str = ((p) this.f8713e.f6637c).f6567d;
                Iterator it = ((ArrayDeque) h3.f393f).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) h3.f392e).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                fVar = null;
                                break;
                            } else {
                                fVar = (f) it2.next();
                                if (AbstractC1276k.b(((p) fVar.f8710f.f8713e.f6637c).f6567d, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        fVar = (f) it.next();
                        if (AbstractC1276k.b(((p) fVar.f8710f.f8713e.f6637c).f6567d, str)) {
                            break;
                        }
                    }
                }
                if (fVar != null) {
                    fVar2.f8709e = fVar.f8709e;
                }
            }
        }
        h3.j();
    }

    public final void f(boolean z5) {
        B b5;
        synchronized (this) {
            if (!this.f8724p) {
                throw new IllegalStateException("released");
            }
        }
        if (z5 && (b5 = this.f8726r) != null) {
            ((V4.d) b5.f380d).cancel();
            ((i) b5.f378b).h(b5, true, true, null);
        }
        this.f8721m = null;
    }

    public final y g() {
        ArrayList arrayList = new ArrayList();
        r.c0(this.f8712c.f6607f, arrayList);
        arrayList.add(new V4.a(this.f8712c));
        arrayList.add(new V4.a(this.f8712c.f6614m));
        arrayList.add(new Object());
        arrayList.add(a.a);
        if (!this.f8714f) {
            r.c0(this.f8712c.f6608g, arrayList);
        }
        arrayList.add(new V4.b(this.f8714f));
        v vVar = this.f8713e;
        t tVar = this.f8712c;
        try {
            try {
                y b5 = new V4.f(this, arrayList, 0, null, vVar, tVar.f6626y, tVar.f6627z, tVar.f6602A).b(this.f8713e);
                if (this.f8725q) {
                    R4.b.d(b5);
                    throw new IOException("Canceled");
                }
                i(null);
                return b5;
            } catch (IOException e6) {
                IOException i6 = i(e6);
                AbstractC1276k.d(i6, "null cannot be cast to non-null type kotlin.Throwable");
                throw i6;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException h(B0.B r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            m4.AbstractC1276k.f(r3, r0)
            B0.B r0 = r2.f8726r
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Le
            goto L60
        Le:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L1a
            boolean r1 = r2.f8722n     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L20
            goto L1a
        L18:
            r3 = move-exception
            goto L41
        L1a:
            if (r5 == 0) goto L43
            boolean r1 = r2.f8723o     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L43
        L20:
            if (r4 == 0) goto L24
            r2.f8722n = r0     // Catch: java.lang.Throwable -> L18
        L24:
            if (r5 == 0) goto L28
            r2.f8723o = r0     // Catch: java.lang.Throwable -> L18
        L28:
            boolean r4 = r2.f8722n     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L32
            boolean r5 = r2.f8723o     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L32
            r5 = r3
            goto L33
        L32:
            r5 = r0
        L33:
            if (r4 != 0) goto L3e
            boolean r4 = r2.f8723o     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            boolean r4 = r2.f8724p     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            r0 = r3
        L3e:
            r4 = r0
            r0 = r5
            goto L44
        L41:
            monitor-exit(r2)
            throw r3
        L43:
            r4 = r0
        L44:
            monitor-exit(r2)
            if (r0 == 0) goto L59
            r5 = 0
            r2.f8726r = r5
            U4.k r5 = r2.f8720l
            if (r5 == 0) goto L59
            monitor-enter(r5)
            int r0 = r5.f8739m     // Catch: java.lang.Throwable -> L56
            int r0 = r0 + r3
            r5.f8739m = r0     // Catch: java.lang.Throwable -> L56
            monitor-exit(r5)
            goto L59
        L56:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L56
            throw r3
        L59:
            if (r4 == 0) goto L60
            java.io.IOException r3 = r2.c(r6)
            return r3
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.i.h(B0.B, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException i(IOException iOException) {
        boolean z5;
        synchronized (this) {
            z5 = false;
            if (this.f8724p) {
                this.f8724p = false;
                if (!this.f8722n) {
                    if (!this.f8723o) {
                        z5 = true;
                    }
                }
            }
        }
        return z5 ? c(iOException) : iOException;
    }

    public final Socket j() {
        k kVar = this.f8720l;
        AbstractC1276k.c(kVar);
        byte[] bArr = R4.b.a;
        ArrayList arrayList = kVar.f8742p;
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
            if (AbstractC1276k.b(((Reference) obj).get(), this)) {
                break;
            }
            i6++;
        }
        if (i6 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i6);
        this.f8720l = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        kVar.f8743q = System.nanoTime();
        l lVar = this.f8715g;
        ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f8746d;
        T4.c cVar = lVar.f8744b;
        byte[] bArr2 = R4.b.a;
        if (!kVar.f8736j) {
            cVar.c(lVar.f8745c, 0L);
            return null;
        }
        kVar.f8736j = true;
        concurrentLinkedQueue.remove(kVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = kVar.f8730d;
        AbstractC1276k.c(socket);
        return socket;
    }
}
