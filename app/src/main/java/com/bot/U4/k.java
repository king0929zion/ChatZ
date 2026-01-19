package U4;

import I0.U0;
import Q4.B;
import Q4.C0493a;
import Q4.p;
import Q4.t;
import Q4.u;
import Q4.v;
import Q4.x;
import Q4.y;
import X4.o;
import X4.w;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import d5.A;
import d5.AbstractC0942b;
import d5.C;
import d5.C0952l;
import d5.K;
import j1.AbstractC1135a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class k extends X4.h {

    /* renamed from: b, reason: collision with root package name */
    public final B f8728b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f8729c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f8730d;

    /* renamed from: e, reason: collision with root package name */
    public Q4.l f8731e;

    /* renamed from: f, reason: collision with root package name */
    public u f8732f;

    /* renamed from: g, reason: collision with root package name */
    public o f8733g;

    /* renamed from: h, reason: collision with root package name */
    public C f8734h;

    /* renamed from: i, reason: collision with root package name */
    public A f8735i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8736j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8737k;

    /* renamed from: l, reason: collision with root package name */
    public int f8738l;

    /* renamed from: m, reason: collision with root package name */
    public int f8739m;

    /* renamed from: n, reason: collision with root package name */
    public int f8740n;

    /* renamed from: o, reason: collision with root package name */
    public int f8741o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f8742p;

    /* renamed from: q, reason: collision with root package name */
    public long f8743q;

    public k(l lVar, B b5) {
        AbstractC1276k.f(lVar, "connectionPool");
        AbstractC1276k.f(b5, "route");
        this.f8728b = b5;
        this.f8741o = 1;
        this.f8742p = new ArrayList();
        this.f8743q = Long.MAX_VALUE;
    }

    public static void d(t tVar, B b5, IOException iOException) {
        AbstractC1276k.f(b5, "failedRoute");
        AbstractC1276k.f(iOException, "failure");
        if (b5.f6478b.type() != Proxy.Type.DIRECT) {
            C0493a c0493a = b5.a;
            c0493a.f6492g.connectFailed(c0493a.f6493h.g(), b5.f6478b.address(), iOException);
        }
        A3.c cVar = tVar.f6604C;
        synchronized (cVar) {
            ((LinkedHashSet) cVar.f119e).add(b5);
        }
    }

    @Override // X4.h
    public final synchronized void a(o oVar, X4.A a) {
        AbstractC1276k.f(a, "settings");
        this.f8741o = (a.a & 16) != 0 ? a.f9416b[4] : TableCell.NOT_TRACKED;
    }

    @Override // X4.h
    public final void b(w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i6, int i7, int i8, boolean z5, i iVar) {
        B b5;
        if (this.f8732f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f8728b.a.f6495j;
        b bVar = new b(list);
        C0493a c0493a = this.f8728b.a;
        if (c0493a.f6488c == null) {
            if (!list.contains(Q4.j.f6537f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f8728b.a.f6493h.f6567d;
            Y4.n nVar = Y4.n.a;
            if (!Y4.n.a.h(str)) {
                throw new m(new UnknownServiceException(AbstractC1135a.s("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c0493a.f6494i.contains(u.H2_PRIOR_KNOWLEDGE)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar = null;
        do {
            try {
                B b6 = this.f8728b;
                if (b6.a.f6488c != null && b6.f6478b.type() == Proxy.Type.HTTP) {
                    f(i6, i7, i8, iVar);
                    if (this.f8729c == null) {
                        b5 = this.f8728b;
                        if (b5.a.f6488c == null && b5.f6478b.type() == Proxy.Type.HTTP && this.f8729c == null) {
                            throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f8743q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i6, i7, iVar);
                }
                g(bVar, iVar);
                AbstractC1276k.f(this.f8728b.f6479c, "inetSocketAddress");
                b5 = this.f8728b;
                if (b5.a.f6488c == null) {
                }
                this.f8743q = System.nanoTime();
                return;
            } catch (IOException e6) {
                Socket socket = this.f8730d;
                if (socket != null) {
                    R4.b.e(socket);
                }
                Socket socket2 = this.f8729c;
                if (socket2 != null) {
                    R4.b.e(socket2);
                }
                this.f8730d = null;
                this.f8729c = null;
                this.f8734h = null;
                this.f8735i = null;
                this.f8731e = null;
                this.f8732f = null;
                this.f8733g = null;
                this.f8741o = 1;
                AbstractC1276k.f(this.f8728b.f6479c, "inetSocketAddress");
                if (mVar == null) {
                    mVar = new m(e6);
                } else {
                    X3.a.a(mVar.f8747c, e6);
                    mVar.f8748e = e6;
                }
                if (!z5) {
                    throw mVar;
                }
                bVar.f8688d = true;
                if (!bVar.f8687c) {
                    throw mVar;
                }
                if (e6 instanceof ProtocolException) {
                    throw mVar;
                }
                if (e6 instanceof InterruptedIOException) {
                    throw mVar;
                }
                if ((e6 instanceof SSLHandshakeException) && (e6.getCause() instanceof CertificateException)) {
                    throw mVar;
                }
                if (e6 instanceof SSLPeerUnverifiedException) {
                    throw mVar;
                }
            }
        } while (e6 instanceof SSLException);
        throw mVar;
    }

    public final void e(int i6, int i7, i iVar) {
        Socket createSocket;
        B b5 = this.f8728b;
        Proxy proxy = b5.f6478b;
        C0493a c0493a = b5.a;
        Proxy.Type type = proxy.type();
        int i8 = type == null ? -1 : j.a[type.ordinal()];
        if (i8 == 1 || i8 == 2) {
            createSocket = c0493a.f6487b.createSocket();
            AbstractC1276k.c(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f8729c = createSocket;
        AbstractC1276k.f(this.f8728b.f6479c, "inetSocketAddress");
        createSocket.setSoTimeout(i7);
        try {
            Y4.n nVar = Y4.n.a;
            Y4.n.a.e(createSocket, this.f8728b.f6479c, i6);
            try {
                this.f8734h = AbstractC0942b.c(AbstractC0942b.i(createSocket));
                this.f8735i = AbstractC0942b.b(AbstractC0942b.g(createSocket));
            } catch (NullPointerException e6) {
                if (AbstractC1276k.b(e6.getMessage(), "throw with null exception")) {
                    throw new IOException(e6);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f8728b.f6479c);
            connectException.initCause(e7);
            throw connectException;
        }
    }

    public final void f(int i6, int i7, int i8, i iVar) {
        E1.b bVar = new E1.b(1);
        B b5 = this.f8728b;
        p pVar = b5.a.f6493h;
        AbstractC1276k.f(pVar, "url");
        bVar.f1292b = pVar;
        bVar.r("CONNECT", null);
        C0493a c0493a = b5.a;
        bVar.p("Host", R4.b.v(c0493a.f6493h, true));
        bVar.p("Proxy-Connection", "Keep-Alive");
        bVar.p("User-Agent", "okhttp/4.12.0");
        v h3 = bVar.h();
        Q4.m mVar = new Q4.m(0);
        Y3.C.h("Proxy-Authenticate");
        Y3.C.i("OkHttp-Preemptive", "Proxy-Authenticate");
        mVar.f("Proxy-Authenticate");
        mVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
        mVar.d();
        c0493a.f6491f.getClass();
        p pVar2 = (p) h3.f6637c;
        e(i6, i7, iVar);
        String str = "CONNECT " + R4.b.v(pVar2, true) + " HTTP/1.1";
        C c6 = this.f8734h;
        AbstractC1276k.c(c6);
        A a = this.f8735i;
        AbstractC1276k.c(a);
        W4.h hVar = new W4.h(null, this, c6, a);
        K timeout = c6.f11444c.timeout();
        long j3 = i7;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(j3, timeUnit);
        a.f11440c.timeout().g(i8, timeUnit);
        hVar.j((Q4.n) h3.f6638d, str);
        hVar.d();
        x e6 = hVar.e(false);
        AbstractC1276k.c(e6);
        e6.a = h3;
        y a6 = e6.a();
        int i9 = a6.f6660g;
        long k3 = R4.b.k(a6);
        if (k3 != -1) {
            W4.e i10 = hVar.i(k3);
            R4.b.t(i10, TableCell.NOT_TRACKED);
            i10.close();
        }
        if (i9 != 200) {
            if (i9 != 407) {
                throw new IOException(B3.e.h(i9, "Unexpected response code for CONNECT: "));
            }
            c0493a.f6491f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c6.f11445e.f() || !a.f11441e.f()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, i iVar) {
        Throwable th;
        u uVar = u.HTTP_1_1;
        C0493a c0493a = this.f8728b.a;
        SSLSocketFactory sSLSocketFactory = c0493a.f6488c;
        if (sSLSocketFactory == null) {
            List list = c0493a.f6494i;
            u uVar2 = u.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(uVar2)) {
                this.f8730d = this.f8729c;
                this.f8732f = uVar;
                return;
            } else {
                this.f8730d = this.f8729c;
                this.f8732f = uVar2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            AbstractC1276k.c(sSLSocketFactory);
            Socket socket = this.f8729c;
            p pVar = c0493a.f6493h;
            int i6 = 1;
            Socket createSocket = sSLSocketFactory.createSocket(socket, pVar.f6567d, pVar.f6568e, true);
            AbstractC1276k.d(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                Q4.j a = bVar.a(sSLSocket2);
                if (a.f6538b) {
                    Y4.n nVar = Y4.n.a;
                    Y4.n.a.d(sSLSocket2, c0493a.f6493h.f6567d, c0493a.f6494i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                AbstractC1276k.e(session, "sslSocketSession");
                Q4.l B5 = Y4.l.B(session);
                HostnameVerifier hostnameVerifier = c0493a.f6489d;
                AbstractC1276k.c(hostnameVerifier);
                if (hostnameVerifier.verify(c0493a.f6493h.f6567d, session)) {
                    Q4.f fVar = c0493a.f6490e;
                    AbstractC1276k.c(fVar);
                    this.f8731e = new Q4.l(B5.a, B5.f6553b, B5.f6554c, new U0(fVar, B5, c0493a, i6));
                    AbstractC1276k.f(c0493a.f6493h.f6567d, "hostname");
                    Iterator it = fVar.a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a.f6538b) {
                        Y4.n nVar2 = Y4.n.a;
                        str = Y4.n.a.f(sSLSocket2);
                    }
                    this.f8730d = sSLSocket2;
                    this.f8734h = AbstractC0942b.c(AbstractC0942b.i(sSLSocket2));
                    this.f8735i = AbstractC0942b.b(AbstractC0942b.g(sSLSocket2));
                    if (str != null) {
                        uVar = AbstractC1410a.u(str);
                    }
                    this.f8732f = uVar;
                    Y4.n nVar3 = Y4.n.a;
                    Y4.n.a.a(sSLSocket2);
                    if (this.f8732f == u.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a6 = B5.a();
                if (a6.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0493a.f6493h.f6567d + " not verified (no certificates)");
                }
                Object obj = a6.get(0);
                AbstractC1276k.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c0493a.f6493h.f6567d);
                sb.append(" not verified:\n              |    certificate: ");
                Q4.f fVar2 = Q4.f.f6512c;
                StringBuilder sb2 = new StringBuilder("sha256/");
                C0952l c0952l = C0952l.f11483g;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                AbstractC1276k.e(encoded, "publicKey.encoded");
                int length = encoded.length;
                AbstractC0942b.e(encoded.length, 0, length);
                sb2.append(new C0952l(Y3.k.m0(encoded, 0, length)).c("SHA-256").a());
                sb.append(sb2.toString());
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(Y3.m.z0(c5.c.a(x509Certificate, 7), c5.c.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(u4.o.r(sb.toString()));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Y4.n nVar4 = Y4.n.a;
                    Y4.n.a.a(sSLSocket);
                }
                if (sSLSocket == null) {
                    throw th;
                }
                R4.b.e(sSLSocket);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (c5.c.c(r6, (java.security.cert.X509Certificate) r12) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(Q4.C0493a r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.String r0 = "hostname"
            Q4.p r1 = r11.f6493h
            byte[] r2 = R4.b.a
            java.util.ArrayList r2 = r10.f8742p
            int r2 = r2.size()
            int r3 = r10.f8741o
            r4 = 0
            if (r2 >= r3) goto Le1
            boolean r2 = r10.f8736j
            if (r2 == 0) goto L17
            goto Le1
        L17:
            Q4.B r2 = r10.f8728b
            Q4.a r3 = r2.a
            Q4.a r5 = r2.a
            boolean r3 = r3.a(r11)
            if (r3 != 0) goto L25
            goto Le1
        L25:
            java.lang.String r3 = r1.f6567d
            java.lang.String r6 = r1.f6567d
            Q4.p r7 = r5.f6493h
            java.lang.String r7 = r7.f6567d
            boolean r3 = m4.AbstractC1276k.b(r3, r7)
            r7 = 1
            if (r3 == 0) goto L35
            return r7
        L35:
            X4.o r3 = r10.f8733g
            if (r3 != 0) goto L3b
            goto Le1
        L3b:
            if (r12 == 0) goto Le1
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L45
            goto Le1
        L45:
            java.util.Iterator r12 = r12.iterator()
        L49:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Le1
            java.lang.Object r3 = r12.next()
            Q4.B r3 = (Q4.B) r3
            java.net.Proxy r8 = r3.f6478b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto L49
            java.net.Proxy r8 = r2.f6478b
            java.net.Proxy$Type r8 = r8.type()
            if (r8 != r9) goto L49
            java.net.InetSocketAddress r8 = r2.f6479c
            java.net.InetSocketAddress r3 = r3.f6479c
            boolean r3 = m4.AbstractC1276k.b(r8, r3)
            if (r3 == 0) goto L49
            javax.net.ssl.HostnameVerifier r12 = r11.f6489d
            c5.c r2 = c5.c.a
            if (r12 == r2) goto L78
            goto Le1
        L78:
            byte[] r12 = R4.b.a
            Q4.p r12 = r5.f6493h
            int r1 = r1.f6568e
            int r2 = r12.f6568e
            if (r1 == r2) goto L83
            goto Le1
        L83:
            java.lang.String r12 = r12.f6567d
            boolean r12 = m4.AbstractC1276k.b(r6, r12)
            if (r12 == 0) goto L8c
            goto Laf
        L8c:
            boolean r12 = r10.f8737k
            if (r12 != 0) goto Le1
            Q4.l r12 = r10.f8731e
            if (r12 == 0) goto Le1
            java.util.List r12 = r12.a()
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto Le1
            java.lang.Object r12 = r12.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            m4.AbstractC1276k.d(r12, r1)
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12
            boolean r12 = c5.c.c(r6, r12)
            if (r12 == 0) goto Le1
        Laf:
            Q4.f r11 = r11.f6490e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            m4.AbstractC1276k.c(r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            Q4.l r12 = r10.f8731e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            m4.AbstractC1276k.c(r12)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.util.List r12 = r12.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            m4.AbstractC1276k.f(r6, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.lang.String r0 = "peerCertificates"
            m4.AbstractC1276k.f(r12, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.util.Set r11 = r11.a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.util.Iterator r11 = r11.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            boolean r12 = r11.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            if (r12 != 0) goto Ld4
            return r7
        Ld4:
            java.lang.Object r11 = r11.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            r11.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.lang.ClassCastException r11 = new java.lang.ClassCastException     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            r11.<init>()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            throw r11     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
        Le1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.k.h(Q4.a, java.util.List):boolean");
    }

    public final boolean i(boolean z5) {
        long j3;
        byte[] bArr = R4.b.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f8729c;
        AbstractC1276k.c(socket);
        Socket socket2 = this.f8730d;
        AbstractC1276k.c(socket2);
        AbstractC1276k.c(this.f8734h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        o oVar = this.f8733g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f9471i) {
                    return false;
                }
                if (oVar.f9479q < oVar.f9478p) {
                    if (nanoTime >= oVar.f9480r) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j3 = nanoTime - this.f8743q;
        }
        if (j3 < 10000000000L || !z5) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.c();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final V4.d j(t tVar, V4.f fVar) {
        int i6 = fVar.f8815g;
        Socket socket = this.f8730d;
        AbstractC1276k.c(socket);
        C c6 = this.f8734h;
        AbstractC1276k.c(c6);
        A a = this.f8735i;
        AbstractC1276k.c(a);
        o oVar = this.f8733g;
        if (oVar != null) {
            return new X4.p(tVar, this, fVar, oVar);
        }
        socket.setSoTimeout(i6);
        K timeout = c6.f11444c.timeout();
        long j3 = i6;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(j3, timeUnit);
        a.f11440c.timeout().g(fVar.f8816h, timeUnit);
        return new W4.h(tVar, this, c6, a);
    }

    public final synchronized void k() {
        this.f8736j = true;
    }

    public final void l() {
        Socket socket = this.f8730d;
        AbstractC1276k.c(socket);
        C c6 = this.f8734h;
        AbstractC1276k.c(c6);
        A a = this.f8735i;
        AbstractC1276k.c(a);
        socket.setSoTimeout(0);
        T4.d dVar = T4.d.f8528i;
        v vVar = new v(dVar);
        String str = this.f8728b.a.f6493h.f6567d;
        AbstractC1276k.f(str, "peerName");
        vVar.f6638d = socket;
        String str2 = R4.b.f7083f + SequenceUtils.SPC + str;
        AbstractC1276k.f(str2, "<set-?>");
        vVar.f6636b = str2;
        vVar.f6639e = c6;
        vVar.f6640f = a;
        vVar.f6641g = this;
        o oVar = new o(vVar);
        this.f8733g = oVar;
        X4.A a6 = o.f9463C;
        this.f8741o = (a6.a & 16) != 0 ? a6.f9416b[4] : TableCell.NOT_TRACKED;
        X4.x xVar = oVar.f9488z;
        synchronized (xVar) {
            try {
                if (xVar.f9534g) {
                    throw new IOException("closed");
                }
                Logger logger = X4.x.f9530i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(R4.b.i(">> CONNECTION " + X4.f.a.e(), new Object[0]));
                }
                xVar.f9531c.m(X4.f.a);
                xVar.f9531c.flush();
            } finally {
            }
        }
        X4.x xVar2 = oVar.f9488z;
        X4.A a7 = oVar.f9481s;
        synchronized (xVar2) {
            try {
                AbstractC1276k.f(a7, "settings");
                if (xVar2.f9534g) {
                    throw new IOException("closed");
                }
                xVar2.f(0, Integer.bitCount(a7.a) * 6, 4, 0);
                int i6 = 0;
                while (i6 < 10) {
                    boolean z5 = true;
                    if (((1 << i6) & a7.a) == 0) {
                        z5 = false;
                    }
                    if (z5) {
                        xVar2.f9531c.writeShort(i6 != 4 ? i6 != 7 ? i6 : 4 : 3);
                        xVar2.f9531c.writeInt(a7.f9416b[i6]);
                    }
                    i6++;
                }
                xVar2.f9531c.flush();
            } finally {
            }
        }
        if (oVar.f9481s.a() != 65535) {
            oVar.f9488z.r(r1 - 65535, 0);
        }
        dVar.e().c(new T4.b(oVar.f9468f, oVar.f9464A, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        B b5 = this.f8728b;
        sb.append(b5.a.f6493h.f6567d);
        sb.append(':');
        sb.append(b5.a.f6493h.f6568e);
        sb.append(", proxy=");
        sb.append(b5.f6478b);
        sb.append(" hostAddress=");
        sb.append(b5.f6479c);
        sb.append(" cipherSuite=");
        Q4.l lVar = this.f8731e;
        if (lVar == null || (obj = lVar.f6553b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f8732f);
        sb.append('}');
        return sb.toString();
    }
}
