package Z2;

import l4.InterfaceC1193a;
import n.C1316c;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: Z2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766n implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10262c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f10263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1316c f10264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f10265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f10266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T.X f10267i;

    public /* synthetic */ C0766n(float f6, int i6, T.X x5, String str, C1316c c1316c, InterfaceC1942y interfaceC1942y) {
        this.f10262c = i6;
        this.f10263e = interfaceC1942y;
        this.f10264f = c1316c;
        this.f10265g = f6;
        this.f10266h = str;
        this.f10267i = x5;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f10262c) {
            case 0:
                AbstractC1888A.y(this.f10263e, null, new C0764m(this.f10264f, this.f10265g, this.f10266h, this.f10267i, null), 3);
                return X3.y.a;
            case 1:
                AbstractC1888A.y(this.f10263e, null, new S(this.f10264f, this.f10265g, this.f10266h, this.f10267i, null), 3);
                return X3.y.a;
            default:
                AbstractC1888A.y(this.f10263e, null, new T0(this.f10264f, this.f10265g, this.f10266h, this.f10267i, null), 3);
                return X3.y.a;
        }
    }
}
