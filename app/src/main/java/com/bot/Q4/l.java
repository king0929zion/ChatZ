package Q4;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class l {
    public final C a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6553b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6554c;

    /* renamed from: d, reason: collision with root package name */
    public final X3.n f6555d;

    public l(C c6, h hVar, List list, InterfaceC1193a interfaceC1193a) {
        this.a = c6;
        this.f6553b = hVar;
        this.f6554c = list;
        this.f6555d = X3.a.d(new A0.b(interfaceC1193a));
    }

    public final List a() {
        return (List) this.f6555d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.a == this.a && AbstractC1276k.b(lVar.f6553b, this.f6553b) && AbstractC1276k.b(lVar.a(), a()) && AbstractC1276k.b(lVar.f6554c, this.f6554c);
    }

    public final int hashCode() {
        return this.f6554c.hashCode() + ((a().hashCode() + ((this.f6553b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a = a();
        ArrayList arrayList = new ArrayList(Y3.n.Z(a, 10));
        for (Certificate certificate : a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC1276k.e(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.f6553b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f6554c;
        ArrayList arrayList2 = new ArrayList(Y3.n.Z(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC1276k.e(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
