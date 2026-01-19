package Z4;

import android.net.ssl.SSLSockets;
import android.os.Build;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a implements n {
    @Override // Z4.n
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // Z4.n
    public final boolean b() {
        Y4.n nVar = Y4.n.a;
        return F2.h.j() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // Z4.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals(FlexmarkHtmlConverter.DEFAULT_NODE)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // Z4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1276k.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Y4.n nVar = Y4.n.a;
            sSLParameters.setApplicationProtocols((String[]) F2.h.a(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e6) {
            throw new IOException("Android internal error", e6);
        }
    }
}
