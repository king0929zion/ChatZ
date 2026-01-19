package j2;

import m4.AbstractC1276k;
import s2.C1657e;
import t0.AbstractC1688b;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146b extends e {
    public final AbstractC1688b a;

    /* renamed from: b, reason: collision with root package name */
    public final C1657e f12364b;

    public C1146b(AbstractC1688b abstractC1688b, C1657e c1657e) {
        this.a = abstractC1688b;
        this.f12364b = c1657e;
    }

    @Override // j2.e
    public final AbstractC1688b a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146b)) {
            return false;
        }
        C1146b c1146b = (C1146b) obj;
        return AbstractC1276k.b(this.a, c1146b.a) && AbstractC1276k.b(this.f12364b, c1146b.f12364b);
    }

    public final int hashCode() {
        AbstractC1688b abstractC1688b = this.a;
        return this.f12364b.hashCode() + ((abstractC1688b == null ? 0 : abstractC1688b.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.f12364b + ')';
    }
}
