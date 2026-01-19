package C3;

import I3.m;
import I3.v;
import I3.w;
import b4.InterfaceC0910h;
import io.ktor.utils.io.y;
import m4.AbstractC1276k;
import u3.C1759c;

/* loaded from: classes.dex */
public final class c extends F3.c {

    /* renamed from: c, reason: collision with root package name */
    public final a f670c;

    /* renamed from: e, reason: collision with root package name */
    public final y f671e;

    /* renamed from: f, reason: collision with root package name */
    public final F3.c f672f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0910h f673g;

    public c(a aVar, y yVar, F3.c cVar) {
        AbstractC1276k.f(yVar, "content");
        this.f670c = aVar;
        this.f671e = yVar;
        this.f672f = cVar;
        this.f673g = cVar.c();
    }

    @Override // I3.s
    public final m a() {
        return this.f672f.a();
    }

    @Override // F3.c
    public final C1759c b() {
        return this.f670c;
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f673g;
    }

    @Override // F3.c
    public final y d() {
        return this.f671e;
    }

    @Override // F3.c
    public final P3.b e() {
        return this.f672f.e();
    }

    @Override // F3.c
    public final P3.b f() {
        return this.f672f.f();
    }

    @Override // F3.c
    public final w g() {
        return this.f672f.g();
    }

    @Override // F3.c
    public final v h() {
        return this.f672f.h();
    }
}
