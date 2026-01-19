package Q4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.format.TableCell;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;

/* renamed from: Q4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495c {

    /* renamed from: n, reason: collision with root package name */
    public static final C0495c f6498n = new C0495c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: o, reason: collision with root package name */
    public static final C0495c f6499o;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6501c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6502d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6503e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6504f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6505g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6506h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6507i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6508j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6509k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6510l;

    /* renamed from: m, reason: collision with root package name */
    public String f6511m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC1276k.f(timeUnit, "timeUnit");
        int i6 = TableCell.NOT_TRACKED;
        long seconds = timeUnit.toSeconds(TableCell.NOT_TRACKED);
        if (seconds <= 2147483647L) {
            i6 = (int) seconds;
        }
        f6499o = new C0495c(false, false, -1, -1, false, false, false, i6, -1, true, false, false, null);
    }

    public C0495c(boolean z5, boolean z6, int i6, int i7, boolean z7, boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, String str) {
        this.a = z5;
        this.f6500b = z6;
        this.f6501c = i6;
        this.f6502d = i7;
        this.f6503e = z7;
        this.f6504f = z8;
        this.f6505g = z9;
        this.f6506h = i8;
        this.f6507i = i9;
        this.f6508j = z10;
        this.f6509k = z11;
        this.f6510l = z12;
        this.f6511m = str;
    }

    public final String toString() {
        String str = this.f6511m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.f6500b) {
            sb.append("no-store, ");
        }
        int i6 = this.f6501c;
        if (i6 != -1) {
            sb.append("max-age=");
            sb.append(i6);
            sb.append(", ");
        }
        int i7 = this.f6502d;
        if (i7 != -1) {
            sb.append("s-maxage=");
            sb.append(i7);
            sb.append(", ");
        }
        if (this.f6503e) {
            sb.append("private, ");
        }
        if (this.f6504f) {
            sb.append("public, ");
        }
        if (this.f6505g) {
            sb.append("must-revalidate, ");
        }
        int i8 = this.f6506h;
        if (i8 != -1) {
            sb.append("max-stale=");
            sb.append(i8);
            sb.append(", ");
        }
        int i9 = this.f6507i;
        if (i9 != -1) {
            sb.append("min-fresh=");
            sb.append(i9);
            sb.append(", ");
        }
        if (this.f6508j) {
            sb.append("only-if-cached, ");
        }
        if (this.f6509k) {
            sb.append("no-transform, ");
        }
        if (this.f6510l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f6511m = sb2;
        return sb2;
    }
}
