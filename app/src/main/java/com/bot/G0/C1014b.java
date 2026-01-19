package g0;

import m4.AbstractC1276k;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1014b {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f11768b;

    public C1014b(int i6, Y4.d dVar, Integer num) {
        this.a = i6;
        this.f11768b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1014b)) {
            return false;
        }
        C1014b c1014b = (C1014b) obj;
        return this.a == c1014b.a && AbstractC1276k.b(null, null) && AbstractC1276k.b(this.f11768b, c1014b.f11768b);
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer num = this.f11768b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f11768b + ')';
    }
}
