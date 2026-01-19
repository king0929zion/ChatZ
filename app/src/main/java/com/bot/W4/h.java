package W4;

import O.C0316k;
import Q4.n;
import Q4.p;
import Q4.t;
import Q4.u;
import Q4.v;
import Q4.x;
import Q4.y;
import U4.k;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import d5.A;
import d5.C;
import d5.G;
import d5.I;
import d5.InterfaceC0950j;
import d5.InterfaceC0951k;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class h implements V4.d {
    public final t a;

    /* renamed from: b, reason: collision with root package name */
    public final k f9040b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0951k f9041c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0950j f9042d;

    /* renamed from: e, reason: collision with root package name */
    public int f9043e;

    /* renamed from: f, reason: collision with root package name */
    public final a f9044f;

    /* renamed from: g, reason: collision with root package name */
    public n f9045g;

    /* JADX WARN: Type inference failed for: r2v1, types: [W4.a, java.lang.Object] */
    public h(t tVar, k kVar, C c6, A a) {
        AbstractC1276k.f(c6, "source");
        AbstractC1276k.f(a, "sink");
        this.a = tVar;
        this.f9040b = kVar;
        this.f9041c = c6;
        this.f9042d = a;
        AbstractC1276k.f(c6, "source");
        ?? obj = new Object();
        obj.f9023b = c6;
        obj.a = 262144L;
        this.f9044f = obj;
    }

    @Override // V4.d
    public final G a(v vVar, long j3) {
        AbstractC1276k.f(vVar, "request");
        if ("chunked".equalsIgnoreCase(((n) vVar.f6638d).a("Transfer-Encoding"))) {
            if (this.f9043e == 1) {
                this.f9043e = 2;
                return new c(this);
            }
            throw new IllegalStateException(("state: " + this.f9043e).toString());
        }
        if (j3 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f9043e == 1) {
            this.f9043e = 2;
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f9043e).toString());
    }

    @Override // V4.d
    public final I b(y yVar) {
        if (!V4.e.a(yVar)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(y.c(yVar, "Transfer-Encoding"))) {
            p pVar = (p) yVar.f6657c.f6637c;
            if (this.f9043e == 4) {
                this.f9043e = 5;
                return new d(this, pVar);
            }
            throw new IllegalStateException(("state: " + this.f9043e).toString());
        }
        long k3 = R4.b.k(yVar);
        if (k3 != -1) {
            return i(k3);
        }
        if (this.f9043e == 4) {
            this.f9043e = 5;
            this.f9040b.k();
            return new b(this);
        }
        throw new IllegalStateException(("state: " + this.f9043e).toString());
    }

    @Override // V4.d
    public final long c(y yVar) {
        if (!V4.e.a(yVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(y.c(yVar, "Transfer-Encoding"))) {
            return -1L;
        }
        return R4.b.k(yVar);
    }

    @Override // V4.d
    public final void cancel() {
        Socket socket = this.f9040b.f8729c;
        if (socket != null) {
            R4.b.e(socket);
        }
    }

    @Override // V4.d
    public final void d() {
        this.f9042d.flush();
    }

    @Override // V4.d
    public final x e(boolean z5) {
        a aVar = this.f9044f;
        int i6 = this.f9043e;
        if (i6 != 1 && i6 != 2 && i6 != 3) {
            throw new IllegalStateException(("state: " + this.f9043e).toString());
        }
        try {
            String A5 = ((InterfaceC0951k) aVar.f9023b).A(aVar.a);
            aVar.a -= A5.length();
            C0316k B5 = AbstractC1410a.B(A5);
            int i7 = B5.f4139b;
            x xVar = new x();
            xVar.f6645b = (u) B5.f4140c;
            xVar.f6646c = i7;
            xVar.f6647d = (String) B5.f4141d;
            xVar.f6649f = aVar.c().c();
            if (z5 && i7 == 100) {
                return null;
            }
            if (i7 == 100) {
                this.f9043e = 3;
                return xVar;
            }
            if (102 > i7 || i7 >= 200) {
                this.f9043e = 4;
                return xVar;
            }
            this.f9043e = 3;
            return xVar;
        } catch (EOFException e6) {
            throw new IOException("unexpected end of stream on ".concat(this.f9040b.f8728b.a.f6493h.f()), e6);
        }
    }

    @Override // V4.d
    public final void f(v vVar) {
        AbstractC1276k.f(vVar, "request");
        Proxy.Type type = this.f9040b.f8728b.f6478b.type();
        AbstractC1276k.e(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(vVar.f6636b);
        sb.append(SequenceUtils.SPC);
        p pVar = (p) vVar.f6637c;
        if (pVar.f6572i || type != Proxy.Type.HTTP) {
            String b5 = pVar.b();
            String d6 = pVar.d();
            if (d6 != null) {
                b5 = b5 + '?' + d6;
            }
            sb.append(b5);
        } else {
            sb.append(pVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        j((n) vVar.f6638d, sb2);
    }

    @Override // V4.d
    public final k g() {
        return this.f9040b;
    }

    @Override // V4.d
    public final void h() {
        this.f9042d.flush();
    }

    public final e i(long j3) {
        if (this.f9043e == 4) {
            this.f9043e = 5;
            return new e(this, j3);
        }
        throw new IllegalStateException(("state: " + this.f9043e).toString());
    }

    public final void j(n nVar, String str) {
        AbstractC1276k.f(str, "requestLine");
        if (this.f9043e != 0) {
            throw new IllegalStateException(("state: " + this.f9043e).toString());
        }
        InterfaceC0950j interfaceC0950j = this.f9042d;
        interfaceC0950j.F(str).F("\r\n");
        int size = nVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            interfaceC0950j.F(nVar.b(i6)).F(": ").F(nVar.d(i6)).F("\r\n");
        }
        interfaceC0950j.F("\r\n");
        this.f9043e = 1;
    }
}
