package Q;

import j1.AbstractC1135a;

/* renamed from: Q.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477w {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6179b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6180c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6181d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6182e;

    public C0477w(float f6, float f7, float f8, float f9, float f10) {
        this.a = f6;
        this.f6179b = f7;
        this.f6180c = f8;
        this.f6181d = f9;
        this.f6182e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0477w)) {
            return false;
        }
        C0477w c0477w = (C0477w) obj;
        return e1.f.c(this.a, c0477w.a) && e1.f.c(this.f6179b, c0477w.f6179b) && e1.f.c(this.f6180c, c0477w.f6180c) && e1.f.c(this.f6181d, c0477w.f6181d) && e1.f.c(this.f6182e, c0477w.f6182e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6182e) + AbstractC1135a.a(this.f6181d, AbstractC1135a.a(this.f6180c, AbstractC1135a.a(this.f6179b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
