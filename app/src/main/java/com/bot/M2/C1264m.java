package m2;

import Q4.A;
import m4.AbstractC1276k;

/* renamed from: m2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1264m extends AbstractC1256e {
    public final A a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12947b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.f f12948c;

    public C1264m(A a, String str, k2.f fVar) {
        this.a = a;
        this.f12947b = str;
        this.f12948c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1264m)) {
            return false;
        }
        C1264m c1264m = (C1264m) obj;
        return AbstractC1276k.b(this.a, c1264m.a) && AbstractC1276k.b(this.f12947b, c1264m.f12947b) && this.f12948c == c1264m.f12948c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.f12947b;
        return this.f12948c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
