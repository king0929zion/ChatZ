package o0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1393d implements ComponentCallbacks2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1394e f13458c;

    public ComponentCallbacks2C1393d(C1394e c1394e) {
        this.f13458c = c1394e;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        if (i6 >= 40) {
            this.f13458c.getClass();
        }
    }
}
