package X0;

import S0.C0545g;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class B {
    public final C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public final p f9076b;

    public B(C0545g c0545g, p pVar) {
        this.a = c0545g;
        this.f9076b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        return AbstractC1276k.b(this.a, b5.a) && AbstractC1276k.b(this.f9076b, b5.f9076b);
    }

    public final int hashCode() {
        return this.f9076b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.f9076b + ')';
    }
}
