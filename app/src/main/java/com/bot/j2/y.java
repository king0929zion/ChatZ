package j2;

import A4.g0;
import F0.InterfaceC0121i;
import T.C0626q;
import b0.C0873f;
import e1.C0959a;
import h0.InterfaceC1028e;
import t2.InterfaceC1724h;

/* loaded from: classes.dex */
public final class y implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1724h f12430c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0873f f12431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f12432f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f12433g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1028e f12434h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0121i f12435i;

    public y(InterfaceC1724h interfaceC1724h, C0873f c0873f, l lVar, String str, InterfaceC1028e interfaceC1028e, InterfaceC0121i interfaceC0121i) {
        this.f12430c = interfaceC1724h;
        this.f12431e = c0873f;
        this.f12432f = lVar;
        this.f12433g = str;
        this.f12434h = interfaceC1028e;
        this.f12435i = interfaceC0121i;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        v.r rVar = (v.r) obj;
        C0626q c0626q = (C0626q) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            intValue |= c0626q.f(rVar) ? 4 : 2;
        }
        if ((intValue & 91) == 18 && c0626q.E()) {
            c0626q.V();
        } else {
            q qVar = (q) this.f12430c;
            long j3 = rVar.f15342b;
            g0 g0Var = qVar.a;
            C0959a c0959a = new C0959a(j3);
            g0Var.getClass();
            g0Var.l(null, c0959a);
            this.f12431e.d(new w(rVar, this.f12432f, this.f12433g, this.f12434h, this.f12435i), c0626q, 0);
        }
        return X3.y.a;
    }
}
