package q;

import j1.AbstractC1135a;
import o0.s;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1491c {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13921b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13922c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13923d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13924e;

    public C1491c(long j3, long j4, long j5, long j6, long j7) {
        this.a = j3;
        this.f13921b = j4;
        this.f13922c = j5;
        this.f13923d = j6;
        this.f13924e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1491c)) {
            return false;
        }
        C1491c c1491c = (C1491c) obj;
        return s.d(this.a, c1491c.a) && s.d(this.f13921b, c1491c.f13921b) && s.d(this.f13922c, c1491c.f13922c) && s.d(this.f13923d, c1491c.f13923d) && s.d(this.f13924e, c1491c.f13924e);
    }

    public final int hashCode() {
        int i6 = s.f13482i;
        return Long.hashCode(this.f13924e) + AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f13921b), 31, this.f13922c), 31, this.f13923d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC1135a.p(this.a, sb, ", textColor=");
        AbstractC1135a.p(this.f13921b, sb, ", iconColor=");
        AbstractC1135a.p(this.f13922c, sb, ", disabledTextColor=");
        AbstractC1135a.p(this.f13923d, sb, ", disabledIconColor=");
        sb.append((Object) s.j(this.f13924e));
        sb.append(')');
        return sb.toString();
    }
}
