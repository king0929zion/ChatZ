package H0;

import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* renamed from: H0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0156k implements AbstractC1040q {

    /* renamed from: r, reason: collision with root package name */
    public final int f1963r = j0.e(this);

    /* renamed from: s, reason: collision with root package name */
    public AbstractC1040q f1964s;

    @Override // h0.AbstractC1040q
    public final void C0() {
        super.C0();
        for (AbstractC1040q abstractC1040q = this.f1964s; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
            abstractC1040q.L0(this.f11813k);
            if (!abstractC1040q.f11819q) {
                abstractC1040q.C0();
            }
        }
    }

    @Override // h0.AbstractC1040q
    public final void D0() {
        for (AbstractC1040q abstractC1040q = this.f1964s; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
            abstractC1040q.D0();
        }
        super.D0();
    }

    @Override // h0.AbstractC1040q
    public final void H0() {
        super.H0();
        for (AbstractC1040q abstractC1040q = this.f1964s; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
            abstractC1040q.H0();
        }
    }

    @Override // h0.AbstractC1040q
    public final void I0() {
        for (AbstractC1040q abstractC1040q = this.f1964s; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
            abstractC1040q.I0();
        }
        super.I0();
    }

    @Override // h0.AbstractC1040q
    public final void J0() {
        super.J0();
        for (AbstractC1040q abstractC1040q = this.f1964s; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
            abstractC1040q.J0();
        }
    }

    @Override // h0.AbstractC1040q
    public final void K0(AbstractC1040q abstractC1040q) {
        this.f11806c = abstractC1040q;
        for (AbstractC1040q abstractC1040q2 = this.f1964s; abstractC1040q2 != null; abstractC1040q2 = abstractC1040q2.f11811i) {
            abstractC1040q2.K0(abstractC1040q);
        }
    }

    @Override // h0.AbstractC1040q
    public final void L0(i0 i0Var) {
        this.f11813k = i0Var;
        for (AbstractC1040q abstractC1040q = this.f1964s; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
            abstractC1040q.L0(i0Var);
        }
    }

    public final InterfaceC0155j M0(InterfaceC0155j interfaceC0155j) {
        AbstractC1040q abstractC1040q = ((AbstractC1040q) interfaceC0155j).f11806c;
        if (abstractC1040q != interfaceC0155j) {
            AbstractC1040q abstractC1040q2 = interfaceC0155j instanceof AbstractC1040q ? (AbstractC1040q) interfaceC0155j : null;
            AbstractC1040q abstractC1040q3 = abstractC1040q2 != null ? abstractC1040q2.f11810h : null;
            if (abstractC1040q != this.f11806c || !AbstractC1276k.b(abstractC1040q3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (abstractC1040q.f11819q) {
                E0.a.b("Cannot delegate to an already attached node");
            }
            abstractC1040q.K0(this.f11806c);
            int i6 = this.f11808f;
            int f6 = j0.f(abstractC1040q);
            abstractC1040q.f11808f = f6;
            int i7 = this.f11808f;
            int i8 = f6 & 2;
            if (i8 != 0 && (i7 & 2) != 0 && !(this instanceof InterfaceC0170z)) {
                E0.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC1040q);
            }
            abstractC1040q.f11811i = this.f1964s;
            this.f1964s = abstractC1040q;
            abstractC1040q.f11810h = this;
            O0(f6 | this.f11808f, false);
            if (this.f11819q) {
                if (i8 == 0 || (i6 & 2) != 0) {
                    L0(this.f11813k);
                } else {
                    C0149f0 c0149f0 = AbstractC0157l.v(this).f1721J;
                    this.f11806c.L0(null);
                    c0149f0.g();
                }
                abstractC1040q.C0();
                abstractC1040q.I0();
                if (!abstractC1040q.f11819q) {
                    E0.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                j0.a(abstractC1040q, -1, 1);
            }
        }
        return interfaceC0155j;
    }

    public final void N0(InterfaceC0155j interfaceC0155j) {
        AbstractC1040q abstractC1040q = null;
        for (AbstractC1040q abstractC1040q2 = this.f1964s; abstractC1040q2 != null; abstractC1040q2 = abstractC1040q2.f11811i) {
            if (abstractC1040q2 == interfaceC0155j) {
                boolean z5 = abstractC1040q2.f11819q;
                if (z5) {
                    k.H h3 = j0.a;
                    if (!z5) {
                        E0.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    j0.a(abstractC1040q2, -1, 2);
                    abstractC1040q2.J0();
                    abstractC1040q2.D0();
                }
                abstractC1040q2.K0(abstractC1040q2);
                abstractC1040q2.f11809g = 0;
                if (abstractC1040q == null) {
                    this.f1964s = abstractC1040q2.f11811i;
                } else {
                    abstractC1040q.f11811i = abstractC1040q2.f11811i;
                }
                abstractC1040q2.f11811i = null;
                abstractC1040q2.f11810h = null;
                int i6 = this.f11808f;
                int f6 = j0.f(this);
                O0(f6, true);
                if (this.f11819q && (i6 & 2) != 0 && (f6 & 2) == 0) {
                    C0149f0 c0149f0 = AbstractC0157l.v(this).f1721J;
                    this.f11806c.L0(null);
                    c0149f0.g();
                    return;
                }
                return;
            }
            abstractC1040q = abstractC1040q2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0155j).toString());
    }

    public final void O0(int i6, boolean z5) {
        AbstractC1040q abstractC1040q;
        int i7 = this.f11808f;
        this.f11808f = i6;
        if (i7 != i6) {
            AbstractC1040q abstractC1040q2 = this.f11806c;
            if (abstractC1040q2 == this) {
                this.f11809g = i6;
            }
            if (this.f11819q) {
                AbstractC1040q abstractC1040q3 = this;
                while (abstractC1040q3 != null) {
                    i6 |= abstractC1040q3.f11808f;
                    abstractC1040q3.f11808f = i6;
                    if (abstractC1040q3 == abstractC1040q2) {
                        break;
                    } else {
                        abstractC1040q3 = abstractC1040q3.f11810h;
                    }
                }
                if (z5 && abstractC1040q3 == abstractC1040q2) {
                    i6 = j0.f(abstractC1040q2);
                    abstractC1040q2.f11808f = i6;
                }
                int i8 = i6 | ((abstractC1040q3 == null || (abstractC1040q = abstractC1040q3.f11811i) == null) ? 0 : abstractC1040q.f11809g);
                while (abstractC1040q3 != null) {
                    i8 |= abstractC1040q3.f11808f;
                    abstractC1040q3.f11809g = i8;
                    abstractC1040q3 = abstractC1040q3.f11810h;
                }
            }
        }
    }
}
