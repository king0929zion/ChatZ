package N;

import S0.C0545g;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class p {
    public final C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public C0545g f3597b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3598c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f3599d = null;

    public p(C0545g c0545g, C0545g c0545g2) {
        this.a = c0545g;
        this.f3597b = c0545g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC1276k.b(this.a, pVar.a) && AbstractC1276k.b(this.f3597b, pVar.f3597b) && this.f3598c == pVar.f3598c && AbstractC1276k.b(this.f3599d, pVar.f3599d);
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d((this.f3597b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.f3598c);
        d dVar = this.f3599d;
        return d6 + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.f3597b) + ", isShowingSubstitution=" + this.f3598c + ", layoutCache=" + this.f3599d + ')';
    }
}
