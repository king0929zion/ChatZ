package S0;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class M {
    public final G a;

    /* renamed from: b, reason: collision with root package name */
    public final G f7604b;

    /* renamed from: c, reason: collision with root package name */
    public final G f7605c;

    /* renamed from: d, reason: collision with root package name */
    public final G f7606d;

    public M(G g3, G g6, G g7, G g8) {
        this.a = g3;
        this.f7604b = g6;
        this.f7605c = g7;
        this.f7606d = g8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof M)) {
            return false;
        }
        M m3 = (M) obj;
        return AbstractC1276k.b(this.a, m3.a) && AbstractC1276k.b(this.f7604b, m3.f7604b) && AbstractC1276k.b(this.f7605c, m3.f7605c) && AbstractC1276k.b(this.f7606d, m3.f7606d);
    }

    public final int hashCode() {
        G g3 = this.a;
        int hashCode = (g3 != null ? g3.hashCode() : 0) * 31;
        G g6 = this.f7604b;
        int hashCode2 = (hashCode + (g6 != null ? g6.hashCode() : 0)) * 31;
        G g7 = this.f7605c;
        int hashCode3 = (hashCode2 + (g7 != null ? g7.hashCode() : 0)) * 31;
        G g8 = this.f7606d;
        return hashCode3 + (g8 != null ? g8.hashCode() : 0);
    }
}
