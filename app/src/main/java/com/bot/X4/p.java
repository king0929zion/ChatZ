package X4;

import O.C0316k;
import com.vladsch.flexmark.util.html.Attribute;
import d5.C0952l;
import d5.G;
import d5.I;
import j1.AbstractC1135a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class p implements V4.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f9489g = R4.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f9490h = R4.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final U4.k a;

    /* renamed from: b, reason: collision with root package name */
    public final V4.f f9491b;

    /* renamed from: c, reason: collision with root package name */
    public final o f9492c;

    /* renamed from: d, reason: collision with root package name */
    public volatile w f9493d;

    /* renamed from: e, reason: collision with root package name */
    public final Q4.u f9494e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f9495f;

    public p(Q4.t tVar, U4.k kVar, V4.f fVar, o oVar) {
        AbstractC1276k.f(oVar, "http2Connection");
        this.a = kVar;
        this.f9491b = fVar;
        this.f9492c = oVar;
        List list = tVar.f6622u;
        Q4.u uVar = Q4.u.H2_PRIOR_KNOWLEDGE;
        this.f9494e = list.contains(uVar) ? uVar : Q4.u.HTTP_2;
    }

    @Override // V4.d
    public final G a(Q4.v vVar, long j3) {
        AbstractC1276k.f(vVar, "request");
        w wVar = this.f9493d;
        AbstractC1276k.c(wVar);
        return wVar.f();
    }

    @Override // V4.d
    public final I b(Q4.y yVar) {
        w wVar = this.f9493d;
        AbstractC1276k.c(wVar);
        return wVar.f9524i;
    }

    @Override // V4.d
    public final long c(Q4.y yVar) {
        if (V4.e.a(yVar)) {
            return R4.b.k(yVar);
        }
        return 0L;
    }

    @Override // V4.d
    public final void cancel() {
        this.f9495f = true;
        w wVar = this.f9493d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // V4.d
    public final void d() {
        w wVar = this.f9493d;
        AbstractC1276k.c(wVar);
        wVar.f().close();
    }

    @Override // V4.d
    public final Q4.x e(boolean z5) {
        Q4.n nVar;
        w wVar = this.f9493d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f9526k.h();
            while (wVar.f9522g.isEmpty() && wVar.f9528m == 0) {
                try {
                    try {
                        wVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    wVar.f9526k.k();
                    throw th;
                }
            }
            wVar.f9526k.k();
            if (wVar.f9522g.isEmpty()) {
                IOException iOException = wVar.f9529n;
                if (iOException != null) {
                    throw iOException;
                }
                int i6 = wVar.f9528m;
                AbstractC1135a.l(i6);
                throw new B(i6);
            }
            Object removeFirst = wVar.f9522g.removeFirst();
            AbstractC1276k.e(removeFirst, "headersQueue.removeFirst()");
            nVar = (Q4.n) removeFirst;
        }
        Q4.u uVar = this.f9494e;
        AbstractC1276k.f(uVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = nVar.size();
        C0316k c0316k = null;
        for (int i7 = 0; i7 < size; i7++) {
            String b5 = nVar.b(i7);
            String d6 = nVar.d(i7);
            if (AbstractC1276k.b(b5, ":status")) {
                c0316k = AbstractC1410a.B("HTTP/1.1 " + d6);
            } else if (!f9490h.contains(b5)) {
                AbstractC1276k.f(b5, Attribute.NAME_ATTR);
                AbstractC1276k.f(d6, "value");
                arrayList.add(b5);
                arrayList.add(AbstractC1776n.l0(d6).toString());
            }
        }
        if (c0316k == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Q4.x xVar = new Q4.x();
        xVar.f6645b = uVar;
        xVar.f6646c = c0316k.f4139b;
        xVar.f6647d = (String) c0316k.f4141d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Q4.m mVar = new Q4.m(0);
        ArrayList arrayList2 = mVar.a;
        AbstractC1276k.f(arrayList2, "<this>");
        AbstractC1276k.f(strArr, "elements");
        arrayList2.addAll(Y3.k.a0(strArr));
        xVar.f6649f = mVar;
        if (z5 && xVar.f6646c == 100) {
            return null;
        }
        return xVar;
    }

    @Override // V4.d
    public final void f(Q4.v vVar) {
        int i6;
        w wVar;
        boolean z5;
        AbstractC1276k.f(vVar, "request");
        if (this.f9493d != null) {
            return;
        }
        boolean z6 = ((s4.j) vVar.f6639e) != null;
        Q4.n nVar = (Q4.n) vVar.f6638d;
        ArrayList arrayList = new ArrayList(nVar.size() + 4);
        arrayList.add(new C0711b(C0711b.f9420f, vVar.f6636b));
        C0952l c0952l = C0711b.f9421g;
        Q4.p pVar = (Q4.p) vVar.f6637c;
        AbstractC1276k.f(pVar, "url");
        String b5 = pVar.b();
        String d6 = pVar.d();
        if (d6 != null) {
            b5 = b5 + '?' + d6;
        }
        arrayList.add(new C0711b(c0952l, b5));
        String a = ((Q4.n) vVar.f6638d).a("Host");
        if (a != null) {
            arrayList.add(new C0711b(C0711b.f9423i, a));
        }
        arrayList.add(new C0711b(C0711b.f9422h, pVar.a));
        int size = nVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            String b6 = nVar.b(i7);
            Locale locale = Locale.US;
            AbstractC1276k.e(locale, "US");
            String lowerCase = b6.toLowerCase(locale);
            AbstractC1276k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f9489g.contains(lowerCase) || (lowerCase.equals("te") && AbstractC1276k.b(nVar.d(i7), "trailers"))) {
                arrayList.add(new C0711b(lowerCase, nVar.d(i7)));
            }
        }
        o oVar = this.f9492c;
        oVar.getClass();
        boolean z7 = !z6;
        synchronized (oVar.f9488z) {
            synchronized (oVar) {
                try {
                    if (oVar.f9470h > 1073741823) {
                        oVar.h(8);
                    }
                    if (oVar.f9471i) {
                        throw new IOException();
                    }
                    i6 = oVar.f9470h;
                    oVar.f9470h = i6 + 2;
                    wVar = new w(i6, oVar, z7, false, null);
                    z5 = !z6 || oVar.f9485w >= oVar.f9486x || wVar.f9520e >= wVar.f9521f;
                    if (wVar.h()) {
                        oVar.f9467e.put(Integer.valueOf(i6), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar.f9488z.j(z7, i6, arrayList);
        }
        if (z5) {
            oVar.f9488z.flush();
        }
        this.f9493d = wVar;
        if (this.f9495f) {
            w wVar2 = this.f9493d;
            AbstractC1276k.c(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.f9493d;
        AbstractC1276k.c(wVar3);
        v vVar2 = wVar3.f9526k;
        long j3 = this.f9491b.f8815g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar2.g(j3, timeUnit);
        w wVar4 = this.f9493d;
        AbstractC1276k.c(wVar4);
        wVar4.f9527l.g(this.f9491b.f8816h, timeUnit);
    }

    @Override // V4.d
    public final U4.k g() {
        return this.a;
    }

    @Override // V4.d
    public final void h() {
        this.f9492c.flush();
    }
}
