package R;

import h0.C1031h;
import j1.AbstractC1135a;

/* renamed from: R.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498c implements X {
    public final C1031h a;

    /* renamed from: b, reason: collision with root package name */
    public final C1031h f6740b;

    public C0498c(C1031h c1031h, C1031h c1031h2) {
        this.a = c1031h;
        this.f6740b = c1031h2;
    }

    @Override // R.X
    public final int a(e1.k kVar, long j3, int i6, e1.m mVar) {
        int a = this.f6740b.a(0, kVar.d(), mVar);
        return kVar.a + a + (-this.a.a(0, i6, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0498c)) {
            return false;
        }
        C0498c c0498c = (C0498c) obj;
        return this.a.equals(c0498c.a) && this.f6740b.equals(c0498c.f6740b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC1135a.a(this.f6740b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.f6740b + ", offset=0)";
    }
}
