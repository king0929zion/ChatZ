package Z2;

import a3.C0804B;
import a3.C0808F;
import l4.InterfaceC1193a;
import x4.AbstractC1888A;

/* renamed from: Z2.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0776s0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10318c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0808F f10319e;

    public /* synthetic */ C0776s0(C0808F c0808f, int i6) {
        this.f10318c = i6;
        this.f10319e = c0808f;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f10318c) {
            case 0:
                this.f10319e.f10612h.k(null);
                break;
            case 1:
                C0808F c0808f = this.f10319e;
                c0808f.getClass();
                AbstractC1888A.y(androidx.lifecycle.O.i(c0808f), null, new C0804B(c0808f, null), 3);
                break;
            case 2:
                this.f10319e.f10612h.k(null);
                break;
            default:
                this.f10319e.f10612h.k(null);
                break;
        }
        return X3.y.a;
    }
}
