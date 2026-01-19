package Y4;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f9819d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9820c;

    static {
        f9819d = F2.h.j() && Build.VERSION.SDK_INT >= 29;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        int i6 = 0;
        ArrayList r02 = Y3.k.r0(new Z4.n[]{(!F2.h.j() || Build.VERSION.SDK_INT < 29) ? null : new Object(), new Z4.m(Z4.f.f10546f), new Z4.m(Z4.k.a), new Z4.m(Z4.h.a)});
        ArrayList arrayList = new ArrayList();
        int size = r02.size();
        while (i6 < size) {
            Object obj = r02.get(i6);
            i6++;
            if (((Z4.n) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f9820c = arrayList;
    }

    @Override // Y4.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        Z4.b bVar = x509TrustManagerExtensions != null ? new Z4.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new c5.a(c(x509TrustManager));
    }

    @Override // Y4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        AbstractC1276k.f(list, "protocols");
        ArrayList arrayList = this.f9820c;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i6);
            i6++;
            if (((Z4.n) obj).a(sSLSocket)) {
                break;
            }
        }
        Z4.n nVar = (Z4.n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // Y4.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f9820c;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i6);
            i6++;
            if (((Z4.n) obj).a(sSLSocket)) {
                break;
            }
        }
        Z4.n nVar = (Z4.n) obj;
        if (nVar != null) {
            return nVar.c(sSLSocket);
        }
        return null;
    }

    @Override // Y4.n
    public final boolean h(String str) {
        AbstractC1276k.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
