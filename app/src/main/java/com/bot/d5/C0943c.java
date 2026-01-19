package d5;

import androidx.lifecycle.N;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: d5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C0946f i6;
        while (true) {
            try {
                ReentrantLock reentrantLock2 = C0946f.f11471h;
                reentrantLock = C0946f.f11471h;
                reentrantLock.lock();
                try {
                    i6 = N.i();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (i6 == C0946f.f11475l) {
                C0946f.f11475l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (i6 != null) {
                    i6.j();
                }
            }
        }
    }
}
