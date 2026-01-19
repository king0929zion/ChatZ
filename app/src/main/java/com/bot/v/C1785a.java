package v;

import T.C0607g0;
import e1.InterfaceC0961c;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1785a implements F0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15280b;

    /* renamed from: c, reason: collision with root package name */
    public final C0607g0 f15281c = T.r.A(o1.c.f13500e);

    /* renamed from: d, reason: collision with root package name */
    public final C0607g0 f15282d = T.r.A(Boolean.TRUE);

    public C1785a(int i6, String str) {
        this.a = i6;
        this.f15280b = str;
    }

    @Override // v.F0
    public final int a(InterfaceC0961c interfaceC0961c) {
        return e().f13503d;
    }

    @Override // v.F0
    public final int b(InterfaceC0961c interfaceC0961c, e1.m mVar) {
        return e().f13502c;
    }

    @Override // v.F0
    public final int c(InterfaceC0961c interfaceC0961c, e1.m mVar) {
        return e().a;
    }

    @Override // v.F0
    public final int d(InterfaceC0961c interfaceC0961c) {
        return e().f13501b;
    }

    public final o1.c e() {
        return (o1.c) this.f15281c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1785a) {
            return this.a == ((C1785a) obj).a;
        }
        return false;
    }

    public final void f(boolean z5) {
        this.f15282d.setValue(Boolean.valueOf(z5));
    }

    public final void g(t1.P p5, int i6) {
        int i7 = this.a;
        if (i6 == 0 || (i6 & i7) != 0) {
            this.f15281c.setValue(p5.a.g(i7));
            f(p5.a.q(i7));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15280b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().f13501b);
        sb.append(", ");
        sb.append(e().f13502c);
        sb.append(", ");
        return B3.e.q(sb, e().f13503d, ')');
    }
}
