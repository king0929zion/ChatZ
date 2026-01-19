package U2;

import T.C0626q;
import T.r;
import X3.y;
import Z2.AbstractC0783w;
import h0.InterfaceC1041r;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8652c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f8653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f8654f;

    public /* synthetic */ m(List list, InterfaceC1041r interfaceC1041r, int i6, int i7) {
        this.f8652c = i7;
        this.f8653e = list;
        this.f8654f = interfaceC1041r;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f8652c;
        C0626q c0626q = (C0626q) obj;
        ((Integer) obj2).getClass();
        switch (i6) {
            case 0:
                a.k(this.f8653e, this.f8654f, c0626q, r.J(49));
                break;
            default:
                AbstractC0783w.O(this.f8653e, this.f8654f, c0626q, r.J(1));
                break;
        }
        return y.a;
    }
}
