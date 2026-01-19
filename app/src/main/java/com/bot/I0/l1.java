package I0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import z4.C2057h;

/* loaded from: classes.dex */
public final class l1 extends ContentObserver {
    public final /* synthetic */ C2057h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(C2057h c2057h, Handler handler) {
        super(handler);
        this.a = c2057h;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5, Uri uri) {
        this.a.t(X3.y.a);
    }
}
