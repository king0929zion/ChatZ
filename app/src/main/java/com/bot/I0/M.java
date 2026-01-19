package I0;

import T.C0626q;
import h0.InterfaceC1041r;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class M extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X3.e f2217g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2218h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, C0172a0 c0172a0, l4.e eVar) {
        super(2);
        this.f2215e = 0;
        this.f2218h = viewTreeObserverOnGlobalLayoutListenerC0216x;
        this.f2216f = c0172a0;
        this.f2217g = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f2215e) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC0204q0.a((ViewTreeObserverOnGlobalLayoutListenerC0216x) this.f2218h, (C0172a0) this.f2216f, (l4.e) this.f2217g, c0626q, 0);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 1:
                ((Number) obj2).intValue();
                AbstractC0204q0.a((H0.r0) this.f2218h, (C0172a0) this.f2216f, (l4.e) this.f2217g, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            default:
                ((Number) obj2).intValue();
                h1.k.a((l4.c) this.f2218h, (InterfaceC1041r) this.f2216f, (l4.c) this.f2217g, (C0626q) obj, T.r.J(1));
                return X3.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(Object obj, Object obj2, X3.e eVar, int i6, int i7) {
        super(2);
        this.f2215e = i7;
        this.f2218h = obj;
        this.f2216f = obj2;
        this.f2217g = eVar;
    }
}
