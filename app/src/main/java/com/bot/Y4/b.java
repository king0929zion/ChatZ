package Y4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class b implements c5.d {
    public final X509TrustManager a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f9821b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.a = x509TrustManager;
        this.f9821b = method;
    }

    @Override // c5.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f9821b.invoke(this.a, x509Certificate);
            AbstractC1276k.d(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e6) {
            throw new AssertionError("unable to get issues and signature", e6);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC1276k.b(this.a, bVar.a) && AbstractC1276k.b(this.f9821b, bVar.f9821b);
    }

    public final int hashCode() {
        return this.f9821b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.f9821b + ')';
    }
}
