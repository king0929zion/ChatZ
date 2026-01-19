package i1;

import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* renamed from: i1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1088h extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1105y f11987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f11988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1079C f11989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f11990h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e1.m f11991i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1088h(C1105y c1105y, InterfaceC1193a interfaceC1193a, C1079C c1079c, String str, e1.m mVar) {
        super(0);
        this.f11987e = c1105y;
        this.f11988f = interfaceC1193a;
        this.f11989g = c1079c;
        this.f11990h = str;
        this.f11991i = mVar;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        this.f11987e.l(this.f11988f, this.f11989g, this.f11990h, this.f11991i);
        return X3.y.a;
    }
}
