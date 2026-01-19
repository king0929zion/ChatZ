package n;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class o0 implements InterfaceC1326h {
    public final F0 a;

    /* renamed from: b, reason: collision with root package name */
    public final E0 f13203b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13204c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13205d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1343r f13206e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1343r f13207f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1343r f13208g;

    /* renamed from: h, reason: collision with root package name */
    public long f13209h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC1343r f13210i;

    public o0(InterfaceC1334l interfaceC1334l, E0 e02, Object obj, Object obj2, AbstractC1343r abstractC1343r) {
        this.a = interfaceC1334l.a(e02);
        this.f13203b = e02;
        this.f13204c = obj2;
        this.f13205d = obj;
        this.f13206e = (AbstractC1343r) e02.a.f(obj);
        l4.c cVar = e02.a;
        this.f13207f = (AbstractC1343r) cVar.f(obj2);
        this.f13208g = abstractC1343r != null ? AbstractC1318d.k(abstractC1343r) : ((AbstractC1343r) cVar.f(obj)).c();
        this.f13209h = -1L;
    }

    @Override // n.InterfaceC1326h
    public final boolean a() {
        return this.a.a();
    }

    @Override // n.InterfaceC1326h
    public final long b() {
        if (this.f13209h < 0) {
            this.f13209h = this.a.b(this.f13206e, this.f13207f, this.f13208g);
        }
        return this.f13209h;
    }

    @Override // n.InterfaceC1326h
    public final E0 c() {
        return this.f13203b;
    }

    @Override // n.InterfaceC1326h
    public final AbstractC1343r d(long j3) {
        if (!e(j3)) {
            return this.a.q(j3, this.f13206e, this.f13207f, this.f13208g);
        }
        AbstractC1343r abstractC1343r = this.f13210i;
        if (abstractC1343r != null) {
            return abstractC1343r;
        }
        AbstractC1343r h3 = this.a.h(this.f13206e, this.f13207f, this.f13208g);
        this.f13210i = h3;
        return h3;
    }

    @Override // n.InterfaceC1326h
    public final Object f(long j3) {
        if (e(j3)) {
            return this.f13204c;
        }
        AbstractC1343r i6 = this.a.i(j3, this.f13206e, this.f13207f, this.f13208g);
        int b5 = i6.b();
        for (int i7 = 0; i7 < b5; i7++) {
            if (Float.isNaN(i6.a(i7))) {
                AbstractC1309S.b("AnimationVector cannot contain a NaN. " + i6 + ". Animation: " + this + ", playTimeNanos: " + j3);
            }
        }
        return this.f13203b.f12988b.f(i6);
    }

    @Override // n.InterfaceC1326h
    public final Object g() {
        return this.f13204c;
    }

    public final void h(Object obj) {
        if (AbstractC1276k.b(obj, this.f13205d)) {
            return;
        }
        this.f13205d = obj;
        this.f13206e = (AbstractC1343r) this.f13203b.a.f(obj);
        this.f13210i = null;
        this.f13209h = -1L;
    }

    public final void i(Object obj) {
        if (AbstractC1276k.b(this.f13204c, obj)) {
            return;
        }
        this.f13204c = obj;
        this.f13207f = (AbstractC1343r) this.f13203b.a.f(obj);
        this.f13210i = null;
        this.f13209h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f13205d + " -> " + this.f13204c + ",initial velocity: " + this.f13208g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
