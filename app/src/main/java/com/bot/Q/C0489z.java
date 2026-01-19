package Q;

import T.C0626q;
import h0.C1032i;
import h0.InterfaceC1027d;
import h0.InterfaceC1041r;
import i4.AbstractC1118b;
import l4.InterfaceC1193a;
import p.C1417G;
import p.C1459u;
import r.InterfaceC1619x0;
import v.InterfaceC1793e;
import v.InterfaceC1797g;
import v.InterfaceC1802i0;

/* renamed from: Q.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0489z implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6266c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f6267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1802i0 f6268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6269g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6270h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6271i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6272j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6273k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6274l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6275m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f6276n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X3.e f6277o;

    public /* synthetic */ C0489z(InterfaceC1041r interfaceC1041r, x.s sVar, InterfaceC1802i0 interfaceC1802i0, Object obj, Object obj2, InterfaceC1619x0 interfaceC1619x0, boolean z5, C1459u c1459u, l4.c cVar, int i6, int i7, int i8) {
        this.f6266c = i8;
        this.f6267e = interfaceC1041r;
        this.f6272j = sVar;
        this.f6268f = interfaceC1802i0;
        this.f6273k = obj;
        this.f6274l = obj2;
        this.f6275m = interfaceC1619x0;
        this.f6269g = z5;
        this.f6276n = c1459u;
        this.f6277o = cVar;
        this.f6270h = i6;
        this.f6271i = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f6266c) {
            case 0:
                ((Integer) obj2).getClass();
                R1.b((InterfaceC1193a) this.f6272j, this.f6267e, this.f6269g, (o0.L) this.f6273k, (r) this.f6274l, (C0477w) this.f6275m, (C1417G) this.f6276n, this.f6268f, (l4.f) this.f6277o, (C0626q) obj, T.r.J(this.f6270h | 1), this.f6271i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1118b.b(this.f6267e, (x.s) this.f6272j, this.f6268f, (InterfaceC1793e) this.f6273k, (C1032i) this.f6274l, (InterfaceC1619x0) this.f6275m, this.f6269g, (C1459u) this.f6276n, (l4.c) this.f6277o, (C0626q) obj, T.r.J(this.f6270h | 1), this.f6271i);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1118b.a(this.f6267e, (x.s) this.f6272j, this.f6268f, (InterfaceC1797g) this.f6273k, (InterfaceC1027d) this.f6274l, (InterfaceC1619x0) this.f6275m, this.f6269g, (C1459u) this.f6276n, (l4.c) this.f6277o, (C0626q) obj, T.r.J(this.f6270h | 1), this.f6271i);
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ C0489z(InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, boolean z5, o0.L l3, r rVar, C0477w c0477w, C1417G c1417g, InterfaceC1802i0 interfaceC1802i0, l4.f fVar, int i6, int i7) {
        this.f6266c = 0;
        this.f6272j = interfaceC1193a;
        this.f6267e = interfaceC1041r;
        this.f6269g = z5;
        this.f6273k = l3;
        this.f6274l = rVar;
        this.f6275m = c0477w;
        this.f6276n = c1417g;
        this.f6268f = interfaceC1802i0;
        this.f6277o = fVar;
        this.f6270h = i6;
        this.f6271i = i7;
    }
}
