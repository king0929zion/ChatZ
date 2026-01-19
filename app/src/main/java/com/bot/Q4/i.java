package Q4;

import java.util.ArrayList;
import java.util.Arrays;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class i {
    public boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public String[] f6533b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f6534c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6535d;

    public final j a() {
        return new j(this.a, this.f6535d, this.f6533b, this.f6534c);
    }

    public final void b(h... hVarArr) {
        AbstractC1276k.f(hVarArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(hVarArr.length);
        for (h hVar : hVarArr) {
            arrayList.add(hVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void c(String... strArr) {
        AbstractC1276k.f(strArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f6533b = (String[]) strArr.clone();
    }

    public final void d(C... cArr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cArr.length);
        for (C c6 : cArr) {
            arrayList.add(c6.f6486c);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void e(String... strArr) {
        AbstractC1276k.f(strArr, "tlsVersions");
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f6534c = (String[]) strArr.clone();
    }
}
