package M1;

import i.C1059a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3248c;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3248c) {
            case 0:
                runnable.run();
                return;
            default:
                C1059a.n0().f11933e.f11935f.execute(runnable);
                return;
        }
    }
}
