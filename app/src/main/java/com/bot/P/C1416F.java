package p;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;
import l0.C1183c;
import m4.AbstractC1276k;

/* renamed from: p.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416F extends AbstractC0141b0 {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final o0.N f13579b;

    /* renamed from: c, reason: collision with root package name */
    public final o0.L f13580c;

    public C1416F(float f6, o0.N n3, o0.L l3) {
        this.a = f6;
        this.f13579b = n3;
        this.f13580c = l3;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new C1415E(this.a, this.f13579b, this.f13580c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1416F)) {
            return false;
        }
        C1416F c1416f = (C1416F) obj;
        return e1.f.c(this.a, c1416f.a) && this.f13579b.equals(c1416f.f13579b) && AbstractC1276k.b(this.f13580c, c1416f.f13580c);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1415E c1415e = (C1415E) abstractC1040q;
        float f6 = c1415e.f13575u;
        C1183c c1183c = c1415e.f13578x;
        float f7 = this.a;
        if (!e1.f.c(f6, f7)) {
            c1415e.f13575u = f7;
            c1183c.M0();
        }
        o0.N n3 = c1415e.f13576v;
        o0.N n5 = this.f13579b;
        if (!AbstractC1276k.b(n3, n5)) {
            c1415e.f13576v = n5;
            c1183c.M0();
        }
        o0.L l3 = c1415e.f13577w;
        o0.L l5 = this.f13580c;
        if (AbstractC1276k.b(l3, l5)) {
            return;
        }
        c1415e.f13577w = l5;
        c1183c.M0();
        AbstractC0157l.m(c1415e);
    }

    public final int hashCode() {
        return this.f13580c.hashCode() + ((this.f13579b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) e1.f.d(this.a)) + ", brush=" + this.f13579b + ", shape=" + this.f13580c + ')';
    }
}
