package Z4;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // Z4.l
    public final boolean a(SSLSocket sSLSocket) {
        return Y4.h.f9829d && Conscrypt.isConscrypt(sSLSocket);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Z4.n, java.lang.Object] */
    @Override // Z4.l
    public final n b(SSLSocket sSLSocket) {
        return new Object();
    }
}
