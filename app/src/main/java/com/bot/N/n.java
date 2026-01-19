package N;

import H0.AbstractC0141b0;
import S0.C0545g;
import S0.P;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class n extends AbstractC0141b0 {
    public final C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public final P f3585b;

    /* renamed from: c, reason: collision with root package name */
    public final W0.d f3586c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.c f3587d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3588e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3589f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3590g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3591h;

    /* renamed from: i, reason: collision with root package name */
    public final List f3592i;

    /* renamed from: j, reason: collision with root package name */
    public final l4.c f3593j;

    /* renamed from: k, reason: collision with root package name */
    public final l4.c f3594k;

    public n(C0545g c0545g, P p5, W0.d dVar, l4.c cVar, int i6, boolean z5, int i7, int i8, List list, l4.c cVar2, l4.c cVar3) {
        this.a = c0545g;
        this.f3585b = p5;
        this.f3586c = dVar;
        this.f3587d = cVar;
        this.f3588e = i6;
        this.f3589f = z5;
        this.f3590g = i7;
        this.f3591h = i8;
        this.f3592i = list;
        this.f3593j = cVar2;
        this.f3594k = cVar3;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new q(this.a, this.f3585b, this.f3586c, this.f3587d, this.f3588e, this.f3589f, this.f3590g, this.f3591h, this.f3592i, this.f3593j, null, this.f3594k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        nVar.getClass();
        return AbstractC1276k.b(this.a, nVar.a) && AbstractC1276k.b(this.f3585b, nVar.f3585b) && AbstractC1276k.b(this.f3592i, nVar.f3592i) && AbstractC1276k.b(this.f3586c, nVar.f3586c) && this.f3587d == nVar.f3587d && this.f3594k == nVar.f3594k && this.f3588e == nVar.f3588e && this.f3589f == nVar.f3589f && this.f3590g == nVar.f3590g && this.f3591h == nVar.f3591h && this.f3593j == nVar.f3593j;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        boolean z5;
        q qVar = (q) abstractC1040q;
        P p5 = qVar.f3608s;
        P p6 = this.f3585b;
        if (p6 == p5) {
            p6.getClass();
        } else if (!p6.a.b(p5.a)) {
            z5 = true;
            qVar.M0(z5, qVar.R0(this.a), qVar.Q0(this.f3585b, this.f3592i, this.f3591h, this.f3590g, this.f3589f, this.f3586c, this.f3588e), qVar.P0(this.f3587d, this.f3593j, null, this.f3594k));
        }
        z5 = false;
        qVar.M0(z5, qVar.R0(this.a), qVar.Q0(this.f3585b, this.f3592i, this.f3591h, this.f3590g, this.f3589f, this.f3586c, this.f3588e), qVar.P0(this.f3587d, this.f3593j, null, this.f3594k));
    }

    public final int hashCode() {
        int hashCode = (this.f3586c.hashCode() + B3.e.d(this.a.hashCode() * 31, 31, this.f3585b)) * 31;
        l4.c cVar = this.f3587d;
        int d6 = (((AbstractC1135a.d(AbstractC1135a.b(this.f3588e, (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31, this.f3589f) + this.f3590g) * 31) + this.f3591h) * 31;
        List list = this.f3592i;
        int hashCode2 = (d6 + (list != null ? list.hashCode() : 0)) * 31;
        l4.c cVar2 = this.f3593j;
        int hashCode3 = (hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 29791;
        l4.c cVar3 = this.f3594k;
        return hashCode3 + (cVar3 != null ? cVar3.hashCode() : 0);
    }
}
