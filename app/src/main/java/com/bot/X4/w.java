package X4;

import j1.AbstractC1135a;
import java.io.IOException;
import java.util.ArrayDeque;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class w {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final o f9517b;

    /* renamed from: c, reason: collision with root package name */
    public long f9518c;

    /* renamed from: d, reason: collision with root package name */
    public long f9519d;

    /* renamed from: e, reason: collision with root package name */
    public long f9520e;

    /* renamed from: f, reason: collision with root package name */
    public long f9521f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f9522g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9523h;

    /* renamed from: i, reason: collision with root package name */
    public final u f9524i;

    /* renamed from: j, reason: collision with root package name */
    public final t f9525j;

    /* renamed from: k, reason: collision with root package name */
    public final v f9526k;

    /* renamed from: l, reason: collision with root package name */
    public final v f9527l;

    /* renamed from: m, reason: collision with root package name */
    public int f9528m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f9529n;

    public w(int i6, o oVar, boolean z5, boolean z6, Q4.n nVar) {
        AbstractC1276k.f(oVar, "connection");
        this.a = i6;
        this.f9517b = oVar;
        this.f9521f = oVar.f9482t.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f9522g = arrayDeque;
        this.f9524i = new u(this, oVar.f9481s.a(), z6);
        this.f9525j = new t(this, z5);
        this.f9526k = new v(this);
        this.f9527l = new v(this);
        if (nVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(nVar);
        }
    }

    public final void a() {
        boolean z5;
        boolean h3;
        byte[] bArr = R4.b.a;
        synchronized (this) {
            try {
                u uVar = this.f9524i;
                if (!uVar.f9511e && uVar.f9514h) {
                    t tVar = this.f9525j;
                    if (!tVar.f9506c) {
                        if (tVar.f9508f) {
                        }
                    }
                    z5 = true;
                    h3 = h();
                }
                z5 = false;
                h3 = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            c(9, null);
        } else {
            if (h3) {
                return;
            }
            this.f9517b.f(this.a);
        }
    }

    public final void b() {
        t tVar = this.f9525j;
        if (tVar.f9508f) {
            throw new IOException("stream closed");
        }
        if (tVar.f9506c) {
            throw new IOException("stream finished");
        }
        if (this.f9528m != 0) {
            IOException iOException = this.f9529n;
            if (iOException != null) {
                throw iOException;
            }
            int i6 = this.f9528m;
            AbstractC1135a.l(i6);
            throw new B(i6);
        }
    }

    public final void c(int i6, IOException iOException) {
        AbstractC1135a.o(i6, "rstStatusCode");
        if (d(i6, iOException)) {
            o oVar = this.f9517b;
            oVar.getClass();
            AbstractC1135a.o(i6, "statusCode");
            oVar.f9488z.q(this.a, i6);
        }
    }

    public final boolean d(int i6, IOException iOException) {
        byte[] bArr = R4.b.a;
        synchronized (this) {
            if (this.f9528m != 0) {
                return false;
            }
            this.f9528m = i6;
            this.f9529n = iOException;
            notifyAll();
            if (this.f9524i.f9511e) {
                if (this.f9525j.f9506c) {
                    return false;
                }
            }
            this.f9517b.f(this.a);
            return true;
        }
    }

    public final void e(int i6) {
        AbstractC1135a.o(i6, "errorCode");
        if (d(i6, null)) {
            this.f9517b.q(this.a, i6);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.f9523h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f9525j;
    }

    public final boolean g() {
        boolean z5 = (this.a & 1) == 1;
        this.f9517b.getClass();
        return true == z5;
    }

    public final synchronized boolean h() {
        try {
            if (this.f9528m != 0) {
                return false;
            }
            u uVar = this.f9524i;
            if (!uVar.f9511e) {
                if (uVar.f9514h) {
                }
                return true;
            }
            t tVar = this.f9525j;
            if (tVar.f9506c || tVar.f9508f) {
                if (this.f9523h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(Q4.n r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            m4.AbstractC1276k.f(r3, r0)
            byte[] r0 = R4.b.a
            monitor-enter(r2)
            boolean r0 = r2.f9523h     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L18
            if (r4 != 0) goto L10
            goto L18
        L10:
            X4.u r3 = r2.f9524i     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r3 = move-exception
            goto L37
        L18:
            r2.f9523h = r1     // Catch: java.lang.Throwable -> L16
            java.util.ArrayDeque r0 = r2.f9522g     // Catch: java.lang.Throwable -> L16
            r0.add(r3)     // Catch: java.lang.Throwable -> L16
        L1f:
            if (r4 == 0) goto L25
            X4.u r3 = r2.f9524i     // Catch: java.lang.Throwable -> L16
            r3.f9511e = r1     // Catch: java.lang.Throwable -> L16
        L25:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L16
            r2.notifyAll()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            if (r3 != 0) goto L36
            X4.o r3 = r2.f9517b
            int r4 = r2.a
            r3.f(r4)
        L36:
            return
        L37:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.w.i(Q4.n, boolean):void");
    }

    public final synchronized void j(int i6) {
        AbstractC1135a.o(i6, "errorCode");
        if (this.f9528m == 0) {
            this.f9528m = i6;
            notifyAll();
        }
    }
}
