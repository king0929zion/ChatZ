package U4;

import a4.C0826a;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class b {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public int f8686b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8687c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8688d;

    public b(List list) {
        AbstractC1276k.f(list, "connectionSpecs");
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, Q4.i] */
    public final Q4.j a(SSLSocket sSLSocket) {
        Q4.j jVar;
        int i6;
        boolean z5;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i7 = this.f8686b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i7 >= size) {
                jVar = null;
                break;
            }
            jVar = (Q4.j) list.get(i7);
            if (jVar.b(sSLSocket)) {
                this.f8686b = i7 + 1;
                break;
            }
            i7++;
        }
        if (jVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f8688d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC1276k.c(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            AbstractC1276k.e(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i8 = this.f8686b;
        int size2 = list.size();
        while (true) {
            i6 = 0;
            if (i8 >= size2) {
                z5 = false;
                break;
            }
            if (((Q4.j) list.get(i8)).b(sSLSocket)) {
                z5 = true;
                break;
            }
            i8++;
        }
        this.f8687c = z5;
        boolean z6 = this.f8688d;
        String[] strArr = jVar.f6540d;
        String[] strArr2 = jVar.f6539c;
        if (strArr2 != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            AbstractC1276k.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = R4.b.p(enabledCipherSuites2, strArr2, Q4.h.f6515c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            AbstractC1276k.e(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = R4.b.p(enabledProtocols3, strArr, C0826a.f10778b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC1276k.e(supportedCipherSuites, "supportedCipherSuites");
        Q4.g gVar = Q4.h.f6515c;
        byte[] bArr = R4.b.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i6 >= length) {
                i6 = -1;
                break;
            }
            if (gVar.compare(supportedCipherSuites[i6], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i6++;
        }
        if (z6 && i6 != -1) {
            AbstractC1276k.e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i6];
            AbstractC1276k.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC1276k.e(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        ?? obj = new Object();
        obj.a = jVar.a;
        obj.f6533b = strArr2;
        obj.f6534c = strArr;
        obj.f6535d = jVar.f6538b;
        AbstractC1276k.e(enabledCipherSuites, "cipherSuitesIntersection");
        obj.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        AbstractC1276k.e(enabledProtocols, "tlsVersionsIntersection");
        obj.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        Q4.j a = obj.a();
        if (a.c() != null) {
            sSLSocket.setEnabledProtocols(a.f6540d);
        }
        if (a.a() != null) {
            sSLSocket.setEnabledCipherSuites(a.f6539c);
        }
        return jVar;
    }
}
