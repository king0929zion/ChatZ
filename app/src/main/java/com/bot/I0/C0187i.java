package I0;

import android.content.ClipboardManager;
import android.content.Context;
import m4.AbstractC1276k;

/* renamed from: I0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187i implements InterfaceC0196m0 {
    public final ClipboardManager a;

    public C0187i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.a = (ClipboardManager) systemService;
    }
}
