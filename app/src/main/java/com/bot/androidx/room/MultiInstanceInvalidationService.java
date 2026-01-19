package androidx.room;

import N1.BinderC0287i;
import N1.RemoteCallbackListC0288j;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: c, reason: collision with root package name */
    public int f10892c;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f10893e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final RemoteCallbackListC0288j f10894f = new RemoteCallbackListC0288j(this);

    /* renamed from: g, reason: collision with root package name */
    public final BinderC0287i f10895g = new BinderC0287i(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC1276k.f(intent, "intent");
        return this.f10895g;
    }
}
