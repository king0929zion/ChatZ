package n0;

import S.l;
import i1.AbstractC1087g;
import j1.AbstractC1135a;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1354c {

    /* renamed from: e, reason: collision with root package name */
    public static final C1354c f13294e = new C1354c(l.f7374V, l.f7374V, l.f7374V, l.f7374V);
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13295b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13296c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13297d;

    public C1354c(float f6, float f7, float f8, float f9) {
        this.a = f6;
        this.f13295b = f7;
        this.f13296c = f8;
        this.f13297d = f9;
    }

    public static C1354c b(C1354c c1354c, float f6, float f7, float f8, int i6) {
        if ((i6 & 1) != 0) {
            f6 = c1354c.a;
        }
        float f9 = c1354c.f13295b;
        if ((i6 & 4) != 0) {
            f7 = c1354c.f13296c;
        }
        if ((i6 & 8) != 0) {
            f8 = c1354c.f13297d;
        }
        return new C1354c(f6, f9, f7, f8);
    }

    public final boolean a(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (intBitsToFloat >= this.a) & (intBitsToFloat < this.f13296c) & (intBitsToFloat2 >= this.f13295b) & (intBitsToFloat2 < this.f13297d);
    }

    public final long c() {
        float f6 = this.f13296c;
        float f7 = this.a;
        float f8 = ((f6 - f7) / 2.0f) + f7;
        float f9 = this.f13297d;
        float f10 = this.f13295b;
        return (Float.floatToRawIntBits(((f9 - f10) / 2.0f) + f10) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    public final long d() {
        float f6 = this.f13296c - this.a;
        float f7 = this.f13297d - this.f13295b;
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public final long e() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.f13295b) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1354c)) {
            return false;
        }
        C1354c c1354c = (C1354c) obj;
        return Float.compare(this.a, c1354c.a) == 0 && Float.compare(this.f13295b, c1354c.f13295b) == 0 && Float.compare(this.f13296c, c1354c.f13296c) == 0 && Float.compare(this.f13297d, c1354c.f13297d) == 0;
    }

    public final C1354c f(C1354c c1354c) {
        return new C1354c(Math.max(this.a, c1354c.a), Math.max(this.f13295b, c1354c.f13295b), Math.min(this.f13296c, c1354c.f13296c), Math.min(this.f13297d, c1354c.f13297d));
    }

    public final boolean g() {
        return (this.a >= this.f13296c) | (this.f13295b >= this.f13297d);
    }

    public final boolean h(C1354c c1354c) {
        return (this.a < c1354c.f13296c) & (c1354c.a < this.f13296c) & (this.f13295b < c1354c.f13297d) & (c1354c.f13295b < this.f13297d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13297d) + AbstractC1135a.a(this.f13296c, AbstractC1135a.a(this.f13295b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final C1354c i(float f6, float f7) {
        return new C1354c(this.a + f6, this.f13295b + f7, this.f13296c + f6, this.f13297d + f7);
    }

    public final C1354c j(long j3) {
        int i6 = (int) (j3 >> 32);
        int i7 = (int) (j3 & 4294967295L);
        return new C1354c(Float.intBitsToFloat(i6) + this.a, Float.intBitsToFloat(i7) + this.f13295b, Float.intBitsToFloat(i6) + this.f13296c, Float.intBitsToFloat(i7) + this.f13297d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC1087g.o(this.a) + ", " + AbstractC1087g.o(this.f13295b) + ", " + AbstractC1087g.o(this.f13296c) + ", " + AbstractC1087g.o(this.f13297d) + ')';
    }
}
