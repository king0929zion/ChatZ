package Q;

import b0.C0873f;
import m4.AbstractC1276k;

/* renamed from: Q.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466t0 {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final C0873f f6107b;

    public C0466t0(I2 i22, C0873f c0873f) {
        this.a = i22;
        this.f6107b = c0873f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0466t0)) {
            return false;
        }
        C0466t0 c0466t0 = (C0466t0) obj;
        return AbstractC1276k.b(this.a, c0466t0.a) && this.f6107b.equals(c0466t0.f6107b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.f6107b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.f6107b + ')';
    }
}
