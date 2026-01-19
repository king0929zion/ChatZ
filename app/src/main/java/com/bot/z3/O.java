package z3;

import java.io.IOException;
import m4.AbstractC1276k;
import y3.C1994b;

/* loaded from: classes.dex */
public abstract class O {
    public static final f5.a a = f5.b.e("io.ktor.client.plugins.HttpTimeout");

    public static final C1994b a(E3.e eVar, IOException iOException) {
        Object obj;
        AbstractC1276k.f(eVar, "request");
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append(eVar.a);
        sb.append(", socket_timeout=");
        M m3 = N.f16254d;
        K k3 = (K) eVar.a();
        if (k3 == null || (obj = k3.f16249c) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append("] ms");
        return new C1994b(sb.toString(), iOException);
    }
}
