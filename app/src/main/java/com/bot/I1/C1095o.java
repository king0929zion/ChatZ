package i1;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* renamed from: i1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095o {
    public static final C1095o a = new Object();

    public final int a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i6 = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i7 = rect.top;
        int i8 = rect.bottom;
        return i6 - (i7 + (i8 > i6 ? i8 - i6 : 0));
    }
}
