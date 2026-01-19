package v;

import T.C0607g0;
import e1.InterfaceC0961c;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class C0 implements F0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C0607g0 f15204b;

    public C0(S s5, String str) {
        this.a = str;
        this.f15204b = T.r.A(s5);
    }

    @Override // v.F0
    public final int a(InterfaceC0961c interfaceC0961c) {
        return e().f15269d;
    }

    @Override // v.F0
    public final int b(InterfaceC0961c interfaceC0961c, e1.m mVar) {
        return e().f15268c;
    }

    @Override // v.F0
    public final int c(InterfaceC0961c interfaceC0961c, e1.m mVar) {
        return e().a;
    }

    @Override // v.F0
    public final int d(InterfaceC0961c interfaceC0961c) {
        return e().f15267b;
    }

    public final S e() {
        return (S) this.f15204b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0) {
            return AbstractC1276k.b(e(), ((C0) obj).e());
        }
        return false;
    }

    public final void f(S s5) {
        this.f15204b.setValue(s5);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().f15267b);
        sb.append(", right=");
        sb.append(e().f15268c);
        sb.append(", bottom=");
        return B3.e.q(sb, e().f15269d, ')');
    }
}
