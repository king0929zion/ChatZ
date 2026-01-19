package n0;

import S.l;
import i1.AbstractC1087g;
import i4.AbstractC1118b;
import io.ktor.utils.io.u;
import j1.AbstractC1135a;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1355d {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13298b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13299c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13300d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13301e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13302f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13303g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13304h;

    static {
        AbstractC1118b.c(l.f7374V, l.f7374V, l.f7374V, l.f7374V, 0L);
    }

    public C1355d(float f6, float f7, float f8, float f9, long j3, long j4, long j5, long j6) {
        this.a = f6;
        this.f13298b = f7;
        this.f13299c = f8;
        this.f13300d = f9;
        this.f13301e = j3;
        this.f13302f = j4;
        this.f13303g = j5;
        this.f13304h = j6;
    }

    public final float a() {
        return this.f13300d - this.f13298b;
    }

    public final float b() {
        return this.f13299c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1355d)) {
            return false;
        }
        C1355d c1355d = (C1355d) obj;
        return Float.compare(this.a, c1355d.a) == 0 && Float.compare(this.f13298b, c1355d.f13298b) == 0 && Float.compare(this.f13299c, c1355d.f13299c) == 0 && Float.compare(this.f13300d, c1355d.f13300d) == 0 && u.h(this.f13301e, c1355d.f13301e) && u.h(this.f13302f, c1355d.f13302f) && u.h(this.f13303g, c1355d.f13303g) && u.h(this.f13304h, c1355d.f13304h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f13304h) + AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.a(this.f13300d, AbstractC1135a.a(this.f13299c, AbstractC1135a.a(this.f13298b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.f13301e), 31, this.f13302f), 31, this.f13303g);
    }

    public final String toString() {
        String str = AbstractC1087g.o(this.a) + ", " + AbstractC1087g.o(this.f13298b) + ", " + AbstractC1087g.o(this.f13299c) + ", " + AbstractC1087g.o(this.f13300d);
        long j3 = this.f13301e;
        long j4 = this.f13302f;
        boolean h3 = u.h(j3, j4);
        long j5 = this.f13303g;
        long j6 = this.f13304h;
        if (!h3 || !u.h(j4, j5) || !u.h(j5, j6)) {
            StringBuilder t5 = B3.e.t("RoundRect(rect=", str, ", topLeft=");
            t5.append((Object) u.n(j3));
            t5.append(", topRight=");
            t5.append((Object) u.n(j4));
            t5.append(", bottomRight=");
            t5.append((Object) u.n(j5));
            t5.append(", bottomLeft=");
            t5.append((Object) u.n(j6));
            t5.append(')');
            return t5.toString();
        }
        int i6 = (int) (j3 >> 32);
        int i7 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i6) == Float.intBitsToFloat(i7)) {
            StringBuilder t6 = B3.e.t("RoundRect(rect=", str, ", radius=");
            t6.append(AbstractC1087g.o(Float.intBitsToFloat(i6)));
            t6.append(')');
            return t6.toString();
        }
        StringBuilder t7 = B3.e.t("RoundRect(rect=", str, ", x=");
        t7.append(AbstractC1087g.o(Float.intBitsToFloat(i6)));
        t7.append(", y=");
        t7.append(AbstractC1087g.o(Float.intBitsToFloat(i7)));
        t7.append(')');
        return t7.toString();
    }
}
