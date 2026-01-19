package y1;

import java.util.concurrent.ThreadFactory;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1987a implements ThreadFactory {
    public final /* synthetic */ String a;

    public /* synthetic */ ThreadFactoryC1987a(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setPriority(10);
        return thread;
    }
}
