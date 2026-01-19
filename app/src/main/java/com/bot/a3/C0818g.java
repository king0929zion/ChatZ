package a3;

import A4.Q;
import A4.W;
import A4.g0;
import Y2.C0730t;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import m4.AbstractC1276k;
import x4.AbstractC1888A;

/* renamed from: a3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818g extends U {

    /* renamed from: b, reason: collision with root package name */
    public final Y2.x f10656b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f10657c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f10658d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f10659e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f10660f;

    /* renamed from: g, reason: collision with root package name */
    public C0730t f10661g;

    public C0818g(Y2.x xVar) {
        AbstractC1276k.f(xVar, "mcpRepository");
        this.f10656b = xVar;
        g0 b5 = W.b(Y3.v.f9812c);
        this.f10657c = b5;
        this.f10658d = new Q(b5);
        g0 b6 = W.b(new C0812a(null, null, null, 7));
        this.f10659e = b6;
        this.f10660f = new Q(b6);
        AbstractC1888A.y(O.i(this), null, new C0815d(this, null), 3);
    }

    @Override // androidx.lifecycle.U
    public final void d() {
        C0730t c0730t = this.f10661g;
        if (c0730t != null) {
            c0730t.f();
        }
    }

    public final void e() {
        C0730t c0730t = this.f10661g;
        if (c0730t != null) {
            c0730t.f();
        }
        this.f10661g = null;
        C0812a c0812a = new C0812a(null, null, null, 7);
        g0 g0Var = this.f10659e;
        g0Var.getClass();
        g0Var.l(null, c0812a);
    }
}
