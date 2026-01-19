package R4;

import java.util.concurrent.ThreadFactory;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {
    public final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7078b;

    public /* synthetic */ a(String str, boolean z5) {
        this.a = str;
        this.f7078b = z5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a;
        AbstractC1276k.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f7078b);
        return thread;
    }
}
