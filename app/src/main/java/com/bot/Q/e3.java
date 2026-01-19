package Q;

import S0.C0545g;
import T.C0626q;
import h0.InterfaceC1041r;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5780c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f5781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5783g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5784h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5785i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5786j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f5787k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5788l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5789m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S0.P f5790n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5791o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5792p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5793q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CharSequence f5794r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5795s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5796t;

    public /* synthetic */ e3(C0545g c0545g, InterfaceC1041r interfaceC1041r, long j3, long j4, long j5, long j6, int i6, boolean z5, int i7, int i8, Map map, l4.c cVar, S0.P p5, int i9, int i10, int i11) {
        this.f5794r = c0545g;
        this.f5781e = interfaceC1041r;
        this.f5782f = j3;
        this.f5783g = j4;
        this.f5784h = j5;
        this.f5785i = j6;
        this.f5786j = i6;
        this.f5787k = z5;
        this.f5788l = i7;
        this.f5789m = i8;
        this.f5795s = map;
        this.f5796t = cVar;
        this.f5790n = p5;
        this.f5791o = i9;
        this.f5792p = i10;
        this.f5793q = i11;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f5780c) {
            case 0:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(this.f5791o | 1);
                int J5 = T.r.J(this.f5792p);
                f3.c((C0545g) this.f5794r, this.f5781e, this.f5782f, this.f5783g, this.f5784h, this.f5785i, this.f5786j, this.f5787k, this.f5788l, this.f5789m, (Map) this.f5795s, (l4.c) this.f5796t, this.f5790n, (C0626q) obj, J4, J5, this.f5793q);
                break;
            default:
                ((Integer) obj2).getClass();
                int J6 = T.r.J(this.f5791o | 1);
                int J7 = T.r.J(this.f5792p);
                f3.b((String) this.f5794r, this.f5781e, this.f5782f, this.f5783g, (W0.k) this.f5795s, this.f5784h, (d1.k) this.f5796t, this.f5785i, this.f5786j, this.f5787k, this.f5788l, this.f5789m, this.f5790n, (C0626q) obj, J6, J7, this.f5793q);
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ e3(String str, InterfaceC1041r interfaceC1041r, long j3, long j4, W0.k kVar, long j5, d1.k kVar2, long j6, int i6, boolean z5, int i7, int i8, S0.P p5, int i9, int i10, int i11) {
        this.f5794r = str;
        this.f5781e = interfaceC1041r;
        this.f5782f = j3;
        this.f5783g = j4;
        this.f5795s = kVar;
        this.f5784h = j5;
        this.f5796t = kVar2;
        this.f5785i = j6;
        this.f5786j = i6;
        this.f5787k = z5;
        this.f5788l = i7;
        this.f5789m = i8;
        this.f5790n = p5;
        this.f5791o = i9;
        this.f5792p = i10;
        this.f5793q = i11;
    }
}
