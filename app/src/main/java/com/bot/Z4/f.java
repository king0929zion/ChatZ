package Z4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m4.AbstractC1276k;
import u4.AbstractC1763a;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f10546f = new Object();
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f10547b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f10548c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f10549d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f10550e;

    public f(Class cls) {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC1276k.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f10547b = declaredMethod;
        this.f10548c = cls.getMethod("setHostname", String.class);
        this.f10549d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f10550e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // Z4.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // Z4.n
    public final boolean b() {
        boolean z5 = Y4.c.f9822e;
        return Y4.c.f9822e;
    }

    @Override // Z4.n
    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f10549d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC1763a.a);
                }
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e7) {
                Throwable cause = e7.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC1276k.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e7);
                }
            }
        }
        return null;
    }

    @Override // Z4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1276k.f(list, "protocols");
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.f10547b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f10548c.invoke(sSLSocket, str);
                }
                Method method = this.f10550e;
                Y4.n nVar = Y4.n.a;
                method.invoke(sSLSocket, F2.h.c(list));
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e7) {
                throw new AssertionError(e7);
            }
        }
    }
}
