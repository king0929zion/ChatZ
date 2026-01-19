package T0;

import android.text.Layout;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class h {
    public static final Layout.Alignment a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f8311b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (AbstractC1276k.b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC1276k.b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        f8311b = alignment2;
    }
}
