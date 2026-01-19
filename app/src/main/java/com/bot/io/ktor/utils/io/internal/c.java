package io.ktor.utils.io.internal;

import io.ktor.utils.io.D;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f12169b = new c(null);
    public final Throwable a;

    public c(Throwable th) {
        this.a = th;
    }

    public final Throwable a() {
        Throwable th = this.a;
        return th == null ? new D("The channel was closed", 0) : th;
    }

    public final String toString() {
        return "Closed[" + a() + ']';
    }
}
