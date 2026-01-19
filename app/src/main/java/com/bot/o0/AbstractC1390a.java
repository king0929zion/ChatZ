package o0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1390a {
    public static /* bridge */ /* synthetic */ BlendMode A() {
        return BlendMode.DST_ATOP;
    }

    public static /* bridge */ /* synthetic */ BlendMode B() {
        return BlendMode.LUMINOSITY;
    }

    public static /* bridge */ /* synthetic */ BlendMode C() {
        return BlendMode.SRC_OVER;
    }

    public static /* bridge */ /* synthetic */ BlendMode D() {
        return BlendMode.DST;
    }

    public static /* bridge */ /* synthetic */ BlendMode b() {
        return BlendMode.DIFFERENCE;
    }

    public static /* synthetic */ BlendModeColorFilter c(int i6, BlendMode blendMode) {
        return new BlendModeColorFilter(i6, blendMode);
    }

    public static /* synthetic */ void d() {
    }

    public static /* bridge */ /* synthetic */ void e(Canvas canvas) {
        canvas.enableZ();
    }

    public static /* bridge */ /* synthetic */ void f(Paint paint, BlendMode blendMode) {
        paint.setBlendMode(blendMode);
    }

    public static /* bridge */ /* synthetic */ BlendMode g() {
        return BlendMode.EXCLUSION;
    }

    public static /* bridge */ /* synthetic */ void h(Canvas canvas) {
        canvas.disableZ();
    }

    public static /* bridge */ /* synthetic */ BlendMode i() {
        return BlendMode.DST_OVER;
    }

    public static /* bridge */ /* synthetic */ BlendMode j() {
        return BlendMode.SRC_IN;
    }

    public static /* bridge */ /* synthetic */ BlendMode k() {
        return BlendMode.DST_IN;
    }

    public static /* bridge */ /* synthetic */ BlendMode l() {
        return BlendMode.SRC_OUT;
    }

    public static /* bridge */ /* synthetic */ BlendMode m() {
        return BlendMode.DST_OUT;
    }

    public static /* bridge */ /* synthetic */ BlendMode n() {
        return BlendMode.SRC_ATOP;
    }

    public static /* bridge */ /* synthetic */ BlendMode o() {
        return BlendMode.XOR;
    }

    public static /* bridge */ /* synthetic */ BlendMode p() {
        return BlendMode.PLUS;
    }

    public static /* bridge */ /* synthetic */ BlendMode q() {
        return BlendMode.MODULATE;
    }

    public static /* bridge */ /* synthetic */ BlendMode r() {
        return BlendMode.SCREEN;
    }

    public static /* bridge */ /* synthetic */ BlendMode s() {
        return BlendMode.MULTIPLY;
    }

    public static /* bridge */ /* synthetic */ BlendMode t() {
        return BlendMode.OVERLAY;
    }

    public static /* bridge */ /* synthetic */ BlendMode u() {
        return BlendMode.DARKEN;
    }

    public static /* bridge */ /* synthetic */ BlendMode v() {
        return BlendMode.LIGHTEN;
    }

    public static /* bridge */ /* synthetic */ BlendMode w() {
        return BlendMode.COLOR_DODGE;
    }

    public static /* bridge */ /* synthetic */ BlendMode x() {
        return BlendMode.HUE;
    }

    public static /* bridge */ /* synthetic */ BlendMode y() {
        return BlendMode.SATURATION;
    }

    public static /* bridge */ /* synthetic */ BlendMode z() {
        return BlendMode.COLOR;
    }
}
