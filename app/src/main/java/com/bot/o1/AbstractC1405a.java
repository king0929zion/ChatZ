package o1;

import android.graphics.Color;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1405a {
    static {
        new ThreadLocal();
    }

    public static int a(double d6, double d7, double d8) {
        double d9 = (((-0.4986d) * d8) + (((-1.5372d) * d7) + (3.2406d * d6))) / 100.0d;
        double d10 = ((0.0415d * d8) + ((1.8758d * d7) + ((-0.9689d) * d6))) / 100.0d;
        double d11 = ((1.057d * d8) + (((-0.204d) * d7) + (0.0557d * d6))) / 100.0d;
        double pow = d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d;
        double pow2 = d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d;
        double pow3 = d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }
}
