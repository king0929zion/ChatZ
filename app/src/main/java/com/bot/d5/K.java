package d5;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public class K {

    /* renamed from: d, reason: collision with root package name */
    public static final J f11458d = new Object();
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public long f11459b;

    /* renamed from: c, reason: collision with root package name */
    public long f11460c;

    public K a() {
        this.a = false;
        return this;
    }

    public K b() {
        this.f11460c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.f11459b;
        }
        throw new IllegalStateException("No deadline");
    }

    public K d(long j3) {
        this.a = true;
        this.f11459b = j3;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.f11459b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public K g(long j3, TimeUnit timeUnit) {
        AbstractC1276k.f(timeUnit, "unit");
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("timeout < 0: ", j3).toString());
        }
        this.f11460c = timeUnit.toNanos(j3);
        return this;
    }
}
