package M1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Choreographer.FrameCallback {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3258c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3259e;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        switch (this.f3258c) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new i((Context) this.f3259e, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                ((Runnable) this.f3259e).run();
                return;
        }
    }
}
