package X0;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Choreographer f9146c;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9146c.postFrameCallback(new M1.h(runnable));
    }
}
