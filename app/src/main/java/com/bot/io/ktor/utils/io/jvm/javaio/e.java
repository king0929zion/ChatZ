package io.ktor.utils.io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final e f12201b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f12202c = new e(1);
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i6) {
        this.a = i6;
    }

    @Override // io.ktor.utils.io.jvm.javaio.i
    public final void a(long j3) {
        switch (this.a) {
            case 0:
                if (j3 < 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                LockSupport.parkNanos(j3);
                return;
            default:
                throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
        }
    }

    @Override // io.ktor.utils.io.jvm.javaio.i
    public final void b(Object obj) {
        switch (this.a) {
            case 0:
                Thread thread = (Thread) obj;
                AbstractC1276k.f(thread, "token");
                LockSupport.unpark(thread);
                return;
            default:
                Thread thread2 = (Thread) obj;
                AbstractC1276k.f(thread2, "token");
                LockSupport.unpark(thread2);
                return;
        }
    }
}
