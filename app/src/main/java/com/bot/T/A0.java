package T;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class A0 extends r {

    /* renamed from: d, reason: collision with root package name */
    public final r f7931d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7932e;

    public A0(r rVar, int i6) {
        this.f7931d = rVar;
        this.f7932e = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return AbstractC1276k.b(a02.f7931d, this.f7931d) && a02.f7932e == this.f7932e;
    }

    public final int hashCode() {
        return this.f7931d.hashCode() + (this.f7932e * 31);
    }
}
