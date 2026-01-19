package Z4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import m4.AbstractC1276k;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {
    public static final j a = new Object();

    @Override // Z4.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // Z4.n
    public final boolean b() {
        boolean z5 = Y4.h.f9829d;
        return Y4.h.f9829d;
    }

    @Override // Z4.n
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // Z4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1276k.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Y4.n nVar = Y4.n.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) F2.h.a(list).toArray(new String[0]));
        }
    }
}
