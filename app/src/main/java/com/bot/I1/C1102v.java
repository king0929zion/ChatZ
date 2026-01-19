package i1;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;

/* renamed from: i1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102v {
    public final boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12016b = true;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1080D f12017c = EnumC1080D.f11959c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12018d = true;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12019e = true;

    /* renamed from: f, reason: collision with root package name */
    public final String f12020f = FlexmarkHtmlConverter.DEFAULT_NODE;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1102v)) {
            return false;
        }
        C1102v c1102v = (C1102v) obj;
        return this.a == c1102v.a && this.f12016b == c1102v.f12016b && this.f12017c == c1102v.f12017c && this.f12018d == c1102v.f12018d && this.f12019e == c1102v.f12019e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12019e) + AbstractC1135a.d((this.f12017c.hashCode() + AbstractC1135a.d(Boolean.hashCode(this.a) * 31, 31, this.f12016b)) * 31, 31, this.f12018d);
    }
}
