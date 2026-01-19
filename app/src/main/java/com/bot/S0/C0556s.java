package S0;

import a1.C0795c;
import j1.AbstractC1135a;

/* renamed from: S0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556s {
    public final C0795c a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7663b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7664c;

    public C0556s(C0795c c0795c, int i6, int i7) {
        this.a = c0795c;
        this.f7663b = i6;
        this.f7664c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0556s)) {
            return false;
        }
        C0556s c0556s = (C0556s) obj;
        return this.a.equals(c0556s.a) && this.f7663b == c0556s.f7663b && this.f7664c == c0556s.f7664c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7664c) + AbstractC1135a.b(this.f7663b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.f7663b);
        sb.append(", endIndex=");
        return B3.e.q(sb, this.f7664c, ')');
    }
}
