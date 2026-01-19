package m;

import T.C0602e;
import T.C0616l;
import T.C0626q;
import b0.C0873f;
import f0.C0996s;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1223e extends AbstractC1277l implements l4.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0996s f12792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12793f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1237s f12794g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0873f f12795h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223e(C0996s c0996s, Object obj, C1237s c1237s, C0873f c0873f) {
        super(3);
        this.f12792e = c0996s;
        this.f12793f = obj;
        this.f12794g = c1237s;
        this.f12795h = c0873f;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1194A interfaceC1194A = (InterfaceC1194A) obj;
        C0626q c0626q = (C0626q) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? c0626q.f(interfaceC1194A) : c0626q.h(interfaceC1194A) ? 4 : 2;
        }
        if (c0626q.S(intValue & 1, (intValue & 19) != 18)) {
            C0996s c0996s = this.f12792e;
            boolean f6 = c0626q.f(c0996s);
            Object obj4 = this.f12793f;
            boolean h3 = f6 | c0626q.h(obj4);
            C1237s c1237s = this.f12794g;
            boolean h6 = h3 | c0626q.h(c1237s);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (h6 || P5 == c0602e) {
                P5 = new c.f(c0996s, obj4, c1237s, 4);
                c0626q.m0(P5);
            }
            T.r.d(interfaceC1194A, (l4.c) P5, c0626q);
            k.M m3 = c1237s.f12834e;
            AbstractC1276k.d(interfaceC1194A, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            m3.m(obj4, ((C1195B) interfaceC1194A).a);
            Object P6 = c0626q.P();
            if (P6 == c0602e) {
                P6 = new Object();
                c0626q.m0(P6);
            }
            this.f12795h.i((C1230l) P6, obj4, c0626q, 0);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
