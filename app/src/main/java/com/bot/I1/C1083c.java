package i1;

import T.C0626q;
import b0.C0873f;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083c extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f11968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1102v f11969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0873f f11970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11971h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11972i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1083c(InterfaceC1193a interfaceC1193a, C1102v c1102v, C0873f c0873f, int i6, int i7) {
        super(2);
        this.f11968e = interfaceC1193a;
        this.f11969f = c1102v;
        this.f11970g = c0873f;
        this.f11971h = i6;
        this.f11972i = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC1087g.c(this.f11968e, this.f11969f, this.f11970g, (C0626q) obj, T.r.J(this.f11971h | 1), this.f11972i);
        return X3.y.a;
    }
}
