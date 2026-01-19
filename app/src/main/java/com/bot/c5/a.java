package c5;

import Y4.l;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: e, reason: collision with root package name */
    public final d f11124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(26);
        AbstractC1276k.f(dVar, "trustRootIndex");
        this.f11124e = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && AbstractC1276k.b(((a) obj).f11124e, this.f11124e);
    }

    @Override // Y4.l
    public final int hashCode() {
        return this.f11124e.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    @Override // Y4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List r(java.lang.String r9, java.util.List r10) {
        /*
            r8 = this;
            java.lang.String r0 = "chain"
            m4.AbstractC1276k.f(r10, r0)
            java.lang.String r0 = "hostname"
            m4.AbstractC1276k.f(r9, r0)
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r0 = r9.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            m4.AbstractC1276k.e(r0, r1)
            r10.add(r0)
            r0 = 0
            r1 = r0
        L22:
            r2 = 9
            if (r0 >= r2) goto Lb5
            int r2 = r10.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            m4.AbstractC1276k.d(r2, r4)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            c5.d r5 = r8.f11124e
            java.security.cert.X509Certificate r5 = r5.a(r2)
            if (r5 == 0) goto L67
            int r1 = r10.size()
            if (r1 > r3) goto L4b
            boolean r1 = r2.equals(r5)
            if (r1 != 0) goto L4e
        L4b:
            r10.add(r5)
        L4e:
            java.security.Principal r1 = r5.getIssuerDN()
            java.security.Principal r2 = r5.getSubjectDN()
            boolean r1 = m4.AbstractC1276k.b(r1, r2)
            if (r1 != 0) goto L5d
            goto L65
        L5d:
            java.security.PublicKey r1 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L65
            r5.verify(r1)     // Catch: java.security.GeneralSecurityException -> L65
            goto La0
        L65:
            r1 = r3
            goto L9b
        L67:
            java.util.Iterator r3 = r9.iterator()
            java.lang.String r5 = "queue.iterator()"
            m4.AbstractC1276k.e(r3, r5)
        L70:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L9e
            java.lang.Object r5 = r3.next()
            m4.AbstractC1276k.d(r5, r4)
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            java.security.Principal r6 = r2.getIssuerDN()
            java.security.Principal r7 = r5.getSubjectDN()
            boolean r6 = m4.AbstractC1276k.b(r6, r7)
            if (r6 != 0) goto L8e
            goto L70
        L8e:
            java.security.PublicKey r6 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L70
            r2.verify(r6)     // Catch: java.security.GeneralSecurityException -> L70
            r3.remove()
            r10.add(r5)
        L9b:
            int r0 = r0 + 1
            goto L22
        L9e:
            if (r1 == 0) goto La1
        La0:
            return r10
        La1:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r10.<init>(r0)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lb5:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Certificate chain too long: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.a.r(java.lang.String, java.util.List):java.util.List");
    }
}
