package E3;

import I3.H;
import I3.m;
import I3.o;
import I3.u;
import N3.j;
import b4.InterfaceC0910h;
import u3.C1759c;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: c, reason: collision with root package name */
    public final C1759c f1299c;

    /* renamed from: e, reason: collision with root package name */
    public final u f1300e;

    /* renamed from: f, reason: collision with root package name */
    public final H f1301f;

    /* renamed from: g, reason: collision with root package name */
    public final o f1302g;

    /* renamed from: h, reason: collision with root package name */
    public final j f1303h;

    public a(C1759c c1759c, e eVar) {
        this.f1299c = c1759c;
        this.f1300e = eVar.f1310b;
        this.f1301f = eVar.a;
        this.f1302g = eVar.f1311c;
        this.f1303h = eVar.f1314f;
    }

    @Override // I3.s
    public final m a() {
        return this.f1302g;
    }

    @Override // E3.b, x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f1299c.c();
    }

    @Override // E3.b
    public final j getAttributes() {
        return this.f1303h;
    }

    @Override // E3.b
    public final u getMethod() {
        return this.f1300e;
    }

    @Override // E3.b
    public final H getUrl() {
        return this.f1301f;
    }
}
