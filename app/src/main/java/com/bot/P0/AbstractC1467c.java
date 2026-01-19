package p0;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1467c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13836b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13837c;

    public AbstractC1467c(long j3, String str, int i6) {
        this.a = str;
        this.f13836b = j3;
        this.f13837c = i6;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i6 < -1 || i6 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i6);

    public abstract float b(int i6);

    public boolean c() {
        return false;
    }

    public abstract long d(float f6, float f7, float f8);

    public abstract float e(float f6, float f7, float f8);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1467c abstractC1467c = (AbstractC1467c) obj;
        if (this.f13837c == abstractC1467c.f13837c && AbstractC1276k.b(this.a, abstractC1467c.a)) {
            return AbstractC1466b.a(this.f13836b, abstractC1467c.f13836b);
        }
        return false;
    }

    public abstract long f(float f6, float f7, float f8, float f9, AbstractC1467c abstractC1467c);

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i6 = AbstractC1466b.f13835e;
        return AbstractC1135a.c(hashCode, 31, this.f13836b) + this.f13837c;
    }

    public final String toString() {
        return this.a + " (id=" + this.f13837c + ", model=" + ((Object) AbstractC1466b.b(this.f13836b)) + ')';
    }
}
