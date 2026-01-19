package l0;

import F0.InterfaceC0121i;
import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;
import h0.InterfaceC1028e;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import n0.C1356e;
import o0.C1400k;
import t0.AbstractC1688b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m extends AbstractC0141b0 {
    public final AbstractC1688b a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1028e f12650b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0121i f12651c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12652d;

    /* renamed from: e, reason: collision with root package name */
    public final C1400k f12653e;

    public m(AbstractC1688b abstractC1688b, InterfaceC1028e interfaceC1028e, InterfaceC0121i interfaceC0121i, float f6, C1400k c1400k) {
        this.a = abstractC1688b;
        this.f12650b = interfaceC1028e;
        this.f12651c = interfaceC0121i;
        this.f12652d = f6;
        this.f12653e = c1400k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.n, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f12654r = this.a;
        abstractC1040q.f12655s = true;
        abstractC1040q.f12656t = this.f12650b;
        abstractC1040q.f12657u = this.f12651c;
        abstractC1040q.f12658v = this.f12652d;
        abstractC1040q.f12659w = this.f12653e;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC1276k.b(this.a, mVar.a) && AbstractC1276k.b(this.f12650b, mVar.f12650b) && this.f12651c.equals(mVar.f12651c) && Float.compare(this.f12652d, mVar.f12652d) == 0 && AbstractC1276k.b(this.f12653e, mVar.f12653e);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        n nVar = (n) abstractC1040q;
        boolean z5 = nVar.f12655s;
        AbstractC1688b abstractC1688b = this.a;
        boolean z6 = (z5 && C1356e.a(nVar.f12654r.h(), abstractC1688b.h())) ? false : true;
        nVar.f12654r = abstractC1688b;
        nVar.f12655s = true;
        nVar.f12656t = this.f12650b;
        nVar.f12657u = this.f12651c;
        nVar.f12658v = this.f12652d;
        nVar.f12659w = this.f12653e;
        if (z6) {
            AbstractC0157l.l(nVar);
        }
        AbstractC0157l.k(nVar);
    }

    public final int hashCode() {
        int a = AbstractC1135a.a(this.f12652d, (this.f12651c.hashCode() + ((this.f12650b.hashCode() + AbstractC1135a.d(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        C1400k c1400k = this.f12653e;
        return a + (c1400k == null ? 0 : c1400k.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.f12650b + ", contentScale=" + this.f12651c + ", alpha=" + this.f12652d + ", colorFilter=" + this.f12653e + ')';
    }
}
