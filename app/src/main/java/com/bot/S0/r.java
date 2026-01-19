package S0;

import i4.AbstractC1117a;
import j1.AbstractC1135a;
import n0.C1354c;

/* loaded from: classes.dex */
public final class r {
    public final C0539a a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7658c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7659d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7660e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7661f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7662g;

    public r(C0539a c0539a, int i6, int i7, int i8, int i9, float f6, float f7) {
        this.a = c0539a;
        this.f7657b = i6;
        this.f7658c = i7;
        this.f7659d = i8;
        this.f7660e = i9;
        this.f7661f = f6;
        this.f7662g = f7;
    }

    public final C1354c a(C1354c c1354c) {
        return c1354c.j((Float.floatToRawIntBits(S.l.f7374V) << 32) | (Float.floatToRawIntBits(this.f7661f) & 4294967295L));
    }

    public final long b(long j3, boolean z5) {
        if (z5) {
            long j4 = O.f7610b;
            if (O.b(j3, j4)) {
                return j4;
            }
        }
        int i6 = O.f7611c;
        int i7 = (int) (j3 >> 32);
        int i8 = this.f7657b;
        return F.b(i7 + i8, ((int) (j3 & 4294967295L)) + i8);
    }

    public final C1354c c(C1354c c1354c) {
        float f6 = -this.f7661f;
        return c1354c.j((Float.floatToRawIntBits(S.l.f7374V) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
    }

    public final int d(int i6) {
        int i7 = this.f7658c;
        int i8 = this.f7657b;
        return AbstractC1117a.f(i6, i8, i7) - i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && this.f7657b == rVar.f7657b && this.f7658c == rVar.f7658c && this.f7659d == rVar.f7659d && this.f7660e == rVar.f7660e && Float.compare(this.f7661f, rVar.f7661f) == 0 && Float.compare(this.f7662g, rVar.f7662g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7662g) + AbstractC1135a.a(this.f7661f, AbstractC1135a.b(this.f7660e, AbstractC1135a.b(this.f7659d, AbstractC1135a.b(this.f7658c, AbstractC1135a.b(this.f7657b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.f7657b);
        sb.append(", endIndex=");
        sb.append(this.f7658c);
        sb.append(", startLineIndex=");
        sb.append(this.f7659d);
        sb.append(", endLineIndex=");
        sb.append(this.f7660e);
        sb.append(", top=");
        sb.append(this.f7661f);
        sb.append(", bottom=");
        return AbstractC1135a.h(sb, this.f7662g, ')');
    }
}
