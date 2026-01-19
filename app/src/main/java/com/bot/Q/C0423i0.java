package Q;

import F0.AbstractC0137z;
import T.C0626q;
import b0.C0873f;
import h0.InterfaceC1041r;
import n.C1304M;

/* renamed from: Q.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423i0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0443n0 f5865c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f5866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1304M f5868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T.X f5869h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p.P0 f5870i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0.L f5871j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f5872k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f5873l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5874m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0873f f5875n;

    public C0423i0(C0443n0 c0443n0, InterfaceC1041r interfaceC1041r, boolean z5, C1304M c1304m, T.X x5, p.P0 p02, o0.L l3, long j3, float f6, float f7, C0873f c0873f) {
        this.f5865c = c0443n0;
        this.f5866e = interfaceC1041r;
        this.f5867f = z5;
        this.f5868g = c1304m;
        this.f5869h = x5;
        this.f5870i = p02;
        this.f5871j = l3;
        this.f5872k = j3;
        this.f5873l = f6;
        this.f5874m = f7;
        this.f5875n = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            C0443n0 c0443n0 = this.f5865c;
            K0.a(AbstractC0137z.k(this.f5866e, new D.W0(this.f5867f, c0443n0.f6002j, c0443n0.f6003k, 1)), this.f5868g, this.f5869h, this.f5870i, this.f5871j, this.f5872k, this.f5873l, this.f5874m, this.f5875n, c0626q, 384);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
