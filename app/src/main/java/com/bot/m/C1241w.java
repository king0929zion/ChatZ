package m;

import T.C0626q;
import b0.C0873f;
import h0.InterfaceC1041r;
import m4.AbstractC1277l;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241w extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f12850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1210Q f12851g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1211S f12852h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f12853i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0873f f12854j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12855k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12856l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241w(boolean z5, InterfaceC1041r interfaceC1041r, C1210Q c1210q, C1211S c1211s, String str, C0873f c0873f, int i6, int i7) {
        super(2);
        this.f12849e = z5;
        this.f12850f = interfaceC1041r;
        this.f12851g = c1210q;
        this.f12852h = c1211s;
        this.f12853i = str;
        this.f12854j = c0873f;
        this.f12855k = i6;
        this.f12856l = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC1244z.c(this.f12849e, this.f12850f, this.f12851g, this.f12852h, this.f12853i, this.f12854j, (C0626q) obj, T.r.J(this.f12855k | 1), this.f12856l);
        return X3.y.a;
    }
}
