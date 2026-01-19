package i1;

import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082b extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DialogC1103w f11964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f11965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1102v f11966g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1.m f11967h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1082b(DialogC1103w dialogC1103w, InterfaceC1193a interfaceC1193a, C1102v c1102v, e1.m mVar) {
        super(0);
        this.f11964e = dialogC1103w;
        this.f11965f = interfaceC1193a;
        this.f11966g = c1102v;
        this.f11967h = mVar;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        this.f11964e.e(this.f11965f, this.f11966g, this.f11967h);
        return X3.y.a;
    }
}
