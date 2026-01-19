package p;

import m4.AbstractC1276k;
import o0.C1391b;
import o0.C1395f;
import o0.C1397h;
import q0.C1496b;

/* renamed from: p.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1412B {
    public C1395f a = null;

    /* renamed from: b, reason: collision with root package name */
    public C1391b f13547b = null;

    /* renamed from: c, reason: collision with root package name */
    public C1496b f13548c = null;

    /* renamed from: d, reason: collision with root package name */
    public C1397h f13549d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1412B)) {
            return false;
        }
        C1412B c1412b = (C1412B) obj;
        return AbstractC1276k.b(this.a, c1412b.a) && AbstractC1276k.b(this.f13547b, c1412b.f13547b) && AbstractC1276k.b(this.f13548c, c1412b.f13548c) && AbstractC1276k.b(this.f13549d, c1412b.f13549d);
    }

    public final int hashCode() {
        C1395f c1395f = this.a;
        int hashCode = (c1395f == null ? 0 : c1395f.hashCode()) * 31;
        C1391b c1391b = this.f13547b;
        int hashCode2 = (hashCode + (c1391b == null ? 0 : c1391b.hashCode())) * 31;
        C1496b c1496b = this.f13548c;
        int hashCode3 = (hashCode2 + (c1496b == null ? 0 : c1496b.hashCode())) * 31;
        C1397h c1397h = this.f13549d;
        return hashCode3 + (c1397h != null ? c1397h.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.f13547b + ", canvasDrawScope=" + this.f13548c + ", borderPath=" + this.f13549d + ')';
    }
}
