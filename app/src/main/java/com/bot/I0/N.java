package I0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class N implements ComponentCallbacks2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Configuration f2222c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N0.c f2223e;

    public N(Configuration configuration, N0.c cVar) {
        this.f2222c = configuration;
        this.f2223e = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f2222c;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f2223e.a.entrySet().iterator();
        while (it.hasNext()) {
            N0.a aVar = (N0.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(updateFrom, aVar.f3638b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f2223e.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        this.f2223e.a.clear();
    }
}
