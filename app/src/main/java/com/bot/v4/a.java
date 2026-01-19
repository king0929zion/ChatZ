package V4;

import B0.B;
import Q4.C0494b;
import Q4.m;
import Q4.o;
import Q4.p;
import Q4.q;
import Q4.t;
import Q4.v;
import Q4.y;
import U4.k;
import com.vladsch.flexmark.util.format.TableCell;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.regex.Pattern;
import m4.AbstractC1276k;
import org.jsoup.helper.HttpConnection;
import s4.j;
import x3.C1887k;

/* loaded from: classes.dex */
public final class a implements q {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8807b;

    public a(C0494b c0494b) {
        AbstractC1276k.f(c0494b, "cookieJar");
        this.f8807b = c0494b;
    }

    public static int d(y yVar, int i6) {
        String c6 = y.c(yVar, "Retry-After");
        if (c6 == null) {
            return i6;
        }
        Pattern compile = Pattern.compile("\\d+");
        AbstractC1276k.e(compile, "compile(...)");
        if (!compile.matcher(c6).matches()) {
            return TableCell.NOT_TRACKED;
        }
        Integer valueOf = Integer.valueOf(c6);
        AbstractC1276k.e(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        r3.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        return r9;
     */
    @Override // Q4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Q4.y a(V4.f r30) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.a.a(V4.f):Q4.y");
    }

    public v b(y yVar, B b5) {
        o oVar;
        j jVar;
        y yVar2;
        k kVar;
        Q4.B b6 = (b5 == null || (kVar = (k) b5.f381e) == null) ? null : kVar.f8728b;
        int i6 = yVar.f6660g;
        v vVar = yVar.f6657c;
        String str = vVar.f6636b;
        if (i6 != 307 && i6 != 308) {
            if (i6 == 401) {
                ((t) this.f8807b).f6611j.getClass();
                return null;
            }
            if (i6 == 421) {
                j jVar2 = (j) vVar.f6639e;
                if ((jVar2 == null || !(jVar2 instanceof C1887k)) && b5 != null && !AbstractC1276k.b(((U4.e) b5.f379c).f8700b.f6493h.f6567d, ((k) b5.f381e).f8728b.a.f6493h.f6567d)) {
                    k kVar2 = (k) b5.f381e;
                    synchronized (kVar2) {
                        kVar2.f8737k = true;
                    }
                    return yVar.f6657c;
                }
            } else if (i6 == 503) {
                y yVar3 = yVar.f6666m;
                if ((yVar3 == null || yVar3.f6660g != 503) && d(yVar, TableCell.NOT_TRACKED) == 0) {
                    return yVar.f6657c;
                }
            } else {
                if (i6 == 407) {
                    AbstractC1276k.c(b6);
                    if (b6.f6478b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((t) this.f8807b).f6617p.getClass();
                    return null;
                }
                if (i6 != 408) {
                    switch (i6) {
                    }
                } else if (((t) this.f8807b).f6610i && (((jVar = (j) vVar.f6639e) == null || !(jVar instanceof C1887k)) && (((yVar2 = yVar.f6666m) == null || yVar2.f6660g != 408) && d(yVar, 0) <= 0))) {
                    return yVar.f6657c;
                }
            }
            return null;
        }
        t tVar = (t) this.f8807b;
        if (tVar.f6612k) {
            String c6 = y.c(yVar, "Location");
            v vVar2 = yVar.f6657c;
            if (c6 != null) {
                p pVar = (p) vVar2.f6637c;
                pVar.getClass();
                try {
                    oVar = new o();
                    oVar.c(pVar, c6);
                } catch (IllegalArgumentException unused) {
                    oVar = null;
                }
                p a = oVar != null ? oVar.a() : null;
                if (a != null && (AbstractC1276k.b(a.a, ((p) vVar2.f6637c).a) || tVar.f6613l)) {
                    E1.b b7 = vVar2.b();
                    if (h5.e.d0(str)) {
                        int i7 = yVar.f6660g;
                        boolean z5 = str.equals("PROPFIND") || i7 == 308 || i7 == 307;
                        if (str.equals("PROPFIND") || i7 == 308 || i7 == 307) {
                            b7.r(str, z5 ? (j) vVar2.f6639e : null);
                        } else {
                            b7.r("GET", null);
                        }
                        if (!z5) {
                            ((m) b7.f1294d).f("Transfer-Encoding");
                            ((m) b7.f1294d).f("Content-Length");
                            ((m) b7.f1294d).f(HttpConnection.CONTENT_TYPE);
                        }
                    }
                    if (!R4.b.a((p) vVar2.f6637c, a)) {
                        ((m) b7.f1294d).f("Authorization");
                    }
                    b7.f1292b = a;
                    return b7.h();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r7 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(java.io.IOException r4, U4.i r5, Q4.v r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8807b
            Q4.t r0 = (Q4.t) r0
            boolean r0 = r0.f6610i
            r1 = 0
            if (r0 != 0) goto Lb
            goto La7
        Lb:
            if (r7 == 0) goto L1c
            java.lang.Object r6 = r6.f6639e
            s4.j r6 = (s4.j) r6
            if (r6 == 0) goto L17
            boolean r6 = r6 instanceof x3.C1887k
            if (r6 != 0) goto La7
        L17:
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L1c
            return r1
        L1c:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L21
            return r1
        L21:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L2c
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto La7
            if (r7 != 0) goto La7
            goto L3f
        L2c:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L3a
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L3a
            goto La7
        L3a:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L3f
            return r1
        L3f:
            U4.e r4 = r5.f8719k
            m4.AbstractC1276k.c(r4)
            int r5 = r4.f8704f
            r6 = 1
            if (r5 != 0) goto L53
            int r7 = r4.f8705g
            if (r7 != 0) goto L53
            int r7 = r4.f8706h
            if (r7 != 0) goto L53
            r4 = r1
            goto La5
        L53:
            Q4.B r7 = r4.f8707i
            if (r7 == 0) goto L58
            goto La0
        L58:
            r7 = 0
            if (r5 > r6) goto L8b
            int r5 = r4.f8705g
            if (r5 > r6) goto L8b
            int r5 = r4.f8706h
            if (r5 <= 0) goto L64
            goto L8b
        L64:
            U4.i r5 = r4.f8701c
            U4.k r5 = r5.f8720l
            if (r5 != 0) goto L6b
            goto L8b
        L6b:
            monitor-enter(r5)
            int r0 = r5.f8738l     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L72
            monitor-exit(r5)
            goto L8b
        L72:
            Q4.B r0 = r5.f8728b     // Catch: java.lang.Throwable -> L88
            Q4.a r0 = r0.a     // Catch: java.lang.Throwable -> L88
            Q4.p r0 = r0.f6493h     // Catch: java.lang.Throwable -> L88
            Q4.a r2 = r4.f8700b     // Catch: java.lang.Throwable -> L88
            Q4.p r2 = r2.f6493h     // Catch: java.lang.Throwable -> L88
            boolean r0 = R4.b.a(r0, r2)     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L84
            monitor-exit(r5)
            goto L8b
        L84:
            Q4.B r7 = r5.f8728b     // Catch: java.lang.Throwable -> L88
            monitor-exit(r5)
            goto L8b
        L88:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L8b:
            if (r7 == 0) goto L91
            r4.f8707i = r7
        L8f:
            r4 = r6
            goto La5
        L91:
            U4.n r5 = r4.f8702d
            if (r5 == 0) goto L9c
            boolean r5 = r5.a()
            if (r5 != r6) goto L9c
            goto La0
        L9c:
            H0.z0 r4 = r4.f8703e
            if (r4 != 0) goto La1
        La0:
            goto L8f
        La1:
            boolean r4 = r4.a()
        La5:
            if (r4 != 0) goto La8
        La7:
            return r1
        La8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.a.c(java.io.IOException, U4.i, Q4.v, boolean):boolean");
    }

    public a(t tVar) {
        this.f8807b = tVar;
    }
}
