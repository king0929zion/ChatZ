package W2;

import X2.L;
import X3.y;
import l4.InterfaceC1193a;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8927c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f8928e;

    public /* synthetic */ k(L l3, int i6) {
        this.f8927c = i6;
        this.f8928e = l3;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f8927c) {
            case 0:
                this.f8928e.n(false);
                return y.a;
            default:
                L l3 = this.f8928e;
                String str = (String) l3.f9197D.getValue();
                if (!AbstractC1776n.Q(str)) {
                    l3.f9202c.f(str);
                }
                return y.a;
        }
    }
}
