package C2;

import android.net.Uri;
import i2.C1115i;
import java.net.URL;
import java.util.Locale;
import m2.InterfaceC1257f;
import m2.InterfaceC1258g;
import m4.AbstractC1276k;
import s2.C1665m;
import t3.d;
import u4.u;

/* loaded from: classes.dex */
public final class c implements InterfaceC1257f {
    public final d a;

    public c(d dVar) {
        AbstractC1276k.f(dVar, "httpClient");
        this.a = dVar;
    }

    @Override // m2.InterfaceC1257f
    public final InterfaceC1258g a(Object obj, C1665m c1665m, C1115i c1115i) {
        String str;
        String url;
        String str2;
        AbstractC1276k.f(c1665m, "options");
        if (obj instanceof String) {
            String str3 = (String) obj;
            if (!u.D(str3, "http://", true) && !u.D(str3, "https://", true)) {
                obj = null;
            }
            url = (String) obj;
        } else if (obj instanceof Uri) {
            String scheme = ((Uri) obj).getScheme();
            if (scheme != null) {
                str2 = scheme.toLowerCase(Locale.ROOT);
                AbstractC1276k.e(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            if (!AbstractC1276k.b(str2, "http") && !AbstractC1276k.b(str2, "https")) {
                obj = null;
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                url = uri.toString();
            }
            url = null;
        } else {
            if (obj instanceof URL) {
                String protocol = ((URL) obj).getProtocol();
                if (protocol != null) {
                    str = protocol.toLowerCase(Locale.ROOT);
                    AbstractC1276k.e(str, "toLowerCase(...)");
                } else {
                    str = null;
                }
                if (!AbstractC1276k.b(str, "http") && !AbstractC1276k.b(str, "https")) {
                    obj = null;
                }
                URL url2 = (URL) obj;
                if (url2 != null) {
                    url = url2.toString();
                }
            }
            url = null;
        }
        if (url == null) {
            return null;
        }
        return new b(this.a, url, c1665m);
    }
}
