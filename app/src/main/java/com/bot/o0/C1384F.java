package o0;

import m4.AbstractC1276k;
import n0.C1354c;

/* renamed from: o0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1384F extends y {

    /* renamed from: f, reason: collision with root package name */
    public final C1354c f13410f;

    public C1384F(C1354c c1354c) {
        this.f13410f = c1354c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1384F) {
            return AbstractC1276k.b(this.f13410f, ((C1384F) obj).f13410f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13410f.hashCode();
    }

    @Override // o0.y
    public final C1354c n() {
        return this.f13410f;
    }
}
