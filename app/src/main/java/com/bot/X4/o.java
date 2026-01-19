package X4;

import com.vladsch.flexmark.parser.PegdownExtensions;
import d5.C;
import j1.AbstractC1135a;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class o implements Closeable {

    /* renamed from: C, reason: collision with root package name */
    public static final A f9463C;

    /* renamed from: A, reason: collision with root package name */
    public final k f9464A;

    /* renamed from: B, reason: collision with root package name */
    public final LinkedHashSet f9465B;

    /* renamed from: c, reason: collision with root package name */
    public final h f9466c;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f9467e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final String f9468f;

    /* renamed from: g, reason: collision with root package name */
    public int f9469g;

    /* renamed from: h, reason: collision with root package name */
    public int f9470h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9471i;

    /* renamed from: j, reason: collision with root package name */
    public final T4.d f9472j;

    /* renamed from: k, reason: collision with root package name */
    public final T4.c f9473k;

    /* renamed from: l, reason: collision with root package name */
    public final T4.c f9474l;

    /* renamed from: m, reason: collision with root package name */
    public final T4.c f9475m;

    /* renamed from: n, reason: collision with root package name */
    public final z f9476n;

    /* renamed from: o, reason: collision with root package name */
    public long f9477o;

    /* renamed from: p, reason: collision with root package name */
    public long f9478p;

    /* renamed from: q, reason: collision with root package name */
    public long f9479q;

    /* renamed from: r, reason: collision with root package name */
    public long f9480r;

    /* renamed from: s, reason: collision with root package name */
    public final A f9481s;

    /* renamed from: t, reason: collision with root package name */
    public A f9482t;

    /* renamed from: u, reason: collision with root package name */
    public long f9483u;

    /* renamed from: v, reason: collision with root package name */
    public long f9484v;

    /* renamed from: w, reason: collision with root package name */
    public long f9485w;

    /* renamed from: x, reason: collision with root package name */
    public long f9486x;

    /* renamed from: y, reason: collision with root package name */
    public final Socket f9487y;

    /* renamed from: z, reason: collision with root package name */
    public final x f9488z;

    static {
        A a = new A();
        a.c(7, 65535);
        a.c(5, 16384);
        f9463C = a;
    }

    public o(Q4.v vVar) {
        this.f9466c = (h) vVar.f6641g;
        String str = vVar.f6636b;
        if (str == null) {
            AbstractC1276k.k("connectionName");
            throw null;
        }
        this.f9468f = str;
        this.f9470h = 3;
        T4.d dVar = (T4.d) vVar.f6637c;
        this.f9472j = dVar;
        this.f9473k = dVar.e();
        this.f9474l = dVar.e();
        this.f9475m = dVar.e();
        this.f9476n = z.a;
        A a = new A();
        a.c(7, PegdownExtensions.FOOTNOTES);
        this.f9481s = a;
        this.f9482t = f9463C;
        this.f9486x = r0.a();
        Socket socket = (Socket) vVar.f6638d;
        if (socket == null) {
            AbstractC1276k.k("socket");
            throw null;
        }
        this.f9487y = socket;
        d5.A a6 = (d5.A) vVar.f6640f;
        if (a6 == null) {
            AbstractC1276k.k("sink");
            throw null;
        }
        this.f9488z = new x(a6);
        C c6 = (C) vVar.f6639e;
        if (c6 == null) {
            AbstractC1276k.k("source");
            throw null;
        }
        this.f9464A = new k(this, new s(c6));
        this.f9465B = new LinkedHashSet();
    }

    public final void c(int i6, int i7, IOException iOException) {
        int i8;
        Object[] objArr;
        AbstractC1135a.o(i6, "connectionCode");
        AbstractC1135a.o(i7, "streamCode");
        byte[] bArr = R4.b.a;
        try {
            h(i6);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f9467e.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f9467e.values().toArray(new w[0]);
                this.f9467e.clear();
            }
        }
        w[] wVarArr = (w[]) objArr;
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.c(i7, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f9488z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f9487y.close();
        } catch (IOException unused4) {
        }
        this.f9473k.e();
        this.f9474l.e();
        this.f9475m.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(1, 9, null);
    }

    public final synchronized w d(int i6) {
        return (w) this.f9467e.get(Integer.valueOf(i6));
    }

    public final synchronized w f(int i6) {
        w wVar;
        wVar = (w) this.f9467e.remove(Integer.valueOf(i6));
        notifyAll();
        return wVar;
    }

    public final void flush() {
        this.f9488z.flush();
    }

    public final void h(int i6) {
        AbstractC1135a.o(i6, "statusCode");
        synchronized (this.f9488z) {
            synchronized (this) {
                if (this.f9471i) {
                    return;
                }
                this.f9471i = true;
                this.f9488z.h(R4.b.a, this.f9469g, i6);
            }
        }
    }

    public final synchronized void j(long j3) {
        long j4 = this.f9483u + j3;
        this.f9483u = j4;
        long j5 = j4 - this.f9484v;
        if (j5 >= this.f9481s.a() / 2) {
            r(j5, 0);
            this.f9484v += j5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f9488z.f9533f);
        r6 = r2;
        r8.f9485w += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r9, boolean r10, d5.C0949i r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            X4.x r12 = r8.f9488z
            r12.d(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f9485w     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f9486x     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f9467e     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            X4.x r4 = r8.f9488z     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f9533f     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f9485w     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f9485w = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            X4.x r4 = r8.f9488z
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.d(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.o.p(int, boolean, d5.i, long):void");
    }

    public final void q(int i6, int i7) {
        AbstractC1135a.o(i7, "errorCode");
        this.f9473k.c(new j(this.f9468f + '[' + i6 + "] writeSynReset", this, i6, i7, 2), 0L);
    }

    public final void r(long j3, int i6) {
        this.f9473k.c(new n(this.f9468f + '[' + i6 + "] windowUpdate", this, i6, j3), 0L);
    }
}
