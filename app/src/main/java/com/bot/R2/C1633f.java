package r2;

import H0.C0158m;
import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: r2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1633f extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C0158m a;

    public C1633f(C0158m c0158m) {
        this.a = c0158m;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        C0158m.b(this.a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C0158m.b(this.a, network, false);
    }
}
