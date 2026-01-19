package A0;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends AbstractC0141b0 {
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final e f42b;

    public f(a aVar, e eVar) {
        this.a = aVar;
        this.f42b = eVar;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new j(this.a, this.f42b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC1276k.b(fVar.a, this.a) && AbstractC1276k.b(fVar.f42b, this.f42b);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        j jVar = (j) abstractC1040q;
        jVar.f52r = this.a;
        e eVar = jVar.f53s;
        if (eVar.a == jVar) {
            eVar.a = null;
        }
        e eVar2 = this.f42b;
        if (eVar2 == null) {
            jVar.f53s = new e();
        } else if (!eVar2.equals(eVar)) {
            jVar.f53s = eVar2;
        }
        if (jVar.f11819q) {
            e eVar3 = jVar.f53s;
            eVar3.a = jVar;
            eVar3.f39b = null;
            jVar.f54t = null;
            eVar3.f40c = new b(jVar, 1);
            eVar3.f41d = jVar.A0();
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e eVar = this.f42b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
