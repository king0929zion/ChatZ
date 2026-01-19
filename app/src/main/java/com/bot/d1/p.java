package d1;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f11396c = new p(1.0f, S.l.f7374V);
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11397b;

    public p(float f6, float f7) {
        this.a = f6;
        this.f11397b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.f11397b == pVar.f11397b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11397b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return AbstractC1135a.h(sb, this.f11397b, ')');
    }
}
