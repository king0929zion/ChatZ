package N;

import F0.U;
import F0.W;
import F0.X;
import H0.AbstractC0156k;
import H0.InterfaceC0160o;
import H0.InterfaceC0161p;
import H0.InterfaceC0170z;
import H0.L;
import H0.S;
import H0.i0;
import O.O;
import O.z0;
import S0.C0545g;
import S0.P;
import java.util.List;
import u.AbstractC1734b;

/* loaded from: classes.dex */
public final class g extends AbstractC0156k implements InterfaceC0170z, InterfaceC0160o, InterfaceC0161p {

    /* renamed from: t, reason: collision with root package name */
    public i f3563t;

    /* renamed from: u, reason: collision with root package name */
    public final q f3564u;

    public g(C0545g c0545g, P p5, W0.d dVar, l4.c cVar, int i6, boolean z5, int i7, int i8, List list, l4.c cVar2, i iVar) {
        this.f3563t = iVar;
        q qVar = new q(c0545g, p5, dVar, cVar, i6, z5, i7, i8, list, cVar2, iVar, null);
        M0(qVar);
        this.f3564u = qVar;
        if (this.f3563t != null) {
            return;
        }
        AbstractC1734b.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new RuntimeException();
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // H0.InterfaceC0170z
    public final int P(S s5, U u5, int i6) {
        return this.f3564u.P(s5, u5, i6);
    }

    @Override // H0.InterfaceC0170z
    public final W d(X x5, U u5, long j3) {
        return this.f3564u.d(x5, u5, j3);
    }

    @Override // H0.InterfaceC0170z
    public final int j(S s5, U u5, int i6) {
        return this.f3564u.j(s5, u5, i6);
    }

    @Override // H0.InterfaceC0161p
    public final void j0(i0 i0Var) {
        i iVar = this.f3563t;
        if (iVar != null) {
            iVar.f3570g = m.a(iVar.f3570g, i0Var, null, 2);
            z0 z0Var = iVar.f3568e;
            long j3 = iVar.f3567c;
            z0Var.a = false;
            O o5 = z0Var.f4267e;
            if (o5 != null) {
                o5.f(Long.valueOf(j3));
            }
        }
    }

    @Override // H0.InterfaceC0160o
    public final void k0(L l3) {
        this.f3564u.k0(l3);
    }

    @Override // H0.InterfaceC0170z
    public final int m0(S s5, U u5, int i6) {
        return this.f3564u.m0(s5, u5, i6);
    }

    @Override // H0.InterfaceC0170z
    public final int z0(S s5, U u5, int i6) {
        return this.f3564u.z0(s5, u5, i6);
    }
}
