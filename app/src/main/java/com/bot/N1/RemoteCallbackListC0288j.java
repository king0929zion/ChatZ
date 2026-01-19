package N1;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import m4.AbstractC1276k;

/* renamed from: N1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC0288j extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public RemoteCallbackListC0288j(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        AbstractC1276k.f((InterfaceC0283e) iInterface, "callback");
        AbstractC1276k.f(obj, "cookie");
        this.a.f10893e.remove((Integer) obj);
    }
}
