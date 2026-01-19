package n;

import T.C0599c0;
import T.C0603e0;
import T.C0607g0;
import T.d1;
import f0.C0996s;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class u0 implements d1 {

    /* renamed from: c, reason: collision with root package name */
    public final E0 f13255c;

    /* renamed from: e, reason: collision with root package name */
    public final C0607g0 f13256e;

    /* renamed from: f, reason: collision with root package name */
    public final C0607g0 f13257f;

    /* renamed from: g, reason: collision with root package name */
    public final C0607g0 f13258g;

    /* renamed from: h, reason: collision with root package name */
    public V f13259h;

    /* renamed from: i, reason: collision with root package name */
    public o0 f13260i;

    /* renamed from: j, reason: collision with root package name */
    public final C0607g0 f13261j;

    /* renamed from: k, reason: collision with root package name */
    public final C0599c0 f13262k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13263l;

    /* renamed from: m, reason: collision with root package name */
    public final C0607g0 f13264m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC1343r f13265n;

    /* renamed from: o, reason: collision with root package name */
    public final C0603e0 f13266o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13267p;

    /* renamed from: q, reason: collision with root package name */
    public final C1327h0 f13268q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y0 f13269r;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Map, java.lang.Object] */
    public u0(y0 y0Var, Object obj, AbstractC1343r abstractC1343r, E0 e02) {
        this.f13269r = y0Var;
        this.f13255c = e02;
        C0607g0 A5 = T.r.A(obj);
        this.f13256e = A5;
        Object obj2 = null;
        this.f13257f = T.r.A(AbstractC1318d.r(S.l.f7374V, S.l.f7374V, null, 7));
        this.f13258g = T.r.A(new o0(c(), e02, obj, A5.getValue(), abstractC1343r));
        this.f13261j = T.r.A(Boolean.TRUE);
        this.f13262k = new C0599c0(-1.0f);
        this.f13264m = T.r.A(obj);
        this.f13265n = abstractC1343r;
        this.f13266o = new C0603e0(a().b());
        Float f6 = (Float) N0.a.get(e02);
        if (f6 != null) {
            float floatValue = f6.floatValue();
            AbstractC1343r abstractC1343r2 = (AbstractC1343r) e02.a.f(obj);
            int b5 = abstractC1343r2.b();
            for (int i6 = 0; i6 < b5; i6++) {
                abstractC1343r2.e(floatValue, i6);
            }
            obj2 = this.f13255c.f12988b.f(abstractC1343r2);
        }
        this.f13268q = AbstractC1318d.r(S.l.f7374V, S.l.f7374V, obj2, 3);
    }

    public final o0 a() {
        return (o0) this.f13258g.getValue();
    }

    public final InterfaceC1351z c() {
        return (InterfaceC1351z) this.f13257f.getValue();
    }

    public final void d(long j3) {
        if (this.f13262k.g() == -1.0f) {
            this.f13267p = true;
            if (AbstractC1276k.b(a().f13204c, a().f13205d)) {
                e(a().f13204c);
            } else {
                e(a().f(j3));
                this.f13265n = a().d(j3);
            }
        }
    }

    public final void e(Object obj) {
        this.f13264m.setValue(obj);
    }

    public final void f(Object obj, boolean z5) {
        o0 o0Var = this.f13260i;
        Object obj2 = o0Var != null ? o0Var.f13204c : null;
        C0607g0 c0607g0 = this.f13256e;
        boolean b5 = AbstractC1276k.b(obj2, c0607g0.getValue());
        C0603e0 c0603e0 = this.f13266o;
        C0607g0 c0607g02 = this.f13258g;
        if (b5) {
            c0607g02.setValue(new o0(this.f13268q, this.f13255c, obj, obj, this.f13265n.c()));
            this.f13263l = true;
            c0603e0.h(a().b());
            return;
        }
        InterfaceC1351z c6 = (!z5 || this.f13267p) ? c() : c() instanceof C1327h0 ? c() : this.f13268q;
        y0 y0Var = this.f13269r;
        long e6 = y0Var.e();
        C0607g0 c0607g03 = y0Var.f13284h;
        c0607g02.setValue(new o0(e6 <= 0 ? c6 : new C1329i0(c6, y0Var.e()), this.f13255c, obj, c0607g0.getValue(), this.f13265n));
        c0603e0.h(a().b());
        this.f13263l = false;
        c0607g03.setValue(Boolean.TRUE);
        if (y0Var.g()) {
            C0996s c0996s = y0Var.f13285i;
            int size = c0996s.size();
            long j3 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                u0 u0Var = (u0) c0996s.get(i6);
                j3 = Math.max(j3, u0Var.f13266o.g());
                u0Var.d(0L);
            }
            c0607g03.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, InterfaceC1351z interfaceC1351z) {
        this.f13256e.setValue(obj2);
        this.f13257f.setValue(interfaceC1351z);
        if (AbstractC1276k.b(a().f13205d, obj) && AbstractC1276k.b(a().f13204c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // T.d1
    public final Object getValue() {
        return this.f13264m.getValue();
    }

    public final void h(Object obj, InterfaceC1351z interfaceC1351z) {
        if (this.f13263l) {
            o0 o0Var = this.f13260i;
            if (AbstractC1276k.b(obj, o0Var != null ? o0Var.f13204c : null)) {
                return;
            }
        }
        C0607g0 c0607g0 = this.f13256e;
        boolean b5 = AbstractC1276k.b(c0607g0.getValue(), obj);
        C0599c0 c0599c0 = this.f13262k;
        if (b5 && c0599c0.g() == -1.0f) {
            return;
        }
        c0607g0.setValue(obj);
        this.f13257f.setValue(interfaceC1351z);
        Object value = c0599c0.g() == -3.0f ? obj : this.f13264m.getValue();
        C0607g0 c0607g02 = this.f13261j;
        f(value, !((Boolean) c0607g02.getValue()).booleanValue());
        c0607g02.setValue(Boolean.valueOf(c0599c0.g() == -3.0f));
        if (c0599c0.g() >= S.l.f7374V) {
            e(a().f(c0599c0.g() * ((float) a().b())));
        } else if (c0599c0.g() == -3.0f) {
            e(obj);
        }
        this.f13263l = false;
        c0599c0.h(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f13264m.getValue() + ", target: " + this.f13256e.getValue() + ", spec: " + c();
    }
}
