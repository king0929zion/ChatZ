package Z4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m4.AbstractC1276k;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {
    public static final g a = new Object();

    @Override // Z4.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // Z4.n
    public final boolean b() {
        boolean z5 = Y4.e.f9827d;
        return Y4.e.f9827d;
    }

    @Override // Z4.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals(FlexmarkHtmlConverter.DEFAULT_NODE)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // Z4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1276k.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Y4.n nVar = Y4.n.a;
            parameters.setApplicationProtocols((String[]) F2.h.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
