package B3;

import I3.C0241e;
import I3.w;
import io.ktor.utils.io.y;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f extends J3.c {
    public final io.ktor.utils.io.t a;

    /* renamed from: b, reason: collision with root package name */
    public final C0241e f520b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f521c;

    /* renamed from: d, reason: collision with root package name */
    public final w f522d;

    /* renamed from: e, reason: collision with root package name */
    public final I3.m f523e;

    public f(J3.d dVar, io.ktor.utils.io.t tVar) {
        AbstractC1276k.f(dVar, "originalContent");
        this.a = tVar;
        this.f520b = dVar.b();
        this.f521c = dVar.a();
        this.f522d = dVar.d();
        this.f523e = dVar.c();
    }

    @Override // J3.d
    public final Long a() {
        return this.f521c;
    }

    @Override // J3.d
    public final C0241e b() {
        return this.f520b;
    }

    @Override // J3.d
    public final I3.m c() {
        return this.f523e;
    }

    @Override // J3.d
    public final w d() {
        return this.f522d;
    }

    @Override // J3.c
    public final y e() {
        return this.a;
    }
}
