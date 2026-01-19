package m;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import n.r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232n<S> extends AbstractC0141b0 {
    public final r0 a;

    /* renamed from: b, reason: collision with root package name */
    public final T.X f12817b;

    /* renamed from: c, reason: collision with root package name */
    public final C1237s f12818c;

    public C1232n(r0 r0Var, T.X x5, C1237s c1237s) {
        this.a = r0Var;
        this.f12817b = x5;
        this.f12818c = c1237s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.q, m.X, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1216X = new AbstractC1216X(0);
        abstractC1216X.f12825s = this.a;
        abstractC1216X.f12826t = this.f12817b;
        abstractC1216X.f12827u = this.f12818c;
        abstractC1216X.f12828v = AbstractC1227i.a;
        return abstractC1216X;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1232n)) {
            return false;
        }
        C1232n c1232n = (C1232n) obj;
        return AbstractC1276k.b(c1232n.a, this.a) && c1232n.f12817b.equals(this.f12817b);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        C1235q c1235q = (C1235q) abstractC1040q;
        c1235q.f12825s = this.a;
        c1235q.f12826t = this.f12817b;
        c1235q.f12827u = this.f12818c;
    }

    public final int hashCode() {
        int hashCode = this.f12818c.hashCode() * 31;
        r0 r0Var = this.a;
        return this.f12817b.hashCode() + ((hashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31);
    }
}
