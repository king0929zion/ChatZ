package p;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: p.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1462x {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return S.l.f7374V;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f6, float f7) {
        try {
            return edgeEffect.onPullDistance(f6, f7);
        } catch (Throwable unused) {
            edgeEffect.onPull(f6, f7);
            return S.l.f7374V;
        }
    }
}
