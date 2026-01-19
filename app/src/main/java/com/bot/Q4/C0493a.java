package Q4;

import j1.AbstractC1135a;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import m4.AbstractC1276k;

/* renamed from: Q4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493a {
    public final C0494b a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f6487b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f6488c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f6489d;

    /* renamed from: e, reason: collision with root package name */
    public final f f6490e;

    /* renamed from: f, reason: collision with root package name */
    public final C0494b f6491f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f6492g;

    /* renamed from: h, reason: collision with root package name */
    public final p f6493h;

    /* renamed from: i, reason: collision with root package name */
    public final List f6494i;

    /* renamed from: j, reason: collision with root package name */
    public final List f6495j;

    public C0493a(String str, int i6, C0494b c0494b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, C0494b c0494b2, List list, List list2, ProxySelector proxySelector) {
        AbstractC1276k.f(str, "uriHost");
        AbstractC1276k.f(c0494b, "dns");
        AbstractC1276k.f(socketFactory, "socketFactory");
        AbstractC1276k.f(c0494b2, "proxyAuthenticator");
        AbstractC1276k.f(list, "protocols");
        AbstractC1276k.f(list2, "connectionSpecs");
        AbstractC1276k.f(proxySelector, "proxySelector");
        this.a = c0494b;
        this.f6487b = socketFactory;
        this.f6488c = sSLSocketFactory;
        this.f6489d = hostnameVerifier;
        this.f6490e = fVar;
        this.f6491f = c0494b2;
        this.f6492g = proxySelector;
        o oVar = new o();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            oVar.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            oVar.a = "https";
        }
        String V5 = Y4.l.V(C0494b.e(0, 0, 7, str));
        if (V5 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        oVar.f6559d = V5;
        if (1 > i6 || i6 >= 65536) {
            throw new IllegalArgumentException(B3.e.h(i6, "unexpected port: ").toString());
        }
        oVar.f6560e = i6;
        this.f6493h = oVar.a();
        this.f6494i = R4.b.w(list);
        this.f6495j = R4.b.w(list2);
    }

    public final boolean a(C0493a c0493a) {
        AbstractC1276k.f(c0493a, "that");
        return AbstractC1276k.b(this.a, c0493a.a) && AbstractC1276k.b(this.f6491f, c0493a.f6491f) && AbstractC1276k.b(this.f6494i, c0493a.f6494i) && AbstractC1276k.b(this.f6495j, c0493a.f6495j) && AbstractC1276k.b(this.f6492g, c0493a.f6492g) && AbstractC1276k.b(this.f6488c, c0493a.f6488c) && AbstractC1276k.b(this.f6489d, c0493a.f6489d) && AbstractC1276k.b(this.f6490e, c0493a.f6490e) && this.f6493h.f6568e == c0493a.f6493h.f6568e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0493a)) {
            return false;
        }
        C0493a c0493a = (C0493a) obj;
        return AbstractC1276k.b(this.f6493h, c0493a.f6493h) && a(c0493a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f6490e) + ((Objects.hashCode(this.f6489d) + ((Objects.hashCode(this.f6488c) + ((this.f6492g.hashCode() + AbstractC1135a.e(this.f6495j, AbstractC1135a.e(this.f6494i, (this.f6491f.hashCode() + ((this.a.hashCode() + B3.e.e(527, 31, this.f6493h.f6571h)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        p pVar = this.f6493h;
        sb.append(pVar.f6567d);
        sb.append(':');
        sb.append(pVar.f6568e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f6492g);
        sb.append('}');
        return sb.toString();
    }
}
