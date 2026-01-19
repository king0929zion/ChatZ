package r1;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14646b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14647c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14648d;

    public c(String str, String str2, String str3, List list) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.f14646b = str2;
        this.f14647c = str3;
        list.getClass();
        this.f14648d = list;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.f14646b + ", mQuery: " + this.f14647c + ", mCertificates:");
        int i6 = 0;
        while (true) {
            List list = this.f14648d;
            if (i6 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i6);
            for (int i7 = 0; i7 < list2.size(); i7++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i7), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i6++;
        }
    }
}
