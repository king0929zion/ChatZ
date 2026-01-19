package d5;

import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class r extends K {

    /* renamed from: e, reason: collision with root package name */
    public K f11499e;

    public r(K k3) {
        AbstractC1276k.f(k3, "delegate");
        this.f11499e = k3;
    }

    @Override // d5.K
    public final K a() {
        return this.f11499e.a();
    }

    @Override // d5.K
    public final K b() {
        return this.f11499e.b();
    }

    @Override // d5.K
    public final long c() {
        return this.f11499e.c();
    }

    @Override // d5.K
    public final K d(long j3) {
        return this.f11499e.d(j3);
    }

    @Override // d5.K
    public final boolean e() {
        return this.f11499e.e();
    }

    @Override // d5.K
    public final void f() {
        this.f11499e.f();
    }

    @Override // d5.K
    public final K g(long j3, TimeUnit timeUnit) {
        AbstractC1276k.f(timeUnit, "unit");
        return this.f11499e.g(j3, timeUnit);
    }
}
