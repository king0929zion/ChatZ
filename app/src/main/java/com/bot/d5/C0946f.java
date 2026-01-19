package d5;

import androidx.lifecycle.N;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import m4.AbstractC1276k;

/* renamed from: d5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0946f extends K {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f11471h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f11472i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f11473j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f11474k;

    /* renamed from: l, reason: collision with root package name */
    public static C0946f f11475l;

    /* renamed from: e, reason: collision with root package name */
    public int f11476e;

    /* renamed from: f, reason: collision with root package name */
    public C0946f f11477f;

    /* renamed from: g, reason: collision with root package name */
    public long f11478g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f11471h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        AbstractC1276k.e(newCondition, "newCondition(...)");
        f11472i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f11473j = millis;
        f11474k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j3 = this.f11460c;
        boolean z5 = this.a;
        if (j3 != 0 || z5) {
            ReentrantLock reentrantLock = f11471h;
            reentrantLock.lock();
            try {
                if (this.f11476e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f11476e = 1;
                N.c(this, j3, z5);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f11471h;
        reentrantLock.lock();
        try {
            int i6 = this.f11476e;
            this.f11476e = 0;
            if (i6 != 1) {
                return i6 == 2;
            }
            C0946f c0946f = f11475l;
            while (c0946f != null) {
                C0946f c0946f2 = c0946f.f11477f;
                if (c0946f2 == this) {
                    c0946f.f11477f = this.f11477f;
                    this.f11477f = null;
                    return false;
                }
                c0946f = c0946f2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
