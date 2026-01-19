package S0;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: S0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543e {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7627c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7628d;

    public C0543e(Object obj, int i6, int i7, String str) {
        this.a = obj;
        this.f7626b = i6;
        this.f7627c = i7;
        this.f7628d = str;
        if (i6 <= i7) {
            return;
        }
        Y0.a.a("Reversed range is not supported");
    }

    public static C0543e a(C0543e c0543e, InterfaceC0540b interfaceC0540b, int i6, int i7) {
        Object obj = interfaceC0540b;
        if ((i7 & 1) != 0) {
            obj = c0543e.a;
        }
        int i8 = c0543e.f7626b;
        if ((i7 & 4) != 0) {
            i6 = c0543e.f7627c;
        }
        String str = c0543e.f7628d;
        c0543e.getClass();
        return new C0543e(obj, i8, i6, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0543e)) {
            return false;
        }
        C0543e c0543e = (C0543e) obj;
        return AbstractC1276k.b(this.a, c0543e.a) && this.f7626b == c0543e.f7626b && this.f7627c == c0543e.f7627c && AbstractC1276k.b(this.f7628d, c0543e.f7628d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.f7628d.hashCode() + AbstractC1135a.b(this.f7627c, AbstractC1135a.b(this.f7626b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.f7626b);
        sb.append(", end=");
        sb.append(this.f7627c);
        sb.append(", tag=");
        return B3.e.r(sb, this.f7628d, ')');
    }

    public C0543e(int i6, int i7, Object obj) {
        this(obj, i6, i7, FlexmarkHtmlConverter.DEFAULT_NODE);
    }
}
