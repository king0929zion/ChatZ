package Q;

import T.C0626q;
import b0.C0873f;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import v.InterfaceC1802i0;

/* renamed from: Q.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0434l implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5953c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f5954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f5955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f5956g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0873f f5957h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5958i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5959j;

    public /* synthetic */ C0434l(C0873f c0873f, InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, boolean z5, G0 g02, InterfaceC1802i0 interfaceC1802i0, int i6) {
        this.f5957h = c0873f;
        this.f5954e = interfaceC1193a;
        this.f5955f = interfaceC1041r;
        this.f5956g = z5;
        this.f5958i = g02;
        this.f5959j = interfaceC1802i0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f5953c) {
            case 0:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(7);
                AbstractC0438m.a(this.f5957h, this.f5954e, this.f5955f, this.f5956g, (G0) this.f5958i, (InterfaceC1802i0) this.f5959j, (C0626q) obj, J4);
                break;
            default:
                o0.L l3 = (o0.L) this.f5958i;
                ((Integer) obj2).getClass();
                R1.e(T.r.J(1572865), (C0474v0) this.f5959j, (C0626q) obj, this.f5957h, this.f5955f, this.f5954e, l3, this.f5956g);
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ C0434l(InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, boolean z5, o0.L l3, C0474v0 c0474v0, C0873f c0873f, int i6) {
        this.f5954e = interfaceC1193a;
        this.f5955f = interfaceC1041r;
        this.f5956g = z5;
        this.f5958i = l3;
        this.f5959j = c0474v0;
        this.f5957h = c0873f;
    }
}
