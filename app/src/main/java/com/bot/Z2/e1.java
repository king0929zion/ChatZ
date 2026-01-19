package Z2;

import Q.R1;
import T.C0626q;
import b0.AbstractC0874g;
import java.util.List;
import l4.InterfaceC1193a;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10192c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f10193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f10194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10195g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l4.c f10196h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f10197i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f10198j;

    public /* synthetic */ e1(String str, List list, Object obj, l4.c cVar, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2) {
        this.f10193e = str;
        this.f10194f = list;
        this.f10195g = obj;
        this.f10196h = cVar;
        this.f10197i = interfaceC1193a;
        this.f10198j = interfaceC1193a2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f10192c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    float f6 = 16;
                    R1.c(AbstractC1787b.A(S.l.f7374V, f6, 1, v.t0.a), C.e.a(f6), null, null, AbstractC0874g.c(-1914031875, new P2.B(this.f10193e, this.f10194f, this.f10195g, this.f10196h, this.f10197i, this.f10198j), c0626q), c0626q, 196614, 28);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                ((Integer) obj2).getClass();
                AbstractC0783w.e(this.f10193e, this.f10194f, this.f10195g, this.f10196h, this.f10197i, this.f10198j, (C0626q) obj, T.r.J(196609));
                return X3.y.a;
        }
    }

    public /* synthetic */ e1(String str, List list, Object obj, l4.c cVar, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, int i6) {
        this.f10193e = str;
        this.f10194f = list;
        this.f10195g = obj;
        this.f10196h = cVar;
        this.f10197i = interfaceC1193a;
        this.f10198j = interfaceC1193a2;
    }
}
