package p;

import H0.AbstractC0141b0;
import H0.AbstractC0156k;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import r.InterfaceC1618x;
import r.InterfaceC1619x0;
import r.InterfaceC1623y1;
import r.X0;
import t.C1682j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Q0 extends AbstractC0141b0 {
    public final InterfaceC1623y1 a;

    /* renamed from: b, reason: collision with root package name */
    public final X0 f13625b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13626c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1619x0 f13627d;

    /* renamed from: e, reason: collision with root package name */
    public final C1682j f13628e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1618x f13629f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13630g;

    /* renamed from: h, reason: collision with root package name */
    public final C1459u f13631h;

    public Q0(C1459u c1459u, InterfaceC1618x interfaceC1618x, InterfaceC1619x0 interfaceC1619x0, X0 x02, InterfaceC1623y1 interfaceC1623y1, C1682j c1682j, boolean z5, boolean z6) {
        this.a = interfaceC1623y1;
        this.f13625b = x02;
        this.f13626c = z5;
        this.f13627d = interfaceC1619x0;
        this.f13628e = c1682j;
        this.f13629f = interfaceC1618x;
        this.f13630g = z6;
        this.f13631h = c1459u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [H0.k, h0.q, p.R0] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC0156k = new AbstractC0156k();
        abstractC0156k.f13638t = this.a;
        abstractC0156k.f13639u = this.f13625b;
        abstractC0156k.f13640v = this.f13626c;
        abstractC0156k.f13641w = this.f13627d;
        abstractC0156k.f13642x = this.f13628e;
        abstractC0156k.f13643y = this.f13629f;
        abstractC0156k.f13644z = this.f13630g;
        abstractC0156k.f13632A = this.f13631h;
        return abstractC0156k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q0.class != obj.getClass()) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return AbstractC1276k.b(this.a, q02.a) && this.f13625b == q02.f13625b && this.f13626c == q02.f13626c && AbstractC1276k.b(this.f13627d, q02.f13627d) && AbstractC1276k.b(this.f13628e, q02.f13628e) && AbstractC1276k.b(this.f13629f, q02.f13629f) && this.f13630g == q02.f13630g && AbstractC1276k.b(this.f13631h, q02.f13631h);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1682j c1682j = this.f13628e;
        ((R0) abstractC1040q).R0(this.f13631h, this.f13629f, this.f13627d, this.f13625b, this.a, c1682j, this.f13630g, this.f13626c);
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(AbstractC1135a.d((this.f13625b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.f13626c), 31, false);
        InterfaceC1619x0 interfaceC1619x0 = this.f13627d;
        int hashCode = (d6 + (interfaceC1619x0 != null ? interfaceC1619x0.hashCode() : 0)) * 31;
        C1682j c1682j = this.f13628e;
        int hashCode2 = (hashCode + (c1682j != null ? c1682j.hashCode() : 0)) * 31;
        InterfaceC1618x interfaceC1618x = this.f13629f;
        int d7 = AbstractC1135a.d((hashCode2 + (interfaceC1618x != null ? interfaceC1618x.hashCode() : 0)) * 31, 31, this.f13630g);
        C1459u c1459u = this.f13631h;
        return d7 + (c1459u != null ? c1459u.hashCode() : 0);
    }
}
