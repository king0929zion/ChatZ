package M1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3260c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f3261e;

    public /* synthetic */ i(Context context, int i6) {
        this.f3260c = i6;
        this.f3261e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3260c) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new i(this.f3261e, 1));
                return;
            default:
                g.t(this.f3261e, new e(0), g.a, false);
                return;
        }
    }
}
