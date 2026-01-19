package i1;

import l4.InterfaceC1193a;
import m4.AbstractC1277l;
import m4.C1287v;

/* renamed from: i1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104x extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1287v f12026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1105y f12027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1.k f12028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f12029h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f12030i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104x(C1287v c1287v, C1105y c1105y, e1.k kVar, long j3, long j4) {
        super(0);
        this.f12026e = c1287v;
        this.f12027f = c1105y;
        this.f12028g = kVar;
        this.f12029h = j3;
        this.f12030i = j4;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        C1105y c1105y = this.f12027f;
        this.f12026e.f12972c = c1105y.getPositionProvider().g(this.f12028g, this.f12029h, c1105y.getParentLayoutDirection(), this.f12030i);
        return X3.y.a;
    }
}
