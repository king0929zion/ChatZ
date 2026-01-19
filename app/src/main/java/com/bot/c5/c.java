package c5;

import B3.e;
import Y3.v;
import j1.AbstractC1135a;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {
    public static final c a = new Object();

    public static List a(X509Certificate x509Certificate, int i6) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return v.f9812c;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && AbstractC1276k.b(list.get(0), Integer.valueOf(i6)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        int i6;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(e.l("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder k3 = AbstractC1135a.k("endIndex > string.length: ", length2, " > ");
            k3.append(str.length());
            throw new IllegalArgumentException(k3.toString().toString());
        }
        long j3 = 0;
        int i7 = 0;
        while (i7 < length2) {
            char charAt = str.charAt(i7);
            if (charAt < 128) {
                j3++;
            } else {
                if (charAt < 2048) {
                    i6 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i6 = 3;
                } else {
                    int i8 = i7 + 1;
                    char charAt2 = i8 < length2 ? str.charAt(i8) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j3++;
                        i7 = i8;
                    } else {
                        j3 += 4;
                        i7 += 2;
                    }
                }
                j3 += i6;
            }
            i7++;
        }
        return length == ((int) j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x0065->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        AbstractC1276k.f(str, "host");
        AbstractC1276k.f(sSLSession, "session");
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                AbstractC1276k.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
                return false;
            }
        }
        return false;
    }
}
