package I0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class O implements ComponentCallbacks2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N0.d f2226c;

    public O(N0.d dVar) {
        this.f2226c = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        N0.d dVar = this.f2226c;
        synchronized (dVar) {
            dVar.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        N0.d dVar = this.f2226c;
        synchronized (dVar) {
            dVar.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        N0.d dVar = this.f2226c;
        synchronized (dVar) {
            dVar.a.c();
        }
    }
}
