package b3;

import T.C0626q;
import X3.y;
import h0.InterfaceC1041r;
import v.AbstractC1806l;

/* renamed from: b3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0899o implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11046c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f11047e;

    public /* synthetic */ C0899o(InterfaceC1041r interfaceC1041r, int i6, int i7) {
        this.f11046c = i7;
        this.f11047e = interfaceC1041r;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f11046c;
        C0626q c0626q = (C0626q) obj;
        ((Integer) obj2).getClass();
        switch (i6) {
            case 0:
                AbstractC0888d.e(this.f11047e, c0626q, T.r.J(1));
                break;
            case 1:
                AbstractC0888d.d(this.f11047e, c0626q, T.r.J(1));
                break;
            case 2:
                AbstractC0888d.g(this.f11047e, c0626q, T.r.J(1));
                break;
            default:
                AbstractC1806l.a(this.f11047e, c0626q, T.r.J(1));
                break;
        }
        return y.a;
    }
}
