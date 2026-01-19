package Y4;

import Q4.u;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Method f9833c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f9834d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f9835e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f9836f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f9837g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f9833c = method;
        this.f9834d = method2;
        this.f9835e = method3;
        this.f9836f = cls;
        this.f9837g = cls2;
    }

    @Override // Y4.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f9835e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to remove ALPN", e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        }
    }

    @Override // Y4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1276k.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((u) obj) != u.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(Y3.n.Z(arrayList, 10));
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            arrayList2.add(((u) obj2).f6635c);
        }
        try {
            this.f9833c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f9836f, this.f9837g}, new i(arrayList2)));
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to set ALPN", e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        }
    }

    @Override // Y4.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f9834d.invoke(null, sSLSocket));
            AbstractC1276k.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z5 = iVar.f9831b;
            if (!z5 && iVar.f9832c == null) {
                n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z5) {
                return null;
            }
            return iVar.f9832c;
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to get ALPN selected protocol", e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        }
    }
}
