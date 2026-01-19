package i1;

import T.C0626q;
import b0.C0873f;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* renamed from: i1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092l extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1078B f11997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f11998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1079C f11999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0873f f12000h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12001i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f12002j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092l(InterfaceC1078B interfaceC1078B, InterfaceC1193a interfaceC1193a, C1079C c1079c, C0873f c0873f, int i6, int i7) {
        super(2);
        this.f11997e = interfaceC1078B;
        this.f11998f = interfaceC1193a;
        this.f11999g = c1079c;
        this.f12000h = c0873f;
        this.f12001i = i6;
        this.f12002j = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC1094n.a(this.f11997e, this.f11998f, this.f11999g, this.f12000h, (C0626q) obj, T.r.J(this.f12001i | 1), this.f12002j);
        return X3.y.a;
    }
}
