package Q4;

import a4.C0826a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f6536e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f6537f;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6538b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f6539c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f6540d;

    static {
        h hVar = h.f6530r;
        h hVar2 = h.f6531s;
        h hVar3 = h.f6532t;
        h hVar4 = h.f6524l;
        h hVar5 = h.f6526n;
        h hVar6 = h.f6525m;
        h hVar7 = h.f6527o;
        h hVar8 = h.f6529q;
        h hVar9 = h.f6528p;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.f6522j, h.f6523k, h.f6520h, h.f6521i, h.f6518f, h.f6519g, h.f6517e};
        i iVar = new i();
        iVar.b((h[]) Arrays.copyOf(hVarArr, 9));
        C c6 = C.TLS_1_3;
        C c7 = C.TLS_1_2;
        iVar.d(c6, c7);
        if (!iVar.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar.f6535d = true;
        iVar.a();
        i iVar2 = new i();
        iVar2.b((h[]) Arrays.copyOf(hVarArr2, 16));
        iVar2.d(c6, c7);
        if (!iVar2.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar2.f6535d = true;
        f6536e = iVar2.a();
        i iVar3 = new i();
        iVar3.b((h[]) Arrays.copyOf(hVarArr2, 16));
        iVar3.d(c6, c7, C.TLS_1_1, C.TLS_1_0);
        if (!iVar3.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar3.f6535d = true;
        iVar3.a();
        f6537f = new j(false, false, null, null);
    }

    public j(boolean z5, boolean z6, String[] strArr, String[] strArr2) {
        this.a = z5;
        this.f6538b = z6;
        this.f6539c = strArr;
        this.f6540d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f6539c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h.f6514b.c(str));
        }
        return Y3.m.J0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.f6540d;
        if (strArr != null && !R4.b.j(strArr, sSLSocket.getEnabledProtocols(), C0826a.f10778b)) {
            return false;
        }
        String[] strArr2 = this.f6539c;
        return strArr2 == null || R4.b.j(strArr2, sSLSocket.getEnabledCipherSuites(), h.f6515c);
    }

    public final List c() {
        String[] strArr = this.f6540d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Y4.d.D(str));
        }
        return Y3.m.J0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z5 = jVar.a;
        boolean z6 = this.a;
        if (z6 != z5) {
            return false;
        }
        if (z6) {
            return Arrays.equals(this.f6539c, jVar.f6539c) && Arrays.equals(this.f6540d, jVar.f6540d) && this.f6538b == jVar.f6538b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.f6539c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f6540d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f6538b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f6538b + ')';
    }
}
