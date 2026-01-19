package y;

import H0.InterfaceC0160o;
import f0.C0987j;
import h0.AbstractC1040q;
import i4.AbstractC1121e;
import java.util.ArrayList;
import m4.AbstractC1276k;
import q0.C1496b;

/* renamed from: y.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1951H extends AbstractC1040q implements InterfaceC0160o {

    /* renamed from: r, reason: collision with root package name */
    public C1954K f15774r;

    @Override // h0.AbstractC1040q
    public final void E0() {
        this.f15774r.f15791j = this;
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        C1954K c1954k = this.f15774r;
        c1954k.d();
        c1954k.f15783b = null;
        c1954k.f15784c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1951H) && AbstractC1276k.b(this.f15774r, ((C1951H) obj).f15774r);
    }

    public final int hashCode() {
        return this.f15774r.hashCode();
    }

    @Override // H0.InterfaceC0160o
    public final void k0(H0.L l3) {
        C1496b c1496b = l3.f1765c;
        ArrayList arrayList = this.f15774r.f15790i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C1948E c1948e = (C1948E) arrayList.get(i6);
            r0.b bVar = c1948e.f15769n;
            if (bVar != null) {
                long j3 = c1948e.f15768m;
                long j4 = bVar.f14552t;
                float f6 = ((int) (j3 >> 32)) - ((int) (j4 >> 32));
                float f7 = ((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L));
                ((C0987j) c1496b.f13944e.f1972e).G(f6, f7);
                try {
                    AbstractC1121e.l(l3, bVar);
                } finally {
                    ((C0987j) c1496b.f13944e.f1972e).G(-f6, -f7);
                }
            }
        }
        l3.b();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f15774r + ')';
    }
}
