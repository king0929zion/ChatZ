package B;

import T.C0616l;
import T.C0626q;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import p.AbstractC1450o0;
import p.InterfaceC1455r0;
import t.C1682j;

/* loaded from: classes.dex */
public final class f implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1455r0 f349c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R0.a f350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P0.i f352g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f353h;

    public f(InterfaceC1455r0 interfaceC1455r0, R0.a aVar, boolean z5, P0.i iVar, InterfaceC1193a interfaceC1193a) {
        this.f349c = interfaceC1455r0;
        this.f350e = aVar;
        this.f351f = z5;
        this.f352g = iVar;
        this.f353h = interfaceC1193a;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0626q c0626q = (C0626q) obj2;
        ((Number) obj3).intValue();
        c0626q.b0(-1525724089);
        Object P5 = c0626q.P();
        if (P5 == C0616l.a) {
            P5 = new C1682j();
            c0626q.m0(P5);
        }
        C1682j c1682j = (C1682j) P5;
        InterfaceC1041r c6 = AbstractC1450o0.a(C1038o.a, c1682j, this.f349c).c(new j(this.f350e, c1682j, null, this.f351f, this.f352g, this.f353h));
        c0626q.p(false);
        return c6;
    }
}
