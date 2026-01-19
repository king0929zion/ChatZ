package r;

import i4.AbstractC1120d;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import x4.C1928k;
import x4.C1941x;

/* renamed from: r.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1509A {
    public final A.h a;

    /* renamed from: b, reason: collision with root package name */
    public final C1928k f13960b;

    public C1509A(A.h hVar, C1928k c1928k) {
        this.a = hVar;
        this.f13960b = c1928k;
    }

    public final String toString() {
        String str;
        C1928k c1928k = this.f13960b;
        C1941x c1941x = (C1941x) c1928k.f15708h.r(C1941x.f15735f);
        String str2 = c1941x != null ? c1941x.f15736e : null;
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        AbstractC1120d.g(16);
        String num = Integer.toString(hashCode, 16);
        AbstractC1276k.e(num, "toString(...)");
        sb.append(num);
        if (str2 == null || (str = AbstractC1135a.s("[", str2, "](")) == null) {
            str = "(";
        }
        sb.append(str);
        sb.append("currentBounds()=");
        sb.append(this.a.b());
        sb.append(", continuation=");
        sb.append(c1928k);
        sb.append(')');
        return sb.toString();
    }
}
