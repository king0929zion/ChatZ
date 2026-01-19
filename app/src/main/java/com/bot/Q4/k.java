package Q4;

import j1.AbstractC1135a;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f6541j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f6542k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f6543l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f6544m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6545b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6546c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6547d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6548e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6549f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6550g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6551h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6552i;

    public k(String str, String str2, long j3, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.a = str;
        this.f6545b = str2;
        this.f6546c = j3;
        this.f6547d = str3;
        this.f6548e = str4;
        this.f6549f = z5;
        this.f6550g = z6;
        this.f6551h = z7;
        this.f6552i = z8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return AbstractC1276k.b(kVar.a, this.a) && AbstractC1276k.b(kVar.f6545b, this.f6545b) && kVar.f6546c == this.f6546c && AbstractC1276k.b(kVar.f6547d, this.f6547d) && AbstractC1276k.b(kVar.f6548e, this.f6548e) && kVar.f6549f == this.f6549f && kVar.f6550g == this.f6550g && kVar.f6551h == this.f6551h && kVar.f6552i == this.f6552i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6552i) + AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.d(B3.e.e(B3.e.e(AbstractC1135a.c(B3.e.e(B3.e.e(527, 31, this.a), 31, this.f6545b), 31, this.f6546c), 31, this.f6547d), 31, this.f6548e), 31, this.f6549f), 31, this.f6550g), 31, this.f6551h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.f6545b);
        if (this.f6551h) {
            long j3 = this.f6546c;
            if (j3 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) V4.c.a.get()).format(new Date(j3));
                AbstractC1276k.e(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f6552i) {
            sb.append("; domain=");
            sb.append(this.f6547d);
        }
        sb.append("; path=");
        sb.append(this.f6548e);
        if (this.f6549f) {
            sb.append("; secure");
        }
        if (this.f6550g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString()");
        return sb2;
    }
}
