package o0;

import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import m4.AbstractC1276k;
import org.jsoup.internal.SharedConstants;

/* renamed from: o0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1387I implements InterfaceC0961c {

    /* renamed from: c, reason: collision with root package name */
    public int f13413c;

    /* renamed from: e, reason: collision with root package name */
    public float f13414e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f13415f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f13416g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f13417h;

    /* renamed from: i, reason: collision with root package name */
    public float f13418i;

    /* renamed from: j, reason: collision with root package name */
    public float f13419j;

    /* renamed from: k, reason: collision with root package name */
    public long f13420k;

    /* renamed from: l, reason: collision with root package name */
    public long f13421l;

    /* renamed from: m, reason: collision with root package name */
    public float f13422m;

    /* renamed from: n, reason: collision with root package name */
    public float f13423n;

    /* renamed from: o, reason: collision with root package name */
    public long f13424o;

    /* renamed from: p, reason: collision with root package name */
    public L f13425p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13426q;

    /* renamed from: r, reason: collision with root package name */
    public int f13427r;

    /* renamed from: s, reason: collision with root package name */
    public long f13428s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0961c f13429t;

    /* renamed from: u, reason: collision with root package name */
    public e1.m f13430u;

    /* renamed from: v, reason: collision with root package name */
    public C1403n f13431v;

    /* renamed from: w, reason: collision with root package name */
    public int f13432w;

    /* renamed from: x, reason: collision with root package name */
    public y f13433x;

    public C1387I() {
        long j3 = z.a;
        this.f13420k = j3;
        this.f13421l = j3;
        this.f13423n = 8.0f;
        this.f13424o = O.f13454b;
        this.f13425p = y.f13496b;
        this.f13427r = 0;
        this.f13428s = 9205357640488583168L;
        this.f13429t = Y4.d.c();
        this.f13430u = e1.m.f11576c;
        this.f13432w = 3;
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f13429t.a();
    }

    public final void b() {
        j(1.0f);
        k(1.0f);
        d(1.0f);
        q(S.l.f7374V);
        r(S.l.f7374V);
        l(S.l.f7374V);
        long j3 = z.a;
        e(j3);
        o(j3);
        if (this.f13422m != S.l.f7374V) {
            this.f13413c |= PegdownExtensions.ANCHORLINKS;
            this.f13422m = S.l.f7374V;
        }
        if (this.f13423n != 8.0f) {
            this.f13413c |= 2048;
            this.f13423n = 8.0f;
        }
        p(O.f13454b);
        m(y.f13496b);
        g(false);
        h(null);
        if (this.f13432w != 3) {
            this.f13413c |= PegdownExtensions.SUBSCRIPT;
            this.f13432w = 3;
        }
        if (this.f13427r != 0) {
            this.f13413c |= SharedConstants.DefaultBufferSize;
            this.f13427r = 0;
        }
        this.f13428s = 9205357640488583168L;
        this.f13433x = null;
        this.f13413c = 0;
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f13429t.b0();
    }

    public final void d(float f6) {
        if (this.f13416g == f6) {
            return;
        }
        this.f13413c |= 4;
        this.f13416g = f6;
    }

    public final void e(long j3) {
        if (s.d(this.f13420k, j3)) {
            return;
        }
        this.f13413c |= 64;
        this.f13420k = j3;
    }

    public final void g(boolean z5) {
        if (this.f13426q != z5) {
            this.f13413c |= 16384;
            this.f13426q = z5;
        }
    }

    public final void h(C1403n c1403n) {
        if (AbstractC1276k.b(this.f13431v, c1403n)) {
            return;
        }
        this.f13413c |= PegdownExtensions.SUPPRESS_INLINE_HTML;
        this.f13431v = c1403n;
    }

    public final void j(float f6) {
        if (this.f13414e == f6) {
            return;
        }
        this.f13413c |= 1;
        this.f13414e = f6;
    }

    public final void k(float f6) {
        if (this.f13415f == f6) {
            return;
        }
        this.f13413c |= 2;
        this.f13415f = f6;
    }

    public final void l(float f6) {
        if (this.f13419j == f6) {
            return;
        }
        this.f13413c |= 32;
        this.f13419j = f6;
    }

    public final void m(L l3) {
        if (AbstractC1276k.b(this.f13425p, l3)) {
            return;
        }
        this.f13413c |= 8192;
        this.f13425p = l3;
    }

    public final void o(long j3) {
        if (s.d(this.f13421l, j3)) {
            return;
        }
        this.f13413c |= PegdownExtensions.FENCED_CODE_BLOCKS;
        this.f13421l = j3;
    }

    public final void p(long j3) {
        if (O.a(this.f13424o, j3)) {
            return;
        }
        this.f13413c |= 4096;
        this.f13424o = j3;
    }

    public final void q(float f6) {
        if (this.f13417h == f6) {
            return;
        }
        this.f13413c |= 8;
        this.f13417h = f6;
    }

    public final void r(float f6) {
        if (this.f13418i == f6) {
            return;
        }
        this.f13413c |= 16;
        this.f13418i = f6;
    }
}
