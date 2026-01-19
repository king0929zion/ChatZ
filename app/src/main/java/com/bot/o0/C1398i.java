package o0;

import android.graphics.PathMeasure;

/* renamed from: o0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1398i {
    public final PathMeasure a;

    public C1398i(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final boolean a(float f6, float f7, C1397h c1397h) {
        if (c1397h == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.a.getSegment(f6, f7, c1397h.a, true);
    }
}
