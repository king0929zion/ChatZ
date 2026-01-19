package t1;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class N {
    public static int a(int i6) {
        int statusBars;
        int i7 = 0;
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i6 & i8) != 0) {
                if (i8 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i8 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i8 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i8 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i8 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i8 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i8 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i8 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i7 |= statusBars;
            }
        }
        return i7;
    }
}
