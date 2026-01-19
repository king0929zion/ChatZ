package S2;

import S0.C0545g;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: S2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557a {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7729b;

    /* renamed from: c, reason: collision with root package name */
    public final C0545g f7730c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7732e;

    public C0557a(int i6, String str, C0545g c0545g, int i7, int i8) {
        this.a = i6;
        this.f7729b = str;
        this.f7730c = c0545g;
        this.f7731d = i7;
        this.f7732e = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0557a)) {
            return false;
        }
        C0557a c0557a = (C0557a) obj;
        return this.a == c0557a.a && AbstractC1276k.b(this.f7729b, c0557a.f7729b) && AbstractC1276k.b(this.f7730c, c0557a.f7730c) && this.f7731d == c0557a.f7731d && this.f7732e == c0557a.f7732e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7732e) + AbstractC1135a.b(this.f7731d, (this.f7730c.hashCode() + B3.e.e(Integer.hashCode(this.a) * 31, 31, this.f7729b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnnotatedClusterEntry(index=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.f7729b);
        sb.append(", annotatedText=");
        sb.append((Object) this.f7730c);
        sb.append(", rangeStart=");
        sb.append(this.f7731d);
        sb.append(", rangeEnd=");
        return AbstractC1135a.i(sb, this.f7732e, ")");
    }
}
