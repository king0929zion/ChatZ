package Z4;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class b extends Y4.l {

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManager f10543e;

    /* renamed from: f, reason: collision with root package name */
    public final X509TrustManagerExtensions f10544f;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        super(26);
        this.f10543e = x509TrustManager;
        this.f10544f = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f10543e == this.f10543e;
    }

    @Override // Y4.l
    public final int hashCode() {
        return System.identityHashCode(this.f10543e);
    }

    @Override // Y4.l
    public final List r(String str, List list) {
        AbstractC1276k.f(list, "chain");
        AbstractC1276k.f(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f10544f.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            AbstractC1276k.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e6) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e6.getMessage());
            sSLPeerUnverifiedException.initCause(e6);
            throw sSLPeerUnverifiedException;
        }
    }
}
