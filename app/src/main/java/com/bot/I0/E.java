package I0;

import android.view.View;
import android.view.ViewStructure;

/* loaded from: classes.dex */
public final class E {
    public static final E a = new Object();

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
