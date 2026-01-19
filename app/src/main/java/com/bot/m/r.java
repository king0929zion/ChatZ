package M;

import D.C0098v0;
import H0.AbstractC0141b0;
import O.N0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import u.AbstractC1734b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r extends AbstractC0141b0 {
    public final e a;

    /* renamed from: b, reason: collision with root package name */
    public final C0098v0 f3181b;

    /* renamed from: c, reason: collision with root package name */
    public final N0 f3182c;

    public r(e eVar, C0098v0 c0098v0, N0 n02) {
        this.a = eVar;
        this.f3181b = c0098v0;
        this.f3182c = n02;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new t(this.a, this.f3181b, this.f3182c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC1276k.b(this.a, rVar.a) && AbstractC1276k.b(this.f3181b, rVar.f3181b) && AbstractC1276k.b(this.f3182c, rVar.f3182c);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        t tVar = (t) abstractC1040q;
        if (tVar.f11819q) {
            tVar.f3186r.d();
            tVar.f3186r.k(tVar);
        }
        e eVar = this.a;
        tVar.f3186r = eVar;
        if (tVar.f11819q) {
            if (eVar.a != null) {
                AbstractC1734b.c("Expected textInputModifierNode to be null");
            }
            eVar.a = tVar;
        }
        tVar.f3187s = this.f3181b;
        tVar.f3188t = this.f3182c;
    }

    public final int hashCode() {
        return this.f3182c.hashCode() + ((this.f3181b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.f3181b + ", textFieldSelectionManager=" + this.f3182c + ')';
    }
}
