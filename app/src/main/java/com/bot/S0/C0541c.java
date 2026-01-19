package S0;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: S0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541c {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7620b;

    /* renamed from: c, reason: collision with root package name */
    public int f7621c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7622d;

    public C0541c(Object obj, int i6, int i7, String str) {
        this.a = obj;
        this.f7620b = i6;
        this.f7621c = i7;
        this.f7622d = str;
    }

    public final C0543e a(int i6) {
        int i7 = this.f7621c;
        if (i7 != Integer.MIN_VALUE) {
            i6 = i7;
        }
        if (!(i6 != Integer.MIN_VALUE)) {
            Y0.a.b("Item.end should be set first");
        }
        return new C0543e(this.a, this.f7620b, i6, this.f7622d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0541c)) {
            return false;
        }
        C0541c c0541c = (C0541c) obj;
        return AbstractC1276k.b(this.a, c0541c.a) && this.f7620b == c0541c.f7620b && this.f7621c == c0541c.f7621c && AbstractC1276k.b(this.f7622d, c0541c.f7622d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.f7622d.hashCode() + AbstractC1135a.b(this.f7621c, AbstractC1135a.b(this.f7620b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.f7620b);
        sb.append(", end=");
        sb.append(this.f7621c);
        sb.append(", tag=");
        return B3.e.r(sb, this.f7622d, ')');
    }

    public /* synthetic */ C0541c(InterfaceC0540b interfaceC0540b, int i6, int i7, int i8) {
        this(interfaceC0540b, i6, (i8 & 4) != 0 ? Integer.MIN_VALUE : i7, FlexmarkHtmlConverter.DEFAULT_NODE);
    }
}
