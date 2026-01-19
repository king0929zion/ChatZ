package N;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import S0.C0545g;
import S0.P;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f extends AbstractC0141b0 {
    public final C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public final P f3553b;

    /* renamed from: c, reason: collision with root package name */
    public final W0.d f3554c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.c f3555d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3556e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3557f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3558g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3559h;

    /* renamed from: i, reason: collision with root package name */
    public final List f3560i;

    /* renamed from: j, reason: collision with root package name */
    public final l4.c f3561j;

    /* renamed from: k, reason: collision with root package name */
    public final i f3562k;

    public f(C0545g c0545g, P p5, W0.d dVar, l4.c cVar, int i6, boolean z5, int i7, int i8, List list, l4.c cVar2, i iVar) {
        this.a = c0545g;
        this.f3553b = p5;
        this.f3554c = dVar;
        this.f3555d = cVar;
        this.f3556e = i6;
        this.f3557f = z5;
        this.f3558g = i7;
        this.f3559h = i8;
        this.f3560i = list;
        this.f3561j = cVar2;
        this.f3562k = iVar;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new g(this.a, this.f3553b, this.f3554c, this.f3555d, this.f3556e, this.f3557f, this.f3558g, this.f3559h, this.f3560i, this.f3561j, this.f3562k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.getClass();
        return AbstractC1276k.b(this.a, fVar.a) && AbstractC1276k.b(this.f3553b, fVar.f3553b) && AbstractC1276k.b(this.f3560i, fVar.f3560i) && AbstractC1276k.b(this.f3554c, fVar.f3554c) && this.f3555d == fVar.f3555d && this.f3556e == fVar.f3556e && this.f3557f == fVar.f3557f && this.f3558g == fVar.f3558g && this.f3559h == fVar.f3559h && this.f3561j == fVar.f3561j && AbstractC1276k.b(this.f3562k, fVar.f3562k);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        boolean z5;
        g gVar = (g) abstractC1040q;
        q qVar = gVar.f3564u;
        P p5 = qVar.f3608s;
        P p6 = this.f3553b;
        if (p6 == p5) {
            p6.getClass();
        } else if (!p6.a.b(p5.a)) {
            z5 = true;
            boolean R02 = qVar.R0(this.a);
            boolean Q02 = gVar.f3564u.Q0(p6, this.f3560i, this.f3559h, this.f3558g, this.f3557f, this.f3554c, this.f3556e);
            l4.c cVar = this.f3555d;
            l4.c cVar2 = this.f3561j;
            i iVar = this.f3562k;
            qVar.M0(z5, R02, Q02, qVar.P0(cVar, cVar2, iVar, null));
            gVar.f3563t = iVar;
            AbstractC0157l.l(gVar);
        }
        z5 = false;
        boolean R022 = qVar.R0(this.a);
        boolean Q022 = gVar.f3564u.Q0(p6, this.f3560i, this.f3559h, this.f3558g, this.f3557f, this.f3554c, this.f3556e);
        l4.c cVar3 = this.f3555d;
        l4.c cVar22 = this.f3561j;
        i iVar2 = this.f3562k;
        qVar.M0(z5, R022, Q022, qVar.P0(cVar3, cVar22, iVar2, null));
        gVar.f3563t = iVar2;
        AbstractC0157l.l(gVar);
    }

    public final int hashCode() {
        int hashCode = (this.f3554c.hashCode() + B3.e.d(this.a.hashCode() * 31, 31, this.f3553b)) * 31;
        l4.c cVar = this.f3555d;
        int d6 = (((AbstractC1135a.d(AbstractC1135a.b(this.f3556e, (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31, this.f3557f) + this.f3558g) * 31) + this.f3559h) * 31;
        List list = this.f3560i;
        int hashCode2 = (d6 + (list != null ? list.hashCode() : 0)) * 31;
        l4.c cVar2 = this.f3561j;
        int hashCode3 = (hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        i iVar = this.f3562k;
        return (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 961;
    }
}
