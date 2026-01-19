package io.ktor.utils.io.internal;

import j1.AbstractC1135a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12186b = AtomicIntegerFieldUpdater.newUpdater(n.class, "_availableForRead$internal");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12187c = AtomicIntegerFieldUpdater.newUpdater(n.class, "_availableForWrite$internal");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12188d = AtomicIntegerFieldUpdater.newUpdater(n.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;
    public final int a;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public n(int i6) {
        this.a = i6;
        this._availableForWrite$internal = i6;
    }

    public final void a(int i6) {
        int i7;
        int i8;
        do {
            i7 = this._availableForWrite$internal;
            i8 = i7 + i6;
            if (i8 > this.a) {
                StringBuilder j3 = AbstractC1135a.j(i7, "Completed read overflow: ", i6, " + ", " = ");
                j3.append(i8);
                j3.append(" > ");
                j3.append(this.a);
                throw new IllegalArgumentException(j3.toString());
            }
        } while (!f12187c.compareAndSet(this, i7, i8));
    }

    public final void b(int i6) {
        int i7;
        int i8;
        do {
            i7 = this._pendingToFlush;
            i8 = i7 + i6;
            if (i8 > this.a) {
                StringBuilder j3 = AbstractC1135a.j(i7, "Complete write overflow: ", i6, " + ", " > ");
                j3.append(this.a);
                throw new IllegalArgumentException(j3.toString());
            }
        } while (!f12188d.compareAndSet(this, i7, i8));
    }

    public final boolean c() {
        int andSet = f12188d.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : f12186b.addAndGet(this, andSet) > 0;
    }

    public final boolean d() {
        return this._availableForWrite$internal == 0;
    }

    public final void e() {
        this._availableForRead$internal = this.a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void f() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.a;
    }

    public final boolean g() {
        int i6;
        do {
            i6 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i6 != this.a) {
                return false;
            }
        } while (!f12187c.compareAndSet(this, i6, 0));
        return true;
    }

    public final int h(int i6) {
        int i7;
        int min;
        do {
            i7 = this._availableForRead$internal;
            min = Math.min(i6, i7);
            if (min == 0) {
                return 0;
            }
        } while (!f12186b.compareAndSet(this, i7, i7 - min));
        return Math.min(i6, i7);
    }

    public final int i(int i6) {
        int i7;
        int min;
        do {
            i7 = this._availableForWrite$internal;
            min = Math.min(i6, i7);
            if (min == 0) {
                return 0;
            }
        } while (!f12187c.compareAndSet(this, i7, i7 - min));
        return Math.min(i6, i7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RingBufferCapacity[read: ");
        sb.append(this._availableForRead$internal);
        sb.append(", write: ");
        sb.append(this._availableForWrite$internal);
        sb.append(", flush: ");
        sb.append(this._pendingToFlush);
        sb.append(", capacity: ");
        return B3.e.q(sb, this.a, ']');
    }
}
