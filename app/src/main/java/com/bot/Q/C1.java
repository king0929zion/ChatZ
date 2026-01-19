package Q;

import D.AbstractC0095u;
import D.C0094t0;
import D.C0096u0;
import R.AbstractC0507l;
import T.C0616l;
import T.C0626q;
import b0.AbstractC0874g;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.C1038o;
import h0.InterfaceC1041r;
import t.C1682j;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class C1 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f5158c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.e f5159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b3 f5161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f5162h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4.c f5163i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5164j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f5165k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S0.P f5166l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0096u0 f5167m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0094t0 f5168n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f5169o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5170p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5171q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F0.F f5172r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1682j f5173s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l4.e f5174t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l4.e f5175u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l4.e f5176v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l4.e f5177w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o0.L f5178x;

    public C1(InterfaceC1041r interfaceC1041r, l4.e eVar, boolean z5, b3 b3Var, String str, l4.c cVar, boolean z6, boolean z7, S0.P p5, C0096u0 c0096u0, C0094t0 c0094t0, boolean z8, int i6, int i7, F0.F f6, C1682j c1682j, l4.e eVar2, l4.e eVar3, l4.e eVar4, l4.e eVar5, o0.L l3) {
        this.f5158c = interfaceC1041r;
        this.f5159e = eVar;
        this.f5160f = z5;
        this.f5161g = b3Var;
        this.f5162h = str;
        this.f5163i = cVar;
        this.f5164j = z6;
        this.f5165k = z7;
        this.f5166l = p5;
        this.f5167m = c0096u0;
        this.f5168n = c0094t0;
        this.f5169o = z8;
        this.f5170p = i6;
        this.f5171q = i7;
        this.f5172r = f6;
        this.f5173s = c1682j;
        this.f5174t = eVar2;
        this.f5175u = eVar3;
        this.f5176v = eVar4;
        this.f5177w = eVar5;
        this.f5178x = l3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            l4.e eVar = this.f5159e;
            InterfaceC1041r interfaceC1041r = C1038o.a;
            if (eVar != null) {
                c0626q.b0(-903490605);
                Object P5 = c0626q.P();
                if (P5 == C0616l.a) {
                    P5 = new P2.D0(7);
                    c0626q.m0(P5);
                }
                interfaceC1041r = AbstractC1787b.C(P0.n.a(interfaceC1041r, true, (l4.c) P5), S.l.f7374V, R.l0.e(c0626q), S.l.f7374V, S.l.f7374V, 13);
                c0626q.p(false);
            } else {
                c0626q.b0(-903106918);
                c0626q.p(false);
            }
            InterfaceC1041r c6 = this.f5158c.c(interfaceC1041r);
            String j3 = AbstractC0507l.j(R.string.default_error_message, c0626q);
            float f6 = R.l0.a;
            if (this.f5160f) {
                c6 = P0.n.a(c6, false, new M2.b(j3, 6));
            }
            InterfaceC1041r a = v.t0.a(c6, C0483x1.f6221c, C0483x1.f6220b);
            b3 b3Var = this.f5161g;
            boolean z5 = this.f5160f;
            o0.N n3 = new o0.N(z5 ? b3Var.f5699j : b3Var.f5698i);
            l4.e eVar2 = this.f5177w;
            o0.L l3 = this.f5178x;
            String str = this.f5162h;
            boolean z6 = this.f5164j;
            boolean z7 = this.f5169o;
            F0.F f7 = this.f5172r;
            C1682j c1682j = this.f5173s;
            AbstractC0095u.b(str, this.f5163i, a, z6, this.f5165k, this.f5166l, this.f5167m, this.f5168n, z7, this.f5170p, this.f5171q, f7, null, c1682j, n3, AbstractC0874g.c(-1189274459, new B1(str, z6, z7, f7, c1682j, z5, this.f5159e, this.f5174t, this.f5175u, this.f5176v, eVar2, b3Var, l3), c0626q), c0626q, 0, PegdownExtensions.SUPPRESS_ALL_HTML, 4096);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
