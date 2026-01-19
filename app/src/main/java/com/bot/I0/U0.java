package I0;

import Q4.C0493a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class U0 extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U0(Object obj, Object obj2, Object obj3, int i6) {
        super(0);
        this.f2246e = i6;
        this.f2247f = obj;
        this.f2248g = obj2;
        this.f2249h = obj3;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f2246e) {
            case 0:
                AbstractC0171a abstractC0171a = (AbstractC0171a) this.f2247f;
                abstractC0171a.removeOnAttachStateChangeListener((V0) this.f2248g);
                F0.F f6 = (F0.F) this.f2249h;
                AbstractC1276k.f(f6, "listener");
                io.ktor.utils.io.u.k(abstractC0171a).a.remove(f6);
                return X3.y.a;
            default:
                Y4.l lVar = ((Q4.f) this.f2247f).f6513b;
                AbstractC1276k.c(lVar);
                return lVar.r(((C0493a) this.f2249h).f6493h.f6567d, ((Q4.l) this.f2248g).a());
        }
    }
}
