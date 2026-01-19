package o0;

import android.graphics.Bitmap;
import m4.AbstractC1276k;

/* renamed from: o0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1395f {
    public final Bitmap a;

    public C1395f(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        AbstractC1276k.c(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
