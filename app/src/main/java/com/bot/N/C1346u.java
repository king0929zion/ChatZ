package n;

import i4.AbstractC1117a;
import m4.AbstractC1276k;

/* renamed from: n.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1346u implements InterfaceC1326h {
    public final J0 a;

    /* renamed from: b, reason: collision with root package name */
    public final E0 f13248b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13249c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1343r f13250d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1343r f13251e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1343r f13252f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f13253g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13254h;

    public C1346u(C1347v c1347v, E0 e02, Object obj, AbstractC1343r abstractC1343r) {
        J0 j02 = new J0(c1347v.a);
        this.a = j02;
        this.f13248b = e02;
        this.f13249c = obj;
        AbstractC1343r abstractC1343r2 = (AbstractC1343r) e02.a.f(obj);
        this.f13250d = abstractC1343r2;
        this.f13251e = AbstractC1318d.k(abstractC1343r);
        l4.c cVar = e02.f12988b;
        if (j02.f13011d == null) {
            j02.f13011d = abstractC1343r2.c();
        }
        AbstractC1343r abstractC1343r3 = j02.f13011d;
        if (abstractC1343r3 == null) {
            AbstractC1276k.k("targetVector");
            throw null;
        }
        int b5 = abstractC1343r3.b();
        for (int i6 = 0; i6 < b5; i6++) {
            AbstractC1343r abstractC1343r4 = j02.f13011d;
            if (abstractC1343r4 == null) {
                AbstractC1276k.k("targetVector");
                throw null;
            }
            abstractC1343r4.e(j02.a.n(abstractC1343r2.a(i6), abstractC1343r.a(i6)), i6);
        }
        AbstractC1343r abstractC1343r5 = j02.f13011d;
        if (abstractC1343r5 == null) {
            AbstractC1276k.k("targetVector");
            throw null;
        }
        this.f13253g = cVar.f(abstractC1343r5);
        if (j02.f13010c == null) {
            j02.f13010c = abstractC1343r2.c();
        }
        AbstractC1343r abstractC1343r6 = j02.f13010c;
        if (abstractC1343r6 == null) {
            AbstractC1276k.k("velocityVector");
            throw null;
        }
        int b6 = abstractC1343r6.b();
        long j3 = 0;
        for (int i7 = 0; i7 < b6; i7++) {
            abstractC1343r2.getClass();
            j3 = Math.max(j3, j02.a.m(abstractC1343r.a(i7)));
        }
        this.f13254h = j3;
        AbstractC1343r k3 = AbstractC1318d.k(this.a.a(j3, this.f13250d, abstractC1343r));
        this.f13252f = k3;
        int b7 = k3.b();
        for (int i8 = 0; i8 < b7; i8++) {
            AbstractC1343r abstractC1343r7 = this.f13252f;
            float a = abstractC1343r7.a(i8);
            float f6 = this.a.f13012e;
            abstractC1343r7.e(AbstractC1117a.e(a, -f6, f6), i8);
        }
    }

    @Override // n.InterfaceC1326h
    public final boolean a() {
        return false;
    }

    @Override // n.InterfaceC1326h
    public final long b() {
        return this.f13254h;
    }

    @Override // n.InterfaceC1326h
    public final E0 c() {
        return this.f13248b;
    }

    @Override // n.InterfaceC1326h
    public final AbstractC1343r d(long j3) {
        if (e(j3)) {
            return this.f13252f;
        }
        return this.a.a(j3, this.f13250d, this.f13251e);
    }

    @Override // n.InterfaceC1326h
    public final Object f(long j3) {
        if (e(j3)) {
            return this.f13253g;
        }
        l4.c cVar = this.f13248b.f12988b;
        J0 j02 = this.a;
        AbstractC1343r abstractC1343r = j02.f13009b;
        AbstractC1343r abstractC1343r2 = this.f13250d;
        if (abstractC1343r == null) {
            j02.f13009b = abstractC1343r2.c();
        }
        AbstractC1343r abstractC1343r3 = j02.f13009b;
        if (abstractC1343r3 == null) {
            AbstractC1276k.k("valueVector");
            throw null;
        }
        int b5 = abstractC1343r3.b();
        for (int i6 = 0; i6 < b5; i6++) {
            AbstractC1343r abstractC1343r4 = j02.f13009b;
            if (abstractC1343r4 == null) {
                AbstractC1276k.k("valueVector");
                throw null;
            }
            abstractC1343r4.e(j02.a.f(abstractC1343r2.a(i6), this.f13251e.a(i6), j3), i6);
        }
        AbstractC1343r abstractC1343r5 = j02.f13009b;
        if (abstractC1343r5 != null) {
            return cVar.f(abstractC1343r5);
        }
        AbstractC1276k.k("valueVector");
        throw null;
    }

    @Override // n.InterfaceC1326h
    public final Object g() {
        return this.f13253g;
    }
}
