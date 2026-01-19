package M;

import D.C0098v0;
import H0.AbstractC0141b0;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import O.N0;
import S0.O;
import X0.B;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class g extends AbstractC0141b0 {
    public final B a;

    /* renamed from: b, reason: collision with root package name */
    public final X0.v f3149b;

    /* renamed from: c, reason: collision with root package name */
    public final C0098v0 f3150c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3151d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3152e;

    /* renamed from: f, reason: collision with root package name */
    public final X0.p f3153f;

    /* renamed from: g, reason: collision with root package name */
    public final N0 f3154g;

    /* renamed from: h, reason: collision with root package name */
    public final X0.k f3155h;

    /* renamed from: i, reason: collision with root package name */
    public final m0.w f3156i;

    public g(B b5, X0.v vVar, C0098v0 c0098v0, boolean z5, boolean z6, X0.p pVar, N0 n02, X0.k kVar, m0.w wVar) {
        this.a = b5;
        this.f3149b = vVar;
        this.f3150c = c0098v0;
        this.f3151d = z5;
        this.f3152e = z6;
        this.f3153f = pVar;
        this.f3154g = n02;
        this.f3155h = kVar;
        this.f3156i = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [H0.k, M.j, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC0156k abstractC0156k = new AbstractC0156k();
        abstractC0156k.f3163t = this.a;
        abstractC0156k.f3164u = this.f3149b;
        abstractC0156k.f3165v = this.f3150c;
        abstractC0156k.f3166w = this.f3151d;
        abstractC0156k.f3167x = this.f3152e;
        abstractC0156k.f3168y = this.f3153f;
        N0 n02 = this.f3154g;
        abstractC0156k.f3169z = n02;
        abstractC0156k.f3161A = this.f3155h;
        abstractC0156k.f3162B = this.f3156i;
        n02.f3997f = new h(abstractC0156k, 4);
        return abstractC0156k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && AbstractC1276k.b(this.f3149b, gVar.f3149b) && this.f3150c.equals(gVar.f3150c) && this.f3151d == gVar.f3151d && this.f3152e == gVar.f3152e && AbstractC1276k.b(this.f3153f, gVar.f3153f) && this.f3154g.equals(gVar.f3154g) && AbstractC1276k.b(this.f3155h, gVar.f3155h) && AbstractC1276k.b(this.f3156i, gVar.f3156i);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        j jVar = (j) abstractC1040q;
        boolean z5 = jVar.f3167x;
        boolean z6 = false;
        boolean z7 = z5 && !jVar.f3166w;
        X0.k kVar = jVar.f3161A;
        N0 n02 = jVar.f3169z;
        boolean z8 = this.f3151d;
        boolean z9 = this.f3152e;
        if (z9 && !z8) {
            z6 = true;
        }
        jVar.f3163t = this.a;
        X0.v vVar = this.f3149b;
        jVar.f3164u = vVar;
        jVar.f3165v = this.f3150c;
        jVar.f3166w = z8;
        jVar.f3167x = z9;
        jVar.f3168y = this.f3153f;
        N0 n03 = this.f3154g;
        jVar.f3169z = n03;
        X0.k kVar2 = this.f3155h;
        jVar.f3161A = kVar2;
        jVar.f3162B = this.f3156i;
        if (z9 != z5 || z6 != z7 || !AbstractC1276k.b(kVar2, kVar) || !O.c(vVar.f9125b)) {
            AbstractC0157l.m(jVar);
        }
        if (n03.equals(n02)) {
            return;
        }
        n03.f3997f = new h(jVar, 0);
    }

    public final int hashCode() {
        return this.f3156i.hashCode() + ((this.f3155h.hashCode() + ((this.f3154g.hashCode() + ((this.f3153f.hashCode() + AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.d((this.f3150c.hashCode() + ((this.f3149b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.f3151d), 31, this.f3152e), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.f3149b + ", state=" + this.f3150c + ", readOnly=" + this.f3151d + ", enabled=" + this.f3152e + ", isPassword=false, offsetMapping=" + this.f3153f + ", manager=" + this.f3154g + ", imeOptions=" + this.f3155h + ", focusRequester=" + this.f3156i + ')';
    }
}
