package Y4;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f9822e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9823c;

    /* renamed from: d, reason: collision with root package name */
    public final Z4.i f9824d;

    static {
        boolean z5 = false;
        if (F2.h.j() && Build.VERSION.SDK_INT < 30) {
            z5 = true;
        }
        f9822e = z5;
    }

    public c() {
        Z4.f fVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            fVar = new Z4.f(cls);
        } catch (Exception e6) {
            n.a.getClass();
            n.i("unable to load android socket classes", 5, e6);
            fVar = null;
        }
        int i6 = 0;
        ArrayList r02 = Y3.k.r0(new Z4.n[]{fVar, new Z4.m(Z4.f.f10546f), new Z4.m(Z4.k.a), new Z4.m(Z4.h.a)});
        ArrayList arrayList = new ArrayList();
        int size = r02.size();
        while (i6 < size) {
            Object obj = r02.get(i6);
            i6++;
            if (((Z4.n) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f9823c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f9824d = new Z4.i(method3, method2, method);
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
    public final c5.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // Y4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        AbstractC1276k.f(list, "protocols");
        ArrayList arrayList = this.f9823c;
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i6) {
        AbstractC1276k.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i6);
        } catch (ClassCastException e6) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e6;
            }
            throw new IOException("Exception in connect", e6);
        }
    }

    @Override // Y4.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f9823c;
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
    public final Object g() {
        Z4.i iVar = this.f9824d;
        iVar.getClass();
        Method method = iVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = iVar.f10551b;
                AbstractC1276k.c(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // Y4.n
    public final boolean h(String str) {
        AbstractC1276k.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // Y4.n
    public final void j(Object obj, String str) {
        AbstractC1276k.f(str, "message");
        Z4.i iVar = this.f9824d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f10552c;
                AbstractC1276k.c(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
