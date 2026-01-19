package Q;

import S0.C0542d;
import T.C0626q;
import b0.C0873f;
import h0.InterfaceC1041r;
import java.util.Set;
import l4.InterfaceC1193a;
import t.C1682j;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5298c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5300f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5301g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5302h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5303i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5304j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5305k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5306l;

    public /* synthetic */ J(C2 c22, InterfaceC1041r interfaceC1041r, boolean z5, C0413f2 c0413f2, C1682j c1682j, C0873f c0873f, C0873f c0873f2, int i6) {
        this.f5298c = 1;
        this.f5302h = c22;
        this.f5299e = interfaceC1041r;
        this.f5300f = z5;
        this.f5303i = c0413f2;
        this.f5304j = c1682j;
        this.f5305k = c0873f;
        this.f5306l = c0873f2;
        this.f5301g = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f5298c) {
            case 0:
                ((Integer) obj2).getClass();
                M.c((R0.a) this.f5302h, (InterfaceC1193a) this.f5303i, (q0.h) this.f5304j, (q0.h) this.f5305k, (InterfaceC1041r) this.f5299e, this.f5300f, (G) this.f5306l, (C0626q) obj, T.r.J(this.f5301g | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0492z2.c((C2) this.f5302h, (InterfaceC1041r) this.f5299e, this.f5300f, (C0413f2) this.f5303i, (C1682j) this.f5304j, (C0873f) this.f5305k, (C0873f) this.f5306l, (C0626q) obj, T.r.J(this.f5301g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((S2.I0) this.f5302h).e((C0542d) this.f5303i, (String) this.f5304j, (Set) this.f5305k, (Set) this.f5299e, this.f5300f, (S2.F0) this.f5306l, (C0626q) obj, T.r.J(this.f5301g | 1));
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z5, Object obj6, int i6, int i7) {
        this.f5298c = i7;
        this.f5302h = obj;
        this.f5303i = obj2;
        this.f5304j = obj3;
        this.f5305k = obj4;
        this.f5299e = obj5;
        this.f5300f = z5;
        this.f5306l = obj6;
        this.f5301g = i6;
    }
}
