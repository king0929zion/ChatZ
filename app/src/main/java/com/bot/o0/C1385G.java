package o0;

import i4.AbstractC1118b;
import m4.AbstractC1276k;
import n0.C1354c;
import n0.C1355d;

/* renamed from: o0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1385G extends y {

    /* renamed from: f, reason: collision with root package name */
    public final C1355d f13411f;

    /* renamed from: g, reason: collision with root package name */
    public final C1397h f13412g;

    public C1385G(C1355d c1355d) {
        C1397h c1397h;
        this.f13411f = c1355d;
        if (AbstractC1118b.q(c1355d)) {
            c1397h = null;
        } else {
            c1397h = AbstractC1399j.a();
            C1397h.b(c1397h, c1355d);
        }
        this.f13412g = c1397h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1385G) {
            return AbstractC1276k.b(this.f13411f, ((C1385G) obj).f13411f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13411f.hashCode();
    }

    @Override // o0.y
    public final C1354c n() {
        C1355d c1355d = this.f13411f;
        return new C1354c(c1355d.a, c1355d.f13298b, c1355d.f13299c, c1355d.f13300d);
    }
}
