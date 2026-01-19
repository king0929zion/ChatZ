package O;

import T.C0626q;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;

/* renamed from: O.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0308g implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4109c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4112g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4113h;

    public /* synthetic */ C0308g(int i6, InterfaceC1041r interfaceC1041r, InterfaceC1193a interfaceC1193a, boolean z5) {
        this.f4112g = interfaceC1041r;
        this.f4113h = interfaceC1193a;
        this.f4110e = z5;
        this.f4111f = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f4109c) {
            case 0:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(this.f4111f | 1);
                AbstractC0336u0.e((InterfaceC1041r) this.f4112g, (InterfaceC1193a) this.f4113h, this.f4110e, (C0626q) obj, J4);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int J5 = T.r.J(this.f4111f | 1);
                AbstractC0336u0.g(this.f4110e, (d1.j) this.f4112g, (N0) this.f4113h, (C0626q) obj, J5);
                break;
            default:
                ((Integer) obj2).getClass();
                int J6 = T.r.J(this.f4111f | 1);
                P2.L0.a((L2.c) this.f4113h, this.f4110e, (InterfaceC1041r) this.f4112g, (C0626q) obj, J6);
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ C0308g(L2.c cVar, boolean z5, InterfaceC1041r interfaceC1041r, int i6) {
        this.f4113h = cVar;
        this.f4110e = z5;
        this.f4112g = interfaceC1041r;
        this.f4111f = i6;
    }

    public /* synthetic */ C0308g(boolean z5, d1.j jVar, N0 n02, int i6) {
        this.f4110e = z5;
        this.f4112g = jVar;
        this.f4113h = n02;
        this.f4111f = i6;
    }
}
