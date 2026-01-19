package Z4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class m implements n {
    public final l a;

    /* renamed from: b, reason: collision with root package name */
    public n f10553b;

    public m(l lVar) {
        this.a = lVar;
    }

    @Override // Z4.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // Z4.n
    public final boolean b() {
        return true;
    }

    @Override // Z4.n
    public final String c(SSLSocket sSLSocket) {
        n e6 = e(sSLSocket);
        if (e6 != null) {
            return e6.c(sSLSocket);
        }
        return null;
    }

    @Override // Z4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1276k.f(list, "protocols");
        n e6 = e(sSLSocket);
        if (e6 != null) {
            e6.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f10553b == null && this.a.a(sSLSocket)) {
                this.f10553b = this.a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10553b;
    }
}
