package p;

import T.C0616l;
import T.C0626q;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import t.C1682j;

/* renamed from: p.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1419I implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1455r0 f13588c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P0.i f13590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f13591g;

    public C1419I(InterfaceC1455r0 interfaceC1455r0, boolean z5, P0.i iVar, InterfaceC1193a interfaceC1193a) {
        this.f13588c = interfaceC1455r0;
        this.f13589e = z5;
        this.f13590f = iVar;
        this.f13591g = interfaceC1193a;
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
        InterfaceC1041r c6 = AbstractC1450o0.a(C1038o.a, c1682j, this.f13588c).c(new C1418H(c1682j, null, false, this.f13589e, null, this.f13590f, this.f13591g));
        c0626q.p(false);
        return c6;
    }
}
