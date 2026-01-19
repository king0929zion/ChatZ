package I0;

import B0.C0025a;
import B0.InterfaceC0045v;
import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class I {
    public static final I a = new Object();

    public final void a(View view, InterfaceC0045v interfaceC0045v) {
        Context context = view.getContext();
        PointerIcon systemIcon = interfaceC0045v instanceof C0025a ? PointerIcon.getSystemIcon(context, ((C0025a) interfaceC0045v).f432b) : PointerIcon.getSystemIcon(context, 1000);
        if (AbstractC1276k.b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
