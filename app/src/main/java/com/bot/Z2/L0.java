package Z2;

import T.C0626q;
import a3.C0810H;
import b0.C0873f;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import y.AbstractC1975o;

/* loaded from: classes.dex */
public final /* synthetic */ class L0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10030c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10033g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f10034h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f10035i;

    public /* synthetic */ L0(C0810H c0810h, InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, int i6, int i7) {
        this.f10033g = c0810h;
        this.f10034h = interfaceC1193a;
        this.f10035i = interfaceC1041r;
        this.f10031e = i6;
        this.f10032f = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f10030c) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0783w.I((C0810H) this.f10033g, (InterfaceC1193a) this.f10034h, (InterfaceC1041r) this.f10035i, (C0626q) obj, T.r.J(this.f10031e | 1), this.f10032f);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1975o.b(this.f10033g, this.f10031e, (y.Y) this.f10034h, (C0873f) this.f10035i, (C0626q) obj, T.r.J(this.f10032f | 1));
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ L0(Object obj, int i6, y.Y y5, C0873f c0873f, int i7) {
        this.f10033g = obj;
        this.f10031e = i6;
        this.f10034h = y5;
        this.f10035i = c0873f;
        this.f10032f = i7;
    }
}
