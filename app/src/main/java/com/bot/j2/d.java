package j2;

import m4.AbstractC1276k;
import s2.C1667o;
import t0.AbstractC1688b;

/* loaded from: classes.dex */
public final class d extends e {
    public final AbstractC1688b a;

    /* renamed from: b, reason: collision with root package name */
    public final C1667o f12365b;

    public d(AbstractC1688b abstractC1688b, C1667o c1667o) {
        this.a = abstractC1688b;
        this.f12365b = c1667o;
    }

    @Override // j2.e
    public final AbstractC1688b a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC1276k.b(this.a, dVar.a) && AbstractC1276k.b(this.f12365b, dVar.f12365b);
    }

    public final int hashCode() {
        return this.f12365b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.f12365b + ')';
    }
}
