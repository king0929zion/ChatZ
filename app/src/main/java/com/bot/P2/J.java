package P2;

import java.util.ArrayList;
import java.util.List;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class J implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4742c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f4743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f4744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0346c f4745g;

    public /* synthetic */ J(l4.c cVar, List list, InterfaceC0346c interfaceC0346c, int i6) {
        this.f4742c = i6;
        this.f4743e = cVar;
        this.f4744f = list;
        this.f4745g = interfaceC0346c;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f4742c) {
            case 0:
                ArrayList K0 = Y3.m.K0(this.f4744f);
                K0.remove(((Y) this.f4745g).a);
                this.f4743e.f(K0);
                return X3.y.a;
            default:
                ArrayList K02 = Y3.m.K0(this.f4744f);
                K02.remove(((X) this.f4745g).a);
                this.f4743e.f(K02);
                return X3.y.a;
        }
    }
}
