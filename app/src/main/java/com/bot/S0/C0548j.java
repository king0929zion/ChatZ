package S0;

import d1.C0934a;
import e1.C0959a;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: S0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548j {
    public final K a;

    public C0548j(K k3) {
        this.a = k3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0548j)) {
            return false;
        }
        K k3 = this.a;
        C0545g c0545g = k3.a;
        C0548j c0548j = (C0548j) obj;
        K k5 = c0548j.a;
        K k6 = c0548j.a;
        return AbstractC1276k.b(c0545g, k5.a) && k3.f7590b.c(k6.f7590b) && AbstractC1276k.b(k3.f7591c, k6.f7591c) && k3.f7592d == k6.f7592d && k3.f7593e == k6.f7593e && k3.f7594f == k6.f7594f && AbstractC1276k.b(k3.f7595g, k6.f7595g) && k3.f7596h == k6.f7596h && k3.f7597i == k6.f7597i && C0959a.b(k3.f7598j, k6.f7598j);
    }

    public final int hashCode() {
        K k3 = this.a;
        int hashCode = k3.a.hashCode() * 31;
        P p5 = k3.f7590b;
        G g3 = p5.a;
        long j3 = g3.f7571b;
        e1.p[] pVarArr = e1.o.f11579b;
        int hashCode2 = Long.hashCode(j3) * 31;
        W0.k kVar = g3.f7572c;
        int i6 = (hashCode2 + (kVar != null ? kVar.f8840c : 0)) * 31;
        W0.i iVar = g3.f7573d;
        int hashCode3 = (i6 + (iVar != null ? Integer.hashCode(iVar.a) : 0)) * 31;
        W0.j jVar = g3.f7574e;
        int hashCode4 = (hashCode3 + (jVar != null ? Integer.hashCode(jVar.a) : 0)) * 31;
        W0.p pVar = g3.f7575f;
        int hashCode5 = (hashCode4 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str = g3.f7576g;
        int c6 = AbstractC1135a.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, g3.f7577h);
        C0934a c0934a = g3.f7578i;
        int hashCode6 = (c6 + (c0934a != null ? Float.hashCode(c0934a.a) : 0)) * 31;
        d1.p pVar2 = g3.f7579j;
        int hashCode7 = (hashCode6 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        Z0.b bVar = g3.f7580k;
        int hashCode8 = (hashCode7 + (bVar != null ? bVar.f9855c.hashCode() : 0)) * 31;
        long j4 = g3.f7581l;
        int i7 = o0.s.f13482i;
        int c7 = AbstractC1135a.c(hashCode8, 31, j4);
        x xVar = g3.f7584o;
        int hashCode9 = (p5.f7613b.hashCode() + ((c7 + (xVar != null ? xVar.hashCode() : 0)) * 31)) * 31;
        y yVar = p5.f7614c;
        return Long.hashCode(k3.f7598j) + ((k3.f7597i.hashCode() + ((k3.f7596h.hashCode() + ((k3.f7595g.hashCode() + AbstractC1135a.b(k3.f7594f, AbstractC1135a.d((AbstractC1135a.e(k3.f7591c, (hashCode9 + (yVar != null ? yVar.hashCode() : 0) + hashCode) * 31, 31) + k3.f7592d) * 31, 31, k3.f7593e), 31)) * 31)) * 31)) * 31);
    }
}
